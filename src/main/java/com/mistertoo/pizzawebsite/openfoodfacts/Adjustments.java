package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Adjustments.
 */
public class Adjustments{

	@JsonProperty("origins_of_ingredients")
	private OriginsOfIngredients originsOfIngredients;

	@JsonProperty("packaging")
	private Packaging packaging;

	@JsonProperty("threatened_species")
	private ThreatenedSpecies threatenedSpecies;

	@JsonProperty("production_system")
	private ProductionSystem productionSystem;

    /**
     * Get origins of ingredients origins of ingredients.
     *
     * @return the origins of ingredients
     */
    public OriginsOfIngredients getOriginsOfIngredients(){
		return originsOfIngredients;
	}

    /**
     * Get packaging packaging.
     *
     * @return the packaging
     */
    public Packaging getPackaging(){
		return packaging;
	}

    /**
     * Get threatened species threatened species.
     *
     * @return the threatened species
     */
    public ThreatenedSpecies getThreatenedSpecies(){
		return threatenedSpecies;
	}

    /**
     * Get production system production system.
     *
     * @return the production system
     */
    public ProductionSystem getProductionSystem(){
		return productionSystem;
	}
}