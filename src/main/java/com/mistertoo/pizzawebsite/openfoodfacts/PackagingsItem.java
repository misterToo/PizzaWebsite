package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Packagings item.
 */
public class PackagingsItem{

	@JsonProperty("shape")
	private String shape;

	@JsonProperty("material")
	private String material;

	@JsonProperty("ecoscore_shape_ratio")
	private String ecoscoreShapeRatio;

	@JsonProperty("ecoscore_material_score")
	private int ecoscoreMaterialScore;

    /**
     * Get shape string.
     *
     * @return the string
     */
    public String getShape(){
		return shape;
	}

    /**
     * Get material string.
     *
     * @return the string
     */
    public String getMaterial(){
		return material;
	}

    /**
     * Get ecoscore shape ratio string.
     *
     * @return the string
     */
    public String getEcoscoreShapeRatio(){
		return ecoscoreShapeRatio;
	}

    /**
     * Get ecoscore material score int.
     *
     * @return the int
     */
    public int getEcoscoreMaterialScore(){
		return ecoscoreMaterialScore;
	}
}