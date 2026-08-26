package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AdvisoryAnalysisStatus;
import com.bitmovin.api.sdk.model.ContentAdvisory;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * The result of content advisory detection for a shot, covering both what was detected and whether the shot was assessed at all
 */

public class ShotAdvisories {
  @JsonProperty("status")
  private AdvisoryAnalysisStatus status;

  @JsonProperty("advisories")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<ContentAdvisory> advisories = new ArrayList<ContentAdvisory>();


  /**
   * Whether and how the shot was assessed for content advisories (required)
   * @return status
   */
  public AdvisoryAnalysisStatus getStatus() {
    return status;
  }

  /**
   * Whether and how the shot was assessed for content advisories (required)
   *
   * @param status
   *        Whether and how the shot was assessed for content advisories (required)
   */
  public void setStatus(AdvisoryAnalysisStatus status) {
    this.status = status;
  }


  public ShotAdvisories addAdvisoriesItem(ContentAdvisory advisoriesItem) {
    this.advisories.add(advisoriesItem);
    return this;
  }

  /**
   * The advisory-relevant imagery detected in this shot. Empty when the shot was assessed and nothing was found, or when it was not assessed at all (required)
   * @return advisories
   */
  public List<ContentAdvisory> getAdvisories() {
    return advisories;
  }

  /**
   * The advisory-relevant imagery detected in this shot. Empty when the shot was assessed and nothing was found, or when it was not assessed at all (required)
   *
   * @param advisories
   *        The advisory-relevant imagery detected in this shot. Empty when the shot was assessed and nothing was found, or when it was not assessed at all (required)
   */
  public void setAdvisories(List<ContentAdvisory> advisories) {
    this.advisories = advisories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShotAdvisories shotAdvisories = (ShotAdvisories) o;
    return Objects.equals(this.status, shotAdvisories.status) &&
        Objects.equals(this.advisories, shotAdvisories.advisories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, advisories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShotAdvisories {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    advisories: ").append(toIndentedString(advisories)).append("\n");
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

