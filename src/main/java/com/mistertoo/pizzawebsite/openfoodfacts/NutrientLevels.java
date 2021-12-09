package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutrientLevels{

	@JsonProperty("salt")
	private String salt;

	@JsonProperty("sugars")
	private String sugars;

	@JsonProperty("fat")
	private String fat;

	@JsonProperty("saturated-fat")
	private String saturatedFat;

	public String getSalt(){
		return salt;
	}

	public String getSugars(){
		return sugars;
	}

	public String getFat(){
		return fat;
	}

	public String getSaturatedFat(){
		return saturatedFat;
	}
}