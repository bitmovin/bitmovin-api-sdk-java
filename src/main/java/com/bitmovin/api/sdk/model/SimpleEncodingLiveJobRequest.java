package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveCloudRegion;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveJobInput;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveJobUrlOutput;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingLiveJobRequest
 */

public class SimpleEncodingLiveJobRequest {
  @JsonProperty("input")
  private SimpleEncodingLiveJobInput input;

  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<SimpleEncodingLiveJobUrlOutput> outputs = new ArrayList<SimpleEncodingLiveJobUrlOutput>();

  @JsonProperty("cloudRegion")
  private SimpleEncodingLiveCloudRegion cloudRegion;

  @JsonProperty("name")
  private String name;


  /**
   * Get input
   * @return input
   */
  public SimpleEncodingLiveJobInput getInput() {
    return input;
  }

  /**
   * Set input
   *
   * @param input
   */
  public void setInput(SimpleEncodingLiveJobInput input) {
    this.input = input;
  }


  public SimpleEncodingLiveJobRequest addOutputsItem(SimpleEncodingLiveJobUrlOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * output of the live encoding job (required)
   * @return outputs
   */
  public List<SimpleEncodingLiveJobUrlOutput> getOutputs() {
    return outputs;
  }

  /**
   * output of the live encoding job (required)
   *
   * @param outputs
   *        output of the live encoding job (required)
   */
  public void setOutputs(List<SimpleEncodingLiveJobUrlOutput> outputs) {
    this.outputs = outputs;
  }


  /**
   * The cloud region that will be used for the live encoding. This value has to be set.
   * @return cloudRegion
   */
  public SimpleEncodingLiveCloudRegion getCloudRegion() {
    return cloudRegion;
  }

  /**
   * The cloud region that will be used for the live encoding. This value has to be set.
   *
   * @param cloudRegion
   *        The cloud region that will be used for the live encoding. This value has to be set.
   */
  public void setCloudRegion(SimpleEncodingLiveCloudRegion cloudRegion) {
    this.cloudRegion = cloudRegion;
  }


  /**
   * This property will be used for naming the encoding.
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * This property will be used for naming the encoding.
   *
   * @param name
   *        This property will be used for naming the encoding.
   */
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleEncodingLiveJobRequest simpleEncodingLiveJobRequest = (SimpleEncodingLiveJobRequest) o;
    return Objects.equals(this.input, simpleEncodingLiveJobRequest.input) &&
        Objects.equals(this.outputs, simpleEncodingLiveJobRequest.outputs) &&
        Objects.equals(this.cloudRegion, simpleEncodingLiveJobRequest.cloudRegion) &&
        Objects.equals(this.name, simpleEncodingLiveJobRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, outputs, cloudRegion, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingLiveJobRequest {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

