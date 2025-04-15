package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Rating;
import com.bitmovin.api.sdk.model.Scene;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SceneAnalysisDetailsResponse
 */

public class SceneAnalysisDetailsResponse {
  @JsonProperty("scenes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Scene> scenes = new ArrayList<Scene>();

  @JsonProperty("description")
  private String description;

  @JsonProperty("keywords")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> keywords = new ArrayList<String>();

  @JsonProperty("ratings")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Rating> ratings = new ArrayList<Rating>();

  @JsonProperty("sensitiveTopics")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> sensitiveTopics = new ArrayList<String>();

  @JsonProperty("iabSensitiveTopicTaxonomies")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> iabSensitiveTopicTaxonomies = new ArrayList<String>();


  public SceneAnalysisDetailsResponse addScenesItem(Scene scenesItem) {
    this.scenes.add(scenesItem);
    return this;
  }

  /**
   * Get scenes
   * @return scenes
   */
  public List<Scene> getScenes() {
    return scenes;
  }

  /**
   * Set scenes
   *
   * @param scenes
   */
  public void setScenes(List<Scene> scenes) {
    this.scenes = scenes;
  }


  /**
   * Get description
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Set description
   *
   * @param description
   */
  public void setDescription(String description) {
    this.description = description;
  }


  public SceneAnalysisDetailsResponse addKeywordsItem(String keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * Get keywords
   * @return keywords
   */
  public List<String> getKeywords() {
    return keywords;
  }

  /**
   * Set keywords
   *
   * @param keywords
   */
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public SceneAnalysisDetailsResponse addRatingsItem(Rating ratingsItem) {
    this.ratings.add(ratingsItem);
    return this;
  }

  /**
   * Get ratings
   * @return ratings
   */
  public List<Rating> getRatings() {
    return ratings;
  }

  /**
   * Set ratings
   *
   * @param ratings
   */
  public void setRatings(List<Rating> ratings) {
    this.ratings = ratings;
  }


  public SceneAnalysisDetailsResponse addSensitiveTopicsItem(String sensitiveTopicsItem) {
    this.sensitiveTopics.add(sensitiveTopicsItem);
    return this;
  }

  /**
   * Get sensitiveTopics
   * @return sensitiveTopics
   */
  public List<String> getSensitiveTopics() {
    return sensitiveTopics;
  }

  /**
   * Set sensitiveTopics
   *
   * @param sensitiveTopics
   */
  public void setSensitiveTopics(List<String> sensitiveTopics) {
    this.sensitiveTopics = sensitiveTopics;
  }


  public SceneAnalysisDetailsResponse addIabSensitiveTopicTaxonomiesItem(String iabSensitiveTopicTaxonomiesItem) {
    this.iabSensitiveTopicTaxonomies.add(iabSensitiveTopicTaxonomiesItem);
    return this;
  }

  /**
   * Get iabSensitiveTopicTaxonomies
   * @return iabSensitiveTopicTaxonomies
   */
  public List<String> getIabSensitiveTopicTaxonomies() {
    return iabSensitiveTopicTaxonomies;
  }

  /**
   * Set iabSensitiveTopicTaxonomies
   *
   * @param iabSensitiveTopicTaxonomies
   */
  public void setIabSensitiveTopicTaxonomies(List<String> iabSensitiveTopicTaxonomies) {
    this.iabSensitiveTopicTaxonomies = iabSensitiveTopicTaxonomies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneAnalysisDetailsResponse sceneAnalysisDetailsResponse = (SceneAnalysisDetailsResponse) o;
    return Objects.equals(this.scenes, sceneAnalysisDetailsResponse.scenes) &&
        Objects.equals(this.description, sceneAnalysisDetailsResponse.description) &&
        Objects.equals(this.keywords, sceneAnalysisDetailsResponse.keywords) &&
        Objects.equals(this.ratings, sceneAnalysisDetailsResponse.ratings) &&
        Objects.equals(this.sensitiveTopics, sceneAnalysisDetailsResponse.sensitiveTopics) &&
        Objects.equals(this.iabSensitiveTopicTaxonomies, sceneAnalysisDetailsResponse.iabSensitiveTopicTaxonomies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenes, description, keywords, ratings, sensitiveTopics, iabSensitiveTopicTaxonomies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneAnalysisDetailsResponse {\n");
    
    sb.append("    scenes: ").append(toIndentedString(scenes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    sensitiveTopics: ").append(toIndentedString(sensitiveTopics)).append("\n");
    sb.append("    iabSensitiveTopicTaxonomies: ").append(toIndentedString(iabSensitiveTopicTaxonomies)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

