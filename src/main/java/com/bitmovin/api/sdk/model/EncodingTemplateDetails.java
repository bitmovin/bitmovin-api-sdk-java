package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingTemplateResponse;
import com.bitmovin.api.sdk.model.EncodingTemplateType;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * EncodingTemplateDetails
 */

public class EncodingTemplateDetails extends EncodingTemplateResponse {
  @JsonProperty("url")
  private String url;

  /**
   * The url to download the template file (required)
   * @return url
   */
  public String getUrl() {
    return url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncodingTemplateDetails encodingTemplateDetails = (EncodingTemplateDetails) o;
    return Objects.equals(this.url, encodingTemplateDetails.url) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncodingTemplateDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

