package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourcesFields{

	@JsonProperty("org-database-usda")
	private OrgDatabaseUsda orgDatabaseUsda;

	public OrgDatabaseUsda getOrgDatabaseUsda(){
		return orgDatabaseUsda;
	}
}