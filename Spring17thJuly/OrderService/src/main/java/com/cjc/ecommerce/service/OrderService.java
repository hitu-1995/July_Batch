package com.cjc.ecommerce.service;

import com.cjc.ecommerce.dto.EcommerceOrderDTO;

public interface OrderService {
	
	public EcommerceOrderDTO getOrderDetails(Integer orderId);

}
