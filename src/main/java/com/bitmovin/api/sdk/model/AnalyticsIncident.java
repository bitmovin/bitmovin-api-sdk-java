package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsIncident
 */

public class AnalyticsIncident {
  @JsonProperty("id")
  private String id;

  @JsonProperty("ruleId")
  private String ruleId;

  @JsonProperty("start")
  private String start;

  @JsonProperty("end")
  private String end;

  @JsonProperty("isRecovered")
  private Boolean isRecovered;


  /**
   * Incident id
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * Incident id
   *
   * @param id
   *        Incident id
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Rule Id
   * @return ruleId
   */
  public String getRuleId() {
    return ruleId;
  }

  /**
   * Rule Id
   *
   * @param ruleId
   *        Rule Id
   */
  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  /**
   * Start date of the incident
   * @return start
   */
  public String getStart() {
    return start;
  }

  /**
   * Start date of the incident
   *
   * @param start
   *        Start date of the incident
   */
  public void setStart(String start) {
    this.start = start;
  }


  /**
   * End date of the incident
   * @return end
   */
  public String getEnd() {
    return end;
  }

  /**
   * End date of the incident
   *
   * @param end
   *        End date of the incident
   */
  public void setEnd(String end) {
    this.end = end;
  }


  /**
   * Recovery state of incident
   * @return isRecovered
   */
  public Boolean getIsRecovered() {
    return isRecovered;
  }

  /**
   * Recovery state of incident
   *
   * @param isRecovered
   *        Recovery state of incident
   */
  public void setIsRecovered(Boolean isRecovered) {
    this.isRecovered = isRecovered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsIncident analyticsIncident = (AnalyticsIncident) o;
    return Objects.equals(this.id, analyticsIncident.id) &&
        Objects.equals(this.ruleId, analyticsIncident.ruleId) &&
        Objects.equals(this.start, analyticsIncident.start) &&
        Objects.equals(this.end, analyticsIncident.end) &&
        Objects.equals(this.isRecovered, analyticsIncident.isRecovered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ruleId, start, end, isRecovered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsIncident {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    isRecovered: ").append(toIndentedString(isRecovered)).append("\n");
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

