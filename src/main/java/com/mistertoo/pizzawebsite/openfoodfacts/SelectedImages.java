package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Selected images.
 */
public class SelectedImages{

	@JsonProperty("nutrition")
	private Nutrition nutrition;

	@JsonProperty("ingredients")
	private Ingredients ingredients;

	@JsonProperty("front")
	private Front front;

    /**
     * Get nutrition nutrition.
     *
     * @return the nutrition
     */
    public Nutrition getNutrition(){
		return nutrition;
	}

    /**
     * Get ingredients ingredients.
     *
     * @return the ingredients
     */
    public Ingredients getIngredients(){
		return ingredients;
	}

    /**
     * Get front front.
     *
     * @return the front
     */
    public Front getFront(){
		return front;
	}
}