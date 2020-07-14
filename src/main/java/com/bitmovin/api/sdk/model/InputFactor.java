package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.InputFactorBitrate;
import com.bitmovin.api.sdk.model.InputFactorCodec;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * InputFactor
 */

public class InputFactor {
  @JsonProperty("codec")
  private InputFactorCodec codec;

  @JsonProperty("bitrate")
  private InputFactorBitrate bitrate;


  /**
   * Get codec
   * @return codec
   */
  public InputFactorCodec getCodec() {
    return codec;
  }

  /**
   * Set codec
   *
   * @param codec
   */
  public void setCodec(InputFactorCodec codec) {
    this.codec = codec;
  }


  /**
   * Get bitrate
   * @return bitrate
   */
  public InputFactorBitrate getBitrate() {
    return bitrate;
  }

  /**
   * Set bitrate
   *
   * @param bitrate
   */
  public void setBitrate(InputFactorBitrate bitrate) {
    this.bitrate = bitrate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputFactor inputFactor = (InputFactor) o;
    return Objects.equals(this.codec, inputFactor.codec) &&
        Objects.equals(this.bitrate, inputFactor.bitrate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codec, bitrate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputFactor {\n");
    
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
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

