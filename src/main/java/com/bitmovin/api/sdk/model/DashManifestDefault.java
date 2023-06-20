package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DashEditionCompatibility;
import com.bitmovin.api.sdk.model.DashManifest;
import com.bitmovin.api.sdk.model.DashManifestDefaultVersion;
import com.bitmovin.api.sdk.model.DashProfile;
import com.bitmovin.api.sdk.model.DefaultDashManifestPeriod;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.ManifestType;
import com.bitmovin.api.sdk.model.Status;
import com.bitmovin.api.sdk.model.UtcTiming;
import com.bitmovin.api.sdk.model.XmlNamespace;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DashManifestDefault
 */

public class DashManifestDefault extends DashManifest {
  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("version")
  private DashManifestDefaultVersion version;

  @JsonProperty("periods")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<DefaultDashManifestPeriod> periods = new ArrayList<DefaultDashManifestPeriod>();


  /**
   * The id of the encoding to create a default manifest for. Either \&quot;encodingId\&quot; or \&quot;periods\&quot; is required.
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * The id of the encoding to create a default manifest for. Either \&quot;encodingId\&quot; or \&quot;periods\&quot; is required.
   *
   * @param encodingId
   *        The id of the encoding to create a default manifest for. Either \&quot;encodingId\&quot; or \&quot;periods\&quot; is required.
   */
  public void setEncodingId(String encodingId) {
    this.encodingId = encodingId;
  }


  /**
   * Specifies the algorithm that determines which output of the given encoding is included into the manifest. Note that this is not related to the \&quot;manifestGenerator\&quot; version of the \&quot;Start\&quot; request.
   * @return version
   */
  public DashManifestDefaultVersion getVersion() {
    return version;
  }

  /**
   * Specifies the algorithm that determines which output of the given encoding is included into the manifest. Note that this is not related to the \&quot;manifestGenerator\&quot; version of the \&quot;Start\&quot; request.
   *
   * @param version
   *        Specifies the algorithm that determines which output of the given encoding is included into the manifest. Note that this is not related to the \&quot;manifestGenerator\&quot; version of the \&quot;Start\&quot; request.
   */
  public void setVersion(DashManifestDefaultVersion version) {
    this.version = version;
  }


  public DashManifestDefault addPeriodsItem(DefaultDashManifestPeriod periodsItem) {
    this.periods.add(periodsItem);
    return this;
  }

  /**
   * Adds a period for every item. Can only be used when setting \&quot;version\&quot; to \&quot;V2\&quot;. Either \&quot;periods\&quot; or \&quot;encodingId\&quot; is required.
   * @return periods
   */
  public List<DefaultDashManifestPeriod> getPeriods() {
    return periods;
  }

  /**
   * Adds a period for every item. Can only be used when setting \&quot;version\&quot; to \&quot;V2\&quot;. Either \&quot;periods\&quot; or \&quot;encodingId\&quot; is required.
   *
   * @param periods
   *        Adds a period for every item. Can only be used when setting \&quot;version\&quot; to \&quot;V2\&quot;. Either \&quot;periods\&quot; or \&quot;encodingId\&quot; is required.
   */
  public void setPeriods(List<DefaultDashManifestPeriod> periods) {
    this.periods = periods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashManifestDefault dashManifestDefault = (DashManifestDefault) o;
    return Objects.equals(this.encodingId, dashManifestDefault.encodingId) &&
        Objects.equals(this.version, dashManifestDefault.version) &&
        Objects.equals(this.periods, dashManifestDefault.periods) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingId, version, periods, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashManifestDefault {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
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

