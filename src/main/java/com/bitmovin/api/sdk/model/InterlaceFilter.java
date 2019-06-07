package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Filter;
import com.bitmovin.api.sdk.model.InterlaceMode;
import com.bitmovin.api.sdk.model.VerticalLowPassFilteringMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * InterlaceFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class InterlaceFilter extends Filter {
  @JsonProperty("mode")
  private InterlaceMode mode;

  @JsonProperty("verticalLowPassFilteringMode")
  private VerticalLowPassFilteringMode verticalLowPassFilteringMode;


  /**
   * Get mode
   * @return mode
   */
  public InterlaceMode getMode() {
    return mode;
  }

  /**
   * Set mode
   *
   * @param mode
   */
  public void setMode(InterlaceMode mode) {
    this.mode = mode;
  }


  /**
   * Get verticalLowPassFilteringMode
   * @return verticalLowPassFilteringMode
   */
  public VerticalLowPassFilteringMode getVerticalLowPassFilteringMode() {
    return verticalLowPassFilteringMode;
  }

  /**
   * Set verticalLowPassFilteringMode
   *
   * @param verticalLowPassFilteringMode
   */
  public void setVerticalLowPassFilteringMode(VerticalLowPassFilteringMode verticalLowPassFilteringMode) {
    this.verticalLowPassFilteringMode = verticalLowPassFilteringMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterlaceFilter interlaceFilter = (InterlaceFilter) o;
    return Objects.equals(this.mode, interlaceFilter.mode) &&
        Objects.equals(this.verticalLowPassFilteringMode, interlaceFilter.verticalLowPassFilteringMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, verticalLowPassFilteringMode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterlaceFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    verticalLowPassFilteringMode: ").append(toIndentedString(verticalLowPassFilteringMode)).append("\n");
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

