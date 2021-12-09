package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LanguagesCodes{

	@JsonProperty("en")
	private int en;

	public int getEn(){
		return en;
	}
}