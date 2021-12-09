package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Front{

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
	private Object normalize;

	@JsonProperty("white_magic")
	private Object whiteMagic;

	@JsonProperty("geometry")
	private String geometry;

	public Small getSmall(){
		return small;
	}

	public Thumb getThumb(){
		return thumb;
	}

	public Display getDisplay(){
		return display;
	}

	public String getRev(){
		return rev;
	}

	public String getImgid(){
		return imgid;
	}

	public Sizes getSizes(){
		return sizes;
	}

	public Object getNormalize(){
		return normalize;
	}

	public Object getWhiteMagic(){
		return whiteMagic;
	}

	public String getGeometry(){
		return geometry;
	}
}