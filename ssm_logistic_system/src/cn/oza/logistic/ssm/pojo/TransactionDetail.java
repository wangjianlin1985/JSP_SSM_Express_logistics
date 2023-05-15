// 
// 
// 

package cn.oza.logistic.ssm.pojo;

public class TransactionDetail
{
    private Long transactionDetailId;
    private Long orderDetailId;
    private Long length;
    private Long width;
    private Long height;
    private Double volume;
    private Double weight;
    
    public Long getTransactionDetailId() {
        return this.transactionDetailId;
    }
    
    public void setTransactionDetailId(final Long transactionDetailId) {
        this.transactionDetailId = transactionDetailId;
    }
    
    public Long getOrderDetailId() {
        return this.orderDetailId;
    }
    
    public void setOrderDetailId(final Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }
    
    public Long getLength() {
        return this.length;
    }
    
    public void setLength(final Long length) {
        this.length = length;
    }
    
    public Long getWidth() {
        return this.width;
    }
    
    public void setWidth(final Long width) {
        this.width = width;
    }
    
    public Long getHeight() {
        return this.height;
    }
    
    public void setHeight(final Long height) {
        this.height = height;
    }
    
    public Double getVolume() {
        return this.volume;
    }
    
    public void setVolume(final Double volume) {
        this.volume = volume;
    }
    
    public Double getWeight() {
        return this.weight;
    }
    
    public void setWeight(final Double weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "TransactionDetail{transactionDetailId=" + this.transactionDetailId + ", orderDetailId=" + this.orderDetailId + ", length=" + this.length + ", width=" + this.width + ", height=" + this.height + ", volume=" + this.volume + ", weight=" + this.weight + '}';
    }
}
