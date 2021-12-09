package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Ingredients en.
 */
public class IngredientsEn{

	@JsonProperty("rev")
	private String rev;

	@JsonProperty("imgid")
	private String imgid;

	@JsonProperty("sizes")
	private Sizes sizes;

	@JsonProperty("normalize")
	private String normalize;

	@JsonProperty("white_magic")
	private Object whiteMagic;

	@JsonProperty("geometry")
	private String geometry;

    /**
     * Get rev string.
     *
     * @return the string
     */
    public String getRev(){
		return rev;
	}

    /**
     * Get imgid string.
     *
     * @return the string
     */
    public String getImgid(){
		return imgid;
	}

    /**
     * Get sizes sizes.
     *
     * @return the sizes
     */
    public Sizes getSizes(){
		return sizes;
	}

    /**
     * Get normalize string.
     *
     * @return the string
     */
    public String getNormalize(){
		return normalize;
	}

    /**
     * Get white magic object.
     *
     * @return the object
     */
    public Object getWhiteMagic(){
		return whiteMagic;
	}

    /**
     * Get geometry string.
     *
     * @return the string
     */
    public String getGeometry(){
		return geometry;
	}
}