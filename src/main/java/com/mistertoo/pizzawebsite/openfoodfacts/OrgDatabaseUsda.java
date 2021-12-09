package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

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

	public String getFdcDataSource(){
		return fdcDataSource;
	}

	public String getFdcCategory(){
		return fdcCategory;
	}

	public String getAvailableDate(){
		return availableDate;
	}

	public String getFdcId(){
		return fdcId;
	}

	public String getPublicationDate(){
		return publicationDate;
	}

	public String getModifiedDate(){
		return modifiedDate;
	}
}