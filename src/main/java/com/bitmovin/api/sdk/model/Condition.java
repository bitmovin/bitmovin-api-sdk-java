package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AbstractCondition;
import com.bitmovin.api.sdk.model.ConditionOperator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Condition
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class Condition extends AbstractCondition {
  @JsonProperty("attribute")
  private String attribute;

  @JsonProperty("operator")
  private ConditionOperator operator;

  @JsonProperty("value")
  private String value;


  /**
   * The attribute that should be used for the evaluation
   * @return attribute
   */
  public String getAttribute() {
    return attribute;
  }

  /**
   * The attribute that should be used for the evaluation
   *
   * @param attribute
   * The attribute that should be used for the evaluation
   */
  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }


  /**
   * The operator that should be used for the evaluation
   * @return operator
   */
  public ConditionOperator getOperator() {
    return operator;
  }

  /**
   * The operator that should be used for the evaluation
   *
   * @param operator
   * The operator that should be used for the evaluation
   */
  public void setOperator(ConditionOperator operator) {
    this.operator = operator;
  }


  /**
   * The value that should be used for comparison
   * @return value
   */
  public String getValue() {
    return value;
  }

  /**
   * The value that should be used for comparison
   *
   * @param value
   * The value that should be used for comparison
   */
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Condition condition = (Condition) o;
    return Objects.equals(this.attribute, condition.attribute) &&
        Objects.equals(this.operator, condition.operator) &&
        Objects.equals(this.value, condition.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, operator, value, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Condition {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

