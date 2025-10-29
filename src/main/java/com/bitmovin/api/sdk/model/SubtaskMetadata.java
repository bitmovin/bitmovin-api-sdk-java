package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SubtaskMetadataData;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SubtaskMetadata
 */

public class SubtaskMetadata {
  @JsonProperty("date")
  private Date date;

  @JsonProperty("data")
  private SubtaskMetadataData data;


  /**
   * The timestamp of the metadata record (required)
   * @return date
   */
  public Date getDate() {
    return date;
  }

  /**
   * The timestamp of the metadata record (required)
   *
   * @param date
   *        The timestamp of the metadata record (required)
   */
  public void setDate(Date date) {
    this.date = date;
  }


  /**
   * Get data
   * @return data
   */
  public SubtaskMetadataData getData() {
    return data;
  }

  /**
   * Set data
   *
   * @param data
   */
  public void setData(SubtaskMetadataData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubtaskMetadata subtaskMetadata = (SubtaskMetadata) o;
    return Objects.equals(this.date, subtaskMetadata.date) &&
        Objects.equals(this.data, subtaskMetadata.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubtaskMetadata {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

