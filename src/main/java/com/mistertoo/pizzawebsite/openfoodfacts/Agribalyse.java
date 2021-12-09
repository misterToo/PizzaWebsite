package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Agribalyse{

	@JsonProperty("warning")
	private String warning;

	public String getWarning(){
		return warning;
	}
}