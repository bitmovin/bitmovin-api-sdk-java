package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AzureSpeechToCaptionsSettings;
import com.bitmovin.api.sdk.model.Filter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AzureSpeechToCaptionsFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = AzureSpeechToCaptionsFilter.class)
public class AzureSpeechToCaptionsFilter extends Filter {
  @JsonProperty("azureSpeechToCaptionsSettings")
  private AzureSpeechToCaptionsSettings azureSpeechToCaptionsSettings;


  /**
   * Get azureSpeechToCaptionsSettings
   * @return azureSpeechToCaptionsSettings
   */
  public AzureSpeechToCaptionsSettings getAzureSpeechToCaptionsSettings() {
    return azureSpeechToCaptionsSettings;
  }

  /**
   * Set azureSpeechToCaptionsSettings
   *
   * @param azureSpeechToCaptionsSettings
   */
  public void setAzureSpeechToCaptionsSettings(AzureSpeechToCaptionsSettings azureSpeechToCaptionsSettings) {
    this.azureSpeechToCaptionsSettings = azureSpeechToCaptionsSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureSpeechToCaptionsFilter azureSpeechToCaptionsFilter = (AzureSpeechToCaptionsFilter) o;
    return Objects.equals(this.azureSpeechToCaptionsSettings, azureSpeechToCaptionsFilter.azureSpeechToCaptionsSettings) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureSpeechToCaptionsSettings, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureSpeechToCaptionsFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    azureSpeechToCaptionsSettings: ").append(toIndentedString(azureSpeechToCaptionsSettings)).append("\n");
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

