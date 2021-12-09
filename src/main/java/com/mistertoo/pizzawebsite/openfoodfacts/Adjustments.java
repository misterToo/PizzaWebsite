package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Adjustments{

	@JsonProperty("origins_of_ingredients")
	private OriginsOfIngredients originsOfIngredients;

	@JsonProperty("packaging")
	private Packaging packaging;

	@JsonProperty("threatened_species")
	private ThreatenedSpecies threatenedSpecies;

	@JsonProperty("production_system")
	private ProductionSystem productionSystem;

	public OriginsOfIngredients getOriginsOfIngredients(){
		return originsOfIngredients;
	}

	public Packaging getPackaging(){
		return packaging;
	}

	public ThreatenedSpecies getThreatenedSpecies(){
		return threatenedSpecies;
	}

	public ProductionSystem getProductionSystem(){
		return productionSystem;
	}
}