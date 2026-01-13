package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EsamCondition;
import com.bitmovin.api.sdk.model.EsamSignal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ESAM media point following the SCTE-250 standard
 */

public class EsamMediaPoint {
  @JsonProperty("matchTime")
  private Date matchTime;

  @JsonProperty("signals")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EsamSignal> signals = new ArrayList<EsamSignal>();

  @JsonProperty("conditions")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EsamCondition> conditions = new ArrayList<EsamCondition>();


  /**
   * ISO 8601 date-time specifying when the signal should be matched and inserted into the live stream
   * @return matchTime
   */
  public Date getMatchTime() {
    return matchTime;
  }

  /**
   * ISO 8601 date-time specifying when the signal should be matched and inserted into the live stream
   *
   * @param matchTime
   *        ISO 8601 date-time specifying when the signal should be matched and inserted into the live stream
   */
  public void setMatchTime(Date matchTime) {
    this.matchTime = matchTime;
  }


  public EsamMediaPoint addSignalsItem(EsamSignal signalsItem) {
    this.signals.add(signalsItem);
    return this;
  }

  /**
   * Array of ESAM signals containing SCTE-35 binary data. At least one signal is required (required)
   * @return signals
   */
  public List<EsamSignal> getSignals() {
    return signals;
  }

  /**
   * Array of ESAM signals containing SCTE-35 binary data. At least one signal is required (required)
   *
   * @param signals
   *        Array of ESAM signals containing SCTE-35 binary data. At least one signal is required (required)
   */
  public void setSignals(List<EsamSignal> signals) {
    this.signals = signals;
  }


  public EsamMediaPoint addConditionsItem(EsamCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Optional array of ESAM conditions with timing offsets and directional markers (OUT/IN) for signaling content boundaries
   * @return conditions
   */
  public List<EsamCondition> getConditions() {
    return conditions;
  }

  /**
   * Optional array of ESAM conditions with timing offsets and directional markers (OUT/IN) for signaling content boundaries
   *
   * @param conditions
   *        Optional array of ESAM conditions with timing offsets and directional markers (OUT/IN) for signaling content boundaries
   */
  public void setConditions(List<EsamCondition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsamMediaPoint esamMediaPoint = (EsamMediaPoint) o;
    return Objects.equals(this.matchTime, esamMediaPoint.matchTime) &&
        Objects.equals(this.signals, esamMediaPoint.signals) &&
        Objects.equals(this.conditions, esamMediaPoint.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchTime, signals, conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsamMediaPoint {\n");
    
    sb.append("    matchTime: ").append(toIndentedString(matchTime)).append("\n");
    sb.append("    signals: ").append(toIndentedString(signals)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

