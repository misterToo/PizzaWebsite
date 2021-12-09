package com.mistertoo.pizzawebsite.openfoodfacts;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductionSystem{

	@JsonProperty("warning")
	private String warning;

	@JsonProperty("value")
	private int value;

	@JsonProperty("labels")
	private List<Object> labels;

	public String getWarning(){
		return warning;
	}

	public int getValue(){
		return value;
	}

	public List<Object> getLabels(){
		return labels;
	}
}