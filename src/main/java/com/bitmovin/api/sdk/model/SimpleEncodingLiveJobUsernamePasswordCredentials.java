package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveJobCredentials;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingLiveJobUsernamePasswordCredentials
 */

public class SimpleEncodingLiveJobUsernamePasswordCredentials extends SimpleEncodingLiveJobCredentials {
  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;


  /**
   * The username to be used for authentication. (required)
   * @return username
   */
  public String getUsername() {
    return username;
  }

  /**
   * The username to be used for authentication. (required)
   *
   * @param username
   *        The username to be used for authentication. (required)
   */
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * The password to be used for authentication (required)
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * The password to be used for authentication (required)
   *
   * @param password
   *        The password to be used for authentication (required)
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
    SimpleEncodingLiveJobUsernamePasswordCredentials simpleEncodingLiveJobUsernamePasswordCredentials = (SimpleEncodingLiveJobUsernamePasswordCredentials) o;
    return Objects.equals(this.username, simpleEncodingLiveJobUsernamePasswordCredentials.username) &&
        Objects.equals(this.password, simpleEncodingLiveJobUsernamePasswordCredentials.password) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingLiveJobUsernamePasswordCredentials {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

