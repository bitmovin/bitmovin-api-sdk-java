package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveCloudRegion;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveJobInput;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveJobOutput;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveProfile;
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
  @JsonProperty("encodingProfile")
  private SimpleEncodingLiveProfile encodingProfile;

  @JsonProperty("input")
  private SimpleEncodingLiveJobInput input;

  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<SimpleEncodingLiveJobOutput> outputs = new ArrayList<SimpleEncodingLiveJobOutput>();

  @JsonProperty("cloudRegion")
  private SimpleEncodingLiveCloudRegion cloudRegion;

  @JsonProperty("name")
  private String name;


  /**
   * The profile that will be used for the live encoding.
   * @return encodingProfile
   */
  public SimpleEncodingLiveProfile getEncodingProfile() {
    return encodingProfile;
  }

  /**
   * The profile that will be used for the live encoding.
   *
   * @param encodingProfile
   *        The profile that will be used for the live encoding.
   */
  public void setEncodingProfile(SimpleEncodingLiveProfile encodingProfile) {
    this.encodingProfile = encodingProfile;
  }


  /**
   * Please take a look at the [documentation](https://bitmovin.com/docs/encoding/articles/simple-encoding-api-live#inputs) (required)
   * @return input
   */
  public SimpleEncodingLiveJobInput getInput() {
    return input;
  }

  /**
   * Please take a look at the [documentation](https://bitmovin.com/docs/encoding/articles/simple-encoding-api-live#inputs) (required)
   *
   * @param input
   *        Please take a look at the [documentation](https://bitmovin.com/docs/encoding/articles/simple-encoding-api-live#inputs) (required)
   */
  public void setInput(SimpleEncodingLiveJobInput input) {
    this.input = input;
  }


  public SimpleEncodingLiveJobRequest addOutputsItem(SimpleEncodingLiveJobOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Please take a look at the [documentation](https://bitmovin.com/docs/encoding/articles/simple-encoding-api-live#outputs) (required)
   * @return outputs
   */
  public List<SimpleEncodingLiveJobOutput> getOutputs() {
    return outputs;
  }

  /**
   * Please take a look at the [documentation](https://bitmovin.com/docs/encoding/articles/simple-encoding-api-live#outputs) (required)
   *
   * @param outputs
   *        Please take a look at the [documentation](https://bitmovin.com/docs/encoding/articles/simple-encoding-api-live#outputs) (required)
   */
  public void setOutputs(List<SimpleEncodingLiveJobOutput> outputs) {
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
    return Objects.equals(this.encodingProfile, simpleEncodingLiveJobRequest.encodingProfile) &&
        Objects.equals(this.input, simpleEncodingLiveJobRequest.input) &&
        Objects.equals(this.outputs, simpleEncodingLiveJobRequest.outputs) &&
        Objects.equals(this.cloudRegion, simpleEncodingLiveJobRequest.cloudRegion) &&
        Objects.equals(this.name, simpleEncodingLiveJobRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingProfile, input, outputs, cloudRegion, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingLiveJobRequest {\n");
    
    sb.append("    encodingProfile: ").append(toIndentedString(encodingProfile)).append("\n");
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

