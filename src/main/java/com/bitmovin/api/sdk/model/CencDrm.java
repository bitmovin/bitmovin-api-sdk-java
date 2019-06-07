package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.CencFairPlay;
import com.bitmovin.api.sdk.model.CencMarlin;
import com.bitmovin.api.sdk.model.CencPlayReady;
import com.bitmovin.api.sdk.model.CencWidevine;
import com.bitmovin.api.sdk.model.Drm;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.EncryptionMode;
import com.bitmovin.api.sdk.model.IvSize;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CencDrm
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class CencDrm extends Drm {
  @JsonProperty("key")
  private String key;

  @JsonProperty("kid")
  private String kid;

  @JsonProperty("encryptionMode")
  private EncryptionMode encryptionMode;

  @JsonProperty("ivSize")
  private IvSize ivSize;

  @JsonProperty("enablePiffCompatibility")
  private Boolean enablePiffCompatibility;

  @JsonProperty("widevine")
  private CencWidevine widevine;

  @JsonProperty("playReady")
  private CencPlayReady playReady;

  @JsonProperty("marlin")
  private CencMarlin marlin;

  @JsonProperty("fairPlay")
  private CencFairPlay fairPlay;


  /**
   * 16 byte encryption key, 32 hexadecimal characters
   * @return key
   */
  public String getKey() {
    return key;
  }

  /**
   * 16 byte encryption key, 32 hexadecimal characters
   *
   * @param key
   * 16 byte encryption key, 32 hexadecimal characters
   */
  public void setKey(String key) {
    this.key = key;
  }


  /**
   * 16 byte encryption key id. Required for any other DRM but FairPlay
   * @return kid
   */
  public String getKid() {
    return kid;
  }

  /**
   * 16 byte encryption key id. Required for any other DRM but FairPlay
   *
   * @param kid
   * 16 byte encryption key id. Required for any other DRM but FairPlay
   */
  public void setKid(String kid) {
    this.kid = kid;
  }


  /**
   * The encryption method to use. Default is &#x60;CTR&#x60;
   * @return encryptionMode
   */
  public EncryptionMode getEncryptionMode() {
    return encryptionMode;
  }

  /**
   * The encryption method to use. Default is &#x60;CTR&#x60;
   *
   * @param encryptionMode
   * The encryption method to use. Default is &#x60;CTR&#x60;
   */
  public void setEncryptionMode(EncryptionMode encryptionMode) {
    this.encryptionMode = encryptionMode;
  }


  /**
   * Size of the initialization vector
   * @return ivSize
   */
  public IvSize getIvSize() {
    return ivSize;
  }

  /**
   * Size of the initialization vector
   *
   * @param ivSize
   * Size of the initialization vector
   */
  public void setIvSize(IvSize ivSize) {
    this.ivSize = ivSize;
  }


  /**
   * Enables compatibility with the Protected Interoperable File Format (PIFF) specification
   * @return enablePiffCompatibility
   */
  public Boolean getEnablePiffCompatibility() {
    return enablePiffCompatibility;
  }

  /**
   * Enables compatibility with the Protected Interoperable File Format (PIFF) specification
   *
   * @param enablePiffCompatibility
   * Enables compatibility with the Protected Interoperable File Format (PIFF) specification
   */
  public void setEnablePiffCompatibility(Boolean enablePiffCompatibility) {
    this.enablePiffCompatibility = enablePiffCompatibility;
  }


  /**
   * Configuration for Widevine DRM
   * @return widevine
   */
  public CencWidevine getWidevine() {
    return widevine;
  }

  /**
   * Configuration for Widevine DRM
   *
   * @param widevine
   * Configuration for Widevine DRM
   */
  public void setWidevine(CencWidevine widevine) {
    this.widevine = widevine;
  }


  /**
   * Configuration for PlayReady DRM
   * @return playReady
   */
  public CencPlayReady getPlayReady() {
    return playReady;
  }

  /**
   * Configuration for PlayReady DRM
   *
   * @param playReady
   * Configuration for PlayReady DRM
   */
  public void setPlayReady(CencPlayReady playReady) {
    this.playReady = playReady;
  }


  /**
   * Configuration for Marlin DRM
   * @return marlin
   */
  public CencMarlin getMarlin() {
    return marlin;
  }

  /**
   * Configuration for Marlin DRM
   *
   * @param marlin
   * Configuration for Marlin DRM
   */
  public void setMarlin(CencMarlin marlin) {
    this.marlin = marlin;
  }


  /**
   * Configuration for FairPlay DRM
   * @return fairPlay
   */
  public CencFairPlay getFairPlay() {
    return fairPlay;
  }

  /**
   * Configuration for FairPlay DRM
   *
   * @param fairPlay
   * Configuration for FairPlay DRM
   */
  public void setFairPlay(CencFairPlay fairPlay) {
    this.fairPlay = fairPlay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CencDrm cencDrm = (CencDrm) o;
    return Objects.equals(this.key, cencDrm.key) &&
        Objects.equals(this.kid, cencDrm.kid) &&
        Objects.equals(this.encryptionMode, cencDrm.encryptionMode) &&
        Objects.equals(this.ivSize, cencDrm.ivSize) &&
        Objects.equals(this.enablePiffCompatibility, cencDrm.enablePiffCompatibility) &&
        Objects.equals(this.widevine, cencDrm.widevine) &&
        Objects.equals(this.playReady, cencDrm.playReady) &&
        Objects.equals(this.marlin, cencDrm.marlin) &&
        Objects.equals(this.fairPlay, cencDrm.fairPlay) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, kid, encryptionMode, ivSize, enablePiffCompatibility, widevine, playReady, marlin, fairPlay, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CencDrm {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    encryptionMode: ").append(toIndentedString(encryptionMode)).append("\n");
    sb.append("    ivSize: ").append(toIndentedString(ivSize)).append("\n");
    sb.append("    enablePiffCompatibility: ").append(toIndentedString(enablePiffCompatibility)).append("\n");
    sb.append("    widevine: ").append(toIndentedString(widevine)).append("\n");
    sb.append("    playReady: ").append(toIndentedString(playReady)).append("\n");
    sb.append("    marlin: ").append(toIndentedString(marlin)).append("\n");
    sb.append("    fairPlay: ").append(toIndentedString(fairPlay)).append("\n");
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

