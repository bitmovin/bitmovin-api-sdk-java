package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DolbyDigitalDialogueIntelligence;
import com.bitmovin.api.sdk.model.DolbyDigitalLoudnessControlMode;
import com.bitmovin.api.sdk.model.DolbyDigitalLoudnessControlRegulationType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DolbyDigitalLoudnessControl
 */

public class DolbyDigitalLoudnessControl {
  @JsonProperty("dialnorm")
  private Integer dialnorm;

  @JsonProperty("dialogueIntelligence")
  private DolbyDigitalDialogueIntelligence dialogueIntelligence;

  @JsonProperty("mode")
  private DolbyDigitalLoudnessControlMode mode;

  @JsonProperty("peakLimit")
  private Double peakLimit;

  @JsonProperty("regulationType")
  private DolbyDigitalLoudnessControlRegulationType regulationType;


  /**
   * Dialogue Normalization value to be set on the bitstream metadata. Required if the mode is &#x60;PASSTHROUGH&#x60;, or if the mode is &#x60;CORRECTION&#x60; and regulationType is &#x60;MANUAL&#x60;. For all other combinations dialnorm must not be set.
   * minimum: -31
   * maximum: -1
   * @return dialnorm
   */
  public Integer getDialnorm() {
    return dialnorm;
  }

  /**
   * Dialogue Normalization value to be set on the bitstream metadata. Required if the mode is &#x60;PASSTHROUGH&#x60;, or if the mode is &#x60;CORRECTION&#x60; and regulationType is &#x60;MANUAL&#x60;. For all other combinations dialnorm must not be set.
   * minimum: -31
   * maximum: -1
   *
   * @param dialnorm
   *        Dialogue Normalization value to be set on the bitstream metadata. Required if the mode is &#x60;PASSTHROUGH&#x60;, or if the mode is &#x60;CORRECTION&#x60; and regulationType is &#x60;MANUAL&#x60;. For all other combinations dialnorm must not be set.
   * minimum: -31
   * maximum: -1
   */
  public void setDialnorm(Integer dialnorm) {
    this.dialnorm = dialnorm;
  }


  /**
   * This may only be set if the mode is &#x60;PASSTHROUGH&#x60;, or if the mode is &#x60;CORRECTION&#x60; and regulationType is &#x60;MANUAL&#x60;. For all other combinations dialogueIntelligence must not be set.
   * @return dialogueIntelligence
   */
  public DolbyDigitalDialogueIntelligence getDialogueIntelligence() {
    return dialogueIntelligence;
  }

  /**
   * This may only be set if the mode is &#x60;PASSTHROUGH&#x60;, or if the mode is &#x60;CORRECTION&#x60; and regulationType is &#x60;MANUAL&#x60;. For all other combinations dialogueIntelligence must not be set.
   *
   * @param dialogueIntelligence
   *        This may only be set if the mode is &#x60;PASSTHROUGH&#x60;, or if the mode is &#x60;CORRECTION&#x60; and regulationType is &#x60;MANUAL&#x60;. For all other combinations dialogueIntelligence must not be set.
   */
  public void setDialogueIntelligence(DolbyDigitalDialogueIntelligence dialogueIntelligence) {
    this.dialogueIntelligence = dialogueIntelligence;
  }


  /**
   * Get mode
   * @return mode
   */
  public DolbyDigitalLoudnessControlMode getMode() {
    return mode;
  }

  /**
   * Set mode
   *
   * @param mode
   */
  public void setMode(DolbyDigitalLoudnessControlMode mode) {
    this.mode = mode;
  }


  /**
   * The peak value in dB to use for loudness correction. This may only be set if the mode is &#x60;PASSTHROUGH&#x60;, or if the mode is &#x60;CORRECTION&#x60; and regulationType is &#x60;MANUAL&#x60;. For all other combinations peakLimit must not be set.
   * minimum: -8
   * maximum: -0.1
   * @return peakLimit
   */
  public Double getPeakLimit() {
    return peakLimit;
  }

  /**
   * The peak value in dB to use for loudness correction. This may only be set if the mode is &#x60;PASSTHROUGH&#x60;, or if the mode is &#x60;CORRECTION&#x60; and regulationType is &#x60;MANUAL&#x60;. For all other combinations peakLimit must not be set.
   * minimum: -8
   * maximum: -0.1
   *
   * @param peakLimit
   *        The peak value in dB to use for loudness correction. This may only be set if the mode is &#x60;PASSTHROUGH&#x60;, or if the mode is &#x60;CORRECTION&#x60; and regulationType is &#x60;MANUAL&#x60;. For all other combinations peakLimit must not be set.
   * minimum: -8
   * maximum: -0.1
   */
  public void setPeakLimit(Double peakLimit) {
    this.peakLimit = peakLimit;
  }


  /**
   * This is only allowed if the mode is CORRECTION. &lt;table&gt; &lt;tr&gt;&lt;th colspan&#x3D;4 align&#x3D;\&quot;left\&quot;&gt; Predefined values for each regulation type: &lt;/th&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Regulation Type &lt;/td&gt;&lt;td&gt; EBU R128 &lt;/td&gt;&lt;td&gt; ATSC A/85 Fixed &lt;/td&gt;&lt;td&gt; ATSC A/85 Agile&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Limit Mode &lt;/td&gt;&lt;td&gt; &#x60;True Peak&#x60; &lt;/td&gt;&lt;td&gt; &#x60;True Peak&#x60; &lt;/td&gt;&lt;td&gt; &#x60;True Peak&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Correction Mode &lt;/td&gt;&lt;td&gt; &#x60;PCM Normalization&#x60; &lt;/td&gt;&lt;td&gt; &#x60;PCM Normalization&#x60; &lt;/td&gt;&lt;td&gt; &#x60;Metadata Update&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Peak Limit &lt;/td&gt;&lt;td&gt; &#x60;–3 dBTP&#x60; &lt;/td&gt;&lt;td&gt; &#x60;–2 dBTP&#x60; &lt;/td&gt;&lt;td&gt; &#x60;N/A&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Dialogue Intelligence &lt;/td&gt;&lt;td&gt; &#x60;Off&#x60; &lt;/td&gt;&lt;td&gt; &#x60;On&#x60; &lt;/td&gt;&lt;td&gt; &#x60;On&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Meter Mode &lt;/td&gt;&lt;td&gt; &#x60;ITU-R BS.1770-3&#x60; &lt;/td&gt;&lt;td&gt; &#x60;ITU-R BS.1770-3&#x60; &lt;/td&gt;&lt;td&gt; &#x60;ITU-R BS.1770-3&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Speech Threshold &lt;/td&gt;&lt;td&gt; &#x60;20&#x60; &lt;/td&gt;&lt;td&gt; &#x60;20&#x60; &lt;/td&gt;&lt;td&gt; &#x60;20&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Dialogue Normalization &lt;/td&gt;&lt;td&gt; &#x60;-23 dB&#x60; &lt;/td&gt;&lt;td&gt; &#x60;-24 dB&#x60; &lt;/td&gt;&lt;td&gt; &#x60;Set to measured loudness&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return regulationType
   */
  public DolbyDigitalLoudnessControlRegulationType getRegulationType() {
    return regulationType;
  }

  /**
   * This is only allowed if the mode is CORRECTION. &lt;table&gt; &lt;tr&gt;&lt;th colspan&#x3D;4 align&#x3D;\&quot;left\&quot;&gt; Predefined values for each regulation type: &lt;/th&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Regulation Type &lt;/td&gt;&lt;td&gt; EBU R128 &lt;/td&gt;&lt;td&gt; ATSC A/85 Fixed &lt;/td&gt;&lt;td&gt; ATSC A/85 Agile&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Limit Mode &lt;/td&gt;&lt;td&gt; &#x60;True Peak&#x60; &lt;/td&gt;&lt;td&gt; &#x60;True Peak&#x60; &lt;/td&gt;&lt;td&gt; &#x60;True Peak&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Correction Mode &lt;/td&gt;&lt;td&gt; &#x60;PCM Normalization&#x60; &lt;/td&gt;&lt;td&gt; &#x60;PCM Normalization&#x60; &lt;/td&gt;&lt;td&gt; &#x60;Metadata Update&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Peak Limit &lt;/td&gt;&lt;td&gt; &#x60;–3 dBTP&#x60; &lt;/td&gt;&lt;td&gt; &#x60;–2 dBTP&#x60; &lt;/td&gt;&lt;td&gt; &#x60;N/A&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Dialogue Intelligence &lt;/td&gt;&lt;td&gt; &#x60;Off&#x60; &lt;/td&gt;&lt;td&gt; &#x60;On&#x60; &lt;/td&gt;&lt;td&gt; &#x60;On&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Meter Mode &lt;/td&gt;&lt;td&gt; &#x60;ITU-R BS.1770-3&#x60; &lt;/td&gt;&lt;td&gt; &#x60;ITU-R BS.1770-3&#x60; &lt;/td&gt;&lt;td&gt; &#x60;ITU-R BS.1770-3&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Speech Threshold &lt;/td&gt;&lt;td&gt; &#x60;20&#x60; &lt;/td&gt;&lt;td&gt; &#x60;20&#x60; &lt;/td&gt;&lt;td&gt; &#x60;20&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Dialogue Normalization &lt;/td&gt;&lt;td&gt; &#x60;-23 dB&#x60; &lt;/td&gt;&lt;td&gt; &#x60;-24 dB&#x60; &lt;/td&gt;&lt;td&gt; &#x60;Set to measured loudness&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   *
   * @param regulationType
   *        This is only allowed if the mode is CORRECTION. &lt;table&gt; &lt;tr&gt;&lt;th colspan&#x3D;4 align&#x3D;\&quot;left\&quot;&gt; Predefined values for each regulation type: &lt;/th&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Regulation Type &lt;/td&gt;&lt;td&gt; EBU R128 &lt;/td&gt;&lt;td&gt; ATSC A/85 Fixed &lt;/td&gt;&lt;td&gt; ATSC A/85 Agile&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Limit Mode &lt;/td&gt;&lt;td&gt; &#x60;True Peak&#x60; &lt;/td&gt;&lt;td&gt; &#x60;True Peak&#x60; &lt;/td&gt;&lt;td&gt; &#x60;True Peak&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Correction Mode &lt;/td&gt;&lt;td&gt; &#x60;PCM Normalization&#x60; &lt;/td&gt;&lt;td&gt; &#x60;PCM Normalization&#x60; &lt;/td&gt;&lt;td&gt; &#x60;Metadata Update&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Peak Limit &lt;/td&gt;&lt;td&gt; &#x60;–3 dBTP&#x60; &lt;/td&gt;&lt;td&gt; &#x60;–2 dBTP&#x60; &lt;/td&gt;&lt;td&gt; &#x60;N/A&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Dialogue Intelligence &lt;/td&gt;&lt;td&gt; &#x60;Off&#x60; &lt;/td&gt;&lt;td&gt; &#x60;On&#x60; &lt;/td&gt;&lt;td&gt; &#x60;On&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Meter Mode &lt;/td&gt;&lt;td&gt; &#x60;ITU-R BS.1770-3&#x60; &lt;/td&gt;&lt;td&gt; &#x60;ITU-R BS.1770-3&#x60; &lt;/td&gt;&lt;td&gt; &#x60;ITU-R BS.1770-3&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Speech Threshold &lt;/td&gt;&lt;td&gt; &#x60;20&#x60; &lt;/td&gt;&lt;td&gt; &#x60;20&#x60; &lt;/td&gt;&lt;td&gt; &#x60;20&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt; Dialogue Normalization &lt;/td&gt;&lt;td&gt; &#x60;-23 dB&#x60; &lt;/td&gt;&lt;td&gt; &#x60;-24 dB&#x60; &lt;/td&gt;&lt;td&gt; &#x60;Set to measured loudness&#x60; &lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   */
  public void setRegulationType(DolbyDigitalLoudnessControlRegulationType regulationType) {
    this.regulationType = regulationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DolbyDigitalLoudnessControl dolbyDigitalLoudnessControl = (DolbyDigitalLoudnessControl) o;
    return Objects.equals(this.dialnorm, dolbyDigitalLoudnessControl.dialnorm) &&
        Objects.equals(this.dialogueIntelligence, dolbyDigitalLoudnessControl.dialogueIntelligence) &&
        Objects.equals(this.mode, dolbyDigitalLoudnessControl.mode) &&
        Objects.equals(this.peakLimit, dolbyDigitalLoudnessControl.peakLimit) &&
        Objects.equals(this.regulationType, dolbyDigitalLoudnessControl.regulationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dialnorm, dialogueIntelligence, mode, peakLimit, regulationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyDigitalLoudnessControl {\n");
    
    sb.append("    dialnorm: ").append(toIndentedString(dialnorm)).append("\n");
    sb.append("    dialogueIntelligence: ").append(toIndentedString(dialogueIntelligence)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    peakLimit: ").append(toIndentedString(peakLimit)).append("\n");
    sb.append("    regulationType: ").append(toIndentedString(regulationType)).append("\n");
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

