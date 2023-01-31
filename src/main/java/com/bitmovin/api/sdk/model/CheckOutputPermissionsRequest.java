package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CheckOutputPermissionsRequest
 */

public class CheckOutputPermissionsRequest {
  @JsonProperty("path")
  private String path;


  /**
   * The path on the storage for which permissions should be checked. In AWS S3 terminology, this corresponds to a \&quot;prefix\&quot;. To perform the check, an empty test file (WritePermissionTestFile.txt) will be created in this location. Defaults to an empty string, which corresponds to the root directory.
   * @return path
   */
  public String getPath() {
    return path;
  }

  /**
   * The path on the storage for which permissions should be checked. In AWS S3 terminology, this corresponds to a \&quot;prefix\&quot;. To perform the check, an empty test file (WritePermissionTestFile.txt) will be created in this location. Defaults to an empty string, which corresponds to the root directory.
   *
   * @param path
   *        The path on the storage for which permissions should be checked. In AWS S3 terminology, this corresponds to a \&quot;prefix\&quot;. To perform the check, an empty test file (WritePermissionTestFile.txt) will be created in this location. Defaults to an empty string, which corresponds to the root directory.
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
    CheckOutputPermissionsRequest checkOutputPermissionsRequest = (CheckOutputPermissionsRequest) o;
    return Objects.equals(this.path, checkOutputPermissionsRequest.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckOutputPermissionsRequest {\n");
    
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

