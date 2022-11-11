package com.ecommerce.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.ProductRepository;
import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllproducts() {
		
		return productRepository.findAll();
	}

	@Override
	public List<Product> getAllProductsByName(String productName) {
		
		return productRepository.findByProductName(productName);
	}

	@Override
	public Product getAllProductsById(Integer productId) {
		
		Optional<Product> product= productRepository.findById(productId);
		return product.get();
	}

}
