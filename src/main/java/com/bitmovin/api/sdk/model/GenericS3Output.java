package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AclEntry;
import com.bitmovin.api.sdk.model.Output;
import com.bitmovin.api.sdk.model.S3AccessStyle;
import com.bitmovin.api.sdk.model.S3SignatureVersion;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * GenericS3Output
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = GenericS3Output.class)
public class GenericS3Output extends Output {
  @JsonProperty("accessKey")
  private String accessKey;

  @JsonProperty("secretKey")
  private String secretKey;

  @JsonProperty("bucketName")
  private String bucketName;

  @JsonProperty("host")
  private String host;

  @JsonProperty("port")
  private Integer port;

  @JsonProperty("ssl")
  private Boolean ssl;

  @JsonProperty("signingRegion")
  private String signingRegion;

  @JsonProperty("signatureVersion")
  private S3SignatureVersion signatureVersion;

  @JsonProperty("accessStyle")
  private S3AccessStyle accessStyle;


  /**
   * Your generic S3 access key (required)
   * @return accessKey
   */
  public String getAccessKey() {
    return accessKey;
  }

  /**
   * Your generic S3 access key (required)
   *
   * @param accessKey
   *        Your generic S3 access key (required)
   */
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  /**
   * Your generic S3 secret key (required)
   * @return secretKey
   */
  public String getSecretKey() {
    return secretKey;
  }

  /**
   * Your generic S3 secret key (required)
   *
   * @param secretKey
   *        Your generic S3 secret key (required)
   */
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  /**
   * Name of the bucket (required)
   * @return bucketName
   */
  public String getBucketName() {
    return bucketName;
  }

  /**
   * Name of the bucket (required)
   *
   * @param bucketName
   *        Name of the bucket (required)
   */
  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }


  /**
   * The Generic S3 server hostname (or IP address) (required)
   * @return host
   */
  public String getHost() {
    return host;
  }

  /**
   * The Generic S3 server hostname (or IP address) (required)
   *
   * @param host
   *        The Generic S3 server hostname (or IP address) (required)
   */
  public void setHost(String host) {
    this.host = host;
  }


  /**
   * The port on which the Generic S3 server is running on (if not provided 8000 will be used)
   * @return port
   */
  public Integer getPort() {
    return port;
  }

  /**
   * The port on which the Generic S3 server is running on (if not provided 8000 will be used)
   *
   * @param port
   *        The port on which the Generic S3 server is running on (if not provided 8000 will be used)
   */
  public void setPort(Integer port) {
    this.port = port;
  }


  /**
   * Controls whether SSL is used or not
   * @return ssl
   */
  public Boolean getSsl() {
    return ssl;
  }

  /**
   * Controls whether SSL is used or not
   *
   * @param ssl
   *        Controls whether SSL is used or not
   */
  public void setSsl(Boolean ssl) {
    this.ssl = ssl;
  }


  /**
   * The signing region to use
   * @return signingRegion
   */
  public String getSigningRegion() {
    return signingRegion;
  }

  /**
   * The signing region to use
   *
   * @param signingRegion
   *        The signing region to use
   */
  public void setSigningRegion(String signingRegion) {
    this.signingRegion = signingRegion;
  }


  /**
   * Specifies the method used for authentication
   * @return signatureVersion
   */
  public S3SignatureVersion getSignatureVersion() {
    return signatureVersion;
  }

  /**
   * Specifies the method used for authentication
   *
   * @param signatureVersion
   *        Specifies the method used for authentication
   */
  public void setSignatureVersion(S3SignatureVersion signatureVersion) {
    this.signatureVersion = signatureVersion;
  }


  /**
   * Specifies the URL access style to use
   * @return accessStyle
   */
  public S3AccessStyle getAccessStyle() {
    return accessStyle;
  }

  /**
   * Specifies the URL access style to use
   *
   * @param accessStyle
   *        Specifies the URL access style to use
   */
  public void setAccessStyle(S3AccessStyle accessStyle) {
    this.accessStyle = accessStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericS3Output genericS3Output = (GenericS3Output) o;
    return Objects.equals(this.accessKey, genericS3Output.accessKey) &&
        Objects.equals(this.secretKey, genericS3Output.secretKey) &&
        Objects.equals(this.bucketName, genericS3Output.bucketName) &&
        Objects.equals(this.host, genericS3Output.host) &&
        Objects.equals(this.port, genericS3Output.port) &&
        Objects.equals(this.ssl, genericS3Output.ssl) &&
        Objects.equals(this.signingRegion, genericS3Output.signingRegion) &&
        Objects.equals(this.signatureVersion, genericS3Output.signatureVersion) &&
        Objects.equals(this.accessStyle, genericS3Output.accessStyle) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, secretKey, bucketName, host, port, ssl, signingRegion, signatureVersion, accessStyle, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericS3Output {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    signingRegion: ").append(toIndentedString(signingRegion)).append("\n");
    sb.append("    signatureVersion: ").append(toIndentedString(signatureVersion)).append("\n");
    sb.append("    accessStyle: ").append(toIndentedString(accessStyle)).append("\n");
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

