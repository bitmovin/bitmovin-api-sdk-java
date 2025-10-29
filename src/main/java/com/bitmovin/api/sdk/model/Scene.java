package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Content;
import com.bitmovin.api.sdk.model.IABTaxonomy;
import com.bitmovin.api.sdk.model.SceneType;
import com.bitmovin.api.sdk.model.Shot;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Scene
 */

public class Scene {
  @JsonProperty("title")
  private String title;

  @JsonProperty("startInSeconds")
  private BigDecimal startInSeconds;

  @JsonProperty("endInSeconds")
  private BigDecimal endInSeconds;

  @JsonProperty("id")
  private String id;

  @JsonProperty("content")
  private Content content;

  @JsonProperty("summary")
  private String summary;

  @JsonProperty("verboseSummary")
  private String verboseSummary;

  @JsonProperty("sensitiveTopics")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> sensitiveTopics = new ArrayList<String>();

  @JsonProperty("keywords")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> keywords = new ArrayList<String>();

  @JsonProperty("iab")
  private IABTaxonomy iab;

  @JsonProperty("type")
  private SceneType type;

  @JsonProperty("shots")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Shot> shots = new ArrayList<Shot>();


  /**
   * Get title
   * @return title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Set title
   *
   * @param title
   */
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Get startInSeconds
   * @return startInSeconds
   */
  public BigDecimal getStartInSeconds() {
    return startInSeconds;
  }

  /**
   * Set startInSeconds
   *
   * @param startInSeconds
   */
  public void setStartInSeconds(BigDecimal startInSeconds) {
    this.startInSeconds = startInSeconds;
  }


  /**
   * Get endInSeconds
   * @return endInSeconds
   */
  public BigDecimal getEndInSeconds() {
    return endInSeconds;
  }

  /**
   * Set endInSeconds
   *
   * @param endInSeconds
   */
  public void setEndInSeconds(BigDecimal endInSeconds) {
    this.endInSeconds = endInSeconds;
  }


  /**
   * Get id
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * Set id
   *
   * @param id
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Get content
   * @return content
   */
  public Content getContent() {
    return content;
  }

  /**
   * Set content
   *
   * @param content
   */
  public void setContent(Content content) {
    this.content = content;
  }


  /**
   * Get summary
   * @return summary
   */
  public String getSummary() {
    return summary;
  }

  /**
   * Set summary
   *
   * @param summary
   */
  public void setSummary(String summary) {
    this.summary = summary;
  }


  /**
   * Get verboseSummary
   * @return verboseSummary
   */
  public String getVerboseSummary() {
    return verboseSummary;
  }

  /**
   * Set verboseSummary
   *
   * @param verboseSummary
   */
  public void setVerboseSummary(String verboseSummary) {
    this.verboseSummary = verboseSummary;
  }


  public Scene addSensitiveTopicsItem(String sensitiveTopicsItem) {
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


  public Scene addKeywordsItem(String keywordsItem) {
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


  /**
   * Get iab
   * @return iab
   */
  public IABTaxonomy getIab() {
    return iab;
  }

  /**
   * Set iab
   *
   * @param iab
   */
  public void setIab(IABTaxonomy iab) {
    this.iab = iab;
  }


  /**
   * The detected type of scene based on content analysis
   * @return type
   */
  public SceneType getType() {
    return type;
  }

  /**
   * The detected type of scene based on content analysis
   *
   * @param type
   *        The detected type of scene based on content analysis
   */
  public void setType(SceneType type) {
    this.type = type;
  }


  public Scene addShotsItem(Shot shotsItem) {
    this.shots.add(shotsItem);
    return this;
  }

  /**
   * A detailed breakdown of individual camera shots within this scene, providing granular analysis of visual content and subjects
   * @return shots
   */
  public List<Shot> getShots() {
    return shots;
  }

  /**
   * A detailed breakdown of individual camera shots within this scene, providing granular analysis of visual content and subjects
   *
   * @param shots
   *        A detailed breakdown of individual camera shots within this scene, providing granular analysis of visual content and subjects
   */
  public void setShots(List<Shot> shots) {
    this.shots = shots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scene scene = (Scene) o;
    return Objects.equals(this.title, scene.title) &&
        Objects.equals(this.startInSeconds, scene.startInSeconds) &&
        Objects.equals(this.endInSeconds, scene.endInSeconds) &&
        Objects.equals(this.id, scene.id) &&
        Objects.equals(this.content, scene.content) &&
        Objects.equals(this.summary, scene.summary) &&
        Objects.equals(this.verboseSummary, scene.verboseSummary) &&
        Objects.equals(this.sensitiveTopics, scene.sensitiveTopics) &&
        Objects.equals(this.keywords, scene.keywords) &&
        Objects.equals(this.iab, scene.iab) &&
        Objects.equals(this.type, scene.type) &&
        Objects.equals(this.shots, scene.shots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, startInSeconds, endInSeconds, id, content, summary, verboseSummary, sensitiveTopics, keywords, iab, type, shots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scene {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    startInSeconds: ").append(toIndentedString(startInSeconds)).append("\n");
    sb.append("    endInSeconds: ").append(toIndentedString(endInSeconds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    verboseSummary: ").append(toIndentedString(verboseSummary)).append("\n");
    sb.append("    sensitiveTopics: ").append(toIndentedString(sensitiveTopics)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    iab: ").append(toIndentedString(iab)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shots: ").append(toIndentedString(shots)).append("\n");
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

