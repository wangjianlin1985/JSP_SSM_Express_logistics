// 
// 
// 

package cn.oza.logistic.ssm.pojo;

public class Permission
{
    private Long permissionId;
    private String name;
    private String type;
    private String url;
    private String expression;
    private Long parentId;
    private Integer sort;
    private Permission parent;
    private Boolean open;
    
    public Permission() {
        this.open = true;
    }
    
    public Boolean getOpen() {
        return this.open;
    }
    
    public Permission getParent() {
        return this.parent;
    }
    
    @Override
    public String toString() {
        return "Permission{permissionId=" + this.permissionId + ", name='" + this.name + '\'' + ", type='" + this.type + '\'' + ", url='" + this.url + '\'' + ", expression='" + this.expression + '\'' + ", parentId=" + this.parentId + ", sort=" + this.sort + ", parent=" + this.parent + '}';
    }
    
    public Long getPermissionId() {
        return this.permissionId;
    }
    
    public void setPermissionId(final Long permissionId) {
        this.permissionId = permissionId;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = ((name == null) ? null : name.trim());
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(final String type) {
        this.type = ((type == null) ? null : type.trim());
    }
    
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(final String url) {
        this.url = ((url == null) ? null : url.trim());
    }
    
    public String getExpression() {
        return this.expression;
    }
    
    public void setExpression(final String expression) {
        this.expression = ((expression == null) ? null : expression.trim());
    }
    
    public Long getParentId() {
        return this.parentId;
    }
    
    public void setParentId(final Long parentId) {
        this.parentId = parentId;
    }
    
    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(final Integer sort) {
        this.sort = sort;
    }
}
