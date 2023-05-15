// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class ExportExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public ExportExample() {
        this.oredCriteria = new ArrayList<Criteria>();
    }
    
    public void setOrderByClause(final String orderByClause) {
        this.orderByClause = orderByClause;
    }
    
    public String getOrderByClause() {
        return this.orderByClause;
    }
    
    public void setDistinct(final boolean distinct) {
        this.distinct = distinct;
    }
    
    public boolean isDistinct() {
        return this.distinct;
    }
    
    public List<Criteria> getOredCriteria() {
        return this.oredCriteria;
    }
    
    public void or(final Criteria criteria) {
        this.oredCriteria.add(criteria);
    }
    
    public Criteria or() {
        final Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }
    
    public Criteria createCriteria() {
        final Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }
        return criteria;
    }
    
    protected Criteria createCriteriaInternal() {
        final Criteria criteria = new Criteria();
        return criteria;
    }
    
    public void clear() {
        this.oredCriteria.clear();
        this.orderByClause = null;
        this.distinct = false;
    }
    
    public static class Criteria extends GeneratedCriteria
    {
    }
    
    protected abstract static class GeneratedCriteria
    {
        protected List<Criterion> criteria;
        
        protected GeneratedCriteria() {
            this.criteria = new ArrayList<Criterion>();
        }
        
        public boolean isValid() {
            return this.criteria.size() > 0;
        }
        
        public List<Criterion> getAllCriteria() {
            return this.criteria;
        }
        
        public List<Criterion> getCriteria() {
            return this.criteria;
        }
        
        protected void addCriterion(final String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            this.criteria.add(new Criterion(condition));
        }
        
        protected void addCriterion(final String condition, final Object value, final String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            this.criteria.add(new Criterion(condition, value));
        }
        
        protected void addCriterion(final String condition, final Object value1, final Object value2, final String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            this.criteria.add(new Criterion(condition, value1, value2));
        }
        
        public Criteria andOrderIdIsNull() {
            this.addCriterion("order_id is null");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdIsNotNull() {
            this.addCriterion("order_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdEqualTo(final Long value) {
            this.addCriterion("order_id =", value, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdNotEqualTo(final Long value) {
            this.addCriterion("order_id <>", value, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdGreaterThan(final Long value) {
            this.addCriterion("order_id >", value, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("order_id >=", value, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdLessThan(final Long value) {
            this.addCriterion("order_id <", value, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("order_id <=", value, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdIn(final List<Long> values) {
            this.addCriterion("order_id in", values, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdNotIn(final List<Long> values) {
            this.addCriterion("order_id not in", values, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdBetween(final Long value1, final Long value2) {
            this.addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andAreaIsNull() {
            this.addCriterion("area is null");
            return (Criteria)this;
        }
        
        public Criteria andAreaIsNotNull() {
            this.addCriterion("area is not null");
            return (Criteria)this;
        }
        
        public Criteria andAreaEqualTo(final String value) {
            this.addCriterion("area =", value, "area");
            return (Criteria)this;
        }
        
        public Criteria andAreaNotEqualTo(final String value) {
            this.addCriterion("area <>", value, "area");
            return (Criteria)this;
        }
        
        public Criteria andAreaGreaterThan(final String value) {
            this.addCriterion("area >", value, "area");
            return (Criteria)this;
        }
        
        public Criteria andAreaGreaterThanOrEqualTo(final String value) {
            this.addCriterion("area >=", value, "area");
            return (Criteria)this;
        }
        
        public Criteria andAreaLessThan(final String value) {
            this.addCriterion("area <", value, "area");
            return (Criteria)this;
        }
        
        public Criteria andAreaLessThanOrEqualTo(final String value) {
            this.addCriterion("area <=", value, "area");
            return (Criteria)this;
        }
        
        public Criteria andAreaLike(final String value) {
            this.addCriterion("area like", value, "area");
            return (Criteria)this;
        }
        
        public Criteria andAreaNotLike(final String value) {
            this.addCriterion("area not like", value, "area");
            return (Criteria)this;
        }
        
        public Criteria andAreaIn(final List<String> values) {
            this.addCriterion("area in", values, "area");
            return (Criteria)this;
        }
        
        public Criteria andAreaNotIn(final List<String> values) {
            this.addCriterion("area not in", values, "area");
            return (Criteria)this;
        }
        
        public Criteria andAreaBetween(final String value1, final String value2) {
            this.addCriterion("area between", value1, value2, "area");
            return (Criteria)this;
        }
        
        public Criteria andAreaNotBetween(final String value1, final String value2) {
            this.addCriterion("area not between", value1, value2, "area");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressIsNull() {
            this.addCriterion("shipping_address is null");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressIsNotNull() {
            this.addCriterion("shipping_address is not null");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressEqualTo(final String value) {
            this.addCriterion("shipping_address =", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressNotEqualTo(final String value) {
            this.addCriterion("shipping_address <>", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressGreaterThan(final String value) {
            this.addCriterion("shipping_address >", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressGreaterThanOrEqualTo(final String value) {
            this.addCriterion("shipping_address >=", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressLessThan(final String value) {
            this.addCriterion("shipping_address <", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressLessThanOrEqualTo(final String value) {
            this.addCriterion("shipping_address <=", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressLike(final String value) {
            this.addCriterion("shipping_address like", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressNotLike(final String value) {
            this.addCriterion("shipping_address not like", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressIn(final List<String> values) {
            this.addCriterion("shipping_address in", values, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressNotIn(final List<String> values) {
            this.addCriterion("shipping_address not in", values, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressBetween(final String value1, final String value2) {
            this.addCriterion("shipping_address between", value1, value2, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressNotBetween(final String value1, final String value2) {
            this.addCriterion("shipping_address not between", value1, value2, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andPaymentIsNull() {
            this.addCriterion("payment is null");
            return (Criteria)this;
        }
        
        public Criteria andPaymentIsNotNull() {
            this.addCriterion("payment is not null");
            return (Criteria)this;
        }
        
        public Criteria andPaymentEqualTo(final String value) {
            this.addCriterion("payment =", value, "payment");
            return (Criteria)this;
        }
        
        public Criteria andPaymentNotEqualTo(final String value) {
            this.addCriterion("payment <>", value, "payment");
            return (Criteria)this;
        }
        
        public Criteria andPaymentGreaterThan(final String value) {
            this.addCriterion("payment >", value, "payment");
            return (Criteria)this;
        }
        
        public Criteria andPaymentGreaterThanOrEqualTo(final String value) {
            this.addCriterion("payment >=", value, "payment");
            return (Criteria)this;
        }
        
        public Criteria andPaymentLessThan(final String value) {
            this.addCriterion("payment <", value, "payment");
            return (Criteria)this;
        }
        
        public Criteria andPaymentLessThanOrEqualTo(final String value) {
            this.addCriterion("payment <=", value, "payment");
            return (Criteria)this;
        }
        
        public Criteria andPaymentLike(final String value) {
            this.addCriterion("payment like", value, "payment");
            return (Criteria)this;
        }
        
        public Criteria andPaymentNotLike(final String value) {
            this.addCriterion("payment not like", value, "payment");
            return (Criteria)this;
        }
        
        public Criteria andPaymentIn(final List<String> values) {
            this.addCriterion("payment in", values, "payment");
            return (Criteria)this;
        }
        
        public Criteria andPaymentNotIn(final List<String> values) {
            this.addCriterion("payment not in", values, "payment");
            return (Criteria)this;
        }
        
        public Criteria andPaymentBetween(final String value1, final String value2) {
            this.addCriterion("payment between", value1, value2, "payment");
            return (Criteria)this;
        }
        
        public Criteria andPaymentNotBetween(final String value1, final String value2) {
            this.addCriterion("payment not between", value1, value2, "payment");
            return (Criteria)this;
        }
        
        public Criteria andPickupMehtodIsNull() {
            this.addCriterion("pickup_mehtod is null");
            return (Criteria)this;
        }
        
        public Criteria andPickupMehtodIsNotNull() {
            this.addCriterion("pickup_mehtod is not null");
            return (Criteria)this;
        }
        
        public Criteria andPickupMehtodEqualTo(final String value) {
            this.addCriterion("pickup_mehtod =", value, "pickupMehtod");
            return (Criteria)this;
        }
        
        public Criteria andPickupMehtodNotEqualTo(final String value) {
            this.addCriterion("pickup_mehtod <>", value, "pickupMehtod");
            return (Criteria)this;
        }
        
        public Criteria andPickupMehtodGreaterThan(final String value) {
            this.addCriterion("pickup_mehtod >", value, "pickupMehtod");
            return (Criteria)this;
        }
        
        public Criteria andPickupMehtodGreaterThanOrEqualTo(final String value) {
            this.addCriterion("pickup_mehtod >=", value, "pickupMehtod");
            return (Criteria)this;
        }
        
        public Criteria andPickupMehtodLessThan(final String value) {
            this.addCriterion("pickup_mehtod <", value, "pickupMehtod");
            return (Criteria)this;
        }
        
        public Criteria andPickupMehtodLessThanOrEqualTo(final String value) {
            this.addCriterion("pickup_mehtod <=", value, "pickupMehtod");
            return (Criteria)this;
        }
        
        public Criteria andPickupMehtodLike(final String value) {
            this.addCriterion("pickup_mehtod like", value, "pickupMehtod");
            return (Criteria)this;
        }
        
        public Criteria andPickupMehtodNotLike(final String value) {
            this.addCriterion("pickup_mehtod not like", value, "pickupMehtod");
            return (Criteria)this;
        }
        
        public Criteria andPickupMehtodIn(final List<String> values) {
            this.addCriterion("pickup_mehtod in", values, "pickupMehtod");
            return (Criteria)this;
        }
        
        public Criteria andPickupMehtodNotIn(final List<String> values) {
            this.addCriterion("pickup_mehtod not in", values, "pickupMehtod");
            return (Criteria)this;
        }
        
        public Criteria andPickupMehtodBetween(final String value1, final String value2) {
            this.addCriterion("pickup_mehtod between", value1, value2, "pickupMehtod");
            return (Criteria)this;
        }
        
        public Criteria andPickupMehtodNotBetween(final String value1, final String value2) {
            this.addCriterion("pickup_mehtod not between", value1, value2, "pickupMehtod");
            return (Criteria)this;
        }
        
        public Criteria andStorageStaffIsNull() {
            this.addCriterion("storage_staff is null");
            return (Criteria)this;
        }
        
        public Criteria andStorageStaffIsNotNull() {
            this.addCriterion("storage_staff is not null");
            return (Criteria)this;
        }
        
        public Criteria andStorageStaffEqualTo(final String value) {
            this.addCriterion("storage_staff =", value, "storageStaff");
            return (Criteria)this;
        }
        
        public Criteria andStorageStaffNotEqualTo(final String value) {
            this.addCriterion("storage_staff <>", value, "storageStaff");
            return (Criteria)this;
        }
        
        public Criteria andStorageStaffGreaterThan(final String value) {
            this.addCriterion("storage_staff >", value, "storageStaff");
            return (Criteria)this;
        }
        
        public Criteria andStorageStaffGreaterThanOrEqualTo(final String value) {
            this.addCriterion("storage_staff >=", value, "storageStaff");
            return (Criteria)this;
        }
        
        public Criteria andStorageStaffLessThan(final String value) {
            this.addCriterion("storage_staff <", value, "storageStaff");
            return (Criteria)this;
        }
        
        public Criteria andStorageStaffLessThanOrEqualTo(final String value) {
            this.addCriterion("storage_staff <=", value, "storageStaff");
            return (Criteria)this;
        }
        
        public Criteria andStorageStaffLike(final String value) {
            this.addCriterion("storage_staff like", value, "storageStaff");
            return (Criteria)this;
        }
        
        public Criteria andStorageStaffNotLike(final String value) {
            this.addCriterion("storage_staff not like", value, "storageStaff");
            return (Criteria)this;
        }
        
        public Criteria andStorageStaffIn(final List<String> values) {
            this.addCriterion("storage_staff in", values, "storageStaff");
            return (Criteria)this;
        }
        
        public Criteria andStorageStaffNotIn(final List<String> values) {
            this.addCriterion("storage_staff not in", values, "storageStaff");
            return (Criteria)this;
        }
        
        public Criteria andStorageStaffBetween(final String value1, final String value2) {
            this.addCriterion("storage_staff between", value1, value2, "storageStaff");
            return (Criteria)this;
        }
        
        public Criteria andStorageStaffNotBetween(final String value1, final String value2) {
            this.addCriterion("storage_staff not between", value1, value2, "storageStaff");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeIsNull() {
            this.addCriterion("weight_fee is null");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeIsNotNull() {
            this.addCriterion("weight_fee is not null");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeEqualTo(final Double value) {
            this.addCriterion("weight_fee =", value, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeNotEqualTo(final Double value) {
            this.addCriterion("weight_fee <>", value, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeGreaterThan(final Double value) {
            this.addCriterion("weight_fee >", value, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("weight_fee >=", value, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeLessThan(final Double value) {
            this.addCriterion("weight_fee <", value, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeLessThanOrEqualTo(final Double value) {
            this.addCriterion("weight_fee <=", value, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeIn(final List<Double> values) {
            this.addCriterion("weight_fee in", values, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeNotIn(final List<Double> values) {
            this.addCriterion("weight_fee not in", values, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeBetween(final Double value1, final Double value2) {
            this.addCriterion("weight_fee between", value1, value2, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeNotBetween(final Double value1, final Double value2) {
            this.addCriterion("weight_fee not between", value1, value2, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeIsNull() {
            this.addCriterion("volume_fee is null");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeIsNotNull() {
            this.addCriterion("volume_fee is not null");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeEqualTo(final Double value) {
            this.addCriterion("volume_fee =", value, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeNotEqualTo(final Double value) {
            this.addCriterion("volume_fee <>", value, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeGreaterThan(final Double value) {
            this.addCriterion("volume_fee >", value, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("volume_fee >=", value, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeLessThan(final Double value) {
            this.addCriterion("volume_fee <", value, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeLessThanOrEqualTo(final Double value) {
            this.addCriterion("volume_fee <=", value, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeIn(final List<Double> values) {
            this.addCriterion("volume_fee in", values, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeNotIn(final List<Double> values) {
            this.addCriterion("volume_fee not in", values, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeBetween(final Double value1, final Double value2) {
            this.addCriterion("volume_fee between", value1, value2, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeNotBetween(final Double value1, final Double value2) {
            this.addCriterion("volume_fee not between", value1, value2, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeIsNull() {
            this.addCriterion("tax_fee is null");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeIsNotNull() {
            this.addCriterion("tax_fee is not null");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeEqualTo(final Double value) {
            this.addCriterion("tax_fee =", value, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeNotEqualTo(final Double value) {
            this.addCriterion("tax_fee <>", value, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeGreaterThan(final Double value) {
            this.addCriterion("tax_fee >", value, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("tax_fee >=", value, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeLessThan(final Double value) {
            this.addCriterion("tax_fee <", value, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeLessThanOrEqualTo(final Double value) {
            this.addCriterion("tax_fee <=", value, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeIn(final List<Double> values) {
            this.addCriterion("tax_fee in", values, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeNotIn(final List<Double> values) {
            this.addCriterion("tax_fee not in", values, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeBetween(final Double value1, final Double value2) {
            this.addCriterion("tax_fee between", value1, value2, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeNotBetween(final Double value1, final Double value2) {
            this.addCriterion("tax_fee not between", value1, value2, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeIsNull() {
            this.addCriterion("pick_up_fee is null");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeIsNotNull() {
            this.addCriterion("pick_up_fee is not null");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeEqualTo(final Integer value) {
            this.addCriterion("pick_up_fee =", value, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeNotEqualTo(final Integer value) {
            this.addCriterion("pick_up_fee <>", value, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeGreaterThan(final Integer value) {
            this.addCriterion("pick_up_fee >", value, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("pick_up_fee >=", value, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeLessThan(final Integer value) {
            this.addCriterion("pick_up_fee <", value, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeLessThanOrEqualTo(final Integer value) {
            this.addCriterion("pick_up_fee <=", value, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeIn(final List<Integer> values) {
            this.addCriterion("pick_up_fee in", values, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeNotIn(final List<Integer> values) {
            this.addCriterion("pick_up_fee not in", values, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeBetween(final Integer value1, final Integer value2) {
            this.addCriterion("pick_up_fee between", value1, value2, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("pick_up_fee not between", value1, value2, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeIsNull() {
            this.addCriterion("total_fee is null");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeIsNotNull() {
            this.addCriterion("total_fee is not null");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeEqualTo(final Double value) {
            this.addCriterion("total_fee =", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeNotEqualTo(final Double value) {
            this.addCriterion("total_fee <>", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeGreaterThan(final Double value) {
            this.addCriterion("total_fee >", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("total_fee >=", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeLessThan(final Double value) {
            this.addCriterion("total_fee <", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeLessThanOrEqualTo(final Double value) {
            this.addCriterion("total_fee <=", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeIn(final List<Double> values) {
            this.addCriterion("total_fee in", values, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeNotIn(final List<Double> values) {
            this.addCriterion("total_fee not in", values, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeBetween(final Double value1, final Double value2) {
            this.addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeNotBetween(final Double value1, final Double value2) {
            this.addCriterion("total_fee not between", value1, value2, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeIsNull() {
            this.addCriterion("total_volume is null");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeIsNotNull() {
            this.addCriterion("total_volume is not null");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeEqualTo(final Double value) {
            this.addCriterion("total_volume =", value, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeNotEqualTo(final Double value) {
            this.addCriterion("total_volume <>", value, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeGreaterThan(final Double value) {
            this.addCriterion("total_volume >", value, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("total_volume >=", value, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeLessThan(final Double value) {
            this.addCriterion("total_volume <", value, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeLessThanOrEqualTo(final Double value) {
            this.addCriterion("total_volume <=", value, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeIn(final List<Double> values) {
            this.addCriterion("total_volume in", values, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeNotIn(final List<Double> values) {
            this.addCriterion("total_volume not in", values, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeBetween(final Double value1, final Double value2) {
            this.addCriterion("total_volume between", value1, value2, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeNotBetween(final Double value1, final Double value2) {
            this.addCriterion("total_volume not between", value1, value2, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightIsNull() {
            this.addCriterion("total_weight is null");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightIsNotNull() {
            this.addCriterion("total_weight is not null");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightEqualTo(final Double value) {
            this.addCriterion("total_weight =", value, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightNotEqualTo(final Double value) {
            this.addCriterion("total_weight <>", value, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightGreaterThan(final Double value) {
            this.addCriterion("total_weight >", value, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("total_weight >=", value, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightLessThan(final Double value) {
            this.addCriterion("total_weight <", value, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightLessThanOrEqualTo(final Double value) {
            this.addCriterion("total_weight <=", value, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightIn(final List<Double> values) {
            this.addCriterion("total_weight in", values, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightNotIn(final List<Double> values) {
            this.addCriterion("total_weight not in", values, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightBetween(final Double value1, final Double value2) {
            this.addCriterion("total_weight between", value1, value2, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightNotBetween(final Double value1, final Double value2) {
            this.addCriterion("total_weight not between", value1, value2, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueIsNull() {
            this.addCriterion("total_value is null");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueIsNotNull() {
            this.addCriterion("total_value is not null");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueEqualTo(final Double value) {
            this.addCriterion("total_value =", value, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueNotEqualTo(final Double value) {
            this.addCriterion("total_value <>", value, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueGreaterThan(final Double value) {
            this.addCriterion("total_value >", value, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("total_value >=", value, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueLessThan(final Double value) {
            this.addCriterion("total_value <", value, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueLessThanOrEqualTo(final Double value) {
            this.addCriterion("total_value <=", value, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueIn(final List<Double> values) {
            this.addCriterion("total_value in", values, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueNotIn(final List<Double> values) {
            this.addCriterion("total_value not in", values, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueBetween(final Double value1, final Double value2) {
            this.addCriterion("total_value between", value1, value2, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueNotBetween(final Double value1, final Double value2) {
            this.addCriterion("total_value not between", value1, value2, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameIsNull() {
            this.addCriterion("shipping_name is null");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameIsNotNull() {
            this.addCriterion("shipping_name is not null");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameEqualTo(final String value) {
            this.addCriterion("shipping_name =", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameNotEqualTo(final String value) {
            this.addCriterion("shipping_name <>", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameGreaterThan(final String value) {
            this.addCriterion("shipping_name >", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("shipping_name >=", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameLessThan(final String value) {
            this.addCriterion("shipping_name <", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameLessThanOrEqualTo(final String value) {
            this.addCriterion("shipping_name <=", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameLike(final String value) {
            this.addCriterion("shipping_name like", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameNotLike(final String value) {
            this.addCriterion("shipping_name not like", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameIn(final List<String> values) {
            this.addCriterion("shipping_name in", values, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameNotIn(final List<String> values) {
            this.addCriterion("shipping_name not in", values, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameBetween(final String value1, final String value2) {
            this.addCriterion("shipping_name between", value1, value2, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameNotBetween(final String value1, final String value2) {
            this.addCriterion("shipping_name not between", value1, value2, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneIsNull() {
            this.addCriterion("shipping_phone is null");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneIsNotNull() {
            this.addCriterion("shipping_phone is not null");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneEqualTo(final String value) {
            this.addCriterion("shipping_phone =", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneNotEqualTo(final String value) {
            this.addCriterion("shipping_phone <>", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneGreaterThan(final String value) {
            this.addCriterion("shipping_phone >", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneGreaterThanOrEqualTo(final String value) {
            this.addCriterion("shipping_phone >=", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneLessThan(final String value) {
            this.addCriterion("shipping_phone <", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneLessThanOrEqualTo(final String value) {
            this.addCriterion("shipping_phone <=", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneLike(final String value) {
            this.addCriterion("shipping_phone like", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneNotLike(final String value) {
            this.addCriterion("shipping_phone not like", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneIn(final List<String> values) {
            this.addCriterion("shipping_phone in", values, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneNotIn(final List<String> values) {
            this.addCriterion("shipping_phone not in", values, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneBetween(final String value1, final String value2) {
            this.addCriterion("shipping_phone between", value1, value2, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneNotBetween(final String value1, final String value2) {
            this.addCriterion("shipping_phone not between", value1, value2, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingMethodIsNull() {
            this.addCriterion("shipping_method is null");
            return (Criteria)this;
        }
        
        public Criteria andShippingMethodIsNotNull() {
            this.addCriterion("shipping_method is not null");
            return (Criteria)this;
        }
        
        public Criteria andShippingMethodEqualTo(final String value) {
            this.addCriterion("shipping_method =", value, "shippingMethod");
            return (Criteria)this;
        }
        
        public Criteria andShippingMethodNotEqualTo(final String value) {
            this.addCriterion("shipping_method <>", value, "shippingMethod");
            return (Criteria)this;
        }
        
        public Criteria andShippingMethodGreaterThan(final String value) {
            this.addCriterion("shipping_method >", value, "shippingMethod");
            return (Criteria)this;
        }
        
        public Criteria andShippingMethodGreaterThanOrEqualTo(final String value) {
            this.addCriterion("shipping_method >=", value, "shippingMethod");
            return (Criteria)this;
        }
        
        public Criteria andShippingMethodLessThan(final String value) {
            this.addCriterion("shipping_method <", value, "shippingMethod");
            return (Criteria)this;
        }
        
        public Criteria andShippingMethodLessThanOrEqualTo(final String value) {
            this.addCriterion("shipping_method <=", value, "shippingMethod");
            return (Criteria)this;
        }
        
        public Criteria andShippingMethodLike(final String value) {
            this.addCriterion("shipping_method like", value, "shippingMethod");
            return (Criteria)this;
        }
        
        public Criteria andShippingMethodNotLike(final String value) {
            this.addCriterion("shipping_method not like", value, "shippingMethod");
            return (Criteria)this;
        }
        
        public Criteria andShippingMethodIn(final List<String> values) {
            this.addCriterion("shipping_method in", values, "shippingMethod");
            return (Criteria)this;
        }
        
        public Criteria andShippingMethodNotIn(final List<String> values) {
            this.addCriterion("shipping_method not in", values, "shippingMethod");
            return (Criteria)this;
        }
        
        public Criteria andShippingMethodBetween(final String value1, final String value2) {
            this.addCriterion("shipping_method between", value1, value2, "shippingMethod");
            return (Criteria)this;
        }
        
        public Criteria andShippingMethodNotBetween(final String value1, final String value2) {
            this.addCriterion("shipping_method not between", value1, value2, "shippingMethod");
            return (Criteria)this;
        }
        
        public Criteria andStorageIsNull() {
            this.addCriterion("storage is null");
            return (Criteria)this;
        }
        
        public Criteria andStorageIsNotNull() {
            this.addCriterion("storage is not null");
            return (Criteria)this;
        }
        
        public Criteria andStorageEqualTo(final String value) {
            this.addCriterion("storage =", value, "storage");
            return (Criteria)this;
        }
        
        public Criteria andStorageNotEqualTo(final String value) {
            this.addCriterion("storage <>", value, "storage");
            return (Criteria)this;
        }
        
        public Criteria andStorageGreaterThan(final String value) {
            this.addCriterion("storage >", value, "storage");
            return (Criteria)this;
        }
        
        public Criteria andStorageGreaterThanOrEqualTo(final String value) {
            this.addCriterion("storage >=", value, "storage");
            return (Criteria)this;
        }
        
        public Criteria andStorageLessThan(final String value) {
            this.addCriterion("storage <", value, "storage");
            return (Criteria)this;
        }
        
        public Criteria andStorageLessThanOrEqualTo(final String value) {
            this.addCriterion("storage <=", value, "storage");
            return (Criteria)this;
        }
        
        public Criteria andStorageLike(final String value) {
            this.addCriterion("storage like", value, "storage");
            return (Criteria)this;
        }
        
        public Criteria andStorageNotLike(final String value) {
            this.addCriterion("storage not like", value, "storage");
            return (Criteria)this;
        }
        
        public Criteria andStorageIn(final List<String> values) {
            this.addCriterion("storage in", values, "storage");
            return (Criteria)this;
        }
        
        public Criteria andStorageNotIn(final List<String> values) {
            this.addCriterion("storage not in", values, "storage");
            return (Criteria)this;
        }
        
        public Criteria andStorageBetween(final String value1, final String value2) {
            this.addCriterion("storage between", value1, value2, "storage");
            return (Criteria)this;
        }
        
        public Criteria andStorageNotBetween(final String value1, final String value2) {
            this.addCriterion("storage not between", value1, value2, "storage");
            return (Criteria)this;
        }
        
        public Criteria andStaffIsNull() {
            this.addCriterion("staff is null");
            return (Criteria)this;
        }
        
        public Criteria andStaffIsNotNull() {
            this.addCriterion("staff is not null");
            return (Criteria)this;
        }
        
        public Criteria andStaffEqualTo(final String value) {
            this.addCriterion("staff =", value, "staff");
            return (Criteria)this;
        }
        
        public Criteria andStaffNotEqualTo(final String value) {
            this.addCriterion("staff <>", value, "staff");
            return (Criteria)this;
        }
        
        public Criteria andStaffGreaterThan(final String value) {
            this.addCriterion("staff >", value, "staff");
            return (Criteria)this;
        }
        
        public Criteria andStaffGreaterThanOrEqualTo(final String value) {
            this.addCriterion("staff >=", value, "staff");
            return (Criteria)this;
        }
        
        public Criteria andStaffLessThan(final String value) {
            this.addCriterion("staff <", value, "staff");
            return (Criteria)this;
        }
        
        public Criteria andStaffLessThanOrEqualTo(final String value) {
            this.addCriterion("staff <=", value, "staff");
            return (Criteria)this;
        }
        
        public Criteria andStaffLike(final String value) {
            this.addCriterion("staff like", value, "staff");
            return (Criteria)this;
        }
        
        public Criteria andStaffNotLike(final String value) {
            this.addCriterion("staff not like", value, "staff");
            return (Criteria)this;
        }
        
        public Criteria andStaffIn(final List<String> values) {
            this.addCriterion("staff in", values, "staff");
            return (Criteria)this;
        }
        
        public Criteria andStaffNotIn(final List<String> values) {
            this.addCriterion("staff not in", values, "staff");
            return (Criteria)this;
        }
        
        public Criteria andStaffBetween(final String value1, final String value2) {
            this.addCriterion("staff between", value1, value2, "staff");
            return (Criteria)this;
        }
        
        public Criteria andStaffNotBetween(final String value1, final String value2) {
            this.addCriterion("staff not between", value1, value2, "staff");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameIsNull() {
            this.addCriterion("customer_name is null");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameIsNotNull() {
            this.addCriterion("customer_name is not null");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameEqualTo(final String value) {
            this.addCriterion("customer_name =", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameNotEqualTo(final String value) {
            this.addCriterion("customer_name <>", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameGreaterThan(final String value) {
            this.addCriterion("customer_name >", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("customer_name >=", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameLessThan(final String value) {
            this.addCriterion("customer_name <", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameLessThanOrEqualTo(final String value) {
            this.addCriterion("customer_name <=", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameLike(final String value) {
            this.addCriterion("customer_name like", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameNotLike(final String value) {
            this.addCriterion("customer_name not like", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameIn(final List<String> values) {
            this.addCriterion("customer_name in", values, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameNotIn(final List<String> values) {
            this.addCriterion("customer_name not in", values, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameBetween(final String value1, final String value2) {
            this.addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameNotBetween(final String value1, final String value2) {
            this.addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria)this;
        }
    }
    
    public static class Criterion
    {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;
        
        public String getCondition() {
            return this.condition;
        }
        
        public Object getValue() {
            return this.value;
        }
        
        public Object getSecondValue() {
            return this.secondValue;
        }
        
        public boolean isNoValue() {
            return this.noValue;
        }
        
        public boolean isSingleValue() {
            return this.singleValue;
        }
        
        public boolean isBetweenValue() {
            return this.betweenValue;
        }
        
        public boolean isListValue() {
            return this.listValue;
        }
        
        public String getTypeHandler() {
            return this.typeHandler;
        }
        
        protected Criterion(final String condition) {
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }
        
        protected Criterion(final String condition, final Object value, final String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List) {
                this.listValue = true;
            }
            else {
                this.singleValue = true;
            }
        }
        
        protected Criterion(final String condition, final Object value) {
            this(condition, value, null);
        }
        
        protected Criterion(final String condition, final Object value, final Object secondValue, final String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }
        
        protected Criterion(final String condition, final Object value, final Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
