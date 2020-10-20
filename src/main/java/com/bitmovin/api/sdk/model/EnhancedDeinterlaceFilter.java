package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EnhancedDeinterlaceAutoEnable;
import com.bitmovin.api.sdk.model.EnhancedDeinterlaceMode;
import com.bitmovin.api.sdk.model.EnhancedDeinterlaceParity;
import com.bitmovin.api.sdk.model.Filter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * EnhancedDeinterlaceFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = EnhancedDeinterlaceFilter.class)
public class EnhancedDeinterlaceFilter extends Filter {
  @JsonProperty("parity")
  private EnhancedDeinterlaceParity parity;

  @JsonProperty("mode")
  private EnhancedDeinterlaceMode mode;

  @JsonProperty("autoEnable")
  private EnhancedDeinterlaceAutoEnable autoEnable;


  /**
   * Get parity
   * @return parity
   */
  public EnhancedDeinterlaceParity getParity() {
    return parity;
  }

  /**
   * Set parity
   *
   * @param parity
   */
  public void setParity(EnhancedDeinterlaceParity parity) {
    this.parity = parity;
  }


  /**
   * Get mode
   * @return mode
   */
  public EnhancedDeinterlaceMode getMode() {
    return mode;
  }

  /**
   * Set mode
   *
   * @param mode
   */
  public void setMode(EnhancedDeinterlaceMode mode) {
    this.mode = mode;
  }


  /**
   * Get autoEnable
   * @return autoEnable
   */
  public EnhancedDeinterlaceAutoEnable getAutoEnable() {
    return autoEnable;
  }

  /**
   * Set autoEnable
   *
   * @param autoEnable
   */
  public void setAutoEnable(EnhancedDeinterlaceAutoEnable autoEnable) {
    this.autoEnable = autoEnable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnhancedDeinterlaceFilter enhancedDeinterlaceFilter = (EnhancedDeinterlaceFilter) o;
    return Objects.equals(this.parity, enhancedDeinterlaceFilter.parity) &&
        Objects.equals(this.mode, enhancedDeinterlaceFilter.mode) &&
        Objects.equals(this.autoEnable, enhancedDeinterlaceFilter.autoEnable) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parity, mode, autoEnable, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhancedDeinterlaceFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    parity: ").append(toIndentedString(parity)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    autoEnable: ").append(toIndentedString(autoEnable)).append("\n");
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

