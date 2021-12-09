package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("product")
	private Product product;

	@JsonProperty("code")
	private String code;

	@JsonProperty("status_verbose")
	private String statusVerbose;

	@JsonProperty("status")
	private int status;

	public Product getProduct(){
		return product;
	}

	public String getCode(){
		return code;
	}

	public String getStatusVerbose(){
		return statusVerbose;
	}

	public int getStatus(){
		return status;
	}
}