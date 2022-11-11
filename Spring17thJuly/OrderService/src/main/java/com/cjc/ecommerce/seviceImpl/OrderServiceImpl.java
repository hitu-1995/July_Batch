package com.cjc.ecommerce.seviceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cjc.ecommerce.dao.OrderRepository;
import com.cjc.ecommerce.dto.EcommerceOrderDTO;
import com.cjc.ecommerce.model.EcommerceOrder;
import com.cjc.ecommerce.proxy.ProductServiceProxy;
import com.cjc.ecommerce.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductServiceProxy productServiceProxy;

	@Override
	public EcommerceOrderDTO getOrderDetails(Integer orderId) {
		Optional<EcommerceOrder> order= orderRepository.findById(orderId);
		System.out.println("Order Data from order DB"+order.get().getOrderId()+"...."+order.get().getProductId());
		Integer productid = order.get().getProductId();
		System.out.println("product id from order DB"+productid);
//		String url= "http://localhost:9000/products/{productId}";
		
//		Map<String, Integer> uriVariables= new HashMap<>();
//		uriVariables.put("productId", productid);
		
//		ResponseEntity<EcommerceOrderDTO> response = new RestTemplate().getForEntity(url, EcommerceOrderDTO.class, uriVariables);
		
		//EcommerceOrderDTO orderResponse = response.getBody();
		EcommerceOrderDTO orderResponse = productServiceProxy.getProductData(productid);
		orderResponse.setOrderId(orderId);
		System.out.println("product service response"+orderResponse.toString());
		
		return orderResponse;
		
	}

}
