package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CencWidevine
 */

public class CencWidevine {
  @JsonProperty("pssh")
  private String pssh;


  /**
   * Base64 encoded pssh payload (required)
   * @return pssh
   */
  public String getPssh() {
    return pssh;
  }

  /**
   * Base64 encoded pssh payload (required)
   *
   * @param pssh
   *        Base64 encoded pssh payload (required)
   */
  public void setPssh(String pssh) {
    this.pssh = pssh;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CencWidevine cencWidevine = (CencWidevine) o;
    return Objects.equals(this.pssh, cencWidevine.pssh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pssh);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CencWidevine {\n");
    
    sb.append("    pssh: ").append(toIndentedString(pssh)).append("\n");
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

