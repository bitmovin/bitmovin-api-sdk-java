package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * MSL5 publishing-side authentication. When enabled, the encoder sends HTTP Digest Authentication headers with every segment upload.  When &#x60;enabled&#x60; is &#x60;true&#x60;, &#x60;username&#x60; and &#x60;password&#x60; are required; the API rejects the request otherwise. When &#x60;enabled&#x60; is &#x60;false&#x60; (or this object is omitted), credentials are ignored. 
 */

public class MslPublishingAuthentication {
  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;


  /**
   * Whether HTTP Digest publishing authentication is enabled. (required)
   * @return enabled
   */
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Whether HTTP Digest publishing authentication is enabled. (required)
   *
   * @param enabled
   *        Whether HTTP Digest publishing authentication is enabled. (required)
   */
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * HTTP Digest username for publishing MSL5 segments. Required when &#x60;enabled&#x60; is &#x60;true&#x60;. 
   * @return username
   */
  public String getUsername() {
    return username;
  }

  /**
   * HTTP Digest username for publishing MSL5 segments. Required when &#x60;enabled&#x60; is &#x60;true&#x60;. 
   *
   * @param username
   *        HTTP Digest username for publishing MSL5 segments. Required when &#x60;enabled&#x60; is &#x60;true&#x60;. 
   */
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * HTTP Digest password for publishing MSL5 segments. Required when &#x60;enabled&#x60; is &#x60;true&#x60;. 
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * HTTP Digest password for publishing MSL5 segments. Required when &#x60;enabled&#x60; is &#x60;true&#x60;. 
   *
   * @param password
   *        HTTP Digest password for publishing MSL5 segments. Required when &#x60;enabled&#x60; is &#x60;true&#x60;. 
   */
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MslPublishingAuthentication mslPublishingAuthentication = (MslPublishingAuthentication) o;
    return Objects.equals(this.enabled, mslPublishingAuthentication.enabled) &&
        Objects.equals(this.username, mslPublishingAuthentication.username) &&
        Objects.equals(this.password, mslPublishingAuthentication.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MslPublishingAuthentication {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

