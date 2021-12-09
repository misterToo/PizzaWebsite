package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

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

	public JsonMember1 getJsonMember1(){
		return jsonMember1;
	}

	public JsonMember2 getJsonMember2(){
		return jsonMember2;
	}

	public Nutrition getNutrition(){
		return nutrition;
	}

	public JsonMember3 getJsonMember3(){
		return jsonMember3;
	}

	public FrontEn getFrontEn(){
		return frontEn;
	}

	public JsonMember4 getJsonMember4(){
		return jsonMember4;
	}

	public JsonMember5 getJsonMember5(){
		return jsonMember5;
	}

	public NutritionEn getNutritionEn(){
		return nutritionEn;
	}

	public Ingredients getIngredients(){
		return ingredients;
	}

	public Front getFront(){
		return front;
	}

	public IngredientsEn getIngredientsEn(){
		return ingredientsEn;
	}
}