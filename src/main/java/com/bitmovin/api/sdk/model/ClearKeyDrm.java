package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Drm;
import com.bitmovin.api.sdk.model.EncodingOutput;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ClearKeyDrm
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = ClearKeyDrm.class)
public class ClearKeyDrm extends Drm {
  @JsonProperty("key")
  private String key;

  @JsonProperty("kid")
  private String kid;


  /**
   * 16 byte encryption key, 32 hexadecimal characters (required)
   * @return key
   */
  public String getKey() {
    return key;
  }

  /**
   * 16 byte encryption key, 32 hexadecimal characters (required)
   *
   * @param key
   *        16 byte encryption key, 32 hexadecimal characters (required)
   */
  public void setKey(String key) {
    this.key = key;
  }


  /**
   * 16 byte key id (required)
   * @return kid
   */
  public String getKid() {
    return kid;
  }

  /**
   * 16 byte key id (required)
   *
   * @param kid
   *        16 byte key id (required)
   */
  public void setKid(String kid) {
    this.kid = kid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearKeyDrm clearKeyDrm = (ClearKeyDrm) o;
    return Objects.equals(this.key, clearKeyDrm.key) &&
        Objects.equals(this.kid, clearKeyDrm.kid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, kid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearKeyDrm {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
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

