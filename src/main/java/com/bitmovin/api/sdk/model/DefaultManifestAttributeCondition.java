package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ConditionOperator;
import com.bitmovin.api.sdk.model.DefaultManifestCondition;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DefaultManifestAttributeCondition
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = DefaultManifestAttributeCondition.class)
public class DefaultManifestAttributeCondition extends DefaultManifestCondition {
  @JsonProperty("attribute")
  private String attribute;

  @JsonProperty("operator")
  private ConditionOperator operator;

  @JsonProperty("value")
  private String value;


  /**
   * The attribute that should be used for the evaluation: - audio.codec - audio.language - audio.bitrate - subtitle.format - subtitle.language - video.height - video.width - video.codec - video.bitrate - drm.type - muxing.type (required)
   * @return attribute
   */
  public String getAttribute() {
    return attribute;
  }

  /**
   * The attribute that should be used for the evaluation: - audio.codec - audio.language - audio.bitrate - subtitle.format - subtitle.language - video.height - video.width - video.codec - video.bitrate - drm.type - muxing.type (required)
   *
   * @param attribute
   *        The attribute that should be used for the evaluation: - audio.codec - audio.language - audio.bitrate - subtitle.format - subtitle.language - video.height - video.width - video.codec - video.bitrate - drm.type - muxing.type (required)
   */
  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }


  /**
   * The operator that should be used for the evaluation (required)
   * @return operator
   */
  public ConditionOperator getOperator() {
    return operator;
  }

  /**
   * The operator that should be used for the evaluation (required)
   *
   * @param operator
   *        The operator that should be used for the evaluation (required)
   */
  public void setOperator(ConditionOperator operator) {
    this.operator = operator;
  }


  /**
   * The value that should be used for comparison. Valid values depend on the attribute: - audio.codec (Enum; e.g., AAC, MP3, OPUS) - audio.language (String) - audio.bitrate (Integer) - subtitle.format (Enum; e.g., WEBVTT) - subtitle.language (String) - video.height (Integer) - video.width (Integer) - video.codec (Enum; e.g., AV1, H264, VP9) - video.bitrate (Integer) - drm.type (Enum; NoDrm, Cenc, CencWidevine, CencPlayReady, CencMarlin, CencFairPlay, Aes128, ClearKey, PrimeTime, Widevine, PlayReady, Marlin, FairPlay) - muxing.type (Enum; e.g., FMP4, MP4) (required)
   * @return value
   */
  public String getValue() {
    return value;
  }

  /**
   * The value that should be used for comparison. Valid values depend on the attribute: - audio.codec (Enum; e.g., AAC, MP3, OPUS) - audio.language (String) - audio.bitrate (Integer) - subtitle.format (Enum; e.g., WEBVTT) - subtitle.language (String) - video.height (Integer) - video.width (Integer) - video.codec (Enum; e.g., AV1, H264, VP9) - video.bitrate (Integer) - drm.type (Enum; NoDrm, Cenc, CencWidevine, CencPlayReady, CencMarlin, CencFairPlay, Aes128, ClearKey, PrimeTime, Widevine, PlayReady, Marlin, FairPlay) - muxing.type (Enum; e.g., FMP4, MP4) (required)
   *
   * @param value
   *        The value that should be used for comparison. Valid values depend on the attribute: - audio.codec (Enum; e.g., AAC, MP3, OPUS) - audio.language (String) - audio.bitrate (Integer) - subtitle.format (Enum; e.g., WEBVTT) - subtitle.language (String) - video.height (Integer) - video.width (Integer) - video.codec (Enum; e.g., AV1, H264, VP9) - video.bitrate (Integer) - drm.type (Enum; NoDrm, Cenc, CencWidevine, CencPlayReady, CencMarlin, CencFairPlay, Aes128, ClearKey, PrimeTime, Widevine, PlayReady, Marlin, FairPlay) - muxing.type (Enum; e.g., FMP4, MP4) (required)
   */
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultManifestAttributeCondition defaultManifestAttributeCondition = (DefaultManifestAttributeCondition) o;
    return Objects.equals(this.attribute, defaultManifestAttributeCondition.attribute) &&
        Objects.equals(this.operator, defaultManifestAttributeCondition.operator) &&
        Objects.equals(this.value, defaultManifestAttributeCondition.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, operator, value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultManifestAttributeCondition {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

