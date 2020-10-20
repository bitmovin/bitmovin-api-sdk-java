package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.InputPath;
import com.bitmovin.api.sdk.model.SmpteTimecodeFlavor;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SccCaption
 */

public class SccCaption extends BitmovinResource {
  @JsonProperty("input")
  private InputPath input;

  @JsonProperty("smpteTimecodeFlavor")
  private SmpteTimecodeFlavor smpteTimecodeFlavor;


  /**
   * Input location of the SCC file (required)
   * @return input
   */
  public InputPath getInput() {
    return input;
  }

  /**
   * Input location of the SCC file (required)
   *
   * @param input
   *        Input location of the SCC file (required)
   */
  public void setInput(InputPath input) {
    this.input = input;
  }


  /**
   * Get smpteTimecodeFlavor
   * @return smpteTimecodeFlavor
   */
  public SmpteTimecodeFlavor getSmpteTimecodeFlavor() {
    return smpteTimecodeFlavor;
  }

  /**
   * Set smpteTimecodeFlavor
   *
   * @param smpteTimecodeFlavor
   */
  public void setSmpteTimecodeFlavor(SmpteTimecodeFlavor smpteTimecodeFlavor) {
    this.smpteTimecodeFlavor = smpteTimecodeFlavor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SccCaption sccCaption = (SccCaption) o;
    return Objects.equals(this.input, sccCaption.input) &&
        Objects.equals(this.smpteTimecodeFlavor, sccCaption.smpteTimecodeFlavor) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, smpteTimecodeFlavor, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SccCaption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    smpteTimecodeFlavor: ").append(toIndentedString(smpteTimecodeFlavor)).append("\n");
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

