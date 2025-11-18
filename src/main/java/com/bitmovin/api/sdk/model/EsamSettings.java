package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PoisEndpointCredentials;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * EsamSettings
 */

public class EsamSettings {
  @JsonProperty("poisEndpoint")
  private String poisEndpoint;

  @JsonProperty("acquisitionPointIdentity")
  private String acquisitionPointIdentity;

  @JsonProperty("zoneIdentity")
  private String zoneIdentity;

  @JsonProperty("adAvailOffset")
  private Integer adAvailOffset;

  @JsonProperty("poisEndpointCredentials")
  private PoisEndpointCredentials poisEndpointCredentials;


  /**
   * The URL of the Placement Opportunity Information System (POIS) signal processing endpoint. The encoder transmits SignalProcessingEvents to this endpoint whenever SCTE-35 messages are detected. 
   * @return poisEndpoint
   */
  public String getPoisEndpoint() {
    return poisEndpoint;
  }

  /**
   * The URL of the Placement Opportunity Information System (POIS) signal processing endpoint. The encoder transmits SignalProcessingEvents to this endpoint whenever SCTE-35 messages are detected. 
   *
   * @param poisEndpoint
   *        The URL of the Placement Opportunity Information System (POIS) signal processing endpoint. The encoder transmits SignalProcessingEvents to this endpoint whenever SCTE-35 messages are detected. 
   */
  public void setPoisEndpoint(String poisEndpoint) {
    this.poisEndpoint = poisEndpoint;
  }


  /**
   * A unique identifier representing the &#x60;Acquisition Point Identity&#x60; defined in the ESAM specification. 
   * @return acquisitionPointIdentity
   */
  public String getAcquisitionPointIdentity() {
    return acquisitionPointIdentity;
  }

  /**
   * A unique identifier representing the &#x60;Acquisition Point Identity&#x60; defined in the ESAM specification. 
   *
   * @param acquisitionPointIdentity
   *        A unique identifier representing the &#x60;Acquisition Point Identity&#x60; defined in the ESAM specification. 
   */
  public void setAcquisitionPointIdentity(String acquisitionPointIdentity) {
    this.acquisitionPointIdentity = acquisitionPointIdentity;
  }


  /**
   * Specifies the &#x60;Zone Identity&#x60; defined in the ESAM specification. 
   * @return zoneIdentity
   */
  public String getZoneIdentity() {
    return zoneIdentity;
  }

  /**
   * Specifies the &#x60;Zone Identity&#x60; defined in the ESAM specification. 
   *
   * @param zoneIdentity
   *        Specifies the &#x60;Zone Identity&#x60; defined in the ESAM specification. 
   */
  public void setZoneIdentity(String zoneIdentity) {
    this.zoneIdentity = zoneIdentity;
  }


  /**
   * Defines an offset (in milliseconds) to be applied to the stream event timestamp. This offset adjusts the &#x60;StreamTime&#x60; values (such as PTS) associated with ad opportunities or content insertions. It is used to fine-tune timing for embedded SCTE-104/35 messages to ensure precise frame alignment in the transport stream. 
   * minimum: 0
   * @return adAvailOffset
   */
  public Integer getAdAvailOffset() {
    return adAvailOffset;
  }

  /**
   * Defines an offset (in milliseconds) to be applied to the stream event timestamp. This offset adjusts the &#x60;StreamTime&#x60; values (such as PTS) associated with ad opportunities or content insertions. It is used to fine-tune timing for embedded SCTE-104/35 messages to ensure precise frame alignment in the transport stream. 
   * minimum: 0
   *
   * @param adAvailOffset
   *        Defines an offset (in milliseconds) to be applied to the stream event timestamp. This offset adjusts the &#x60;StreamTime&#x60; values (such as PTS) associated with ad opportunities or content insertions. It is used to fine-tune timing for embedded SCTE-104/35 messages to ensure precise frame alignment in the transport stream. 
   *        minimum: 0
   */
  public void setAdAvailOffset(Integer adAvailOffset) {
    this.adAvailOffset = adAvailOffset;
  }


  /**
   * If authentication is required to access the POIS endpoint, credentials must be provided. 
   * @return poisEndpointCredentials
   */
  public PoisEndpointCredentials getPoisEndpointCredentials() {
    return poisEndpointCredentials;
  }

  /**
   * If authentication is required to access the POIS endpoint, credentials must be provided. 
   *
   * @param poisEndpointCredentials
   *        If authentication is required to access the POIS endpoint, credentials must be provided. 
   */
  public void setPoisEndpointCredentials(PoisEndpointCredentials poisEndpointCredentials) {
    this.poisEndpointCredentials = poisEndpointCredentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsamSettings esamSettings = (EsamSettings) o;
    return Objects.equals(this.poisEndpoint, esamSettings.poisEndpoint) &&
        Objects.equals(this.acquisitionPointIdentity, esamSettings.acquisitionPointIdentity) &&
        Objects.equals(this.zoneIdentity, esamSettings.zoneIdentity) &&
        Objects.equals(this.adAvailOffset, esamSettings.adAvailOffset) &&
        Objects.equals(this.poisEndpointCredentials, esamSettings.poisEndpointCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poisEndpoint, acquisitionPointIdentity, zoneIdentity, adAvailOffset, poisEndpointCredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsamSettings {\n");
    
    sb.append("    poisEndpoint: ").append(toIndentedString(poisEndpoint)).append("\n");
    sb.append("    acquisitionPointIdentity: ").append(toIndentedString(acquisitionPointIdentity)).append("\n");
    sb.append("    zoneIdentity: ").append(toIndentedString(zoneIdentity)).append("\n");
    sb.append("    adAvailOffset: ").append(toIndentedString(adAvailOffset)).append("\n");
    sb.append("    poisEndpointCredentials: ").append(toIndentedString(poisEndpointCredentials)).append("\n");
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

