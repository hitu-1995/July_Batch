package com.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exchange {
	
	@Id
	private int id;
	private String currencyfrom;
	private String currencyto;
	private Long conversion;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCurrencyfrom() {
		return currencyfrom;
	}
	public void setCurrencyfrom(String currencyfrom) {
		this.currencyfrom = currencyfrom;
	}
	public String getCurrencyto() {
		return currencyto;
	}
	public void setCurrencyto(String currencyto) {
		this.currencyto = currencyto;
	}
	public Long getConversion() {
		return conversion;
	}
	public void setConversion(Long conversion) {
		this.conversion = conversion;
	}
	
	

}
