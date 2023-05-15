// 
// 
// 

package cn.oza.logistic.ssm.controller;

import java.util.Date;
import cn.oza.logistic.ssm.pojo.Customer;
import cn.oza.logistic.ssm.pojo.BasicData;
import cn.oza.logistic.ssm.pojo.UserExample;
import java.util.ArrayList;
import cn.oza.logistic.ssm.pojo.BasicDataExample;
import org.springframework.ui.Model;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.shiro.subject.Subject;
import java.util.List;
import cn.oza.logistic.constant.ConstantDataField;
import cn.oza.logistic.ssm.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.commons.lang3.StringUtils;
import cn.oza.logistic.ssm.pojo.CustomerViewExample;
import com.github.pagehelper.PageHelper;
import cn.oza.logistic.ssm.pojo.CustomerView;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import cn.oza.logistic.ssm.service.UserService;
import cn.oza.logistic.ssm.service.BasicDataService;
import cn.oza.logistic.ssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.service.CustomerViewService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping({ "/customer" })
public class CustomerController
{
    @Autowired
    private CustomerViewService customerViewService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private BasicDataService basicDataService;
    @Autowired
    private UserService userService;
    
    @RequestMapping({ "/list" })
    @RequiresPermissions({ "customer:list" })
    public String list() {
        return "customer/list";
    }
    
    @ResponseBody
    @RequestMapping({ "/getCustomers" })
    @RequiresPermissions({ "customer:list" })
    public PageInfo<CustomerView> getCustomers(final String keyWord, @RequestParam(defaultValue = "1") final Integer pageNum, @RequestParam(defaultValue = "10") final Integer pageSize) {
        PageHelper.startPage((int)pageNum, (int)pageSize);
        final CustomerViewExample customerViewExample = new CustomerViewExample();
        final CustomerViewExample.Criteria criteria = customerViewExample.createCriteria();
        if (StringUtils.isNotBlank((CharSequence)keyWord)) {
            criteria.andCustomerNameLike("%" + keyWord + "%");
        }
        final Subject subject = SecurityUtils.getSubject();
        final User user = (User)subject.getPrincipal();
        if (user.getRoleId() == ConstantDataField.SALESMAN_ROLE_ID) {
            criteria.andUserIdEqualTo(user.getUserId());
        }
        final List<CustomerView> customers = this.customerViewService.selectByExample(customerViewExample);
        final PageInfo<CustomerView> pageInfo = (PageInfo<CustomerView>)new PageInfo((List)customers);
        return pageInfo;
    }
    
    @ResponseBody
    @RequestMapping({ "/delete" })
    @RequiresPermissions({ "customer:delete" })
    public Map<String, String> delete(final Long[] customerIds) {
        final HashMap<String, String> map = new HashMap<String, String>();
        if (customerIds.length != 1) {
            int success = 0;
            final int total = customerIds.length;
            for (final Long customerId : customerIds) {
                success += this.customerService.deleteByPrimaryKey(customerId);
            }
            map.put("status", "true");
            map.put("info", "\u6210\u529f\u5220\u9664\u9009\u4e2d " + total + " \u4e2a\u5ba2\u6237\u4e2d\u7684 " + success + " \u4e2a\u5ba2\u6237");
            return map;
        }
        final int res = this.customerService.deleteByPrimaryKey(customerIds[0]);
        if (res == 1) {
            map.put("status", "true");
            map.put("info", "\u5220\u9664\u6210\u529f\uff01");
            return map;
        }
        map.put("status", "false");
        map.put("info", "\u5220\u9664\u5931\u8d25\uff01\u5ba2\u6237\u5df2\u7ecf\u4e0d\u5b58\u5728");
        return map;
    }
    
    @RequestMapping({ "/add" })
    @RequiresPermissions({ "customer:insert" })
    public String add(final Model m) {
        final BasicDataExample basicDataExample = new BasicDataExample();
        basicDataExample.createCriteria().andParentIdEqualTo(ConstantDataField.AREA_BASICDATA_ID);
        final List<BasicData> basicDatas = this.basicDataService.selectByExample(basicDataExample);
        m.addAttribute("areas", (Object)basicDatas);
        final Subject subject = SecurityUtils.getSubject();
        final User user = (User)subject.getPrincipal();
        List<User> users = new ArrayList<User>();
        if (user.getRoleId() == ConstantDataField.SALESMAN_ROLE_ID) {
            users.add(user);
        }
        else {
            final UserExample userExample = new UserExample();
            userExample.createCriteria().andRoleIdEqualTo(ConstantDataField.SALESMAN_ROLE_ID);
            users = this.userService.selectByExample(userExample);
        }
        m.addAttribute("users", (Object)users);
        return "customer/add";
    }
    
    @ResponseBody
    @RequestMapping({ "/insert" })
    @RequiresPermissions({ "customer:insert" })
    public Boolean insert(final Customer customer) {
        final int res = this.customerService.insert(customer);
        if (res == 1) {
            return true;
        }
        return false;
    }
    
    @RequestMapping({ "/edit" })
    @RequiresPermissions({ "customer:update" })
    public String edit(final Model m, final Long customerId) {
        final BasicDataExample basicDataExample = new BasicDataExample();
        basicDataExample.createCriteria().andParentIdEqualTo(ConstantDataField.AREA_BASICDATA_ID);
        final List<BasicData> basicDatas = this.basicDataService.selectByExample(basicDataExample);
        m.addAttribute("areas", (Object)basicDatas);
        final UserExample userExample = new UserExample();
        userExample.createCriteria().andRoleIdEqualTo(ConstantDataField.SALESMAN_ROLE_ID);
        final List<User> users = this.userService.selectByExample(userExample);
        m.addAttribute("users", (Object)users);
        final Customer customer = this.customerService.selectByPrimaryKey(customerId);
        m.addAttribute("customer", (Object)customer);
        return "customer/edit";
    }
    
    @ResponseBody
    @RequestMapping({ "/update" })
    @RequiresPermissions({ "customer:update" })
    public Boolean update(final Customer customer) {
        final int res = this.customerService.updateByPrimaryKeySelective(customer);
        if (res == 1) {
            return true;
        }
        return false;
    }
}
