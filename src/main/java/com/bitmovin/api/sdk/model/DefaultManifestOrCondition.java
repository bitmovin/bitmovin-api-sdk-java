package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DefaultManifestCondition;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DefaultManifestOrCondition
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = DefaultManifestOrCondition.class)
public class DefaultManifestOrCondition extends DefaultManifestCondition {
  @JsonProperty("conditions")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<DefaultManifestCondition> conditions = new ArrayList<DefaultManifestCondition>();


  public DefaultManifestOrCondition addConditionsItem(DefaultManifestCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Array to perform the OR evaluation on. This conditions evaluates to true if at least one sub condition evaluates to true. 
   * @return conditions
   */
  public List<DefaultManifestCondition> getConditions() {
    return conditions;
  }

  /**
   * Array to perform the OR evaluation on. This conditions evaluates to true if at least one sub condition evaluates to true. 
   *
   * @param conditions
   *        Array to perform the OR evaluation on. This conditions evaluates to true if at least one sub condition evaluates to true. 
   */
  public void setConditions(List<DefaultManifestCondition> conditions) {
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
    DefaultManifestOrCondition defaultManifestOrCondition = (DefaultManifestOrCondition) o;
    return Objects.equals(this.conditions, defaultManifestOrCondition.conditions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultManifestOrCondition {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

