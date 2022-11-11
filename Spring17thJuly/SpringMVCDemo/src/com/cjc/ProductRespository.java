package com.cjc;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRespository {
	
	public Product getProduct(String name) {
		Product product = new Product();
		product.setName("Mobile");
		product.setPrice(10.5f);
		return product;
	}

}
