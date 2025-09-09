package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.Ignoring;
import com.bitmovin.api.sdk.model.Muxing;
import com.bitmovin.api.sdk.model.MuxingStream;
import com.bitmovin.api.sdk.model.PTSAlignMode;
import com.bitmovin.api.sdk.model.StreamConditionsMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Fmp4Muxing
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = Fmp4Muxing.class)
public class Fmp4Muxing extends Muxing {
  @JsonProperty("segmentLength")
  private Double segmentLength;

  @JsonProperty("minimumSegmentLength")
  private Double minimumSegmentLength;

  @JsonProperty("segmentNaming")
  private String segmentNaming;

  @JsonProperty("segmentNamingTemplate")
  private String segmentNamingTemplate;

  @JsonProperty("initSegmentName")
  private String initSegmentName;

  @JsonProperty("initSegmentNameTemplate")
  private String initSegmentNameTemplate;

  @JsonProperty("writeDurationPerSample")
  private Boolean writeDurationPerSample;

  @JsonProperty("signalScte35AsEmsg")
  private Boolean signalScte35AsEmsg;

  @JsonProperty("segmentsMuxed")
  private Integer segmentsMuxed;

  @JsonProperty("ptsAlignMode")
  private PTSAlignMode ptsAlignMode;


  /**
   * Length of the fragments in seconds (required)
   * @return segmentLength
   */
  public Double getSegmentLength() {
    return segmentLength;
  }

  /**
   * Length of the fragments in seconds (required)
   *
   * @param segmentLength
   *        Length of the fragments in seconds (required)
   */
  public void setSegmentLength(Double segmentLength) {
    this.segmentLength = segmentLength;
  }


  /**
   * Prevents creation of very short segments (in seconds). If the last segment is shorter than minimumSegmentLength or there is a custom keyframe too close to a segment boundary, short segments will be omitted by removing segment boundaries, resulting in a segment of a size up to segmentLength + minimumSegmentLength.
   * @return minimumSegmentLength
   */
  public Double getMinimumSegmentLength() {
    return minimumSegmentLength;
  }

  /**
   * Prevents creation of very short segments (in seconds). If the last segment is shorter than minimumSegmentLength or there is a custom keyframe too close to a segment boundary, short segments will be omitted by removing segment boundaries, resulting in a segment of a size up to segmentLength + minimumSegmentLength.
   *
   * @param minimumSegmentLength
   *        Prevents creation of very short segments (in seconds). If the last segment is shorter than minimumSegmentLength or there is a custom keyframe too close to a segment boundary, short segments will be omitted by removing segment boundaries, resulting in a segment of a size up to segmentLength + minimumSegmentLength.
   */
  public void setMinimumSegmentLength(Double minimumSegmentLength) {
    this.minimumSegmentLength = minimumSegmentLength;
  }


  /**
   * Segment naming policy
   * @return segmentNaming
   */
  public String getSegmentNaming() {
    return segmentNaming;
  }

  /**
   * Segment naming policy
   *
   * @param segmentNaming
   *        Segment naming policy
   */
  public void setSegmentNaming(String segmentNaming) {
    this.segmentNaming = segmentNaming;
  }


  /**
   * Segment naming policy containing one or both of the following placeholders: - &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32)   on each (re)start of the encoding. The resulting string will be copied to the segmentNaming property.   Intended to avoid re-use of segment names after restarting a live encoding. - &#39;{segment_rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32)   for each different segment. This is intended to avoid guessing segment URLs by replacing segment numbers.  If segmentNamingTemplate is set, segmentNaming must not be set. 
   * @return segmentNamingTemplate
   */
  public String getSegmentNamingTemplate() {
    return segmentNamingTemplate;
  }

  /**
   * Segment naming policy containing one or both of the following placeholders: - &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32)   on each (re)start of the encoding. The resulting string will be copied to the segmentNaming property.   Intended to avoid re-use of segment names after restarting a live encoding. - &#39;{segment_rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32)   for each different segment. This is intended to avoid guessing segment URLs by replacing segment numbers.  If segmentNamingTemplate is set, segmentNaming must not be set. 
   *
   * @param segmentNamingTemplate
   *        Segment naming policy containing one or both of the following placeholders: - &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32)   on each (re)start of the encoding. The resulting string will be copied to the segmentNaming property.   Intended to avoid re-use of segment names after restarting a live encoding. - &#39;{segment_rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32)   for each different segment. This is intended to avoid guessing segment URLs by replacing segment numbers.  If segmentNamingTemplate is set, segmentNaming must not be set. 
   */
  public void setSegmentNamingTemplate(String segmentNamingTemplate) {
    this.segmentNamingTemplate = segmentNamingTemplate;
  }


  /**
   * Init segment name
   * @return initSegmentName
   */
  public String getInitSegmentName() {
    return initSegmentName;
  }

  /**
   * Init segment name
   *
   * @param initSegmentName
   *        Init segment name
   */
  public void setInitSegmentName(String initSegmentName) {
    this.initSegmentName = initSegmentName;
  }


  /**
   * Segment naming policy containing a placeholder of the format &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32) on each (re)start of the encoding. The resulting string will be copied to the initSegmentName property. Intended to avoid re-use of segment names after restarting a live encoding. If initSegmentNameTemplate is set, initSegmentName must not be set.
   * @return initSegmentNameTemplate
   */
  public String getInitSegmentNameTemplate() {
    return initSegmentNameTemplate;
  }

  /**
   * Segment naming policy containing a placeholder of the format &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32) on each (re)start of the encoding. The resulting string will be copied to the initSegmentName property. Intended to avoid re-use of segment names after restarting a live encoding. If initSegmentNameTemplate is set, initSegmentName must not be set.
   *
   * @param initSegmentNameTemplate
   *        Segment naming policy containing a placeholder of the format &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32) on each (re)start of the encoding. The resulting string will be copied to the initSegmentName property. Intended to avoid re-use of segment names after restarting a live encoding. If initSegmentNameTemplate is set, initSegmentName must not be set.
   */
  public void setInitSegmentNameTemplate(String initSegmentNameTemplate) {
    this.initSegmentNameTemplate = initSegmentNameTemplate;
  }


  /**
   * Writes the duration per sample into the sample entry in the Track Fragment Run Box. This could help to fix playback issues on legacy players. Enabling this flag increases the muxing overhead by 4 bytes per sample/frame.
   * @return writeDurationPerSample
   */
  public Boolean getWriteDurationPerSample() {
    return writeDurationPerSample;
  }

  /**
   * Writes the duration per sample into the sample entry in the Track Fragment Run Box. This could help to fix playback issues on legacy players. Enabling this flag increases the muxing overhead by 4 bytes per sample/frame.
   *
   * @param writeDurationPerSample
   *        Writes the duration per sample into the sample entry in the Track Fragment Run Box. This could help to fix playback issues on legacy players. Enabling this flag increases the muxing overhead by 4 bytes per sample/frame.
   */
  public void setWriteDurationPerSample(Boolean writeDurationPerSample) {
    this.writeDurationPerSample = writeDurationPerSample;
  }


  /**
   * Insert scte35 triggers as emsg boxes into the fMP4 segments.
   * @return signalScte35AsEmsg
   */
  public Boolean getSignalScte35AsEmsg() {
    return signalScte35AsEmsg;
  }

  /**
   * Insert scte35 triggers as emsg boxes into the fMP4 segments.
   *
   * @param signalScte35AsEmsg
   *        Insert scte35 triggers as emsg boxes into the fMP4 segments.
   */
  public void setSignalScte35AsEmsg(Boolean signalScte35AsEmsg) {
    this.signalScte35AsEmsg = signalScte35AsEmsg;
  }

  /**
   * Number of segments which have been encoded
   * @return segmentsMuxed
   */
  public Integer getSegmentsMuxed() {
    return segmentsMuxed;
  }


  /**
   * Alignment mode for composition / presentation timestamps (CTS/PTS). Only applies to h.264 and h.265
   * @return ptsAlignMode
   */
  public PTSAlignMode getPtsAlignMode() {
    return ptsAlignMode;
  }

  /**
   * Alignment mode for composition / presentation timestamps (CTS/PTS). Only applies to h.264 and h.265
   *
   * @param ptsAlignMode
   *        Alignment mode for composition / presentation timestamps (CTS/PTS). Only applies to h.264 and h.265
   */
  public void setPtsAlignMode(PTSAlignMode ptsAlignMode) {
    this.ptsAlignMode = ptsAlignMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fmp4Muxing fmp4Muxing = (Fmp4Muxing) o;
    return Objects.equals(this.segmentLength, fmp4Muxing.segmentLength) &&
        Objects.equals(this.minimumSegmentLength, fmp4Muxing.minimumSegmentLength) &&
        Objects.equals(this.segmentNaming, fmp4Muxing.segmentNaming) &&
        Objects.equals(this.segmentNamingTemplate, fmp4Muxing.segmentNamingTemplate) &&
        Objects.equals(this.initSegmentName, fmp4Muxing.initSegmentName) &&
        Objects.equals(this.initSegmentNameTemplate, fmp4Muxing.initSegmentNameTemplate) &&
        Objects.equals(this.writeDurationPerSample, fmp4Muxing.writeDurationPerSample) &&
        Objects.equals(this.signalScte35AsEmsg, fmp4Muxing.signalScte35AsEmsg) &&
        Objects.equals(this.segmentsMuxed, fmp4Muxing.segmentsMuxed) &&
        Objects.equals(this.ptsAlignMode, fmp4Muxing.ptsAlignMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentLength, minimumSegmentLength, segmentNaming, segmentNamingTemplate, initSegmentName, initSegmentNameTemplate, writeDurationPerSample, signalScte35AsEmsg, segmentsMuxed, ptsAlignMode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fmp4Muxing {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    segmentLength: ").append(toIndentedString(segmentLength)).append("\n");
    sb.append("    minimumSegmentLength: ").append(toIndentedString(minimumSegmentLength)).append("\n");
    sb.append("    segmentNaming: ").append(toIndentedString(segmentNaming)).append("\n");
    sb.append("    segmentNamingTemplate: ").append(toIndentedString(segmentNamingTemplate)).append("\n");
    sb.append("    initSegmentName: ").append(toIndentedString(initSegmentName)).append("\n");
    sb.append("    initSegmentNameTemplate: ").append(toIndentedString(initSegmentNameTemplate)).append("\n");
    sb.append("    writeDurationPerSample: ").append(toIndentedString(writeDurationPerSample)).append("\n");
    sb.append("    signalScte35AsEmsg: ").append(toIndentedString(signalScte35AsEmsg)).append("\n");
    sb.append("    segmentsMuxed: ").append(toIndentedString(segmentsMuxed)).append("\n");
    sb.append("    ptsAlignMode: ").append(toIndentedString(ptsAlignMode)).append("\n");
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

