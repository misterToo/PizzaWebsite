package com.mistertoo.pizzawebsite.openfoodfacts;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Origins of ingredients.
 */
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

    /**
     * Get epi score int.
     *
     * @return the int
     */
    public int getEpiScore(){
		return epiScore;
	}

    /**
     * Get origins from origins field list.
     *
     * @return the list
     */
    public List<String> getOriginsFromOriginsField(){
		return originsFromOriginsField;
	}

    /**
     * Get transportation scores transportation scores.
     *
     * @return the transportation scores
     */
    public TransportationScores getTransportationScores(){
		return transportationScores;
	}

    /**
     * Get transportation values transportation values.
     *
     * @return the transportation values
     */
    public TransportationValues getTransportationValues(){
		return transportationValues;
	}

    /**
     * Get aggregated origins list.
     *
     * @return the list
     */
    public List<AggregatedOriginsItem> getAggregatedOrigins(){
		return aggregatedOrigins;
	}

    /**
     * Get values values.
     *
     * @return the values
     */
    public Values getValues(){
		return values;
	}

    /**
     * Get epi value int.
     *
     * @return the int
     */
    public int getEpiValue(){
		return epiValue;
	}
}