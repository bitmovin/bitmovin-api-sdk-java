package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Cea608ChannelType;
import com.bitmovin.api.sdk.model.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Cea608CaptionInputStream
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class Cea608CaptionInputStream extends InputStream {
  @JsonProperty("inputId")
  private String inputId;

  @JsonProperty("inputPath")
  private String inputPath;

  @JsonProperty("channel")
  private Cea608ChannelType channel;


  /**
   * Id of the Input (required)
   * @return inputId
   */
  public String getInputId() {
    return inputId;
  }

  /**
   * Id of the Input (required)
   *
   * @param inputId
   *        Id of the Input (required)
   */
  public void setInputId(String inputId) {
    this.inputId = inputId;
  }


  /**
   * Path to media file (required)
   * @return inputPath
   */
  public String getInputPath() {
    return inputPath;
  }

  /**
   * Path to media file (required)
   *
   * @param inputPath
   *        Path to media file (required)
   */
  public void setInputPath(String inputPath) {
    this.inputPath = inputPath;
  }


  /**
   * The channel number of the subtitle on the respective stream position (required)
   * @return channel
   */
  public Cea608ChannelType getChannel() {
    return channel;
  }

  /**
   * The channel number of the subtitle on the respective stream position (required)
   *
   * @param channel
   *        The channel number of the subtitle on the respective stream position (required)
   */
  public void setChannel(Cea608ChannelType channel) {
    this.channel = channel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cea608CaptionInputStream cea608CaptionInputStream = (Cea608CaptionInputStream) o;
    return Objects.equals(this.inputId, cea608CaptionInputStream.inputId) &&
        Objects.equals(this.inputPath, cea608CaptionInputStream.inputPath) &&
        Objects.equals(this.channel, cea608CaptionInputStream.channel) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputId, inputPath, channel, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cea608CaptionInputStream {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputId: ").append(toIndentedString(inputId)).append("\n");
    sb.append("    inputPath: ").append(toIndentedString(inputPath)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

