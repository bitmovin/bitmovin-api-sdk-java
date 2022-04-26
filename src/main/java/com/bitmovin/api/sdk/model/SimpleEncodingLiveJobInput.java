package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveJobInputType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingLiveJobInput
 */

public class SimpleEncodingLiveJobInput {
  @JsonProperty("inputType")
  private SimpleEncodingLiveJobInputType inputType;


  /**
   * Defines which protocol is being used as input of the live stream. 
   * @return inputType
   */
  public SimpleEncodingLiveJobInputType getInputType() {
    return inputType;
  }

  /**
   * Defines which protocol is being used as input of the live stream. 
   *
   * @param inputType
   *        Defines which protocol is being used as input of the live stream. 
   */
  public void setInputType(SimpleEncodingLiveJobInputType inputType) {
    this.inputType = inputType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleEncodingLiveJobInput simpleEncodingLiveJobInput = (SimpleEncodingLiveJobInput) o;
    return Objects.equals(this.inputType, simpleEncodingLiveJobInput.inputType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingLiveJobInput {\n");
    
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
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

