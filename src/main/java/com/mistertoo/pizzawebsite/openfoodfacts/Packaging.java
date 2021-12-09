package com.mistertoo.pizzawebsite.openfoodfacts;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Packaging{

	@JsonProperty("packagings")
	private List<PackagingsItem> packagings;

	@JsonProperty("score")
	private int score;

	@JsonProperty("non_recyclable_and_non_biodegradable_materials")
	private int nonRecyclableAndNonBiodegradableMaterials;

	@JsonProperty("warning")
	private String warning;

	@JsonProperty("value")
	private int value;

	public List<PackagingsItem> getPackagings(){
		return packagings;
	}

	public int getScore(){
		return score;
	}

	public int getNonRecyclableAndNonBiodegradableMaterials(){
		return nonRecyclableAndNonBiodegradableMaterials;
	}

	public String getWarning(){
		return warning;
	}

	public int getValue(){
		return value;
	}
}