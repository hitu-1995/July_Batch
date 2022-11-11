package com.bank.model;

public class CurrencyConversion {

	private Integer id;
	private String currencyfrom;
	private String currencyto;
	private Long conversion;
	private Long quantity;
	private Long totalamount;
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
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(Long totalamount) {
		this.totalamount = totalamount;
	}
	

}
