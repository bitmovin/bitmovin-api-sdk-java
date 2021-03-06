package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CustomData
 */

public class CustomData {
  @JsonProperty("customData")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private Map<String, Object> customData = new HashMap<String, Object>();

  @JsonProperty("createdAt")
  private Date createdAt;


  public CustomData putCustomDataItem(String key, Object customDataItem) {
    this.customData.put(key, customDataItem);
    return this;
  }

  /**
   * User-specific meta data. This can hold a custom JSON object.
   * @return customData
   */
  public Map<String, Object> getCustomData() {
    return customData;
  }

  /**
   * User-specific meta data. This can hold a custom JSON object.
   *
   * @param customData
   *        User-specific meta data. This can hold a custom JSON object.
   */
  public void setCustomData(Map<String, Object> customData) {
    this.customData = customData;
  }


  /**
   * Creation timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Creation timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   *
   * @param createdAt
   *        Creation timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   */
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomData customData = (CustomData) o;
    return Objects.equals(this.customData, customData.customData) &&
        Objects.equals(this.createdAt, customData.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customData, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomData {\n");
    
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

