// 
// 
// 

package cn.oza.logistic.ssm.controller;

import java.util.Date;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import java.io.OutputStream;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import javax.servlet.http.HttpServletResponse;
import cn.oza.logistic.ssm.pojo.ExportDetail;
import cn.oza.logistic.ssm.pojo.Info;
import cn.oza.logistic.ssm.pojo.ExportDetailExample;
import cn.oza.logistic.ssm.pojo.Export;
import cn.oza.logistic.ssm.pojo.ExportExample;
import org.springframework.web.bind.annotation.RequestBody;
import org.apache.shiro.subject.Subject;
import cn.oza.logistic.ssm.pojo.Transaction;
import cn.oza.logistic.ssm.pojo.User;
import cn.oza.logistic.ssm.pojo.OrderDetail;
import cn.oza.logistic.ssm.pojo.BasicData;
import java.util.List;
import cn.oza.logistic.ssm.pojo.Order;
import org.apache.shiro.SecurityUtils;
import cn.oza.logistic.ssm.pojo.TransactionDetailExample;
import cn.oza.logistic.ssm.pojo.TransactionDetail;
import java.util.ArrayList;
import cn.oza.logistic.ssm.pojo.TransactionExample;
import cn.oza.logistic.ssm.pojo.UserExample;
import cn.oza.logistic.ssm.pojo.OrderDetailExample;
import cn.oza.logistic.constant.ConstantDataField;
import cn.oza.logistic.ssm.pojo.BasicDataExample;
import cn.oza.logistic.ssm.pojo.OrderViewExample;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.oza.logistic.ssm.pojo.OrderView;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import cn.oza.logistic.ssm.service.ExportDetailService;
import cn.oza.logistic.ssm.service.ExportService;
import cn.oza.logistic.ssm.service.InfoService;
import cn.oza.logistic.ssm.service.TransactionDetailService;
import cn.oza.logistic.ssm.service.TransactionService;
import cn.oza.logistic.ssm.service.UserService;
import cn.oza.logistic.ssm.service.OrderDetailService;
import cn.oza.logistic.ssm.service.BasicDataService;
import cn.oza.logistic.ssm.service.OrderService;
import cn.oza.logistic.ssm.service.OrderViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({ "/transaction" })
@Controller
public class TransactionController
{
    @Autowired
    private OrderController orderController;
    @Autowired
    private OrderViewService orderViewService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private BasicDataService basicDataService;
    @Autowired
    private OrderDetailService orderDetailService;
    @Autowired
    private UserService userService;
    @Autowired
    private TransactionService transactionService;
    @Autowired
    private TransactionDetailService transactionDetailService;
    @Autowired
    private InfoService infoService;
    @Autowired
    private ExportService exportService;
    @Autowired
    private ExportDetailService exportDetailService;
    
    @RequestMapping({ "/list" })
    @RequiresPermissions({ "transaction:deal" })
    public String list() {
        return "transaction/list";
    }
    
    @RequestMapping({ "/getOrders" })
    @RequiresPermissions({ "transaction:deal" })
    @ResponseBody
    public PageInfo<OrderView> getOrders(final String keyWord, @RequestParam(defaultValue = "1") final Integer pageNum, @RequestParam(defaultValue = "10") final Integer pageSize) {
        return this.orderController.getOrdersUtil(keyWord, pageNum, pageSize);
    }
    
    @RequestMapping({ "/deal" })
    public String deal(final Model m, final Long orderId) {
        final Order order = this.orderService.selectByPrimaryKey(orderId);
        final OrderViewExample orderViewExample = new OrderViewExample();
        orderViewExample.createCriteria().andOrderIdEqualTo(orderId);
        final OrderView orderView = this.orderViewService.selectByExample(orderViewExample).get(0);
        final String area = this.basicDataService.selectByPrimaryKey(order.getIntervalId()).getBaseName();
        final String payment = this.basicDataService.selectByPrimaryKey(order.getPaymentMethodId()).getBaseName();
        final String shippingMethod = this.basicDataService.selectByPrimaryKey(order.getFreightMethodId()).getBaseName();
        final String pickUpMethod = this.basicDataService.selectByPrimaryKey(order.getTakeMethodId()).getBaseName();
        final BasicDataExample basicDataExample = new BasicDataExample();
        basicDataExample.createCriteria().andParentIdEqualTo(ConstantDataField.STORAGE_BASICDATA_ID);
        final List<BasicData> storages = this.basicDataService.selectByExample(basicDataExample);
        final OrderDetailExample orderDetailExample = new OrderDetailExample();
        orderDetailExample.createCriteria().andOrderIdEqualTo(orderId);
        final List<OrderDetail> orderDetails = this.orderDetailService.selectByExample(orderDetailExample);
        final BasicDataExample basicDataExample2 = new BasicDataExample();
        basicDataExample.createCriteria().andParentIdEqualTo(ConstantDataField.UNIT_BASICDATA_ID);
        final List<BasicData> units = this.basicDataService.selectByExample(basicDataExample2);
        final UserExample userExample = new UserExample();
        userExample.createCriteria().andRoleIdEqualTo(ConstantDataField.STORAGE_ROLE_ID);
        final List<User> users = this.userService.selectByExample(userExample);
        final TransactionExample transactionExample = new TransactionExample();
        transactionExample.createCriteria().andOrderIdEqualTo(orderId);
        final List<Transaction> transactions = this.transactionService.selectByExample(transactionExample);
        final List<TransactionDetail> transactionDetails = new ArrayList<TransactionDetail>();
        TransactionDetailExample transactionDetailExample;
        List<TransactionDetail> details;
        List<TransactionDetail> list = null;
        
        for(OrderDetail orderDetail: orderDetails) {
        	 transactionDetailExample = new TransactionDetailExample();
             transactionDetailExample.createCriteria().andOrderDetailIdEqualTo(orderDetail.getOrderDetailId());
             details = this.transactionDetailService.selectByExample(transactionDetailExample);
             if (details.size() == 0) {
                 list = null;
             }
             else {
                 list.add(details.get(0));
             }
        }
        
        /*
        orderDetails.forEach(orderDetail -> {
            transactionDetailExample = new TransactionDetailExample();
            transactionDetailExample.createCriteria().andOrderDetailIdEqualTo(orderDetail.getOrderDetailId());
            details = this.transactionDetailService.selectByExample(transactionDetailExample);
            if (details.size() == 0) {
                list = null;
            }
            else {
                list.add(details.get(0));
            }
            return;
        });*/
        
        final Subject subject = SecurityUtils.getSubject();
        final Boolean allowedQuote = subject.isPermitted("transaction:quote");
        final Boolean allowedStorage = subject.isPermitted("transaction:storage");
        m.addAttribute("order", (Object)order);
        m.addAttribute("orderView", (Object)orderView);
        m.addAttribute("area", (Object)area);
        m.addAttribute("payment", (Object)payment);
        m.addAttribute("shippingMethod", (Object)shippingMethod);
        m.addAttribute("pickUpMethod", (Object)pickUpMethod);
        m.addAttribute("storages", (Object)storages);
        m.addAttribute("orderDetails", (Object)orderDetails);
        m.addAttribute("units", (Object)units);
        m.addAttribute("users", (Object)users);
        if (transactions.size() > 0) {
            m.addAttribute("transaction", (Object)transactions.get(0));
        }
        else {
            m.addAttribute("transaction", (Object)null);
        }
        m.addAttribute("transactionDetails", (Object)transactionDetails);
        m.addAttribute("allowedQuote", (Object)allowedQuote);
        m.addAttribute("allowedStorage", (Object)allowedStorage);
        return "transaction/deal";
    }
    
    @RequestMapping({ "/update" })
    @RequiresPermissions({ "transaction:deal" })
    @ResponseBody
    public Boolean update(@RequestBody final Transaction transaction) {
        final TransactionExample transactionExample = new TransactionExample();
        transactionExample.createCriteria().andOrderIdEqualTo(transaction.getOrderId());
        int res;
        if (this.transactionService.selectByExample(transactionExample).size() == 0) {
            res = this.transactionService.insert(transaction);
        }
        else {
            res = this.transactionService.updateByPrimaryKeySelective(transaction);
        }
        final List<TransactionDetail> transactionDetails = transaction.getTransactionDetails();
        transactionDetails.forEach(transactionDetail -> {
            if (transactionDetail.getTransactionDetailId() == null) {
                this.transactionDetailService.insert(transactionDetail);
            }
            else {
                this.transactionDetailService.updateByPrimaryKeySelective(transactionDetail);
            }
            return;
        });
        final Order order = this.orderService.selectByPrimaryKey(transaction.getOrderId());
        order.setOrderStatus(1);
        this.orderService.updateByPrimaryKeySelective(order);
        if (res == 1) {
            return true;
        }
        return false;
    }
    
    @RequestMapping({ "/export" })
    @RequiresPermissions({ "transaction:export" })
    public String export(final Model m, final Long orderId) {
        final Order order = this.orderService.selectByPrimaryKey(orderId);
        if (order.getOrderStatus() == 0) {
            m.addAttribute("errorMsg", (Object)"\u8be5\u8ba2\u5355\u8fd8\u672a\u62a5\u4ef7\u5165\u5e93\uff01");
            return "transaction/error";
        }
        Info info = null;
        try {
            info = this.resolveInfo(orderId);
        }
        catch (Exception e) {
            m.addAttribute("errorMsg", (Object)"\u51fa\u73b0\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5\u662f\u5426\u5b8c\u6210\u62a5\u4ef7\u5165\u5e93\uff01");
            return "transaction/error";
        }
        final Info dbInfo = this.infoService.selectByPrimaryKey(orderId);
        if (dbInfo == null) {
            this.infoService.insert(info);
        }
        else {
            this.infoService.updateByPrimaryKeySelective(info);
        }
        final ExportExample exportExample = new ExportExample();
        exportExample.createCriteria().andOrderIdEqualTo(orderId);
        final Export export = this.exportService.selectByExample(exportExample).get(0);
        m.addAttribute("export", (Object)export);
        final ExportDetailExample exportDetailExample = new ExportDetailExample();
        exportDetailExample.createCriteria().andOrderIdEqualTo(orderId);
        final List<ExportDetail> exportDetails = this.exportDetailService.selectByExample(exportDetailExample);
        m.addAttribute("exportDetails", (Object)exportDetails);
        final TransactionExample transactionExample = new TransactionExample();
        transactionExample.createCriteria().andOrderIdEqualTo(orderId);
        final Transaction transaction = this.transactionService.selectByExample(transactionExample).get(0);
        m.addAttribute("transaction", (Object)transaction);
        m.addAttribute("info", (Object)info);
        return "transaction/export";
    }
    
    @RequiresPermissions({ "transaction:export" })
    @RequestMapping({ "/print" })
    public void print(final HttpServletResponse response, final Long orderId) {
        final Info info = this.infoService.selectByPrimaryKey(orderId);
        final ExportExample exportExample = new ExportExample();
        exportExample.createCriteria().andOrderIdEqualTo(orderId);
        final Export export = this.exportService.selectByExample(exportExample).get(0);
        final ExportDetailExample exportDetailExample = new ExportDetailExample();
        exportDetailExample.createCriteria().andOrderIdEqualTo(orderId);
        final List<ExportDetail> exportDetails = this.exportDetailService.selectByExample(exportDetailExample);
        final TransactionExample transactionExample = new TransactionExample();
        transactionExample.createCriteria().andOrderIdEqualTo(orderId);
        final Transaction transaction = this.transactionService.selectByExample(transactionExample).get(0);
        final HSSFWorkbook book = new HSSFWorkbook();
        final HSSFSheet sheet = book.createSheet();
        final HSSFRow row_0 = sheet.createRow(0);
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 1, 3));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 5, 7));
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 9, 11));
        row_0.createCell(0).setCellValue("\u8ba2\u5355\u7f16\u53f7");
        row_0.createCell(1).setCellValue((double)export.getOrderId());
        row_0.createCell(4).setCellValue("\u4e1a\u52a1\u5458");
        row_0.createCell(5).setCellValue(export.getStaff());
        row_0.createCell(8).setCellValue("\u5ba2\u6237");
        row_0.createCell(9).setCellValue(export.getCustomerName());
        final HSSFRow row_ = sheet.createRow(1);
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 1, 3));
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 5, 7));
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 9, 11));
        row_.createCell(0).setCellValue("\u5230\u8fbe\u56fd\u5bb6");
        row_.createCell(1).setCellValue(export.getArea());
        row_.createCell(4).setCellValue("\u6536\u8d27\u5730\u5740");
        row_.createCell(5).setCellValue(export.getShippingAddress());
        row_.createCell(8).setCellValue("\u6536\u4ef6\u4eba");
        row_.createCell(9).setCellValue(export.getShippingName());
        final HSSFRow row_2 = sheet.createRow(2);
        sheet.addMergedRegion(new CellRangeAddress(2, 2, 1, 3));
        sheet.addMergedRegion(new CellRangeAddress(2, 2, 5, 7));
        sheet.addMergedRegion(new CellRangeAddress(2, 2, 9, 11));
        row_2.createCell(0).setCellValue("\u8054\u7cfb\u7535\u8bdd");
        row_2.createCell(1).setCellValue(export.getShippingPhone());
        row_2.createCell(4).setCellValue("\u4ed8\u6b3e\u65b9\u5f0f");
        row_2.createCell(5).setCellValue(export.getPayment());
        row_2.createCell(8).setCellValue("\u8d27\u8fd0\u65b9\u5f0f");
        row_2.createCell(9).setCellValue(export.getShippingMethod());
        final HSSFRow row_3 = sheet.createRow(3);
        sheet.addMergedRegion(new CellRangeAddress(3, 3, 1, 3));
        sheet.addMergedRegion(new CellRangeAddress(3, 3, 5, 7));
        sheet.addMergedRegion(new CellRangeAddress(3, 3, 9, 11));
        row_3.createCell(0).setCellValue("\u53d6\u4ef6\u65b9\u5f0f");
        row_3.createCell(1).setCellValue(export.getPickupMehtod());
        row_3.createCell(4).setCellValue("\u5165\u5e93\u4eba");
        row_3.createCell(5).setCellValue(export.getStorageStaff());
        row_3.createCell(8).setCellValue("\u5165\u5e93\u9009\u62e9");
        row_3.createCell(9).setCellValue(export.getStorage());
        final HSSFRow row_4 = sheet.createRow(4);
        sheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 11));
        row_4.createCell(0).setCellValue("\u8d39\u7528\u660e\u7ec6");
        final HSSFRow row_5 = sheet.createRow(5);
        sheet.addMergedRegion(new CellRangeAddress(5, 5, 1, 3));
        sheet.addMergedRegion(new CellRangeAddress(5, 5, 5, 7));
        sheet.addMergedRegion(new CellRangeAddress(5, 5, 9, 11));
        row_5.createCell(0).setCellValue("\u4f53\u79ef\u6536\u8d39");
        row_5.createCell(1).setCellValue((double)export.getVolumeFee());
        row_5.createCell(4).setCellValue("\u603b\u4f53\u79ef");
        row_5.createCell(5).setCellValue((double)export.getTotalVolume());
        row_5.createCell(8).setCellValue("\u4f53\u79ef\u8d39\u7387");
        row_5.createCell(9).setCellValue((double)transaction.getVolumeRate());
        final HSSFRow row_6 = sheet.createRow(6);
        sheet.addMergedRegion(new CellRangeAddress(6, 6, 1, 3));
        sheet.addMergedRegion(new CellRangeAddress(6, 6, 5, 7));
        sheet.addMergedRegion(new CellRangeAddress(6, 6, 9, 11));
        row_6.createCell(0).setCellValue("\u91cd\u91cf\u6536\u8d39");
        row_6.createCell(1).setCellValue((double)export.getWeightFee());
        row_6.createCell(4).setCellValue("\u603b\u91cd\u91cf");
        row_6.createCell(5).setCellValue((double)export.getTotalWeight());
        row_6.createCell(8).setCellValue("\u91cd\u91cf\u8d39\u7387");
        row_6.createCell(9).setCellValue((double)transaction.getWeightRate());
        final HSSFRow row_7 = sheet.createRow(7);
        sheet.addMergedRegion(new CellRangeAddress(7, 7, 1, 3));
        sheet.addMergedRegion(new CellRangeAddress(7, 7, 5, 7));
        sheet.addMergedRegion(new CellRangeAddress(7, 7, 9, 11));
        row_7.createCell(0).setCellValue("\u8fc7\u5173\u7a0e\u8d39");
        row_7.createCell(1).setCellValue((double)export.getTaxFee());
        row_7.createCell(4).setCellValue("\u603b\u4ef7\u503c");
        row_7.createCell(5).setCellValue((double)export.getTotalValue());
        row_7.createCell(8).setCellValue("\u7a0e\u7387");
        row_7.createCell(9).setCellValue((double)info.getTaxRate());
        final HSSFRow row_8 = sheet.createRow(8);
        sheet.addMergedRegion(new CellRangeAddress(8, 8, 1, 11));
        row_8.createCell(0).setCellValue("\u53d6\u4ef6\u8d39\u7528");
        row_8.createCell(1).setCellValue((double)export.getPickUpFee());
        final HSSFRow row_9 = sheet.createRow(9);
        sheet.addMergedRegion(new CellRangeAddress(9, 9, 1, 11));
        row_9.createCell(0).setCellValue("\u603b\u8d39\u7528");
        row_9.createCell(1).setCellValue((double)export.getTotalFee());
        final HSSFRow row_10 = sheet.createRow(10);
        sheet.addMergedRegion(new CellRangeAddress(10, 10, 0, 11));
        row_10.createCell(0).setCellValue("\u8d27\u7269\u6e05\u5355");
        final HSSFRow row_11 = sheet.createRow(11);
        sheet.addMergedRegion(new CellRangeAddress(11, 11, 0, 1));
        sheet.addMergedRegion(new CellRangeAddress(11, 11, 7, 8));
        sheet.addMergedRegion(new CellRangeAddress(11, 11, 9, 10));
        row_11.createCell(0).setCellValue("\u8d27\u7269\u540d\u79f0");
        row_11.createCell(2).setCellValue("\u6570\u91cf");
        row_11.createCell(3).setCellValue("\u5355\u4f4d");
        row_11.createCell(4).setCellValue("\u957f");
        row_11.createCell(5).setCellValue("\u5bbd");
        row_11.createCell(6).setCellValue("\u9ad8");
        row_11.createCell(7).setCellValue("\u6838\u7b97\u4f53\u79ef");
        row_11.createCell(9).setCellValue("\u6838\u7b97\u91cd\u91cf");
        row_11.createCell(11).setCellValue("\u603b\u4ef7\u503c");
        for (int i = 0; i < exportDetails.size(); ++i) {
            final HSSFRow row = sheet.createRow(i + 12);
            sheet.addMergedRegion(new CellRangeAddress(i + 12, i + 12, 0, 1));
            sheet.addMergedRegion(new CellRangeAddress(i + 12, i + 12, 7, 8));
            sheet.addMergedRegion(new CellRangeAddress(i + 12, i + 12, 9, 10));
            row.createCell(0).setCellValue(exportDetails.get(i).getGoodsName());
            row.createCell(2).setCellValue((double)exportDetails.get(i).getGoodsNumber());
            row.createCell(3).setCellValue(exportDetails.get(i).getGoodsUnit());
            row.createCell(4).setCellValue((double)exportDetails.get(i).getLength());
            row.createCell(5).setCellValue((double)exportDetails.get(i).getWidth());
            row.createCell(6).setCellValue((double)exportDetails.get(i).getHeight());
            row.createCell(7).setCellValue((double)exportDetails.get(i).getVolume());
            row.createCell(9).setCellValue((double)exportDetails.get(i).getWeight());
            row.createCell(11).setCellValue((double)exportDetails.get(i).getGoodsTotal());
        }
        try {
            response.addHeader("Content-Disposition", "attachment;filename=" + new String("\u8d22\u52a1\u5ba1\u6838\u8868.xls".getBytes(), "ISO-8859-1"));
            book.write((OutputStream)response.getOutputStream());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private Info resolveInfo(final Long orderId) {
        final Info info = new Info();
        info.setOrderId(orderId);
        Double totalVolume = 0.0;
        Double totalWeight = 0.0;
        Double totalValue = 0.0;
        Double taxRate = 0.0;
        Double weightFee = 0.0;
        Double volumeFee = 0.0;
        Double taxFee = 0.0;
        Double totalFee = 0.0;
        final Order order = this.orderService.selectByPrimaryKey(orderId);
        if (order.getFreightMethodId() == ConstantDataField.SEA_BASICDATA_ID && (order.getIntervalId() == ConstantDataField.SINGAPORE_BASICDATA_ID || order.getIntervalId() == ConstantDataField.AUSTRALIA_BASICDATA_ID)) {
            taxRate = 0.07;
        }
        final TransactionExample transactionExample = new TransactionExample();
        transactionExample.createCriteria().andOrderIdEqualTo(orderId);
        final Transaction transaction = this.transactionService.selectByExample(transactionExample).get(0);
        final OrderDetailExample orderDetailExample = new OrderDetailExample();
        orderDetailExample.createCriteria().andOrderIdEqualTo(orderId);
        final List<OrderDetail> orderDetails = this.orderDetailService.selectByExample(orderDetailExample);
        for (final OrderDetail orderDetail : orderDetails) {
            final TransactionDetailExample transactionDetailExample = new TransactionDetailExample();
            transactionDetailExample.createCriteria().andOrderDetailIdEqualTo(orderDetail.getOrderDetailId());
            final List<TransactionDetail> transactionDetails = this.transactionDetailService.selectByExample(transactionDetailExample);
            totalValue += orderDetail.getGoodsTotal();
            for (final TransactionDetail transactionDetail : transactionDetails) {
                totalVolume += transactionDetail.getVolume();
                totalWeight += transactionDetail.getWeight();
            }
        }
        if (totalWeight / totalVolume < 200.0) {
            weightFee = totalVolume * 200.0 * transaction.getWeightRate();
        }
        else {
            weightFee = totalWeight * transaction.getWeightRate();
        }
        volumeFee = totalVolume * transaction.getVolumeRate();
        taxFee = totalValue * taxRate;
        totalFee = weightFee + taxFee + volumeFee + transaction.getPickUpFee();
        info.setTaxFee(taxFee);
        info.setTaxRate(taxRate);
        info.setTotalFee(totalFee);
        info.setTotalValue(totalValue);
        info.setTotalWeight(totalWeight);
        info.setTotalVolume(totalVolume);
        info.setVolumeFee(volumeFee);
        info.setWeightFee(weightFee);
        return info;
    }
}
