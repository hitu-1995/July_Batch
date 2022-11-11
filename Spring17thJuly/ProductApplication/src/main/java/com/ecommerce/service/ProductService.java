package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Product;

public interface ProductService {
	
	public List<Product> getAllproducts();
	
	public List<Product> getAllProductsByName(String productName);
	
	public Product getAllProductsById(Integer productId);

}
