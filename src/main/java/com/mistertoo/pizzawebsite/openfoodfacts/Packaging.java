package com.mistertoo.pizzawebsite.openfoodfacts;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Packaging.
 */
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

	/**
	 * Get packagings list.
	 *
	 * @return the list
	 */
	public List<PackagingsItem> getPackagings(){
		return packagings;
	}

	/**
	 * Get score int.
	 *
	 * @return the int
	 */
	public int getScore(){
		return score;
	}

	/**
	 * Get non recyclable and non biodegradable materials int.
	 *
	 * @return the int
	 */
	public int getNonRecyclableAndNonBiodegradableMaterials(){
		return nonRecyclableAndNonBiodegradableMaterials;
	}

	/**
	 * Get warning string.
	 *
	 * @return the string
	 */
	public String getWarning(){
		return warning;
	}

	/**
	 * Get value int.
	 *
	 * @return the int
	 */
	public int getValue(){
		return value;
	}
}