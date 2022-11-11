package com.cjc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRespository productRepository;
	
	public Product getProduct(String name) {
		return productRepository.getProduct(name);
	}
	

}
