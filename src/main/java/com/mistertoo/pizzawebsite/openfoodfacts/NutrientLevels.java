package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Nutrient levels.
 */
public class NutrientLevels{

	@JsonProperty("salt")
	private String salt;

	@JsonProperty("sugars")
	private String sugars;

	@JsonProperty("fat")
	private String fat;

	@JsonProperty("saturated-fat")
	private String saturatedFat;

    /**
     * Get salt string.
     *
     * @return the string
     */
    public String getSalt(){
		return salt;
	}

    /**
     * Get sugars string.
     *
     * @return the string
     */
    public String getSugars(){
		return sugars;
	}

    /**
     * Get fat string.
     *
     * @return the string
     */
    public String getFat(){
		return fat;
	}

    /**
     * Get saturated fat string.
     *
     * @return the string
     */
    public String getSaturatedFat(){
		return saturatedFat;
	}
}