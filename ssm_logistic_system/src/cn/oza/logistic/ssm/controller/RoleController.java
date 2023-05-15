// 
// 
// 

package cn.oza.logistic.ssm.controller;

import org.springframework.ui.Model;
import cn.oza.logistic.ssm.pojo.PermissionExample;
import java.util.ArrayList;
import cn.oza.logistic.ssm.pojo.Permission;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import cn.oza.logistic.ssm.pojo.RoleExample;
import com.github.pagehelper.PageHelper;
import cn.oza.logistic.ssm.pojo.Role;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import cn.oza.logistic.ssm.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping({ "role" })
public class RoleController
{
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionService permissionService;
    
    @RequestMapping({ "/list" })
    @RequiresPermissions({ "role:list" })
    public String roleList() {
        return "role/list";
    }
    
    @ResponseBody
    @RequestMapping({ "/getRoles" })
    @RequiresPermissions({ "role:list" })
    public PageInfo<Role> getAdmins(final String keyWord, @RequestParam(defaultValue = "1") final Integer pageNum, @RequestParam(defaultValue = "10") final Integer pageSize) {
        PageHelper.startPage((int)pageNum, (int)pageSize);
        final RoleExample roleExample = new RoleExample();
        if (StringUtils.isNotBlank((CharSequence)keyWord)) {
            final RoleExample.Criteria criteriaUserName = roleExample.createCriteria();
            criteriaUserName.andRolenameLike("%" + keyWord + "%");
        }
        final List<Role> roles = this.roleService.selectByExample(roleExample);
        final PageInfo<Role> pageInfo = (PageInfo<Role>)new PageInfo((List)roles);
        return pageInfo;
    }
    
    @ResponseBody
    @RequestMapping({ "/delete" })
    @RequiresPermissions({ "role:delete" })
    public Map<String, String> delete(final Long[] roleIds) {
        final HashMap<String, String> map = new HashMap<String, String>();
        if (roleIds.length != 1) {
            int success = 0;
            final int total = roleIds.length;
            for (final Long roleId : roleIds) {
                success += this.roleService.deleteByPrimaryKey(roleId);
            }
            map.put("status", "true");
            map.put("info", "\u6210\u529f\u5220\u9664\u9009\u4e2d " + total + " \u4e2a\u89d2\u8272\u4e2d\u7684 " + success + " \u4e2a\u89d2\u8272");
            return map;
        }
        final int res = this.roleService.deleteByPrimaryKey(roleIds[0]);
        if (res == 1) {
            map.put("status", "true");
            map.put("info", "\u5220\u9664\u6210\u529f\uff01");
            return map;
        }
        map.put("status", "false");
        map.put("info", "\u5220\u9664\u5931\u8d25\uff01\u89d2\u8272\u5df2\u7ecf\u4e0d\u5b58\u5728");
        return map;
    }
    
    @RequestMapping({ "/add" })
    @RequiresPermissions({ "role:insert" })
    public String addRole() {
        return "role/add";
    }
    
    @ResponseBody
    @RequestMapping({ "/getTree" })
    public List<Permission> getTree() {
        final ArrayList<Permission> permissions = (ArrayList<Permission>)(ArrayList)this.permissionService.selectByExample(new PermissionExample());
        return permissions;
    }
    
    @ResponseBody
    @RequestMapping({ "/insert" })
    @RequiresPermissions({ "role:insert" })
    public Boolean insert(final Role role) {
        final int res = this.roleService.insert(role);
        if (res == 1) {
            return true;
        }
        return false;
    }
    
    @ResponseBody
    @RequestMapping({ "/checkRole" })
    @RequiresPermissions({ "role:list" })
    public Boolean checkRole(final String name, final String curName) {
        if (curName != null && name.equals(curName)) {
            return true;
        }
        final RoleExample roleExample = new RoleExample();
        final RoleExample.Criteria criteria = roleExample.createCriteria();
        criteria.andRolenameEqualTo(name);
        if (this.roleService.selectByExample(roleExample).size() != 0) {
            return false;
        }
        return true;
    }
    
    @RequestMapping({ "/edit" })
    @RequiresPermissions({ "role:update" })
    public String edit(final Model m, final Long roleId) {
        m.addAttribute("role", (Object)this.roleService.selectByPrimaryKey(roleId));
        return "role/edit";
    }
    
    @ResponseBody
    @RequestMapping({ "/update" })
    @RequiresPermissions({ "role:update" })
    public Boolean update(final Role role) {
        final int res = this.roleService.updateByPrimaryKeySelective(role);
        if (res == 1) {
            return true;
        }
        return false;
    }
}
