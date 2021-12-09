package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Json member 2.
 */
public class JsonMember2{

	@JsonProperty("sizes")
	private Sizes sizes;

	@JsonProperty("uploader")
	private String uploader;

	@JsonProperty("uploaded_t")
	private int uploadedT;

    /**
     * Get sizes sizes.
     *
     * @return the sizes
     */
    public Sizes getSizes(){
		return sizes;
	}

    /**
     * Get uploader string.
     *
     * @return the string
     */
    public String getUploader(){
		return uploader;
	}

    /**
     * Get uploaded t int.
     *
     * @return the int
     */
    public int getUploadedT(){
		return uploadedT;
	}
}