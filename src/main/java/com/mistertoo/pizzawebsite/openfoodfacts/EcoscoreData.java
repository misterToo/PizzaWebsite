package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

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

	public Adjustments getAdjustments(){
		return adjustments;
	}

	public Missing getMissing(){
		return missing;
	}

	public int getMissingAgribalyseMatchWarning(){
		return missingAgribalyseMatchWarning;
	}

	public Agribalyse getAgribalyse(){
		return agribalyse;
	}

	public String getStatus(){
		return status;
	}
}