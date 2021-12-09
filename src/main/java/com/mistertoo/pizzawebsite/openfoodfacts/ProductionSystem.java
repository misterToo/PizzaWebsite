package com.mistertoo.pizzawebsite.openfoodfacts;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Production system.
 */
public class ProductionSystem{

	@JsonProperty("warning")
	private String warning;

	@JsonProperty("value")
	private int value;

	@JsonProperty("labels")
	private List<Object> labels;

    /**
     * Get warning string.
     *
     * @return the string
     */
    public String getWarning(){
		return warning;
	}

    /**
     * Get value int.
     *
     * @return the int
     */
    public int getValue(){
		return value;
	}

    /**
     * Get labels list.
     *
     * @return the list
     */
    public List<Object> getLabels(){
		return labels;
	}
}