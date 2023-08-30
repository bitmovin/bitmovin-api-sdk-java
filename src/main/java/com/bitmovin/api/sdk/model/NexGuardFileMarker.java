package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.NexGuardWatermarkingStrength;
import com.bitmovin.api.sdk.model.NexGuardWatermarkingType;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * NexGuardFileMarker
 */

public class NexGuardFileMarker extends BitmovinResource {
  @JsonProperty("license")
  private String license;

  @JsonProperty("watermarkType")
  private NexGuardWatermarkingType watermarkType;

  @JsonProperty("payload")
  private Integer payload;

  @JsonProperty("preset")
  private String preset;

  @JsonProperty("strength")
  private NexGuardWatermarkingStrength strength;


  /**
   * Use the base64 license string that Nagra provides you. (required)
   * @return license
   */
  public String getLicense() {
    return license;
  }

  /**
   * Use the base64 license string that Nagra provides you. (required)
   *
   * @param license
   *        Use the base64 license string that Nagra provides you. (required)
   */
  public void setLicense(String license) {
    this.license = license;
  }


  /**
   * The type of watermarking to be used: * &#x60;OTT&#x60; - A/B watermarking (for video streams only) * &#x60;DUPLICATED&#x60; - Stream duplication to match A/B video streams in CDN delivery (for audio streams only) 
   * @return watermarkType
   */
  public NexGuardWatermarkingType getWatermarkType() {
    return watermarkType;
  }

  /**
   * The type of watermarking to be used: * &#x60;OTT&#x60; - A/B watermarking (for video streams only) * &#x60;DUPLICATED&#x60; - Stream duplication to match A/B video streams in CDN delivery (for audio streams only) 
   *
   * @param watermarkType
   *        The type of watermarking to be used: * &#x60;OTT&#x60; - A/B watermarking (for video streams only) * &#x60;DUPLICATED&#x60; - Stream duplication to match A/B video streams in CDN delivery (for audio streams only) 
   */
  public void setWatermarkType(NexGuardWatermarkingType watermarkType) {
    this.watermarkType = watermarkType;
  }


  /**
   * Specify the payload ID that you want to be associated with this output. Valid values vary depending on your Nagra NexGuard forensic watermarking workflow. For PreRelease Content (NGPR), specify an integer from 1 through 4,194,303. You must generate a unique ID for each asset you watermark, and keep a record of th ID. Neither Nagra nor Bitmovin keep track of this for you.
   * @return payload
   */
  public Integer getPayload() {
    return payload;
  }

  /**
   * Specify the payload ID that you want to be associated with this output. Valid values vary depending on your Nagra NexGuard forensic watermarking workflow. For PreRelease Content (NGPR), specify an integer from 1 through 4,194,303. You must generate a unique ID for each asset you watermark, and keep a record of th ID. Neither Nagra nor Bitmovin keep track of this for you.
   *
   * @param payload
   *        Specify the payload ID that you want to be associated with this output. Valid values vary depending on your Nagra NexGuard forensic watermarking workflow. For PreRelease Content (NGPR), specify an integer from 1 through 4,194,303. You must generate a unique ID for each asset you watermark, and keep a record of th ID. Neither Nagra nor Bitmovin keep track of this for you.
   */
  public void setPayload(Integer payload) {
    this.payload = payload;
  }


  /**
   * Enter one of the watermarking preset strings that Nagra provides you.
   * @return preset
   */
  public String getPreset() {
    return preset;
  }

  /**
   * Enter one of the watermarking preset strings that Nagra provides you.
   *
   * @param preset
   *        Enter one of the watermarking preset strings that Nagra provides you.
   */
  public void setPreset(String preset) {
    this.preset = preset;
  }


  /**
   * Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don&#39;t specify a value here, the Nagra NexGuard library uses its default value.
   * @return strength
   */
  public NexGuardWatermarkingStrength getStrength() {
    return strength;
  }

  /**
   * Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don&#39;t specify a value here, the Nagra NexGuard library uses its default value.
   *
   * @param strength
   *        Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don&#39;t specify a value here, the Nagra NexGuard library uses its default value.
   */
  public void setStrength(NexGuardWatermarkingStrength strength) {
    this.strength = strength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NexGuardFileMarker nexGuardFileMarker = (NexGuardFileMarker) o;
    return Objects.equals(this.license, nexGuardFileMarker.license) &&
        Objects.equals(this.watermarkType, nexGuardFileMarker.watermarkType) &&
        Objects.equals(this.payload, nexGuardFileMarker.payload) &&
        Objects.equals(this.preset, nexGuardFileMarker.preset) &&
        Objects.equals(this.strength, nexGuardFileMarker.strength) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(license, watermarkType, payload, preset, strength, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NexGuardFileMarker {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    watermarkType: ").append(toIndentedString(watermarkType)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
    sb.append("    strength: ").append(toIndentedString(strength)).append("\n");
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

