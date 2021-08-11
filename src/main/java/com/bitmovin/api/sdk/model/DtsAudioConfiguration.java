package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AudioConfiguration;
import com.bitmovin.api.sdk.model.DtsMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DtsAudioConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = DtsAudioConfiguration.class)
public class DtsAudioConfiguration extends AudioConfiguration {
  @JsonProperty("mode")
  private DtsMode mode;


  /**
   * There are two DTS modes available: DTS Express Audio (EXPRESS_AUDIO) and DTS Digital Surround (DIGITAL_SURROUND)
   * @return mode
   */
  public DtsMode getMode() {
    return mode;
  }

  /**
   * There are two DTS modes available: DTS Express Audio (EXPRESS_AUDIO) and DTS Digital Surround (DIGITAL_SURROUND)
   *
   * @param mode
   *        There are two DTS modes available: DTS Express Audio (EXPRESS_AUDIO) and DTS Digital Surround (DIGITAL_SURROUND)
   */
  public void setMode(DtsMode mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DtsAudioConfiguration dtsAudioConfiguration = (DtsAudioConfiguration) o;
    return Objects.equals(this.mode, dtsAudioConfiguration.mode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DtsAudioConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

