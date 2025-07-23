package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.HlsManifestAdMarkerType;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * HlsManifestAdMarkerSettings
 */

public class HlsManifestAdMarkerSettings {
  @JsonProperty("enabledMarkerTypes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<HlsManifestAdMarkerType> enabledMarkerTypes = new ArrayList<HlsManifestAdMarkerType>();

  @JsonProperty("disablePreannouncing")
  private Boolean disablePreannouncing;


  public HlsManifestAdMarkerSettings addEnabledMarkerTypesItem(HlsManifestAdMarkerType enabledMarkerTypesItem) {
    this.enabledMarkerTypes.add(enabledMarkerTypesItem);
    return this;
  }

  /**
   * Ad marker types that will be inserted. More than one type is possible.  - EXT_X_CUE_OUT_IN: Ad markers will be inserted using &#x60;#EXT-X-CUE-OUT&#x60; and &#x60;#EXT-X-CUE-IN&#x60; tags - EXT_OATCLS_SCTE35: Ad markers will be inserted using &#x60;#EXT-OATCLS-SCTE35&#x60; tags. They contain the base64 encoded raw bytes of the original SCTE-35 trigger. - EXT_X_SPLICEPOINT_SCTE35: Ad markers will be inserted using &#x60;#EXT-X-SPLICEPOINT-SCTE35&#x60; tags. They contain the base64 encoded raw bytes of the original SCTE-35 trigger. - EXT_X_DATERANGE: Ad markers will be inserted using &#x60;#EXT-X-DATERANGE&#x60; tags. They contain the ID, start timestamp and hex encoded raw bytes of the original SCTE-35 trigger. - EXT_X_SCTE35: Ad markers will be inserted using &#x60;#EXT-X-SCTE35&#x60; tags. They contain the base64 encoded raw bytes of the original SCTE-35 trigger. 
   * @return enabledMarkerTypes
   */
  public List<HlsManifestAdMarkerType> getEnabledMarkerTypes() {
    return enabledMarkerTypes;
  }

  /**
   * Ad marker types that will be inserted. More than one type is possible.  - EXT_X_CUE_OUT_IN: Ad markers will be inserted using &#x60;#EXT-X-CUE-OUT&#x60; and &#x60;#EXT-X-CUE-IN&#x60; tags - EXT_OATCLS_SCTE35: Ad markers will be inserted using &#x60;#EXT-OATCLS-SCTE35&#x60; tags. They contain the base64 encoded raw bytes of the original SCTE-35 trigger. - EXT_X_SPLICEPOINT_SCTE35: Ad markers will be inserted using &#x60;#EXT-X-SPLICEPOINT-SCTE35&#x60; tags. They contain the base64 encoded raw bytes of the original SCTE-35 trigger. - EXT_X_DATERANGE: Ad markers will be inserted using &#x60;#EXT-X-DATERANGE&#x60; tags. They contain the ID, start timestamp and hex encoded raw bytes of the original SCTE-35 trigger. - EXT_X_SCTE35: Ad markers will be inserted using &#x60;#EXT-X-SCTE35&#x60; tags. They contain the base64 encoded raw bytes of the original SCTE-35 trigger. 
   *
   * @param enabledMarkerTypes
   *        Ad marker types that will be inserted. More than one type is possible.  - EXT_X_CUE_OUT_IN: Ad markers will be inserted using &#x60;#EXT-X-CUE-OUT&#x60; and &#x60;#EXT-X-CUE-IN&#x60; tags - EXT_OATCLS_SCTE35: Ad markers will be inserted using &#x60;#EXT-OATCLS-SCTE35&#x60; tags. They contain the base64 encoded raw bytes of the original SCTE-35 trigger. - EXT_X_SPLICEPOINT_SCTE35: Ad markers will be inserted using &#x60;#EXT-X-SPLICEPOINT-SCTE35&#x60; tags. They contain the base64 encoded raw bytes of the original SCTE-35 trigger. - EXT_X_DATERANGE: Ad markers will be inserted using &#x60;#EXT-X-DATERANGE&#x60; tags. They contain the ID, start timestamp and hex encoded raw bytes of the original SCTE-35 trigger. - EXT_X_SCTE35: Ad markers will be inserted using &#x60;#EXT-X-SCTE35&#x60; tags. They contain the base64 encoded raw bytes of the original SCTE-35 trigger. 
   */
  public void setEnabledMarkerTypes(List<HlsManifestAdMarkerType> enabledMarkerTypes) {
    this.enabledMarkerTypes = enabledMarkerTypes;
  }


  /**
   * Certain tags, such as EXT_X_DATERANGE, may be preannounced in the HLS manifest. This means they are inserted as early as possible, before the actual ad break begins or ends. Preannouncing helps clients anticipate upcoming splice points, but may cause compatibility issues with some downstream consumers (e.g., AWS MediaTailor SSAI). When this setting is enabled, preannouncing of tags is disabled, and tags are inserted at the segment corresponding to the event&#39;s splice time. 
   * @return disablePreannouncing
   */
  public Boolean getDisablePreannouncing() {
    return disablePreannouncing;
  }

  /**
   * Certain tags, such as EXT_X_DATERANGE, may be preannounced in the HLS manifest. This means they are inserted as early as possible, before the actual ad break begins or ends. Preannouncing helps clients anticipate upcoming splice points, but may cause compatibility issues with some downstream consumers (e.g., AWS MediaTailor SSAI). When this setting is enabled, preannouncing of tags is disabled, and tags are inserted at the segment corresponding to the event&#39;s splice time. 
   *
   * @param disablePreannouncing
   *        Certain tags, such as EXT_X_DATERANGE, may be preannounced in the HLS manifest. This means they are inserted as early as possible, before the actual ad break begins or ends. Preannouncing helps clients anticipate upcoming splice points, but may cause compatibility issues with some downstream consumers (e.g., AWS MediaTailor SSAI). When this setting is enabled, preannouncing of tags is disabled, and tags are inserted at the segment corresponding to the event&#39;s splice time. 
   */
  public void setDisablePreannouncing(Boolean disablePreannouncing) {
    this.disablePreannouncing = disablePreannouncing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HlsManifestAdMarkerSettings hlsManifestAdMarkerSettings = (HlsManifestAdMarkerSettings) o;
    return Objects.equals(this.enabledMarkerTypes, hlsManifestAdMarkerSettings.enabledMarkerTypes) &&
        Objects.equals(this.disablePreannouncing, hlsManifestAdMarkerSettings.disablePreannouncing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledMarkerTypes, disablePreannouncing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HlsManifestAdMarkerSettings {\n");
    
    sb.append("    enabledMarkerTypes: ").append(toIndentedString(enabledMarkerTypes)).append("\n");
    sb.append("    disablePreannouncing: ").append(toIndentedString(disablePreannouncing)).append("\n");
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

