package com.fruit.web.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOrderDetail<M extends BaseOrderDetail<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setOrderId(java.lang.String orderId) {
		set("order_id", orderId);
	}

	public java.lang.String getOrderId() {
		return getStr("order_id");
	}

	public void setProductId(java.lang.Integer productId) {
		set("product_id", productId);
	}

	public java.lang.Integer getProductId() {
		return getInt("product_id");
	}

	public void setProductStandardId(java.lang.Integer productStandardId) {
		set("product_standard_id", productStandardId);
	}

	public java.lang.Integer getProductStandardId() {
		return getInt("product_standard_id");
	}

	public void setProductName(java.lang.String productName) {
		set("product_name", productName);
	}

	public java.lang.String getProductName() {
		return getStr("product_name");
	}

	public void setProductStandardName(java.lang.String productStandardName) {
		set("product_standard_name", productStandardName);
	}

	public java.lang.String getProductStandardName() {
		return getStr("product_standard_name");
	}

	public void setFruitType(java.lang.String fruitType) {
		set("fruit_type", fruitType);
	}

	public java.lang.String getFruitType() {
		return getStr("fruit_type");
	}

	public void setMeasureUnit(java.lang.String measureUnit) {
		set("measure_unit", measureUnit);
	}

	public java.lang.String getMeasureUnit() {
		return getStr("measure_unit");
	}

	public void setNum(java.lang.Integer num) {
		set("num", num);
	}

	public java.lang.Integer getNum() {
		return getInt("num");
	}

	public void setOriginalPrice(java.math.BigDecimal originalPrice) {
		set("original_price", originalPrice);
	}

	public java.math.BigDecimal getOriginalPrice() {
		return get("original_price");
	}

	public void setSellPrice(java.math.BigDecimal sellPrice) {
		set("sell_price", sellPrice);
	}

	public java.math.BigDecimal getSellPrice() {
		return get("sell_price");
	}

	public void setSendGoodsPay(java.math.BigDecimal sendGoodsPay) {
		set("send_goods_pay", sendGoodsPay);
	}

	public java.math.BigDecimal getSendGoodsPay() {
		return get("send_goods_pay");
	}

	public void setPackagePay(java.math.BigDecimal packagePay) {
		set("package_pay", packagePay);
	}

	public java.math.BigDecimal getPackagePay() {
		return get("package_pay");
	}

	public void setTotalPay(java.math.BigDecimal totalPay) {
		set("total_pay", totalPay);
	}

	public java.math.BigDecimal getTotalPay() {
		return get("total_pay");
	}

	public void setBuyUid(java.lang.Integer buyUid) {
		set("buy_uid", buyUid);
	}

	public java.lang.Integer getBuyUid() {
		return getInt("buy_uid");
	}

	public void setBuyRemark(java.lang.String buyRemark) {
		set("buy_remark", buyRemark);
	}

	public java.lang.String getBuyRemark() {
		return getStr("buy_remark");
	}

	public void setCancelReason(java.lang.String cancelReason) {
		set("cancel_reason", cancelReason);
	}

	public java.lang.String getCancelReason() {
		return getStr("cancel_reason");
	}

	public void setCancelTime(java.util.Date cancelTime) {
		set("cancel_time", cancelTime);
	}

	public java.util.Date getCancelTime() {
		return get("cancel_time");
	}

	public void setSendGoodsTime(java.util.Date sendGoodsTime) {
		set("send_goods_time", sendGoodsTime);
	}

	public java.util.Date getSendGoodsTime() {
		return get("send_goods_time");
	}

	public void setTakeGoodsTime(java.util.Date takeGoodsTime) {
		set("take_goods_time", takeGoodsTime);
	}

	public java.util.Date getTakeGoodsTime() {
		return get("take_goods_time");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

}
