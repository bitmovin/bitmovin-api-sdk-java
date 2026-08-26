package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AdvisoryCategory;
import com.bitmovin.api.sdk.model.AdvisoryConfidence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * A single piece of advisory-relevant imagery detected within a shot, for example for regulatory on-screen disclaimers
 */

public class ContentAdvisory {
  @JsonProperty("category")
  private AdvisoryCategory category;

  @JsonProperty("confidence")
  private AdvisoryConfidence confidence;

  @JsonProperty("reason")
  private String reason;


  /**
   * The kind of advisory-relevant imagery that was detected (required)
   * @return category
   */
  public AdvisoryCategory getCategory() {
    return category;
  }

  /**
   * The kind of advisory-relevant imagery that was detected (required)
   *
   * @param category
   *        The kind of advisory-relevant imagery that was detected (required)
   */
  public void setCategory(AdvisoryCategory category) {
    this.category = category;
  }


  /**
   * The model&#39;s own certainty in this detection. Intended to help prioritise human review rather than as a threshold for discarding advisories: detection is tuned to flag uncertain cases rather than miss them, and shots that could not be analysed are reported with LOW confidence (required)
   * @return confidence
   */
  public AdvisoryConfidence getConfidence() {
    return confidence;
  }

  /**
   * The model&#39;s own certainty in this detection. Intended to help prioritise human review rather than as a threshold for discarding advisories: detection is tuned to flag uncertain cases rather than miss them, and shots that could not be analysed are reported with LOW confidence (required)
   *
   * @param confidence
   *        The model&#39;s own certainty in this detection. Intended to help prioritise human review rather than as a threshold for discarding advisories: detection is tuned to flag uncertain cases rather than miss them, and shots that could not be analysed are reported with LOW confidence (required)
   */
  public void setConfidence(AdvisoryConfidence confidence) {
    this.confidence = confidence;
  }


  /**
   * A short explanation of what was seen in the shot
   * @return reason
   */
  public String getReason() {
    return reason;
  }

  /**
   * A short explanation of what was seen in the shot
   *
   * @param reason
   *        A short explanation of what was seen in the shot
   */
  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentAdvisory contentAdvisory = (ContentAdvisory) o;
    return Objects.equals(this.category, contentAdvisory.category) &&
        Objects.equals(this.confidence, contentAdvisory.confidence) &&
        Objects.equals(this.reason, contentAdvisory.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, confidence, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentAdvisory {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

