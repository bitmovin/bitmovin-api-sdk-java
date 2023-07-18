package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveOptionsType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveEncodingOptionsStatistics
 */

public class LiveEncodingOptionsStatistics {
  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("unitsUsed")
  private Double unitsUsed;

  @JsonProperty("type")
  private LiveOptionsType type;

  /**
   * The ID of the encoding (required)
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * Live option units used (required)
   * @return unitsUsed
   */
  public Double getUnitsUsed() {
    return unitsUsed;
  }


  /**
   * Get type
   * @return type
   */
  public LiveOptionsType getType() {
    return type;
  }

  /**
   * Set type
   *
   * @param type
   */
  public void setType(LiveOptionsType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingOptionsStatistics liveEncodingOptionsStatistics = (LiveEncodingOptionsStatistics) o;
    return Objects.equals(this.encodingId, liveEncodingOptionsStatistics.encodingId) &&
        Objects.equals(this.unitsUsed, liveEncodingOptionsStatistics.unitsUsed) &&
        Objects.equals(this.type, liveEncodingOptionsStatistics.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingId, unitsUsed, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingOptionsStatistics {\n");
    
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    unitsUsed: ").append(toIndentedString(unitsUsed)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

