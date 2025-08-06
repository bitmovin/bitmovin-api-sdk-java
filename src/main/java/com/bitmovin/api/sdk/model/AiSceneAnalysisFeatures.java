package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AiSceneAnalysisAssetDescription;
import com.bitmovin.api.sdk.model.AiSceneAnalysisAutomaticAdPlacement;
import com.bitmovin.api.sdk.model.AiSceneAnalysisOutputLanguageCodes;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AiSceneAnalysisFeatures
 */

public class AiSceneAnalysisFeatures {
  @JsonProperty("assetDescription")
  private AiSceneAnalysisAssetDescription assetDescription;

  @JsonProperty("automaticAdPlacement")
  private AiSceneAnalysisAutomaticAdPlacement automaticAdPlacement;

  @JsonProperty("outputLanguageCodes")
  private AiSceneAnalysisOutputLanguageCodes outputLanguageCodes;


  /**
   * AI scene analysis will create an asset description file. 
   * @return assetDescription
   */
  public AiSceneAnalysisAssetDescription getAssetDescription() {
    return assetDescription;
  }

  /**
   * AI scene analysis will create an asset description file. 
   *
   * @param assetDescription
   *        AI scene analysis will create an asset description file. 
   */
  public void setAssetDescription(AiSceneAnalysisAssetDescription assetDescription) {
    this.assetDescription = assetDescription;
  }


  /**
   * Ad markers placed on detected scene changes and configured positions. 
   * @return automaticAdPlacement
   */
  public AiSceneAnalysisAutomaticAdPlacement getAutomaticAdPlacement() {
    return automaticAdPlacement;
  }

  /**
   * Ad markers placed on detected scene changes and configured positions. 
   *
   * @param automaticAdPlacement
   *        Ad markers placed on detected scene changes and configured positions. 
   */
  public void setAutomaticAdPlacement(AiSceneAnalysisAutomaticAdPlacement automaticAdPlacement) {
    this.automaticAdPlacement = automaticAdPlacement;
  }


  /**
   * AI scene analysis will create translated asset description files for the language codes. 
   * @return outputLanguageCodes
   */
  public AiSceneAnalysisOutputLanguageCodes getOutputLanguageCodes() {
    return outputLanguageCodes;
  }

  /**
   * AI scene analysis will create translated asset description files for the language codes. 
   *
   * @param outputLanguageCodes
   *        AI scene analysis will create translated asset description files for the language codes. 
   */
  public void setOutputLanguageCodes(AiSceneAnalysisOutputLanguageCodes outputLanguageCodes) {
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
    AiSceneAnalysisFeatures aiSceneAnalysisFeatures = (AiSceneAnalysisFeatures) o;
    return Objects.equals(this.assetDescription, aiSceneAnalysisFeatures.assetDescription) &&
        Objects.equals(this.automaticAdPlacement, aiSceneAnalysisFeatures.automaticAdPlacement) &&
        Objects.equals(this.outputLanguageCodes, aiSceneAnalysisFeatures.outputLanguageCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetDescription, automaticAdPlacement, outputLanguageCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysisFeatures {\n");
    
    sb.append("    assetDescription: ").append(toIndentedString(assetDescription)).append("\n");
    sb.append("    automaticAdPlacement: ").append(toIndentedString(automaticAdPlacement)).append("\n");
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

