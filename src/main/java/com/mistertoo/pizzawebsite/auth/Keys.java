package com.mistertoo.pizzawebsite.auth;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Keys{

	@JsonProperty("keys")
	private List<com.mistertoo.pizzawebsite.auth.KeysItem> keys;

	public List<com.mistertoo.pizzawebsite.auth.KeysItem> getKeys(){
		return keys;
	}
}