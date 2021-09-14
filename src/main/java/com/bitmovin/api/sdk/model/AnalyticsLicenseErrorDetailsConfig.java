package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsLicenseErrorDetailsConfig
 */

public class AnalyticsLicenseErrorDetailsConfig {
  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("networkExplorerEnabled")
  private Boolean networkExplorerEnabled;

  /**
   * Are error details enabled on the license
   * @return enabled
   */
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Is network explorer feature enabled for the license
   * @return networkExplorerEnabled
   */
  public Boolean getNetworkExplorerEnabled() {
    return networkExplorerEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsLicenseErrorDetailsConfig analyticsLicenseErrorDetailsConfig = (AnalyticsLicenseErrorDetailsConfig) o;
    return Objects.equals(this.enabled, analyticsLicenseErrorDetailsConfig.enabled) &&
        Objects.equals(this.networkExplorerEnabled, analyticsLicenseErrorDetailsConfig.networkExplorerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, networkExplorerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsLicenseErrorDetailsConfig {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    networkExplorerEnabled: ").append(toIndentedString(networkExplorerEnabled)).append("\n");
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

