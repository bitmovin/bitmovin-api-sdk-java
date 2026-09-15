package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccDeviceUnit
 */

public class PccDeviceUnit {
  @JsonProperty("unitId")
  private String unitId;

  @JsonProperty("sessionIds")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> sessionIds = new ArrayList<String>();

  @JsonProperty("browserVersion")
  private String browserVersion;

  @JsonProperty("osVersion")
  private String osVersion;

  @JsonProperty("tags")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> tags = new ArrayList<String>();


  /**
   * The fleet&#39;s identifier for one physical machine, so two rows of the same pool can be told apart. (required)
   * @return unitId
   */
  public String getUnitId() {
    return unitId;
  }

  /**
   * The fleet&#39;s identifier for one physical machine, so two rows of the same pool can be told apart. (required)
   *
   * @param unitId
   *        The fleet&#39;s identifier for one physical machine, so two rows of the same pool can be told apart. (required)
   */
  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }


  public PccDeviceUnit addSessionIdsItem(String sessionIdsItem) {
    this.sessionIds.add(sessionIdsItem);
    return this;
  }

  /**
   * Get sessionIds
   * @return sessionIds
   */
  public List<String> getSessionIds() {
    return sessionIds;
  }

  /**
   * Set sessionIds
   *
   * @param sessionIds
   */
  public void setSessionIds(List<String> sessionIds) {
    this.sessionIds = sessionIds;
  }


  /**
   * Get browserVersion
   * @return browserVersion
   */
  public String getBrowserVersion() {
    return browserVersion;
  }

  /**
   * Set browserVersion
   *
   * @param browserVersion
   */
  public void setBrowserVersion(String browserVersion) {
    this.browserVersion = browserVersion;
  }


  /**
   * Get osVersion
   * @return osVersion
   */
  public String getOsVersion() {
    return osVersion;
  }

  /**
   * Set osVersion
   *
   * @param osVersion
   */
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public PccDeviceUnit addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Attribute tags such as &#x60;webos:firmwareVersion:33.23.05&#x60;, which is where a television&#39;s firmware lives.
   * @return tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Attribute tags such as &#x60;webos:firmwareVersion:33.23.05&#x60;, which is where a television&#39;s firmware lives.
   *
   * @param tags
   *        Attribute tags such as &#x60;webos:firmwareVersion:33.23.05&#x60;, which is where a television&#39;s firmware lives.
   */
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccDeviceUnit pccDeviceUnit = (PccDeviceUnit) o;
    return Objects.equals(this.unitId, pccDeviceUnit.unitId) &&
        Objects.equals(this.sessionIds, pccDeviceUnit.sessionIds) &&
        Objects.equals(this.browserVersion, pccDeviceUnit.browserVersion) &&
        Objects.equals(this.osVersion, pccDeviceUnit.osVersion) &&
        Objects.equals(this.tags, pccDeviceUnit.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitId, sessionIds, browserVersion, osVersion, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccDeviceUnit {\n");
    
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    sessionIds: ").append(toIndentedString(sessionIds)).append("\n");
    sb.append("    browserVersion: ").append(toIndentedString(browserVersion)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

