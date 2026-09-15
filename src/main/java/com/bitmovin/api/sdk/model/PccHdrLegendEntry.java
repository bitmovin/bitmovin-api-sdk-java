package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PccHdrConfidence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccHdrLegendEntry
 */

public class PccHdrLegendEntry {
  @JsonProperty("mark")
  private String mark;

  @JsonProperty("label")
  private String label;

  @JsonProperty("confidence")
  private PccHdrConfidence confidence;

  @JsonProperty("sentence")
  private String sentence;

  @JsonProperty("actionable")
  private Boolean actionable;


  /**
   * The mark an HDR result wears on the cell. (required)
   * @return mark
   */
  public String getMark() {
    return mark;
  }

  /**
   * The mark an HDR result wears on the cell. (required)
   *
   * @param mark
   *        The mark an HDR result wears on the cell. (required)
   */
  public void setMark(String mark) {
    this.mark = mark;
  }


  /**
   * The reader&#39;s word for it — &#x60;The frames really were HDR&#x60;, &#x60;The device claims HDR&#x60;, and so on. (required)
   * @return label
   */
  public String getLabel() {
    return label;
  }

  /**
   * The reader&#39;s word for it — &#x60;The frames really were HDR&#x60;, &#x60;The device claims HDR&#x60;, and so on. (required)
   *
   * @param label
   *        The reader&#39;s word for it — &#x60;The frames really were HDR&#x60;, &#x60;The device claims HDR&#x60;, and so on. (required)
   */
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * Which instrument established the picture, where anything did. (required)
   * @return confidence
   */
  public PccHdrConfidence getConfidence() {
    return confidence;
  }

  /**
   * Which instrument established the picture, where anything did. (required)
   *
   * @param confidence
   *        Which instrument established the picture, where anything did. (required)
   */
  public void setConfidence(PccHdrConfidence confidence) {
    this.confidence = confidence;
  }


  /**
   * What that mark establishes, and what it does not. (required)
   * @return sentence
   */
  public String getSentence() {
    return sentence;
  }

  /**
   * What that mark establishes, and what it does not. (required)
   *
   * @param sentence
   *        What that mark establishes, and what it does not. (required)
   */
  public void setSentence(String sentence) {
    this.sentence = sentence;
  }


  /**
   * Whether a result wearing this mark is one somebody should chase, which is not the same as how confident it is. (required)
   * @return actionable
   */
  public Boolean getActionable() {
    return actionable;
  }

  /**
   * Whether a result wearing this mark is one somebody should chase, which is not the same as how confident it is. (required)
   *
   * @param actionable
   *        Whether a result wearing this mark is one somebody should chase, which is not the same as how confident it is. (required)
   */
  public void setActionable(Boolean actionable) {
    this.actionable = actionable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccHdrLegendEntry pccHdrLegendEntry = (PccHdrLegendEntry) o;
    return Objects.equals(this.mark, pccHdrLegendEntry.mark) &&
        Objects.equals(this.label, pccHdrLegendEntry.label) &&
        Objects.equals(this.confidence, pccHdrLegendEntry.confidence) &&
        Objects.equals(this.sentence, pccHdrLegendEntry.sentence) &&
        Objects.equals(this.actionable, pccHdrLegendEntry.actionable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mark, label, confidence, sentence, actionable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccHdrLegendEntry {\n");
    
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
    sb.append("    actionable: ").append(toIndentedString(actionable)).append("\n");
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

