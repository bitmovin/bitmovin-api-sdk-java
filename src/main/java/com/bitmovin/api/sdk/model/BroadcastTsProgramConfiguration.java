package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * BroadcastTsProgramConfiguration
 */

public class BroadcastTsProgramConfiguration {
  @JsonProperty("programNumber")
  private Integer programNumber;

  @JsonProperty("pidForPMT")
  private Integer pidForPMT;

  @JsonProperty("insertProgramClockRefOnPes")
  private Boolean insertProgramClockRefOnPes;

  @JsonProperty("programClockRefInterval")
  private Integer programClockRefInterval;


  /**
   * An integer value. Value for program_number field in Program Map Table (PMT). The value zero is reserved for the NIT PID entry in the PAT.
   * minimum: 1
   * maximum: 65535
   * @return programNumber
   */
  public Integer getProgramNumber() {
    return programNumber;
  }

  /**
   * An integer value. Value for program_number field in Program Map Table (PMT). The value zero is reserved for the NIT PID entry in the PAT.
   * minimum: 1
   * maximum: 65535
   *
   * @param programNumber
   *        An integer value. Value for program_number field in Program Map Table (PMT). The value zero is reserved for the NIT PID entry in the PAT.
   *        minimum: 1
   *        maximum: 65535
   */
  public void setProgramNumber(Integer programNumber) {
    this.programNumber = programNumber;
  }


  /**
   * An integer value. Packet identifier (PID) to use for Program Map Table (PMT). Recommended value is 2 x programNumber.
   * minimum: 10
   * maximum: 8190
   * @return pidForPMT
   */
  public Integer getPidForPMT() {
    return pidForPMT;
  }

  /**
   * An integer value. Packet identifier (PID) to use for Program Map Table (PMT). Recommended value is 2 x programNumber.
   * minimum: 10
   * maximum: 8190
   *
   * @param pidForPMT
   *        An integer value. Packet identifier (PID) to use for Program Map Table (PMT). Recommended value is 2 x programNumber.
   *        minimum: 10
   *        maximum: 8190
   */
  public void setPidForPMT(Integer pidForPMT) {
    this.pidForPMT = pidForPMT;
  }


  /**
   * Insert Program Clock References (PCRs) on all packetized elemementary stream packets. When false, indicates that PCRs should be inserted on every PES header. This parameter is effective only when the PCR packet identifier is the same as a video or audio elementary stream.
   * @return insertProgramClockRefOnPes
   */
  public Boolean getInsertProgramClockRefOnPes() {
    return insertProgramClockRefOnPes;
  }

  /**
   * Insert Program Clock References (PCRs) on all packetized elemementary stream packets. When false, indicates that PCRs should be inserted on every PES header. This parameter is effective only when the PCR packet identifier is the same as a video or audio elementary stream.
   *
   * @param insertProgramClockRefOnPes
   *        Insert Program Clock References (PCRs) on all packetized elemementary stream packets. When false, indicates that PCRs should be inserted on every PES header. This parameter is effective only when the PCR packet identifier is the same as a video or audio elementary stream.
   */
  public void setInsertProgramClockRefOnPes(Boolean insertProgramClockRefOnPes) {
    this.insertProgramClockRefOnPes = insertProgramClockRefOnPes;
  }


  /**
   * Interval between Program Clock References (PCRs) in milliseconds. Defines the period between PCR fields inserted in the stream. The default value is 90ms.
   * minimum: 1
   * maximum: 100
   * @return programClockRefInterval
   */
  public Integer getProgramClockRefInterval() {
    return programClockRefInterval;
  }

  /**
   * Interval between Program Clock References (PCRs) in milliseconds. Defines the period between PCR fields inserted in the stream. The default value is 90ms.
   * minimum: 1
   * maximum: 100
   *
   * @param programClockRefInterval
   *        Interval between Program Clock References (PCRs) in milliseconds. Defines the period between PCR fields inserted in the stream. The default value is 90ms.
   *        minimum: 1
   *        maximum: 100
   */
  public void setProgramClockRefInterval(Integer programClockRefInterval) {
    this.programClockRefInterval = programClockRefInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastTsProgramConfiguration broadcastTsProgramConfiguration = (BroadcastTsProgramConfiguration) o;
    return Objects.equals(this.programNumber, broadcastTsProgramConfiguration.programNumber) &&
        Objects.equals(this.pidForPMT, broadcastTsProgramConfiguration.pidForPMT) &&
        Objects.equals(this.insertProgramClockRefOnPes, broadcastTsProgramConfiguration.insertProgramClockRefOnPes) &&
        Objects.equals(this.programClockRefInterval, broadcastTsProgramConfiguration.programClockRefInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programNumber, pidForPMT, insertProgramClockRefOnPes, programClockRefInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastTsProgramConfiguration {\n");
    
    sb.append("    programNumber: ").append(toIndentedString(programNumber)).append("\n");
    sb.append("    pidForPMT: ").append(toIndentedString(pidForPMT)).append("\n");
    sb.append("    insertProgramClockRefOnPes: ").append(toIndentedString(insertProgramClockRefOnPes)).append("\n");
    sb.append("    programClockRefInterval: ").append(toIndentedString(programClockRefInterval)).append("\n");
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

