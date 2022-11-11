package com.cjc.ecommerce.dto;

public class EcommerceOrderDTO {

	private int orderId;
	private Integer productId;
	private String productName;
	private Float price;

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "EcommerceOrderDTO [orderId=" + orderId + ", productId=" + productId + ", productName=" + productName
				+ ", price=" + price + "]";
	}
	
}
