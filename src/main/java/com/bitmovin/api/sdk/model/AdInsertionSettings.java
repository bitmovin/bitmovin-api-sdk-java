package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ClockSynchronizationMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AdInsertionSettings
 */

public class AdInsertionSettings {
  @JsonProperty("enableEsamMediaPointInsertion")
  private Boolean enableEsamMediaPointInsertion;

  @JsonProperty("clockSynchronizationMode")
  private ClockSynchronizationMode clockSynchronizationMode;


  /**
   * Enabling this allows on-demand insertion of ESAM MediaPoints. When enabled, the encoder ensures that at least one SCTE-35 data stream is available.
   * @return enableEsamMediaPointInsertion
   */
  public Boolean getEnableEsamMediaPointInsertion() {
    return enableEsamMediaPointInsertion;
  }

  /**
   * Enabling this allows on-demand insertion of ESAM MediaPoints. When enabled, the encoder ensures that at least one SCTE-35 data stream is available.
   *
   * @param enableEsamMediaPointInsertion
   *        Enabling this allows on-demand insertion of ESAM MediaPoints. When enabled, the encoder ensures that at least one SCTE-35 data stream is available.
   */
  public void setEnableEsamMediaPointInsertion(Boolean enableEsamMediaPointInsertion) {
    this.enableEsamMediaPointInsertion = enableEsamMediaPointInsertion;
  }


  /**
   * Mode of clock synchronization during ad insertion.  If an HLS manifest is configured that has a PDT source set, the encoder defaults to the equivalent clockSynchronizationMode.  If both, HLS PDT source and clockSynchronizationMode, are set and don&#39;t match, the encoding will fail. 
   * @return clockSynchronizationMode
   */
  public ClockSynchronizationMode getClockSynchronizationMode() {
    return clockSynchronizationMode;
  }

  /**
   * Mode of clock synchronization during ad insertion.  If an HLS manifest is configured that has a PDT source set, the encoder defaults to the equivalent clockSynchronizationMode.  If both, HLS PDT source and clockSynchronizationMode, are set and don&#39;t match, the encoding will fail. 
   *
   * @param clockSynchronizationMode
   *        Mode of clock synchronization during ad insertion.  If an HLS manifest is configured that has a PDT source set, the encoder defaults to the equivalent clockSynchronizationMode.  If both, HLS PDT source and clockSynchronizationMode, are set and don&#39;t match, the encoding will fail. 
   */
  public void setClockSynchronizationMode(ClockSynchronizationMode clockSynchronizationMode) {
    this.clockSynchronizationMode = clockSynchronizationMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdInsertionSettings adInsertionSettings = (AdInsertionSettings) o;
    return Objects.equals(this.enableEsamMediaPointInsertion, adInsertionSettings.enableEsamMediaPointInsertion) &&
        Objects.equals(this.clockSynchronizationMode, adInsertionSettings.clockSynchronizationMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableEsamMediaPointInsertion, clockSynchronizationMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdInsertionSettings {\n");
    
    sb.append("    enableEsamMediaPointInsertion: ").append(toIndentedString(enableEsamMediaPointInsertion)).append("\n");
    sb.append("    clockSynchronizationMode: ").append(toIndentedString(clockSynchronizationMode)).append("\n");
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

