// 
// 
// 

package cn.oza.logistic.ssm.pojo;

public class Customer
{
    private Long customerId;
    private String customerName;
    private String phone;
    private String email;
    private String address;
    private Integer gender;
    private String remark;
    private String idCard;
    private Long userId;
    private Long locationId;
    
    public Long getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(final Long customerId) {
        this.customerId = customerId;
    }
    
    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(final String customerName) {
        this.customerName = ((customerName == null) ? null : customerName.trim());
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(final String phone) {
        this.phone = ((phone == null) ? null : phone.trim());
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(final String email) {
        this.email = ((email == null) ? null : email.trim());
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(final String address) {
        this.address = ((address == null) ? null : address.trim());
    }
    
    public Integer getGender() {
        return this.gender;
    }
    
    public void setGender(final Integer gender) {
        this.gender = gender;
    }
    
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(final String remark) {
        this.remark = ((remark == null) ? null : remark.trim());
    }
    
    public String getIdCard() {
        return this.idCard;
    }
    
    public void setIdCard(final String idCard) {
        this.idCard = ((idCard == null) ? null : idCard.trim());
    }
    
    public Long getUserId() {
        return this.userId;
    }
    
    public void setUserId(final Long userId) {
        this.userId = userId;
    }
    
    public Long getLocationId() {
        return this.locationId;
    }
    
    public void setLocationId(final Long locationId) {
        this.locationId = locationId;
    }
    
    @Override
    public String toString() {
        return "Customer{customerId=" + this.customerId + ", customerName='" + this.customerName + '\'' + ", phone='" + this.phone + '\'' + ", email='" + this.email + '\'' + ", address='" + this.address + '\'' + ", gender=" + this.gender + ", remark='" + this.remark + '\'' + ", idCard='" + this.idCard + '\'' + ", userId=" + this.userId + ", locationId=" + this.locationId + '}';
    }
}
