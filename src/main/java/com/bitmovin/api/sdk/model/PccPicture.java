package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PccHdrConfidence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccPicture
 */

public class PccPicture {
  @JsonProperty("mark")
  private String mark;

  @JsonProperty("confidence")
  private PccHdrConfidence confidence;

  @JsonProperty("actionable")
  private Boolean actionable;

  @JsonProperty("sentence")
  private String sentence;


  /**
   * The mark the cell wears. &#x60;hdrLegend&#x60; explains it. (required)
   * @return mark
   */
  public String getMark() {
    return mark;
  }

  /**
   * The mark the cell wears. &#x60;hdrLegend&#x60; explains it. (required)
   *
   * @param mark
   *        The mark the cell wears. &#x60;hdrLegend&#x60; explains it. (required)
   */
  public void setMark(String mark) {
    this.mark = mark;
  }


  /**
   * Get confidence
   * @return confidence
   */
  public PccHdrConfidence getConfidence() {
    return confidence;
  }

  /**
   * Set confidence
   *
   * @param confidence
   */
  public void setConfidence(PccHdrConfidence confidence) {
    this.confidence = confidence;
  }


  /**
   * Whether this is a result somebody should chase, which is not how confident it is. (required)
   * @return actionable
   */
  public Boolean getActionable() {
    return actionable;
  }

  /**
   * Whether this is a result somebody should chase, which is not how confident it is. (required)
   *
   * @param actionable
   *        Whether this is a result somebody should chase, which is not how confident it is. (required)
   */
  public void setActionable(Boolean actionable) {
    this.actionable = actionable;
  }


  /**
   * Get sentence
   * @return sentence
   */
  public String getSentence() {
    return sentence;
  }

  /**
   * Set sentence
   *
   * @param sentence
   */
  public void setSentence(String sentence) {
    this.sentence = sentence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccPicture pccPicture = (PccPicture) o;
    return Objects.equals(this.mark, pccPicture.mark) &&
        Objects.equals(this.confidence, pccPicture.confidence) &&
        Objects.equals(this.actionable, pccPicture.actionable) &&
        Objects.equals(this.sentence, pccPicture.sentence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mark, confidence, actionable, sentence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccPicture {\n");
    
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    actionable: ").append(toIndentedString(actionable)).append("\n");
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
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

