package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutriscoreData{

	@JsonProperty("fiber_points")
	private int fiberPoints;

	@JsonProperty("saturated_fat_ratio")
	private double saturatedFatRatio;

	@JsonProperty("sugars_points")
	private int sugarsPoints;

	@JsonProperty("proteins_value")
	private double proteinsValue;

	@JsonProperty("fiber_value")
	private double fiberValue;

	@JsonProperty("positive_points")
	private int positivePoints;

	@JsonProperty("is_cheese")
	private int isCheese;

	@JsonProperty("saturated_fat_value")
	private double saturatedFatValue;

	@JsonProperty("score")
	private int score;

	@JsonProperty("fruits_vegetables_nuts_colza_walnut_olive_oils_value")
	private int fruitsVegetablesNutsColzaWalnutOliveOilsValue;

	@JsonProperty("saturated_fat_points")
	private int saturatedFatPoints;

	@JsonProperty("proteins")
	private double proteins;

	@JsonProperty("sodium_value")
	private int sodiumValue;

	@JsonProperty("saturated_fat_ratio_value")
	private int saturatedFatRatioValue;

	@JsonProperty("is_water")
	private int isWater;

	@JsonProperty("energy")
	private int energy;

	@JsonProperty("fiber")
	private double fiber;

	@JsonProperty("negative_points")
	private int negativePoints;

	@JsonProperty("sugars")
	private double sugars;

	@JsonProperty("proteins_points")
	private int proteinsPoints;

	@JsonProperty("fruits_vegetables_nuts_colza_walnut_olive_oils_points")
	private int fruitsVegetablesNutsColzaWalnutOliveOilsPoints;

	@JsonProperty("sugars_value")
	private double sugarsValue;

	@JsonProperty("is_fat")
	private int isFat;

	@JsonProperty("is_beverage")
	private int isBeverage;

	@JsonProperty("saturated_fat")
	private double saturatedFat;

	@JsonProperty("fruits_vegetables_nuts_colza_walnut_olive_oils")
	private int fruitsVegetablesNutsColzaWalnutOliveOils;

	@JsonProperty("sodium")
	private int sodium;

	@JsonProperty("energy_points")
	private int energyPoints;

	@JsonProperty("sodium_points")
	private int sodiumPoints;

	@JsonProperty("grade")
	private String grade;

	@JsonProperty("energy_value")
	private int energyValue;

	@JsonProperty("saturated_fat_ratio_points")
	private int saturatedFatRatioPoints;

	public int getFiberPoints(){
		return fiberPoints;
	}

	public double getSaturatedFatRatio(){
		return saturatedFatRatio;
	}

	public int getSugarsPoints(){
		return sugarsPoints;
	}

	public double getProteinsValue(){
		return proteinsValue;
	}

	public double getFiberValue(){
		return fiberValue;
	}

	public int getPositivePoints(){
		return positivePoints;
	}

	public int getIsCheese(){
		return isCheese;
	}

	public double getSaturatedFatValue(){
		return saturatedFatValue;
	}

	public int getScore(){
		return score;
	}

	public int getFruitsVegetablesNutsColzaWalnutOliveOilsValue(){
		return fruitsVegetablesNutsColzaWalnutOliveOilsValue;
	}

	public int getSaturatedFatPoints(){
		return saturatedFatPoints;
	}

	public double getProteins(){
		return proteins;
	}

	public int getSodiumValue(){
		return sodiumValue;
	}

	public int getSaturatedFatRatioValue(){
		return saturatedFatRatioValue;
	}

	public int getIsWater(){
		return isWater;
	}

	public int getEnergy(){
		return energy;
	}

	public double getFiber(){
		return fiber;
	}

	public int getNegativePoints(){
		return negativePoints;
	}

	public double getSugars(){
		return sugars;
	}

	public int getProteinsPoints(){
		return proteinsPoints;
	}

	public int getFruitsVegetablesNutsColzaWalnutOliveOilsPoints(){
		return fruitsVegetablesNutsColzaWalnutOliveOilsPoints;
	}

	public double getSugarsValue(){
		return sugarsValue;
	}

	public int getIsFat(){
		return isFat;
	}

	public int getIsBeverage(){
		return isBeverage;
	}

	public double getSaturatedFat(){
		return saturatedFat;
	}

	public int getFruitsVegetablesNutsColzaWalnutOliveOils(){
		return fruitsVegetablesNutsColzaWalnutOliveOils;
	}

	public int getSodium(){
		return sodium;
	}

	public int getEnergyPoints(){
		return energyPoints;
	}

	public int getSodiumPoints(){
		return sodiumPoints;
	}

	public String getGrade(){
		return grade;
	}

	public int getEnergyValue(){
		return energyValue;
	}

	public int getSaturatedFatRatioPoints(){
		return saturatedFatRatioPoints;
	}
}