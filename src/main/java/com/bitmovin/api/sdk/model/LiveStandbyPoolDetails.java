package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveStandbyPoolResponse;
import com.bitmovin.api.sdk.model.LiveStandbyPoolStatus;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveStandbyPoolDetails
 */

public class LiveStandbyPoolDetails extends LiveStandbyPoolResponse {
  @JsonProperty("encodingTemplate")
  private String encodingTemplate;

  /**
   * Base64 encoded template used to start the encodings in the pool
   * @return encodingTemplate
   */
  public String getEncodingTemplate() {
    return encodingTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStandbyPoolDetails liveStandbyPoolDetails = (LiveStandbyPoolDetails) o;
    return Objects.equals(this.encodingTemplate, liveStandbyPoolDetails.encodingTemplate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingTemplate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStandbyPoolDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encodingTemplate: ").append(toIndentedString(encodingTemplate)).append("\n");
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

