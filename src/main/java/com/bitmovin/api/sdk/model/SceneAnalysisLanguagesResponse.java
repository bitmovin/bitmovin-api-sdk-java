package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SceneAnalysisLanguagesResponse
 */

public class SceneAnalysisLanguagesResponse {
  @JsonProperty("outputLanguageCodes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> outputLanguageCodes = new ArrayList<String>();


  public SceneAnalysisLanguagesResponse addOutputLanguageCodesItem(String outputLanguageCodesItem) {
    this.outputLanguageCodes.add(outputLanguageCodesItem);
    return this;
  }

  /**
   * Get outputLanguageCodes
   * @return outputLanguageCodes
   */
  public List<String> getOutputLanguageCodes() {
    return outputLanguageCodes;
  }

  /**
   * Set outputLanguageCodes
   *
   * @param outputLanguageCodes
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
    SceneAnalysisLanguagesResponse sceneAnalysisLanguagesResponse = (SceneAnalysisLanguagesResponse) o;
    return Objects.equals(this.outputLanguageCodes, sceneAnalysisLanguagesResponse.outputLanguageCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputLanguageCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneAnalysisLanguagesResponse {\n");
    
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

