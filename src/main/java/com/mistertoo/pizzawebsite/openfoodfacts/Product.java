package com.mistertoo.pizzawebsite.openfoodfacts;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

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

	public List<Object> getEmbCodesDebugTags(){
		return embCodesDebugTags;
	}

	public String getCountriesImported(){
		return countriesImported;
	}

	public List<Object> getVitaminsTags(){
		return vitaminsTags;
	}

	public String getAllergensFromIngredients(){
		return allergensFromIngredients;
	}

	public List<String> getIngredientsOriginalTags(){
		return ingredientsOriginalTags;
	}

	public CategoryProperties getCategoryProperties(){
		return categoryProperties;
	}

	public String getServingSizeImported(){
		return servingSizeImported;
	}

	public int getNewAdditivesN(){
		return newAdditivesN;
	}

	public String getCategoriesImported(){
		return categoriesImported;
	}

	public List<Object> getAddedCountriesTags(){
		return addedCountriesTags;
	}

	public Nutriments getNutriments(){
		return nutriments;
	}

	public List<String> getPhotographers(){
		return photographers;
	}

	public List<Object> getNutritionDataPreparedPerDebugTags(){
		return nutritionDataPreparedPerDebugTags;
	}

	public List<String> getCodesTags(){
		return codesTags;
	}

	public NutrientLevels getNutrientLevels(){
		return nutrientLevels;
	}

	public List<String> getAdditivesTags(){
		return additivesTags;
	}

	public List<String> getBrandsTags(){
		return brandsTags;
	}

	public String getImageIngredientsThumbUrl(){
		return imageIngredientsThumbUrl;
	}

	public List<String> getLastImageDatesTags(){
		return lastImageDatesTags;
	}

	public List<Object> getNucleotidesTags(){
		return nucleotidesTags;
	}

	public long getPopularityKey(){
		return popularityKey;
	}

	public List<String> getIngredientsNTags(){
		return ingredientsNTags;
	}

	public String getCountries(){
		return countries;
	}

	public String getLabels(){
		return labels;
	}

	public String getImageFrontSmallUrl(){
		return imageFrontSmallUrl;
	}

	public int getIngredientsFromOrThatMayBeFromPalmOilN(){
		return ingredientsFromOrThatMayBeFromPalmOilN;
	}

	public String getNutritionGradeFr(){
		return nutritionGradeFr;
	}

	public List<Object> getCitiesTags(){
		return citiesTags;
	}

	public List<String> getDataQualityTags(){
		return dataQualityTags;
	}

	public List<String> getNovaGroupsTags(){
		return novaGroupsTags;
	}

	public String getIngredientsTextEn(){
		return ingredientsTextEn;
	}

	public List<Object> getCheckersTags(){
		return checkersTags;
	}

	public List<String> getPnnsGroups1Tags(){
		return pnnsGroups1Tags;
	}

	public LanguagesCodes getLanguagesCodes(){
		return languagesCodes;
	}

	public List<String> getStatesTags(){
		return statesTags;
	}

	public List<Object> getBrandsDebugTags(){
		return brandsDebugTags;
	}

	public List<String> getAdditivesOriginalTags(){
		return additivesOriginalTags;
	}

	public List<IngredientsItem> getIngredients(){
		return ingredients;
	}

	public String getOrigins(){
		return origins;
	}

	public List<Object> getServingSizeDebugTags(){
		return servingSizeDebugTags;
	}

	public String getBrands(){
		return brands;
	}

	public String getLabelsLc(){
		return labelsLc;
	}

	public Languages getLanguages(){
		return languages;
	}

	public List<String> getCiqualFoodNameTags(){
		return ciqualFoodNameTags;
	}

	public String getIngredientsTextWithAllergens(){
		return ingredientsTextWithAllergens;
	}

	public String getManufacturingPlaces(){
		return manufacturingPlaces;
	}

	public int getIngredientsWithSpecifiedPercentSum(){
		return ingredientsWithSpecifiedPercentSum;
	}

	public List<String> getCategoriesHierarchy(){
		return categoriesHierarchy;
	}

	public List<Object> getQuantityDebugTags(){
		return quantityDebugTags;
	}

	public String getCategoriesOld(){
		return categoriesOld;
	}

	public String getEmbCodes20141016(){
		return embCodes20141016;
	}

	public Object getAdditivesTagsN(){
		return additivesTagsN;
	}

	public List<String> getEditorsTags(){
		return editorsTags;
	}

	public List<String> getOriginsTags(){
		return originsTags;
	}

	public String getNutriscoreGrade(){
		return nutriscoreGrade;
	}

	public List<String> getAdditivesOldTags(){
		return additivesOldTags;
	}

	public int getCompletedT(){
		return completedT;
	}

	public String getNutritionGrades(){
		return nutritionGrades;
	}

	public List<String> getIngredientsDebug(){
		return ingredientsDebug;
	}

	public List<String> getCorrectorsTags(){
		return correctorsTags;
	}

	public List<Object> getRemovedCountriesTags(){
		return removedCountriesTags;
	}

	public List<Object> getEmbCodesTags(){
		return embCodesTags;
	}

	public List<String> getDebugParamSortedLangs(){
		return debugParamSortedLangs;
	}

	public String getImageFrontThumbUrl(){
		return imageFrontThumbUrl;
	}

	public List<String> getIngredientsTags(){
		return ingredientsTags;
	}

	public double getCompleteness(){
		return completeness;
	}

	public String getExpirationDate(){
		return expirationDate;
	}

	public String getImageNutritionUrl(){
		return imageNutritionUrl;
	}

	public List<PackagingsItem> getPackagings(){
		return packagings;
	}

	public int getNovaGroup(){
		return novaGroup;
	}

	public String getNutritionDataPrepared(){
		return nutritionDataPrepared;
	}

	public int getNutriscoreScore(){
		return nutriscoreScore;
	}

	public List<String> getLanguagesTags(){
		return languagesTags;
	}

	public String getServingSize(){
		return servingSize;
	}

	public List<String> getIngredientsIdsDebug(){
		return ingredientsIdsDebug;
	}

	public List<Object> getGenericNameEnDebugTags(){
		return genericNameEnDebugTags;
	}

	public int getRev(){
		return rev;
	}

	public String getEcoscoreGrade(){
		return ecoscoreGrade;
	}

	public List<String> getCorrectors(){
		return correctors;
	}

	public String getAllergensFromUser(){
		return allergensFromUser;
	}

	public List<Object> getIngredientsFromPalmOilTags(){
		return ingredientsFromPalmOilTags;
	}

	public List<Object> getLinkDebugTags(){
		return linkDebugTags;
	}

	public List<String> getLabelsHierarchy(){
		return labelsHierarchy;
	}

	public String getNoNutritionData(){
		return noNutritionData;
	}

	public String getBrandOwner(){
		return brandOwner;
	}

	public String getGenericNameEn(){
		return genericNameEn;
	}

	public List<Object> getProductNameEnDebugTags(){
		return productNameEnDebugTags;
	}

	public List<SourcesItem> getSources(){
		return sources;
	}

	public List<Object> getCheckers(){
		return checkers;
	}

	public int getIngredientsWithSpecifiedPercentN(){
		return ingredientsWithSpecifiedPercentN;
	}

	public List<Object> getUnknownNutrientsTags(){
		return unknownNutrientsTags;
	}

	public int getNutriscoreScoreOpposite(){
		return nutriscoreScoreOpposite;
	}

	public List<String> getLastEditDatesTags(){
		return lastEditDatesTags;
	}

	public String getStates(){
		return states;
	}

	public List<Object> getDataQualityBugsTags(){
		return dataQualityBugsTags;
	}

	public String getImageIngredientsUrl(){
		return imageIngredientsUrl;
	}

	public String getOriginsOld(){
		return originsOld;
	}

	public List<Object> getOtherNutritionalSubstancesTags(){
		return otherNutritionalSubstancesTags;
	}

	public List<Object> getVitaminsPrevTags(){
		return vitaminsPrevTags;
	}

	public String getNovaGroups(){
		return novaGroups;
	}

	public List<String> getPnnsGroups2Tags(){
		return pnnsGroups2Tags;
	}

	public String getImageNutritionThumbUrl(){
		return imageNutritionThumbUrl;
	}

	public String getServingQuantity(){
		return servingQuantity;
	}

	public List<String> getDataQualityInfoTags(){
		return dataQualityInfoTags;
	}

	public int getLastModifiedT(){
		return lastModifiedT;
	}

	public String getPackaging(){
		return packaging;
	}

	public List<Object> getAminoAcidsPrevTags(){
		return aminoAcidsPrevTags;
	}

	public String getEmbCodesOrig(){
		return embCodesOrig;
	}

	public String getImageThumbUrl(){
		return imageThumbUrl;
	}

	public String getAllergens(){
		return allergens;
	}

	public List<String> getIngredientsAnalysisTags(){
		return ingredientsAnalysisTags;
	}

	public int getAdditivesOldN(){
		return additivesOldN;
	}

	public List<String> getDataSourcesTags(){
		return dataSourcesTags;
	}

	public List<Object> getLangDebugTags(){
		return langDebugTags;
	}

	public String getMaxImgid(){
		return maxImgid;
	}

	public int getIngredientsN(){
		return ingredientsN;
	}

	public List<String> getAllergensHierarchy(){
		return allergensHierarchy;
	}

	public List<Object> getStoresTags(){
		return storesTags;
	}

	public List<String> getEcoscoreTags(){
		return ecoscoreTags;
	}

	public String getNutritionData(){
		return nutritionData;
	}

	public List<Object> getAdditivesDebugTags(){
		return additivesDebugTags;
	}

	public List<String> getLanguagesHierarchy(){
		return languagesHierarchy;
	}

	public List<Object> getTracesDebugTags(){
		return tracesDebugTags;
	}

	public int getUniqueScansN(){
		return uniqueScansN;
	}

	public String getId(){
		return id;
	}

	public List<Object> getAminoAcidsTags(){
		return aminoAcidsTags;
	}

	public String getImageSmallUrl(){
		return imageSmallUrl;
	}

	public Images getImages(){
		return images;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public String getImageIngredientsSmallUrl(){
		return imageIngredientsSmallUrl;
	}

	public String getProductNameEnImported(){
		return productNameEnImported;
	}

	public List<String> getEntryDatesTags(){
		return entryDatesTags;
	}

	public List<String> getInformers(){
		return informers;
	}

	public String getPurchasePlaces(){
		return purchasePlaces;
	}

	public List<String> getTracesTags(){
		return tracesTags;
	}

	public int getFruitsVegetablesNuts100gEstimate(){
		return fruitsVegetablesNuts100gEstimate;
	}

	public String getImageNutritionSmallUrl(){
		return imageNutritionSmallUrl;
	}

	public String getIngredientsTextWithAllergensEn(){
		return ingredientsTextWithAllergensEn;
	}

	public String getCategoriesLc(){
		return categoriesLc;
	}

	public List<Object> getManufacturingPlacesTags(){
		return manufacturingPlacesTags;
	}

	public List<Object> getMainCountriesTags(){
		return mainCountriesTags;
	}

	public List<String> getCategoriesPropertiesTags(){
		return categoriesPropertiesTags;
	}

	public List<String> getAllergensTags(){
		return allergensTags;
	}

	public String getProductQuantity(){
		return productQuantity;
	}

	public int getSortkey(){
		return sortkey;
	}

	public String getTracesFromIngredients(){
		return tracesFromIngredients;
	}

	public String getNutritionDataPreparedPer(){
		return nutritionDataPreparedPer;
	}

	public String getIngredientsTextEnImported(){
		return ingredientsTextEnImported;
	}

	public List<Object> getPurchasePlacesDebugTags(){
		return purchasePlacesDebugTags;
	}

	public String getOriginsLc(){
		return originsLc;
	}

	public String getLabelsOld(){
		return labelsOld;
	}

	public List<String> getNutrientLevelsTags(){
		return nutrientLevelsTags;
	}

	public String getCategories(){
		return categories;
	}

	public SourcesFields getSourcesFields(){
		return sourcesFields;
	}

	public String getInterfaceVersionCreated(){
		return interfaceVersionCreated;
	}

	public int getIngredientsWithUnspecifiedPercentSum(){
		return ingredientsWithUnspecifiedPercentSum;
	}

	public String getCreator(){
		return creator;
	}

	public List<Object> getCountriesDebugTags(){
		return countriesDebugTags;
	}

	public EcoscoreData getEcoscoreData(){
		return ecoscoreData;
	}

	public List<Object> getPurchasePlacesTags(){
		return purchasePlacesTags;
	}

	public String getStores(){
		return stores;
	}

	public int getNutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue(){
		return nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue;
	}

	public String getTracesFromUser(){
		return tracesFromUser;
	}

	public String getNutritionDataPreparedPerImported(){
		return nutritionDataPreparedPerImported;
	}

	public List<String> getCountriesTags(){
		return countriesTags;
	}

	public String getDataSources(){
		return dataSources;
	}

	public String getNovaGroupDebug(){
		return novaGroupDebug;
	}

	public String getIngredientsText(){
		return ingredientsText;
	}

	public String getIngredientsTextDebug(){
		return ingredientsTextDebug;
	}

	public int getCreatedT(){
		return createdT;
	}

	public String getLc(){
		return lc;
	}

	public List<Object> getNutritionDataPerDebugTags(){
		return nutritionDataPerDebugTags;
	}

	public String getComparedToCategory(){
		return comparedToCategory;
	}

	public List<String> getOriginsHierarchy(){
		return originsHierarchy;
	}

	public SelectedImages getSelectedImages(){
		return selectedImages;
	}

	public List<Object> getDataQualityErrorsTags(){
		return dataQualityErrorsTags;
	}

	public int getComplete(){
		return complete;
	}

	public String getPnnsGroups1(){
		return pnnsGroups1;
	}

	public String getPnnsGroups2(){
		return pnnsGroups2;
	}

	public List<String> getLabelsTags(){
		return labelsTags;
	}

	public List<Object> getPackagingDebugTags(){
		return packagingDebugTags;
	}

	public List<String> getDataQualityWarningsTags(){
		return dataQualityWarningsTags;
	}

	public List<String> getPackagingTags(){
		return packagingTags;
	}

	public int getKnownIngredientsN(){
		return knownIngredientsN;
	}

	public String getUpdateKey(){
		return updateKey;
	}

	public List<Object> getMineralsPrevTags(){
		return mineralsPrevTags;
	}

	public List<Object> getManufacturingPlacesDebugTags(){
		return manufacturingPlacesDebugTags;
	}

	public List<String> getKeywords(){
		return keywords;
	}

	public String getProductNameEn(){
		return productNameEn;
	}

	public CategoriesProperties getCategoriesProperties(){
		return categoriesProperties;
	}

	public List<String> getInformersTags(){
		return informersTags;
	}

	public String getEmbCodes(){
		return embCodes;
	}

	public String getGenericName(){
		return genericName;
	}

	public String getLastEditor(){
		return lastEditor;
	}

	public String getTraces(){
		return traces;
	}

	public List<Object> getIngredientsTextEnDebugTags(){
		return ingredientsTextEnDebugTags;
	}

	public int getIngredientsThatMayBeFromPalmOilN(){
		return ingredientsThatMayBeFromPalmOilN;
	}

	public List<String> getTracesHierarchy(){
		return tracesHierarchy;
	}

	public String getProductName(){
		return productName;
	}

	public List<Object> getMineralsTags(){
		return mineralsTags;
	}

	public List<String> getPhotographersTags(){
		return photographersTags;
	}

	public String getCountriesLc(){
		return countriesLc;
	}

	public String getDataSourcesImported(){
		return dataSourcesImported;
	}

	public List<String> getStatesHierarchy(){
		return statesHierarchy;
	}

	public String get_Id(){
		return _id;
	}

	public String getInterfaceVersionModified(){
		return interfaceVersionModified;
	}

	public int getIngredientsPercentAnalysis(){
		return ingredientsPercentAnalysis;
	}

	public List<Object> getExpirationDateDebugTags(){
		return expirationDateDebugTags;
	}

	public String getCode(){
		return code;
	}

	public int getIngredientsFromPalmOilN(){
		return ingredientsFromPalmOilN;
	}

	public String getBrandOwnerImported(){
		return brandOwnerImported;
	}

	public List<String> getMiscTags(){
		return miscTags;
	}

	public String getLink(){
		return link;
	}

	public int getIngredientsWithUnspecifiedPercentN(){
		return ingredientsWithUnspecifiedPercentN;
	}

	public List<Object> getStoresDebugTags(){
		return storesDebugTags;
	}

	public int getAdditivesN(){
		return additivesN;
	}

	public List<String> getCategoriesTags(){
		return categoriesTags;
	}

	public int getUnknownIngredientsN(){
		return unknownIngredientsN;
	}

	public int getNutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients(){
		return nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients;
	}

	public String getLcImported(){
		return lcImported;
	}

	public String getNutritionDataPer(){
		return nutritionDataPer;
	}

	public List<String> getAdditivesPrevOriginalTags(){
		return additivesPrevOriginalTags;
	}

	public List<String> getIngredientsHierarchy(){
		return ingredientsHierarchy;
	}

	public String getLang(){
		return lang;
	}

	public List<String> getEditors(){
		return editors;
	}

	public String getImageFrontUrl(){
		return imageFrontUrl;
	}

	public List<String> getCountriesHierarchy(){
		return countriesHierarchy;
	}

	public int getScansN(){
		return scansN;
	}

	public String getQuantity(){
		return quantity;
	}

	public String getLastModifiedBy(){
		return lastModifiedBy;
	}

	public List<Object> getNucleotidesPrevTags(){
		return nucleotidesPrevTags;
	}

	public List<String> getPopularityTags(){
		return popularityTags;
	}

	public List<Object> getIngredientsThatMayBeFromPalmOilTags(){
		return ingredientsThatMayBeFromPalmOilTags;
	}

	public List<String> getNutritionGradesTags(){
		return nutritionGradesTags;
	}

	public NutriscoreData getNutriscoreData(){
		return nutriscoreData;
	}

	public String getNutritionDataPerImported(){
		return nutritionDataPerImported;
	}

	public int getLastImageT(){
		return lastImageT;
	}

	public int getNutritionScoreBeverage(){
		return nutritionScoreBeverage;
	}
}