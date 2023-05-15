// 
// 
// 

package cn.oza.logistic.ssm.pojo;

public class BasicData
{
    private Long baseId;
    private String baseName;
    private String baseDesc;
    private Long parentId;
    
    public Long getBaseId() {
        return this.baseId;
    }
    
    public void setBaseId(final Long baseId) {
        this.baseId = baseId;
    }
    
    public String getBaseName() {
        return this.baseName;
    }
    
    public void setBaseName(final String baseName) {
        this.baseName = ((baseName == null) ? null : baseName.trim());
    }
    
    public String getBaseDesc() {
        return this.baseDesc;
    }
    
    public void setBaseDesc(final String baseDesc) {
        this.baseDesc = ((baseDesc == null) ? null : baseDesc.trim());
    }
    
    public Long getParentId() {
        return this.parentId;
    }
    
    public void setParentId(final Long parentId) {
        this.parentId = parentId;
    }
    
    @Override
    public String toString() {
        return "BasicData{baseId=" + this.baseId + ", baseName='" + this.baseName + '\'' + ", baseDesc='" + this.baseDesc + '\'' + ", parentId=" + this.parentId + '}';
    }
}
