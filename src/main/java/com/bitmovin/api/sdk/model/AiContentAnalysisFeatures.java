package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AiContentAnalysisAssetDescription;
import com.bitmovin.api.sdk.model.AiContentAnalysisAutomaticAdPlacement;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AiContentAnalysisFeatures
 */

public class AiContentAnalysisFeatures {
  @JsonProperty("assetDescription")
  private AiContentAnalysisAssetDescription assetDescription;

  @JsonProperty("automaticAdPlacement")
  private AiContentAnalysisAutomaticAdPlacement automaticAdPlacement;


  /**
   * AI content analysis will create an asset description file. 
   * @return assetDescription
   */
  public AiContentAnalysisAssetDescription getAssetDescription() {
    return assetDescription;
  }

  /**
   * AI content analysis will create an asset description file. 
   *
   * @param assetDescription
   *        AI content analysis will create an asset description file. 
   */
  public void setAssetDescription(AiContentAnalysisAssetDescription assetDescription) {
    this.assetDescription = assetDescription;
  }


  /**
   * Ad markers placed on detected scene changes and configured positions. 
   * @return automaticAdPlacement
   */
  public AiContentAnalysisAutomaticAdPlacement getAutomaticAdPlacement() {
    return automaticAdPlacement;
  }

  /**
   * Ad markers placed on detected scene changes and configured positions. 
   *
   * @param automaticAdPlacement
   *        Ad markers placed on detected scene changes and configured positions. 
   */
  public void setAutomaticAdPlacement(AiContentAnalysisAutomaticAdPlacement automaticAdPlacement) {
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
    AiContentAnalysisFeatures aiContentAnalysisFeatures = (AiContentAnalysisFeatures) o;
    return Objects.equals(this.assetDescription, aiContentAnalysisFeatures.assetDescription) &&
        Objects.equals(this.automaticAdPlacement, aiContentAnalysisFeatures.automaticAdPlacement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetDescription, automaticAdPlacement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiContentAnalysisFeatures {\n");
    
    sb.append("    assetDescription: ").append(toIndentedString(assetDescription)).append("\n");
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

