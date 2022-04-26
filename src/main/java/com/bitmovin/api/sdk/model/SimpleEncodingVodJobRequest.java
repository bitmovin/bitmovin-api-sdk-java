package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingTemplate;
import com.bitmovin.api.sdk.model.SimpleEncodingVodJobOutput;
import com.bitmovin.api.sdk.model.SimpleEncodingVodJobUrlInput;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingVodJobRequest
 */

public class SimpleEncodingVodJobRequest {
  @JsonProperty("encodingTemplate")
  private EncodingTemplate encodingTemplate;

  @JsonProperty("inputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<SimpleEncodingVodJobUrlInput> inputs = new ArrayList<SimpleEncodingVodJobUrlInput>();

  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<SimpleEncodingVodJobOutput> outputs = new ArrayList<SimpleEncodingVodJobOutput>();

  @JsonProperty("name")
  private String name;


  /**
   * The template that will be used for the encoding.
   * @return encodingTemplate
   */
  public EncodingTemplate getEncodingTemplate() {
    return encodingTemplate;
  }

  /**
   * The template that will be used for the encoding.
   *
   * @param encodingTemplate
   *        The template that will be used for the encoding.
   */
  public void setEncodingTemplate(EncodingTemplate encodingTemplate) {
    this.encodingTemplate = encodingTemplate;
  }


  public SimpleEncodingVodJobRequest addInputsItem(SimpleEncodingVodJobUrlInput inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * Get inputs
   * @return inputs
   */
  public List<SimpleEncodingVodJobUrlInput> getInputs() {
    return inputs;
  }

  /**
   * Set inputs
   *
   * @param inputs
   */
  public void setInputs(List<SimpleEncodingVodJobUrlInput> inputs) {
    this.inputs = inputs;
  }


  public SimpleEncodingVodJobRequest addOutputsItem(SimpleEncodingVodJobOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Please take a look at the [documentation](https://bitmovin.com/docs/encoding/articles/simple-encoding-api#inputs-outputs) (required)
   * @return outputs
   */
  public List<SimpleEncodingVodJobOutput> getOutputs() {
    return outputs;
  }

  /**
   * Please take a look at the [documentation](https://bitmovin.com/docs/encoding/articles/simple-encoding-api#inputs-outputs) (required)
   *
   * @param outputs
   *        Please take a look at the [documentation](https://bitmovin.com/docs/encoding/articles/simple-encoding-api#inputs-outputs) (required)
   */
  public void setOutputs(List<SimpleEncodingVodJobOutput> outputs) {
    this.outputs = outputs;
  }


  /**
   * This property will be used for naming the encoding and the manifests.
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * This property will be used for naming the encoding and the manifests.
   *
   * @param name
   *        This property will be used for naming the encoding and the manifests.
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
    SimpleEncodingVodJobRequest simpleEncodingVodJobRequest = (SimpleEncodingVodJobRequest) o;
    return Objects.equals(this.encodingTemplate, simpleEncodingVodJobRequest.encodingTemplate) &&
        Objects.equals(this.inputs, simpleEncodingVodJobRequest.inputs) &&
        Objects.equals(this.outputs, simpleEncodingVodJobRequest.outputs) &&
        Objects.equals(this.name, simpleEncodingVodJobRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingTemplate, inputs, outputs, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingVodJobRequest {\n");
    
    sb.append("    encodingTemplate: ").append(toIndentedString(encodingTemplate)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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

