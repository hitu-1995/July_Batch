package com.cjc.ecommerce.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cjc.ecommerce.dto.EcommerceOrderDTO;

@FeignClient(name = "product-service")
public interface ProductServiceProxy {

	@GetMapping("/product-service/{productId}")
	public EcommerceOrderDTO getProductData(@PathVariable int productId);
}
