package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Missing.
 */
public class Missing{

	@JsonProperty("packagings")
	private int packagings;

	@JsonProperty("agb_category")
	private int agbCategory;

	@JsonProperty("labels")
	private int labels;

    /**
     * Get packagings int.
     *
     * @return the int
     */
    public int getPackagings(){
		return packagings;
	}

    /**
     * Get agb category int.
     *
     * @return the int
     */
    public int getAgbCategory(){
		return agbCategory;
	}

    /**
     * Get labels int.
     *
     * @return the int
     */
    public int getLabels(){
		return labels;
	}
}