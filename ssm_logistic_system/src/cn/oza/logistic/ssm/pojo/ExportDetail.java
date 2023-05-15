// 
// 
// 

package cn.oza.logistic.ssm.pojo;

public class ExportDetail
{
    private String goodsName;
    private Integer goodsNumber;
    private String goodsUnit;
    private Long length;
    private Long width;
    private Long height;
    private Double volume;
    private Double weight;
    private Long goodsTotal;
    private Long orderId;
    
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
    
    public String getGoodsUnit() {
        return this.goodsUnit;
    }
    
    public void setGoodsUnit(final String goodsUnit) {
        this.goodsUnit = ((goodsUnit == null) ? null : goodsUnit.trim());
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
    
    public Long getGoodsTotal() {
        return this.goodsTotal;
    }
    
    public void setGoodsTotal(final Long goodsTotal) {
        this.goodsTotal = goodsTotal;
    }
    
    public Long getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
    }
}
