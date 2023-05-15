// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.List;

public class Transaction
{
    private Long transactionId;
    private Long orderId;
    private Long userId;
    private Integer pickUpFee;
    private Double volumeRate;
    private Double weightRate;
    private Long storageId;
    private String totalFee;
    private List<TransactionDetail> transactionDetails;
    
    public List<TransactionDetail> getTransactionDetails() {
        return this.transactionDetails;
    }
    
    public void setTransactionDetails(final List<TransactionDetail> transactionDetails) {
        this.transactionDetails = transactionDetails;
    }
    
    public Long getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(final Long transactionId) {
        this.transactionId = transactionId;
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
    
    public Integer getPickUpFee() {
        return this.pickUpFee;
    }
    
    public void setPickUpFee(final Integer pickUpFee) {
        this.pickUpFee = pickUpFee;
    }
    
    public Double getVolumeRate() {
        return this.volumeRate;
    }
    
    public void setVolumeRate(final Double volumeRate) {
        this.volumeRate = volumeRate;
    }
    
    public Double getWeightRate() {
        return this.weightRate;
    }
    
    public void setWeightRate(final Double weightRate) {
        this.weightRate = weightRate;
    }
    
    public Long getStorageId() {
        return this.storageId;
    }
    
    public void setStorageId(final Long storageId) {
        this.storageId = storageId;
    }
    
    public String getTotalFee() {
        return this.totalFee;
    }
    
    public void setTotalFee(final String totalFee) {
        this.totalFee = ((totalFee == null) ? null : totalFee.trim());
    }
    
    @Override
    public String toString() {
        return "Transaction{transactionId=" + this.transactionId + ", orderId=" + this.orderId + ", userId=" + this.userId + ", pickUpFee=" + this.pickUpFee + ", volumeRate=" + this.volumeRate + ", weightRate=" + this.weightRate + ", storageId=" + this.storageId + ", totalFee='" + this.totalFee + '\'' + ", transactionDetails=" + this.transactionDetails + '}';
    }
}
