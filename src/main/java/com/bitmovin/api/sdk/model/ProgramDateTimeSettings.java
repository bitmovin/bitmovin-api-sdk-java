package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ProgramDateTimeSource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ProgramDateTimeSettings
 */

public class ProgramDateTimeSettings {
  @JsonProperty("programDateTimeSource")
  private ProgramDateTimeSource programDateTimeSource;


  /**
   * Get programDateTimeSource
   * @return programDateTimeSource
   */
  public ProgramDateTimeSource getProgramDateTimeSource() {
    return programDateTimeSource;
  }

  /**
   * Set programDateTimeSource
   *
   * @param programDateTimeSource
   */
  public void setProgramDateTimeSource(ProgramDateTimeSource programDateTimeSource) {
    this.programDateTimeSource = programDateTimeSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramDateTimeSettings programDateTimeSettings = (ProgramDateTimeSettings) o;
    return Objects.equals(this.programDateTimeSource, programDateTimeSettings.programDateTimeSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programDateTimeSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramDateTimeSettings {\n");
    
    sb.append("    programDateTimeSource: ").append(toIndentedString(programDateTimeSource)).append("\n");
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

