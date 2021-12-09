package com.mistertoo.pizzawebsite.openfoodfacts;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourcesItem{

	@JsonProperty("images")
	private List<Object> images;

	@JsonProperty("name")
	private String name;

	@JsonProperty("import_t")
	private int importT;

	@JsonProperty("id")
	private String id;

	@JsonProperty("fields")
	private List<String> fields;

	@JsonProperty("url")
	private String url;

	@JsonProperty("manufacturer")
	private Object manufacturer;

	public List<Object> getImages(){
		return images;
	}

	public String getName(){
		return name;
	}

	public int getImportT(){
		return importT;
	}

	public String getId(){
		return id;
	}

	public List<String> getFields(){
		return fields;
	}

	public String getUrl(){
		return url;
	}

	public Object getManufacturer(){
		return manufacturer;
	}
}