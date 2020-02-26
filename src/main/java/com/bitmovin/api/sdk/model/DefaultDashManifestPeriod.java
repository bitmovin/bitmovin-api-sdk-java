package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DefaultManifestCondition;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DefaultDashManifestPeriod
 */

public class DefaultDashManifestPeriod {
  @JsonProperty("encodingIds")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> encodingIds = new ArrayList<String>();

  @JsonProperty("adaptationSets")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<DefaultManifestCondition> adaptationSets = new ArrayList<DefaultManifestCondition>();


  public DefaultDashManifestPeriod addEncodingIdsItem(String encodingIdsItem) {
    this.encodingIds.add(encodingIdsItem);
    return this;
  }

  /**
   * List the encoding ids for which the conditions should apply
   * @return encodingIds
   */
  public List<String> getEncodingIds() {
    return encodingIds;
  }

  /**
   * List the encoding ids for which the conditions should apply
   *
   * @param encodingIds
   *        List the encoding ids for which the conditions should apply
   */
  public void setEncodingIds(List<String> encodingIds) {
    this.encodingIds = encodingIds;
  }


  public DefaultDashManifestPeriod addAdaptationSetsItem(DefaultManifestCondition adaptationSetsItem) {
    this.adaptationSets.add(adaptationSetsItem);
    return this;
  }

  /**
   * Adds an adaption set for every item to the period
   * @return adaptationSets
   */
  public List<DefaultManifestCondition> getAdaptationSets() {
    return adaptationSets;
  }

  /**
   * Adds an adaption set for every item to the period
   *
   * @param adaptationSets
   *        Adds an adaption set for every item to the period
   */
  public void setAdaptationSets(List<DefaultManifestCondition> adaptationSets) {
    this.adaptationSets = adaptationSets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultDashManifestPeriod defaultDashManifestPeriod = (DefaultDashManifestPeriod) o;
    return Objects.equals(this.encodingIds, defaultDashManifestPeriod.encodingIds) &&
        Objects.equals(this.adaptationSets, defaultDashManifestPeriod.adaptationSets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingIds, adaptationSets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultDashManifestPeriod {\n");
    
    sb.append("    encodingIds: ").append(toIndentedString(encodingIds)).append("\n");
    sb.append("    adaptationSets: ").append(toIndentedString(adaptationSets)).append("\n");
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

