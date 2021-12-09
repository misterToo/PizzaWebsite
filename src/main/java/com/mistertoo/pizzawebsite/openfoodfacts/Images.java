package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Images.
 */
public class Images{

	@JsonProperty("1")
	private JsonMember1 jsonMember1;

	@JsonProperty("2")
	private JsonMember2 jsonMember2;

	@JsonProperty("nutrition")
	private Nutrition nutrition;

	@JsonProperty("3")
	private JsonMember3 jsonMember3;

	@JsonProperty("front_en")
	private FrontEn frontEn;

	@JsonProperty("4")
	private JsonMember4 jsonMember4;

	@JsonProperty("5")
	private JsonMember5 jsonMember5;

	@JsonProperty("nutrition_en")
	private NutritionEn nutritionEn;

	@JsonProperty("ingredients")
	private Ingredients ingredients;

	@JsonProperty("front")
	private Front front;

	@JsonProperty("ingredients_en")
	private IngredientsEn ingredientsEn;

    /**
     * Get json member 1 json member 1.
     *
     * @return the json member 1
     */
    public JsonMember1 getJsonMember1(){
		return jsonMember1;
	}

    /**
     * Get json member 2 json member 2.
     *
     * @return the json member 2
     */
    public JsonMember2 getJsonMember2(){
		return jsonMember2;
	}

    /**
     * Get nutrition nutrition.
     *
     * @return the nutrition
     */
    public Nutrition getNutrition(){
		return nutrition;
	}

    /**
     * Get json member 3 json member 3.
     *
     * @return the json member 3
     */
    public JsonMember3 getJsonMember3(){
		return jsonMember3;
	}

    /**
     * Get front en front en.
     *
     * @return the front en
     */
    public FrontEn getFrontEn(){
		return frontEn;
	}

    /**
     * Get json member 4 json member 4.
     *
     * @return the json member 4
     */
    public JsonMember4 getJsonMember4(){
		return jsonMember4;
	}

    /**
     * Get json member 5 json member 5.
     *
     * @return the json member 5
     */
    public JsonMember5 getJsonMember5(){
		return jsonMember5;
	}

    /**
     * Get nutrition en nutrition en.
     *
     * @return the nutrition en
     */
    public NutritionEn getNutritionEn(){
		return nutritionEn;
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

    /**
     * Get ingredients en ingredients en.
     *
     * @return the ingredients en
     */
    public IngredientsEn getIngredientsEn(){
		return ingredientsEn;
	}
}