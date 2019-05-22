package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BackupSrtInputs;
import com.bitmovin.api.sdk.model.Input;
import com.bitmovin.api.sdk.model.SrtMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SrtInput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class SrtInput extends Input {
  @JsonProperty("mode")
  private SrtMode mode = null;

  @JsonProperty("host")
  private String host;

  @JsonProperty("port")
  private Integer port;

  @JsonProperty("path")
  private String path;

  @JsonProperty("latency")
  private Integer latency;

  @JsonProperty("passphrase")
  private String passphrase;

  @JsonProperty("keyLength")
  private Integer keyLength;

  @JsonProperty("backupSrtInputs")
  private BackupSrtInputs backupSrtInputs = null;


  /**
   * The SRT mode to use
   * @return mode
   */
  public SrtMode getMode() {
    return mode;
  }

  public void setMode(SrtMode mode) {
    this.mode = mode;
  }


  /**
   * The name or IP of the host providing the SRT stream (only used in CALLER mode)
   * @return host
   */
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  /**
   * The port to connect to or listen on. Has to be one of [2088, 2089, 2090, 2091] when using LISTENER mode.
   * @return port
   */
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  /**
   * The path parameter of the SRT stream
   * @return path
   */
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  /**
   * The maximum accepted transmission latency in milliseconds (when both parties set different values, the maximum of the two is used for both)
   * @return latency
   */
  public Integer getLatency() {
    return latency;
  }

  public void setLatency(Integer latency) {
    this.latency = latency;
  }


  /**
   * The passphrase used to secure the SRT stream. For AES-128 encryption, you must enter a 16-character passphrase; for AES-256, you must enter a 32-character passphrase
   * @return passphrase
   */
  public String getPassphrase() {
    return passphrase;
  }

  public void setPassphrase(String passphrase) {
    this.passphrase = passphrase;
  }


  /**
   * The type of AES encryption determines the length of the key (passphrase). AES-128 uses a 16-character (128-bit) passphrase, and AES-256 uses a 32-character (256-bit) passphrase.
   * @return keyLength
   */
  public Integer getKeyLength() {
    return keyLength;
  }

  public void setKeyLength(Integer keyLength) {
    this.keyLength = keyLength;
  }


  /**
   * Get backupSrtInputs
   * @return backupSrtInputs
   */
  public BackupSrtInputs getBackupSrtInputs() {
    return backupSrtInputs;
  }

  public void setBackupSrtInputs(BackupSrtInputs backupSrtInputs) {
    this.backupSrtInputs = backupSrtInputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SrtInput srtInput = (SrtInput) o;
    return Objects.equals(this.mode, srtInput.mode) &&
        Objects.equals(this.host, srtInput.host) &&
        Objects.equals(this.port, srtInput.port) &&
        Objects.equals(this.path, srtInput.path) &&
        Objects.equals(this.latency, srtInput.latency) &&
        Objects.equals(this.passphrase, srtInput.passphrase) &&
        Objects.equals(this.keyLength, srtInput.keyLength) &&
        Objects.equals(this.backupSrtInputs, srtInput.backupSrtInputs) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, host, port, path, latency, passphrase, keyLength, backupSrtInputs, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SrtInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
    sb.append("    keyLength: ").append(toIndentedString(keyLength)).append("\n");
    sb.append("    backupSrtInputs: ").append(toIndentedString(backupSrtInputs)).append("\n");
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

