// 
// 
// 

package cn.oza.logistic.ssm.pojo;

public class Export
{
    private Long orderId;
    private String area;
    private String shippingAddress;
    private String payment;
    private String pickupMehtod;
    private String storageStaff;
    private Double weightFee;
    private Double volumeFee;
    private Double taxFee;
    private Integer pickUpFee;
    private Double totalFee;
    private Double totalVolume;
    private Double totalWeight;
    private Double totalValue;
    private String shippingName;
    private String shippingPhone;
    private String shippingMethod;
    private String storage;
    private String staff;
    private String customerName;
    
    public Long getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
    }
    
    public String getArea() {
        return this.area;
    }
    
    public void setArea(final String area) {
        this.area = ((area == null) ? null : area.trim());
    }
    
    public String getShippingAddress() {
        return this.shippingAddress;
    }
    
    public void setShippingAddress(final String shippingAddress) {
        this.shippingAddress = ((shippingAddress == null) ? null : shippingAddress.trim());
    }
    
    public String getPayment() {
        return this.payment;
    }
    
    public void setPayment(final String payment) {
        this.payment = ((payment == null) ? null : payment.trim());
    }
    
    public String getPickupMehtod() {
        return this.pickupMehtod;
    }
    
    public void setPickupMehtod(final String pickupMehtod) {
        this.pickupMehtod = ((pickupMehtod == null) ? null : pickupMehtod.trim());
    }
    
    public String getStorageStaff() {
        return this.storageStaff;
    }
    
    public void setStorageStaff(final String storageStaff) {
        this.storageStaff = ((storageStaff == null) ? null : storageStaff.trim());
    }
    
    public Double getWeightFee() {
        return this.weightFee;
    }
    
    public void setWeightFee(final Double weightFee) {
        this.weightFee = weightFee;
    }
    
    public Double getVolumeFee() {
        return this.volumeFee;
    }
    
    public void setVolumeFee(final Double volumeFee) {
        this.volumeFee = volumeFee;
    }
    
    public Double getTaxFee() {
        return this.taxFee;
    }
    
    public void setTaxFee(final Double taxFee) {
        this.taxFee = taxFee;
    }
    
    public Integer getPickUpFee() {
        return this.pickUpFee;
    }
    
    public void setPickUpFee(final Integer pickUpFee) {
        this.pickUpFee = pickUpFee;
    }
    
    public Double getTotalFee() {
        return this.totalFee;
    }
    
    public void setTotalFee(final Double totalFee) {
        this.totalFee = totalFee;
    }
    
    public Double getTotalVolume() {
        return this.totalVolume;
    }
    
    public void setTotalVolume(final Double totalVolume) {
        this.totalVolume = totalVolume;
    }
    
    public Double getTotalWeight() {
        return this.totalWeight;
    }
    
    public void setTotalWeight(final Double totalWeight) {
        this.totalWeight = totalWeight;
    }
    
    public Double getTotalValue() {
        return this.totalValue;
    }
    
    public void setTotalValue(final Double totalValue) {
        this.totalValue = totalValue;
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
    
    public String getShippingMethod() {
        return this.shippingMethod;
    }
    
    public void setShippingMethod(final String shippingMethod) {
        this.shippingMethod = ((shippingMethod == null) ? null : shippingMethod.trim());
    }
    
    public String getStorage() {
        return this.storage;
    }
    
    public void setStorage(final String storage) {
        this.storage = ((storage == null) ? null : storage.trim());
    }
    
    public String getStaff() {
        return this.staff;
    }
    
    public void setStaff(final String staff) {
        this.staff = ((staff == null) ? null : staff.trim());
    }
    
    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(final String customerName) {
        this.customerName = ((customerName == null) ? null : customerName.trim());
    }
}
