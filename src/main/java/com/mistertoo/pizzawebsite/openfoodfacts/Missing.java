package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Missing{

	@JsonProperty("packagings")
	private int packagings;

	@JsonProperty("agb_category")
	private int agbCategory;

	@JsonProperty("labels")
	private int labels;

	public int getPackagings(){
		return packagings;
	}

	public int getAgbCategory(){
		return agbCategory;
	}

	public int getLabels(){
		return labels;
	}
}