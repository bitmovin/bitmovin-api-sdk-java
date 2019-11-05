package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DashRepresentation
 */

public class DashRepresentation extends BitmovinResponse {
  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("muxingId")
  private String muxingId;

  @JsonProperty("dependencyId")
  private String dependencyId;


  /**
   * UUID of an encoding (required)
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * UUID of an encoding (required)
   *
   * @param encodingId
   *        UUID of an encoding (required)
   */
  public void setEncodingId(String encodingId) {
    this.encodingId = encodingId;
  }


  /**
   * UUID of a muxing (required)
   * @return muxingId
   */
  public String getMuxingId() {
    return muxingId;
  }

  /**
   * UUID of a muxing (required)
   *
   * @param muxingId
   *        UUID of a muxing (required)
   */
  public void setMuxingId(String muxingId) {
    this.muxingId = muxingId;
  }


  /**
   * Used to signal a dependency with another representation. The representation may belong to a different adaptation set
   * @return dependencyId
   */
  public String getDependencyId() {
    return dependencyId;
  }

  /**
   * Used to signal a dependency with another representation. The representation may belong to a different adaptation set
   *
   * @param dependencyId
   *        Used to signal a dependency with another representation. The representation may belong to a different adaptation set
   */
  public void setDependencyId(String dependencyId) {
    this.dependencyId = dependencyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashRepresentation dashRepresentation = (DashRepresentation) o;
    return Objects.equals(this.encodingId, dashRepresentation.encodingId) &&
        Objects.equals(this.muxingId, dashRepresentation.muxingId) &&
        Objects.equals(this.dependencyId, dashRepresentation.dependencyId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingId, muxingId, dependencyId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashRepresentation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    muxingId: ").append(toIndentedString(muxingId)).append("\n");
    sb.append("    dependencyId: ").append(toIndentedString(dependencyId)).append("\n");
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

