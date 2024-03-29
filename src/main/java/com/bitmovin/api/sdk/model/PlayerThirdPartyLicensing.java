package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PlayerThirdPartyLicensingErrorAction;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PlayerThirdPartyLicensing
 */

public class PlayerThirdPartyLicensing {
  @JsonProperty("licenseCheckServer")
  private String licenseCheckServer;

  @JsonProperty("licenseCheckTimeout")
  private Integer licenseCheckTimeout;

  @JsonProperty("errorAction")
  private PlayerThirdPartyLicensingErrorAction errorAction;

  @JsonProperty("timeoutAction")
  private PlayerThirdPartyLicensingErrorAction timeoutAction;


  /**
   * URL to your license check server (required)
   * @return licenseCheckServer
   */
  public String getLicenseCheckServer() {
    return licenseCheckServer;
  }

  /**
   * URL to your license check server (required)
   *
   * @param licenseCheckServer
   *        URL to your license check server (required)
   */
  public void setLicenseCheckServer(String licenseCheckServer) {
    this.licenseCheckServer = licenseCheckServer;
  }


  /**
   * Timeout in ms (required)
   * minimum: 100
   * maximum: 2000
   * @return licenseCheckTimeout
   */
  public Integer getLicenseCheckTimeout() {
    return licenseCheckTimeout;
  }

  /**
   * Timeout in ms (required)
   * minimum: 100
   * maximum: 2000
   *
   * @param licenseCheckTimeout
   *        Timeout in ms (required)
   *        minimum: 100
   *        maximum: 2000
   */
  public void setLicenseCheckTimeout(Integer licenseCheckTimeout) {
    this.licenseCheckTimeout = licenseCheckTimeout;
  }


  /**
   * Specify if the Licensing Request should fail or not on Third Party Licensing Error (required)
   * @return errorAction
   */
  public PlayerThirdPartyLicensingErrorAction getErrorAction() {
    return errorAction;
  }

  /**
   * Specify if the Licensing Request should fail or not on Third Party Licensing Error (required)
   *
   * @param errorAction
   *        Specify if the Licensing Request should fail or not on Third Party Licensing Error (required)
   */
  public void setErrorAction(PlayerThirdPartyLicensingErrorAction errorAction) {
    this.errorAction = errorAction;
  }


  /**
   * Specify if the Licensing Request should fail or not on Third Party Licensing timeout (required)
   * @return timeoutAction
   */
  public PlayerThirdPartyLicensingErrorAction getTimeoutAction() {
    return timeoutAction;
  }

  /**
   * Specify if the Licensing Request should fail or not on Third Party Licensing timeout (required)
   *
   * @param timeoutAction
   *        Specify if the Licensing Request should fail or not on Third Party Licensing timeout (required)
   */
  public void setTimeoutAction(PlayerThirdPartyLicensingErrorAction timeoutAction) {
    this.timeoutAction = timeoutAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerThirdPartyLicensing playerThirdPartyLicensing = (PlayerThirdPartyLicensing) o;
    return Objects.equals(this.licenseCheckServer, playerThirdPartyLicensing.licenseCheckServer) &&
        Objects.equals(this.licenseCheckTimeout, playerThirdPartyLicensing.licenseCheckTimeout) &&
        Objects.equals(this.errorAction, playerThirdPartyLicensing.errorAction) &&
        Objects.equals(this.timeoutAction, playerThirdPartyLicensing.timeoutAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseCheckServer, licenseCheckTimeout, errorAction, timeoutAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerThirdPartyLicensing {\n");
    
    sb.append("    licenseCheckServer: ").append(toIndentedString(licenseCheckServer)).append("\n");
    sb.append("    licenseCheckTimeout: ").append(toIndentedString(licenseCheckTimeout)).append("\n");
    sb.append("    errorAction: ").append(toIndentedString(errorAction)).append("\n");
    sb.append("    timeoutAction: ").append(toIndentedString(timeoutAction)).append("\n");
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

