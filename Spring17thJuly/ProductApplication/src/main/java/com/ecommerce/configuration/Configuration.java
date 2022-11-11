package com.ecommerce.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("product-service")
public class Configuration {
	
	private int minimumPagination;
	private int maximumPagination;
	public int getMinimumPagination() {
		return minimumPagination;
	}
	public void setMinimumPagination(int minimumPagination) {
		this.minimumPagination = minimumPagination;
	}
	public int getMaximumPagination() {
		return maximumPagination;
	}
	public void setMaximumPagination(int maximumPagination) {
		this.maximumPagination = maximumPagination;
	}
	

}
