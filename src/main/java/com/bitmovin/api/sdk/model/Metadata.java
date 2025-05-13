package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Metadata
 */

public class Metadata {
  @JsonProperty("version")
  private String version;

  @JsonProperty("disclaimer")
  private String disclaimer;


  /**
   * Get version
   * @return version
   */
  public String getVersion() {
    return version;
  }

  /**
   * Set version
   *
   * @param version
   */
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Get disclaimer
   * @return disclaimer
   */
  public String getDisclaimer() {
    return disclaimer;
  }

  /**
   * Set disclaimer
   *
   * @param disclaimer
   */
  public void setDisclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.version, metadata.version) &&
        Objects.equals(this.disclaimer, metadata.disclaimer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, disclaimer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    disclaimer: ").append(toIndentedString(disclaimer)).append("\n");
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

