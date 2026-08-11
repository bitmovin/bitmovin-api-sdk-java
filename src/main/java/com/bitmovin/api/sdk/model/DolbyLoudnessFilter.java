package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DolbyLoudnessContentForm;
import com.bitmovin.api.sdk.model.DolbyLoudnessDialogueIntelligence;
import com.bitmovin.api.sdk.model.Filter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DolbyLoudnessFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = DolbyLoudnessFilter.class)
public class DolbyLoudnessFilter extends Filter {
  @JsonProperty("targetLoudness")
  private Integer targetLoudness;

  @JsonProperty("maximumTruePeakLevel")
  private Double maximumTruePeakLevel;

  @JsonProperty("dialogueIntelligence")
  private DolbyLoudnessDialogueIntelligence dialogueIntelligence;

  @JsonProperty("speechDetectionThreshold")
  private Integer speechDetectionThreshold;

  @JsonProperty("contentForm")
  private DolbyLoudnessContentForm contentForm;


  /**
   * The target integrated loudness the audio should be corrected to. Range is from &#39;-31&#39; to &#39;-8&#39;. Default value is &#39;-24&#39;. Value is measured in LKFS (Loudness, K-weighted, relative to Full Scale).
   * minimum: -31
   * maximum: -8
   * @return targetLoudness
   */
  public Integer getTargetLoudness() {
    return targetLoudness;
  }

  /**
   * The target integrated loudness the audio should be corrected to. Range is from &#39;-31&#39; to &#39;-8&#39;. Default value is &#39;-24&#39;. Value is measured in LKFS (Loudness, K-weighted, relative to Full Scale).
   * minimum: -31
   * maximum: -8
   *
   * @param targetLoudness
   *        The target integrated loudness the audio should be corrected to. Range is from &#39;-31&#39; to &#39;-8&#39;. Default value is &#39;-24&#39;. Value is measured in LKFS (Loudness, K-weighted, relative to Full Scale).
   *        minimum: -31
   *        maximum: -8
   */
  public void setTargetLoudness(Integer targetLoudness) {
    this.targetLoudness = targetLoudness;
  }


  /**
   * The maximum true-peak level the corrected audio may reach. Range is from &#39;-8.0&#39; to &#39;-0.1&#39;. Default value is &#39;-2.0&#39;. Values are measured in dBTP (dB True Peak). Note that the maximum true peak level must be set at least 6 dB above the target loudness.
   * minimum: -8
   * maximum: -0.1
   * @return maximumTruePeakLevel
   */
  public Double getMaximumTruePeakLevel() {
    return maximumTruePeakLevel;
  }

  /**
   * The maximum true-peak level the corrected audio may reach. Range is from &#39;-8.0&#39; to &#39;-0.1&#39;. Default value is &#39;-2.0&#39;. Values are measured in dBTP (dB True Peak). Note that the maximum true peak level must be set at least 6 dB above the target loudness.
   * minimum: -8
   * maximum: -0.1
   *
   * @param maximumTruePeakLevel
   *        The maximum true-peak level the corrected audio may reach. Range is from &#39;-8.0&#39; to &#39;-0.1&#39;. Default value is &#39;-2.0&#39;. Values are measured in dBTP (dB True Peak). Note that the maximum true peak level must be set at least 6 dB above the target loudness.
   *        minimum: -8
   *        maximum: -0.1
   */
  public void setMaximumTruePeakLevel(Double maximumTruePeakLevel) {
    this.maximumTruePeakLevel = maximumTruePeakLevel;
  }


  /**
   * Whether to use the Dolby Dialogue Intelligence feature, which identifies and analyzes dialogue segments within the audio as a basis for speech gating. Default value is &#39;ENABLED&#39;.
   * @return dialogueIntelligence
   */
  public DolbyLoudnessDialogueIntelligence getDialogueIntelligence() {
    return dialogueIntelligence;
  }

  /**
   * Whether to use the Dolby Dialogue Intelligence feature, which identifies and analyzes dialogue segments within the audio as a basis for speech gating. Default value is &#39;ENABLED&#39;.
   *
   * @param dialogueIntelligence
   *        Whether to use the Dolby Dialogue Intelligence feature, which identifies and analyzes dialogue segments within the audio as a basis for speech gating. Default value is &#39;ENABLED&#39;.
   */
  public void setDialogueIntelligence(DolbyLoudnessDialogueIntelligence dialogueIntelligence) {
    this.dialogueIntelligence = dialogueIntelligence;
  }


  /**
   * The percentage of speech that must be detected within the audio before the dialogue loudness is used as the basis for loudness correction. Range is from &#39;0&#39; to &#39;100&#39;. Default value is &#39;20&#39;. This is only applied when dialogueIntelligence is &#39;ENABLED&#39;, as it selects between speech-gated and un-gated loudness measurement.
   * minimum: 0
   * maximum: 100
   * @return speechDetectionThreshold
   */
  public Integer getSpeechDetectionThreshold() {
    return speechDetectionThreshold;
  }

  /**
   * The percentage of speech that must be detected within the audio before the dialogue loudness is used as the basis for loudness correction. Range is from &#39;0&#39; to &#39;100&#39;. Default value is &#39;20&#39;. This is only applied when dialogueIntelligence is &#39;ENABLED&#39;, as it selects between speech-gated and un-gated loudness measurement.
   * minimum: 0
   * maximum: 100
   *
   * @param speechDetectionThreshold
   *        The percentage of speech that must be detected within the audio before the dialogue loudness is used as the basis for loudness correction. Range is from &#39;0&#39; to &#39;100&#39;. Default value is &#39;20&#39;. This is only applied when dialogueIntelligence is &#39;ENABLED&#39;, as it selects between speech-gated and un-gated loudness measurement.
   *        minimum: 0
   *        maximum: 100
   */
  public void setSpeechDetectionThreshold(Integer speechDetectionThreshold) {
    this.speechDetectionThreshold = speechDetectionThreshold;
  }


  /**
   * The form of the content, used to optimize the loudness measurement gating. Content longer than 3 minutes (180 seconds) is considered long-form, shorter content is considered short-form. Default value is &#39;AUTO_DETECT&#39;.
   * @return contentForm
   */
  public DolbyLoudnessContentForm getContentForm() {
    return contentForm;
  }

  /**
   * The form of the content, used to optimize the loudness measurement gating. Content longer than 3 minutes (180 seconds) is considered long-form, shorter content is considered short-form. Default value is &#39;AUTO_DETECT&#39;.
   *
   * @param contentForm
   *        The form of the content, used to optimize the loudness measurement gating. Content longer than 3 minutes (180 seconds) is considered long-form, shorter content is considered short-form. Default value is &#39;AUTO_DETECT&#39;.
   */
  public void setContentForm(DolbyLoudnessContentForm contentForm) {
    this.contentForm = contentForm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DolbyLoudnessFilter dolbyLoudnessFilter = (DolbyLoudnessFilter) o;
    return Objects.equals(this.targetLoudness, dolbyLoudnessFilter.targetLoudness) &&
        Objects.equals(this.maximumTruePeakLevel, dolbyLoudnessFilter.maximumTruePeakLevel) &&
        Objects.equals(this.dialogueIntelligence, dolbyLoudnessFilter.dialogueIntelligence) &&
        Objects.equals(this.speechDetectionThreshold, dolbyLoudnessFilter.speechDetectionThreshold) &&
        Objects.equals(this.contentForm, dolbyLoudnessFilter.contentForm) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetLoudness, maximumTruePeakLevel, dialogueIntelligence, speechDetectionThreshold, contentForm, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyLoudnessFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    targetLoudness: ").append(toIndentedString(targetLoudness)).append("\n");
    sb.append("    maximumTruePeakLevel: ").append(toIndentedString(maximumTruePeakLevel)).append("\n");
    sb.append("    dialogueIntelligence: ").append(toIndentedString(dialogueIntelligence)).append("\n");
    sb.append("    speechDetectionThreshold: ").append(toIndentedString(speechDetectionThreshold)).append("\n");
    sb.append("    contentForm: ").append(toIndentedString(contentForm)).append("\n");
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

