package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Input;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DirectFileUploadInput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = DirectFileUploadInput.class)
public class DirectFileUploadInput extends Input {
  @JsonProperty("uploadUrl")
  private String uploadUrl;

  /**
   * The URL to be used for a file upload with HTTP PUT. Expires after 5 minutes.
   * @return uploadUrl
   */
  public String getUploadUrl() {
    return uploadUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectFileUploadInput directFileUploadInput = (DirectFileUploadInput) o;
    return Objects.equals(this.uploadUrl, directFileUploadInput.uploadUrl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadUrl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectFileUploadInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
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

