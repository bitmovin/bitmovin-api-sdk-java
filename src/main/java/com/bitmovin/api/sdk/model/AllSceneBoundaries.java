package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AllSceneBoundaries
 */

public class AllSceneBoundaries {
  @JsonProperty("isEnabled")
  private Boolean isEnabled;

  @JsonProperty("insertCueTags")
  private Boolean insertCueTags;


  /**
   * If true, a keyframe (IDR frame) is placed at every detected scene boundary, enabling clean segment cuts aligned with scene changes. 
   * @return isEnabled
   */
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  /**
   * If true, a keyframe (IDR frame) is placed at every detected scene boundary, enabling clean segment cuts aligned with scene changes. 
   *
   * @param isEnabled
   *        If true, a keyframe (IDR frame) is placed at every detected scene boundary, enabling clean segment cuts aligned with scene changes. 
   */
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  /**
   * If true, cue tags are inserted at every scene boundary in addition to keyframes. 
   * @return insertCueTags
   */
  public Boolean getInsertCueTags() {
    return insertCueTags;
  }

  /**
   * If true, cue tags are inserted at every scene boundary in addition to keyframes. 
   *
   * @param insertCueTags
   *        If true, cue tags are inserted at every scene boundary in addition to keyframes. 
   */
  public void setInsertCueTags(Boolean insertCueTags) {
    this.insertCueTags = insertCueTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllSceneBoundaries allSceneBoundaries = (AllSceneBoundaries) o;
    return Objects.equals(this.isEnabled, allSceneBoundaries.isEnabled) &&
        Objects.equals(this.insertCueTags, allSceneBoundaries.insertCueTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, insertCueTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllSceneBoundaries {\n");
    
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    insertCueTags: ").append(toIndentedString(insertCueTags)).append("\n");
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

