package com.bank.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bank.model.CurrencyConversion;
import com.bank.service.CurrencyConversionService;

@Service
public class CurrencyConversionServiceImpl implements CurrencyConversionService{

	@Override
	public CurrencyConversion getTotalAmount(String from, String to, Long Quantity) {
		
		String url= "http://localhost:8000/forex-service/from/{from}/to/{to}";
		Map<String, String> uriVariables= new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to",to);
		ResponseEntity<CurrencyConversion> response = new RestTemplate().getForEntity(url, CurrencyConversion.class, uriVariables);
		CurrencyConversion currencyresponse = response.getBody();
		currencyresponse.setQuantity(Quantity);
		currencyresponse.setTotalamount(currencyresponse.getConversion()*Quantity);
		return currencyresponse;
	}

}
