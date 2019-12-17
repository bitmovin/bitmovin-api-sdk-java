package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PlayReadyAdditionalInformation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CencPlayReady
 */

public class CencPlayReady {
  @JsonProperty("laUrl")
  private String laUrl;

  @JsonProperty("pssh")
  private String pssh;

  @JsonProperty("additionalInformation")
  private PlayReadyAdditionalInformation additionalInformation;


  /**
   * Url of the license server. Either the laUrl or the pssh needs to be provided.
   * @return laUrl
   */
  public String getLaUrl() {
    return laUrl;
  }

  /**
   * Url of the license server. Either the laUrl or the pssh needs to be provided.
   *
   * @param laUrl
   *        Url of the license server. Either the laUrl or the pssh needs to be provided.
   */
  public void setLaUrl(String laUrl) {
    this.laUrl = laUrl;
  }


  /**
   * Base64 encoded pssh payload.
   * @return pssh
   */
  public String getPssh() {
    return pssh;
  }

  /**
   * Base64 encoded pssh payload.
   *
   * @param pssh
   *        Base64 encoded pssh payload.
   */
  public void setPssh(String pssh) {
    this.pssh = pssh;
  }


  /**
   * Get additionalInformation
   * @return additionalInformation
   */
  public PlayReadyAdditionalInformation getAdditionalInformation() {
    return additionalInformation;
  }

  /**
   * Set additionalInformation
   *
   * @param additionalInformation
   */
  public void setAdditionalInformation(PlayReadyAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CencPlayReady cencPlayReady = (CencPlayReady) o;
    return Objects.equals(this.laUrl, cencPlayReady.laUrl) &&
        Objects.equals(this.pssh, cencPlayReady.pssh) &&
        Objects.equals(this.additionalInformation, cencPlayReady.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(laUrl, pssh, additionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CencPlayReady {\n");
    
    sb.append("    laUrl: ").append(toIndentedString(laUrl)).append("\n");
    sb.append("    pssh: ").append(toIndentedString(pssh)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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

