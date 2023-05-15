// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.List;

public class Order
{
    private Long orderId;
    private Long userId;
    private Long customerId;
    private String shippingAddress;
    private String shippingName;
    private String shippingPhone;
    private String takeName;
    private String takeAddress;
    private String takePhone;
    private Integer orderStatus;
    private Long paymentMethodId;
    private Long intervalId;
    private Long takeMethodId;
    private Long freightMethodId;
    private String orderRemark;
    private Customer customer;
    private List<OrderDetail> orderDetails;
    
    public List<OrderDetail> getorderDetails() {
        return this.orderDetails;
    }
    
    public void setorderDetails(final List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
    
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }
    
    public Long getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
    }
    
    public Long getUserId() {
        return this.userId;
    }
    
    public void setUserId(final Long userId) {
        this.userId = userId;
    }
    
    public Long getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(final Long customerId) {
        this.customerId = customerId;
    }
    
    public String getShippingAddress() {
        return this.shippingAddress;
    }
    
    public void setShippingAddress(final String shippingAddress) {
        this.shippingAddress = ((shippingAddress == null) ? null : shippingAddress.trim());
    }
    
    public String getShippingName() {
        return this.shippingName;
    }
    
    public void setShippingName(final String shippingName) {
        this.shippingName = ((shippingName == null) ? null : shippingName.trim());
    }
    
    public String getShippingPhone() {
        return this.shippingPhone;
    }
    
    public void setShippingPhone(final String shippingPhone) {
        this.shippingPhone = ((shippingPhone == null) ? null : shippingPhone.trim());
    }
    
    public String getTakeName() {
        return this.takeName;
    }
    
    public void setTakeName(final String takeName) {
        this.takeName = ((takeName == null) ? null : takeName.trim());
    }
    
    public String getTakeAddress() {
        return this.takeAddress;
    }
    
    public void setTakeAddress(final String takeAddress) {
        this.takeAddress = ((takeAddress == null) ? null : takeAddress.trim());
    }
    
    public String getTakePhone() {
        return this.takePhone;
    }
    
    public void setTakePhone(final String takePhone) {
        this.takePhone = ((takePhone == null) ? null : takePhone.trim());
    }
    
    public Integer getOrderStatus() {
        return this.orderStatus;
    }
    
    public void setOrderStatus(final Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
    
    public Long getPaymentMethodId() {
        return this.paymentMethodId;
    }
    
    public void setPaymentMethodId(final Long paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
    
    public Long getIntervalId() {
        return this.intervalId;
    }
    
    public void setIntervalId(final Long intervalId) {
        this.intervalId = intervalId;
    }
    
    public Long getTakeMethodId() {
        return this.takeMethodId;
    }
    
    public void setTakeMethodId(final Long takeMethodId) {
        this.takeMethodId = takeMethodId;
    }
    
    public Long getFreightMethodId() {
        return this.freightMethodId;
    }
    
    public void setFreightMethodId(final Long freightMethodId) {
        this.freightMethodId = freightMethodId;
    }
    
    public String getOrderRemark() {
        return this.orderRemark;
    }
    
    public void setOrderRemark(final String orderRemark) {
        this.orderRemark = ((orderRemark == null) ? null : orderRemark.trim());
    }
    
    @Override
    public String toString() {
        return "Order{orderId=" + this.orderId + ", userId=" + this.userId + ", customerId=" + this.customerId + ", shippingAddress='" + this.shippingAddress + '\'' + ", shippingName='" + this.shippingName + '\'' + ", shippingPhone='" + this.shippingPhone + '\'' + ", takeName='" + this.takeName + '\'' + ", takeAddress='" + this.takeAddress + '\'' + ", takePhone='" + this.takePhone + '\'' + ", orderStatus=" + this.orderStatus + ", paymentMethodId=" + this.paymentMethodId + ", intervalId=" + this.intervalId + ", takeMethodId=" + this.takeMethodId + ", freightMethodId=" + this.freightMethodId + ", orderRemark='" + this.orderRemark + '\'' + ", customer=" + this.customer + ", orderDetials=" + this.orderDetails + '}';
    }
}
