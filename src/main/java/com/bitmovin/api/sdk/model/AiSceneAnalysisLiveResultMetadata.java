package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AiSceneAnalysisLiveResultMetadata
 */

public class AiSceneAnalysisLiveResultMetadata {
  @JsonProperty("version")
  private String version;

  @JsonProperty("disclaimer")
  private String disclaimer;


  /**
   * Version of the AI analysis software (required)
   * @return version
   */
  public String getVersion() {
    return version;
  }

  /**
   * Version of the AI analysis software (required)
   *
   * @param version
   *        Version of the AI analysis software (required)
   */
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Disclaimer associated with AI-generated analysis data (required)
   * @return disclaimer
   */
  public String getDisclaimer() {
    return disclaimer;
  }

  /**
   * Disclaimer associated with AI-generated analysis data (required)
   *
   * @param disclaimer
   *        Disclaimer associated with AI-generated analysis data (required)
   */
  public void setDisclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiSceneAnalysisLiveResultMetadata aiSceneAnalysisLiveResultMetadata = (AiSceneAnalysisLiveResultMetadata) o;
    return Objects.equals(this.version, aiSceneAnalysisLiveResultMetadata.version) &&
        Objects.equals(this.disclaimer, aiSceneAnalysisLiveResultMetadata.disclaimer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, disclaimer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysisLiveResultMetadata {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    disclaimer: ").append(toIndentedString(disclaimer)).append("\n");
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

