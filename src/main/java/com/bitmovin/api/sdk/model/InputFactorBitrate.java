package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * InputFactorBitrate
 */

public class InputFactorBitrate {
  @JsonProperty("value")
  private Long value;

  @JsonProperty("factor")
  private BigDecimal factor;


  /**
   * Get value
   * @return value
   */
  public Long getValue() {
    return value;
  }

  /**
   * Set value
   *
   * @param value
   */
  public void setValue(Long value) {
    this.value = value;
  }


  /**
   * Get factor
   * @return factor
   */
  public BigDecimal getFactor() {
    return factor;
  }

  /**
   * Set factor
   *
   * @param factor
   */
  public void setFactor(BigDecimal factor) {
    this.factor = factor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputFactorBitrate inputFactorBitrate = (InputFactorBitrate) o;
    return Objects.equals(this.value, inputFactorBitrate.value) &&
        Objects.equals(this.factor, inputFactorBitrate.factor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, factor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputFactorBitrate {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
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

