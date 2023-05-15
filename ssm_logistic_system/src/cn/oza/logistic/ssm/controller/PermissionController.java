// 
// 
// 

package cn.oza.logistic.ssm.controller;

import org.springframework.ui.Model;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import cn.oza.logistic.ssm.pojo.PermissionExample;
import com.github.pagehelper.PageHelper;
import cn.oza.logistic.ssm.pojo.Permission;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.service.PermissionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping({ "/permission" })
public class PermissionController
{
    @Autowired
    private PermissionService permissionService;
    
    @RequestMapping({ "/list" })
    @RequiresPermissions({ "permission:list" })
    public String permissionList() {
        return "permission/list";
    }
    
    @ResponseBody
    @RequestMapping({ "/getPermissions" })
    @RequiresPermissions({ "permission:list" })
    public PageInfo<Permission> getPermissions(final String keyWord, @RequestParam(defaultValue = "1") final Integer pageNum, @RequestParam(defaultValue = "10") final Integer pageSize) {
        PageHelper.startPage((int)pageNum, (int)pageSize);
        final PermissionExample permissionExample = new PermissionExample();
        if (StringUtils.isNotBlank((CharSequence)keyWord)) {
            final PermissionExample.Criteria criteriaName = permissionExample.createCriteria();
            criteriaName.andNameLike("%" + keyWord + "%");
        }
        final List<Permission> permissions = this.permissionService.selectByExample(permissionExample);
        final PageInfo<Permission> pageInfo = (PageInfo<Permission>)new PageInfo((List)permissions);
        return pageInfo;
    }
    
    @ResponseBody
    @RequestMapping({ "/delete" })
    @RequiresPermissions({ "permission:delete" })
    public Map<String, String> delete(final Long[] permissionIds) {
        final HashMap<String, String> map = new HashMap<String, String>();
        if (permissionIds.length != 1) {
            int success = 0;
            final int total = permissionIds.length;
            for (final Long permissionId : permissionIds) {
                success += this.permissionService.deleteByPrimaryKey(permissionId);
            }
            map.put("status", "true");
            map.put("info", "\u6210\u529f\u5220\u9664\u9009\u4e2d " + total + " \u4e2a\u6743\u9650\u4e2d\u7684 " + success + " \u4e2a\u6743\u9650");
            return map;
        }
        final int res = this.permissionService.deleteByPrimaryKey(permissionIds[0]);
        if (res == 1) {
            map.put("status", "true");
            map.put("info", "\u5220\u9664\u6210\u529f\uff01");
            return map;
        }
        map.put("status", "false");
        map.put("info", "\u5220\u9664\u5931\u8d25\uff01\u6743\u9650\u5df2\u7ecf\u4e0d\u5b58\u5728");
        return map;
    }
    
    @RequestMapping({ "/add" })
    @RequiresPermissions({ "permission:insert" })
    public String addAdmin(final Model m) {
        final PermissionExample permissionExample = new PermissionExample();
        final List<Permission> permissions = this.permissionService.selectByExample(permissionExample);
        m.addAttribute("permissions", (Object)permissions);
        return "permission/add";
    }
    
    @ResponseBody
    @RequestMapping({ "/checkPermission" })
    @RequiresPermissions({ "permission:list" })
    public Boolean checkPermission(final String name, final String curName) {
        System.out.println(name);
        System.out.println(curName);
        if (curName != null && name.equals(curName)) {
            return true;
        }
        final PermissionExample permissionExample = new PermissionExample();
        final PermissionExample.Criteria criteria = permissionExample.createCriteria();
        criteria.andNameEqualTo(name);
        if (this.permissionService.selectByExample(permissionExample).size() != 0) {
            return false;
        }
        return true;
    }
    
    @ResponseBody
    @RequestMapping({ "/insert" })
    @RequiresPermissions({ "permission:insert" })
    public Boolean insert(final Permission permission) {
        final int res = this.permissionService.insert(permission);
        if (res == 1) {
            return true;
        }
        return false;
    }
    
    @RequestMapping({ "/edit" })
    @RequiresPermissions({ "permission:update" })
    public String edit(final Model m, final Long permissionId) {
        m.addAttribute("myPermission", (Object)this.permissionService.selectByPrimaryKey(permissionId));
        m.addAttribute("permissions", (Object)this.permissionService.selectByExample(new PermissionExample()));
        return "permission/edit";
    }
    
    @ResponseBody
    @RequestMapping({ "/update" })
    @RequiresPermissions({ "permission:update" })
    public Boolean update(final Permission permission) {
        final int res = this.permissionService.updateByPrimaryKeySelective(permission);
        if (res == 1) {
            return true;
        }
        return false;
    }
}
