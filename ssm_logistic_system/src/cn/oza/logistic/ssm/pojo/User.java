// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.io.Serializable;

public class User implements Serializable
{
    private static final long serialVersionUID = -2216376969256287108L;
    private Long userId;
    private String username;
    private String realname;
    private String password;
    private String salt;
    private Integer status;
    @JsonFormat(pattern = "YYYY-MM-dd", timezone = "GMT+8")
    private Date createDate;
    private Long roleId;
    private Role role;
    private String roleName;
    
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(final String roleName) {
        this.roleName = roleName;
    }
    
    public Role getRole() {
        return this.role;
    }
    
    public void setRole(final Role role) {
        this.role = role;
    }
    
    public Long getUserId() {
        return this.userId;
    }
    
    public void setUserId(final Long userId) {
        this.userId = userId;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(final String username) {
        this.username = ((username == null) ? null : username.trim());
    }
    
    public String getRealname() {
        return this.realname;
    }
    
    public void setRealname(final String realname) {
        this.realname = ((realname == null) ? null : realname.trim());
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(final String password) {
        this.password = ((password == null) ? null : password.trim());
    }
    
    public String getSalt() {
        return this.salt;
    }
    
    public void setSalt(final String salt) {
        this.salt = ((salt == null) ? null : salt.trim());
    }
    
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(final Integer status) {
        this.status = status;
    }
    
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(final Date createDate) {
        this.createDate = createDate;
    }
    
    public Long getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(final Long roleId) {
        this.roleId = roleId;
    }
    
    public User(final Long userId, final String username, final String realname, final String password, final String salt, final Integer status, final Date createDate, final Long roleId) {
        this.userId = userId;
        this.username = username;
        this.realname = realname;
        this.password = password;
        this.salt = salt;
        this.status = status;
        this.createDate = createDate;
        this.roleId = roleId;
    }
    
    public User() {
    }
    
    @Override
    public String toString() {
        return "User{userId=" + this.userId + ", username='" + this.username + '\'' + ", realname='" + this.realname + '\'' + ", password='" + this.password + '\'' + ", salt='" + this.salt + '\'' + ", status=" + this.status + ", createDate=" + this.createDate + ", roleId=" + this.roleId + ", role=" + this.role + ", roleName='" + this.roleName + '\'' + '}';
    }
}
