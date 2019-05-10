package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AudioMixChannelType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AudioMixInputStreamChannel
 */

public class AudioMixInputStreamChannel {
  @JsonProperty("inputStreamId")
  private String inputStreamId;

  @JsonProperty("outputChannelType")
  private AudioMixChannelType outputChannelType = null;

  @JsonProperty("outputChannelNumber")
  private Integer outputChannelNumber;


  /**
   * The id of the input stream that should be used for mixing.
   * @return inputStreamId
   */
  public String getInputStreamId() {
    return inputStreamId;
  }

  public void setInputStreamId(String inputStreamId) {
    this.inputStreamId = inputStreamId;
  }


  /**
   * Get outputChannelType
   * @return outputChannelType
   */
  public AudioMixChannelType getOutputChannelType() {
    return outputChannelType;
  }

  public void setOutputChannelType(AudioMixChannelType outputChannelType) {
    this.outputChannelType = outputChannelType;
  }


  /**
   * Number of this output channel. If type is &#39;CHANNEL_NUMBER&#39;, this must be set.
   * @return outputChannelNumber
   */
  public Integer getOutputChannelNumber() {
    return outputChannelNumber;
  }

  public void setOutputChannelNumber(Integer outputChannelNumber) {
    this.outputChannelNumber = outputChannelNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioMixInputStreamChannel audioMixInputStreamChannel = (AudioMixInputStreamChannel) o;
    return Objects.equals(this.inputStreamId, audioMixInputStreamChannel.inputStreamId) &&
        Objects.equals(this.outputChannelType, audioMixInputStreamChannel.outputChannelType) &&
        Objects.equals(this.outputChannelNumber, audioMixInputStreamChannel.outputChannelNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputStreamId, outputChannelType, outputChannelNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioMixInputStreamChannel {\n");
    
    sb.append("    inputStreamId: ").append(toIndentedString(inputStreamId)).append("\n");
    sb.append("    outputChannelType: ").append(toIndentedString(outputChannelType)).append("\n");
    sb.append("    outputChannelNumber: ").append(toIndentedString(outputChannelNumber)).append("\n");
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

