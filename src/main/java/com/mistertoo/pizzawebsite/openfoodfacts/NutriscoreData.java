package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Nutriscore data.
 */
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

    /**
     * Get fiber points int.
     *
     * @return the int
     */
    public int getFiberPoints(){
		return fiberPoints;
	}

    /**
     * Get saturated fat ratio double.
     *
     * @return the double
     */
    public double getSaturatedFatRatio(){
		return saturatedFatRatio;
	}

    /**
     * Get sugars points int.
     *
     * @return the int
     */
    public int getSugarsPoints(){
		return sugarsPoints;
	}

    /**
     * Get proteins value double.
     *
     * @return the double
     */
    public double getProteinsValue(){
		return proteinsValue;
	}

    /**
     * Get fiber value double.
     *
     * @return the double
     */
    public double getFiberValue(){
		return fiberValue;
	}

    /**
     * Get positive points int.
     *
     * @return the int
     */
    public int getPositivePoints(){
		return positivePoints;
	}

    /**
     * Get is cheese int.
     *
     * @return the int
     */
    public int getIsCheese(){
		return isCheese;
	}

    /**
     * Get saturated fat value double.
     *
     * @return the double
     */
    public double getSaturatedFatValue(){
		return saturatedFatValue;
	}

    /**
     * Get score int.
     *
     * @return the int
     */
    public int getScore(){
		return score;
	}

    /**
     * Get fruits vegetables nuts colza walnut olive oils value int.
     *
     * @return the int
     */
    public int getFruitsVegetablesNutsColzaWalnutOliveOilsValue(){
		return fruitsVegetablesNutsColzaWalnutOliveOilsValue;
	}

    /**
     * Get saturated fat points int.
     *
     * @return the int
     */
    public int getSaturatedFatPoints(){
		return saturatedFatPoints;
	}

    /**
     * Get proteins double.
     *
     * @return the double
     */
    public double getProteins(){
		return proteins;
	}

    /**
     * Get sodium value int.
     *
     * @return the int
     */
    public int getSodiumValue(){
		return sodiumValue;
	}

    /**
     * Get saturated fat ratio value int.
     *
     * @return the int
     */
    public int getSaturatedFatRatioValue(){
		return saturatedFatRatioValue;
	}

    /**
     * Get is water int.
     *
     * @return the int
     */
    public int getIsWater(){
		return isWater;
	}

    /**
     * Get energy int.
     *
     * @return the int
     */
    public int getEnergy(){
		return energy;
	}

    /**
     * Get fiber double.
     *
     * @return the double
     */
    public double getFiber(){
		return fiber;
	}

    /**
     * Get negative points int.
     *
     * @return the int
     */
    public int getNegativePoints(){
		return negativePoints;
	}

    /**
     * Get sugars double.
     *
     * @return the double
     */
    public double getSugars(){
		return sugars;
	}

    /**
     * Get proteins points int.
     *
     * @return the int
     */
    public int getProteinsPoints(){
		return proteinsPoints;
	}

    /**
     * Get fruits vegetables nuts colza walnut olive oils points int.
     *
     * @return the int
     */
    public int getFruitsVegetablesNutsColzaWalnutOliveOilsPoints(){
		return fruitsVegetablesNutsColzaWalnutOliveOilsPoints;
	}

    /**
     * Get sugars value double.
     *
     * @return the double
     */
    public double getSugarsValue(){
		return sugarsValue;
	}

    /**
     * Get is fat int.
     *
     * @return the int
     */
    public int getIsFat(){
		return isFat;
	}

    /**
     * Get is beverage int.
     *
     * @return the int
     */
    public int getIsBeverage(){
		return isBeverage;
	}

    /**
     * Get saturated fat double.
     *
     * @return the double
     */
    public double getSaturatedFat(){
		return saturatedFat;
	}

    /**
     * Get fruits vegetables nuts colza walnut olive oils int.
     *
     * @return the int
     */
    public int getFruitsVegetablesNutsColzaWalnutOliveOils(){
		return fruitsVegetablesNutsColzaWalnutOliveOils;
	}

    /**
     * Get sodium int.
     *
     * @return the int
     */
    public int getSodium(){
		return sodium;
	}

    /**
     * Get energy points int.
     *
     * @return the int
     */
    public int getEnergyPoints(){
		return energyPoints;
	}

    /**
     * Get sodium points int.
     *
     * @return the int
     */
    public int getSodiumPoints(){
		return sodiumPoints;
	}

    /**
     * Get grade string.
     *
     * @return the string
     */
    public String getGrade(){
		return grade;
	}

    /**
     * Get energy value int.
     *
     * @return the int
     */
    public int getEnergyValue(){
		return energyValue;
	}

    /**
     * Get saturated fat ratio points int.
     *
     * @return the int
     */
    public int getSaturatedFatRatioPoints(){
		return saturatedFatRatioPoints;
	}
}