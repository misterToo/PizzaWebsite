package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Ecoscore data.
 */
public class EcoscoreData{

	@JsonProperty("adjustments")
	private Adjustments adjustments;

	@JsonProperty("missing")
	private Missing missing;

	@JsonProperty("missing_agribalyse_match_warning")
	private int missingAgribalyseMatchWarning;

	@JsonProperty("agribalyse")
	private Agribalyse agribalyse;

	@JsonProperty("status")
	private String status;

    /**
     * Get adjustments adjustments.
     *
     * @return the adjustments
     */
    public Adjustments getAdjustments(){
		return adjustments;
	}

    /**
     * Get missing missing.
     *
     * @return the missing
     */
    public Missing getMissing(){
		return missing;
	}

    /**
     * Get missing agribalyse match warning int.
     *
     * @return the int
     */
    public int getMissingAgribalyseMatchWarning(){
		return missingAgribalyseMatchWarning;
	}

    /**
     * Get agribalyse agribalyse.
     *
     * @return the agribalyse
     */
    public Agribalyse getAgribalyse(){
		return agribalyse;
	}

    /**
     * Get status string.
     *
     * @return the string
     */
    public String getStatus(){
		return status;
	}
}