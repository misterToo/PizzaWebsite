package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Languages{

	@JsonProperty("en:english")
	private int enEnglish;

	public int getEnEnglish(){
		return enEnglish;
	}
}