package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Languages.
 */
public class Languages{

	@JsonProperty("en:english")
	private int enEnglish;

    /**
     * Get en english int.
     *
     * @return the int
     */
    public int getEnEnglish(){
		return enEnglish;
	}
}