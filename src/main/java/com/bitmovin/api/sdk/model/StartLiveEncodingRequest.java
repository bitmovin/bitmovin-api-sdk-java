package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AutoRestartConfiguration;
import com.bitmovin.api.sdk.model.CacheControlSettings;
import com.bitmovin.api.sdk.model.EncodingMode;
import com.bitmovin.api.sdk.model.EsamSettings;
import com.bitmovin.api.sdk.model.LiveAutoShutdownConfiguration;
import com.bitmovin.api.sdk.model.LiveDashManifest;
import com.bitmovin.api.sdk.model.LiveHlsManifest;
import com.bitmovin.api.sdk.model.ManifestGenerator;
import com.bitmovin.api.sdk.model.ReuploadSettings;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StartLiveEncodingRequest
 */

public class StartLiveEncodingRequest {
  @JsonProperty("streamKey")
  private String streamKey;

  @JsonProperty("hlsManifests")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<LiveHlsManifest> hlsManifests = new ArrayList<LiveHlsManifest>();

  @JsonProperty("dashManifests")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<LiveDashManifest> dashManifests = new ArrayList<LiveDashManifest>();

  @JsonProperty("liveEncodingMode")
  private EncodingMode liveEncodingMode;

  @JsonProperty("reuploadSettings")
  private ReuploadSettings reuploadSettings;

  @JsonProperty("manifestGenerator")
  private ManifestGenerator manifestGenerator;

  @JsonProperty("autoRestartConfiguration")
  private AutoRestartConfiguration autoRestartConfiguration;

  @JsonProperty("autoShutdownConfiguration")
  private LiveAutoShutdownConfiguration autoShutdownConfiguration;

  @JsonProperty("esamSettings")
  private EsamSettings esamSettings;

  @JsonProperty("cacheControlSettings")
  private CacheControlSettings cacheControlSettings;


  /**
   * Key for the stream. (a-zA-Z, 3-20 characters) (required)
   * @return streamKey
   */
  public String getStreamKey() {
    return streamKey;
  }

  /**
   * Key for the stream. (a-zA-Z, 3-20 characters) (required)
   *
   * @param streamKey
   *        Key for the stream. (a-zA-Z, 3-20 characters) (required)
   */
  public void setStreamKey(String streamKey) {
    this.streamKey = streamKey;
  }


  public StartLiveEncodingRequest addHlsManifestsItem(LiveHlsManifest hlsManifestsItem) {
    this.hlsManifests.add(hlsManifestsItem);
    return this;
  }

  /**
   * HLS manifests to be generated during the encoding. See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   * @return hlsManifests
   */
  public List<LiveHlsManifest> getHlsManifests() {
    return hlsManifests;
  }

  /**
   * HLS manifests to be generated during the encoding. See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   *
   * @param hlsManifests
   *        HLS manifests to be generated during the encoding. See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   */
  public void setHlsManifests(List<LiveHlsManifest> hlsManifests) {
    this.hlsManifests = hlsManifests;
  }


  public StartLiveEncodingRequest addDashManifestsItem(LiveDashManifest dashManifestsItem) {
    this.dashManifests.add(dashManifestsItem);
    return this;
  }

  /**
   * DASH manifests to be generated during the encoding. See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   * @return dashManifests
   */
  public List<LiveDashManifest> getDashManifests() {
    return dashManifests;
  }

  /**
   * DASH manifests to be generated during the encoding. See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   *
   * @param dashManifests
   *        DASH manifests to be generated during the encoding. See [documentation](https://developer.bitmovin.com/encoding/docs/how-to-create-manifests-for-your-encodings#just-in-time-jit)
   */
  public void setDashManifests(List<LiveDashManifest> dashManifests) {
    this.dashManifests = dashManifests;
  }


  /**
   * The pass mode of the encoding. Must only be set when &#x60;encodingMode&#x60; is not set on any codec configuration used by this encoding.
   * @return liveEncodingMode
   */
  public EncodingMode getLiveEncodingMode() {
    return liveEncodingMode;
  }

  /**
   * The pass mode of the encoding. Must only be set when &#x60;encodingMode&#x60; is not set on any codec configuration used by this encoding.
   *
   * @param liveEncodingMode
   *        The pass mode of the encoding. Must only be set when &#x60;encodingMode&#x60; is not set on any codec configuration used by this encoding.
   */
  public void setLiveEncodingMode(EncodingMode liveEncodingMode) {
    this.liveEncodingMode = liveEncodingMode;
  }


  /**
   * Reupload specific files during a live encoding. This can be helpful if an automatic life cycle policy is enabled on the output storage
   * @return reuploadSettings
   */
  public ReuploadSettings getReuploadSettings() {
    return reuploadSettings;
  }

  /**
   * Reupload specific files during a live encoding. This can be helpful if an automatic life cycle policy is enabled on the output storage
   *
   * @param reuploadSettings
   *        Reupload specific files during a live encoding. This can be helpful if an automatic life cycle policy is enabled on the output storage
   */
  public void setReuploadSettings(ReuploadSettings reuploadSettings) {
    this.reuploadSettings = reuploadSettings;
  }


  /**
   * Major version of the manifest generator to be used for manifests referenced in this request (by properties dashManifests, dashManifests). &#x60;V2&#x60; is available for encoder versions 2.70.0 and above and is the recommended option. The default value depends on the sign-up date of your organization. See [documentation](https://developer.bitmovin.com/encoding/docs/manifest-generator-v2) page for a detailed explanation. 
   * @return manifestGenerator
   */
  public ManifestGenerator getManifestGenerator() {
    return manifestGenerator;
  }

  /**
   * Major version of the manifest generator to be used for manifests referenced in this request (by properties dashManifests, dashManifests). &#x60;V2&#x60; is available for encoder versions 2.70.0 and above and is the recommended option. The default value depends on the sign-up date of your organization. See [documentation](https://developer.bitmovin.com/encoding/docs/manifest-generator-v2) page for a detailed explanation. 
   *
   * @param manifestGenerator
   *        Major version of the manifest generator to be used for manifests referenced in this request (by properties dashManifests, dashManifests). &#x60;V2&#x60; is available for encoder versions 2.70.0 and above and is the recommended option. The default value depends on the sign-up date of your organization. See [documentation](https://developer.bitmovin.com/encoding/docs/manifest-generator-v2) page for a detailed explanation. 
   */
  public void setManifestGenerator(ManifestGenerator manifestGenerator) {
    this.manifestGenerator = manifestGenerator;
  }


  /**
   * Configuration for auto restarting the live encoding
   * @return autoRestartConfiguration
   */
  public AutoRestartConfiguration getAutoRestartConfiguration() {
    return autoRestartConfiguration;
  }

  /**
   * Configuration for auto restarting the live encoding
   *
   * @param autoRestartConfiguration
   *        Configuration for auto restarting the live encoding
   */
  public void setAutoRestartConfiguration(AutoRestartConfiguration autoRestartConfiguration) {
    this.autoRestartConfiguration = autoRestartConfiguration;
  }


  /**
   * Configuration for auto shutdown of the live encoding
   * @return autoShutdownConfiguration
   */
  public LiveAutoShutdownConfiguration getAutoShutdownConfiguration() {
    return autoShutdownConfiguration;
  }

  /**
   * Configuration for auto shutdown of the live encoding
   *
   * @param autoShutdownConfiguration
   *        Configuration for auto shutdown of the live encoding
   */
  public void setAutoShutdownConfiguration(LiveAutoShutdownConfiguration autoShutdownConfiguration) {
    this.autoShutdownConfiguration = autoShutdownConfiguration;
  }


  /**
   * Configuration for Event Signaling and Management (ESAM) system,  allowing the encoder to communicate with an ESAM server for signal processing and dynamic ad insertion update.&#39; 
   * @return esamSettings
   */
  public EsamSettings getEsamSettings() {
    return esamSettings;
  }

  /**
   * Configuration for Event Signaling and Management (ESAM) system,  allowing the encoder to communicate with an ESAM server for signal processing and dynamic ad insertion update.&#39; 
   *
   * @param esamSettings
   *        Configuration for Event Signaling and Management (ESAM) system,  allowing the encoder to communicate with an ESAM server for signal processing and dynamic ad insertion update.&#39; 
   */
  public void setEsamSettings(EsamSettings esamSettings) {
    this.esamSettings = esamSettings;
  }


  /**
   * Configuration of cache control policies for media segments, HLS, and DASH manifests.  You can set caching for the HLS multivariant playlist, HLS media playlist, DASH timeline manifest,  DASH template manifest, initialization segment, and media segment. 
   * @return cacheControlSettings
   */
  public CacheControlSettings getCacheControlSettings() {
    return cacheControlSettings;
  }

  /**
   * Configuration of cache control policies for media segments, HLS, and DASH manifests.  You can set caching for the HLS multivariant playlist, HLS media playlist, DASH timeline manifest,  DASH template manifest, initialization segment, and media segment. 
   *
   * @param cacheControlSettings
   *        Configuration of cache control policies for media segments, HLS, and DASH manifests.  You can set caching for the HLS multivariant playlist, HLS media playlist, DASH timeline manifest,  DASH template manifest, initialization segment, and media segment. 
   */
  public void setCacheControlSettings(CacheControlSettings cacheControlSettings) {
    this.cacheControlSettings = cacheControlSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartLiveEncodingRequest startLiveEncodingRequest = (StartLiveEncodingRequest) o;
    return Objects.equals(this.streamKey, startLiveEncodingRequest.streamKey) &&
        Objects.equals(this.hlsManifests, startLiveEncodingRequest.hlsManifests) &&
        Objects.equals(this.dashManifests, startLiveEncodingRequest.dashManifests) &&
        Objects.equals(this.liveEncodingMode, startLiveEncodingRequest.liveEncodingMode) &&
        Objects.equals(this.reuploadSettings, startLiveEncodingRequest.reuploadSettings) &&
        Objects.equals(this.manifestGenerator, startLiveEncodingRequest.manifestGenerator) &&
        Objects.equals(this.autoRestartConfiguration, startLiveEncodingRequest.autoRestartConfiguration) &&
        Objects.equals(this.autoShutdownConfiguration, startLiveEncodingRequest.autoShutdownConfiguration) &&
        Objects.equals(this.esamSettings, startLiveEncodingRequest.esamSettings) &&
        Objects.equals(this.cacheControlSettings, startLiveEncodingRequest.cacheControlSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamKey, hlsManifests, dashManifests, liveEncodingMode, reuploadSettings, manifestGenerator, autoRestartConfiguration, autoShutdownConfiguration, esamSettings, cacheControlSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartLiveEncodingRequest {\n");
    
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
    sb.append("    hlsManifests: ").append(toIndentedString(hlsManifests)).append("\n");
    sb.append("    dashManifests: ").append(toIndentedString(dashManifests)).append("\n");
    sb.append("    liveEncodingMode: ").append(toIndentedString(liveEncodingMode)).append("\n");
    sb.append("    reuploadSettings: ").append(toIndentedString(reuploadSettings)).append("\n");
    sb.append("    manifestGenerator: ").append(toIndentedString(manifestGenerator)).append("\n");
    sb.append("    autoRestartConfiguration: ").append(toIndentedString(autoRestartConfiguration)).append("\n");
    sb.append("    autoShutdownConfiguration: ").append(toIndentedString(autoShutdownConfiguration)).append("\n");
    sb.append("    esamSettings: ").append(toIndentedString(esamSettings)).append("\n");
    sb.append("    cacheControlSettings: ").append(toIndentedString(cacheControlSettings)).append("\n");
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

