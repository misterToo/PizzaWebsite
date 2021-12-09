package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Nutrition.
 */
public class Nutrition{

	@JsonProperty("small")
	private Small small;

	@JsonProperty("thumb")
	private Thumb thumb;

	@JsonProperty("display")
	private Display display;

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
     * Get small small.
     *
     * @return the small
     */
    public Small getSmall(){
		return small;
	}

    /**
     * Get thumb thumb.
     *
     * @return the thumb
     */
    public Thumb getThumb(){
		return thumb;
	}

    /**
     * Get display display.
     *
     * @return the display
     */
    public Display getDisplay(){
		return display;
	}

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