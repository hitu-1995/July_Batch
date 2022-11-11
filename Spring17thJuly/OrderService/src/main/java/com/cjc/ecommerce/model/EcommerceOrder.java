package com.cjc.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EcommerceOrder {
	
	@Id
	private int orderId;
	private Integer productId;
	
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
	

}
