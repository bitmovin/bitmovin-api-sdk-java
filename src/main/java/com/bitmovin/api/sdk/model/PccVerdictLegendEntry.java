package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccVerdictLegendEntry
 */

public class PccVerdictLegendEntry {
  @JsonProperty("symbol")
  private String symbol;

  @JsonProperty("label")
  private String label;

  @JsonProperty("sentence")
  private String sentence;

  @JsonProperty("aboutTheDevice")
  private Boolean aboutTheDevice;


  /**
   * The mark the grid draws for every verdict reading as this entry&#39;s label. (required)
   * @return symbol
   */
  public String getSymbol() {
    return symbol;
  }

  /**
   * The mark the grid draws for every verdict reading as this entry&#39;s label. (required)
   *
   * @param symbol
   *        The mark the grid draws for every verdict reading as this entry&#39;s label. (required)
   */
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  /**
   * The reader&#39;s word for those verdicts — &#x60;Supported&#x60;, &#x60;Not measured&#x60;, and so on. (required)
   * @return label
   */
  public String getLabel() {
    return label;
  }

  /**
   * The reader&#39;s word for those verdicts — &#x60;Supported&#x60;, &#x60;Not measured&#x60;, and so on. (required)
   *
   * @param label
   *        The reader&#39;s word for those verdicts — &#x60;Supported&#x60;, &#x60;Not measured&#x60;, and so on. (required)
   */
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * What that word means here. (required)
   * @return sentence
   */
  public String getSentence() {
    return sentence;
  }

  /**
   * What that word means here. (required)
   *
   * @param sentence
   *        What that word means here. (required)
   */
  public void setSentence(String sentence) {
    this.sentence = sentence;
  }


  /**
   * False where these verdicts say something about the measurement rather than about the device. Folding those into \&quot;not supported\&quot; is how this dataset gets misread. (required)
   * @return aboutTheDevice
   */
  public Boolean getAboutTheDevice() {
    return aboutTheDevice;
  }

  /**
   * False where these verdicts say something about the measurement rather than about the device. Folding those into \&quot;not supported\&quot; is how this dataset gets misread. (required)
   *
   * @param aboutTheDevice
   *        False where these verdicts say something about the measurement rather than about the device. Folding those into \&quot;not supported\&quot; is how this dataset gets misread. (required)
   */
  public void setAboutTheDevice(Boolean aboutTheDevice) {
    this.aboutTheDevice = aboutTheDevice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccVerdictLegendEntry pccVerdictLegendEntry = (PccVerdictLegendEntry) o;
    return Objects.equals(this.symbol, pccVerdictLegendEntry.symbol) &&
        Objects.equals(this.label, pccVerdictLegendEntry.label) &&
        Objects.equals(this.sentence, pccVerdictLegendEntry.sentence) &&
        Objects.equals(this.aboutTheDevice, pccVerdictLegendEntry.aboutTheDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, label, sentence, aboutTheDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccVerdictLegendEntry {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
    sb.append("    aboutTheDevice: ").append(toIndentedString(aboutTheDevice)).append("\n");
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

