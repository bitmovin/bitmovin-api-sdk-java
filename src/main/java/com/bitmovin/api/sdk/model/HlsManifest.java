package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.HlsVersion;
import com.bitmovin.api.sdk.model.Manifest;
import com.bitmovin.api.sdk.model.ManifestType;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * HlsManifest
 */

public class HlsManifest extends Manifest {
  @JsonProperty("manifestName")
  private String manifestName;

  @JsonProperty("hlsMediaPlaylistVersion")
  private HlsVersion hlsMediaPlaylistVersion;

  @JsonProperty("hlsMasterPlaylistVersion")
  private HlsVersion hlsMasterPlaylistVersion;


  /**
   * The filename of your manifest (required)
   * @return manifestName
   */
  public String getManifestName() {
    return manifestName;
  }

  /**
   * The filename of your manifest (required)
   *
   * @param manifestName
   *        The filename of your manifest (required)
   */
  public void setManifestName(String manifestName) {
    this.manifestName = manifestName;
  }


  /**
   * If this is set, the EXT-X-VERSION tags of the Media Playlists are set to the provided version
   * @return hlsMediaPlaylistVersion
   */
  public HlsVersion getHlsMediaPlaylistVersion() {
    return hlsMediaPlaylistVersion;
  }

  /**
   * If this is set, the EXT-X-VERSION tags of the Media Playlists are set to the provided version
   *
   * @param hlsMediaPlaylistVersion
   *        If this is set, the EXT-X-VERSION tags of the Media Playlists are set to the provided version
   */
  public void setHlsMediaPlaylistVersion(HlsVersion hlsMediaPlaylistVersion) {
    this.hlsMediaPlaylistVersion = hlsMediaPlaylistVersion;
  }


  /**
   * If this is set, the EXT-X-VERSION tag of the Master Playlist is set to the provided version
   * @return hlsMasterPlaylistVersion
   */
  public HlsVersion getHlsMasterPlaylistVersion() {
    return hlsMasterPlaylistVersion;
  }

  /**
   * If this is set, the EXT-X-VERSION tag of the Master Playlist is set to the provided version
   *
   * @param hlsMasterPlaylistVersion
   *        If this is set, the EXT-X-VERSION tag of the Master Playlist is set to the provided version
   */
  public void setHlsMasterPlaylistVersion(HlsVersion hlsMasterPlaylistVersion) {
    this.hlsMasterPlaylistVersion = hlsMasterPlaylistVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HlsManifest hlsManifest = (HlsManifest) o;
    return Objects.equals(this.manifestName, hlsManifest.manifestName) &&
        Objects.equals(this.hlsMediaPlaylistVersion, hlsManifest.hlsMediaPlaylistVersion) &&
        Objects.equals(this.hlsMasterPlaylistVersion, hlsManifest.hlsMasterPlaylistVersion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifestName, hlsMediaPlaylistVersion, hlsMasterPlaylistVersion, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HlsManifest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    manifestName: ").append(toIndentedString(manifestName)).append("\n");
    sb.append("    hlsMediaPlaylistVersion: ").append(toIndentedString(hlsMediaPlaylistVersion)).append("\n");
    sb.append("    hlsMasterPlaylistVersion: ").append(toIndentedString(hlsMasterPlaylistVersion)).append("\n");
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

