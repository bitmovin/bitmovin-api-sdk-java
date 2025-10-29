package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.MainSubject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Represents a continuous camera shot within a scene, containing detailed visual analysis including subjects, timing, and descriptive metadata
 */

public class Shot {
  @JsonProperty("startInSeconds")
  private BigDecimal startInSeconds;

  @JsonProperty("endInSeconds")
  private BigDecimal endInSeconds;

  @JsonProperty("detailedDescription")
  private String detailedDescription;

  @JsonProperty("keywords")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> keywords = new ArrayList<String>();

  @JsonProperty("mainSubjects")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<MainSubject> mainSubjects = new ArrayList<MainSubject>();


  /**
   * The start time of the shot in seconds from the beginning of the video (required)
   * @return startInSeconds
   */
  public BigDecimal getStartInSeconds() {
    return startInSeconds;
  }

  /**
   * The start time of the shot in seconds from the beginning of the video (required)
   *
   * @param startInSeconds
   *        The start time of the shot in seconds from the beginning of the video (required)
   */
  public void setStartInSeconds(BigDecimal startInSeconds) {
    this.startInSeconds = startInSeconds;
  }


  /**
   * The end time of the shot in seconds from the beginning of the video (required)
   * @return endInSeconds
   */
  public BigDecimal getEndInSeconds() {
    return endInSeconds;
  }

  /**
   * The end time of the shot in seconds from the beginning of the video (required)
   *
   * @param endInSeconds
   *        The end time of the shot in seconds from the beginning of the video (required)
   */
  public void setEndInSeconds(BigDecimal endInSeconds) {
    this.endInSeconds = endInSeconds;
  }


  /**
   * A comprehensive textual description of the visual content, action, and context within this shot
   * @return detailedDescription
   */
  public String getDetailedDescription() {
    return detailedDescription;
  }

  /**
   * A comprehensive textual description of the visual content, action, and context within this shot
   *
   * @param detailedDescription
   *        A comprehensive textual description of the visual content, action, and context within this shot
   */
  public void setDetailedDescription(String detailedDescription) {
    this.detailedDescription = detailedDescription;
  }


  public Shot addKeywordsItem(String keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * A list of relevant keywords and tags that describe the content, themes, or notable elements in this shot
   * @return keywords
   */
  public List<String> getKeywords() {
    return keywords;
  }

  /**
   * A list of relevant keywords and tags that describe the content, themes, or notable elements in this shot
   *
   * @param keywords
   *        A list of relevant keywords and tags that describe the content, themes, or notable elements in this shot
   */
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public Shot addMainSubjectsItem(MainSubject mainSubjectsItem) {
    this.mainSubjects.add(mainSubjectsItem);
    return this;
  }

  /**
   * A collection of the primary subjects or objects detected and tracked within this shot, including their positions and characteristics
   * @return mainSubjects
   */
  public List<MainSubject> getMainSubjects() {
    return mainSubjects;
  }

  /**
   * A collection of the primary subjects or objects detected and tracked within this shot, including their positions and characteristics
   *
   * @param mainSubjects
   *        A collection of the primary subjects or objects detected and tracked within this shot, including their positions and characteristics
   */
  public void setMainSubjects(List<MainSubject> mainSubjects) {
    this.mainSubjects = mainSubjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shot shot = (Shot) o;
    return Objects.equals(this.startInSeconds, shot.startInSeconds) &&
        Objects.equals(this.endInSeconds, shot.endInSeconds) &&
        Objects.equals(this.detailedDescription, shot.detailedDescription) &&
        Objects.equals(this.keywords, shot.keywords) &&
        Objects.equals(this.mainSubjects, shot.mainSubjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startInSeconds, endInSeconds, detailedDescription, keywords, mainSubjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shot {\n");
    
    sb.append("    startInSeconds: ").append(toIndentedString(startInSeconds)).append("\n");
    sb.append("    endInSeconds: ").append(toIndentedString(endInSeconds)).append("\n");
    sb.append("    detailedDescription: ").append(toIndentedString(detailedDescription)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    mainSubjects: ").append(toIndentedString(mainSubjects)).append("\n");
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

