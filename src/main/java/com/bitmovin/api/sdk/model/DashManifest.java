package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DashEditionCompatibility;
import com.bitmovin.api.sdk.model.DashProfile;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.Manifest;
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
 * DashManifest
 */

public class DashManifest extends Manifest {
  @JsonProperty("profile")
  private DashProfile profile;

  @JsonProperty("manifestName")
  private String manifestName;

  @JsonProperty("namespaces")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<XmlNamespace> namespaces = new ArrayList<XmlNamespace>();

  @JsonProperty("utcTimings")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<UtcTiming> utcTimings = new ArrayList<UtcTiming>();

  @JsonProperty("dashEditionCompatibility")
  private DashEditionCompatibility dashEditionCompatibility;


  /**
   * Determines if segmented or progressive representations can appear in the manifest
   * @return profile
   */
  public DashProfile getProfile() {
    return profile;
  }

  /**
   * Determines if segmented or progressive representations can appear in the manifest
   *
   * @param profile
   *        Determines if segmented or progressive representations can appear in the manifest
   */
  public void setProfile(DashProfile profile) {
    this.profile = profile;
  }


  /**
   * The filename of your manifest
   * @return manifestName
   */
  public String getManifestName() {
    return manifestName;
  }

  /**
   * The filename of your manifest
   *
   * @param manifestName
   *        The filename of your manifest
   */
  public void setManifestName(String manifestName) {
    this.manifestName = manifestName;
  }


  public DashManifest addNamespacesItem(XmlNamespace namespacesItem) {
    this.namespaces.add(namespacesItem);
    return this;
  }

  /**
   * List of additional XML namespaces to add to the DASH Manifest
   * @return namespaces
   */
  public List<XmlNamespace> getNamespaces() {
    return namespaces;
  }

  /**
   * List of additional XML namespaces to add to the DASH Manifest
   *
   * @param namespaces
   *        List of additional XML namespaces to add to the DASH Manifest
   */
  public void setNamespaces(List<XmlNamespace> namespaces) {
    this.namespaces = namespaces;
  }


  public DashManifest addUtcTimingsItem(UtcTiming utcTimingsItem) {
    this.utcTimings.add(utcTimingsItem);
    return this;
  }

  /**
   * List of UTC Timings to use for live streaming
   * @return utcTimings
   */
  public List<UtcTiming> getUtcTimings() {
    return utcTimings;
  }

  /**
   * List of UTC Timings to use for live streaming
   *
   * @param utcTimings
   *        List of UTC Timings to use for live streaming
   */
  public void setUtcTimings(List<UtcTiming> utcTimings) {
    this.utcTimings = utcTimings;
  }


  /**
   * The manifest compatibility with the standard DASH Edition.
   * @return dashEditionCompatibility
   */
  public DashEditionCompatibility getDashEditionCompatibility() {
    return dashEditionCompatibility;
  }

  /**
   * The manifest compatibility with the standard DASH Edition.
   *
   * @param dashEditionCompatibility
   *        The manifest compatibility with the standard DASH Edition.
   */
  public void setDashEditionCompatibility(DashEditionCompatibility dashEditionCompatibility) {
    this.dashEditionCompatibility = dashEditionCompatibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashManifest dashManifest = (DashManifest) o;
    return Objects.equals(this.profile, dashManifest.profile) &&
        Objects.equals(this.manifestName, dashManifest.manifestName) &&
        Objects.equals(this.namespaces, dashManifest.namespaces) &&
        Objects.equals(this.utcTimings, dashManifest.utcTimings) &&
        Objects.equals(this.dashEditionCompatibility, dashManifest.dashEditionCompatibility) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, manifestName, namespaces, utcTimings, dashEditionCompatibility, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashManifest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    manifestName: ").append(toIndentedString(manifestName)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    utcTimings: ").append(toIndentedString(utcTimings)).append("\n");
    sb.append("    dashEditionCompatibility: ").append(toIndentedString(dashEditionCompatibility)).append("\n");
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

