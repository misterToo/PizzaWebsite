package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Display{

	@JsonProperty("en")
	private String en;

	public String getEn(){
		return en;
	}
}