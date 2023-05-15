// 
// 
// 

package cn.oza.logistic.ssm.controller;

import java.util.Date;
import org.apache.shiro.crypto.hash.SimpleHash;
import java.util.UUID;
import cn.oza.logistic.ssm.pojo.Role;
import cn.oza.logistic.ssm.pojo.RoleExample;
import org.springframework.ui.Model;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import cn.oza.logistic.ssm.pojo.UserExample;
import com.github.pagehelper.PageHelper;
import cn.oza.logistic.ssm.pojo.User;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import cn.oza.logistic.ssm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping({ "/admin" })
public class AdminController
{
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    
    @RequestMapping({ "/list" })
    @RequiresPermissions({ "admin:list" })
    public String adminList() {
        return "admin/list";
    }
    
    @ResponseBody
    @RequestMapping({ "/getAdmins" })
    @RequiresPermissions({ "admin:list" })
    public PageInfo<User> getAdmins(final String keyWord, @RequestParam(defaultValue = "1") final Integer pageNum, @RequestParam(defaultValue = "10") final Integer pageSize) {
        PageHelper.startPage((int)pageNum, (int)pageSize);
        final UserExample userExample = new UserExample();
        if (StringUtils.isNotBlank((CharSequence)keyWord)) {
            final UserExample.Criteria criteriaUserName = userExample.createCriteria();
            criteriaUserName.andUsernameLike("%" + keyWord + "%");
            final UserExample.Criteria criteriaRealName = userExample.createCriteria();
            criteriaRealName.andRealnameLike("%" + keyWord + "%");
            userExample.or(criteriaRealName);
        }
        final List<User> users = this.userService.selectByExample(userExample);
        final PageInfo<User> pageInfo = (PageInfo<User>)new PageInfo((List)users);
        return pageInfo;
    }
    
    @ResponseBody
    @RequestMapping({ "/delete" })
    @RequiresPermissions({ "admin:delete" })
    public Map<String, String> delete(final Long[] userIds) {
        final HashMap<String, String> map = new HashMap<String, String>();
        if (userIds.length != 1) {
            int success = 0;
            final int total = userIds.length;
            for (final Long userId : userIds) {
                success += this.userService.deleteByPrimaryKey(userId);
            }
            map.put("status", "true");
            map.put("info", "\u6210\u529f\u5220\u9664\u9009\u4e2d " + total + " \u4e2a\u7528\u6237\u4e2d\u7684 " + success + " \u4e2a\u7528\u6237");
            return map;
        }
        final int res = this.userService.deleteByPrimaryKey(userIds[0]);
        if (res == 1) {
            map.put("status", "true");
            map.put("info", "\u5220\u9664\u6210\u529f\uff01");
            return map;
        }
        map.put("status", "false");
        map.put("info", "\u5220\u9664\u5931\u8d25\uff01\u7528\u6237\u5df2\u7ecf\u4e0d\u5b58\u5728");
        return map;
    }
    
    @RequiresPermissions({ "admin:insert" })
    @RequestMapping({ "/add" })
    public String addAdmin(final Model m) {
        final RoleExample roleExample = new RoleExample();
        final List<Role> roles = this.roleService.selectByExample(roleExample);
        m.addAttribute("roles", (Object)roles);
        return "admin/add";
    }
    
    @ResponseBody
    @RequestMapping({ "/checkUsername" })
    @RequiresPermissions({ "admin:list" })
    public Boolean checkUsername(final String username) {
        final UserExample userExample = new UserExample();
        final UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        System.out.println(this.userService.selectByExample(userExample));
        if (this.userService.selectByExample(userExample).size() != 0) {
            return false;
        }
        return true;
    }
    
    @ResponseBody
    @RequestMapping({ "/insert" })
    @RequiresPermissions({ "admin:insert" })
    public Boolean insert(final User user) {
        final String salt = UUID.randomUUID().toString().substring(0, 4);
        final String hashedPassword = new SimpleHash("md5", (Object)user.getPassword(), (Object)salt, 3).toString();
        user.setSalt(salt);
        user.setPassword(hashedPassword);
        user.setCreateDate(new Date());
        final int res = this.userService.insert(user);
        if (res == 1) {
            return true;
        }
        return false;
    }
    
    @RequestMapping({ "/edit" })
    @RequiresPermissions({ "admin:update" })
    public String edit(final Model m, final Long userId) {
        m.addAttribute("user", (Object)this.userService.selectByPrimaryKey(userId));
        m.addAttribute("roles", (Object)this.roleService.selectByExample(new RoleExample()));
        return "admin/edit";
    }
    
    @ResponseBody
    @RequestMapping({ "/update" })
    @RequiresPermissions({ "admin:update" })
    public Boolean update(final User user) {
        if (StringUtils.isBlank((CharSequence)user.getPassword())) {
            user.setPassword(null);
        }
        else {
            final String salt = UUID.randomUUID().toString().substring(0, 4);
            final String hashedPassword = new SimpleHash("md5", (Object)user.getPassword(), (Object)salt, 3).toString();
            user.setPassword(hashedPassword);
            user.setSalt(salt);
        }
        final int res = this.userService.updateByPrimaryKeySelective(user);
        if (res == 1) {
            return true;
        }
        return false;
    }
}
