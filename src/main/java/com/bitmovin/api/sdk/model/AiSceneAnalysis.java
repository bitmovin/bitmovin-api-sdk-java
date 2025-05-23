package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AiSceneAnalysisFeatures;
import com.bitmovin.api.sdk.model.AiService;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AiSceneAnalysis
 */

public class AiSceneAnalysis {
  @JsonProperty("aiService")
  private AiService aiService;

  @JsonProperty("features")
  private AiSceneAnalysisFeatures features;


  /**
   * AI service settings
   * @return aiService
   */
  public AiService getAiService() {
    return aiService;
  }

  /**
   * AI service settings
   *
   * @param aiService
   *        AI service settings
   */
  public void setAiService(AiService aiService) {
    this.aiService = aiService;
  }


  /**
   * Features of the AI scene analysis
   * @return features
   */
  public AiSceneAnalysisFeatures getFeatures() {
    return features;
  }

  /**
   * Features of the AI scene analysis
   *
   * @param features
   *        Features of the AI scene analysis
   */
  public void setFeatures(AiSceneAnalysisFeatures features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiSceneAnalysis aiSceneAnalysis = (AiSceneAnalysis) o;
    return Objects.equals(this.aiService, aiSceneAnalysis.aiService) &&
        Objects.equals(this.features, aiSceneAnalysis.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiService, features);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysis {\n");
    
    sb.append("    aiService: ").append(toIndentedString(aiService)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

