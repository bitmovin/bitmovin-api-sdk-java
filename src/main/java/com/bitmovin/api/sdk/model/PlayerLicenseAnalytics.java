package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PlayerLicenseAnalytics
 */

public class PlayerLicenseAnalytics {
  @JsonProperty("analyticsKey")
  private String analyticsKey;


  /**
   * Analytics License Key
   * @return analyticsKey
   */
  public String getAnalyticsKey() {
    return analyticsKey;
  }

  public void setAnalyticsKey(String analyticsKey) {
    this.analyticsKey = analyticsKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerLicenseAnalytics playerLicenseAnalytics = (PlayerLicenseAnalytics) o;
    return Objects.equals(this.analyticsKey, playerLicenseAnalytics.analyticsKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyticsKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerLicenseAnalytics {\n");
    
    sb.append("    analyticsKey: ").append(toIndentedString(analyticsKey)).append("\n");
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

