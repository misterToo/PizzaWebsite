package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonMember2{

	@JsonProperty("sizes")
	private Sizes sizes;

	@JsonProperty("uploader")
	private String uploader;

	@JsonProperty("uploaded_t")
	private int uploadedT;

	public Sizes getSizes(){
		return sizes;
	}

	public String getUploader(){
		return uploader;
	}

	public int getUploadedT(){
		return uploadedT;
	}
}