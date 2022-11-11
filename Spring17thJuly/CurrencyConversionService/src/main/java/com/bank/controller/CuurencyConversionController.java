package com.bank.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.CurrencyConversion;
import com.bank.service.CurrencyConversionService;

@RestController
@RequestMapping("/currency-conversion-service")
public class CuurencyConversionController {

	@Autowired
	private CurrencyConversionService service;
	
	@RequestMapping("/from/{currencyfrom}/to/{currencyto}/quantity/{quantity}")
	public ResponseEntity<CurrencyConversion> getTotalAmount(@PathVariable String currencyfrom, @PathVariable String currencyto, @PathVariable Long quantity) {
		
		CurrencyConversion response = service.getTotalAmount(currencyfrom, currencyto, quantity);
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.add("CJC","Pune");
		return new ResponseEntity<CurrencyConversion>(response,headers, HttpStatus.CREATED);
	}
}
