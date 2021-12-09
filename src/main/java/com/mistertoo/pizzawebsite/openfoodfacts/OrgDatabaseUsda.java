package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Org database usda.
 */
public class OrgDatabaseUsda{

	@JsonProperty("fdc_data_source")
	private String fdcDataSource;

	@JsonProperty("fdc_category")
	private String fdcCategory;

	@JsonProperty("available_date")
	private String availableDate;

	@JsonProperty("fdc_id")
	private String fdcId;

	@JsonProperty("publication_date")
	private String publicationDate;

	@JsonProperty("modified_date")
	private String modifiedDate;

    /**
     * Get fdc data source string.
     *
     * @return the string
     */
    public String getFdcDataSource(){
		return fdcDataSource;
	}

    /**
     * Get fdc category string.
     *
     * @return the string
     */
    public String getFdcCategory(){
		return fdcCategory;
	}

    /**
     * Get available date string.
     *
     * @return the string
     */
    public String getAvailableDate(){
		return availableDate;
	}

    /**
     * Get fdc id string.
     *
     * @return the string
     */
    public String getFdcId(){
		return fdcId;
	}

    /**
     * Get publication date string.
     *
     * @return the string
     */
    public String getPublicationDate(){
		return publicationDate;
	}

    /**
     * Get modified date string.
     *
     * @return the string
     */
    public String getModifiedDate(){
		return modifiedDate;
	}
}