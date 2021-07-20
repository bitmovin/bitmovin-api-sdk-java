package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * TsProgramMapTableConfiguration
 */

public class TsProgramMapTableConfiguration {
  @JsonProperty("pid")
  private Integer pid;


  /**
   * An integer value. Packet Identifier (PID) for the MPEG Transport Stream PMT.
   * minimum: 16
   * maximum: 8190
   * @return pid
   */
  public Integer getPid() {
    return pid;
  }

  /**
   * An integer value. Packet Identifier (PID) for the MPEG Transport Stream PMT.
   * minimum: 16
   * maximum: 8190
   *
   * @param pid
   *        An integer value. Packet Identifier (PID) for the MPEG Transport Stream PMT.
   *        minimum: 16
   *        maximum: 8190
   */
  public void setPid(Integer pid) {
    this.pid = pid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TsProgramMapTableConfiguration tsProgramMapTableConfiguration = (TsProgramMapTableConfiguration) o;
    return Objects.equals(this.pid, tsProgramMapTableConfiguration.pid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TsProgramMapTableConfiguration {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
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

