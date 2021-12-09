package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Agribalyse.
 */
public class Agribalyse{

	@JsonProperty("warning")
	private String warning;

    /**
     * Get warning string.
     *
     * @return the string
     */
    public String getWarning(){
		return warning;
	}
}