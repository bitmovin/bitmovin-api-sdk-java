package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DashFmp4Representation;
import com.bitmovin.api.sdk.model.DashRepresentationType;
import com.bitmovin.api.sdk.model.DashRepresentationTypeMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DashFmp4DrmRepresentation
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "typeDiscriminator", visible = false, defaultImpl = DashFmp4DrmRepresentation.class)
public class DashFmp4DrmRepresentation extends DashFmp4Representation {
  @JsonProperty("drmId")
  private String drmId;


  /**
   * DRM Id (required)
   * @return drmId
   */
  public String getDrmId() {
    return drmId;
  }

  /**
   * DRM Id (required)
   *
   * @param drmId
   *        DRM Id (required)
   */
  public void setDrmId(String drmId) {
    this.drmId = drmId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashFmp4DrmRepresentation dashFmp4DrmRepresentation = (DashFmp4DrmRepresentation) o;
    return Objects.equals(this.drmId, dashFmp4DrmRepresentation.drmId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drmId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashFmp4DrmRepresentation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    drmId: ").append(toIndentedString(drmId)).append("\n");
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

