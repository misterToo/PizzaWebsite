package com.mistertoo.pizzawebsite.openfoodfacts;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Sources item.
 */
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

    /**
     * Get images list.
     *
     * @return the list
     */
    public List<Object> getImages(){
		return images;
	}

    /**
     * Get name string.
     *
     * @return the string
     */
    public String getName(){
		return name;
	}

    /**
     * Get import t int.
     *
     * @return the int
     */
    public int getImportT(){
		return importT;
	}

    /**
     * Get id string.
     *
     * @return the string
     */
    public String getId(){
		return id;
	}

    /**
     * Get fields list.
     *
     * @return the list
     */
    public List<String> getFields(){
		return fields;
	}

    /**
     * Get url string.
     *
     * @return the string
     */
    public String getUrl(){
		return url;
	}

    /**
     * Get manufacturer object.
     *
     * @return the object
     */
    public Object getManufacturer(){
		return manufacturer;
	}
}