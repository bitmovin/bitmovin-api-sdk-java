package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AdPosition;
import com.bitmovin.api.sdk.model.AiSceneAnalysisAutomaticAdPlacement;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SceneAnalysisAdPlacementMetadataResponse
 */

public class SceneAnalysisAdPlacementMetadataResponse {
  @JsonProperty("placedAds")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AdPosition> placedAds = new ArrayList<AdPosition>();

  @JsonProperty("automaticAdPlacement")
  private AiSceneAnalysisAutomaticAdPlacement automaticAdPlacement;


  public SceneAnalysisAdPlacementMetadataResponse addPlacedAdsItem(AdPosition placedAdsItem) {
    this.placedAds.add(placedAdsItem);
    return this;
  }

  /**
   * Get placedAds
   * @return placedAds
   */
  public List<AdPosition> getPlacedAds() {
    return placedAds;
  }

  /**
   * Set placedAds
   *
   * @param placedAds
   */
  public void setPlacedAds(List<AdPosition> placedAds) {
    this.placedAds = placedAds;
  }


  /**
   * Get automaticAdPlacement
   * @return automaticAdPlacement
   */
  public AiSceneAnalysisAutomaticAdPlacement getAutomaticAdPlacement() {
    return automaticAdPlacement;
  }

  /**
   * Set automaticAdPlacement
   *
   * @param automaticAdPlacement
   */
  public void setAutomaticAdPlacement(AiSceneAnalysisAutomaticAdPlacement automaticAdPlacement) {
    this.automaticAdPlacement = automaticAdPlacement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneAnalysisAdPlacementMetadataResponse sceneAnalysisAdPlacementMetadataResponse = (SceneAnalysisAdPlacementMetadataResponse) o;
    return Objects.equals(this.placedAds, sceneAnalysisAdPlacementMetadataResponse.placedAds) &&
        Objects.equals(this.automaticAdPlacement, sceneAnalysisAdPlacementMetadataResponse.automaticAdPlacement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placedAds, automaticAdPlacement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneAnalysisAdPlacementMetadataResponse {\n");
    
    sb.append("    placedAds: ").append(toIndentedString(placedAds)).append("\n");
    sb.append("    automaticAdPlacement: ").append(toIndentedString(automaticAdPlacement)).append("\n");
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

