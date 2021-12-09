package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AggregatedOriginsItem{

	@JsonProperty("origin")
	private String origin;

	@JsonProperty("percent")
	private int percent;

	public String getOrigin(){
		return origin;
	}

	public int getPercent(){
		return percent;
	}
}