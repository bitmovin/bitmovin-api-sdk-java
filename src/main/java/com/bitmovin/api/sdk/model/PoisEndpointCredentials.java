package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PoisEndpointCredentials
 */

public class PoisEndpointCredentials {
  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;


  /**
   * The username required to authenticate with the POIS server. 
   * @return username
   */
  public String getUsername() {
    return username;
  }

  /**
   * The username required to authenticate with the POIS server. 
   *
   * @param username
   *        The username required to authenticate with the POIS server. 
   */
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * The password required for authentication with the POIS server. 
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * The password required for authentication with the POIS server. 
   *
   * @param password
   *        The password required for authentication with the POIS server. 
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
    PoisEndpointCredentials poisEndpointCredentials = (PoisEndpointCredentials) o;
    return Objects.equals(this.username, poisEndpointCredentials.username) &&
        Objects.equals(this.password, poisEndpointCredentials.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoisEndpointCredentials {\n");
    
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

