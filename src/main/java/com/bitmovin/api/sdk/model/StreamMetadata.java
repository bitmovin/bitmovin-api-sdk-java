package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamMetadata
 */

public class StreamMetadata {
  @JsonProperty("language")
  private String language;

  @JsonProperty("label")
  private String label;

  @JsonProperty("labelLanguage")
  private String labelLanguage;

  @JsonProperty("switchingSetId")
  private String switchingSetId;


  /**
   * Language of the media contained in the stream, given as an ISO 639-2 code or a BCP 47 tag, for example &#39;eng&#39; or &#39;en-US&#39;. If the value is not set, then no metadata tag is set for the media stream.
   * @return language
   */
  public String getLanguage() {
    return language;
  }

  /**
   * Language of the media contained in the stream, given as an ISO 639-2 code or a BCP 47 tag, for example &#39;eng&#39; or &#39;en-US&#39;. If the value is not set, then no metadata tag is set for the media stream.
   *
   * @param language
   *        Language of the media contained in the stream, given as an ISO 639-2 code or a BCP 47 tag, for example &#39;eng&#39; or &#39;en-US&#39;. If the value is not set, then no metadata tag is set for the media stream.
   */
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Display name of the Stream, for example to tell apart multiple audio tracks that share the same language. For CMAF muxings it is written as a &#39;labl&#39; box (ISO/IEC 14496-12) into the user data of the track. Downstream packagers use it for the Label element in DASH manifests and the NAME attribute of EXT-X-MEDIA tags in HLS playlists. If the value is not set, no label is written. Use &#39;labelLanguage&#39; to declare which language the label itself is written in.
   * @return label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Display name of the Stream, for example to tell apart multiple audio tracks that share the same language. For CMAF muxings it is written as a &#39;labl&#39; box (ISO/IEC 14496-12) into the user data of the track. Downstream packagers use it for the Label element in DASH manifests and the NAME attribute of EXT-X-MEDIA tags in HLS playlists. If the value is not set, no label is written. Use &#39;labelLanguage&#39; to declare which language the label itself is written in.
   *
   * @param label
   *        Display name of the Stream, for example to tell apart multiple audio tracks that share the same language. For CMAF muxings it is written as a &#39;labl&#39; box (ISO/IEC 14496-12) into the user data of the track. Downstream packagers use it for the Label element in DASH manifests and the NAME attribute of EXT-X-MEDIA tags in HLS playlists. If the value is not set, no label is written. Use &#39;labelLanguage&#39; to declare which language the label itself is written in.
   */
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * Language the &#39;label&#39; itself is written in, which is not necessarily the language of the media. A Spanish audio track can carry an English label, for example. For CMAF muxings it is written into the &#39;labl&#39; box next to the label, and downstream packagers use it for the lang attribute of the Label element in DASH manifests. The value is written as given and downstream packagers expose it unchanged, so set a BCP 47 tag such as &#39;en&#39; when the manifest should carry that form. The value has to be shaped like a BCP 47 tag: a primary subtag of two or three letters, optionally followed by subtags of up to eight letters or digits, each separated by a hyphen, for example &#39;en&#39;, &#39;en-US&#39; or &#39;es-419&#39;. If the value is not set and a label is set, &#39;language&#39; is used as given, for example &#39;eng&#39;. Without either, the label language is written as &#39;und&#39; (undetermined). HLS playlists are not affected, as EXT-X-MEDIA has no equivalent attribute.
   * @return labelLanguage
   */
  public String getLabelLanguage() {
    return labelLanguage;
  }

  /**
   * Language the &#39;label&#39; itself is written in, which is not necessarily the language of the media. A Spanish audio track can carry an English label, for example. For CMAF muxings it is written into the &#39;labl&#39; box next to the label, and downstream packagers use it for the lang attribute of the Label element in DASH manifests. The value is written as given and downstream packagers expose it unchanged, so set a BCP 47 tag such as &#39;en&#39; when the manifest should carry that form. The value has to be shaped like a BCP 47 tag: a primary subtag of two or three letters, optionally followed by subtags of up to eight letters or digits, each separated by a hyphen, for example &#39;en&#39;, &#39;en-US&#39; or &#39;es-419&#39;. If the value is not set and a label is set, &#39;language&#39; is used as given, for example &#39;eng&#39;. Without either, the label language is written as &#39;und&#39; (undetermined). HLS playlists are not affected, as EXT-X-MEDIA has no equivalent attribute.
   *
   * @param labelLanguage
   *        Language the &#39;label&#39; itself is written in, which is not necessarily the language of the media. A Spanish audio track can carry an English label, for example. For CMAF muxings it is written into the &#39;labl&#39; box next to the label, and downstream packagers use it for the lang attribute of the Label element in DASH manifests. The value is written as given and downstream packagers expose it unchanged, so set a BCP 47 tag such as &#39;en&#39; when the manifest should carry that form. The value has to be shaped like a BCP 47 tag: a primary subtag of two or three letters, optionally followed by subtags of up to eight letters or digits, each separated by a hyphen, for example &#39;en&#39;, &#39;en-US&#39; or &#39;es-419&#39;. If the value is not set and a label is set, &#39;language&#39; is used as given, for example &#39;eng&#39;. Without either, the label language is written as &#39;und&#39; (undetermined). HLS playlists are not affected, as EXT-X-MEDIA has no equivalent attribute.
   */
  public void setLabelLanguage(String labelLanguage) {
    this.labelLanguage = labelLanguage;
  }


  /**
   * Identifier of the switching set the Stream belongs to. For CMAF muxings it is written as a &#39;kind&#39; box with schemeURI urn:dashif:ingest:switchingset_id (DASH-IF Live Media Ingest) into the user data of the track. Downstream packagers group tracks with the same identifier into one switching set and use it in segment URLs. Only letters, digits, hyphens and underscores are allowed. If the value is not set and a label is set, an identifier is derived from the properties of the Stream, including the label. Without a label, no identifier is written. Set it explicitly when segment URLs have to stay stable across configuration updates.
   * @return switchingSetId
   */
  public String getSwitchingSetId() {
    return switchingSetId;
  }

  /**
   * Identifier of the switching set the Stream belongs to. For CMAF muxings it is written as a &#39;kind&#39; box with schemeURI urn:dashif:ingest:switchingset_id (DASH-IF Live Media Ingest) into the user data of the track. Downstream packagers group tracks with the same identifier into one switching set and use it in segment URLs. Only letters, digits, hyphens and underscores are allowed. If the value is not set and a label is set, an identifier is derived from the properties of the Stream, including the label. Without a label, no identifier is written. Set it explicitly when segment URLs have to stay stable across configuration updates.
   *
   * @param switchingSetId
   *        Identifier of the switching set the Stream belongs to. For CMAF muxings it is written as a &#39;kind&#39; box with schemeURI urn:dashif:ingest:switchingset_id (DASH-IF Live Media Ingest) into the user data of the track. Downstream packagers group tracks with the same identifier into one switching set and use it in segment URLs. Only letters, digits, hyphens and underscores are allowed. If the value is not set and a label is set, an identifier is derived from the properties of the Stream, including the label. Without a label, no identifier is written. Set it explicitly when segment URLs have to stay stable across configuration updates.
   */
  public void setSwitchingSetId(String switchingSetId) {
    this.switchingSetId = switchingSetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamMetadata streamMetadata = (StreamMetadata) o;
    return Objects.equals(this.language, streamMetadata.language) &&
        Objects.equals(this.label, streamMetadata.label) &&
        Objects.equals(this.labelLanguage, streamMetadata.labelLanguage) &&
        Objects.equals(this.switchingSetId, streamMetadata.switchingSetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, label, labelLanguage, switchingSetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamMetadata {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    labelLanguage: ").append(toIndentedString(labelLanguage)).append("\n");
    sb.append("    switchingSetId: ").append(toIndentedString(switchingSetId)).append("\n");
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

