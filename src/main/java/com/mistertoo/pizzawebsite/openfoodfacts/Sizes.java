package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sizes{

	@JsonProperty("100")
	private JsonMember100 jsonMember100;

	@JsonProperty("200")
	private JsonMember200 jsonMember200;

	@JsonProperty("400")
	private JsonMember400 jsonMember400;

	@JsonProperty("full")
	private Full full;

	public JsonMember100 getJsonMember100(){
		return jsonMember100;
	}

	public JsonMember200 getJsonMember200(){
		return jsonMember200;
	}

	public JsonMember400 getJsonMember400(){
		return jsonMember400;
	}

	public Full getFull(){
		return full;
	}
}