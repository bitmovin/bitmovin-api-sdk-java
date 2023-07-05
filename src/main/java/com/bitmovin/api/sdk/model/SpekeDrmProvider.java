package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ExternalIdMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SpekeDrmProvider
 */

public class SpekeDrmProvider {
  @JsonProperty("url")
  private String url;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("apiKey")
  private String apiKey;

  @JsonProperty("roleArn")
  private String roleArn;

  @JsonProperty("externalId")
  private String externalId;

  @JsonProperty("externalIdMode")
  private ExternalIdMode externalIdMode;

  @JsonProperty("gatewayRegion")
  private String gatewayRegion;


  /**
   * URL of the endpoint (required)
   * @return url
   */
  public String getUrl() {
    return url;
  }

  /**
   * URL of the endpoint (required)
   *
   * @param url
   *        URL of the endpoint (required)
   */
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Your username for Basic Authentication
   * @return username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Your username for Basic Authentication
   *
   * @param username
   *        Your username for Basic Authentication
   */
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Your password for Basic Authentication
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Your password for Basic Authentication
   *
   * @param password
   *        Your password for Basic Authentication
   */
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * Your API key for authentication via X-API-Key HTTP Header
   * @return apiKey
   */
  public String getApiKey() {
    return apiKey;
  }

  /**
   * Your API key for authentication via X-API-Key HTTP Header
   *
   * @param apiKey
   *        Your API key for authentication via X-API-Key HTTP Header
   */
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  /**
   * AWS role that will be assumed for the key exchange in case the provider runs on AWS.  During the key exchange the role will be assumed to be able to access the key provider.  This role is to be created in the customer&#39;s account and must be granted access to the API Gateway of the SPEKE server. For Bitmovin to be able to assume this role, the following has to be added to the trust policy of the role:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerSpekeAccess\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60; It is recommended to also set the {{externalId}} due to security reasons but it can also be ommitted.  Additionally the role needs a policy similar to the following to be able to invoke the API gateway: &#x60;&#x60;&#x60; {   \&quot;Version\&quot;: \&quot;2012-10-17\&quot;,   \&quot;Statement\&quot;: [     {       \&quot;Effect\&quot;: \&quot;Allow\&quot;,       \&quot;Action\&quot;: [         \&quot;execute-api:Invoke\&quot;       ],       \&quot;Resource\&quot;: [         \&quot;arn:aws:execute-api:{{region}}:*:*_/_*_/POST/_*\&quot;       ]     }   ] } &#x60;&#x60;&#x60; where &#x60;{{region}}&#x60; is the region of the API gateway (for example &#x60;us-west-2&#x60;), the same has to be set in the property &#39;gatewayRegion&#39;. It&#39;s also possible to set &#x60;{{region}&#x60; to &#x60;*&#x60; to give the role access to all regions. 
   * @return roleArn
   */
  public String getRoleArn() {
    return roleArn;
  }

  /**
   * AWS role that will be assumed for the key exchange in case the provider runs on AWS.  During the key exchange the role will be assumed to be able to access the key provider.  This role is to be created in the customer&#39;s account and must be granted access to the API Gateway of the SPEKE server. For Bitmovin to be able to assume this role, the following has to be added to the trust policy of the role:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerSpekeAccess\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60; It is recommended to also set the {{externalId}} due to security reasons but it can also be ommitted.  Additionally the role needs a policy similar to the following to be able to invoke the API gateway: &#x60;&#x60;&#x60; {   \&quot;Version\&quot;: \&quot;2012-10-17\&quot;,   \&quot;Statement\&quot;: [     {       \&quot;Effect\&quot;: \&quot;Allow\&quot;,       \&quot;Action\&quot;: [         \&quot;execute-api:Invoke\&quot;       ],       \&quot;Resource\&quot;: [         \&quot;arn:aws:execute-api:{{region}}:*:*_/_*_/POST/_*\&quot;       ]     }   ] } &#x60;&#x60;&#x60; where &#x60;{{region}}&#x60; is the region of the API gateway (for example &#x60;us-west-2&#x60;), the same has to be set in the property &#39;gatewayRegion&#39;. It&#39;s also possible to set &#x60;{{region}&#x60; to &#x60;*&#x60; to give the role access to all regions. 
   *
   * @param roleArn
   *        AWS role that will be assumed for the key exchange in case the provider runs on AWS.  During the key exchange the role will be assumed to be able to access the key provider.  This role is to be created in the customer&#39;s account and must be granted access to the API Gateway of the SPEKE server. For Bitmovin to be able to assume this role, the following has to be added to the trust policy of the role:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerSpekeAccess\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60; It is recommended to also set the {{externalId}} due to security reasons but it can also be ommitted.  Additionally the role needs a policy similar to the following to be able to invoke the API gateway: &#x60;&#x60;&#x60; {   \&quot;Version\&quot;: \&quot;2012-10-17\&quot;,   \&quot;Statement\&quot;: [     {       \&quot;Effect\&quot;: \&quot;Allow\&quot;,       \&quot;Action\&quot;: [         \&quot;execute-api:Invoke\&quot;       ],       \&quot;Resource\&quot;: [         \&quot;arn:aws:execute-api:{{region}}:*:*_/_*_/POST/_*\&quot;       ]     }   ] } &#x60;&#x60;&#x60; where &#x60;{{region}}&#x60; is the region of the API gateway (for example &#x60;us-west-2&#x60;), the same has to be set in the property &#39;gatewayRegion&#39;. It&#39;s also possible to set &#x60;{{region}&#x60; to &#x60;*&#x60; to give the role access to all regions. 
   */
  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  /**
   * External ID used together with the IAM role identified by &#x60;roleArn&#x60; to assume access to the SPEKE server on AWS. 
   * @return externalId
   */
  public String getExternalId() {
    return externalId;
  }

  /**
   * External ID used together with the IAM role identified by &#x60;roleArn&#x60; to assume access to the SPEKE server on AWS. 
   *
   * @param externalId
   *        External ID used together with the IAM role identified by &#x60;roleArn&#x60; to assume access to the SPEKE server on AWS. 
   */
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  /**
   * Get externalIdMode
   * @return externalIdMode
   */
  public ExternalIdMode getExternalIdMode() {
    return externalIdMode;
  }

  /**
   * Set externalIdMode
   *
   * @param externalIdMode
   */
  public void setExternalIdMode(ExternalIdMode externalIdMode) {
    this.externalIdMode = externalIdMode;
  }


  /**
   * Describes the region of the AWS API Gateway that is used to access the SPEKE server. This property is mandatory when setting &#39;roleArn&#39; and has to indicate in which region the AWS API Gateway is setup. This usually corresponds to the &#x60;{{region}}&#x60; one sets in the execute-api policy for the role as described in &#39;roleArn&#39;. 
   * @return gatewayRegion
   */
  public String getGatewayRegion() {
    return gatewayRegion;
  }

  /**
   * Describes the region of the AWS API Gateway that is used to access the SPEKE server. This property is mandatory when setting &#39;roleArn&#39; and has to indicate in which region the AWS API Gateway is setup. This usually corresponds to the &#x60;{{region}}&#x60; one sets in the execute-api policy for the role as described in &#39;roleArn&#39;. 
   *
   * @param gatewayRegion
   *        Describes the region of the AWS API Gateway that is used to access the SPEKE server. This property is mandatory when setting &#39;roleArn&#39; and has to indicate in which region the AWS API Gateway is setup. This usually corresponds to the &#x60;{{region}}&#x60; one sets in the execute-api policy for the role as described in &#39;roleArn&#39;. 
   */
  public void setGatewayRegion(String gatewayRegion) {
    this.gatewayRegion = gatewayRegion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpekeDrmProvider spekeDrmProvider = (SpekeDrmProvider) o;
    return Objects.equals(this.url, spekeDrmProvider.url) &&
        Objects.equals(this.username, spekeDrmProvider.username) &&
        Objects.equals(this.password, spekeDrmProvider.password) &&
        Objects.equals(this.apiKey, spekeDrmProvider.apiKey) &&
        Objects.equals(this.roleArn, spekeDrmProvider.roleArn) &&
        Objects.equals(this.externalId, spekeDrmProvider.externalId) &&
        Objects.equals(this.externalIdMode, spekeDrmProvider.externalIdMode) &&
        Objects.equals(this.gatewayRegion, spekeDrmProvider.gatewayRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, username, password, apiKey, roleArn, externalId, externalIdMode, gatewayRegion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpekeDrmProvider {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalIdMode: ").append(toIndentedString(externalIdMode)).append("\n");
    sb.append("    gatewayRegion: ").append(toIndentedString(gatewayRegion)).append("\n");
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

