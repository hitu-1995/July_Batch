package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Product;
import com.app.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
	private ProductService productService;
    
	@RequestMapping("/")
	public List<Product>getAllProducts()
	{
		return productService.getAllProduct();
	}
}
