package com.mistertoo.pizzawebsite.openfoodfacts;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Product.
 */
public class Product{

	@JsonProperty("emb_codes_debug_tags")
	private List<Object> embCodesDebugTags;

	@JsonProperty("countries_imported")
	private String countriesImported;

	@JsonProperty("vitamins_tags")
	private List<Object> vitaminsTags;

	@JsonProperty("allergens_from_ingredients")
	private String allergensFromIngredients;

	@JsonProperty("ingredients_original_tags")
	private List<String> ingredientsOriginalTags;

	@JsonProperty("category_properties")
	private CategoryProperties categoryProperties;

	@JsonProperty("serving_size_imported")
	private String servingSizeImported;

	@JsonProperty("new_additives_n")
	private int newAdditivesN;

	@JsonProperty("categories_imported")
	private String categoriesImported;

	@JsonProperty("added_countries_tags")
	private List<Object> addedCountriesTags;

	@JsonProperty("nutriments")
	private Nutriments nutriments;

	@JsonProperty("photographers")
	private List<String> photographers;

	@JsonProperty("nutrition_data_prepared_per_debug_tags")
	private List<Object> nutritionDataPreparedPerDebugTags;

	@JsonProperty("codes_tags")
	private List<String> codesTags;

	@JsonProperty("nutrient_levels")
	private NutrientLevels nutrientLevels;

	@JsonProperty("additives_tags")
	private List<String> additivesTags;

	@JsonProperty("brands_tags")
	private List<String> brandsTags;

	@JsonProperty("image_ingredients_thumb_url")
	private String imageIngredientsThumbUrl;

	@JsonProperty("last_image_dates_tags")
	private List<String> lastImageDatesTags;

	@JsonProperty("nucleotides_tags")
	private List<Object> nucleotidesTags;

	@JsonProperty("popularity_key")
	private long popularityKey;

	@JsonProperty("ingredients_n_tags")
	private List<String> ingredientsNTags;

	@JsonProperty("countries")
	private String countries;

	@JsonProperty("labels")
	private String labels;

	@JsonProperty("image_front_small_url")
	private String imageFrontSmallUrl;

	@JsonProperty("ingredients_from_or_that_may_be_from_palm_oil_n")
	private int ingredientsFromOrThatMayBeFromPalmOilN;

	@JsonProperty("nutrition_grade_fr")
	private String nutritionGradeFr;

	@JsonProperty("cities_tags")
	private List<Object> citiesTags;

	@JsonProperty("data_quality_tags")
	private List<String> dataQualityTags;

	@JsonProperty("nova_groups_tags")
	private List<String> novaGroupsTags;

	@JsonProperty("ingredients_text_en")
	private String ingredientsTextEn;

	@JsonProperty("checkers_tags")
	private List<Object> checkersTags;

	@JsonProperty("pnns_groups_1_tags")
	private List<String> pnnsGroups1Tags;

	@JsonProperty("languages_codes")
	private LanguagesCodes languagesCodes;

	@JsonProperty("states_tags")
	private List<String> statesTags;

	@JsonProperty("brands_debug_tags")
	private List<Object> brandsDebugTags;

	@JsonProperty("additives_original_tags")
	private List<String> additivesOriginalTags;

	@JsonProperty("ingredients")
	private List<IngredientsItem> ingredients;

	@JsonProperty("origins")
	private String origins;

	@JsonProperty("serving_size_debug_tags")
	private List<Object> servingSizeDebugTags;

	@JsonProperty("brands")
	private String brands;

	@JsonProperty("labels_lc")
	private String labelsLc;

	@JsonProperty("languages")
	private Languages languages;

	@JsonProperty("ciqual_food_name_tags")
	private List<String> ciqualFoodNameTags;

	@JsonProperty("ingredients_text_with_allergens")
	private String ingredientsTextWithAllergens;

	@JsonProperty("manufacturing_places")
	private String manufacturingPlaces;

	@JsonProperty("ingredients_with_specified_percent_sum")
	private int ingredientsWithSpecifiedPercentSum;

	@JsonProperty("categories_hierarchy")
	private List<String> categoriesHierarchy;

	@JsonProperty("quantity_debug_tags")
	private List<Object> quantityDebugTags;

	@JsonProperty("categories_old")
	private String categoriesOld;

	@JsonProperty("emb_codes_20141016")
	private String embCodes20141016;

	@JsonProperty("additives_tags_n")
	private Object additivesTagsN;

	@JsonProperty("editors_tags")
	private List<String> editorsTags;

	@JsonProperty("origins_tags")
	private List<String> originsTags;

	@JsonProperty("nutriscore_grade")
	private String nutriscoreGrade;

	@JsonProperty("additives_old_tags")
	private List<String> additivesOldTags;

	@JsonProperty("completed_t")
	private int completedT;

	@JsonProperty("nutrition_grades")
	private String nutritionGrades;

	@JsonProperty("ingredients_debug")
	private List<String> ingredientsDebug;

	@JsonProperty("correctors_tags")
	private List<String> correctorsTags;

	@JsonProperty("removed_countries_tags")
	private List<Object> removedCountriesTags;

	@JsonProperty("emb_codes_tags")
	private List<Object> embCodesTags;

	@JsonProperty("debug_param_sorted_langs")
	private List<String> debugParamSortedLangs;

	@JsonProperty("image_front_thumb_url")
	private String imageFrontThumbUrl;

	@JsonProperty("ingredients_tags")
	private List<String> ingredientsTags;

	@JsonProperty("completeness")
	private double completeness;

	@JsonProperty("expiration_date")
	private String expirationDate;

	@JsonProperty("image_nutrition_url")
	private String imageNutritionUrl;

	@JsonProperty("packagings")
	private List<PackagingsItem> packagings;

	@JsonProperty("nova_group")
	private int novaGroup;

	@JsonProperty("nutrition_data_prepared")
	private String nutritionDataPrepared;

	@JsonProperty("nutriscore_score")
	private int nutriscoreScore;

	@JsonProperty("languages_tags")
	private List<String> languagesTags;

	@JsonProperty("serving_size")
	private String servingSize;

	@JsonProperty("ingredients_ids_debug")
	private List<String> ingredientsIdsDebug;

	@JsonProperty("generic_name_en_debug_tags")
	private List<Object> genericNameEnDebugTags;

	@JsonProperty("rev")
	private int rev;

	@JsonProperty("ecoscore_grade")
	private String ecoscoreGrade;

	@JsonProperty("correctors")
	private List<String> correctors;

	@JsonProperty("allergens_from_user")
	private String allergensFromUser;

	@JsonProperty("ingredients_from_palm_oil_tags")
	private List<Object> ingredientsFromPalmOilTags;

	@JsonProperty("link_debug_tags")
	private List<Object> linkDebugTags;

	@JsonProperty("labels_hierarchy")
	private List<String> labelsHierarchy;

	@JsonProperty("no_nutrition_data")
	private String noNutritionData;

	@JsonProperty("brand_owner")
	private String brandOwner;

	@JsonProperty("generic_name_en")
	private String genericNameEn;

	@JsonProperty("product_name_en_debug_tags")
	private List<Object> productNameEnDebugTags;

	@JsonProperty("sources")
	private List<SourcesItem> sources;

	@JsonProperty("checkers")
	private List<Object> checkers;

	@JsonProperty("ingredients_with_specified_percent_n")
	private int ingredientsWithSpecifiedPercentN;

	@JsonProperty("unknown_nutrients_tags")
	private List<Object> unknownNutrientsTags;

	@JsonProperty("nutriscore_score_opposite")
	private int nutriscoreScoreOpposite;

	@JsonProperty("last_edit_dates_tags")
	private List<String> lastEditDatesTags;

	@JsonProperty("states")
	private String states;

	@JsonProperty("data_quality_bugs_tags")
	private List<Object> dataQualityBugsTags;

	@JsonProperty("image_ingredients_url")
	private String imageIngredientsUrl;

	@JsonProperty("origins_old")
	private String originsOld;

	@JsonProperty("other_nutritional_substances_tags")
	private List<Object> otherNutritionalSubstancesTags;

	@JsonProperty("vitamins_prev_tags")
	private List<Object> vitaminsPrevTags;

	@JsonProperty("nova_groups")
	private String novaGroups;

	@JsonProperty("pnns_groups_2_tags")
	private List<String> pnnsGroups2Tags;

	@JsonProperty("image_nutrition_thumb_url")
	private String imageNutritionThumbUrl;

	@JsonProperty("serving_quantity")
	private String servingQuantity;

	@JsonProperty("data_quality_info_tags")
	private List<String> dataQualityInfoTags;

	@JsonProperty("last_modified_t")
	private int lastModifiedT;

	@JsonProperty("packaging")
	private String packaging;

	@JsonProperty("amino_acids_prev_tags")
	private List<Object> aminoAcidsPrevTags;

	@JsonProperty("emb_codes_orig")
	private String embCodesOrig;

	@JsonProperty("image_thumb_url")
	private String imageThumbUrl;

	@JsonProperty("allergens")
	private String allergens;

	@JsonProperty("ingredients_analysis_tags")
	private List<String> ingredientsAnalysisTags;

	@JsonProperty("additives_old_n")
	private int additivesOldN;

	@JsonProperty("data_sources_tags")
	private List<String> dataSourcesTags;

	@JsonProperty("lang_debug_tags")
	private List<Object> langDebugTags;

	@JsonProperty("max_imgid")
	private String maxImgid;

	@JsonProperty("ingredients_n")
	private int ingredientsN;

	@JsonProperty("allergens_hierarchy")
	private List<String> allergensHierarchy;

	@JsonProperty("stores_tags")
	private List<Object> storesTags;

	@JsonProperty("ecoscore_tags")
	private List<String> ecoscoreTags;

	@JsonProperty("nutrition_data")
	private String nutritionData;

	@JsonProperty("additives_debug_tags")
	private List<Object> additivesDebugTags;

	@JsonProperty("languages_hierarchy")
	private List<String> languagesHierarchy;

	@JsonProperty("traces_debug_tags")
	private List<Object> tracesDebugTags;

	@JsonProperty("unique_scans_n")
	private int uniqueScansN;

	@JsonProperty("id")
	private String id;

	@JsonProperty("amino_acids_tags")
	private List<Object> aminoAcidsTags;

	@JsonProperty("image_small_url")
	private String imageSmallUrl;

	@JsonProperty("images")
	private Images images;

	@JsonProperty("image_url")
	private String imageUrl;

	@JsonProperty("image_ingredients_small_url")
	private String imageIngredientsSmallUrl;

	@JsonProperty("product_name_en_imported")
	private String productNameEnImported;

	@JsonProperty("entry_dates_tags")
	private List<String> entryDatesTags;

	@JsonProperty("informers")
	private List<String> informers;

	@JsonProperty("purchase_places")
	private String purchasePlaces;

	@JsonProperty("traces_tags")
	private List<String> tracesTags;

	@JsonProperty("fruits-vegetables-nuts_100g_estimate")
	private int fruitsVegetablesNuts100gEstimate;

	@JsonProperty("image_nutrition_small_url")
	private String imageNutritionSmallUrl;

	@JsonProperty("ingredients_text_with_allergens_en")
	private String ingredientsTextWithAllergensEn;

	@JsonProperty("categories_lc")
	private String categoriesLc;

	@JsonProperty("manufacturing_places_tags")
	private List<Object> manufacturingPlacesTags;

	@JsonProperty("main_countries_tags")
	private List<Object> mainCountriesTags;

	@JsonProperty("categories_properties_tags")
	private List<String> categoriesPropertiesTags;

	@JsonProperty("allergens_tags")
	private List<String> allergensTags;

	@JsonProperty("product_quantity")
	private String productQuantity;

	@JsonProperty("sortkey")
	private int sortkey;

	@JsonProperty("traces_from_ingredients")
	private String tracesFromIngredients;

	@JsonProperty("nutrition_data_prepared_per")
	private String nutritionDataPreparedPer;

	@JsonProperty("ingredients_text_en_imported")
	private String ingredientsTextEnImported;

	@JsonProperty("purchase_places_debug_tags")
	private List<Object> purchasePlacesDebugTags;

	@JsonProperty("origins_lc")
	private String originsLc;

	@JsonProperty("labels_old")
	private String labelsOld;

	@JsonProperty("nutrient_levels_tags")
	private List<String> nutrientLevelsTags;

	@JsonProperty("categories")
	private String categories;

	@JsonProperty("sources_fields")
	private SourcesFields sourcesFields;

	@JsonProperty("interface_version_created")
	private String interfaceVersionCreated;

	@JsonProperty("ingredients_with_unspecified_percent_sum")
	private int ingredientsWithUnspecifiedPercentSum;

	@JsonProperty("creator")
	private String creator;

	@JsonProperty("countries_debug_tags")
	private List<Object> countriesDebugTags;

	@JsonProperty("ecoscore_data")
	private EcoscoreData ecoscoreData;

	@JsonProperty("purchase_places_tags")
	private List<Object> purchasePlacesTags;

	@JsonProperty("stores")
	private String stores;

	@JsonProperty("nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients_value")
	private int nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue;

	@JsonProperty("traces_from_user")
	private String tracesFromUser;

	@JsonProperty("nutrition_data_prepared_per_imported")
	private String nutritionDataPreparedPerImported;

	@JsonProperty("countries_tags")
	private List<String> countriesTags;

	@JsonProperty("data_sources")
	private String dataSources;

	@JsonProperty("nova_group_debug")
	private String novaGroupDebug;

	@JsonProperty("ingredients_text")
	private String ingredientsText;

	@JsonProperty("ingredients_text_debug")
	private String ingredientsTextDebug;

	@JsonProperty("created_t")
	private int createdT;

	@JsonProperty("lc")
	private String lc;

	@JsonProperty("nutrition_data_per_debug_tags")
	private List<Object> nutritionDataPerDebugTags;

	@JsonProperty("compared_to_category")
	private String comparedToCategory;

	@JsonProperty("origins_hierarchy")
	private List<String> originsHierarchy;

	@JsonProperty("selected_images")
	private SelectedImages selectedImages;

	@JsonProperty("data_quality_errors_tags")
	private List<Object> dataQualityErrorsTags;

	@JsonProperty("complete")
	private int complete;

	@JsonProperty("pnns_groups_1")
	private String pnnsGroups1;

	@JsonProperty("pnns_groups_2")
	private String pnnsGroups2;

	@JsonProperty("labels_tags")
	private List<String> labelsTags;

	@JsonProperty("packaging_debug_tags")
	private List<Object> packagingDebugTags;

	@JsonProperty("data_quality_warnings_tags")
	private List<String> dataQualityWarningsTags;

	@JsonProperty("packaging_tags")
	private List<String> packagingTags;

	@JsonProperty("known_ingredients_n")
	private int knownIngredientsN;

	@JsonProperty("update_key")
	private String updateKey;

	@JsonProperty("minerals_prev_tags")
	private List<Object> mineralsPrevTags;

	@JsonProperty("manufacturing_places_debug_tags")
	private List<Object> manufacturingPlacesDebugTags;

	@JsonProperty("_keywords")
	private List<String> keywords;

	@JsonProperty("product_name_en")
	private String productNameEn;

	@JsonProperty("categories_properties")
	private CategoriesProperties categoriesProperties;

	@JsonProperty("informers_tags")
	private List<String> informersTags;

	@JsonProperty("emb_codes")
	private String embCodes;

	@JsonProperty("generic_name")
	private String genericName;

	@JsonProperty("last_editor")
	private String lastEditor;

	@JsonProperty("traces")
	private String traces;

	@JsonProperty("ingredients_text_en_debug_tags")
	private List<Object> ingredientsTextEnDebugTags;

	@JsonProperty("ingredients_that_may_be_from_palm_oil_n")
	private int ingredientsThatMayBeFromPalmOilN;

	@JsonProperty("traces_hierarchy")
	private List<String> tracesHierarchy;

	@JsonProperty("product_name")
	private String productName;

	@JsonProperty("minerals_tags")
	private List<Object> mineralsTags;

	@JsonProperty("photographers_tags")
	private List<String> photographersTags;

	@JsonProperty("countries_lc")
	private String countriesLc;

	@JsonProperty("data_sources_imported")
	private String dataSourcesImported;

	@JsonProperty("states_hierarchy")
	private List<String> statesHierarchy;

	@JsonProperty("_id")
	private String _id;

	@JsonProperty("interface_version_modified")
	private String interfaceVersionModified;

	@JsonProperty("ingredients_percent_analysis")
	private int ingredientsPercentAnalysis;

	@JsonProperty("expiration_date_debug_tags")
	private List<Object> expirationDateDebugTags;

	@JsonProperty("code")
	private String code;

	@JsonProperty("ingredients_from_palm_oil_n")
	private int ingredientsFromPalmOilN;

	@JsonProperty("brand_owner_imported")
	private String brandOwnerImported;

	@JsonProperty("misc_tags")
	private List<String> miscTags;

	@JsonProperty("link")
	private String link;

	@JsonProperty("ingredients_with_unspecified_percent_n")
	private int ingredientsWithUnspecifiedPercentN;

	@JsonProperty("stores_debug_tags")
	private List<Object> storesDebugTags;

	@JsonProperty("additives_n")
	private int additivesN;

	@JsonProperty("categories_tags")
	private List<String> categoriesTags;

	@JsonProperty("unknown_ingredients_n")
	private int unknownIngredientsN;

	@JsonProperty("nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients")
	private int nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients;

	@JsonProperty("lc_imported")
	private String lcImported;

	@JsonProperty("nutrition_data_per")
	private String nutritionDataPer;

	@JsonProperty("additives_prev_original_tags")
	private List<String> additivesPrevOriginalTags;

	@JsonProperty("ingredients_hierarchy")
	private List<String> ingredientsHierarchy;

	@JsonProperty("lang")
	private String lang;

	@JsonProperty("editors")
	private List<String> editors;

	@JsonProperty("image_front_url")
	private String imageFrontUrl;

	@JsonProperty("countries_hierarchy")
	private List<String> countriesHierarchy;

	@JsonProperty("scans_n")
	private int scansN;

	@JsonProperty("quantity")
	private String quantity;

	@JsonProperty("last_modified_by")
	private String lastModifiedBy;

	@JsonProperty("nucleotides_prev_tags")
	private List<Object> nucleotidesPrevTags;

	@JsonProperty("popularity_tags")
	private List<String> popularityTags;

	@JsonProperty("ingredients_that_may_be_from_palm_oil_tags")
	private List<Object> ingredientsThatMayBeFromPalmOilTags;

	@JsonProperty("nutrition_grades_tags")
	private List<String> nutritionGradesTags;

	@JsonProperty("nutriscore_data")
	private NutriscoreData nutriscoreData;

	@JsonProperty("nutrition_data_per_imported")
	private String nutritionDataPerImported;

	@JsonProperty("last_image_t")
	private int lastImageT;

	@JsonProperty("nutrition_score_beverage")
	private int nutritionScoreBeverage;

    /**
     * Get emb codes debug tags list.
     *
     * @return the list
     */
    public List<Object> getEmbCodesDebugTags(){
		return embCodesDebugTags;
	}

    /**
     * Get countries imported string.
     *
     * @return the string
     */
    public String getCountriesImported(){
		return countriesImported;
	}

    /**
     * Get vitamins tags list.
     *
     * @return the list
     */
    public List<Object> getVitaminsTags(){
		return vitaminsTags;
	}

    /**
     * Get allergens from ingredients string.
     *
     * @return the string
     */
    public String getAllergensFromIngredients(){
		return allergensFromIngredients;
	}

    /**
     * Get ingredients original tags list.
     *
     * @return the list
     */
    public List<String> getIngredientsOriginalTags(){
		return ingredientsOriginalTags;
	}

    /**
     * Get category properties category properties.
     *
     * @return the category properties
     */
    public CategoryProperties getCategoryProperties(){
		return categoryProperties;
	}

    /**
     * Get serving size imported string.
     *
     * @return the string
     */
    public String getServingSizeImported(){
		return servingSizeImported;
	}

    /**
     * Get new additives n int.
     *
     * @return the int
     */
    public int getNewAdditivesN(){
		return newAdditivesN;
	}

    /**
     * Get categories imported string.
     *
     * @return the string
     */
    public String getCategoriesImported(){
		return categoriesImported;
	}

    /**
     * Get added countries tags list.
     *
     * @return the list
     */
    public List<Object> getAddedCountriesTags(){
		return addedCountriesTags;
	}

    /**
     * Get nutriments nutriments.
     *
     * @return the nutriments
     */
    public Nutriments getNutriments(){
		return nutriments;
	}

    /**
     * Get photographers list.
     *
     * @return the list
     */
    public List<String> getPhotographers(){
		return photographers;
	}

    /**
     * Get nutrition data prepared per debug tags list.
     *
     * @return the list
     */
    public List<Object> getNutritionDataPreparedPerDebugTags(){
		return nutritionDataPreparedPerDebugTags;
	}

    /**
     * Get codes tags list.
     *
     * @return the list
     */
    public List<String> getCodesTags(){
		return codesTags;
	}

    /**
     * Get nutrient levels nutrient levels.
     *
     * @return the nutrient levels
     */
    public NutrientLevels getNutrientLevels(){
		return nutrientLevels;
	}

    /**
     * Get additives tags list.
     *
     * @return the list
     */
    public List<String> getAdditivesTags(){
		return additivesTags;
	}

    /**
     * Get brands tags list.
     *
     * @return the list
     */
    public List<String> getBrandsTags(){
		return brandsTags;
	}

    /**
     * Get image ingredients thumb url string.
     *
     * @return the string
     */
    public String getImageIngredientsThumbUrl(){
		return imageIngredientsThumbUrl;
	}

    /**
     * Get last image dates tags list.
     *
     * @return the list
     */
    public List<String> getLastImageDatesTags(){
		return lastImageDatesTags;
	}

    /**
     * Get nucleotides tags list.
     *
     * @return the list
     */
    public List<Object> getNucleotidesTags(){
		return nucleotidesTags;
	}

    /**
     * Get popularity key long.
     *
     * @return the long
     */
    public long getPopularityKey(){
		return popularityKey;
	}

    /**
     * Get ingredients n tags list.
     *
     * @return the list
     */
    public List<String> getIngredientsNTags(){
		return ingredientsNTags;
	}

    /**
     * Get countries string.
     *
     * @return the string
     */
    public String getCountries(){
		return countries;
	}

    /**
     * Get labels string.
     *
     * @return the string
     */
    public String getLabels(){
		return labels;
	}

    /**
     * Get image front small url string.
     *
     * @return the string
     */
    public String getImageFrontSmallUrl(){
		return imageFrontSmallUrl;
	}

    /**
     * Get ingredients from or that may be from palm oil n int.
     *
     * @return the int
     */
    public int getIngredientsFromOrThatMayBeFromPalmOilN(){
		return ingredientsFromOrThatMayBeFromPalmOilN;
	}

    /**
     * Get nutrition grade fr string.
     *
     * @return the string
     */
    public String getNutritionGradeFr(){
		return nutritionGradeFr;
	}

    /**
     * Get cities tags list.
     *
     * @return the list
     */
    public List<Object> getCitiesTags(){
		return citiesTags;
	}

    /**
     * Get data quality tags list.
     *
     * @return the list
     */
    public List<String> getDataQualityTags(){
		return dataQualityTags;
	}

    /**
     * Get nova groups tags list.
     *
     * @return the list
     */
    public List<String> getNovaGroupsTags(){
		return novaGroupsTags;
	}

    /**
     * Get ingredients text en string.
     *
     * @return the string
     */
    public String getIngredientsTextEn(){
		return ingredientsTextEn;
	}

    /**
     * Get checkers tags list.
     *
     * @return the list
     */
    public List<Object> getCheckersTags(){
		return checkersTags;
	}

    /**
     * Get pnns groups 1 tags list.
     *
     * @return the list
     */
    public List<String> getPnnsGroups1Tags(){
		return pnnsGroups1Tags;
	}

    /**
     * Get languages codes languages codes.
     *
     * @return the languages codes
     */
    public LanguagesCodes getLanguagesCodes(){
		return languagesCodes;
	}

    /**
     * Get states tags list.
     *
     * @return the list
     */
    public List<String> getStatesTags(){
		return statesTags;
	}

    /**
     * Get brands debug tags list.
     *
     * @return the list
     */
    public List<Object> getBrandsDebugTags(){
		return brandsDebugTags;
	}

    /**
     * Get additives original tags list.
     *
     * @return the list
     */
    public List<String> getAdditivesOriginalTags(){
		return additivesOriginalTags;
	}

    /**
     * Get ingredients list.
     *
     * @return the list
     */
    public List<IngredientsItem> getIngredients(){
		return ingredients;
	}

    /**
     * Get origins string.
     *
     * @return the string
     */
    public String getOrigins(){
		return origins;
	}

    /**
     * Get serving size debug tags list.
     *
     * @return the list
     */
    public List<Object> getServingSizeDebugTags(){
		return servingSizeDebugTags;
	}

    /**
     * Get brands string.
     *
     * @return the string
     */
    public String getBrands(){
		return brands;
	}

    /**
     * Get labels lc string.
     *
     * @return the string
     */
    public String getLabelsLc(){
		return labelsLc;
	}

    /**
     * Get languages languages.
     *
     * @return the languages
     */
    public Languages getLanguages(){
		return languages;
	}

    /**
     * Get ciqual food name tags list.
     *
     * @return the list
     */
    public List<String> getCiqualFoodNameTags(){
		return ciqualFoodNameTags;
	}

    /**
     * Get ingredients text with allergens string.
     *
     * @return the string
     */
    public String getIngredientsTextWithAllergens(){
		return ingredientsTextWithAllergens;
	}

    /**
     * Get manufacturing places string.
     *
     * @return the string
     */
    public String getManufacturingPlaces(){
		return manufacturingPlaces;
	}

    /**
     * Get ingredients with specified percent sum int.
     *
     * @return the int
     */
    public int getIngredientsWithSpecifiedPercentSum(){
		return ingredientsWithSpecifiedPercentSum;
	}

    /**
     * Get categories hierarchy list.
     *
     * @return the list
     */
    public List<String> getCategoriesHierarchy(){
		return categoriesHierarchy;
	}

    /**
     * Get quantity debug tags list.
     *
     * @return the list
     */
    public List<Object> getQuantityDebugTags(){
		return quantityDebugTags;
	}

    /**
     * Get categories old string.
     *
     * @return the string
     */
    public String getCategoriesOld(){
		return categoriesOld;
	}

    /**
     * Get emb codes 20141016 string.
     *
     * @return the string
     */
    public String getEmbCodes20141016(){
		return embCodes20141016;
	}

    /**
     * Get additives tags n object.
     *
     * @return the object
     */
    public Object getAdditivesTagsN(){
		return additivesTagsN;
	}

    /**
     * Get editors tags list.
     *
     * @return the list
     */
    public List<String> getEditorsTags(){
		return editorsTags;
	}

    /**
     * Get origins tags list.
     *
     * @return the list
     */
    public List<String> getOriginsTags(){
		return originsTags;
	}

    /**
     * Get nutriscore grade string.
     *
     * @return the string
     */
    public String getNutriscoreGrade(){
		return nutriscoreGrade;
	}

    /**
     * Get additives old tags list.
     *
     * @return the list
     */
    public List<String> getAdditivesOldTags(){
		return additivesOldTags;
	}

    /**
     * Get completed t int.
     *
     * @return the int
     */
    public int getCompletedT(){
		return completedT;
	}

    /**
     * Get nutrition grades string.
     *
     * @return the string
     */
    public String getNutritionGrades(){
		return nutritionGrades;
	}

    /**
     * Get ingredients debug list.
     *
     * @return the list
     */
    public List<String> getIngredientsDebug(){
		return ingredientsDebug;
	}

    /**
     * Get correctors tags list.
     *
     * @return the list
     */
    public List<String> getCorrectorsTags(){
		return correctorsTags;
	}

    /**
     * Get removed countries tags list.
     *
     * @return the list
     */
    public List<Object> getRemovedCountriesTags(){
		return removedCountriesTags;
	}

    /**
     * Get emb codes tags list.
     *
     * @return the list
     */
    public List<Object> getEmbCodesTags(){
		return embCodesTags;
	}

    /**
     * Get debug param sorted langs list.
     *
     * @return the list
     */
    public List<String> getDebugParamSortedLangs(){
		return debugParamSortedLangs;
	}

    /**
     * Get image front thumb url string.
     *
     * @return the string
     */
    public String getImageFrontThumbUrl(){
		return imageFrontThumbUrl;
	}

    /**
     * Get ingredients tags list.
     *
     * @return the list
     */
    public List<String> getIngredientsTags(){
		return ingredientsTags;
	}

    /**
     * Get completeness double.
     *
     * @return the double
     */
    public double getCompleteness(){
		return completeness;
	}

    /**
     * Get expiration date string.
     *
     * @return the string
     */
    public String getExpirationDate(){
		return expirationDate;
	}

    /**
     * Get image nutrition url string.
     *
     * @return the string
     */
    public String getImageNutritionUrl(){
		return imageNutritionUrl;
	}

    /**
     * Get packagings list.
     *
     * @return the list
     */
    public List<PackagingsItem> getPackagings(){
		return packagings;
	}

    /**
     * Get nova group int.
     *
     * @return the int
     */
    public int getNovaGroup(){
		return novaGroup;
	}

    /**
     * Get nutrition data prepared string.
     *
     * @return the string
     */
    public String getNutritionDataPrepared(){
		return nutritionDataPrepared;
	}

    /**
     * Get nutriscore score int.
     *
     * @return the int
     */
    public int getNutriscoreScore(){
		return nutriscoreScore;
	}

    /**
     * Get languages tags list.
     *
     * @return the list
     */
    public List<String> getLanguagesTags(){
		return languagesTags;
	}

    /**
     * Get serving size string.
     *
     * @return the string
     */
    public String getServingSize(){
		return servingSize;
	}

    /**
     * Get ingredients ids debug list.
     *
     * @return the list
     */
    public List<String> getIngredientsIdsDebug(){
		return ingredientsIdsDebug;
	}

    /**
     * Get generic name en debug tags list.
     *
     * @return the list
     */
    public List<Object> getGenericNameEnDebugTags(){
		return genericNameEnDebugTags;
	}

    /**
     * Get rev int.
     *
     * @return the int
     */
    public int getRev(){
		return rev;
	}

    /**
     * Get ecoscore grade string.
     *
     * @return the string
     */
    public String getEcoscoreGrade(){
		return ecoscoreGrade;
	}

    /**
     * Get correctors list.
     *
     * @return the list
     */
    public List<String> getCorrectors(){
		return correctors;
	}

    /**
     * Get allergens from user string.
     *
     * @return the string
     */
    public String getAllergensFromUser(){
		return allergensFromUser;
	}

    /**
     * Get ingredients from palm oil tags list.
     *
     * @return the list
     */
    public List<Object> getIngredientsFromPalmOilTags(){
		return ingredientsFromPalmOilTags;
	}

    /**
     * Get link debug tags list.
     *
     * @return the list
     */
    public List<Object> getLinkDebugTags(){
		return linkDebugTags;
	}

    /**
     * Get labels hierarchy list.
     *
     * @return the list
     */
    public List<String> getLabelsHierarchy(){
		return labelsHierarchy;
	}

    /**
     * Get no nutrition data string.
     *
     * @return the string
     */
    public String getNoNutritionData(){
		return noNutritionData;
	}

    /**
     * Get brand owner string.
     *
     * @return the string
     */
    public String getBrandOwner(){
		return brandOwner;
	}

    /**
     * Get generic name en string.
     *
     * @return the string
     */
    public String getGenericNameEn(){
		return genericNameEn;
	}

    /**
     * Get product name en debug tags list.
     *
     * @return the list
     */
    public List<Object> getProductNameEnDebugTags(){
		return productNameEnDebugTags;
	}

    /**
     * Get sources list.
     *
     * @return the list
     */
    public List<SourcesItem> getSources(){
		return sources;
	}

    /**
     * Get checkers list.
     *
     * @return the list
     */
    public List<Object> getCheckers(){
		return checkers;
	}

    /**
     * Get ingredients with specified percent n int.
     *
     * @return the int
     */
    public int getIngredientsWithSpecifiedPercentN(){
		return ingredientsWithSpecifiedPercentN;
	}

    /**
     * Get unknown nutrients tags list.
     *
     * @return the list
     */
    public List<Object> getUnknownNutrientsTags(){
		return unknownNutrientsTags;
	}

    /**
     * Get nutriscore score opposite int.
     *
     * @return the int
     */
    public int getNutriscoreScoreOpposite(){
		return nutriscoreScoreOpposite;
	}

    /**
     * Get last edit dates tags list.
     *
     * @return the list
     */
    public List<String> getLastEditDatesTags(){
		return lastEditDatesTags;
	}

    /**
     * Get states string.
     *
     * @return the string
     */
    public String getStates(){
		return states;
	}

    /**
     * Get data quality bugs tags list.
     *
     * @return the list
     */
    public List<Object> getDataQualityBugsTags(){
		return dataQualityBugsTags;
	}

    /**
     * Get image ingredients url string.
     *
     * @return the string
     */
    public String getImageIngredientsUrl(){
		return imageIngredientsUrl;
	}

    /**
     * Get origins old string.
     *
     * @return the string
     */
    public String getOriginsOld(){
		return originsOld;
	}

    /**
     * Get other nutritional substances tags list.
     *
     * @return the list
     */
    public List<Object> getOtherNutritionalSubstancesTags(){
		return otherNutritionalSubstancesTags;
	}

    /**
     * Get vitamins prev tags list.
     *
     * @return the list
     */
    public List<Object> getVitaminsPrevTags(){
		return vitaminsPrevTags;
	}

    /**
     * Get nova groups string.
     *
     * @return the string
     */
    public String getNovaGroups(){
		return novaGroups;
	}

    /**
     * Get pnns groups 2 tags list.
     *
     * @return the list
     */
    public List<String> getPnnsGroups2Tags(){
		return pnnsGroups2Tags;
	}

    /**
     * Get image nutrition thumb url string.
     *
     * @return the string
     */
    public String getImageNutritionThumbUrl(){
		return imageNutritionThumbUrl;
	}

    /**
     * Get serving quantity string.
     *
     * @return the string
     */
    public String getServingQuantity(){
		return servingQuantity;
	}

    /**
     * Get data quality info tags list.
     *
     * @return the list
     */
    public List<String> getDataQualityInfoTags(){
		return dataQualityInfoTags;
	}

    /**
     * Get last modified t int.
     *
     * @return the int
     */
    public int getLastModifiedT(){
		return lastModifiedT;
	}

    /**
     * Get packaging string.
     *
     * @return the string
     */
    public String getPackaging(){
		return packaging;
	}

    /**
     * Get amino acids prev tags list.
     *
     * @return the list
     */
    public List<Object> getAminoAcidsPrevTags(){
		return aminoAcidsPrevTags;
	}

    /**
     * Get emb codes orig string.
     *
     * @return the string
     */
    public String getEmbCodesOrig(){
		return embCodesOrig;
	}

    /**
     * Get image thumb url string.
     *
     * @return the string
     */
    public String getImageThumbUrl(){
		return imageThumbUrl;
	}

    /**
     * Get allergens string.
     *
     * @return the string
     */
    public String getAllergens(){
		return allergens;
	}

    /**
     * Get ingredients analysis tags list.
     *
     * @return the list
     */
    public List<String> getIngredientsAnalysisTags(){
		return ingredientsAnalysisTags;
	}

    /**
     * Get additives old n int.
     *
     * @return the int
     */
    public int getAdditivesOldN(){
		return additivesOldN;
	}

    /**
     * Get data sources tags list.
     *
     * @return the list
     */
    public List<String> getDataSourcesTags(){
		return dataSourcesTags;
	}

    /**
     * Get lang debug tags list.
     *
     * @return the list
     */
    public List<Object> getLangDebugTags(){
		return langDebugTags;
	}

    /**
     * Get max imgid string.
     *
     * @return the string
     */
    public String getMaxImgid(){
		return maxImgid;
	}

    /**
     * Get ingredients n int.
     *
     * @return the int
     */
    public int getIngredientsN(){
		return ingredientsN;
	}

    /**
     * Get allergens hierarchy list.
     *
     * @return the list
     */
    public List<String> getAllergensHierarchy(){
		return allergensHierarchy;
	}

    /**
     * Get stores tags list.
     *
     * @return the list
     */
    public List<Object> getStoresTags(){
		return storesTags;
	}

    /**
     * Get ecoscore tags list.
     *
     * @return the list
     */
    public List<String> getEcoscoreTags(){
		return ecoscoreTags;
	}

    /**
     * Get nutrition data string.
     *
     * @return the string
     */
    public String getNutritionData(){
		return nutritionData;
	}

    /**
     * Get additives debug tags list.
     *
     * @return the list
     */
    public List<Object> getAdditivesDebugTags(){
		return additivesDebugTags;
	}

    /**
     * Get languages hierarchy list.
     *
     * @return the list
     */
    public List<String> getLanguagesHierarchy(){
		return languagesHierarchy;
	}

    /**
     * Get traces debug tags list.
     *
     * @return the list
     */
    public List<Object> getTracesDebugTags(){
		return tracesDebugTags;
	}

    /**
     * Get unique scans n int.
     *
     * @return the int
     */
    public int getUniqueScansN(){
		return uniqueScansN;
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
     * Get amino acids tags list.
     *
     * @return the list
     */
    public List<Object> getAminoAcidsTags(){
		return aminoAcidsTags;
	}

    /**
     * Get image small url string.
     *
     * @return the string
     */
    public String getImageSmallUrl(){
		return imageSmallUrl;
	}

    /**
     * Get images images.
     *
     * @return the images
     */
    public Images getImages(){
		return images;
	}

    /**
     * Get image url string.
     *
     * @return the string
     */
    public String getImageUrl(){
		return imageUrl;
	}

    /**
     * Get image ingredients small url string.
     *
     * @return the string
     */
    public String getImageIngredientsSmallUrl(){
		return imageIngredientsSmallUrl;
	}

    /**
     * Get product name en imported string.
     *
     * @return the string
     */
    public String getProductNameEnImported(){
		return productNameEnImported;
	}

    /**
     * Get entry dates tags list.
     *
     * @return the list
     */
    public List<String> getEntryDatesTags(){
		return entryDatesTags;
	}

    /**
     * Get informers list.
     *
     * @return the list
     */
    public List<String> getInformers(){
		return informers;
	}

    /**
     * Get purchase places string.
     *
     * @return the string
     */
    public String getPurchasePlaces(){
		return purchasePlaces;
	}

    /**
     * Get traces tags list.
     *
     * @return the list
     */
    public List<String> getTracesTags(){
		return tracesTags;
	}

    /**
     * Get fruits vegetables nuts 100 g estimate int.
     *
     * @return the int
     */
    public int getFruitsVegetablesNuts100gEstimate(){
		return fruitsVegetablesNuts100gEstimate;
	}

    /**
     * Get image nutrition small url string.
     *
     * @return the string
     */
    public String getImageNutritionSmallUrl(){
		return imageNutritionSmallUrl;
	}

    /**
     * Get ingredients text with allergens en string.
     *
     * @return the string
     */
    public String getIngredientsTextWithAllergensEn(){
		return ingredientsTextWithAllergensEn;
	}

    /**
     * Get categories lc string.
     *
     * @return the string
     */
    public String getCategoriesLc(){
		return categoriesLc;
	}

    /**
     * Get manufacturing places tags list.
     *
     * @return the list
     */
    public List<Object> getManufacturingPlacesTags(){
		return manufacturingPlacesTags;
	}

    /**
     * Get main countries tags list.
     *
     * @return the list
     */
    public List<Object> getMainCountriesTags(){
		return mainCountriesTags;
	}

    /**
     * Get categories properties tags list.
     *
     * @return the list
     */
    public List<String> getCategoriesPropertiesTags(){
		return categoriesPropertiesTags;
	}

    /**
     * Get allergens tags list.
     *
     * @return the list
     */
    public List<String> getAllergensTags(){
		return allergensTags;
	}

    /**
     * Get product quantity string.
     *
     * @return the string
     */
    public String getProductQuantity(){
		return productQuantity;
	}

    /**
     * Get sortkey int.
     *
     * @return the int
     */
    public int getSortkey(){
		return sortkey;
	}

    /**
     * Get traces from ingredients string.
     *
     * @return the string
     */
    public String getTracesFromIngredients(){
		return tracesFromIngredients;
	}

    /**
     * Get nutrition data prepared per string.
     *
     * @return the string
     */
    public String getNutritionDataPreparedPer(){
		return nutritionDataPreparedPer;
	}

    /**
     * Get ingredients text en imported string.
     *
     * @return the string
     */
    public String getIngredientsTextEnImported(){
		return ingredientsTextEnImported;
	}

    /**
     * Get purchase places debug tags list.
     *
     * @return the list
     */
    public List<Object> getPurchasePlacesDebugTags(){
		return purchasePlacesDebugTags;
	}

    /**
     * Get origins lc string.
     *
     * @return the string
     */
    public String getOriginsLc(){
		return originsLc;
	}

    /**
     * Get labels old string.
     *
     * @return the string
     */
    public String getLabelsOld(){
		return labelsOld;
	}

    /**
     * Get nutrient levels tags list.
     *
     * @return the list
     */
    public List<String> getNutrientLevelsTags(){
		return nutrientLevelsTags;
	}

    /**
     * Get categories string.
     *
     * @return the string
     */
    public String getCategories(){
		return categories;
	}

    /**
     * Get sources fields sources fields.
     *
     * @return the sources fields
     */
    public SourcesFields getSourcesFields(){
		return sourcesFields;
	}

    /**
     * Get interface version created string.
     *
     * @return the string
     */
    public String getInterfaceVersionCreated(){
		return interfaceVersionCreated;
	}

    /**
     * Get ingredients with unspecified percent sum int.
     *
     * @return the int
     */
    public int getIngredientsWithUnspecifiedPercentSum(){
		return ingredientsWithUnspecifiedPercentSum;
	}

    /**
     * Get creator string.
     *
     * @return the string
     */
    public String getCreator(){
		return creator;
	}

    /**
     * Get countries debug tags list.
     *
     * @return the list
     */
    public List<Object> getCountriesDebugTags(){
		return countriesDebugTags;
	}

    /**
     * Get ecoscore data ecoscore data.
     *
     * @return the ecoscore data
     */
    public EcoscoreData getEcoscoreData(){
		return ecoscoreData;
	}

    /**
     * Get purchase places tags list.
     *
     * @return the list
     */
    public List<Object> getPurchasePlacesTags(){
		return purchasePlacesTags;
	}

    /**
     * Get stores string.
     *
     * @return the string
     */
    public String getStores(){
		return stores;
	}

    /**
     * Get nutrition score warning fruits vegetables nuts estimate from ingredients value int.
     *
     * @return the int
     */
    public int getNutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue(){
		return nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue;
	}

    /**
     * Get traces from user string.
     *
     * @return the string
     */
    public String getTracesFromUser(){
		return tracesFromUser;
	}

    /**
     * Get nutrition data prepared per imported string.
     *
     * @return the string
     */
    public String getNutritionDataPreparedPerImported(){
		return nutritionDataPreparedPerImported;
	}

    /**
     * Get countries tags list.
     *
     * @return the list
     */
    public List<String> getCountriesTags(){
		return countriesTags;
	}

    /**
     * Get data sources string.
     *
     * @return the string
     */
    public String getDataSources(){
		return dataSources;
	}

    /**
     * Get nova group debug string.
     *
     * @return the string
     */
    public String getNovaGroupDebug(){
		return novaGroupDebug;
	}

    /**
     * Get ingredients text string.
     *
     * @return the string
     */
    public String getIngredientsText(){
		return ingredientsText;
	}

    /**
     * Get ingredients text debug string.
     *
     * @return the string
     */
    public String getIngredientsTextDebug(){
		return ingredientsTextDebug;
	}

    /**
     * Get created t int.
     *
     * @return the int
     */
    public int getCreatedT(){
		return createdT;
	}

    /**
     * Get lc string.
     *
     * @return the string
     */
    public String getLc(){
		return lc;
	}

    /**
     * Get nutrition data per debug tags list.
     *
     * @return the list
     */
    public List<Object> getNutritionDataPerDebugTags(){
		return nutritionDataPerDebugTags;
	}

    /**
     * Get compared to category string.
     *
     * @return the string
     */
    public String getComparedToCategory(){
		return comparedToCategory;
	}

    /**
     * Get origins hierarchy list.
     *
     * @return the list
     */
    public List<String> getOriginsHierarchy(){
		return originsHierarchy;
	}

    /**
     * Get selected images selected images.
     *
     * @return the selected images
     */
    public SelectedImages getSelectedImages(){
		return selectedImages;
	}

    /**
     * Get data quality errors tags list.
     *
     * @return the list
     */
    public List<Object> getDataQualityErrorsTags(){
		return dataQualityErrorsTags;
	}

    /**
     * Get complete int.
     *
     * @return the int
     */
    public int getComplete(){
		return complete;
	}

    /**
     * Get pnns groups 1 string.
     *
     * @return the string
     */
    public String getPnnsGroups1(){
		return pnnsGroups1;
	}

    /**
     * Get pnns groups 2 string.
     *
     * @return the string
     */
    public String getPnnsGroups2(){
		return pnnsGroups2;
	}

    /**
     * Get labels tags list.
     *
     * @return the list
     */
    public List<String> getLabelsTags(){
		return labelsTags;
	}

    /**
     * Get packaging debug tags list.
     *
     * @return the list
     */
    public List<Object> getPackagingDebugTags(){
		return packagingDebugTags;
	}

    /**
     * Get data quality warnings tags list.
     *
     * @return the list
     */
    public List<String> getDataQualityWarningsTags(){
		return dataQualityWarningsTags;
	}

    /**
     * Get packaging tags list.
     *
     * @return the list
     */
    public List<String> getPackagingTags(){
		return packagingTags;
	}

    /**
     * Get known ingredients n int.
     *
     * @return the int
     */
    public int getKnownIngredientsN(){
		return knownIngredientsN;
	}

    /**
     * Get update key string.
     *
     * @return the string
     */
    public String getUpdateKey(){
		return updateKey;
	}

    /**
     * Get minerals prev tags list.
     *
     * @return the list
     */
    public List<Object> getMineralsPrevTags(){
		return mineralsPrevTags;
	}

    /**
     * Get manufacturing places debug tags list.
     *
     * @return the list
     */
    public List<Object> getManufacturingPlacesDebugTags(){
		return manufacturingPlacesDebugTags;
	}

    /**
     * Get keywords list.
     *
     * @return the list
     */
    public List<String> getKeywords(){
		return keywords;
	}

    /**
     * Get product name en string.
     *
     * @return the string
     */
    public String getProductNameEn(){
		return productNameEn;
	}

    /**
     * Get categories properties categories properties.
     *
     * @return the categories properties
     */
    public CategoriesProperties getCategoriesProperties(){
		return categoriesProperties;
	}

    /**
     * Get informers tags list.
     *
     * @return the list
     */
    public List<String> getInformersTags(){
		return informersTags;
	}

    /**
     * Get emb codes string.
     *
     * @return the string
     */
    public String getEmbCodes(){
		return embCodes;
	}

    /**
     * Get generic name string.
     *
     * @return the string
     */
    public String getGenericName(){
		return genericName;
	}

    /**
     * Get last editor string.
     *
     * @return the string
     */
    public String getLastEditor(){
		return lastEditor;
	}

    /**
     * Get traces string.
     *
     * @return the string
     */
    public String getTraces(){
		return traces;
	}

    /**
     * Get ingredients text en debug tags list.
     *
     * @return the list
     */
    public List<Object> getIngredientsTextEnDebugTags(){
		return ingredientsTextEnDebugTags;
	}

    /**
     * Get ingredients that may be from palm oil n int.
     *
     * @return the int
     */
    public int getIngredientsThatMayBeFromPalmOilN(){
		return ingredientsThatMayBeFromPalmOilN;
	}

    /**
     * Get traces hierarchy list.
     *
     * @return the list
     */
    public List<String> getTracesHierarchy(){
		return tracesHierarchy;
	}

    /**
     * Get product name string.
     *
     * @return the string
     */
    public String getProductName(){
		return productName;
	}

    /**
     * Get minerals tags list.
     *
     * @return the list
     */
    public List<Object> getMineralsTags(){
		return mineralsTags;
	}

    /**
     * Get photographers tags list.
     *
     * @return the list
     */
    public List<String> getPhotographersTags(){
		return photographersTags;
	}

    /**
     * Get countries lc string.
     *
     * @return the string
     */
    public String getCountriesLc(){
		return countriesLc;
	}

    /**
     * Get data sources imported string.
     *
     * @return the string
     */
    public String getDataSourcesImported(){
		return dataSourcesImported;
	}

    /**
     * Get states hierarchy list.
     *
     * @return the list
     */
    public List<String> getStatesHierarchy(){
		return statesHierarchy;
	}

    /**
     * Get id string.
     *
     * @return the string
     */
    public String get_Id(){
		return _id;
	}

    /**
     * Get interface version modified string.
     *
     * @return the string
     */
    public String getInterfaceVersionModified(){
		return interfaceVersionModified;
	}

    /**
     * Get ingredients percent analysis int.
     *
     * @return the int
     */
    public int getIngredientsPercentAnalysis(){
		return ingredientsPercentAnalysis;
	}

    /**
     * Get expiration date debug tags list.
     *
     * @return the list
     */
    public List<Object> getExpirationDateDebugTags(){
		return expirationDateDebugTags;
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
     * Get ingredients from palm oil n int.
     *
     * @return the int
     */
    public int getIngredientsFromPalmOilN(){
		return ingredientsFromPalmOilN;
	}

    /**
     * Get brand owner imported string.
     *
     * @return the string
     */
    public String getBrandOwnerImported(){
		return brandOwnerImported;
	}

    /**
     * Get misc tags list.
     *
     * @return the list
     */
    public List<String> getMiscTags(){
		return miscTags;
	}

    /**
     * Get link string.
     *
     * @return the string
     */
    public String getLink(){
		return link;
	}

    /**
     * Get ingredients with unspecified percent n int.
     *
     * @return the int
     */
    public int getIngredientsWithUnspecifiedPercentN(){
		return ingredientsWithUnspecifiedPercentN;
	}

    /**
     * Get stores debug tags list.
     *
     * @return the list
     */
    public List<Object> getStoresDebugTags(){
		return storesDebugTags;
	}

    /**
     * Get additives n int.
     *
     * @return the int
     */
    public int getAdditivesN(){
		return additivesN;
	}

    /**
     * Get categories tags list.
     *
     * @return the list
     */
    public List<String> getCategoriesTags(){
		return categoriesTags;
	}

    /**
     * Get unknown ingredients n int.
     *
     * @return the int
     */
    public int getUnknownIngredientsN(){
		return unknownIngredientsN;
	}

    /**
     * Get nutrition score warning fruits vegetables nuts estimate from ingredients int.
     *
     * @return the int
     */
    public int getNutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients(){
		return nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients;
	}

    /**
     * Get lc imported string.
     *
     * @return the string
     */
    public String getLcImported(){
		return lcImported;
	}

    /**
     * Get nutrition data per string.
     *
     * @return the string
     */
    public String getNutritionDataPer(){
		return nutritionDataPer;
	}

    /**
     * Get additives prev original tags list.
     *
     * @return the list
     */
    public List<String> getAdditivesPrevOriginalTags(){
		return additivesPrevOriginalTags;
	}

    /**
     * Get ingredients hierarchy list.
     *
     * @return the list
     */
    public List<String> getIngredientsHierarchy(){
		return ingredientsHierarchy;
	}

    /**
     * Get lang string.
     *
     * @return the string
     */
    public String getLang(){
		return lang;
	}

    /**
     * Get editors list.
     *
     * @return the list
     */
    public List<String> getEditors(){
		return editors;
	}

    /**
     * Get image front url string.
     *
     * @return the string
     */
    public String getImageFrontUrl(){
		return imageFrontUrl;
	}

    /**
     * Get countries hierarchy list.
     *
     * @return the list
     */
    public List<String> getCountriesHierarchy(){
		return countriesHierarchy;
	}

    /**
     * Get scans n int.
     *
     * @return the int
     */
    public int getScansN(){
		return scansN;
	}

    /**
     * Get quantity string.
     *
     * @return the string
     */
    public String getQuantity(){
		return quantity;
	}

    /**
     * Get last modified by string.
     *
     * @return the string
     */
    public String getLastModifiedBy(){
		return lastModifiedBy;
	}

    /**
     * Get nucleotides prev tags list.
     *
     * @return the list
     */
    public List<Object> getNucleotidesPrevTags(){
		return nucleotidesPrevTags;
	}

    /**
     * Get popularity tags list.
     *
     * @return the list
     */
    public List<String> getPopularityTags(){
		return popularityTags;
	}

    /**
     * Get ingredients that may be from palm oil tags list.
     *
     * @return the list
     */
    public List<Object> getIngredientsThatMayBeFromPalmOilTags(){
		return ingredientsThatMayBeFromPalmOilTags;
	}

    /**
     * Get nutrition grades tags list.
     *
     * @return the list
     */
    public List<String> getNutritionGradesTags(){
		return nutritionGradesTags;
	}

    /**
     * Get nutriscore data nutriscore data.
     *
     * @return the nutriscore data
     */
    public NutriscoreData getNutriscoreData(){
		return nutriscoreData;
	}

    /**
     * Get nutrition data per imported string.
     *
     * @return the string
     */
    public String getNutritionDataPerImported(){
		return nutritionDataPerImported;
	}

    /**
     * Get last image t int.
     *
     * @return the int
     */
    public int getLastImageT(){
		return lastImageT;
	}

    /**
     * Get nutrition score beverage int.
     *
     * @return the int
     */
    public int getNutritionScoreBeverage(){
		return nutritionScoreBeverage;
	}
}