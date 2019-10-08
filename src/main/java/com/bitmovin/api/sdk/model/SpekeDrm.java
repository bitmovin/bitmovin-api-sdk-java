package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Drm;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.SpekeDrmProvider;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SpekeDrm
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = SpekeDrm.class)
public class SpekeDrm extends Drm {
  @JsonProperty("contentId")
  private String contentId;

  @JsonProperty("kid")
  private String kid;

  @JsonProperty("iv")
  private String iv;

  @JsonProperty("provider")
  private SpekeDrmProvider provider;

  @JsonProperty("systemIds")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> systemIds = new ArrayList<String>();


  /**
   * Unique Identifier of the content, will be generated if not set
   * @return contentId
   */
  public String getContentId() {
    return contentId;
  }

  /**
   * Unique Identifier of the content, will be generated if not set
   *
   * @param contentId
   *        Unique Identifier of the content, will be generated if not set
   */
  public void setContentId(String contentId) {
    this.contentId = contentId;
  }


  /**
   * Optional key identifier, will be generated if not set. For SPEKE DRM Configurations with the same contentId and kid the key provider will provide the same keys. 
   * @return kid
   */
  public String getKid() {
    return kid;
  }

  /**
   * Optional key identifier, will be generated if not set. For SPEKE DRM Configurations with the same contentId and kid the key provider will provide the same keys. 
   *
   * @param kid
   *        Optional key identifier, will be generated if not set. For SPEKE DRM Configurations with the same contentId and kid the key provider will provide the same keys. 
   */
  public void setKid(String kid) {
    this.kid = kid;
  }


  /**
   * 16 byte initialization vector represented by a 32-character text string. It is mandatory if systemIds contains AES128 and FairPlay. 
   * @return iv
   */
  public String getIv() {
    return iv;
  }

  /**
   * 16 byte initialization vector represented by a 32-character text string. It is mandatory if systemIds contains AES128 and FairPlay. 
   *
   * @param iv
   *        16 byte initialization vector represented by a 32-character text string. It is mandatory if systemIds contains AES128 and FairPlay. 
   */
  public void setIv(String iv) {
    this.iv = iv;
  }


  /**
   * Key provider configuration for SPEKE (required)
   * @return provider
   */
  public SpekeDrmProvider getProvider() {
    return provider;
  }

  /**
   * Key provider configuration for SPEKE (required)
   *
   * @param provider
   *        Key provider configuration for SPEKE (required)
   */
  public void setProvider(SpekeDrmProvider provider) {
    this.provider = provider;
  }


  public SpekeDrm addSystemIdsItem(String systemIdsItem) {
    this.systemIds.add(systemIdsItem);
    return this;
  }

  /**
   * DRM system identifier of the content protection scheme. At minimum one is expected. Not all systemIds are currently supported, support depends on the muxing type.  Relates to SPEKE implementation. See https://dashif.org/identifiers/content_protection/ (required)
   * @return systemIds
   */
  public List<String> getSystemIds() {
    return systemIds;
  }

  /**
   * DRM system identifier of the content protection scheme. At minimum one is expected. Not all systemIds are currently supported, support depends on the muxing type.  Relates to SPEKE implementation. See https://dashif.org/identifiers/content_protection/ (required)
   *
   * @param systemIds
   *        DRM system identifier of the content protection scheme. At minimum one is expected. Not all systemIds are currently supported, support depends on the muxing type.  Relates to SPEKE implementation. See https://dashif.org/identifiers/content_protection/ (required)
   */
  public void setSystemIds(List<String> systemIds) {
    this.systemIds = systemIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpekeDrm spekeDrm = (SpekeDrm) o;
    return Objects.equals(this.contentId, spekeDrm.contentId) &&
        Objects.equals(this.kid, spekeDrm.kid) &&
        Objects.equals(this.iv, spekeDrm.iv) &&
        Objects.equals(this.provider, spekeDrm.provider) &&
        Objects.equals(this.systemIds, spekeDrm.systemIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentId, kid, iv, provider, systemIds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpekeDrm {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    iv: ").append(toIndentedString(iv)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    systemIds: ").append(toIndentedString(systemIds)).append("\n");
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

