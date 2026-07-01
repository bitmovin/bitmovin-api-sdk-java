package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.H265V2RateControlModeConfig;
import com.bitmovin.api.sdk.model.H265V2RateControlModeConfigType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * H265V2ConstantBitrateModeConfig
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = H265V2ConstantBitrateModeConfig.class)
public class H265V2ConstantBitrateModeConfig extends H265V2RateControlModeConfig {
  @JsonProperty("fillerdata")
  private Boolean fillerdata;


  /**
   * Enable filler data for constant bitrate mode.
   * @return fillerdata
   */
  public Boolean getFillerdata() {
    return fillerdata;
  }

  /**
   * Enable filler data for constant bitrate mode.
   *
   * @param fillerdata
   *        Enable filler data for constant bitrate mode.
   */
  public void setFillerdata(Boolean fillerdata) {
    this.fillerdata = fillerdata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    H265V2ConstantBitrateModeConfig h265V2ConstantBitrateModeConfig = (H265V2ConstantBitrateModeConfig) o;
    return Objects.equals(this.fillerdata, h265V2ConstantBitrateModeConfig.fillerdata) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fillerdata, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class H265V2ConstantBitrateModeConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fillerdata: ").append(toIndentedString(fillerdata)).append("\n");
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

