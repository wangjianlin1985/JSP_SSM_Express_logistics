// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.Objects;

public class OrderDetail
{
    private Long orderDetailId;
    private Long orderId;
    private String goodsName;
    private Integer goodsNumber;
    private Long goodsUnit;
    private Long goodsUnitPrice;
    private Long goodsTotal;
    private String goodsRemark;
    
    public Long getOrderDetailId() {
        return this.orderDetailId;
    }
    
    public void setOrderDetailId(final Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }
    
    public Long getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
    }
    
    public String getGoodsName() {
        return this.goodsName;
    }
    
    public void setGoodsName(final String goodsName) {
        this.goodsName = ((goodsName == null) ? null : goodsName.trim());
    }
    
    public Integer getGoodsNumber() {
        return this.goodsNumber;
    }
    
    public void setGoodsNumber(final Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }
    
    public Long getGoodsUnit() {
        return this.goodsUnit;
    }
    
    public void setGoodsUnit(final Long goodsUnit) {
        this.goodsUnit = goodsUnit;
    }
    
    public Long getGoodsUnitPrice() {
        return this.goodsUnitPrice;
    }
    
    public void setGoodsUnitPrice(final Long goodsUnitPrice) {
        this.goodsUnitPrice = goodsUnitPrice;
    }
    
    public Long getGoodsTotal() {
        return this.goodsTotal;
    }
    
    public void setGoodsTotal(final Long goodsTotal) {
        this.goodsTotal = goodsTotal;
    }
    
    public String getGoodsRemark() {
        return this.goodsRemark;
    }
    
    public void setGoodsRemark(final String goodsRemark) {
        this.goodsRemark = ((goodsRemark == null) ? null : goodsRemark.trim());
    }
    
    @Override
    public String toString() {
        return "OrderDetail{orderDetailId=" + this.orderDetailId + ", orderId=" + this.orderId + ", goodsName='" + this.goodsName + '\'' + ", goodsNumber=" + this.goodsNumber + ", goodsUnit=" + this.goodsUnit + ", goodsUnitPrice=" + this.goodsUnitPrice + ", goodsTotal=" + this.goodsTotal + ", goodsRemark='" + this.goodsRemark + '\'' + '}';
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final OrderDetail that = (OrderDetail)o;
        return Objects.equals(this.orderDetailId, that.orderDetailId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.orderDetailId);
    }
}
