package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IngredientsItem{

	@JsonProperty("percent_max")
	private int percentMax;

	@JsonProperty("percent_min")
	private double percentMin;

	@JsonProperty("percent_estimate")
	private double percentEstimate;

	@JsonProperty("id")
	private String id;

	@JsonProperty("text")
	private String text;

	@JsonProperty("vegetarian")
	private String vegetarian;

	@JsonProperty("vegan")
	private String vegan;

	@JsonProperty("rank")
	private int rank;

	@JsonProperty("has_sub_ingredients")
	private String hasSubIngredients;

	@JsonProperty("processing")
	private String processing;

	public int getPercentMax(){
		return percentMax;
	}

	public double getPercentMin(){
		return percentMin;
	}

	public double getPercentEstimate(){
		return percentEstimate;
	}

	public String getId(){
		return id;
	}

	public String getText(){
		return text;
	}

	public String getVegetarian(){
		return vegetarian;
	}

	public String getVegan(){
		return vegan;
	}

	public int getRank(){
		return rank;
	}

	public String getHasSubIngredients(){
		return hasSubIngredients;
	}

	public String getProcessing(){
		return processing;
	}
}