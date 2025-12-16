package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.bitmovin.api.sdk.model.EncodingOutput;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * KantarWatermark
 */

public class KantarWatermark extends BitmovinResponse {
  @JsonProperty("login")
  private String login;

  @JsonProperty("password")
  private String password;

  @JsonProperty("licenseId")
  private Integer licenseId;

  @JsonProperty("channelName")
  private String channelName;

  @JsonProperty("contentReference")
  private String contentReference;

  @JsonProperty("serverUrl")
  private String serverUrl;

  @JsonProperty("reportOutputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EncodingOutput> reportOutputs = new ArrayList<EncodingOutput>();


  /**
   * Username used to authenticate with the Kantar watermarking service. (required)
   * @return login
   */
  public String getLogin() {
    return login;
  }

  /**
   * Username used to authenticate with the Kantar watermarking service. (required)
   *
   * @param login
   *        Username used to authenticate with the Kantar watermarking service. (required)
   */
  public void setLogin(String login) {
    this.login = login;
  }


  /**
   * Password associated with the provided login for authentication. (required)
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Password associated with the provided login for authentication. (required)
   *
   * @param password
   *        Password associated with the provided login for authentication. (required)
   */
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * Identifier of the Kantar license to be used when processing the audio watermark. (required)
   * @return licenseId
   */
  public Integer getLicenseId() {
    return licenseId;
  }

  /**
   * Identifier of the Kantar license to be used when processing the audio watermark. (required)
   *
   * @param licenseId
   *        Identifier of the Kantar license to be used when processing the audio watermark. (required)
   */
  public void setLicenseId(Integer licenseId) {
    this.licenseId = licenseId;
  }


  /**
   * Name of the distribution channel associated with the audio content being watermarked. (required)
   * @return channelName
   */
  public String getChannelName() {
    return channelName;
  }

  /**
   * Name of the distribution channel associated with the audio content being watermarked. (required)
   *
   * @param channelName
   *        Name of the distribution channel associated with the audio content being watermarked. (required)
   */
  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }


  /**
   * Unique reference or identifier for the audio content that will be processed. (required)
   * @return contentReference
   */
  public String getContentReference() {
    return contentReference;
  }

  /**
   * Unique reference or identifier for the audio content that will be processed. (required)
   *
   * @param contentReference
   *        Unique reference or identifier for the audio content that will be processed. (required)
   */
  public void setContentReference(String contentReference) {
    this.contentReference = contentReference;
  }


  /**
   * URL of the Kantar server endpoint used to apply or validate the audio watermark. (required)
   * @return serverUrl
   */
  public String getServerUrl() {
    return serverUrl;
  }

  /**
   * URL of the Kantar server endpoint used to apply or validate the audio watermark. (required)
   *
   * @param serverUrl
   *        URL of the Kantar server endpoint used to apply or validate the audio watermark. (required)
   */
  public void setServerUrl(String serverUrl) {
    this.serverUrl = serverUrl;
  }


  public KantarWatermark addReportOutputsItem(EncodingOutput reportOutputsItem) {
    this.reportOutputs.add(reportOutputsItem);
    return this;
  }

  /**
   * The outputs where the processing report should be delivered. (required)
   * @return reportOutputs
   */
  public List<EncodingOutput> getReportOutputs() {
    return reportOutputs;
  }

  /**
   * The outputs where the processing report should be delivered. (required)
   *
   * @param reportOutputs
   *        The outputs where the processing report should be delivered. (required)
   */
  public void setReportOutputs(List<EncodingOutput> reportOutputs) {
    this.reportOutputs = reportOutputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KantarWatermark kantarWatermark = (KantarWatermark) o;
    return Objects.equals(this.login, kantarWatermark.login) &&
        Objects.equals(this.password, kantarWatermark.password) &&
        Objects.equals(this.licenseId, kantarWatermark.licenseId) &&
        Objects.equals(this.channelName, kantarWatermark.channelName) &&
        Objects.equals(this.contentReference, kantarWatermark.contentReference) &&
        Objects.equals(this.serverUrl, kantarWatermark.serverUrl) &&
        Objects.equals(this.reportOutputs, kantarWatermark.reportOutputs) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, password, licenseId, channelName, contentReference, serverUrl, reportOutputs, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KantarWatermark {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    contentReference: ").append(toIndentedString(contentReference)).append("\n");
    sb.append("    serverUrl: ").append(toIndentedString(serverUrl)).append("\n");
    sb.append("    reportOutputs: ").append(toIndentedString(reportOutputs)).append("\n");
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

