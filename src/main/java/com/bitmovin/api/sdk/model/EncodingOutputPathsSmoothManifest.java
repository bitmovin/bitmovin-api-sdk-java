package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * EncodingOutputPathsSmoothManifest
 */

public class EncodingOutputPathsSmoothManifest {
  @JsonProperty("id")
  private String id;

  @JsonProperty("clientManifestPath")
  private String clientManifestPath;

  @JsonProperty("serverManifestPath")
  private String serverManifestPath;


  /**
   * Id of the Smooth manifest
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * Id of the Smooth manifest
   *
   * @param id
   *        Id of the Smooth manifest
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Path to the client manifest of the Smooth manifest on the given output
   * @return clientManifestPath
   */
  public String getClientManifestPath() {
    return clientManifestPath;
  }

  /**
   * Path to the client manifest of the Smooth manifest on the given output
   *
   * @param clientManifestPath
   *        Path to the client manifest of the Smooth manifest on the given output
   */
  public void setClientManifestPath(String clientManifestPath) {
    this.clientManifestPath = clientManifestPath;
  }


  /**
   * Path to the server manifest of the Smooth manifest on the given output
   * @return serverManifestPath
   */
  public String getServerManifestPath() {
    return serverManifestPath;
  }

  /**
   * Path to the server manifest of the Smooth manifest on the given output
   *
   * @param serverManifestPath
   *        Path to the server manifest of the Smooth manifest on the given output
   */
  public void setServerManifestPath(String serverManifestPath) {
    this.serverManifestPath = serverManifestPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncodingOutputPathsSmoothManifest encodingOutputPathsSmoothManifest = (EncodingOutputPathsSmoothManifest) o;
    return Objects.equals(this.id, encodingOutputPathsSmoothManifest.id) &&
        Objects.equals(this.clientManifestPath, encodingOutputPathsSmoothManifest.clientManifestPath) &&
        Objects.equals(this.serverManifestPath, encodingOutputPathsSmoothManifest.serverManifestPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientManifestPath, serverManifestPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncodingOutputPathsSmoothManifest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientManifestPath: ").append(toIndentedString(clientManifestPath)).append("\n");
    sb.append("    serverManifestPath: ").append(toIndentedString(serverManifestPath)).append("\n");
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

