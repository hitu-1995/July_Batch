package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.configuration.Configuration;
import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@RestController
@RequestMapping("/product-service")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private Configuration config;
	
	@RequestMapping("/products")
	public List<Product> getProducts(){
		List<Product> product = productService.getAllproducts();
		product.forEach(System.out::println);
		return  product;
	}
	
//	@RequestMapping("/{productName}")
//	public List<Product> getProductsByName(@PathVariable String productName){
//		return productService.getAllProductsByName(productName);
//		
//	}
	
	@RequestMapping("/{productId}")
	public Product getProductsById(@PathVariable Integer productId){
		System.out.println("Product Service running on port number: "+environment.getProperty("local.server.port"));
		return productService.getAllProductsById(productId);
		
	}
	
	@GetMapping("/config")
	public Configuration getCOnfig() {
		//return "Product Microservice configuration: Minimum Pagination = "+config.getMinimumPagination()+""+;
		return config;
	}
}
