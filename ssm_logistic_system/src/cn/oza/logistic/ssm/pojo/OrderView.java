// 
// 
// 

package cn.oza.logistic.ssm.pojo;

public class OrderView
{
    private Long orderId;
    private Long customerId;
    private String customerName;
    private String customerPhone;
    private String shippingName;
    private String shippingAddress;
    private String shippingPhone;
    private Integer orderStatus;
    private String username;
    
    public Long getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
    }
    
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
    
    public String getCustomerPhone() {
        return this.customerPhone;
    }
    
    public void setCustomerPhone(final String customerPhone) {
        this.customerPhone = ((customerPhone == null) ? null : customerPhone.trim());
    }
    
    public String getShippingName() {
        return this.shippingName;
    }
    
    public void setShippingName(final String shippingName) {
        this.shippingName = ((shippingName == null) ? null : shippingName.trim());
    }
    
    public String getShippingAddress() {
        return this.shippingAddress;
    }
    
    public void setShippingAddress(final String shippingAddress) {
        this.shippingAddress = ((shippingAddress == null) ? null : shippingAddress.trim());
    }
    
    public String getShippingPhone() {
        return this.shippingPhone;
    }
    
    public void setShippingPhone(final String shippingPhone) {
        this.shippingPhone = ((shippingPhone == null) ? null : shippingPhone.trim());
    }
    
    public Integer getOrderStatus() {
        return this.orderStatus;
    }
    
    public void setOrderStatus(final Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(final String username) {
        this.username = ((username == null) ? null : username.trim());
    }
}
