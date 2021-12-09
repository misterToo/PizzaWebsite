package com.mistertoo.pizzawebsite.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Response.
 */
public class Response{

	@JsonProperty("product")
	private Product product;

	@JsonProperty("code")
	private String code;

	@JsonProperty("status_verbose")
	private String statusVerbose;

	@JsonProperty("status")
	private int status;

    /**
     * Get product product.
     *
     * @return the product
     */
    public Product getProduct(){
		return product;
	}

    /**
     * Get code string.
     *
     * @return the string
     */
    public String getCode(){
		return code;
	}

    /**
     * Get status verbose string.
     *
     * @return the string
     */
    public String getStatusVerbose(){
		return statusVerbose;
	}

    /**
     * Get status int.
     *
     * @return the int
     */
    public int getStatus(){
		return status;
	}
}