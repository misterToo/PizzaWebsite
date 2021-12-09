package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Languages codes.
 */
public class LanguagesCodes{

	@JsonProperty("en")
	private int en;

    /**
     * Get en int.
     *
     * @return the int
     */
    public int getEn(){
		return en;
	}
}