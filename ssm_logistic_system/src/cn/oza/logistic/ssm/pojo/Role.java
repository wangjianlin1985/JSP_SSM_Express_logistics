// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.io.Serializable;

public class Role implements Serializable
{
    private static final long serialVersionUID = -2216376969251237108L;
    private Long roleId;
    private String rolename;
    private String remark;
    private String permissionIds;
    
    public Long getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(final Long roleId) {
        this.roleId = roleId;
    }
    
    public String getRolename() {
        return this.rolename;
    }
    
    public void setRolename(final String rolename) {
        this.rolename = ((rolename == null) ? null : rolename.trim());
    }
    
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(final String remark) {
        this.remark = ((remark == null) ? null : remark.trim());
    }
    
    public String getPermissionIds() {
        return this.permissionIds;
    }
    
    public void setPermissionIds(final String permissionIds) {
        this.permissionIds = ((permissionIds == null) ? null : permissionIds.trim());
    }
    
    @Override
    public String toString() {
        return "Role{roleId=" + this.roleId + ", rolename='" + this.rolename + '\'' + ", remark='" + this.remark + '\'' + ", permissionIds='" + this.permissionIds + '\'' + '}';
    }
}
