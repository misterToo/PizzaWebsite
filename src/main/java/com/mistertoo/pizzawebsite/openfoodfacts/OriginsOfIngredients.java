package com.mistertoo.pizzawebsite.openfoodfacts;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OriginsOfIngredients{

	@JsonProperty("epi_score")
	private int epiScore;

	@JsonProperty("origins_from_origins_field")
	private List<String> originsFromOriginsField;

	@JsonProperty("transportation_scores")
	private TransportationScores transportationScores;

	@JsonProperty("transportation_values")
	private TransportationValues transportationValues;

	@JsonProperty("aggregated_origins")
	private List<AggregatedOriginsItem> aggregatedOrigins;

	@JsonProperty("values")
	private Values values;

	@JsonProperty("epi_value")
	private int epiValue;

	public int getEpiScore(){
		return epiScore;
	}

	public List<String> getOriginsFromOriginsField(){
		return originsFromOriginsField;
	}

	public TransportationScores getTransportationScores(){
		return transportationScores;
	}

	public TransportationValues getTransportationValues(){
		return transportationValues;
	}

	public List<AggregatedOriginsItem> getAggregatedOrigins(){
		return aggregatedOrigins;
	}

	public Values getValues(){
		return values;
	}

	public int getEpiValue(){
		return epiValue;
	}
}