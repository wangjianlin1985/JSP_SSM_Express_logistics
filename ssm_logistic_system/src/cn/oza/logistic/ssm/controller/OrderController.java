// 
// 
// 

package cn.oza.logistic.ssm.controller;

import java.util.Date;
import cn.oza.logistic.ssm.pojo.BasicData;
import cn.oza.logistic.ssm.pojo.Customer;
import cn.oza.logistic.ssm.pojo.BasicDataExample;
import cn.oza.logistic.ssm.pojo.CustomerExample;
import java.util.ArrayList;
import cn.oza.logistic.ssm.pojo.UserExample;
import cn.oza.logistic.ssm.pojo.OrderDetailExample;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import cn.oza.logistic.ssm.pojo.OrderDetail;
import org.springframework.web.bind.annotation.RequestBody;
import cn.oza.logistic.ssm.pojo.Order;
import org.springframework.ui.Model;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import java.util.List;
import cn.oza.logistic.constant.ConstantDataField;
import cn.oza.logistic.ssm.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.commons.lang3.StringUtils;
import cn.oza.logistic.ssm.pojo.OrderViewExample;
import com.github.pagehelper.PageHelper;
import cn.oza.logistic.ssm.pojo.OrderView;
import com.github.pagehelper.PageInfo;
import cn.oza.logistic.ssm.service.OrderDetailService;
import cn.oza.logistic.ssm.service.BasicDataService;
import cn.oza.logistic.ssm.service.CustomerService;
import cn.oza.logistic.ssm.service.UserService;
import cn.oza.logistic.ssm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.service.OrderViewService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping({ "/order" })
public class OrderController
{
    @Autowired
    private OrderViewService orderViewService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private BasicDataService basicDataService;
    @Autowired
    private OrderDetailService orderDetailService;
    
    public PageInfo<OrderView> getOrdersUtil(final String keyWord, final Integer pageNum, final Integer pageSize) {
        PageHelper.startPage((int)pageNum, (int)pageSize);
        final OrderViewExample orderViewExample = new OrderViewExample();
        final OrderViewExample.Criteria criteria = orderViewExample.createCriteria();
        if (StringUtils.isNotBlank((CharSequence)keyWord)) {
            criteria.andCustomerNameLike("%" + keyWord + "%");
        }
        final Subject subject = SecurityUtils.getSubject();
        final User user = (User)subject.getPrincipal();
        if (user.getRoleId() == ConstantDataField.SALESMAN_ROLE_ID) {
            criteria.andUsernameEqualTo(user.getUsername());
        }
        final List<OrderView> orders = this.orderViewService.selectByExample(orderViewExample);
        final PageInfo<OrderView> pageInfo = (PageInfo<OrderView>)new PageInfo((List)orders);
        return pageInfo;
    }
    
    @RequestMapping({ "/list" })
    @RequiresPermissions({ "order:list" })
    public String list() {
        return "order/list";
    }
    
    @ResponseBody
    @RequestMapping({ "/getOrders" })
    @RequiresPermissions({ "order:list" })
    public PageInfo<OrderView> getOrders(final String keyWord, @RequestParam(defaultValue = "1") final Integer pageNum, @RequestParam(defaultValue = "10") final Integer pageSize) {
        return this.getOrdersUtil(keyWord, pageNum, pageSize);
    }
    
    @ResponseBody
    @RequestMapping({ "/delete" })
    @RequiresPermissions({ "order:delete" })
    public Map<String, String> delete(final Long[] orderIds) {
        final HashMap<String, String> map = new HashMap<String, String>();
        if (orderIds.length != 1) {
            int success = 0;
            final int total = orderIds.length;
            for (final Long orderId : orderIds) {
                success += this.orderService.deleteByPrimaryKey(orderId);
            }
            map.put("status", "true");
            map.put("info", "\u6210\u529f\u5220\u9664\u9009\u4e2d " + total + " \u4e2a\u8ba2\u5355\u4e2d\u7684 " + success + " \u4e2a\u8ba2\u5355");
            return map;
        }
        final int res = this.orderService.deleteByPrimaryKey(orderIds[0]);
        if (res == 1) {
            map.put("status", "true");
            map.put("info", "\u5220\u9664\u6210\u529f\uff01");
            return map;
        }
        map.put("status", "false");
        map.put("info", "\u5220\u9664\u5931\u8d25\uff01\u8ba2\u5355\u5df2\u7ecf\u4e0d\u5b58\u5728");
        return map;
    }
    
    @RequestMapping({ "/add" })
    @RequiresPermissions({ "order:insert" })
    public String add(final Model m) {
        this.getOrderGeneralData(m);
        return "order/add";
    }
    
    @RequestMapping({ "/insert" })
    @RequiresPermissions({ "order:insert" })
    @ResponseBody
    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, timeout = 5)
    public Boolean insert(@RequestBody final Order order) {
        final int res = this.orderService.insert(order);
        final List<OrderDetail> orderDetails = order.getorderDetails();
        orderDetails.forEach(orderDetail -> {
            orderDetail.setOrderId(order.getOrderId());
            this.orderDetailService.insert(orderDetail);
            return;
        });
        if (res == 1) {
            return true;
        }
        return false;
    }
    
    @RequestMapping({ "/edit" })
    @RequiresPermissions({ "order:update" })
    public String edit(final Long orderId, final Model m) {
        this.getOrderGeneralData(m);
        final Order selectedOrder = this.orderService.selectByPrimaryKey(orderId);
        m.addAttribute("selectedOrder", (Object)selectedOrder);
        final OrderDetailExample orderDetailExample = new OrderDetailExample();
        orderDetailExample.createCriteria().andOrderIdEqualTo(orderId);
        final List<OrderDetail> orderDetails = this.orderDetailService.selectByExample(orderDetailExample);
        m.addAttribute("orderDetails", (Object)orderDetails);
        return "order/edit";
    }
    
    @RequiresPermissions({ "order:update" })
    @RequestMapping({ "/update" })
    @ResponseBody
    public Boolean update(@RequestBody final Order order) {
        final OrderDetailExample orderDetailExample = new OrderDetailExample();
        orderDetailExample.createCriteria().andOrderIdEqualTo(order.getOrderId());
        final List<OrderDetail> dbOrderDetails = this.orderDetailService.selectByExample(orderDetailExample);
        final List<OrderDetail> formOrderDetails = order.getorderDetails();
        dbOrderDetails.forEach(dbOrderDetail -> {
            if (!formOrderDetails.contains(dbOrderDetail)) {
                this.orderDetailService.deleteByPrimaryKey(dbOrderDetail.getOrderDetailId());
            }
            return;
        });
        formOrderDetails.forEach(formOrderDetail -> {
            if (dbOrderDetails.contains(formOrderDetail)) {
                this.orderDetailService.updateByPrimaryKeySelective(formOrderDetail);
            }
            else {
                formOrderDetail.setOrderId(order.getOrderId());
                this.orderDetailService.insert(formOrderDetail);
            }
            return;
        });
        final int res = this.orderService.updateByPrimaryKey(order);
        if (res == 1) {
            return true;
        }
        return false;
    }
    
    private void getOrderGeneralData(final Model m) {
        final User user = (User)SecurityUtils.getSubject().getPrincipal();
        final Long userRoleId = user.getRoleId();
        final Long userId = user.getUserId();
        final UserExample userExample = new UserExample();
        List<User> users = new ArrayList<User>();
        if (userRoleId == ConstantDataField.SALESMAN_ROLE_ID) {
            users.add(this.userService.selectByPrimaryKey(userId));
        }
        else {
            userExample.createCriteria().andRoleIdEqualTo(ConstantDataField.SALESMAN_ROLE_ID);
            users = this.userService.selectByExample(userExample);
        }
        m.addAttribute("users", (Object)users);
        final CustomerExample customerExample = new CustomerExample();
        List<Customer> customers;
        if (userRoleId == ConstantDataField.SALESMAN_ROLE_ID) {
            customerExample.createCriteria().andUserIdEqualTo(userId);
            customers = this.customerService.selectByExample(customerExample);
        }
        else {
            customers = this.customerService.selectByExample(customerExample);
        }
        m.addAttribute("customers", (Object)customers);
        final BasicDataExample areaExample = new BasicDataExample();
        areaExample.createCriteria().andParentIdEqualTo(ConstantDataField.AREA_BASICDATA_ID);
        final List<BasicData> areas = this.basicDataService.selectByExample(areaExample);
        m.addAttribute("areas", (Object)areas);
        final BasicDataExample paymentExample = new BasicDataExample();
        paymentExample.createCriteria().andParentIdEqualTo(ConstantDataField.PAYMENT_BASICDATA_ID);
        final List<BasicData> payments = this.basicDataService.selectByExample(paymentExample);
        m.addAttribute("payments", (Object)payments);
        final BasicDataExample transportExample = new BasicDataExample();
        transportExample.createCriteria().andParentIdEqualTo(ConstantDataField.TRANSPORT_BASICDATA_ID);
        final List<BasicData> transports = this.basicDataService.selectByExample(transportExample);
        m.addAttribute("transports", (Object)transports);
        final BasicDataExample pickupExample = new BasicDataExample();
        pickupExample.createCriteria().andParentIdEqualTo(ConstantDataField.PICKUP_BASICDATA_ID);
        final List<BasicData> pickups = this.basicDataService.selectByExample(pickupExample);
        m.addAttribute("pickups", (Object)pickups);
        final BasicDataExample unitExample = new BasicDataExample();
        unitExample.createCriteria().andParentIdEqualTo(ConstantDataField.UNIT_BASICDATA_ID);
        final List<BasicData> units = this.basicDataService.selectByExample(unitExample);
        m.addAttribute("units", (Object)units);
    }
}
