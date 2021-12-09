package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Aggregated origins item.
 */
public class AggregatedOriginsItem{

	@JsonProperty("origin")
	private String origin;

	@JsonProperty("percent")
	private int percent;

    /**
     * Get origin string.
     *
     * @return the string
     */
    public String getOrigin(){
		return origin;
	}

    /**
     * Get percent int.
     *
     * @return the int
     */
    public int getPercent(){
		return percent;
	}
}