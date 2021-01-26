package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsVideoStartFailedReason;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsImpressionSample
 */

public class AnalyticsImpressionSample {
  @JsonProperty("ad")
  private Long ad;

  @JsonProperty("analytics_version")
  private String analyticsVersion;

  @JsonProperty("audio_bitrate")
  private Long audioBitrate;

  @JsonProperty("audio_codec")
  private String audioCodec;

  @JsonProperty("audio_language")
  private String audioLanguage;

  @JsonProperty("autoplay")
  private Boolean autoplay;

  @JsonProperty("browser")
  private String browser;

  @JsonProperty("browser_version_major")
  private String browserVersionMajor;

  @JsonProperty("browser_version_minor")
  private String browserVersionMinor;

  @JsonProperty("buffered")
  private Long buffered;

  @JsonProperty("cdn_provider")
  private String cdnProvider;

  @JsonProperty("city")
  private String city;

  @JsonProperty("client_time")
  private Long clientTime;

  @JsonProperty("country")
  private String country;

  @JsonProperty("custom_user_id")
  private String customUserId;

  @JsonProperty("custom_data_1")
  private String customData1;

  @JsonProperty("custom_data_2")
  private String customData2;

  @JsonProperty("custom_data_3")
  private String customData3;

  @JsonProperty("custom_data_4")
  private String customData4;

  @JsonProperty("custom_data_5")
  private String customData5;

  @JsonProperty("custom_data_6")
  private String customData6;

  @JsonProperty("custom_data_7")
  private String customData7;

  @JsonProperty("device_class")
  private String deviceClass;

  @JsonProperty("device_type")
  private String deviceType;

  @JsonProperty("domain")
  private String domain;

  @JsonProperty("drm_load_time")
  private Long drmLoadTime;

  @JsonProperty("drm_type")
  private String drmType;

  @JsonProperty("dropped_frames")
  private Long droppedFrames;

  @JsonProperty("duration")
  private Long duration;

  @JsonProperty("error_code")
  private Integer errorCode;

  @JsonProperty("error_message")
  private String errorMessage;

  @JsonProperty("experiment_name")
  private String experimentName;

  @JsonProperty("impression_id")
  private String impressionId;

  @JsonProperty("ip_address")
  private String ipAddress;

  @JsonProperty("is_casting")
  private Boolean isCasting;

  @JsonProperty("is_live")
  private Boolean isLive;

  @JsonProperty("is_muted")
  private Boolean isMuted;

  @JsonProperty("isp")
  private String isp;

  @JsonProperty("language")
  private String language;

  @JsonProperty("license_key")
  private String licenseKey;

  @JsonProperty("m3u8_url")
  private String m3u8Url;

  @JsonProperty("mpd_url")
  private String mpdUrl;

  @JsonProperty("operatingsystem")
  private String operatingsystem;

  @JsonProperty("operatingsystem_version_major")
  private String operatingsystemVersionMajor;

  @JsonProperty("operatingsystem_version_minor")
  private String operatingsystemVersionMinor;

  @JsonProperty("page_load_time")
  private Integer pageLoadTime;

  @JsonProperty("page_load_type")
  private Integer pageLoadType;

  @JsonProperty("path")
  private String path;

  @JsonProperty("paused")
  private Long paused;

  @JsonProperty("platform")
  private String platform;

  @JsonProperty("played")
  private Long played;

  @JsonProperty("player")
  private String player;

  @JsonProperty("player_key")
  private String playerKey;

  @JsonProperty("player_startuptime")
  private Integer playerStartuptime;

  @JsonProperty("player_tech")
  private String playerTech;

  @JsonProperty("player_version")
  private String playerVersion;

  @JsonProperty("prog_url")
  private String progUrl;

  @JsonProperty("region")
  private String region;

  @JsonProperty("screen_height")
  private Integer screenHeight;

  @JsonProperty("screen_width")
  private Integer screenWidth;

  @JsonProperty("seeked")
  private Long seeked;

  @JsonProperty("segment_download_count")
  private Integer segmentDownloadCount;

  @JsonProperty("segment_download_size")
  private Integer segmentDownloadSize;

  @JsonProperty("segment_download_time")
  private Integer segmentDownloadTime;

  @JsonProperty("sequence_number")
  private Long sequenceNumber;

  @JsonProperty("size")
  private String size;

  @JsonProperty("startuptime")
  private Integer startuptime;

  @JsonProperty("state")
  private String state;

  @JsonProperty("stream_format")
  private String streamFormat;

  @JsonProperty("subtitle_enabled")
  private Boolean subtitleEnabled;

  @JsonProperty("subtitle_language")
  private String subtitleLanguage;

  @JsonProperty("supported_video_codes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> supportedVideoCodes = new ArrayList<String>();

  @JsonProperty("time")
  private Long time;

  @JsonProperty("user_id")
  private String userId;

  @JsonProperty("video_bitrate")
  private Long videoBitrate;

  @JsonProperty("video_codec")
  private String videoCodec;

  @JsonProperty("video_duration")
  private Long videoDuration;

  @JsonProperty("video_id")
  private String videoId;

  @JsonProperty("video_title")
  private String videoTitle;

  @JsonProperty("video_playback_height")
  private Integer videoPlaybackHeight;

  @JsonProperty("video_playback_width")
  private Integer videoPlaybackWidth;

  @JsonProperty("video_startuptime")
  private Long videoStartuptime;

  @JsonProperty("videotime_end")
  private Long videotimeEnd;

  @JsonProperty("videotime_start")
  private Long videotimeStart;

  @JsonProperty("video_window_height")
  private Integer videoWindowHeight;

  @JsonProperty("video_window_width")
  private Integer videoWindowWidth;

  @JsonProperty("videostart_failed")
  private Boolean videostartFailed;

  @JsonProperty("videostart_failed_reason")
  private AnalyticsVideoStartFailedReason videostartFailedReason;


  /**
   * Is an ad playing. 0 indicates no, 1 indicates yes
   * @return ad
   */
  public Long getAd() {
    return ad;
  }

  /**
   * Is an ad playing. 0 indicates no, 1 indicates yes
   *
   * @param ad
   *        Is an ad playing. 0 indicates no, 1 indicates yes
   */
  public void setAd(Long ad) {
    this.ad = ad;
  }


  /**
   * Collector version
   * @return analyticsVersion
   */
  public String getAnalyticsVersion() {
    return analyticsVersion;
  }

  /**
   * Collector version
   *
   * @param analyticsVersion
   *        Collector version
   */
  public void setAnalyticsVersion(String analyticsVersion) {
    this.analyticsVersion = analyticsVersion;
  }


  /**
   * Audio Bitrate
   * @return audioBitrate
   */
  public Long getAudioBitrate() {
    return audioBitrate;
  }

  /**
   * Audio Bitrate
   *
   * @param audioBitrate
   *        Audio Bitrate
   */
  public void setAudioBitrate(Long audioBitrate) {
    this.audioBitrate = audioBitrate;
  }


  /**
   * Audio codec of currently playing stream
   * @return audioCodec
   */
  public String getAudioCodec() {
    return audioCodec;
  }

  /**
   * Audio codec of currently playing stream
   *
   * @param audioCodec
   *        Audio codec of currently playing stream
   */
  public void setAudioCodec(String audioCodec) {
    this.audioCodec = audioCodec;
  }


  /**
   * Selected audio language
   * @return audioLanguage
   */
  public String getAudioLanguage() {
    return audioLanguage;
  }

  /**
   * Selected audio language
   *
   * @param audioLanguage
   *        Selected audio language
   */
  public void setAudioLanguage(String audioLanguage) {
    this.audioLanguage = audioLanguage;
  }


  /**
   * Autoplay enabled
   * @return autoplay
   */
  public Boolean getAutoplay() {
    return autoplay;
  }

  /**
   * Autoplay enabled
   *
   * @param autoplay
   *        Autoplay enabled
   */
  public void setAutoplay(Boolean autoplay) {
    this.autoplay = autoplay;
  }


  /**
   * Browser name
   * @return browser
   */
  public String getBrowser() {
    return browser;
  }

  /**
   * Browser name
   *
   * @param browser
   *        Browser name
   */
  public void setBrowser(String browser) {
    this.browser = browser;
  }


  /**
   * Browser version major
   * @return browserVersionMajor
   */
  public String getBrowserVersionMajor() {
    return browserVersionMajor;
  }

  /**
   * Browser version major
   *
   * @param browserVersionMajor
   *        Browser version major
   */
  public void setBrowserVersionMajor(String browserVersionMajor) {
    this.browserVersionMajor = browserVersionMajor;
  }


  /**
   * Browser version minor
   * @return browserVersionMinor
   */
  public String getBrowserVersionMinor() {
    return browserVersionMinor;
  }

  /**
   * Browser version minor
   *
   * @param browserVersionMinor
   *        Browser version minor
   */
  public void setBrowserVersionMinor(String browserVersionMinor) {
    this.browserVersionMinor = browserVersionMinor;
  }


  /**
   * Milliseconds the player buffered
   * @return buffered
   */
  public Long getBuffered() {
    return buffered;
  }

  /**
   * Milliseconds the player buffered
   *
   * @param buffered
   *        Milliseconds the player buffered
   */
  public void setBuffered(Long buffered) {
    this.buffered = buffered;
  }


  /**
   * CDN Provider
   * @return cdnProvider
   */
  public String getCdnProvider() {
    return cdnProvider;
  }

  /**
   * CDN Provider
   *
   * @param cdnProvider
   *        CDN Provider
   */
  public void setCdnProvider(String cdnProvider) {
    this.cdnProvider = cdnProvider;
  }


  /**
   * City
   * @return city
   */
  public String getCity() {
    return city;
  }

  /**
   * City
   *
   * @param city
   *        City
   */
  public void setCity(String city) {
    this.city = city;
  }


  /**
   * Current time of the client
   * @return clientTime
   */
  public Long getClientTime() {
    return clientTime;
  }

  /**
   * Current time of the client
   *
   * @param clientTime
   *        Current time of the client
   */
  public void setClientTime(Long clientTime) {
    this.clientTime = clientTime;
  }


  /**
   * Country
   * @return country
   */
  public String getCountry() {
    return country;
  }

  /**
   * Country
   *
   * @param country
   *        Country
   */
  public void setCountry(String country) {
    this.country = country;
  }


  /**
   * Custom user ID
   * @return customUserId
   */
  public String getCustomUserId() {
    return customUserId;
  }

  /**
   * Custom user ID
   *
   * @param customUserId
   *        Custom user ID
   */
  public void setCustomUserId(String customUserId) {
    this.customUserId = customUserId;
  }


  /**
   * Free form data set via the customData1 field in the analytics collector configuration
   * @return customData1
   */
  public String getCustomData1() {
    return customData1;
  }

  /**
   * Free form data set via the customData1 field in the analytics collector configuration
   *
   * @param customData1
   *        Free form data set via the customData1 field in the analytics collector configuration
   */
  public void setCustomData1(String customData1) {
    this.customData1 = customData1;
  }


  /**
   * Free form data set via the customData2 field in the analytics collector configuration
   * @return customData2
   */
  public String getCustomData2() {
    return customData2;
  }

  /**
   * Free form data set via the customData2 field in the analytics collector configuration
   *
   * @param customData2
   *        Free form data set via the customData2 field in the analytics collector configuration
   */
  public void setCustomData2(String customData2) {
    this.customData2 = customData2;
  }


  /**
   * Free form data set via the customData3 field in the analytics collector configuration
   * @return customData3
   */
  public String getCustomData3() {
    return customData3;
  }

  /**
   * Free form data set via the customData3 field in the analytics collector configuration
   *
   * @param customData3
   *        Free form data set via the customData3 field in the analytics collector configuration
   */
  public void setCustomData3(String customData3) {
    this.customData3 = customData3;
  }


  /**
   * Free form data set via the customData4 field in the analytics collector configuration
   * @return customData4
   */
  public String getCustomData4() {
    return customData4;
  }

  /**
   * Free form data set via the customData4 field in the analytics collector configuration
   *
   * @param customData4
   *        Free form data set via the customData4 field in the analytics collector configuration
   */
  public void setCustomData4(String customData4) {
    this.customData4 = customData4;
  }


  /**
   * Free form data set via the customData5 field in the analytics collector configuration
   * @return customData5
   */
  public String getCustomData5() {
    return customData5;
  }

  /**
   * Free form data set via the customData5 field in the analytics collector configuration
   *
   * @param customData5
   *        Free form data set via the customData5 field in the analytics collector configuration
   */
  public void setCustomData5(String customData5) {
    this.customData5 = customData5;
  }


  /**
   * Free form data set via the customData6 field in the analytics collector configuration
   * @return customData6
   */
  public String getCustomData6() {
    return customData6;
  }

  /**
   * Free form data set via the customData6 field in the analytics collector configuration
   *
   * @param customData6
   *        Free form data set via the customData6 field in the analytics collector configuration
   */
  public void setCustomData6(String customData6) {
    this.customData6 = customData6;
  }


  /**
   * Free form data set via the customData7 field in the analytics collector configuration
   * @return customData7
   */
  public String getCustomData7() {
    return customData7;
  }

  /**
   * Free form data set via the customData7 field in the analytics collector configuration
   *
   * @param customData7
   *        Free form data set via the customData7 field in the analytics collector configuration
   */
  public void setCustomData7(String customData7) {
    this.customData7 = customData7;
  }


  /**
   * Type of device (Desktop, Phone, Tablet)
   * @return deviceClass
   */
  public String getDeviceClass() {
    return deviceClass;
  }

  /**
   * Type of device (Desktop, Phone, Tablet)
   *
   * @param deviceClass
   *        Type of device (Desktop, Phone, Tablet)
   */
  public void setDeviceClass(String deviceClass) {
    this.deviceClass = deviceClass;
  }


  /**
   * Type of the device detected via User Agent
   * @return deviceType
   */
  public String getDeviceType() {
    return deviceType;
  }

  /**
   * Type of the device detected via User Agent
   *
   * @param deviceType
   *        Type of the device detected via User Agent
   */
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }


  /**
   * Domain the player was loaded on (.www is stripped away)
   * @return domain
   */
  public String getDomain() {
    return domain;
  }

  /**
   * Domain the player was loaded on (.www is stripped away)
   *
   * @param domain
   *        Domain the player was loaded on (.www is stripped away)
   */
  public void setDomain(String domain) {
    this.domain = domain;
  }


  /**
   * Time in milliseconds it took the DRM server to respond
   * @return drmLoadTime
   */
  public Long getDrmLoadTime() {
    return drmLoadTime;
  }

  /**
   * Time in milliseconds it took the DRM server to respond
   *
   * @param drmLoadTime
   *        Time in milliseconds it took the DRM server to respond
   */
  public void setDrmLoadTime(Long drmLoadTime) {
    this.drmLoadTime = drmLoadTime;
  }


  /**
   * DRM system used for this impression
   * @return drmType
   */
  public String getDrmType() {
    return drmType;
  }

  /**
   * DRM system used for this impression
   *
   * @param drmType
   *        DRM system used for this impression
   */
  public void setDrmType(String drmType) {
    this.drmType = drmType;
  }


  /**
   * Dropped frames during playback
   * @return droppedFrames
   */
  public Long getDroppedFrames() {
    return droppedFrames;
  }

  /**
   * Dropped frames during playback
   *
   * @param droppedFrames
   *        Dropped frames during playback
   */
  public void setDroppedFrames(Long droppedFrames) {
    this.droppedFrames = droppedFrames;
  }


  /**
   * Duration of the sample in milliseconds
   * @return duration
   */
  public Long getDuration() {
    return duration;
  }

  /**
   * Duration of the sample in milliseconds
   *
   * @param duration
   *        Duration of the sample in milliseconds
   */
  public void setDuration(Long duration) {
    this.duration = duration;
  }


  /**
   * Error code
   * @return errorCode
   */
  public Integer getErrorCode() {
    return errorCode;
  }

  /**
   * Error code
   *
   * @param errorCode
   *        Error code
   */
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * Error message
   * @return errorMessage
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Error message
   *
   * @param errorMessage
   *        Error message
   */
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  /**
   * A/B test experiment name
   * @return experimentName
   */
  public String getExperimentName() {
    return experimentName;
  }

  /**
   * A/B test experiment name
   *
   * @param experimentName
   *        A/B test experiment name
   */
  public void setExperimentName(String experimentName) {
    this.experimentName = experimentName;
  }


  /**
   * Random UUID that is used to identify a sessions (required)
   * @return impressionId
   */
  public String getImpressionId() {
    return impressionId;
  }

  /**
   * Random UUID that is used to identify a sessions (required)
   *
   * @param impressionId
   *        Random UUID that is used to identify a sessions (required)
   */
  public void setImpressionId(String impressionId) {
    this.impressionId = impressionId;
  }


  /**
   * IP Address of the client
   * @return ipAddress
   */
  public String getIpAddress() {
    return ipAddress;
  }

  /**
   * IP Address of the client
   *
   * @param ipAddress
   *        IP Address of the client
   */
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  /**
   * Is chromecast active
   * @return isCasting
   */
  public Boolean getIsCasting() {
    return isCasting;
  }

  /**
   * Is chromecast active
   *
   * @param isCasting
   *        Is chromecast active
   */
  public void setIsCasting(Boolean isCasting) {
    this.isCasting = isCasting;
  }


  /**
   * Is the stream live or VoD
   * @return isLive
   */
  public Boolean getIsLive() {
    return isLive;
  }

  /**
   * Is the stream live or VoD
   *
   * @param isLive
   *        Is the stream live or VoD
   */
  public void setIsLive(Boolean isLive) {
    this.isLive = isLive;
  }


  /**
   * Is the player muted
   * @return isMuted
   */
  public Boolean getIsMuted() {
    return isMuted;
  }

  /**
   * Is the player muted
   *
   * @param isMuted
   *        Is the player muted
   */
  public void setIsMuted(Boolean isMuted) {
    this.isMuted = isMuted;
  }


  /**
   * The users Internet Service Provider inferred via the IP address
   * @return isp
   */
  public String getIsp() {
    return isp;
  }

  /**
   * The users Internet Service Provider inferred via the IP address
   *
   * @param isp
   *        The users Internet Service Provider inferred via the IP address
   */
  public void setIsp(String isp) {
    this.isp = isp;
  }


  /**
   * Language set in the browser
   * @return language
   */
  public String getLanguage() {
    return language;
  }

  /**
   * Language set in the browser
   *
   * @param language
   *        Language set in the browser
   */
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Analytics license key
   * @return licenseKey
   */
  public String getLicenseKey() {
    return licenseKey;
  }

  /**
   * Analytics license key
   *
   * @param licenseKey
   *        Analytics license key
   */
  public void setLicenseKey(String licenseKey) {
    this.licenseKey = licenseKey;
  }


  /**
   * URL of the HLS source
   * @return m3u8Url
   */
  public String getM3u8Url() {
    return m3u8Url;
  }

  /**
   * URL of the HLS source
   *
   * @param m3u8Url
   *        URL of the HLS source
   */
  public void setM3u8Url(String m3u8Url) {
    this.m3u8Url = m3u8Url;
  }


  /**
   * URL of the DASH source
   * @return mpdUrl
   */
  public String getMpdUrl() {
    return mpdUrl;
  }

  /**
   * URL of the DASH source
   *
   * @param mpdUrl
   *        URL of the DASH source
   */
  public void setMpdUrl(String mpdUrl) {
    this.mpdUrl = mpdUrl;
  }


  /**
   * Operating system
   * @return operatingsystem
   */
  public String getOperatingsystem() {
    return operatingsystem;
  }

  /**
   * Operating system
   *
   * @param operatingsystem
   *        Operating system
   */
  public void setOperatingsystem(String operatingsystem) {
    this.operatingsystem = operatingsystem;
  }


  /**
   * Operating system version major
   * @return operatingsystemVersionMajor
   */
  public String getOperatingsystemVersionMajor() {
    return operatingsystemVersionMajor;
  }

  /**
   * Operating system version major
   *
   * @param operatingsystemVersionMajor
   *        Operating system version major
   */
  public void setOperatingsystemVersionMajor(String operatingsystemVersionMajor) {
    this.operatingsystemVersionMajor = operatingsystemVersionMajor;
  }


  /**
   * Operating system version minor
   * @return operatingsystemVersionMinor
   */
  public String getOperatingsystemVersionMinor() {
    return operatingsystemVersionMinor;
  }

  /**
   * Operating system version minor
   *
   * @param operatingsystemVersionMinor
   *        Operating system version minor
   */
  public void setOperatingsystemVersionMinor(String operatingsystemVersionMinor) {
    this.operatingsystemVersionMinor = operatingsystemVersionMinor;
  }


  /**
   * Time in milliseconds the page took to load
   * @return pageLoadTime
   */
  public Integer getPageLoadTime() {
    return pageLoadTime;
  }

  /**
   * Time in milliseconds the page took to load
   *
   * @param pageLoadTime
   *        Time in milliseconds the page took to load
   */
  public void setPageLoadTime(Integer pageLoadTime) {
    this.pageLoadTime = pageLoadTime;
  }


  /**
   * Player load type. 1 &#x3D; Foreground, 2 &#x3D; Background
   * @return pageLoadType
   */
  public Integer getPageLoadType() {
    return pageLoadType;
  }

  /**
   * Player load type. 1 &#x3D; Foreground, 2 &#x3D; Background
   *
   * @param pageLoadType
   *        Player load type. 1 &#x3D; Foreground, 2 &#x3D; Background
   */
  public void setPageLoadType(Integer pageLoadType) {
    this.pageLoadType = pageLoadType;
  }


  /**
   * path on the website
   * @return path
   */
  public String getPath() {
    return path;
  }

  /**
   * path on the website
   *
   * @param path
   *        path on the website
   */
  public void setPath(String path) {
    this.path = path;
  }


  /**
   * Milliseconds the player was paused
   * @return paused
   */
  public Long getPaused() {
    return paused;
  }

  /**
   * Milliseconds the player was paused
   *
   * @param paused
   *        Milliseconds the player was paused
   */
  public void setPaused(Long paused) {
    this.paused = paused;
  }


  /**
   * Platform the player is running on (web, android, ios)
   * @return platform
   */
  public String getPlatform() {
    return platform;
  }

  /**
   * Platform the player is running on (web, android, ios)
   *
   * @param platform
   *        Platform the player is running on (web, android, ios)
   */
  public void setPlatform(String platform) {
    this.platform = platform;
  }


  /**
   * Milliseconds the player played
   * @return played
   */
  public Long getPlayed() {
    return played;
  }

  /**
   * Milliseconds the player played
   *
   * @param played
   *        Milliseconds the player played
   */
  public void setPlayed(Long played) {
    this.played = played;
  }


  /**
   * Video player being used for this session
   * @return player
   */
  public String getPlayer() {
    return player;
  }

  /**
   * Video player being used for this session
   *
   * @param player
   *        Video player being used for this session
   */
  public void setPlayer(String player) {
    this.player = player;
  }


  /**
   * Player license key
   * @return playerKey
   */
  public String getPlayerKey() {
    return playerKey;
  }

  /**
   * Player license key
   *
   * @param playerKey
   *        Player license key
   */
  public void setPlayerKey(String playerKey) {
    this.playerKey = playerKey;
  }


  /**
   * Time in milliseconds the player took to start up
   * @return playerStartuptime
   */
  public Integer getPlayerStartuptime() {
    return playerStartuptime;
  }

  /**
   * Time in milliseconds the player took to start up
   *
   * @param playerStartuptime
   *        Time in milliseconds the player took to start up
   */
  public void setPlayerStartuptime(Integer playerStartuptime) {
    this.playerStartuptime = playerStartuptime;
  }


  /**
   * HTML or native playback
   * @return playerTech
   */
  public String getPlayerTech() {
    return playerTech;
  }

  /**
   * HTML or native playback
   *
   * @param playerTech
   *        HTML or native playback
   */
  public void setPlayerTech(String playerTech) {
    this.playerTech = playerTech;
  }


  /**
   * Player software version
   * @return playerVersion
   */
  public String getPlayerVersion() {
    return playerVersion;
  }

  /**
   * Player software version
   *
   * @param playerVersion
   *        Player software version
   */
  public void setPlayerVersion(String playerVersion) {
    this.playerVersion = playerVersion;
  }


  /**
   * URL of the progressive MP4 source
   * @return progUrl
   */
  public String getProgUrl() {
    return progUrl;
  }

  /**
   * URL of the progressive MP4 source
   *
   * @param progUrl
   *        URL of the progressive MP4 source
   */
  public void setProgUrl(String progUrl) {
    this.progUrl = progUrl;
  }


  /**
   * Geographic region (ISO 3166-2 code)
   * @return region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Geographic region (ISO 3166-2 code)
   *
   * @param region
   *        Geographic region (ISO 3166-2 code)
   */
  public void setRegion(String region) {
    this.region = region;
  }


  /**
   * Screen as reported by the browser
   * @return screenHeight
   */
  public Integer getScreenHeight() {
    return screenHeight;
  }

  /**
   * Screen as reported by the browser
   *
   * @param screenHeight
   *        Screen as reported by the browser
   */
  public void setScreenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
  }


  /**
   * Screen as reported by the browser
   * @return screenWidth
   */
  public Integer getScreenWidth() {
    return screenWidth;
  }

  /**
   * Screen as reported by the browser
   *
   * @param screenWidth
   *        Screen as reported by the browser
   */
  public void setScreenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
  }


  /**
   * Milliseconds it took the player to seek
   * @return seeked
   */
  public Long getSeeked() {
    return seeked;
  }

  /**
   * Milliseconds it took the player to seek
   *
   * @param seeked
   *        Milliseconds it took the player to seek
   */
  public void setSeeked(Long seeked) {
    this.seeked = seeked;
  }


  /**
   * Number of video segments downloaded
   * @return segmentDownloadCount
   */
  public Integer getSegmentDownloadCount() {
    return segmentDownloadCount;
  }

  /**
   * Number of video segments downloaded
   *
   * @param segmentDownloadCount
   *        Number of video segments downloaded
   */
  public void setSegmentDownloadCount(Integer segmentDownloadCount) {
    this.segmentDownloadCount = segmentDownloadCount;
  }


  /**
   * Size of downloaded video segments (byte)
   * @return segmentDownloadSize
   */
  public Integer getSegmentDownloadSize() {
    return segmentDownloadSize;
  }

  /**
   * Size of downloaded video segments (byte)
   *
   * @param segmentDownloadSize
   *        Size of downloaded video segments (byte)
   */
  public void setSegmentDownloadSize(Integer segmentDownloadSize) {
    this.segmentDownloadSize = segmentDownloadSize;
  }


  /**
   * Cumulative time needed to download video segments
   * @return segmentDownloadTime
   */
  public Integer getSegmentDownloadTime() {
    return segmentDownloadTime;
  }

  /**
   * Cumulative time needed to download video segments
   *
   * @param segmentDownloadTime
   *        Cumulative time needed to download video segments
   */
  public void setSegmentDownloadTime(Integer segmentDownloadTime) {
    this.segmentDownloadTime = segmentDownloadTime;
  }


  /**
   * Sequence number of the sample in which it occured in the session
   * @return sequenceNumber
   */
  public Long getSequenceNumber() {
    return sequenceNumber;
  }

  /**
   * Sequence number of the sample in which it occured in the session
   *
   * @param sequenceNumber
   *        Sequence number of the sample in which it occured in the session
   */
  public void setSequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  /**
   * Video size (FULLSCREEN or WINDOW)
   * @return size
   */
  public String getSize() {
    return size;
  }

  /**
   * Video size (FULLSCREEN or WINDOW)
   *
   * @param size
   *        Video size (FULLSCREEN or WINDOW)
   */
  public void setSize(String size) {
    this.size = size;
  }


  /**
   * Combination of player- and videoStartuptime
   * @return startuptime
   */
  public Integer getStartuptime() {
    return startuptime;
  }

  /**
   * Combination of player- and videoStartuptime
   *
   * @param startuptime
   *        Combination of player- and videoStartuptime
   */
  public void setStartuptime(Integer startuptime) {
    this.startuptime = startuptime;
  }


  /**
   * Internal state of the analytics state machine
   * @return state
   */
  public String getState() {
    return state;
  }

  /**
   * Internal state of the analytics state machine
   *
   * @param state
   *        Internal state of the analytics state machine
   */
  public void setState(String state) {
    this.state = state;
  }


  /**
   * Format of the stream (HLS, DASH, Progressive MP4)
   * @return streamFormat
   */
  public String getStreamFormat() {
    return streamFormat;
  }

  /**
   * Format of the stream (HLS, DASH, Progressive MP4)
   *
   * @param streamFormat
   *        Format of the stream (HLS, DASH, Progressive MP4)
   */
  public void setStreamFormat(String streamFormat) {
    this.streamFormat = streamFormat;
  }


  /**
   * Subtitle enabled
   * @return subtitleEnabled
   */
  public Boolean getSubtitleEnabled() {
    return subtitleEnabled;
  }

  /**
   * Subtitle enabled
   *
   * @param subtitleEnabled
   *        Subtitle enabled
   */
  public void setSubtitleEnabled(Boolean subtitleEnabled) {
    this.subtitleEnabled = subtitleEnabled;
  }


  /**
   * Selected subtitle language
   * @return subtitleLanguage
   */
  public String getSubtitleLanguage() {
    return subtitleLanguage;
  }

  /**
   * Selected subtitle language
   *
   * @param subtitleLanguage
   *        Selected subtitle language
   */
  public void setSubtitleLanguage(String subtitleLanguage) {
    this.subtitleLanguage = subtitleLanguage;
  }


  public AnalyticsImpressionSample addSupportedVideoCodesItem(String supportedVideoCodesItem) {
    this.supportedVideoCodes.add(supportedVideoCodesItem);
    return this;
  }

  /**
   * Video codecs supported by platform/browser
   * @return supportedVideoCodes
   */
  public List<String> getSupportedVideoCodes() {
    return supportedVideoCodes;
  }

  /**
   * Video codecs supported by platform/browser
   *
   * @param supportedVideoCodes
   *        Video codecs supported by platform/browser
   */
  public void setSupportedVideoCodes(List<String> supportedVideoCodes) {
    this.supportedVideoCodes = supportedVideoCodes;
  }


  /**
   * Current time in milliseconds
   * @return time
   */
  public Long getTime() {
    return time;
  }

  /**
   * Current time in milliseconds
   *
   * @param time
   *        Current time in milliseconds
   */
  public void setTime(Long time) {
    this.time = time;
  }


  /**
   * ID that is persisted across sessions to identify a browser
   * @return userId
   */
  public String getUserId() {
    return userId;
  }

  /**
   * ID that is persisted across sessions to identify a browser
   *
   * @param userId
   *        ID that is persisted across sessions to identify a browser
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * Bitrate of the played back video rendition
   * @return videoBitrate
   */
  public Long getVideoBitrate() {
    return videoBitrate;
  }

  /**
   * Bitrate of the played back video rendition
   *
   * @param videoBitrate
   *        Bitrate of the played back video rendition
   */
  public void setVideoBitrate(Long videoBitrate) {
    this.videoBitrate = videoBitrate;
  }


  /**
   * Video codec of current stream
   * @return videoCodec
   */
  public String getVideoCodec() {
    return videoCodec;
  }

  /**
   * Video codec of current stream
   *
   * @param videoCodec
   *        Video codec of current stream
   */
  public void setVideoCodec(String videoCodec) {
    this.videoCodec = videoCodec;
  }


  /**
   * Length of the video in milliseconds
   * @return videoDuration
   */
  public Long getVideoDuration() {
    return videoDuration;
  }

  /**
   * Length of the video in milliseconds
   *
   * @param videoDuration
   *        Length of the video in milliseconds
   */
  public void setVideoDuration(Long videoDuration) {
    this.videoDuration = videoDuration;
  }


  /**
   * ID of the video as configured via the analytics config
   * @return videoId
   */
  public String getVideoId() {
    return videoId;
  }

  /**
   * ID of the video as configured via the analytics config
   *
   * @param videoId
   *        ID of the video as configured via the analytics config
   */
  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  /**
   * Free form human readable video title as configured in the analytics config
   * @return videoTitle
   */
  public String getVideoTitle() {
    return videoTitle;
  }

  /**
   * Free form human readable video title as configured in the analytics config
   *
   * @param videoTitle
   *        Free form human readable video title as configured in the analytics config
   */
  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }


  /**
   * Resolution of the played back Video Rendition
   * @return videoPlaybackHeight
   */
  public Integer getVideoPlaybackHeight() {
    return videoPlaybackHeight;
  }

  /**
   * Resolution of the played back Video Rendition
   *
   * @param videoPlaybackHeight
   *        Resolution of the played back Video Rendition
   */
  public void setVideoPlaybackHeight(Integer videoPlaybackHeight) {
    this.videoPlaybackHeight = videoPlaybackHeight;
  }


  /**
   * Resolution of the played back Video Rendition
   * @return videoPlaybackWidth
   */
  public Integer getVideoPlaybackWidth() {
    return videoPlaybackWidth;
  }

  /**
   * Resolution of the played back Video Rendition
   *
   * @param videoPlaybackWidth
   *        Resolution of the played back Video Rendition
   */
  public void setVideoPlaybackWidth(Integer videoPlaybackWidth) {
    this.videoPlaybackWidth = videoPlaybackWidth;
  }


  /**
   * Time in milliseconds it took to start video playback
   * @return videoStartuptime
   */
  public Long getVideoStartuptime() {
    return videoStartuptime;
  }

  /**
   * Time in milliseconds it took to start video playback
   *
   * @param videoStartuptime
   *        Time in milliseconds it took to start video playback
   */
  public void setVideoStartuptime(Long videoStartuptime) {
    this.videoStartuptime = videoStartuptime;
  }


  /**
   * End time of the sample in the video (milliseconds)
   * @return videotimeEnd
   */
  public Long getVideotimeEnd() {
    return videotimeEnd;
  }

  /**
   * End time of the sample in the video (milliseconds)
   *
   * @param videotimeEnd
   *        End time of the sample in the video (milliseconds)
   */
  public void setVideotimeEnd(Long videotimeEnd) {
    this.videotimeEnd = videotimeEnd;
  }


  /**
   * Start time of the sample in the video (milliseconds)
   * @return videotimeStart
   */
  public Long getVideotimeStart() {
    return videotimeStart;
  }

  /**
   * Start time of the sample in the video (milliseconds)
   *
   * @param videotimeStart
   *        Start time of the sample in the video (milliseconds)
   */
  public void setVideotimeStart(Long videotimeStart) {
    this.videotimeStart = videotimeStart;
  }


  /**
   * Height of the video player on the page
   * @return videoWindowHeight
   */
  public Integer getVideoWindowHeight() {
    return videoWindowHeight;
  }

  /**
   * Height of the video player on the page
   *
   * @param videoWindowHeight
   *        Height of the video player on the page
   */
  public void setVideoWindowHeight(Integer videoWindowHeight) {
    this.videoWindowHeight = videoWindowHeight;
  }


  /**
   * Width of the video player on the page
   * @return videoWindowWidth
   */
  public Integer getVideoWindowWidth() {
    return videoWindowWidth;
  }

  /**
   * Width of the video player on the page
   *
   * @param videoWindowWidth
   *        Width of the video player on the page
   */
  public void setVideoWindowWidth(Integer videoWindowWidth) {
    this.videoWindowWidth = videoWindowWidth;
  }


  /**
   * True if starting the video failed
   * @return videostartFailed
   */
  public Boolean getVideostartFailed() {
    return videostartFailed;
  }

  /**
   * True if starting the video failed
   *
   * @param videostartFailed
   *        True if starting the video failed
   */
  public void setVideostartFailed(Boolean videostartFailed) {
    this.videostartFailed = videostartFailed;
  }


  /**
   * Get videostartFailedReason
   * @return videostartFailedReason
   */
  public AnalyticsVideoStartFailedReason getVideostartFailedReason() {
    return videostartFailedReason;
  }

  /**
   * Set videostartFailedReason
   *
   * @param videostartFailedReason
   */
  public void setVideostartFailedReason(AnalyticsVideoStartFailedReason videostartFailedReason) {
    this.videostartFailedReason = videostartFailedReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsImpressionSample analyticsImpressionSample = (AnalyticsImpressionSample) o;
    return Objects.equals(this.ad, analyticsImpressionSample.ad) &&
        Objects.equals(this.analyticsVersion, analyticsImpressionSample.analyticsVersion) &&
        Objects.equals(this.audioBitrate, analyticsImpressionSample.audioBitrate) &&
        Objects.equals(this.audioCodec, analyticsImpressionSample.audioCodec) &&
        Objects.equals(this.audioLanguage, analyticsImpressionSample.audioLanguage) &&
        Objects.equals(this.autoplay, analyticsImpressionSample.autoplay) &&
        Objects.equals(this.browser, analyticsImpressionSample.browser) &&
        Objects.equals(this.browserVersionMajor, analyticsImpressionSample.browserVersionMajor) &&
        Objects.equals(this.browserVersionMinor, analyticsImpressionSample.browserVersionMinor) &&
        Objects.equals(this.buffered, analyticsImpressionSample.buffered) &&
        Objects.equals(this.cdnProvider, analyticsImpressionSample.cdnProvider) &&
        Objects.equals(this.city, analyticsImpressionSample.city) &&
        Objects.equals(this.clientTime, analyticsImpressionSample.clientTime) &&
        Objects.equals(this.country, analyticsImpressionSample.country) &&
        Objects.equals(this.customUserId, analyticsImpressionSample.customUserId) &&
        Objects.equals(this.customData1, analyticsImpressionSample.customData1) &&
        Objects.equals(this.customData2, analyticsImpressionSample.customData2) &&
        Objects.equals(this.customData3, analyticsImpressionSample.customData3) &&
        Objects.equals(this.customData4, analyticsImpressionSample.customData4) &&
        Objects.equals(this.customData5, analyticsImpressionSample.customData5) &&
        Objects.equals(this.customData6, analyticsImpressionSample.customData6) &&
        Objects.equals(this.customData7, analyticsImpressionSample.customData7) &&
        Objects.equals(this.deviceClass, analyticsImpressionSample.deviceClass) &&
        Objects.equals(this.deviceType, analyticsImpressionSample.deviceType) &&
        Objects.equals(this.domain, analyticsImpressionSample.domain) &&
        Objects.equals(this.drmLoadTime, analyticsImpressionSample.drmLoadTime) &&
        Objects.equals(this.drmType, analyticsImpressionSample.drmType) &&
        Objects.equals(this.droppedFrames, analyticsImpressionSample.droppedFrames) &&
        Objects.equals(this.duration, analyticsImpressionSample.duration) &&
        Objects.equals(this.errorCode, analyticsImpressionSample.errorCode) &&
        Objects.equals(this.errorMessage, analyticsImpressionSample.errorMessage) &&
        Objects.equals(this.experimentName, analyticsImpressionSample.experimentName) &&
        Objects.equals(this.impressionId, analyticsImpressionSample.impressionId) &&
        Objects.equals(this.ipAddress, analyticsImpressionSample.ipAddress) &&
        Objects.equals(this.isCasting, analyticsImpressionSample.isCasting) &&
        Objects.equals(this.isLive, analyticsImpressionSample.isLive) &&
        Objects.equals(this.isMuted, analyticsImpressionSample.isMuted) &&
        Objects.equals(this.isp, analyticsImpressionSample.isp) &&
        Objects.equals(this.language, analyticsImpressionSample.language) &&
        Objects.equals(this.licenseKey, analyticsImpressionSample.licenseKey) &&
        Objects.equals(this.m3u8Url, analyticsImpressionSample.m3u8Url) &&
        Objects.equals(this.mpdUrl, analyticsImpressionSample.mpdUrl) &&
        Objects.equals(this.operatingsystem, analyticsImpressionSample.operatingsystem) &&
        Objects.equals(this.operatingsystemVersionMajor, analyticsImpressionSample.operatingsystemVersionMajor) &&
        Objects.equals(this.operatingsystemVersionMinor, analyticsImpressionSample.operatingsystemVersionMinor) &&
        Objects.equals(this.pageLoadTime, analyticsImpressionSample.pageLoadTime) &&
        Objects.equals(this.pageLoadType, analyticsImpressionSample.pageLoadType) &&
        Objects.equals(this.path, analyticsImpressionSample.path) &&
        Objects.equals(this.paused, analyticsImpressionSample.paused) &&
        Objects.equals(this.platform, analyticsImpressionSample.platform) &&
        Objects.equals(this.played, analyticsImpressionSample.played) &&
        Objects.equals(this.player, analyticsImpressionSample.player) &&
        Objects.equals(this.playerKey, analyticsImpressionSample.playerKey) &&
        Objects.equals(this.playerStartuptime, analyticsImpressionSample.playerStartuptime) &&
        Objects.equals(this.playerTech, analyticsImpressionSample.playerTech) &&
        Objects.equals(this.playerVersion, analyticsImpressionSample.playerVersion) &&
        Objects.equals(this.progUrl, analyticsImpressionSample.progUrl) &&
        Objects.equals(this.region, analyticsImpressionSample.region) &&
        Objects.equals(this.screenHeight, analyticsImpressionSample.screenHeight) &&
        Objects.equals(this.screenWidth, analyticsImpressionSample.screenWidth) &&
        Objects.equals(this.seeked, analyticsImpressionSample.seeked) &&
        Objects.equals(this.segmentDownloadCount, analyticsImpressionSample.segmentDownloadCount) &&
        Objects.equals(this.segmentDownloadSize, analyticsImpressionSample.segmentDownloadSize) &&
        Objects.equals(this.segmentDownloadTime, analyticsImpressionSample.segmentDownloadTime) &&
        Objects.equals(this.sequenceNumber, analyticsImpressionSample.sequenceNumber) &&
        Objects.equals(this.size, analyticsImpressionSample.size) &&
        Objects.equals(this.startuptime, analyticsImpressionSample.startuptime) &&
        Objects.equals(this.state, analyticsImpressionSample.state) &&
        Objects.equals(this.streamFormat, analyticsImpressionSample.streamFormat) &&
        Objects.equals(this.subtitleEnabled, analyticsImpressionSample.subtitleEnabled) &&
        Objects.equals(this.subtitleLanguage, analyticsImpressionSample.subtitleLanguage) &&
        Objects.equals(this.supportedVideoCodes, analyticsImpressionSample.supportedVideoCodes) &&
        Objects.equals(this.time, analyticsImpressionSample.time) &&
        Objects.equals(this.userId, analyticsImpressionSample.userId) &&
        Objects.equals(this.videoBitrate, analyticsImpressionSample.videoBitrate) &&
        Objects.equals(this.videoCodec, analyticsImpressionSample.videoCodec) &&
        Objects.equals(this.videoDuration, analyticsImpressionSample.videoDuration) &&
        Objects.equals(this.videoId, analyticsImpressionSample.videoId) &&
        Objects.equals(this.videoTitle, analyticsImpressionSample.videoTitle) &&
        Objects.equals(this.videoPlaybackHeight, analyticsImpressionSample.videoPlaybackHeight) &&
        Objects.equals(this.videoPlaybackWidth, analyticsImpressionSample.videoPlaybackWidth) &&
        Objects.equals(this.videoStartuptime, analyticsImpressionSample.videoStartuptime) &&
        Objects.equals(this.videotimeEnd, analyticsImpressionSample.videotimeEnd) &&
        Objects.equals(this.videotimeStart, analyticsImpressionSample.videotimeStart) &&
        Objects.equals(this.videoWindowHeight, analyticsImpressionSample.videoWindowHeight) &&
        Objects.equals(this.videoWindowWidth, analyticsImpressionSample.videoWindowWidth) &&
        Objects.equals(this.videostartFailed, analyticsImpressionSample.videostartFailed) &&
        Objects.equals(this.videostartFailedReason, analyticsImpressionSample.videostartFailedReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ad, analyticsVersion, audioBitrate, audioCodec, audioLanguage, autoplay, browser, browserVersionMajor, browserVersionMinor, buffered, cdnProvider, city, clientTime, country, customUserId, customData1, customData2, customData3, customData4, customData5, customData6, customData7, deviceClass, deviceType, domain, drmLoadTime, drmType, droppedFrames, duration, errorCode, errorMessage, experimentName, impressionId, ipAddress, isCasting, isLive, isMuted, isp, language, licenseKey, m3u8Url, mpdUrl, operatingsystem, operatingsystemVersionMajor, operatingsystemVersionMinor, pageLoadTime, pageLoadType, path, paused, platform, played, player, playerKey, playerStartuptime, playerTech, playerVersion, progUrl, region, screenHeight, screenWidth, seeked, segmentDownloadCount, segmentDownloadSize, segmentDownloadTime, sequenceNumber, size, startuptime, state, streamFormat, subtitleEnabled, subtitleLanguage, supportedVideoCodes, time, userId, videoBitrate, videoCodec, videoDuration, videoId, videoTitle, videoPlaybackHeight, videoPlaybackWidth, videoStartuptime, videotimeEnd, videotimeStart, videoWindowHeight, videoWindowWidth, videostartFailed, videostartFailedReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsImpressionSample {\n");
    
    sb.append("    ad: ").append(toIndentedString(ad)).append("\n");
    sb.append("    analyticsVersion: ").append(toIndentedString(analyticsVersion)).append("\n");
    sb.append("    audioBitrate: ").append(toIndentedString(audioBitrate)).append("\n");
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    audioLanguage: ").append(toIndentedString(audioLanguage)).append("\n");
    sb.append("    autoplay: ").append(toIndentedString(autoplay)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    browserVersionMajor: ").append(toIndentedString(browserVersionMajor)).append("\n");
    sb.append("    browserVersionMinor: ").append(toIndentedString(browserVersionMinor)).append("\n");
    sb.append("    buffered: ").append(toIndentedString(buffered)).append("\n");
    sb.append("    cdnProvider: ").append(toIndentedString(cdnProvider)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    clientTime: ").append(toIndentedString(clientTime)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    customUserId: ").append(toIndentedString(customUserId)).append("\n");
    sb.append("    customData1: ").append(toIndentedString(customData1)).append("\n");
    sb.append("    customData2: ").append(toIndentedString(customData2)).append("\n");
    sb.append("    customData3: ").append(toIndentedString(customData3)).append("\n");
    sb.append("    customData4: ").append(toIndentedString(customData4)).append("\n");
    sb.append("    customData5: ").append(toIndentedString(customData5)).append("\n");
    sb.append("    customData6: ").append(toIndentedString(customData6)).append("\n");
    sb.append("    customData7: ").append(toIndentedString(customData7)).append("\n");
    sb.append("    deviceClass: ").append(toIndentedString(deviceClass)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    drmLoadTime: ").append(toIndentedString(drmLoadTime)).append("\n");
    sb.append("    drmType: ").append(toIndentedString(drmType)).append("\n");
    sb.append("    droppedFrames: ").append(toIndentedString(droppedFrames)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    experimentName: ").append(toIndentedString(experimentName)).append("\n");
    sb.append("    impressionId: ").append(toIndentedString(impressionId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    isCasting: ").append(toIndentedString(isCasting)).append("\n");
    sb.append("    isLive: ").append(toIndentedString(isLive)).append("\n");
    sb.append("    isMuted: ").append(toIndentedString(isMuted)).append("\n");
    sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    licenseKey: ").append(toIndentedString(licenseKey)).append("\n");
    sb.append("    m3u8Url: ").append(toIndentedString(m3u8Url)).append("\n");
    sb.append("    mpdUrl: ").append(toIndentedString(mpdUrl)).append("\n");
    sb.append("    operatingsystem: ").append(toIndentedString(operatingsystem)).append("\n");
    sb.append("    operatingsystemVersionMajor: ").append(toIndentedString(operatingsystemVersionMajor)).append("\n");
    sb.append("    operatingsystemVersionMinor: ").append(toIndentedString(operatingsystemVersionMinor)).append("\n");
    sb.append("    pageLoadTime: ").append(toIndentedString(pageLoadTime)).append("\n");
    sb.append("    pageLoadType: ").append(toIndentedString(pageLoadType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    played: ").append(toIndentedString(played)).append("\n");
    sb.append("    player: ").append(toIndentedString(player)).append("\n");
    sb.append("    playerKey: ").append(toIndentedString(playerKey)).append("\n");
    sb.append("    playerStartuptime: ").append(toIndentedString(playerStartuptime)).append("\n");
    sb.append("    playerTech: ").append(toIndentedString(playerTech)).append("\n");
    sb.append("    playerVersion: ").append(toIndentedString(playerVersion)).append("\n");
    sb.append("    progUrl: ").append(toIndentedString(progUrl)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    seeked: ").append(toIndentedString(seeked)).append("\n");
    sb.append("    segmentDownloadCount: ").append(toIndentedString(segmentDownloadCount)).append("\n");
    sb.append("    segmentDownloadSize: ").append(toIndentedString(segmentDownloadSize)).append("\n");
    sb.append("    segmentDownloadTime: ").append(toIndentedString(segmentDownloadTime)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    startuptime: ").append(toIndentedString(startuptime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    streamFormat: ").append(toIndentedString(streamFormat)).append("\n");
    sb.append("    subtitleEnabled: ").append(toIndentedString(subtitleEnabled)).append("\n");
    sb.append("    subtitleLanguage: ").append(toIndentedString(subtitleLanguage)).append("\n");
    sb.append("    supportedVideoCodes: ").append(toIndentedString(supportedVideoCodes)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    videoBitrate: ").append(toIndentedString(videoBitrate)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
    sb.append("    videoDuration: ").append(toIndentedString(videoDuration)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoTitle: ").append(toIndentedString(videoTitle)).append("\n");
    sb.append("    videoPlaybackHeight: ").append(toIndentedString(videoPlaybackHeight)).append("\n");
    sb.append("    videoPlaybackWidth: ").append(toIndentedString(videoPlaybackWidth)).append("\n");
    sb.append("    videoStartuptime: ").append(toIndentedString(videoStartuptime)).append("\n");
    sb.append("    videotimeEnd: ").append(toIndentedString(videotimeEnd)).append("\n");
    sb.append("    videotimeStart: ").append(toIndentedString(videotimeStart)).append("\n");
    sb.append("    videoWindowHeight: ").append(toIndentedString(videoWindowHeight)).append("\n");
    sb.append("    videoWindowWidth: ").append(toIndentedString(videoWindowWidth)).append("\n");
    sb.append("    videostartFailed: ").append(toIndentedString(videostartFailed)).append("\n");
    sb.append("    videostartFailedReason: ").append(toIndentedString(videostartFailedReason)).append("\n");
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

