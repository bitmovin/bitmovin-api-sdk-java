package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.bitmovin.api.sdk.model.Link;
import com.bitmovin.api.sdk.model.MessageType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Message
 */

public class Message extends BitmovinResponse {
  @JsonProperty("type")
  private MessageType type;

  @JsonProperty("text")
  private String text;

  @JsonProperty("field")
  private String field;

  @JsonProperty("links")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Link> links = new ArrayList<Link>();

  @JsonProperty("more")
  private Object more;

  @JsonProperty("date")
  private Date date;


  /**
   * Message type giving a hint on the importance of the message (log level) (required)
   * @return type
   */
  public MessageType getType() {
    return type;
  }

  /**
   * Message type giving a hint on the importance of the message (log level) (required)
   *
   * @param type
   *        Message type giving a hint on the importance of the message (log level) (required)
   */
  public void setType(MessageType type) {
    this.type = type;
  }


  /**
   * Message text (required)
   * @return text
   */
  public String getText() {
    return text;
  }

  /**
   * Message text (required)
   *
   * @param text
   *        Message text (required)
   */
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Name of the field to which the message is referring to
   * @return field
   */
  public String getField() {
    return field;
  }

  /**
   * Name of the field to which the message is referring to
   *
   * @param field
   *        Name of the field to which the message is referring to
   */
  public void setField(String field) {
    this.field = field;
  }


  public Message addLinksItem(Link linksItem) {
    this.links.add(linksItem);
    return this;
  }

  /**
   * collection of links to webpages containing further information on the topic
   * @return links
   */
  public List<Link> getLinks() {
    return links;
  }

  /**
   * collection of links to webpages containing further information on the topic
   *
   * @param links
   *        collection of links to webpages containing further information on the topic
   */
  public void setLinks(List<Link> links) {
    this.links = links;
  }


  /**
   * Service-specific information
   * @return more
   */
  public Object getMore() {
    return more;
  }

  /**
   * Service-specific information
   *
   * @param more
   *        Service-specific information
   */
  public void setMore(Object more) {
    this.more = more;
  }


  /**
   * Timestamp when the message occurred
   * @return date
   */
  public Date getDate() {
    return date;
  }

  /**
   * Timestamp when the message occurred
   *
   * @param date
   *        Timestamp when the message occurred
   */
  public void setDate(Date date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.type, message.type) &&
        Objects.equals(this.text, message.text) &&
        Objects.equals(this.field, message.field) &&
        Objects.equals(this.links, message.links) &&
        Objects.equals(this.more, message.more) &&
        Objects.equals(this.date, message.date) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, field, links, more, date, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    more: ").append(toIndentedString(more)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

