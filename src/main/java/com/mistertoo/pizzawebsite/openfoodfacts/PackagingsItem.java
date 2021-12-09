package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PackagingsItem{

	@JsonProperty("shape")
	private String shape;

	@JsonProperty("material")
	private String material;

	@JsonProperty("ecoscore_shape_ratio")
	private String ecoscoreShapeRatio;

	@JsonProperty("ecoscore_material_score")
	private int ecoscoreMaterialScore;

	public String getShape(){
		return shape;
	}

	public String getMaterial(){
		return material;
	}

	public String getEcoscoreShapeRatio(){
		return ecoscoreShapeRatio;
	}

	public int getEcoscoreMaterialScore(){
		return ecoscoreMaterialScore;
	}
}