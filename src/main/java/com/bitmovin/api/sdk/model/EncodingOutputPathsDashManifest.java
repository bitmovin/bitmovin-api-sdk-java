package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * EncodingOutputPathsDashManifest
 */

public class EncodingOutputPathsDashManifest {
  @JsonProperty("id")
  private String id;

  @JsonProperty("path")
  private String path;


  /**
   * Id of the dash manifest
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * Id of the dash manifest
   *
   * @param id
   *        Id of the dash manifest
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Path to the dash manifest on the given output
   * @return path
   */
  public String getPath() {
    return path;
  }

  /**
   * Path to the dash manifest on the given output
   *
   * @param path
   *        Path to the dash manifest on the given output
   */
  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncodingOutputPathsDashManifest encodingOutputPathsDashManifest = (EncodingOutputPathsDashManifest) o;
    return Objects.equals(this.id, encodingOutputPathsDashManifest.id) &&
        Objects.equals(this.path, encodingOutputPathsDashManifest.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncodingOutputPathsDashManifest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

