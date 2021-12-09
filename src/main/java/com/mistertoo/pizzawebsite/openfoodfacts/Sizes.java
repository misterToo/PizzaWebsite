package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Sizes.
 */
public class Sizes{

	@JsonProperty("100")
	private JsonMember100 jsonMember100;

	@JsonProperty("200")
	private JsonMember200 jsonMember200;

	@JsonProperty("400")
	private JsonMember400 jsonMember400;

	@JsonProperty("full")
	private Full full;

    /**
     * Get json member 100 json member 100.
     *
     * @return the json member 100
     */
    public JsonMember100 getJsonMember100(){
		return jsonMember100;
	}

    /**
     * Get json member 200 json member 200.
     *
     * @return the json member 200
     */
    public JsonMember200 getJsonMember200(){
		return jsonMember200;
	}

    /**
     * Get json member 400 json member 400.
     *
     * @return the json member 400
     */
    public JsonMember400 getJsonMember400(){
		return jsonMember400;
	}

    /**
     * Get full full.
     *
     * @return the full
     */
    public Full getFull(){
		return full;
	}
}