package com.cjc.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.ecommerce.dto.EcommerceOrderDTO;
import com.cjc.ecommerce.model.EcommerceOrder;
import com.cjc.ecommerce.service.OrderService;

@RestController
@RequestMapping("/order-service")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/{orderId}")
	public EcommerceOrderDTO getOrderDetails(@PathVariable Integer orderId) {
		
		return orderService.getOrderDetails(orderId);
	}
}
