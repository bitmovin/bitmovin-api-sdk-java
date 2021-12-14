package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingVodJobErrors;
import com.bitmovin.api.sdk.model.SimpleEncodingVodJobStatus;
import com.bitmovin.api.sdk.model.SimpleEncodingVodJobUrlInput;
import com.bitmovin.api.sdk.model.SimpleEncodingVodJobUrlOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingVodJobResponse
 */

public class SimpleEncodingVodJobResponse {
  @JsonProperty("id")
  private String id;

  @JsonProperty("status")
  private SimpleEncodingVodJobStatus status;

  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("inputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<SimpleEncodingVodJobUrlInput> inputs = new ArrayList<SimpleEncodingVodJobUrlInput>();

  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<SimpleEncodingVodJobUrlOutput> outputs = new ArrayList<SimpleEncodingVodJobUrlOutput>();

  @JsonProperty("errors")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<SimpleEncodingVodJobErrors> errors = new ArrayList<SimpleEncodingVodJobErrors>();

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("modifiedAt")
  private Date modifiedAt;

  @JsonProperty("name")
  private String name;

  /**
   * The identifier of the Simple Encoding VOD Job
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * The current status of the Simple Encoding VOD Job
   * @return status
   */
  public SimpleEncodingVodJobStatus getStatus() {
    return status;
  }

  /**
   * The identifier of the encoding that has been created based on the job request. This is only returned once the job execution has been successful and the encoding could be started. 
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }


  public SimpleEncodingVodJobResponse addInputsItem(SimpleEncodingVodJobUrlInput inputsItem) {
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


  public SimpleEncodingVodJobResponse addOutputsItem(SimpleEncodingVodJobUrlOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Get outputs
   * @return outputs
   */
  public List<SimpleEncodingVodJobUrlOutput> getOutputs() {
    return outputs;
  }

  /**
   * Set outputs
   *
   * @param outputs
   */
  public void setOutputs(List<SimpleEncodingVodJobUrlOutput> outputs) {
    this.outputs = outputs;
  }


  public SimpleEncodingVodJobResponse addErrorsItem(SimpleEncodingVodJobErrors errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Describes all the errors in cases the status of the job is &#39;error&#39;. 
   * @return errors
   */
  public List<SimpleEncodingVodJobErrors> getErrors() {
    return errors;
  }

  /**
   * Describes all the errors in cases the status of the job is &#39;error&#39;. 
   *
   * @param errors
   *        Describes all the errors in cases the status of the job is &#39;error&#39;. 
   */
  public void setErrors(List<SimpleEncodingVodJobErrors> errors) {
    this.errors = errors;
  }


  /**
   * Creation timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Creation timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   *
   * @param createdAt
   *        Creation timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   */
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Modified timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ. The job is updated for example when the status changes
   * @return modifiedAt
   */
  public Date getModifiedAt() {
    return modifiedAt;
  }

  /**
   * Modified timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ. The job is updated for example when the status changes
   *
   * @param modifiedAt
   *        Modified timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ. The job is updated for example when the status changes
   */
  public void setModifiedAt(Date modifiedAt) {
    this.modifiedAt = modifiedAt;
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
    SimpleEncodingVodJobResponse simpleEncodingVodJobResponse = (SimpleEncodingVodJobResponse) o;
    return Objects.equals(this.id, simpleEncodingVodJobResponse.id) &&
        Objects.equals(this.status, simpleEncodingVodJobResponse.status) &&
        Objects.equals(this.encodingId, simpleEncodingVodJobResponse.encodingId) &&
        Objects.equals(this.inputs, simpleEncodingVodJobResponse.inputs) &&
        Objects.equals(this.outputs, simpleEncodingVodJobResponse.outputs) &&
        Objects.equals(this.errors, simpleEncodingVodJobResponse.errors) &&
        Objects.equals(this.createdAt, simpleEncodingVodJobResponse.createdAt) &&
        Objects.equals(this.modifiedAt, simpleEncodingVodJobResponse.modifiedAt) &&
        Objects.equals(this.name, simpleEncodingVodJobResponse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, encodingId, inputs, outputs, errors, createdAt, modifiedAt, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingVodJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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

