package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Ingredients item.
 */
public class IngredientsItem{

	@JsonProperty("percent_max")
	private int percentMax;

	@JsonProperty("percent_min")
	private double percentMin;

	@JsonProperty("percent_estimate")
	private double percentEstimate;

	@JsonProperty("id")
	private String id;

	@JsonProperty("text")
	private String text;

	@JsonProperty("vegetarian")
	private String vegetarian;

	@JsonProperty("vegan")
	private String vegan;

	@JsonProperty("rank")
	private int rank;

	@JsonProperty("has_sub_ingredients")
	private String hasSubIngredients;

	@JsonProperty("processing")
	private String processing;

    /**
     * Get percent max int.
     *
     * @return the int
     */
    public int getPercentMax(){
		return percentMax;
	}

    /**
     * Get percent min double.
     *
     * @return the double
     */
    public double getPercentMin(){
		return percentMin;
	}

    /**
     * Get percent estimate double.
     *
     * @return the double
     */
    public double getPercentEstimate(){
		return percentEstimate;
	}

    /**
     * Get id string.
     *
     * @return the string
     */
    public String getId(){
		return id;
	}

    /**
     * Get text string.
     *
     * @return the string
     */
    public String getText(){
		return text;
	}

    /**
     * Get vegetarian string.
     *
     * @return the string
     */
    public String getVegetarian(){
		return vegetarian;
	}

    /**
     * Get vegan string.
     *
     * @return the string
     */
    public String getVegan(){
		return vegan;
	}

    /**
     * Get rank int.
     *
     * @return the int
     */
    public int getRank(){
		return rank;
	}

    /**
     * Get has sub ingredients string.
     *
     * @return the string
     */
    public String getHasSubIngredients(){
		return hasSubIngredients;
	}

    /**
     * Get processing string.
     *
     * @return the string
     */
    public String getProcessing(){
		return processing;
	}
}