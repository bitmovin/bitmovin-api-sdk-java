package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SceneAnalysisListItem
 */

public class SceneAnalysisListItem {
  @JsonProperty("id")
  private String id;

  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("description")
  private String description;

  @JsonProperty("title")
  private String title;

  @JsonProperty("keywords")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> keywords = new ArrayList<String>();

  @JsonProperty("sceneCount")
  private Integer sceneCount;

  @JsonProperty("outputLanguageCodes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> outputLanguageCodes = new ArrayList<String>();


  /**
   * AI scene analysis ID (required)
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * AI scene analysis ID (required)
   *
   * @param id
   *        AI scene analysis ID (required)
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * ID of the associated encoding (required)
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * ID of the associated encoding (required)
   *
   * @param encodingId
   *        ID of the associated encoding (required)
   */
  public void setEncodingId(String encodingId) {
    this.encodingId = encodingId;
  }


  /**
   * Creation timestamp, returned as UTC in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (required)
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Creation timestamp, returned as UTC in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (required)
   *
   * @param createdAt
   *        Creation timestamp, returned as UTC in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (required)
   */
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Analysis description. Empty when analysis metadata is unavailable (required)
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Analysis description. Empty when analysis metadata is unavailable (required)
   *
   * @param description
   *        Analysis description. Empty when analysis metadata is unavailable (required)
   */
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Inferred title representing the analyzed content as a whole. If omitted or null, the title is not available.
   * @return title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Inferred title representing the analyzed content as a whole. If omitted or null, the title is not available.
   *
   * @param title
   *        Inferred title representing the analyzed content as a whole. If omitted or null, the title is not available.
   */
  public void setTitle(String title) {
    this.title = title;
  }


  public SceneAnalysisListItem addKeywordsItem(String keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * Analysis keywords in their original order and casing, including duplicates. Omitted or empty when analysis metadata is unavailable; consumers must treat both representations as an empty list
   * @return keywords
   */
  public List<String> getKeywords() {
    return keywords;
  }

  /**
   * Analysis keywords in their original order and casing, including duplicates. Omitted or empty when analysis metadata is unavailable; consumers must treat both representations as an empty list
   *
   * @param keywords
   *        Analysis keywords in their original order and casing, including duplicates. Omitted or empty when analysis metadata is unavailable; consumers must treat both representations as an empty list
   */
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  /**
   * Number of scenes in the analysis. Zero when analysis metadata is unavailable (required)
   * minimum: 0
   * @return sceneCount
   */
  public Integer getSceneCount() {
    return sceneCount;
  }

  /**
   * Number of scenes in the analysis. Zero when analysis metadata is unavailable (required)
   * minimum: 0
   *
   * @param sceneCount
   *        Number of scenes in the analysis. Zero when analysis metadata is unavailable (required)
   *        minimum: 0
   */
  public void setSceneCount(Integer sceneCount) {
    this.sceneCount = sceneCount;
  }


  public SceneAnalysisListItem addOutputLanguageCodesItem(String outputLanguageCodesItem) {
    this.outputLanguageCodes.add(outputLanguageCodesItem);
    return this;
  }

  /**
   * Unique language codes for available translated analysis details in backend-defined deterministic order. Order and casing are returned unchanged. Omitted or empty when no translations are available; consumers must treat both representations as an empty list
   * @return outputLanguageCodes
   */
  public List<String> getOutputLanguageCodes() {
    return outputLanguageCodes;
  }

  /**
   * Unique language codes for available translated analysis details in backend-defined deterministic order. Order and casing are returned unchanged. Omitted or empty when no translations are available; consumers must treat both representations as an empty list
   *
   * @param outputLanguageCodes
   *        Unique language codes for available translated analysis details in backend-defined deterministic order. Order and casing are returned unchanged. Omitted or empty when no translations are available; consumers must treat both representations as an empty list
   */
  public void setOutputLanguageCodes(List<String> outputLanguageCodes) {
    this.outputLanguageCodes = outputLanguageCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneAnalysisListItem sceneAnalysisListItem = (SceneAnalysisListItem) o;
    return Objects.equals(this.id, sceneAnalysisListItem.id) &&
        Objects.equals(this.encodingId, sceneAnalysisListItem.encodingId) &&
        Objects.equals(this.createdAt, sceneAnalysisListItem.createdAt) &&
        Objects.equals(this.description, sceneAnalysisListItem.description) &&
        Objects.equals(this.title, sceneAnalysisListItem.title) &&
        Objects.equals(this.keywords, sceneAnalysisListItem.keywords) &&
        Objects.equals(this.sceneCount, sceneAnalysisListItem.sceneCount) &&
        Objects.equals(this.outputLanguageCodes, sceneAnalysisListItem.outputLanguageCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, encodingId, createdAt, description, title, keywords, sceneCount, outputLanguageCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneAnalysisListItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    sceneCount: ").append(toIndentedString(sceneCount)).append("\n");
    sb.append("    outputLanguageCodes: ").append(toIndentedString(outputLanguageCodes)).append("\n");
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

