package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonMember100{

	@JsonProperty("w")
	private int W;

	@JsonProperty("h")
	private int H;

	public int getW(){
		return W;
	}

	public int getH(){
		return H;
	}
}