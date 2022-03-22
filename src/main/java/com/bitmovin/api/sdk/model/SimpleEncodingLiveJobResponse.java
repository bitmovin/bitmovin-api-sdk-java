package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveCloudRegion;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveJobInput;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveJobStatus;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveJobUrlOutput;
import com.bitmovin.api.sdk.model.SimpleEncodingVodJobErrors;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingLiveJobResponse
 */

public class SimpleEncodingLiveJobResponse {
  @JsonProperty("id")
  private String id;

  @JsonProperty("status")
  private SimpleEncodingLiveJobStatus status;

  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("encoderIp")
  private String encoderIp;

  @JsonProperty("streamKey")
  private String streamKey;

  @JsonProperty("input")
  private SimpleEncodingLiveJobInput input;

  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<SimpleEncodingLiveJobUrlOutput> outputs = new ArrayList<SimpleEncodingLiveJobUrlOutput>();

  @JsonProperty("errors")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<SimpleEncodingVodJobErrors> errors = new ArrayList<SimpleEncodingVodJobErrors>();

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("modifiedAt")
  private Date modifiedAt;

  @JsonProperty("name")
  private String name;

  @JsonProperty("cloudRegion")
  private SimpleEncodingLiveCloudRegion cloudRegion;

  /**
   * The identifier of the Simple Encoding Live Job
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * The current status of the Simple Encoding Live Job
   * @return status
   */
  public SimpleEncodingLiveJobStatus getStatus() {
    return status;
  }

  /**
   * The identifier of the encoding that has been created based on the job request. This is only returned once the job execution has been successful and the encoding could be started. 
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * The IP address of the encoder for this job request. This is only returned once the job execution has been successful and the encoding could be started. Ingest is expected to be sent to this IP address. 
   * @return encoderIp
   */
  public String getEncoderIp() {
    return encoderIp;
  }

  /**
   * Stream key of the live encoder
   * @return streamKey
   */
  public String getStreamKey() {
    return streamKey;
  }


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


  public SimpleEncodingLiveJobResponse addOutputsItem(SimpleEncodingLiveJobUrlOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Get outputs
   * @return outputs
   */
  public List<SimpleEncodingLiveJobUrlOutput> getOutputs() {
    return outputs;
  }

  /**
   * Set outputs
   *
   * @param outputs
   */
  public void setOutputs(List<SimpleEncodingLiveJobUrlOutput> outputs) {
    this.outputs = outputs;
  }


  public SimpleEncodingLiveJobResponse addErrorsItem(SimpleEncodingVodJobErrors errorsItem) {
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


  /**
   * The cloud region that will be used for the live encoding
   * @return cloudRegion
   */
  public SimpleEncodingLiveCloudRegion getCloudRegion() {
    return cloudRegion;
  }

  /**
   * The cloud region that will be used for the live encoding
   *
   * @param cloudRegion
   *        The cloud region that will be used for the live encoding
   */
  public void setCloudRegion(SimpleEncodingLiveCloudRegion cloudRegion) {
    this.cloudRegion = cloudRegion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleEncodingLiveJobResponse simpleEncodingLiveJobResponse = (SimpleEncodingLiveJobResponse) o;
    return Objects.equals(this.id, simpleEncodingLiveJobResponse.id) &&
        Objects.equals(this.status, simpleEncodingLiveJobResponse.status) &&
        Objects.equals(this.encodingId, simpleEncodingLiveJobResponse.encodingId) &&
        Objects.equals(this.encoderIp, simpleEncodingLiveJobResponse.encoderIp) &&
        Objects.equals(this.streamKey, simpleEncodingLiveJobResponse.streamKey) &&
        Objects.equals(this.input, simpleEncodingLiveJobResponse.input) &&
        Objects.equals(this.outputs, simpleEncodingLiveJobResponse.outputs) &&
        Objects.equals(this.errors, simpleEncodingLiveJobResponse.errors) &&
        Objects.equals(this.createdAt, simpleEncodingLiveJobResponse.createdAt) &&
        Objects.equals(this.modifiedAt, simpleEncodingLiveJobResponse.modifiedAt) &&
        Objects.equals(this.name, simpleEncodingLiveJobResponse.name) &&
        Objects.equals(this.cloudRegion, simpleEncodingLiveJobResponse.cloudRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, encodingId, encoderIp, streamKey, input, outputs, errors, createdAt, modifiedAt, name, cloudRegion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingLiveJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    encoderIp: ").append(toIndentedString(encoderIp)).append("\n");
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
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

