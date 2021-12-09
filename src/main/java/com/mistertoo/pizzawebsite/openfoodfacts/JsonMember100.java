package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Json member 100.
 */
public class JsonMember100{

	@JsonProperty("w")
	private int W;

	@JsonProperty("h")
	private int H;

    /**
     * Get w int.
     *
     * @return the int
     */
    public int getW(){
		return W;
	}

    /**
     * Get h int.
     *
     * @return the int
     */
    public int getH(){
		return H;
	}
}