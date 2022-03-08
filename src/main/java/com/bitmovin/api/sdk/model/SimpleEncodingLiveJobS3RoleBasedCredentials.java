package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveJobCredentials;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingLiveJobS3RoleBasedCredentials
 */

public class SimpleEncodingLiveJobS3RoleBasedCredentials extends SimpleEncodingLiveJobCredentials {
  @JsonProperty("roleArn")
  private String roleArn;

  @JsonProperty("useExternalId")
  private Boolean useExternalId;


  /**
   * Amazon ARN of the IAM Role (Identity and Access Management Role) that will be assumed for S3 access. More details can be found [here](https://bitmovin.com/docs/encoding/api-reference/sections/inputs#/Encoding/PostEncodingInputsS3RoleBased) (required)
   * @return roleArn
   */
  public String getRoleArn() {
    return roleArn;
  }

  /**
   * Amazon ARN of the IAM Role (Identity and Access Management Role) that will be assumed for S3 access. More details can be found [here](https://bitmovin.com/docs/encoding/api-reference/sections/inputs#/Encoding/PostEncodingInputsS3RoleBased) (required)
   *
   * @param roleArn
   *        Amazon ARN of the IAM Role (Identity and Access Management Role) that will be assumed for S3 access. More details can be found [here](https://bitmovin.com/docs/encoding/api-reference/sections/inputs#/Encoding/PostEncodingInputsS3RoleBased) (required)
   */
  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  /**
   * Defines if the organization ID has to be used as externalId when assuming the role. More details can be found [here](https://bitmovin.com/docs/encoding/api-reference/sections/inputs#/Encoding/PostEncodingInputsS3RoleBased)
   * @return useExternalId
   */
  public Boolean getUseExternalId() {
    return useExternalId;
  }

  /**
   * Defines if the organization ID has to be used as externalId when assuming the role. More details can be found [here](https://bitmovin.com/docs/encoding/api-reference/sections/inputs#/Encoding/PostEncodingInputsS3RoleBased)
   *
   * @param useExternalId
   *        Defines if the organization ID has to be used as externalId when assuming the role. More details can be found [here](https://bitmovin.com/docs/encoding/api-reference/sections/inputs#/Encoding/PostEncodingInputsS3RoleBased)
   */
  public void setUseExternalId(Boolean useExternalId) {
    this.useExternalId = useExternalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleEncodingLiveJobS3RoleBasedCredentials simpleEncodingLiveJobS3RoleBasedCredentials = (SimpleEncodingLiveJobS3RoleBasedCredentials) o;
    return Objects.equals(this.roleArn, simpleEncodingLiveJobS3RoleBasedCredentials.roleArn) &&
        Objects.equals(this.useExternalId, simpleEncodingLiveJobS3RoleBasedCredentials.useExternalId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleArn, useExternalId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingLiveJobS3RoleBasedCredentials {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    useExternalId: ").append(toIndentedString(useExternalId)).append("\n");
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

