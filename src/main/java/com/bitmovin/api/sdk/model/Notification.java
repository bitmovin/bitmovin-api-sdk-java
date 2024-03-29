package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Notification
 */

public class Notification extends BitmovinResponse {
  @JsonProperty("resolve")
  private Boolean resolve;

  @JsonProperty("resourceId")
  private String resourceId;

  @JsonProperty("triggeredAt")
  private Date triggeredAt;

  @JsonProperty("type")
  private String type;

  @JsonProperty("eventType")
  private String eventType;

  @JsonProperty("category")
  private String category;

  @JsonProperty("resourceType")
  private String resourceType;

  @JsonProperty("muted")
  private Boolean muted;

  @JsonProperty("customData")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private Map<String, Object> customData = new HashMap<String, Object>();


  /**
   * Notify when condition resolves after it was met
   * @return resolve
   */
  public Boolean getResolve() {
    return resolve;
  }

  /**
   * Notify when condition resolves after it was met
   *
   * @param resolve
   *        Notify when condition resolves after it was met
   */
  public void setResolve(Boolean resolve) {
    this.resolve = resolve;
  }


  /**
   * Specific resource, e.g. encoding id
   * @return resourceId
   */
  public String getResourceId() {
    return resourceId;
  }

  /**
   * Specific resource, e.g. encoding id
   *
   * @param resourceId
   *        Specific resource, e.g. encoding id
   */
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  /**
   * Last time the notification was triggered
   * @return triggeredAt
   */
  public Date getTriggeredAt() {
    return triggeredAt;
  }


  /**
   * Get type
   * @return type
   */
  public String getType() {
    return type;
  }

  /**
   * Set type
   *
   * @param type
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Get eventType
   * @return eventType
   */
  public String getEventType() {
    return eventType;
  }

  /**
   * Get category
   * @return category
   */
  public String getCategory() {
    return category;
  }

  /**
   * Get resourceType
   * @return resourceType
   */
  public String getResourceType() {
    return resourceType;
  }


  /**
   * Get muted
   * @return muted
   */
  public Boolean getMuted() {
    return muted;
  }

  /**
   * Set muted
   *
   * @param muted
   */
  public void setMuted(Boolean muted) {
    this.muted = muted;
  }


  public Notification putCustomDataItem(String key, Object customDataItem) {
    this.customData.put(key, customDataItem);
    return this;
  }

  /**
   * User-specific meta data. This can hold anything.
   * @return customData
   */
  public Map<String, Object> getCustomData() {
    return customData;
  }

  /**
   * User-specific meta data. This can hold anything.
   *
   * @param customData
   *        User-specific meta data. This can hold anything.
   */
  public void setCustomData(Map<String, Object> customData) {
    this.customData = customData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.resolve, notification.resolve) &&
        Objects.equals(this.resourceId, notification.resourceId) &&
        Objects.equals(this.triggeredAt, notification.triggeredAt) &&
        Objects.equals(this.type, notification.type) &&
        Objects.equals(this.eventType, notification.eventType) &&
        Objects.equals(this.category, notification.category) &&
        Objects.equals(this.resourceType, notification.resourceType) &&
        Objects.equals(this.muted, notification.muted) &&
        Objects.equals(this.customData, notification.customData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolve, resourceId, triggeredAt, type, eventType, category, resourceType, muted, customData, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resolve: ").append(toIndentedString(resolve)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    triggeredAt: ").append(toIndentedString(triggeredAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
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

