package com.bank.service;

import com.bank.model.CurrencyConversion;

public interface CurrencyConversionService {

	public CurrencyConversion getTotalAmount(String from, String to, Long Quantity);
}
