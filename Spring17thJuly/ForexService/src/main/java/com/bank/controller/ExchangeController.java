package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Exchange;
import com.bank.service.ExchangeService;

@RestController
@RequestMapping("/forex-service")
public class ExchangeController {
	
	@Autowired
	private ExchangeService exchangeService;
	
	@RequestMapping("/from/{currencyfrom}/to/{currencyto}")
	public Exchange getConversion(@PathVariable String currencyfrom, @PathVariable String currencyto) {
		
		return exchangeService.getCoversion(currencyfrom, currencyto);
	}
	
	

}
