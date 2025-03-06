package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AiContentAnalysis;
import com.bitmovin.api.sdk.model.EncodingMode;
import com.bitmovin.api.sdk.model.ManifestGenerator;
import com.bitmovin.api.sdk.model.ManifestResource;
import com.bitmovin.api.sdk.model.PerTitle;
import com.bitmovin.api.sdk.model.Scheduling;
import com.bitmovin.api.sdk.model.Trimming;
import com.bitmovin.api.sdk.model.Tweaks;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StartEncodingRequest
 */

public class StartEncodingRequest {
  @JsonProperty("trimming")
  private Trimming trimming;

  @JsonProperty("scheduling")
  private Scheduling scheduling;

  @JsonProperty("tweaks")
  private Tweaks tweaks;

  @JsonProperty("handleVariableInputFps")
  private Boolean handleVariableInputFps;

  @JsonProperty("encodingMode")
  private EncodingMode encodingMode;

  @JsonProperty("previewDashManifests")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<ManifestResource> previewDashManifests = new ArrayList<ManifestResource>();

  @JsonProperty("previewHlsManifests")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<ManifestResource> previewHlsManifests = new ArrayList<ManifestResource>();

  @JsonProperty("vodDashManifests")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<ManifestResource> vodDashManifests = new ArrayList<ManifestResource>();

  @JsonProperty("vodHlsManifests")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<ManifestResource> vodHlsManifests = new ArrayList<ManifestResource>();

  @JsonProperty("vodSmoothManifests")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<ManifestResource> vodSmoothManifests = new ArrayList<ManifestResource>();

  @JsonProperty("manifestGenerator")
  private ManifestGenerator manifestGenerator;

  @JsonProperty("perTitle")
  private PerTitle perTitle;

  @JsonProperty("aiContentAnalysis")
  private AiContentAnalysis aiContentAnalysis;


  /**
   * Allows to encode only part of the input. Defines start (offset) and duration of the desired section. This is not allowed when the Encoding uses any kind of Input Stream resource.
   * @return trimming
   */
  public Trimming getTrimming() {
    return trimming;
  }

  /**
   * Allows to encode only part of the input. Defines start (offset) and duration of the desired section. This is not allowed when the Encoding uses any kind of Input Stream resource.
   *
   * @param trimming
   *        Allows to encode only part of the input. Defines start (offset) and duration of the desired section. This is not allowed when the Encoding uses any kind of Input Stream resource.
   */
  public void setTrimming(Trimming trimming) {
    this.trimming = trimming;
  }


  /**
   * Scheduling parameters of the encoding.
   * @return scheduling
   */
  public Scheduling getScheduling() {
    return scheduling;
  }

  /**
   * Scheduling parameters of the encoding.
   *
   * @param scheduling
   *        Scheduling parameters of the encoding.
   */
  public void setScheduling(Scheduling scheduling) {
    this.scheduling = scheduling;
  }


  /**
   * Special tweaks for your encoding job.
   * @return tweaks
   */
  public Tweaks getTweaks() {
    return tweaks;
  }

  /**
   * Special tweaks for your encoding job.
   *
   * @param tweaks
   *        Special tweaks for your encoding job.
   */
  public void setTweaks(Tweaks tweaks) {
    this.tweaks = tweaks;
  }


  /**
   * Enable frame dropping/duplication to handle variable frames per seconds of video input streams
   * @return handleVariableInputFps
   */
  public Boolean getHandleVariableInputFps() {
    return handleVariableInputFps;
  }

  /**
   * Enable frame dropping/duplication to handle variable frames per seconds of video input streams
   *
   * @param handleVariableInputFps
   *        Enable frame dropping/duplication to handle variable frames per seconds of video input streams
   */
  public void setHandleVariableInputFps(Boolean handleVariableInputFps) {
    this.handleVariableInputFps = handleVariableInputFps;
  }


  /**
   * The pass mode of the encoding. Must only be set when &#x60;encodingMode&#x60; is not set on any codec configuration used by this encoding.
   * @return encodingMode
   */
  public EncodingMode getEncodingMode() {
    return encodingMode;
  }

  /**
   * The pass mode of the encoding. Must only be set when &#x60;encodingMode&#x60; is not set on any codec configuration used by this encoding.
   *
   * @param encodingMode
   *        The pass mode of the encoding. Must only be set when &#x60;encodingMode&#x60; is not set on any codec configuration used by this encoding.
   */
  public void setEncodingMode(EncodingMode encodingMode) {
    this.encodingMode = encodingMode;
  }


  public StartEncodingRequest addPreviewDashManifestsItem(ManifestResource previewDashManifestsItem) {
    this.previewDashManifests.add(previewDashManifestsItem);
    return this;
  }

  /**
   * DASH manifests to be generated for previewing while the encoding is still running. See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   * @return previewDashManifests
   */
  public List<ManifestResource> getPreviewDashManifests() {
    return previewDashManifests;
  }

  /**
   * DASH manifests to be generated for previewing while the encoding is still running. See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   *
   * @param previewDashManifests
   *        DASH manifests to be generated for previewing while the encoding is still running. See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   */
  public void setPreviewDashManifests(List<ManifestResource> previewDashManifests) {
    this.previewDashManifests = previewDashManifests;
  }


  public StartEncodingRequest addPreviewHlsManifestsItem(ManifestResource previewHlsManifestsItem) {
    this.previewHlsManifests.add(previewHlsManifestsItem);
    return this;
  }

  /**
   * HLS manifests to be generated for previewing while the encoding is still running. See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   * @return previewHlsManifests
   */
  public List<ManifestResource> getPreviewHlsManifests() {
    return previewHlsManifests;
  }

  /**
   * HLS manifests to be generated for previewing while the encoding is still running. See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   *
   * @param previewHlsManifests
   *        HLS manifests to be generated for previewing while the encoding is still running. See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   */
  public void setPreviewHlsManifests(List<ManifestResource> previewHlsManifests) {
    this.previewHlsManifests = previewHlsManifests;
  }


  public StartEncodingRequest addVodDashManifestsItem(ManifestResource vodDashManifestsItem) {
    this.vodDashManifests.add(vodDashManifestsItem);
    return this;
  }

  /**
   * DASH manifests to be generated right after encoding (just-in-time). See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   * @return vodDashManifests
   */
  public List<ManifestResource> getVodDashManifests() {
    return vodDashManifests;
  }

  /**
   * DASH manifests to be generated right after encoding (just-in-time). See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   *
   * @param vodDashManifests
   *        DASH manifests to be generated right after encoding (just-in-time). See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   */
  public void setVodDashManifests(List<ManifestResource> vodDashManifests) {
    this.vodDashManifests = vodDashManifests;
  }


  public StartEncodingRequest addVodHlsManifestsItem(ManifestResource vodHlsManifestsItem) {
    this.vodHlsManifests.add(vodHlsManifestsItem);
    return this;
  }

  /**
   * HLS manifests to be generated right after encoding (just-in-time). See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   * @return vodHlsManifests
   */
  public List<ManifestResource> getVodHlsManifests() {
    return vodHlsManifests;
  }

  /**
   * HLS manifests to be generated right after encoding (just-in-time). See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   *
   * @param vodHlsManifests
   *        HLS manifests to be generated right after encoding (just-in-time). See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   */
  public void setVodHlsManifests(List<ManifestResource> vodHlsManifests) {
    this.vodHlsManifests = vodHlsManifests;
  }


  public StartEncodingRequest addVodSmoothManifestsItem(ManifestResource vodSmoothManifestsItem) {
    this.vodSmoothManifests.add(vodSmoothManifestsItem);
    return this;
  }

  /**
   * Smooth Streaming manifests to be generated right after encoding (just-in-time). See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   * @return vodSmoothManifests
   */
  public List<ManifestResource> getVodSmoothManifests() {
    return vodSmoothManifests;
  }

  /**
   * Smooth Streaming manifests to be generated right after encoding (just-in-time). See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   *
   * @param vodSmoothManifests
   *        Smooth Streaming manifests to be generated right after encoding (just-in-time). See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   */
  public void setVodSmoothManifests(List<ManifestResource> vodSmoothManifests) {
    this.vodSmoothManifests = vodSmoothManifests;
  }


  /**
   * Major version of the manifest generator to be used for manifests referenced in this request (by properties vodDashManifests, vodHlsManifests, vodSmoothManifests, previewDashManifests, previewHlsManifests). &#x60;V2&#x60; is available for encoder versions 2.70.0 and above and is the recommended option. The default value depends on the sign-up date of your organization. See [documentation](https://developer.bitmovin.com/encoding/docs/manifest-generator-v2) page for a detailed explanation. 
   * @return manifestGenerator
   */
  public ManifestGenerator getManifestGenerator() {
    return manifestGenerator;
  }

  /**
   * Major version of the manifest generator to be used for manifests referenced in this request (by properties vodDashManifests, vodHlsManifests, vodSmoothManifests, previewDashManifests, previewHlsManifests). &#x60;V2&#x60; is available for encoder versions 2.70.0 and above and is the recommended option. The default value depends on the sign-up date of your organization. See [documentation](https://developer.bitmovin.com/encoding/docs/manifest-generator-v2) page for a detailed explanation. 
   *
   * @param manifestGenerator
   *        Major version of the manifest generator to be used for manifests referenced in this request (by properties vodDashManifests, vodHlsManifests, vodSmoothManifests, previewDashManifests, previewHlsManifests). &#x60;V2&#x60; is available for encoder versions 2.70.0 and above and is the recommended option. The default value depends on the sign-up date of your organization. See [documentation](https://developer.bitmovin.com/encoding/docs/manifest-generator-v2) page for a detailed explanation. 
   */
  public void setManifestGenerator(ManifestGenerator manifestGenerator) {
    this.manifestGenerator = manifestGenerator;
  }


  /**
   * Per-Title settings
   * @return perTitle
   */
  public PerTitle getPerTitle() {
    return perTitle;
  }

  /**
   * Per-Title settings
   *
   * @param perTitle
   *        Per-Title settings
   */
  public void setPerTitle(PerTitle perTitle) {
    this.perTitle = perTitle;
  }


  /**
   * AI content analysis settings
   * @return aiContentAnalysis
   */
  public AiContentAnalysis getAiContentAnalysis() {
    return aiContentAnalysis;
  }

  /**
   * AI content analysis settings
   *
   * @param aiContentAnalysis
   *        AI content analysis settings
   */
  public void setAiContentAnalysis(AiContentAnalysis aiContentAnalysis) {
    this.aiContentAnalysis = aiContentAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartEncodingRequest startEncodingRequest = (StartEncodingRequest) o;
    return Objects.equals(this.trimming, startEncodingRequest.trimming) &&
        Objects.equals(this.scheduling, startEncodingRequest.scheduling) &&
        Objects.equals(this.tweaks, startEncodingRequest.tweaks) &&
        Objects.equals(this.handleVariableInputFps, startEncodingRequest.handleVariableInputFps) &&
        Objects.equals(this.encodingMode, startEncodingRequest.encodingMode) &&
        Objects.equals(this.previewDashManifests, startEncodingRequest.previewDashManifests) &&
        Objects.equals(this.previewHlsManifests, startEncodingRequest.previewHlsManifests) &&
        Objects.equals(this.vodDashManifests, startEncodingRequest.vodDashManifests) &&
        Objects.equals(this.vodHlsManifests, startEncodingRequest.vodHlsManifests) &&
        Objects.equals(this.vodSmoothManifests, startEncodingRequest.vodSmoothManifests) &&
        Objects.equals(this.manifestGenerator, startEncodingRequest.manifestGenerator) &&
        Objects.equals(this.perTitle, startEncodingRequest.perTitle) &&
        Objects.equals(this.aiContentAnalysis, startEncodingRequest.aiContentAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trimming, scheduling, tweaks, handleVariableInputFps, encodingMode, previewDashManifests, previewHlsManifests, vodDashManifests, vodHlsManifests, vodSmoothManifests, manifestGenerator, perTitle, aiContentAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartEncodingRequest {\n");
    
    sb.append("    trimming: ").append(toIndentedString(trimming)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    tweaks: ").append(toIndentedString(tweaks)).append("\n");
    sb.append("    handleVariableInputFps: ").append(toIndentedString(handleVariableInputFps)).append("\n");
    sb.append("    encodingMode: ").append(toIndentedString(encodingMode)).append("\n");
    sb.append("    previewDashManifests: ").append(toIndentedString(previewDashManifests)).append("\n");
    sb.append("    previewHlsManifests: ").append(toIndentedString(previewHlsManifests)).append("\n");
    sb.append("    vodDashManifests: ").append(toIndentedString(vodDashManifests)).append("\n");
    sb.append("    vodHlsManifests: ").append(toIndentedString(vodHlsManifests)).append("\n");
    sb.append("    vodSmoothManifests: ").append(toIndentedString(vodSmoothManifests)).append("\n");
    sb.append("    manifestGenerator: ").append(toIndentedString(manifestGenerator)).append("\n");
    sb.append("    perTitle: ").append(toIndentedString(perTitle)).append("\n");
    sb.append("    aiContentAnalysis: ").append(toIndentedString(aiContentAnalysis)).append("\n");
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

