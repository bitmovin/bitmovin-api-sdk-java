package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ChannelsAttributeForAudio;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.HlsTargetDurationRoundingMode;
import com.bitmovin.api.sdk.model.HlsVersion;
import com.bitmovin.api.sdk.model.Manifest;
import com.bitmovin.api.sdk.model.ManifestType;
import com.bitmovin.api.sdk.model.Status;
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

  @JsonProperty("channelsAttributeForAudio")
  private ChannelsAttributeForAudio channelsAttributeForAudio;

  @JsonProperty("targetDurationRoundingMode")
  private HlsTargetDurationRoundingMode targetDurationRoundingMode;


  /**
   * The filename of your manifest. If this is not set, the &#x60;name&#x60; is used as output file name. Either one of &#x60;name&#x60; or &#x60;manifestName&#x60; is required. Be aware that spaces will be replaced with underlines (&#x60;_&#x60;) on the output.
   * @return manifestName
   */
  public String getManifestName() {
    return manifestName;
  }

  /**
   * The filename of your manifest. If this is not set, the &#x60;name&#x60; is used as output file name. Either one of &#x60;name&#x60; or &#x60;manifestName&#x60; is required. Be aware that spaces will be replaced with underlines (&#x60;_&#x60;) on the output.
   *
   * @param manifestName
   *        The filename of your manifest. If this is not set, the &#x60;name&#x60; is used as output file name. Either one of &#x60;name&#x60; or &#x60;manifestName&#x60; is required. Be aware that spaces will be replaced with underlines (&#x60;_&#x60;) on the output.
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


  /**
   * Controls the behaviour of the CHANNELS attribute for the EXT-X-VERSION tag
   * @return channelsAttributeForAudio
   */
  public ChannelsAttributeForAudio getChannelsAttributeForAudio() {
    return channelsAttributeForAudio;
  }

  /**
   * Controls the behaviour of the CHANNELS attribute for the EXT-X-VERSION tag
   *
   * @param channelsAttributeForAudio
   *        Controls the behaviour of the CHANNELS attribute for the EXT-X-VERSION tag
   */
  public void setChannelsAttributeForAudio(ChannelsAttributeForAudio channelsAttributeForAudio) {
    this.channelsAttributeForAudio = channelsAttributeForAudio;
  }


  /**
   * The rounding applied to target duration. Two possible rouding modes exist: NORMAL_ROUNDING, when the target duration is rounded to the nearest integer, or UPWARDS_ROUNDING, when the target duration is rounded to the highest integer. 
   * @return targetDurationRoundingMode
   */
  public HlsTargetDurationRoundingMode getTargetDurationRoundingMode() {
    return targetDurationRoundingMode;
  }

  /**
   * The rounding applied to target duration. Two possible rouding modes exist: NORMAL_ROUNDING, when the target duration is rounded to the nearest integer, or UPWARDS_ROUNDING, when the target duration is rounded to the highest integer. 
   *
   * @param targetDurationRoundingMode
   *        The rounding applied to target duration. Two possible rouding modes exist: NORMAL_ROUNDING, when the target duration is rounded to the nearest integer, or UPWARDS_ROUNDING, when the target duration is rounded to the highest integer. 
   */
  public void setTargetDurationRoundingMode(HlsTargetDurationRoundingMode targetDurationRoundingMode) {
    this.targetDurationRoundingMode = targetDurationRoundingMode;
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
        Objects.equals(this.channelsAttributeForAudio, hlsManifest.channelsAttributeForAudio) &&
        Objects.equals(this.targetDurationRoundingMode, hlsManifest.targetDurationRoundingMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifestName, hlsMediaPlaylistVersion, hlsMasterPlaylistVersion, channelsAttributeForAudio, targetDurationRoundingMode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HlsManifest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    manifestName: ").append(toIndentedString(manifestName)).append("\n");
    sb.append("    hlsMediaPlaylistVersion: ").append(toIndentedString(hlsMediaPlaylistVersion)).append("\n");
    sb.append("    hlsMasterPlaylistVersion: ").append(toIndentedString(hlsMasterPlaylistVersion)).append("\n");
    sb.append("    channelsAttributeForAudio: ").append(toIndentedString(channelsAttributeForAudio)).append("\n");
    sb.append("    targetDurationRoundingMode: ").append(toIndentedString(targetDurationRoundingMode)).append("\n");
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

