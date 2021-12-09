package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Sources fields.
 */
public class SourcesFields{

	@JsonProperty("org-database-usda")
	private OrgDatabaseUsda orgDatabaseUsda;

    /**
     * Get org database usda org database usda.
     *
     * @return the org database usda
     */
    public OrgDatabaseUsda getOrgDatabaseUsda(){
		return orgDatabaseUsda;
	}
}