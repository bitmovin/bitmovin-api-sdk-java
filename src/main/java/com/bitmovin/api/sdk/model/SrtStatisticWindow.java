package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SrtStatisticWindow
 */

public class SrtStatisticWindow {
  @JsonProperty("congestion")
  private Long congestion;

  @JsonProperty("flight")
  private Long flight;

  @JsonProperty("flow")
  private Long flow;


  /**
   * Get congestion
   * @return congestion
   */
  public Long getCongestion() {
    return congestion;
  }

  public void setCongestion(Long congestion) {
    this.congestion = congestion;
  }


  /**
   * Get flight
   * @return flight
   */
  public Long getFlight() {
    return flight;
  }

  public void setFlight(Long flight) {
    this.flight = flight;
  }


  /**
   * Get flow
   * @return flow
   */
  public Long getFlow() {
    return flow;
  }

  public void setFlow(Long flow) {
    this.flow = flow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SrtStatisticWindow srtStatisticWindow = (SrtStatisticWindow) o;
    return Objects.equals(this.congestion, srtStatisticWindow.congestion) &&
        Objects.equals(this.flight, srtStatisticWindow.flight) &&
        Objects.equals(this.flow, srtStatisticWindow.flow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(congestion, flight, flow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SrtStatisticWindow {\n");
    
    sb.append("    congestion: ").append(toIndentedString(congestion)).append("\n");
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
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

