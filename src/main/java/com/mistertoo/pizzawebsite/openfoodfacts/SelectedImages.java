package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SelectedImages{

	@JsonProperty("nutrition")
	private Nutrition nutrition;

	@JsonProperty("ingredients")
	private Ingredients ingredients;

	@JsonProperty("front")
	private Front front;

	public Nutrition getNutrition(){
		return nutrition;
	}

	public Ingredients getIngredients(){
		return ingredients;
	}

	public Front getFront(){
		return front;
	}
}