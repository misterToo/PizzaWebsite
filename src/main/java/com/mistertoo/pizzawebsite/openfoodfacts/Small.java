package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Small.
 */
public class Small{

	@JsonProperty("en")
	private String en;

    /**
     * Get en string.
     *
     * @return the string
     */
    public String getEn(){
		return en;
	}
}