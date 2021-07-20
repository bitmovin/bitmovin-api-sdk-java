package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DolbyAtmosDialogueIntelligence;
import com.bitmovin.api.sdk.model.DolbyAtmosMeteringMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DolbyAtmosLoudnessControl
 */

public class DolbyAtmosLoudnessControl {
  @JsonProperty("meteringMode")
  private DolbyAtmosMeteringMode meteringMode;

  @JsonProperty("dialogueIntelligence")
  private DolbyAtmosDialogueIntelligence dialogueIntelligence;

  @JsonProperty("speechThreshold")
  private Integer speechThreshold;


  /**
   * Algorithm to be used for measuring loudness. Recommended value is \&quot;ITU_R_BS_1770_4\&quot; (required)
   * @return meteringMode
   */
  public DolbyAtmosMeteringMode getMeteringMode() {
    return meteringMode;
  }

  /**
   * Algorithm to be used for measuring loudness. Recommended value is \&quot;ITU_R_BS_1770_4\&quot; (required)
   *
   * @param meteringMode
   *        Algorithm to be used for measuring loudness. Recommended value is \&quot;ITU_R_BS_1770_4\&quot; (required)
   */
  public void setMeteringMode(DolbyAtmosMeteringMode meteringMode) {
    this.meteringMode = meteringMode;
  }


  /**
   * Whether to use the Dialogue Intelligence feature, which identifies and analyzes dialogue segments within audio as a basis for speech gating. Must not be \&quot;DISABLED\&quot; for meteringMode \&quot;ITU-R BS.1770-1\&quot; or \&quot;Leq (A)\&quot;, otherwise recommended value is \&quot;ENABLED\&quot; (required)
   * @return dialogueIntelligence
   */
  public DolbyAtmosDialogueIntelligence getDialogueIntelligence() {
    return dialogueIntelligence;
  }

  /**
   * Whether to use the Dialogue Intelligence feature, which identifies and analyzes dialogue segments within audio as a basis for speech gating. Must not be \&quot;DISABLED\&quot; for meteringMode \&quot;ITU-R BS.1770-1\&quot; or \&quot;Leq (A)\&quot;, otherwise recommended value is \&quot;ENABLED\&quot; (required)
   *
   * @param dialogueIntelligence
   *        Whether to use the Dialogue Intelligence feature, which identifies and analyzes dialogue segments within audio as a basis for speech gating. Must not be \&quot;DISABLED\&quot; for meteringMode \&quot;ITU-R BS.1770-1\&quot; or \&quot;Leq (A)\&quot;, otherwise recommended value is \&quot;ENABLED\&quot; (required)
   */
  public void setDialogueIntelligence(DolbyAtmosDialogueIntelligence dialogueIntelligence) {
    this.dialogueIntelligence = dialogueIntelligence;
  }


  /**
   * Specifies the percentage of speech that must be detected in the metered content before using the measured speech loudness as the overall program loudness. Given as an integer percentage between 0 and 100 (0% to 100%). Recommended value is 15 (required)
   * minimum: 0
   * maximum: 100
   * @return speechThreshold
   */
  public Integer getSpeechThreshold() {
    return speechThreshold;
  }

  /**
   * Specifies the percentage of speech that must be detected in the metered content before using the measured speech loudness as the overall program loudness. Given as an integer percentage between 0 and 100 (0% to 100%). Recommended value is 15 (required)
   * minimum: 0
   * maximum: 100
   *
   * @param speechThreshold
   *        Specifies the percentage of speech that must be detected in the metered content before using the measured speech loudness as the overall program loudness. Given as an integer percentage between 0 and 100 (0% to 100%). Recommended value is 15 (required)
   *        minimum: 0
   *        maximum: 100
   */
  public void setSpeechThreshold(Integer speechThreshold) {
    this.speechThreshold = speechThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DolbyAtmosLoudnessControl dolbyAtmosLoudnessControl = (DolbyAtmosLoudnessControl) o;
    return Objects.equals(this.meteringMode, dolbyAtmosLoudnessControl.meteringMode) &&
        Objects.equals(this.dialogueIntelligence, dolbyAtmosLoudnessControl.dialogueIntelligence) &&
        Objects.equals(this.speechThreshold, dolbyAtmosLoudnessControl.speechThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meteringMode, dialogueIntelligence, speechThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyAtmosLoudnessControl {\n");
    
    sb.append("    meteringMode: ").append(toIndentedString(meteringMode)).append("\n");
    sb.append("    dialogueIntelligence: ").append(toIndentedString(dialogueIntelligence)).append("\n");
    sb.append("    speechThreshold: ").append(toIndentedString(speechThreshold)).append("\n");
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

