package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AudioGroup;
import com.bitmovin.api.sdk.model.VariantStreamDroppingMode;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AudioGroupConfiguration
 */

public class AudioGroupConfiguration {
  @JsonProperty("droppingMode")
  private VariantStreamDroppingMode droppingMode;

  @JsonProperty("groups")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AudioGroup> groups = new ArrayList<AudioGroup>();


  /**
   * Dropping mode (required)
   * @return droppingMode
   */
  public VariantStreamDroppingMode getDroppingMode() {
    return droppingMode;
  }

  /**
   * Dropping mode (required)
   *
   * @param droppingMode
   *        Dropping mode (required)
   */
  public void setDroppingMode(VariantStreamDroppingMode droppingMode) {
    this.droppingMode = droppingMode;
  }


  public AudioGroupConfiguration addGroupsItem(AudioGroup groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Audio groups (required)
   * @return groups
   */
  public List<AudioGroup> getGroups() {
    return groups;
  }

  /**
   * Audio groups (required)
   *
   * @param groups
   *        Audio groups (required)
   */
  public void setGroups(List<AudioGroup> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioGroupConfiguration audioGroupConfiguration = (AudioGroupConfiguration) o;
    return Objects.equals(this.droppingMode, audioGroupConfiguration.droppingMode) &&
        Objects.equals(this.groups, audioGroupConfiguration.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(droppingMode, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioGroupConfiguration {\n");
    
    sb.append("    droppingMode: ").append(toIndentedString(droppingMode)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

