package com.cjc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/products/{name}")
	public ModelAndView getProduct(@PathVariable String name) {
		
		Product product = productService.getProduct(name);
		Map<String,Product> map = new HashMap<>();
		map.put("product", product);
		ModelAndView response = new ModelAndView("success",map);
		
		return response;
	}
	
	@RequestMapping("/message")
	public ModelAndView GetMessage() {
		return new ModelAndView("success","msg","Welcome to spring MVC demo");
	}
	
}
