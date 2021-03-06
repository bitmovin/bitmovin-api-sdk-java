package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * BasicMediaInfo
 */

public class BasicMediaInfo extends BitmovinResponse {
  @JsonProperty("groupId")
  private String groupId;

  @JsonProperty("language")
  private String language;

  @JsonProperty("assocLanguage")
  private String assocLanguage;

  @JsonProperty("name")
  private String name;

  @JsonProperty("isDefault")
  private Boolean isDefault;

  @JsonProperty("autoselect")
  private Boolean autoselect;

  @JsonProperty("characteristics")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> characteristics = new ArrayList<String>();


  /**
   * The value is a quoted-string which specifies the group to which the Rendition belongs. (required)
   * @return groupId
   */
  public String getGroupId() {
    return groupId;
  }

  /**
   * The value is a quoted-string which specifies the group to which the Rendition belongs. (required)
   *
   * @param groupId
   *        The value is a quoted-string which specifies the group to which the Rendition belongs. (required)
   */
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  /**
   * Primary language in the rendition.
   * @return language
   */
  public String getLanguage() {
    return language;
  }

  /**
   * Primary language in the rendition.
   *
   * @param language
   *        Primary language in the rendition.
   */
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Identifies a language that is associated with the Rendition.
   * @return assocLanguage
   */
  public String getAssocLanguage() {
    return assocLanguage;
  }

  /**
   * Identifies a language that is associated with the Rendition.
   *
   * @param assocLanguage
   *        Identifies a language that is associated with the Rendition.
   */
  public void setAssocLanguage(String assocLanguage) {
    this.assocLanguage = assocLanguage;
  }


  /**
   * Human readable description of the rendition. (required)
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Human readable description of the rendition. (required)
   *
   * @param name
   *        Human readable description of the rendition. (required)
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * If set to true, the client SHOULD play this Rendition of the content in the absence of information from the user.
   * @return isDefault
   */
  public Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * If set to true, the client SHOULD play this Rendition of the content in the absence of information from the user.
   *
   * @param isDefault
   *        If set to true, the client SHOULD play this Rendition of the content in the absence of information from the user.
   */
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  /**
   * If set to true, the client MAY choose to play this Rendition in the absence of explicit user preference.
   * @return autoselect
   */
  public Boolean getAutoselect() {
    return autoselect;
  }

  /**
   * If set to true, the client MAY choose to play this Rendition in the absence of explicit user preference.
   *
   * @param autoselect
   *        If set to true, the client MAY choose to play this Rendition in the absence of explicit user preference.
   */
  public void setAutoselect(Boolean autoselect) {
    this.autoselect = autoselect;
  }


  public BasicMediaInfo addCharacteristicsItem(String characteristicsItem) {
    this.characteristics.add(characteristicsItem);
    return this;
  }

  /**
   * Contains Uniform Type Identifiers
   * @return characteristics
   */
  public List<String> getCharacteristics() {
    return characteristics;
  }

  /**
   * Contains Uniform Type Identifiers
   *
   * @param characteristics
   *        Contains Uniform Type Identifiers
   */
  public void setCharacteristics(List<String> characteristics) {
    this.characteristics = characteristics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicMediaInfo basicMediaInfo = (BasicMediaInfo) o;
    return Objects.equals(this.groupId, basicMediaInfo.groupId) &&
        Objects.equals(this.language, basicMediaInfo.language) &&
        Objects.equals(this.assocLanguage, basicMediaInfo.assocLanguage) &&
        Objects.equals(this.name, basicMediaInfo.name) &&
        Objects.equals(this.isDefault, basicMediaInfo.isDefault) &&
        Objects.equals(this.autoselect, basicMediaInfo.autoselect) &&
        Objects.equals(this.characteristics, basicMediaInfo.characteristics) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, language, assocLanguage, name, isDefault, autoselect, characteristics, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicMediaInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    assocLanguage: ").append(toIndentedString(assocLanguage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    autoselect: ").append(toIndentedString(autoselect)).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
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

