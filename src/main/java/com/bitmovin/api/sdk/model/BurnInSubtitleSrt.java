package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.CaptionCharacterEncoding;
import com.bitmovin.api.sdk.model.InputPath;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * BurnInSubtitleSrt
 */

public class BurnInSubtitleSrt extends BitmovinResource {
  @JsonProperty("characterEncoding")
  private CaptionCharacterEncoding characterEncoding;

  @JsonProperty("input")
  private InputPath input;


  /**
   * Character encoding of the SRT file (required)
   * @return characterEncoding
   */
  public CaptionCharacterEncoding getCharacterEncoding() {
    return characterEncoding;
  }

  /**
   * Character encoding of the SRT file (required)
   *
   * @param characterEncoding
   *        Character encoding of the SRT file (required)
   */
  public void setCharacterEncoding(CaptionCharacterEncoding characterEncoding) {
    this.characterEncoding = characterEncoding;
  }


  /**
   * The input location to get the SRT file from (required)
   * @return input
   */
  public InputPath getInput() {
    return input;
  }

  /**
   * The input location to get the SRT file from (required)
   *
   * @param input
   *        The input location to get the SRT file from (required)
   */
  public void setInput(InputPath input) {
    this.input = input;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BurnInSubtitleSrt burnInSubtitleSrt = (BurnInSubtitleSrt) o;
    return Objects.equals(this.characterEncoding, burnInSubtitleSrt.characterEncoding) &&
        Objects.equals(this.input, burnInSubtitleSrt.input) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterEncoding, input, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BurnInSubtitleSrt {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    characterEncoding: ").append(toIndentedString(characterEncoding)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
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

