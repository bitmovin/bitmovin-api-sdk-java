package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AclEntry;
import com.bitmovin.api.sdk.model.BitmovinResource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Output
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = Output.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AkamaiNetStorageOutput.class, name = "AKAMAI_NETSTORAGE"),
  @JsonSubTypes.Type(value = AzureOutput.class, name = "AZURE"),
  @JsonSubTypes.Type(value = GenericS3Output.class, name = "GENERIC_S3"),
  @JsonSubTypes.Type(value = GcsOutput.class, name = "GCS"),
  @JsonSubTypes.Type(value = FtpOutput.class, name = "FTP"),
  @JsonSubTypes.Type(value = LocalOutput.class, name = "LOCAL"),
  @JsonSubTypes.Type(value = S3Output.class, name = "S3"),
  @JsonSubTypes.Type(value = S3RoleBasedOutput.class, name = "S3_ROLE_BASED"),
  @JsonSubTypes.Type(value = SftpOutput.class, name = "SFTP"),
  @JsonSubTypes.Type(value = AkamaiMslOutput.class, name = "AKAMAI_MSL"),
  @JsonSubTypes.Type(value = LiveMediaIngestOutput.class, name = "LIVE_MEDIA_INGEST"),
  @JsonSubTypes.Type(value = GcsServiceAccountOutput.class, name = "GCS_SERVICE_ACCOUNT"),
})

public class Output extends BitmovinResource {
  @JsonProperty("acl")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AclEntry> acl = new ArrayList<AclEntry>();


  public Output addAclItem(AclEntry aclItem) {
    this.acl.add(aclItem);
    return this;
  }

  /**
   * Get acl
   * @return acl
   */
  public List<AclEntry> getAcl() {
    return acl;
  }

  /**
   * Set acl
   *
   * @param acl
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
    Output output = (Output) o;
    return Objects.equals(this.acl, output.acl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Output {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

