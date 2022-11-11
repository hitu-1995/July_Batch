package com.bank.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.ExchangeRepository;
import com.bank.model.Exchange;
import com.bank.service.ExchangeService;

@Service
public class ExchangeServiceImpl implements ExchangeService {
	
	@Autowired
	private ExchangeRepository exchangeRepository;

	@Override
	public Exchange getCoversion(String from, String to) {
		// TODO Auto-generated method stub
		return exchangeRepository.findByCurrencyfromAndCurrencyto(from, to);
	}

}
