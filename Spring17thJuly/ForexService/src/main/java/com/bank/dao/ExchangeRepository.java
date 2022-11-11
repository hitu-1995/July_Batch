package com.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.model.Exchange;

public interface ExchangeRepository extends JpaRepository<Exchange, Integer>{

	public Exchange findByCurrencyfromAndCurrencyto(String currencyfrom, String currencyto);
}
