package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Label
 */

public class Label {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("lang")
  private String lang;

  @JsonProperty("value")
  private String value;


  /**
   * Identifier of the label.
   * minimum: 0
   * @return id
   */
  public Long getId() {
    return id;
  }

  /**
   * Identifier of the label.
   * minimum: 0
   *
   * @param id
   *        Identifier of the label.
   *        minimum: 0
   */
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Specifies the language of the label.
   * @return lang
   */
  public String getLang() {
    return lang;
  }

  /**
   * Specifies the language of the label.
   *
   * @param lang
   *        Specifies the language of the label.
   */
  public void setLang(String lang) {
    this.lang = lang;
  }


  /**
   * Content of the label. (required)
   * @return value
   */
  public String getValue() {
    return value;
  }

  /**
   * Content of the label. (required)
   *
   * @param value
   *        Content of the label. (required)
   */
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Label label = (Label) o;
    return Objects.equals(this.id, label.id) &&
        Objects.equals(this.lang, label.lang) &&
        Objects.equals(this.value, label.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lang, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

