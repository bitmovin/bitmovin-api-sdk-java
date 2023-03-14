package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AclEntry;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * EncodingOutput
 */

public class EncodingOutput {
  @JsonProperty("outputId")
  private String outputId;

  @JsonProperty("outputPath")
  private String outputPath;

  @JsonProperty("acl")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AclEntry> acl = new ArrayList<AclEntry>();


  /**
   * Id of the corresponding output (required)
   * @return outputId
   */
  public String getOutputId() {
    return outputId;
  }

  /**
   * Id of the corresponding output (required)
   *
   * @param outputId
   *        Id of the corresponding output (required)
   */
  public void setOutputId(String outputId) {
    this.outputId = outputId;
  }


  /**
   * Subdirectory where to save the files to (required)
   * @return outputPath
   */
  public String getOutputPath() {
    return outputPath;
  }

  /**
   * Subdirectory where to save the files to (required)
   *
   * @param outputPath
   *        Subdirectory where to save the files to (required)
   */
  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }


  public EncodingOutput addAclItem(AclEntry aclItem) {
    this.acl.add(aclItem);
    return this;
  }

  /**
   * Determines accessibility of files written to this output. Only applies to output types that support ACLs. Defaults to PUBLIC_READ if the list is empty. The destination (e.g. cloud storage bucket) needs to allow the configured ACL
   * @return acl
   */
  public List<AclEntry> getAcl() {
    return acl;
  }

  /**
   * Determines accessibility of files written to this output. Only applies to output types that support ACLs. Defaults to PUBLIC_READ if the list is empty. The destination (e.g. cloud storage bucket) needs to allow the configured ACL
   *
   * @param acl
   *        Determines accessibility of files written to this output. Only applies to output types that support ACLs. Defaults to PUBLIC_READ if the list is empty. The destination (e.g. cloud storage bucket) needs to allow the configured ACL
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
    EncodingOutput encodingOutput = (EncodingOutput) o;
    return Objects.equals(this.outputId, encodingOutput.outputId) &&
        Objects.equals(this.outputPath, encodingOutput.outputPath) &&
        Objects.equals(this.acl, encodingOutput.acl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputId, outputPath, acl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncodingOutput {\n");
    
    sb.append("    outputId: ").append(toIndentedString(outputId)).append("\n");
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

