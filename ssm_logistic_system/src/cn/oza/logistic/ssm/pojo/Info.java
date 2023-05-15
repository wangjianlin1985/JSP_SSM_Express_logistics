// 
// 
// 

package cn.oza.logistic.ssm.pojo;

public class Info
{
    private Long orderId;
    private Double totalVolume;
    private Double totalWeight;
    private Double totalValue;
    private Double taxRate;
    private Double weightFee;
    private Double volumeFee;
    private Double taxFee;
    private Double totalFee;
    
    public Long getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
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
    
    public Double getTaxRate() {
        return this.taxRate;
    }
    
    public void setTaxRate(final Double taxRate) {
        this.taxRate = taxRate;
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
    
    public Double getTotalFee() {
        return this.totalFee;
    }
    
    public void setTotalFee(final Double totalFee) {
        this.totalFee = totalFee;
    }
    
    @Override
    public String toString() {
        return "Info{orderId=" + this.orderId + ", totalVolume=" + this.totalVolume + ", totalWeight=" + this.totalWeight + ", totalValue=" + this.totalValue + ", taxRate=" + this.taxRate + ", weightFee=" + this.weightFee + ", volumeFee=" + this.volumeFee + ", taxFee=" + this.taxFee + ", totalFee=" + this.totalFee + '}';
    }
}
