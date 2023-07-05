package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AbstractCondition;
import com.bitmovin.api.sdk.model.AppliedStreamSettings;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.DecodingErrorMode;
import com.bitmovin.api.sdk.model.EncodingMode;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.Ignoring;
import com.bitmovin.api.sdk.model.StreamInput;
import com.bitmovin.api.sdk.model.StreamMetadata;
import com.bitmovin.api.sdk.model.StreamMode;
import com.bitmovin.api.sdk.model.StreamPerTitleSettings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Stream
 */

public class Stream extends BitmovinResource {
  @JsonProperty("inputStreams")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<StreamInput> inputStreams = new ArrayList<StreamInput>();

  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EncodingOutput> outputs = new ArrayList<EncodingOutput>();

  @JsonProperty("createQualityMetaData")
  private Boolean createQualityMetaData;

  @JsonProperty("codecConfigId")
  private String codecConfigId;

  @JsonProperty("segmentsEncoded")
  private Integer segmentsEncoded;

  @JsonProperty("conditions")
  private AbstractCondition conditions;

  @JsonProperty("ignoredBy")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Ignoring> ignoredBy = new ArrayList<Ignoring>();

  @JsonProperty("mode")
  private StreamMode mode;

  @JsonProperty("selectedEncodingMode")
  private EncodingMode selectedEncodingMode;

  @JsonProperty("perTitleSettings")
  private StreamPerTitleSettings perTitleSettings;

  @JsonProperty("metadata")
  private StreamMetadata metadata;

  @JsonProperty("decodingErrorMode")
  private DecodingErrorMode decodingErrorMode;

  @JsonProperty("appliedSettings")
  private AppliedStreamSettings appliedSettings;


  public Stream addInputStreamsItem(StreamInput inputStreamsItem) {
    this.inputStreams.add(inputStreamsItem);
    return this;
  }

  /**
   * Determines the input source(s) for the stream. All video streams of an encoding need to have identical input configurations (required)
   * @return inputStreams
   */
  public List<StreamInput> getInputStreams() {
    return inputStreams;
  }

  /**
   * Determines the input source(s) for the stream. All video streams of an encoding need to have identical input configurations (required)
   *
   * @param inputStreams
   *        Determines the input source(s) for the stream. All video streams of an encoding need to have identical input configurations (required)
   */
  public void setInputStreams(List<StreamInput> inputStreams) {
    this.inputStreams = inputStreams;
  }


  public Stream addOutputsItem(EncodingOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Get outputs
   * @return outputs
   */
  public List<EncodingOutput> getOutputs() {
    return outputs;
  }

  /**
   * Set outputs
   *
   * @param outputs
   */
  public void setOutputs(List<EncodingOutput> outputs) {
    this.outputs = outputs;
  }


  /**
   * Set true to create quality metadata for this stream
   * @return createQualityMetaData
   */
  public Boolean getCreateQualityMetaData() {
    return createQualityMetaData;
  }

  /**
   * Set true to create quality metadata for this stream
   *
   * @param createQualityMetaData
   *        Set true to create quality metadata for this stream
   */
  public void setCreateQualityMetaData(Boolean createQualityMetaData) {
    this.createQualityMetaData = createQualityMetaData;
  }


  /**
   * Id of the codec configuration (required)
   * @return codecConfigId
   */
  public String getCodecConfigId() {
    return codecConfigId;
  }

  /**
   * Id of the codec configuration (required)
   *
   * @param codecConfigId
   *        Id of the codec configuration (required)
   */
  public void setCodecConfigId(String codecConfigId) {
    this.codecConfigId = codecConfigId;
  }

  /**
   * Number of encoded segments. Available after encoding finishes.
   * @return segmentsEncoded
   */
  public Integer getSegmentsEncoded() {
    return segmentsEncoded;
  }


  /**
   * Defines a condition that is evaluated against the input of the Stream. If the condition is not fulfilled, the Stream will be ignored during the encoding process. The &#39;streamConditionMode&#39; of a Muxing allows to control how ignored Streams affect the Muxing. When retrieving the resource after the analysis step of the encoding has finished, &#39;ignoredBy&#39; will indicate if and why it has been ignored. See [Stream Conditions](https://bitmovin.com/docs/encoding/articles/stream-conditions) for more information
   * @return conditions
   */
  public AbstractCondition getConditions() {
    return conditions;
  }

  /**
   * Defines a condition that is evaluated against the input of the Stream. If the condition is not fulfilled, the Stream will be ignored during the encoding process. The &#39;streamConditionMode&#39; of a Muxing allows to control how ignored Streams affect the Muxing. When retrieving the resource after the analysis step of the encoding has finished, &#39;ignoredBy&#39; will indicate if and why it has been ignored. See [Stream Conditions](https://bitmovin.com/docs/encoding/articles/stream-conditions) for more information
   *
   * @param conditions
   *        Defines a condition that is evaluated against the input of the Stream. If the condition is not fulfilled, the Stream will be ignored during the encoding process. The &#39;streamConditionMode&#39; of a Muxing allows to control how ignored Streams affect the Muxing. When retrieving the resource after the analysis step of the encoding has finished, &#39;ignoredBy&#39; will indicate if and why it has been ignored. See [Stream Conditions](https://bitmovin.com/docs/encoding/articles/stream-conditions) for more information
   */
  public void setConditions(AbstractCondition conditions) {
    this.conditions = conditions;
  }

  /**
   * This read-only property is set during the analysis step of the encoding. If it contains items, the Stream has been ignored during the encoding process due to its &#39;conditions&#39;
   * @return ignoredBy
   */
  public List<Ignoring> getIgnoredBy() {
    return ignoredBy;
  }


  /**
   * Mode of the stream
   * @return mode
   */
  public StreamMode getMode() {
    return mode;
  }

  /**
   * Mode of the stream
   *
   * @param mode
   *        Mode of the stream
   */
  public void setMode(StreamMode mode) {
    this.mode = mode;
  }

  /**
   * The encoding mode that was used for this stream. This is derived from &#x60;encodingMode&#x60;, which can be specified in the codec configuration or in the encoding start request. Note that all streams of an encoding need to use the same encoding mode. This will therefore always match &#x60;selectedEncodingMode&#x60; of the related Encoding resource. Especially useful when &#x60;encodingMode&#x60; was not set explicitly or set to STANDARD (which translates to one of the other possible values on encoding start).
   * @return selectedEncodingMode
   */
  public EncodingMode getSelectedEncodingMode() {
    return selectedEncodingMode;
  }


  /**
   * Settings to configure Per-Title on stream level
   * @return perTitleSettings
   */
  public StreamPerTitleSettings getPerTitleSettings() {
    return perTitleSettings;
  }

  /**
   * Settings to configure Per-Title on stream level
   *
   * @param perTitleSettings
   *        Settings to configure Per-Title on stream level
   */
  public void setPerTitleSettings(StreamPerTitleSettings perTitleSettings) {
    this.perTitleSettings = perTitleSettings;
  }


  /**
   * Get metadata
   * @return metadata
   */
  public StreamMetadata getMetadata() {
    return metadata;
  }

  /**
   * Set metadata
   *
   * @param metadata
   */
  public void setMetadata(StreamMetadata metadata) {
    this.metadata = metadata;
  }


  /**
   * Determines how to react to errors during decoding
   * @return decodingErrorMode
   */
  public DecodingErrorMode getDecodingErrorMode() {
    return decodingErrorMode;
  }

  /**
   * Determines how to react to errors during decoding
   *
   * @param decodingErrorMode
   *        Determines how to react to errors during decoding
   */
  public void setDecodingErrorMode(DecodingErrorMode decodingErrorMode) {
    this.decodingErrorMode = decodingErrorMode;
  }

  /**
   * Contains stream properties which may not have been defined in the configuration
   * @return appliedSettings
   */
  public AppliedStreamSettings getAppliedSettings() {
    return appliedSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stream stream = (Stream) o;
    return Objects.equals(this.inputStreams, stream.inputStreams) &&
        Objects.equals(this.outputs, stream.outputs) &&
        Objects.equals(this.createQualityMetaData, stream.createQualityMetaData) &&
        Objects.equals(this.codecConfigId, stream.codecConfigId) &&
        Objects.equals(this.segmentsEncoded, stream.segmentsEncoded) &&
        Objects.equals(this.conditions, stream.conditions) &&
        Objects.equals(this.ignoredBy, stream.ignoredBy) &&
        Objects.equals(this.mode, stream.mode) &&
        Objects.equals(this.selectedEncodingMode, stream.selectedEncodingMode) &&
        Objects.equals(this.perTitleSettings, stream.perTitleSettings) &&
        Objects.equals(this.metadata, stream.metadata) &&
        Objects.equals(this.decodingErrorMode, stream.decodingErrorMode) &&
        Objects.equals(this.appliedSettings, stream.appliedSettings) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputStreams, outputs, createQualityMetaData, codecConfigId, segmentsEncoded, conditions, ignoredBy, mode, selectedEncodingMode, perTitleSettings, metadata, decodingErrorMode, appliedSettings, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stream {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputStreams: ").append(toIndentedString(inputStreams)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    createQualityMetaData: ").append(toIndentedString(createQualityMetaData)).append("\n");
    sb.append("    codecConfigId: ").append(toIndentedString(codecConfigId)).append("\n");
    sb.append("    segmentsEncoded: ").append(toIndentedString(segmentsEncoded)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    ignoredBy: ").append(toIndentedString(ignoredBy)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    selectedEncodingMode: ").append(toIndentedString(selectedEncodingMode)).append("\n");
    sb.append("    perTitleSettings: ").append(toIndentedString(perTitleSettings)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    decodingErrorMode: ").append(toIndentedString(decodingErrorMode)).append("\n");
    sb.append("    appliedSettings: ").append(toIndentedString(appliedSettings)).append("\n");
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

