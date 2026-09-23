package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AclEntry;
import com.bitmovin.api.sdk.model.Output;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AiSceneAnalysisLiveOutput
 */

public class AiSceneAnalysisLiveOutput {
  @JsonProperty("outputId")
  private String outputId;

  @JsonProperty("output")
  private Output output;

  @JsonProperty("outputPath")
  private String outputPath;

  @JsonProperty("acl")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AclEntry> acl = new ArrayList<AclEntry>();


  /**
   * ID of an existing Encoding Output owned by the organization. Set either this property or &#x60;output&#x60;, but not both.
   * @return outputId
   */
  public String getOutputId() {
    return outputId;
  }

  /**
   * ID of an existing Encoding Output owned by the organization. Set either this property or &#x60;output&#x60;, but not both.
   *
   * @param outputId
   *        ID of an existing Encoding Output owned by the organization. Set either this property or &#x60;output&#x60;, but not both.
   */
  public void setOutputId(String outputId) {
    this.outputId = outputId;
  }


  /**
   * Inline definition of a concrete, publicly creatable Encoding Output to create synchronously. Only properties defined by the selected concrete Output type are accepted; internal types and properties are not supported. Deprecated properties that remain supported by the Encoding Output creation API are accepted. Set either this property or &#x60;outputId&#x60;, but not both. Put ACL entries on the destination-level &#x60;acl&#x60; property, not in this resource definition. The created Output is an ordinary reusable Encoding resource and is not automatically deleted with the Live Analysis or after provisioning failure.
   * @return output
   */
  public Output getOutput() {
    return output;
  }

  /**
   * Inline definition of a concrete, publicly creatable Encoding Output to create synchronously. Only properties defined by the selected concrete Output type are accepted; internal types and properties are not supported. Deprecated properties that remain supported by the Encoding Output creation API are accepted. Set either this property or &#x60;outputId&#x60;, but not both. Put ACL entries on the destination-level &#x60;acl&#x60; property, not in this resource definition. The created Output is an ordinary reusable Encoding resource and is not automatically deleted with the Live Analysis or after provisioning failure.
   *
   * @param output
   *        Inline definition of a concrete, publicly creatable Encoding Output to create synchronously. Only properties defined by the selected concrete Output type are accepted; internal types and properties are not supported. Deprecated properties that remain supported by the Encoding Output creation API are accepted. Set either this property or &#x60;outputId&#x60;, but not both. Put ACL entries on the destination-level &#x60;acl&#x60; property, not in this resource definition. The created Output is an ordinary reusable Encoding resource and is not automatically deleted with the Live Analysis or after provisioning failure.
   */
  public void setOutput(Output output) {
    this.output = output;
  }


  /**
   * Subdirectory where files are written. This destination setting is not part of the inline Output resource definition. (required)
   * @return outputPath
   */
  public String getOutputPath() {
    return outputPath;
  }

  /**
   * Subdirectory where files are written. This destination setting is not part of the inline Output resource definition. (required)
   *
   * @param outputPath
   *        Subdirectory where files are written. This destination setting is not part of the inline Output resource definition. (required)
   */
  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }


  public AiSceneAnalysisLiveOutput addAclItem(AclEntry aclItem) {
    this.acl.add(aclItem);
    return this;
  }

  /**
   * Determines accessibility of files written to this destination. Only applies to Output types that support ACLs. Defaults to PUBLIC_READ if the list is empty.
   * @return acl
   */
  public List<AclEntry> getAcl() {
    return acl;
  }

  /**
   * Determines accessibility of files written to this destination. Only applies to Output types that support ACLs. Defaults to PUBLIC_READ if the list is empty.
   *
   * @param acl
   *        Determines accessibility of files written to this destination. Only applies to Output types that support ACLs. Defaults to PUBLIC_READ if the list is empty.
   */
  public void setAcl(List<AclEntry> acl) {
    this.acl = acl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiSceneAnalysisLiveOutput aiSceneAnalysisLiveOutput = (AiSceneAnalysisLiveOutput) o;
    return Objects.equals(this.outputId, aiSceneAnalysisLiveOutput.outputId) &&
        Objects.equals(this.output, aiSceneAnalysisLiveOutput.output) &&
        Objects.equals(this.outputPath, aiSceneAnalysisLiveOutput.outputPath) &&
        Objects.equals(this.acl, aiSceneAnalysisLiveOutput.acl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputId, output, outputPath, acl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysisLiveOutput {\n");
    
    sb.append("    outputId: ").append(toIndentedString(outputId)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
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

