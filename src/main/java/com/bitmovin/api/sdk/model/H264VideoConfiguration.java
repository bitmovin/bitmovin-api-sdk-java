package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AdaptiveQuantMode;
import com.bitmovin.api.sdk.model.AutoLevelSetup;
import com.bitmovin.api.sdk.model.BAdapt;
import com.bitmovin.api.sdk.model.Cea608708SubtitleConfiguration;
import com.bitmovin.api.sdk.model.ColorConfig;
import com.bitmovin.api.sdk.model.DisplayAspectRatio;
import com.bitmovin.api.sdk.model.EncodingMode;
import com.bitmovin.api.sdk.model.H264BPyramid;
import com.bitmovin.api.sdk.model.H264DynamicRangeFormat;
import com.bitmovin.api.sdk.model.H264InterlaceMode;
import com.bitmovin.api.sdk.model.H264MotionEstimationMethod;
import com.bitmovin.api.sdk.model.H264NalHrd;
import com.bitmovin.api.sdk.model.H264Partition;
import com.bitmovin.api.sdk.model.H264SubMe;
import com.bitmovin.api.sdk.model.H264Trellis;
import com.bitmovin.api.sdk.model.LevelH264;
import com.bitmovin.api.sdk.model.MvPredictionMode;
import com.bitmovin.api.sdk.model.PixelFormat;
import com.bitmovin.api.sdk.model.PresetConfiguration;
import com.bitmovin.api.sdk.model.ProfileH264;
import com.bitmovin.api.sdk.model.VideoConfiguration;
import com.bitmovin.api.sdk.model.WeightedPredictionPFrames;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * H264VideoConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = H264VideoConfiguration.class)
public class H264VideoConfiguration extends VideoConfiguration {
  @JsonProperty("presetConfiguration")
  private PresetConfiguration presetConfiguration;

  @JsonProperty("dynamicRangeFormat")
  private H264DynamicRangeFormat dynamicRangeFormat;

  @JsonProperty("crf")
  private Double crf;

  @JsonProperty("profile")
  private ProfileH264 profile;

  @JsonProperty("bframes")
  private Integer bframes;

  @JsonProperty("refFrames")
  private Integer refFrames;

  @JsonProperty("qpMin")
  private Integer qpMin;

  @JsonProperty("qpMax")
  private Integer qpMax;

  @JsonProperty("mvPredictionMode")
  private MvPredictionMode mvPredictionMode;

  @JsonProperty("mvSearchRangeMax")
  private Integer mvSearchRangeMax;

  @JsonProperty("cabac")
  private Boolean cabac;

  @JsonProperty("maxBitrate")
  private Long maxBitrate;

  @JsonProperty("minBitrate")
  private Long minBitrate;

  @JsonProperty("bufsize")
  private Long bufsize;

  @JsonProperty("minGop")
  private Integer minGop;

  @JsonProperty("maxGop")
  private Integer maxGop;

  @JsonProperty("openGop")
  private Boolean openGop;

  @JsonProperty("minKeyframeInterval")
  private Double minKeyframeInterval;

  @JsonProperty("maxKeyframeInterval")
  private Double maxKeyframeInterval;

  @JsonProperty("level")
  private LevelH264 level;

  @JsonProperty("bAdaptiveStrategy")
  private BAdapt bAdaptiveStrategy;

  @JsonProperty("motionEstimationMethod")
  private H264MotionEstimationMethod motionEstimationMethod;

  @JsonProperty("rcLookahead")
  private Integer rcLookahead;

  @JsonProperty("subMe")
  private H264SubMe subMe;

  @JsonProperty("trellis")
  private H264Trellis trellis;

  @JsonProperty("partitions")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<H264Partition> partitions = new ArrayList<H264Partition>();

  @JsonProperty("slices")
  private Integer slices;

  @JsonProperty("interlaceMode")
  private H264InterlaceMode interlaceMode;

  @JsonProperty("sceneCutThreshold")
  private Integer sceneCutThreshold;

  @JsonProperty("nalHrd")
  private H264NalHrd nalHrd;

  @JsonProperty("bPyramid")
  private H264BPyramid bPyramid;

  @JsonProperty("cea608708SubtitleConfig")
  private Cea608708SubtitleConfiguration cea608708SubtitleConfig;

  @JsonProperty("deblockAlpha")
  private Integer deblockAlpha;

  @JsonProperty("deblockBeta")
  private Integer deblockBeta;

  @JsonProperty("adaptiveQuantizationMode")
  private AdaptiveQuantMode adaptiveQuantizationMode;

  @JsonProperty("adaptiveQuantizationStrength")
  private Double adaptiveQuantizationStrength;

  @JsonProperty("mixedReferences")
  private Boolean mixedReferences;

  @JsonProperty("adaptiveSpatialTransform")
  private Boolean adaptiveSpatialTransform;

  @JsonProperty("fastSkipDetectionPFrames")
  private Boolean fastSkipDetectionPFrames;

  @JsonProperty("weightedPredictionBFrames")
  private Boolean weightedPredictionBFrames;

  @JsonProperty("weightedPredictionPFrames")
  private WeightedPredictionPFrames weightedPredictionPFrames;

  @JsonProperty("macroblockTreeRatecontrol")
  private Boolean macroblockTreeRatecontrol;

  @JsonProperty("quantizerCurveCompression")
  private Double quantizerCurveCompression;

  @JsonProperty("psyRateDistortionOptimization")
  private Double psyRateDistortionOptimization;

  @JsonProperty("psyTrellis")
  private Double psyTrellis;

  @JsonProperty("autoLevelSetup")
  private AutoLevelSetup autoLevelSetup;


  /**
   * Choose from a set of preset configurations tailored for common use cases. Check out [H264 Presets](https://bitmovin.com/docs/encoding/tutorials/h264-presets) to see which values get applied by each preset. Explicitly setting a property to a different value will override the preset&#39;s value for that property.
   * @return presetConfiguration
   */
  public PresetConfiguration getPresetConfiguration() {
    return presetConfiguration;
  }

  /**
   * Choose from a set of preset configurations tailored for common use cases. Check out [H264 Presets](https://bitmovin.com/docs/encoding/tutorials/h264-presets) to see which values get applied by each preset. Explicitly setting a property to a different value will override the preset&#39;s value for that property.
   *
   * @param presetConfiguration
   *        Choose from a set of preset configurations tailored for common use cases. Check out [H264 Presets](https://bitmovin.com/docs/encoding/tutorials/h264-presets) to see which values get applied by each preset. Explicitly setting a property to a different value will override the preset&#39;s value for that property.
   */
  public void setPresetConfiguration(PresetConfiguration presetConfiguration) {
    this.presetConfiguration = presetConfiguration;
  }


  /**
   * Automatically configures the H264 Video Codec to be compatible with the given SDR format. Bitmovin recommends to use the dynamic range format together with a preset configuration to achieve good results. Explicitly configured properties will take precedence over dynamic range format settings, which in turn will take precedence over preset configurations.
   * @return dynamicRangeFormat
   */
  public H264DynamicRangeFormat getDynamicRangeFormat() {
    return dynamicRangeFormat;
  }

  /**
   * Automatically configures the H264 Video Codec to be compatible with the given SDR format. Bitmovin recommends to use the dynamic range format together with a preset configuration to achieve good results. Explicitly configured properties will take precedence over dynamic range format settings, which in turn will take precedence over preset configurations.
   *
   * @param dynamicRangeFormat
   *        Automatically configures the H264 Video Codec to be compatible with the given SDR format. Bitmovin recommends to use the dynamic range format together with a preset configuration to achieve good results. Explicitly configured properties will take precedence over dynamic range format settings, which in turn will take precedence over preset configurations.
   */
  public void setDynamicRangeFormat(H264DynamicRangeFormat dynamicRangeFormat) {
    this.dynamicRangeFormat = dynamicRangeFormat;
  }


  /**
   * Constant rate factor for quality-based variable bitrate. Either bitrate or crf is required.
   * minimum: 0
   * maximum: 51
   * @return crf
   */
  public Double getCrf() {
    return crf;
  }

  /**
   * Constant rate factor for quality-based variable bitrate. Either bitrate or crf is required.
   * minimum: 0
   * maximum: 51
   *
   * @param crf
   *        Constant rate factor for quality-based variable bitrate. Either bitrate or crf is required.
   *        minimum: 0
   *        maximum: 51
   */
  public void setCrf(Double crf) {
    this.crf = crf;
  }


  /**
   * When setting a profile, all other settings must not exceed the limits which are defined in the profile. Otherwise, a higher profile may be automatically chosen. (required)
   * @return profile
   */
  public ProfileH264 getProfile() {
    return profile;
  }

  /**
   * When setting a profile, all other settings must not exceed the limits which are defined in the profile. Otherwise, a higher profile may be automatically chosen. (required)
   *
   * @param profile
   *        When setting a profile, all other settings must not exceed the limits which are defined in the profile. Otherwise, a higher profile may be automatically chosen. (required)
   */
  public void setProfile(ProfileH264 profile) {
    this.profile = profile;
  }


  /**
   * Amount of b frames
   * minimum: 0
   * maximum: 16
   * @return bframes
   */
  public Integer getBframes() {
    return bframes;
  }

  /**
   * Amount of b frames
   * minimum: 0
   * maximum: 16
   *
   * @param bframes
   *        Amount of b frames
   *        minimum: 0
   *        maximum: 16
   */
  public void setBframes(Integer bframes) {
    this.bframes = bframes;
  }


  /**
   * Amount of reference frames.
   * minimum: 1
   * maximum: 16
   * @return refFrames
   */
  public Integer getRefFrames() {
    return refFrames;
  }

  /**
   * Amount of reference frames.
   * minimum: 1
   * maximum: 16
   *
   * @param refFrames
   *        Amount of reference frames.
   *        minimum: 1
   *        maximum: 16
   */
  public void setRefFrames(Integer refFrames) {
    this.refFrames = refFrames;
  }


  /**
   * Minimum quantization factor
   * minimum: 0
   * maximum: 69
   * @return qpMin
   */
  public Integer getQpMin() {
    return qpMin;
  }

  /**
   * Minimum quantization factor
   * minimum: 0
   * maximum: 69
   *
   * @param qpMin
   *        Minimum quantization factor
   *        minimum: 0
   *        maximum: 69
   */
  public void setQpMin(Integer qpMin) {
    this.qpMin = qpMin;
  }


  /**
   * Maximum quantization factor
   * minimum: 0
   * maximum: 69
   * @return qpMax
   */
  public Integer getQpMax() {
    return qpMax;
  }

  /**
   * Maximum quantization factor
   * minimum: 0
   * maximum: 69
   *
   * @param qpMax
   *        Maximum quantization factor
   *        minimum: 0
   *        maximum: 69
   */
  public void setQpMax(Integer qpMax) {
    this.qpMax = qpMax;
  }


  /**
   * Get mvPredictionMode
   * @return mvPredictionMode
   */
  public MvPredictionMode getMvPredictionMode() {
    return mvPredictionMode;
  }

  /**
   * Set mvPredictionMode
   *
   * @param mvPredictionMode
   */
  public void setMvPredictionMode(MvPredictionMode mvPredictionMode) {
    this.mvPredictionMode = mvPredictionMode;
  }


  /**
   * Maximum motion vector search range
   * minimum: 16
   * maximum: 24
   * @return mvSearchRangeMax
   */
  public Integer getMvSearchRangeMax() {
    return mvSearchRangeMax;
  }

  /**
   * Maximum motion vector search range
   * minimum: 16
   * maximum: 24
   *
   * @param mvSearchRangeMax
   *        Maximum motion vector search range
   *        minimum: 16
   *        maximum: 24
   */
  public void setMvSearchRangeMax(Integer mvSearchRangeMax) {
    this.mvSearchRangeMax = mvSearchRangeMax;
  }


  /**
   * Enable or disable CABAC
   * @return cabac
   */
  public Boolean getCabac() {
    return cabac;
  }

  /**
   * Enable or disable CABAC
   *
   * @param cabac
   *        Enable or disable CABAC
   */
  public void setCabac(Boolean cabac) {
    this.cabac = cabac;
  }


  /**
   * Maximum Bitrate
   * @return maxBitrate
   */
  public Long getMaxBitrate() {
    return maxBitrate;
  }

  /**
   * Maximum Bitrate
   *
   * @param maxBitrate
   *        Maximum Bitrate
   */
  public void setMaxBitrate(Long maxBitrate) {
    this.maxBitrate = maxBitrate;
  }


  /**
   * Minimum Bitrate
   * @return minBitrate
   */
  public Long getMinBitrate() {
    return minBitrate;
  }

  /**
   * Minimum Bitrate
   *
   * @param minBitrate
   *        Minimum Bitrate
   */
  public void setMinBitrate(Long minBitrate) {
    this.minBitrate = minBitrate;
  }


  /**
   * Playback device buffer size
   * @return bufsize
   */
  public Long getBufsize() {
    return bufsize;
  }

  /**
   * Playback device buffer size
   *
   * @param bufsize
   *        Playback device buffer size
   */
  public void setBufsize(Long bufsize) {
    this.bufsize = bufsize;
  }


  /**
   * Minimum GOP length, the minimum distance between I-frames
   * @return minGop
   */
  public Integer getMinGop() {
    return minGop;
  }

  /**
   * Minimum GOP length, the minimum distance between I-frames
   *
   * @param minGop
   *        Minimum GOP length, the minimum distance between I-frames
   */
  public void setMinGop(Integer minGop) {
    this.minGop = minGop;
  }


  /**
   * Maximum GOP length, the maximum distance between I-frames
   * @return maxGop
   */
  public Integer getMaxGop() {
    return maxGop;
  }

  /**
   * Maximum GOP length, the maximum distance between I-frames
   *
   * @param maxGop
   *        Maximum GOP length, the maximum distance between I-frames
   */
  public void setMaxGop(Integer maxGop) {
    this.maxGop = maxGop;
  }


  /**
   * Enable open-gop, allows referencing frames from a previous gop
   * @return openGop
   */
  public Boolean getOpenGop() {
    return openGop;
  }

  /**
   * Enable open-gop, allows referencing frames from a previous gop
   *
   * @param openGop
   *        Enable open-gop, allows referencing frames from a previous gop
   */
  public void setOpenGop(Boolean openGop) {
    this.openGop = openGop;
  }


  /**
   * Minimum interval in seconds between key frames
   * @return minKeyframeInterval
   */
  public Double getMinKeyframeInterval() {
    return minKeyframeInterval;
  }

  /**
   * Minimum interval in seconds between key frames
   *
   * @param minKeyframeInterval
   *        Minimum interval in seconds between key frames
   */
  public void setMinKeyframeInterval(Double minKeyframeInterval) {
    this.minKeyframeInterval = minKeyframeInterval;
  }


  /**
   * Maximum interval in seconds between key frames
   * @return maxKeyframeInterval
   */
  public Double getMaxKeyframeInterval() {
    return maxKeyframeInterval;
  }

  /**
   * Maximum interval in seconds between key frames
   *
   * @param maxKeyframeInterval
   *        Maximum interval in seconds between key frames
   */
  public void setMaxKeyframeInterval(Double maxKeyframeInterval) {
    this.maxKeyframeInterval = maxKeyframeInterval;
  }


  /**
   * If three-pass encoding is used and a level is set for the encoder, the bitrate for some segments may exceed the bitrate limit which is defined by the level.
   * @return level
   */
  public LevelH264 getLevel() {
    return level;
  }

  /**
   * If three-pass encoding is used and a level is set for the encoder, the bitrate for some segments may exceed the bitrate limit which is defined by the level.
   *
   * @param level
   *        If three-pass encoding is used and a level is set for the encoder, the bitrate for some segments may exceed the bitrate limit which is defined by the level.
   */
  public void setLevel(LevelH264 level) {
    this.level = level;
  }


  /**
   * Get bAdaptiveStrategy
   * @return bAdaptiveStrategy
   */
  public BAdapt getBAdaptiveStrategy() {
    return bAdaptiveStrategy;
  }

  /**
   * Set bAdaptiveStrategy
   *
   * @param bAdaptiveStrategy
   */
  public void setBAdaptiveStrategy(BAdapt bAdaptiveStrategy) {
    this.bAdaptiveStrategy = bAdaptiveStrategy;
  }


  /**
   * Get motionEstimationMethod
   * @return motionEstimationMethod
   */
  public H264MotionEstimationMethod getMotionEstimationMethod() {
    return motionEstimationMethod;
  }

  /**
   * Set motionEstimationMethod
   *
   * @param motionEstimationMethod
   */
  public void setMotionEstimationMethod(H264MotionEstimationMethod motionEstimationMethod) {
    this.motionEstimationMethod = motionEstimationMethod;
  }


  /**
   * Number of frames for frame-type decision lookahead
   * minimum: 0
   * maximum: 250
   * @return rcLookahead
   */
  public Integer getRcLookahead() {
    return rcLookahead;
  }

  /**
   * Number of frames for frame-type decision lookahead
   * minimum: 0
   * maximum: 250
   *
   * @param rcLookahead
   *        Number of frames for frame-type decision lookahead
   *        minimum: 0
   *        maximum: 250
   */
  public void setRcLookahead(Integer rcLookahead) {
    this.rcLookahead = rcLookahead;
  }


  /**
   * Subpixel motion estimation and mode decision
   * @return subMe
   */
  public H264SubMe getSubMe() {
    return subMe;
  }

  /**
   * Subpixel motion estimation and mode decision
   *
   * @param subMe
   *        Subpixel motion estimation and mode decision
   */
  public void setSubMe(H264SubMe subMe) {
    this.subMe = subMe;
  }


  /**
   * Enables or disables Trellis quantization. NOTE: This requires cabac
   * @return trellis
   */
  public H264Trellis getTrellis() {
    return trellis;
  }

  /**
   * Enables or disables Trellis quantization. NOTE: This requires cabac
   *
   * @param trellis
   *        Enables or disables Trellis quantization. NOTE: This requires cabac
   */
  public void setTrellis(H264Trellis trellis) {
    this.trellis = trellis;
  }


  public H264VideoConfiguration addPartitionsItem(H264Partition partitionsItem) {
    this.partitions.add(partitionsItem);
    return this;
  }

  /**
   * Partitions to consider. Analyzing more partition options improves quality at the cost of speed.
   * @return partitions
   */
  public List<H264Partition> getPartitions() {
    return partitions;
  }

  /**
   * Partitions to consider. Analyzing more partition options improves quality at the cost of speed.
   *
   * @param partitions
   *        Partitions to consider. Analyzing more partition options improves quality at the cost of speed.
   */
  public void setPartitions(List<H264Partition> partitions) {
    this.partitions = partitions;
  }


  /**
   * Number of slices per frame.
   * minimum: 1
   * maximum: 45
   * @return slices
   */
  public Integer getSlices() {
    return slices;
  }

  /**
   * Number of slices per frame.
   * minimum: 1
   * maximum: 45
   *
   * @param slices
   *        Number of slices per frame.
   *        minimum: 1
   *        maximum: 45
   */
  public void setSlices(Integer slices) {
    this.slices = slices;
  }


  /**
   * Using TOP_FIELD_FIRST or BOTTOM_FIELD_FIRST will output interlaced video
   * @return interlaceMode
   */
  public H264InterlaceMode getInterlaceMode() {
    return interlaceMode;
  }

  /**
   * Using TOP_FIELD_FIRST or BOTTOM_FIELD_FIRST will output interlaced video
   *
   * @param interlaceMode
   *        Using TOP_FIELD_FIRST or BOTTOM_FIELD_FIRST will output interlaced video
   */
  public void setInterlaceMode(H264InterlaceMode interlaceMode) {
    this.interlaceMode = interlaceMode;
  }


  /**
   * Scene change sensitivity. The higher the value, the more likely an I-frame will be inserted. Set to 0 to disable it which is advised for scenarios where fixed GOP is required, e.g., adaptive streaming outputs like DASH, HLS and Smooth. Having this setting enabled can improve quality for progressive output with an increased internal chunk length (see &#x60;internalChunkLength&#x60; of muxings).
   * minimum: 0
   * maximum: 100
   * @return sceneCutThreshold
   */
  public Integer getSceneCutThreshold() {
    return sceneCutThreshold;
  }

  /**
   * Scene change sensitivity. The higher the value, the more likely an I-frame will be inserted. Set to 0 to disable it which is advised for scenarios where fixed GOP is required, e.g., adaptive streaming outputs like DASH, HLS and Smooth. Having this setting enabled can improve quality for progressive output with an increased internal chunk length (see &#x60;internalChunkLength&#x60; of muxings).
   * minimum: 0
   * maximum: 100
   *
   * @param sceneCutThreshold
   *        Scene change sensitivity. The higher the value, the more likely an I-frame will be inserted. Set to 0 to disable it which is advised for scenarios where fixed GOP is required, e.g., adaptive streaming outputs like DASH, HLS and Smooth. Having this setting enabled can improve quality for progressive output with an increased internal chunk length (see &#x60;internalChunkLength&#x60; of muxings).
   *        minimum: 0
   *        maximum: 100
   */
  public void setSceneCutThreshold(Integer sceneCutThreshold) {
    this.sceneCutThreshold = sceneCutThreshold;
  }


  /**
   * Signal hypothetical reference decoder (HRD) information (requires bufsize to be set)
   * @return nalHrd
   */
  public H264NalHrd getNalHrd() {
    return nalHrd;
  }

  /**
   * Signal hypothetical reference decoder (HRD) information (requires bufsize to be set)
   *
   * @param nalHrd
   *        Signal hypothetical reference decoder (HRD) information (requires bufsize to be set)
   */
  public void setNalHrd(H264NalHrd nalHrd) {
    this.nalHrd = nalHrd;
  }


  /**
   * Keep some B-frames as references
   * @return bPyramid
   */
  public H264BPyramid getBPyramid() {
    return bPyramid;
  }

  /**
   * Keep some B-frames as references
   *
   * @param bPyramid
   *        Keep some B-frames as references
   */
  public void setBPyramid(H264BPyramid bPyramid) {
    this.bPyramid = bPyramid;
  }


  /**
   * Defines whether CEA 608/708 subtitles are copied from the input video stream
   * @return cea608708SubtitleConfig
   */
  public Cea608708SubtitleConfiguration getCea608708SubtitleConfig() {
    return cea608708SubtitleConfig;
  }

  /**
   * Defines whether CEA 608/708 subtitles are copied from the input video stream
   *
   * @param cea608708SubtitleConfig
   *        Defines whether CEA 608/708 subtitles are copied from the input video stream
   */
  public void setCea608708SubtitleConfig(Cea608708SubtitleConfiguration cea608708SubtitleConfig) {
    this.cea608708SubtitleConfig = cea608708SubtitleConfig;
  }


  /**
   * Strength of the in-loop deblocking filter. Higher values deblock more effectively but also soften the image
   * @return deblockAlpha
   */
  public Integer getDeblockAlpha() {
    return deblockAlpha;
  }

  /**
   * Strength of the in-loop deblocking filter. Higher values deblock more effectively but also soften the image
   *
   * @param deblockAlpha
   *        Strength of the in-loop deblocking filter. Higher values deblock more effectively but also soften the image
   */
  public void setDeblockAlpha(Integer deblockAlpha) {
    this.deblockAlpha = deblockAlpha;
  }


  /**
   * Threshold of the in-loop deblocking filter. Higher values apply deblocking stronger on non flat blocks, lower values on flat blocks
   * @return deblockBeta
   */
  public Integer getDeblockBeta() {
    return deblockBeta;
  }

  /**
   * Threshold of the in-loop deblocking filter. Higher values apply deblocking stronger on non flat blocks, lower values on flat blocks
   *
   * @param deblockBeta
   *        Threshold of the in-loop deblocking filter. Higher values apply deblocking stronger on non flat blocks, lower values on flat blocks
   */
  public void setDeblockBeta(Integer deblockBeta) {
    this.deblockBeta = deblockBeta;
  }


  /**
   * Controls the adaptive quantization algorithm
   * @return adaptiveQuantizationMode
   */
  public AdaptiveQuantMode getAdaptiveQuantizationMode() {
    return adaptiveQuantizationMode;
  }

  /**
   * Controls the adaptive quantization algorithm
   *
   * @param adaptiveQuantizationMode
   *        Controls the adaptive quantization algorithm
   */
  public void setAdaptiveQuantizationMode(AdaptiveQuantMode adaptiveQuantizationMode) {
    this.adaptiveQuantizationMode = adaptiveQuantizationMode;
  }


  /**
   * Values greater than 1 reduce blocking and blurring in flat and textured areas. Values less than 1 reduces ringing artifacts at the cost of more banding artifacts. Negative values are not allowed
   * @return adaptiveQuantizationStrength
   */
  public Double getAdaptiveQuantizationStrength() {
    return adaptiveQuantizationStrength;
  }

  /**
   * Values greater than 1 reduce blocking and blurring in flat and textured areas. Values less than 1 reduces ringing artifacts at the cost of more banding artifacts. Negative values are not allowed
   *
   * @param adaptiveQuantizationStrength
   *        Values greater than 1 reduce blocking and blurring in flat and textured areas. Values less than 1 reduces ringing artifacts at the cost of more banding artifacts. Negative values are not allowed
   */
  public void setAdaptiveQuantizationStrength(Double adaptiveQuantizationStrength) {
    this.adaptiveQuantizationStrength = adaptiveQuantizationStrength;
  }


  /**
   * Allow references on a per partition basis, rather than per-macroblock basis
   * @return mixedReferences
   */
  public Boolean getMixedReferences() {
    return mixedReferences;
  }

  /**
   * Allow references on a per partition basis, rather than per-macroblock basis
   *
   * @param mixedReferences
   *        Allow references on a per partition basis, rather than per-macroblock basis
   */
  public void setMixedReferences(Boolean mixedReferences) {
    this.mixedReferences = mixedReferences;
  }


  /**
   * Enables adaptive spatial transform (high profile 8x8 transform)
   * @return adaptiveSpatialTransform
   */
  public Boolean getAdaptiveSpatialTransform() {
    return adaptiveSpatialTransform;
  }

  /**
   * Enables adaptive spatial transform (high profile 8x8 transform)
   *
   * @param adaptiveSpatialTransform
   *        Enables adaptive spatial transform (high profile 8x8 transform)
   */
  public void setAdaptiveSpatialTransform(Boolean adaptiveSpatialTransform) {
    this.adaptiveSpatialTransform = adaptiveSpatialTransform;
  }


  /**
   * Enables fast skip detection on P-frames. Disabling this very slightly increases quality but at a large speed loss
   * @return fastSkipDetectionPFrames
   */
  public Boolean getFastSkipDetectionPFrames() {
    return fastSkipDetectionPFrames;
  }

  /**
   * Enables fast skip detection on P-frames. Disabling this very slightly increases quality but at a large speed loss
   *
   * @param fastSkipDetectionPFrames
   *        Enables fast skip detection on P-frames. Disabling this very slightly increases quality but at a large speed loss
   */
  public void setFastSkipDetectionPFrames(Boolean fastSkipDetectionPFrames) {
    this.fastSkipDetectionPFrames = fastSkipDetectionPFrames;
  }


  /**
   * Enable open-gop, allows referencing frames from a previous gop
   * @return weightedPredictionBFrames
   */
  public Boolean getWeightedPredictionBFrames() {
    return weightedPredictionBFrames;
  }

  /**
   * Enable open-gop, allows referencing frames from a previous gop
   *
   * @param weightedPredictionBFrames
   *        Enable open-gop, allows referencing frames from a previous gop
   */
  public void setWeightedPredictionBFrames(Boolean weightedPredictionBFrames) {
    this.weightedPredictionBFrames = weightedPredictionBFrames;
  }


  /**
   * Defines the mode for weighted prediction for P-frames
   * @return weightedPredictionPFrames
   */
  public WeightedPredictionPFrames getWeightedPredictionPFrames() {
    return weightedPredictionPFrames;
  }

  /**
   * Defines the mode for weighted prediction for P-frames
   *
   * @param weightedPredictionPFrames
   *        Defines the mode for weighted prediction for P-frames
   */
  public void setWeightedPredictionPFrames(WeightedPredictionPFrames weightedPredictionPFrames) {
    this.weightedPredictionPFrames = weightedPredictionPFrames;
  }


  /**
   * Enable macroblock tree ratecontrol. Macroblock tree rate control tracks how often blocks of the frame are used for prediciting future frames
   * @return macroblockTreeRatecontrol
   */
  public Boolean getMacroblockTreeRatecontrol() {
    return macroblockTreeRatecontrol;
  }

  /**
   * Enable macroblock tree ratecontrol. Macroblock tree rate control tracks how often blocks of the frame are used for prediciting future frames
   *
   * @param macroblockTreeRatecontrol
   *        Enable macroblock tree ratecontrol. Macroblock tree rate control tracks how often blocks of the frame are used for prediciting future frames
   */
  public void setMacroblockTreeRatecontrol(Boolean macroblockTreeRatecontrol) {
    this.macroblockTreeRatecontrol = macroblockTreeRatecontrol;
  }


  /**
   * Ratio between constant bitrate (0.0) and constant quantizer (1.0). Valid range 0.0 - 1.0
   * @return quantizerCurveCompression
   */
  public Double getQuantizerCurveCompression() {
    return quantizerCurveCompression;
  }

  /**
   * Ratio between constant bitrate (0.0) and constant quantizer (1.0). Valid range 0.0 - 1.0
   *
   * @param quantizerCurveCompression
   *        Ratio between constant bitrate (0.0) and constant quantizer (1.0). Valid range 0.0 - 1.0
   */
  public void setQuantizerCurveCompression(Double quantizerCurveCompression) {
    this.quantizerCurveCompression = quantizerCurveCompression;
  }


  /**
   * Psychovisual Rate Distortion retains fine details like film grain at the expense of more blocking artifacts. Higher values make the video appear sharper and more detailed but with a higher risk of blocking artifacts. Needs to have subMe with RD_IP, RD_ALL, RD_REF_IP or RD_REF_ALL
   * @return psyRateDistortionOptimization
   */
  public Double getPsyRateDistortionOptimization() {
    return psyRateDistortionOptimization;
  }

  /**
   * Psychovisual Rate Distortion retains fine details like film grain at the expense of more blocking artifacts. Higher values make the video appear sharper and more detailed but with a higher risk of blocking artifacts. Needs to have subMe with RD_IP, RD_ALL, RD_REF_IP or RD_REF_ALL
   *
   * @param psyRateDistortionOptimization
   *        Psychovisual Rate Distortion retains fine details like film grain at the expense of more blocking artifacts. Higher values make the video appear sharper and more detailed but with a higher risk of blocking artifacts. Needs to have subMe with RD_IP, RD_ALL, RD_REF_IP or RD_REF_ALL
   */
  public void setPsyRateDistortionOptimization(Double psyRateDistortionOptimization) {
    this.psyRateDistortionOptimization = psyRateDistortionOptimization;
  }


  /**
   * Higher values will improve sharpness and detail retention but might come at costs of artifacts. Needs to have trellis enabled
   * @return psyTrellis
   */
  public Double getPsyTrellis() {
    return psyTrellis;
  }

  /**
   * Higher values will improve sharpness and detail retention but might come at costs of artifacts. Needs to have trellis enabled
   *
   * @param psyTrellis
   *        Higher values will improve sharpness and detail retention but might come at costs of artifacts. Needs to have trellis enabled
   */
  public void setPsyTrellis(Double psyTrellis) {
    this.psyTrellis = psyTrellis;
  }


  /**
   * Enable/disable automatic calculation of level, maxBitrate, and bufsize based on the least level that satisfies maximum property values for picture resolution, frame rate, and bit rate. In the case the target level is set explicitly, the maximum bitrate and buffer size are calculated based on the defined level. Explicitly setting maxBitrate, or bufsize properties will disable the automatic calculation.
   * @return autoLevelSetup
   */
  public AutoLevelSetup getAutoLevelSetup() {
    return autoLevelSetup;
  }

  /**
   * Enable/disable automatic calculation of level, maxBitrate, and bufsize based on the least level that satisfies maximum property values for picture resolution, frame rate, and bit rate. In the case the target level is set explicitly, the maximum bitrate and buffer size are calculated based on the defined level. Explicitly setting maxBitrate, or bufsize properties will disable the automatic calculation.
   *
   * @param autoLevelSetup
   *        Enable/disable automatic calculation of level, maxBitrate, and bufsize based on the least level that satisfies maximum property values for picture resolution, frame rate, and bit rate. In the case the target level is set explicitly, the maximum bitrate and buffer size are calculated based on the defined level. Explicitly setting maxBitrate, or bufsize properties will disable the automatic calculation.
   */
  public void setAutoLevelSetup(AutoLevelSetup autoLevelSetup) {
    this.autoLevelSetup = autoLevelSetup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    H264VideoConfiguration h264VideoConfiguration = (H264VideoConfiguration) o;
    return Objects.equals(this.presetConfiguration, h264VideoConfiguration.presetConfiguration) &&
        Objects.equals(this.dynamicRangeFormat, h264VideoConfiguration.dynamicRangeFormat) &&
        Objects.equals(this.crf, h264VideoConfiguration.crf) &&
        Objects.equals(this.profile, h264VideoConfiguration.profile) &&
        Objects.equals(this.bframes, h264VideoConfiguration.bframes) &&
        Objects.equals(this.refFrames, h264VideoConfiguration.refFrames) &&
        Objects.equals(this.qpMin, h264VideoConfiguration.qpMin) &&
        Objects.equals(this.qpMax, h264VideoConfiguration.qpMax) &&
        Objects.equals(this.mvPredictionMode, h264VideoConfiguration.mvPredictionMode) &&
        Objects.equals(this.mvSearchRangeMax, h264VideoConfiguration.mvSearchRangeMax) &&
        Objects.equals(this.cabac, h264VideoConfiguration.cabac) &&
        Objects.equals(this.maxBitrate, h264VideoConfiguration.maxBitrate) &&
        Objects.equals(this.minBitrate, h264VideoConfiguration.minBitrate) &&
        Objects.equals(this.bufsize, h264VideoConfiguration.bufsize) &&
        Objects.equals(this.minGop, h264VideoConfiguration.minGop) &&
        Objects.equals(this.maxGop, h264VideoConfiguration.maxGop) &&
        Objects.equals(this.openGop, h264VideoConfiguration.openGop) &&
        Objects.equals(this.minKeyframeInterval, h264VideoConfiguration.minKeyframeInterval) &&
        Objects.equals(this.maxKeyframeInterval, h264VideoConfiguration.maxKeyframeInterval) &&
        Objects.equals(this.level, h264VideoConfiguration.level) &&
        Objects.equals(this.bAdaptiveStrategy, h264VideoConfiguration.bAdaptiveStrategy) &&
        Objects.equals(this.motionEstimationMethod, h264VideoConfiguration.motionEstimationMethod) &&
        Objects.equals(this.rcLookahead, h264VideoConfiguration.rcLookahead) &&
        Objects.equals(this.subMe, h264VideoConfiguration.subMe) &&
        Objects.equals(this.trellis, h264VideoConfiguration.trellis) &&
        Objects.equals(this.partitions, h264VideoConfiguration.partitions) &&
        Objects.equals(this.slices, h264VideoConfiguration.slices) &&
        Objects.equals(this.interlaceMode, h264VideoConfiguration.interlaceMode) &&
        Objects.equals(this.sceneCutThreshold, h264VideoConfiguration.sceneCutThreshold) &&
        Objects.equals(this.nalHrd, h264VideoConfiguration.nalHrd) &&
        Objects.equals(this.bPyramid, h264VideoConfiguration.bPyramid) &&
        Objects.equals(this.cea608708SubtitleConfig, h264VideoConfiguration.cea608708SubtitleConfig) &&
        Objects.equals(this.deblockAlpha, h264VideoConfiguration.deblockAlpha) &&
        Objects.equals(this.deblockBeta, h264VideoConfiguration.deblockBeta) &&
        Objects.equals(this.adaptiveQuantizationMode, h264VideoConfiguration.adaptiveQuantizationMode) &&
        Objects.equals(this.adaptiveQuantizationStrength, h264VideoConfiguration.adaptiveQuantizationStrength) &&
        Objects.equals(this.mixedReferences, h264VideoConfiguration.mixedReferences) &&
        Objects.equals(this.adaptiveSpatialTransform, h264VideoConfiguration.adaptiveSpatialTransform) &&
        Objects.equals(this.fastSkipDetectionPFrames, h264VideoConfiguration.fastSkipDetectionPFrames) &&
        Objects.equals(this.weightedPredictionBFrames, h264VideoConfiguration.weightedPredictionBFrames) &&
        Objects.equals(this.weightedPredictionPFrames, h264VideoConfiguration.weightedPredictionPFrames) &&
        Objects.equals(this.macroblockTreeRatecontrol, h264VideoConfiguration.macroblockTreeRatecontrol) &&
        Objects.equals(this.quantizerCurveCompression, h264VideoConfiguration.quantizerCurveCompression) &&
        Objects.equals(this.psyRateDistortionOptimization, h264VideoConfiguration.psyRateDistortionOptimization) &&
        Objects.equals(this.psyTrellis, h264VideoConfiguration.psyTrellis) &&
        Objects.equals(this.autoLevelSetup, h264VideoConfiguration.autoLevelSetup) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presetConfiguration, dynamicRangeFormat, crf, profile, bframes, refFrames, qpMin, qpMax, mvPredictionMode, mvSearchRangeMax, cabac, maxBitrate, minBitrate, bufsize, minGop, maxGop, openGop, minKeyframeInterval, maxKeyframeInterval, level, bAdaptiveStrategy, motionEstimationMethod, rcLookahead, subMe, trellis, partitions, slices, interlaceMode, sceneCutThreshold, nalHrd, bPyramid, cea608708SubtitleConfig, deblockAlpha, deblockBeta, adaptiveQuantizationMode, adaptiveQuantizationStrength, mixedReferences, adaptiveSpatialTransform, fastSkipDetectionPFrames, weightedPredictionBFrames, weightedPredictionPFrames, macroblockTreeRatecontrol, quantizerCurveCompression, psyRateDistortionOptimization, psyTrellis, autoLevelSetup, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class H264VideoConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    presetConfiguration: ").append(toIndentedString(presetConfiguration)).append("\n");
    sb.append("    dynamicRangeFormat: ").append(toIndentedString(dynamicRangeFormat)).append("\n");
    sb.append("    crf: ").append(toIndentedString(crf)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    bframes: ").append(toIndentedString(bframes)).append("\n");
    sb.append("    refFrames: ").append(toIndentedString(refFrames)).append("\n");
    sb.append("    qpMin: ").append(toIndentedString(qpMin)).append("\n");
    sb.append("    qpMax: ").append(toIndentedString(qpMax)).append("\n");
    sb.append("    mvPredictionMode: ").append(toIndentedString(mvPredictionMode)).append("\n");
    sb.append("    mvSearchRangeMax: ").append(toIndentedString(mvSearchRangeMax)).append("\n");
    sb.append("    cabac: ").append(toIndentedString(cabac)).append("\n");
    sb.append("    maxBitrate: ").append(toIndentedString(maxBitrate)).append("\n");
    sb.append("    minBitrate: ").append(toIndentedString(minBitrate)).append("\n");
    sb.append("    bufsize: ").append(toIndentedString(bufsize)).append("\n");
    sb.append("    minGop: ").append(toIndentedString(minGop)).append("\n");
    sb.append("    maxGop: ").append(toIndentedString(maxGop)).append("\n");
    sb.append("    openGop: ").append(toIndentedString(openGop)).append("\n");
    sb.append("    minKeyframeInterval: ").append(toIndentedString(minKeyframeInterval)).append("\n");
    sb.append("    maxKeyframeInterval: ").append(toIndentedString(maxKeyframeInterval)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    bAdaptiveStrategy: ").append(toIndentedString(bAdaptiveStrategy)).append("\n");
    sb.append("    motionEstimationMethod: ").append(toIndentedString(motionEstimationMethod)).append("\n");
    sb.append("    rcLookahead: ").append(toIndentedString(rcLookahead)).append("\n");
    sb.append("    subMe: ").append(toIndentedString(subMe)).append("\n");
    sb.append("    trellis: ").append(toIndentedString(trellis)).append("\n");
    sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
    sb.append("    slices: ").append(toIndentedString(slices)).append("\n");
    sb.append("    interlaceMode: ").append(toIndentedString(interlaceMode)).append("\n");
    sb.append("    sceneCutThreshold: ").append(toIndentedString(sceneCutThreshold)).append("\n");
    sb.append("    nalHrd: ").append(toIndentedString(nalHrd)).append("\n");
    sb.append("    bPyramid: ").append(toIndentedString(bPyramid)).append("\n");
    sb.append("    cea608708SubtitleConfig: ").append(toIndentedString(cea608708SubtitleConfig)).append("\n");
    sb.append("    deblockAlpha: ").append(toIndentedString(deblockAlpha)).append("\n");
    sb.append("    deblockBeta: ").append(toIndentedString(deblockBeta)).append("\n");
    sb.append("    adaptiveQuantizationMode: ").append(toIndentedString(adaptiveQuantizationMode)).append("\n");
    sb.append("    adaptiveQuantizationStrength: ").append(toIndentedString(adaptiveQuantizationStrength)).append("\n");
    sb.append("    mixedReferences: ").append(toIndentedString(mixedReferences)).append("\n");
    sb.append("    adaptiveSpatialTransform: ").append(toIndentedString(adaptiveSpatialTransform)).append("\n");
    sb.append("    fastSkipDetectionPFrames: ").append(toIndentedString(fastSkipDetectionPFrames)).append("\n");
    sb.append("    weightedPredictionBFrames: ").append(toIndentedString(weightedPredictionBFrames)).append("\n");
    sb.append("    weightedPredictionPFrames: ").append(toIndentedString(weightedPredictionPFrames)).append("\n");
    sb.append("    macroblockTreeRatecontrol: ").append(toIndentedString(macroblockTreeRatecontrol)).append("\n");
    sb.append("    quantizerCurveCompression: ").append(toIndentedString(quantizerCurveCompression)).append("\n");
    sb.append("    psyRateDistortionOptimization: ").append(toIndentedString(psyRateDistortionOptimization)).append("\n");
    sb.append("    psyTrellis: ").append(toIndentedString(psyTrellis)).append("\n");
    sb.append("    autoLevelSetup: ").append(toIndentedString(autoLevelSetup)).append("\n");
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

