package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.InsertableContentInput;
import com.bitmovin.api.sdk.model.InsertableContentStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * InsertableContent
 */

public class InsertableContent extends BitmovinResource {
  @JsonProperty("inputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<InsertableContentInput> inputs = new ArrayList<InsertableContentInput>();

  @JsonProperty("status")
  private InsertableContentStatus status;


  public InsertableContent addInputsItem(InsertableContentInput inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * List of video files to be inserted in the live stream. These have to match the codec, aspect ration and frame rate of the live stream.
   * @return inputs
   */
  public List<InsertableContentInput> getInputs() {
    return inputs;
  }

  /**
   * List of video files to be inserted in the live stream. These have to match the codec, aspect ration and frame rate of the live stream.
   *
   * @param inputs
   *        List of video files to be inserted in the live stream. These have to match the codec, aspect ration and frame rate of the live stream.
   */
  public void setInputs(List<InsertableContentInput> inputs) {
    this.inputs = inputs;
  }

  /**
   * Status of the insertable content.
   * @return status
   */
  public InsertableContentStatus getStatus() {
    return status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertableContent insertableContent = (InsertableContent) o;
    return Objects.equals(this.inputs, insertableContent.inputs) &&
        Objects.equals(this.status, insertableContent.status) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputs, status, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertableContent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

