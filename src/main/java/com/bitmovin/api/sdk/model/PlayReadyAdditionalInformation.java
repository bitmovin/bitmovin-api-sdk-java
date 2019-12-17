package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PlayReadyAdditionalInformation
 */

public class PlayReadyAdditionalInformation {
  @JsonProperty("wrmHeaderCustomAttributes")
  private String wrmHeaderCustomAttributes;


  /**
   * Custom attributes that you want to add to the WRM header. This string must be valid xml. Some DRM providers require some information in the custom attributes of the msr:pro tag of the DASH manifest, otherwise the content does not play on certain devices.
   * @return wrmHeaderCustomAttributes
   */
  public String getWrmHeaderCustomAttributes() {
    return wrmHeaderCustomAttributes;
  }

  /**
   * Custom attributes that you want to add to the WRM header. This string must be valid xml. Some DRM providers require some information in the custom attributes of the msr:pro tag of the DASH manifest, otherwise the content does not play on certain devices.
   *
   * @param wrmHeaderCustomAttributes
   *        Custom attributes that you want to add to the WRM header. This string must be valid xml. Some DRM providers require some information in the custom attributes of the msr:pro tag of the DASH manifest, otherwise the content does not play on certain devices.
   */
  public void setWrmHeaderCustomAttributes(String wrmHeaderCustomAttributes) {
    this.wrmHeaderCustomAttributes = wrmHeaderCustomAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayReadyAdditionalInformation playReadyAdditionalInformation = (PlayReadyAdditionalInformation) o;
    return Objects.equals(this.wrmHeaderCustomAttributes, playReadyAdditionalInformation.wrmHeaderCustomAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wrmHeaderCustomAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayReadyAdditionalInformation {\n");
    
    sb.append("    wrmHeaderCustomAttributes: ").append(toIndentedString(wrmHeaderCustomAttributes)).append("\n");
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

