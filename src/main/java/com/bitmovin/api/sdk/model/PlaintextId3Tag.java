package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Id3Tag;
import com.bitmovin.api.sdk.model.Id3TagPositionMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PlaintextId3Tag
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = PlaintextId3Tag.class)
public class PlaintextId3Tag extends Id3Tag {
  @JsonProperty("text")
  private String text;

  @JsonProperty("frameId")
  private String frameId;


  /**
   * Plain Text Data (required)
   * @return text
   */
  public String getText() {
    return text;
  }

  /**
   * Plain Text Data (required)
   *
   * @param text
   *        Plain Text Data (required)
   */
  public void setText(String text) {
    this.text = text;
  }


  /**
   * 4 character long Frame ID (required)
   * @return frameId
   */
  public String getFrameId() {
    return frameId;
  }

  /**
   * 4 character long Frame ID (required)
   *
   * @param frameId
   *        4 character long Frame ID (required)
   */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaintextId3Tag plaintextId3Tag = (PlaintextId3Tag) o;
    return Objects.equals(this.text, plaintextId3Tag.text) &&
        Objects.equals(this.frameId, plaintextId3Tag.frameId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, frameId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaintextId3Tag {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    frameId: ").append(toIndentedString(frameId)).append("\n");
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

