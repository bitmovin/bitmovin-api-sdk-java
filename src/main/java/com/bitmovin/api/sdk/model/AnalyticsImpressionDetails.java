package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsImpressionDetails
 */

public class AnalyticsImpressionDetails extends BitmovinResponse {
  @JsonProperty("ad")
  private Long ad;

  @JsonProperty("analyticsVersion")
  private String analyticsVersion;

  @JsonProperty("asn")
  private Long asn;

  @JsonProperty("audioBitrate")
  private Long audioBitrate;

  @JsonProperty("audioLanguage")
  private String audioLanguage;

  @JsonProperty("autoplay")
  private Boolean autoplay;

  @JsonProperty("browser")
  private String browser;

  @JsonProperty("browserVersionMajor")
  private String browserVersionMajor;

  @JsonProperty("browserVersionMinor")
  private String browserVersionMinor;

  @JsonProperty("buffered")
  private Long buffered;

  @JsonProperty("cdnProvider")
  private String cdnProvider;

  @JsonProperty("city")
  private String city;

  @JsonProperty("clientTime")
  private Long clientTime;

  @JsonProperty("country")
  private String country;

  @JsonProperty("customUserId")
  private String customUserId;

  @JsonProperty("customData1")
  private String customData1;

  @JsonProperty("customData2")
  private String customData2;

  @JsonProperty("customData3")
  private String customData3;

  @JsonProperty("customData4")
  private String customData4;

  @JsonProperty("customData5")
  private String customData5;

  @JsonProperty("deviceType")
  private String deviceType;

  @JsonProperty("domain")
  private String domain;

  @JsonProperty("drmLoadTime")
  private Long drmLoadTime;

  @JsonProperty("drmType")
  private String drmType;

  @JsonProperty("droppedFrames")
  private Long droppedFrames;

  @JsonProperty("duration")
  private Long duration;

  @JsonProperty("errorCode")
  private Integer errorCode;

  @JsonProperty("errorMessage")
  private String errorMessage;

  @JsonProperty("experimentName")
  private String experimentName;

  @JsonProperty("impressionId")
  private String impressionId;

  @JsonProperty("ipAddress")
  private String ipAddress;

  @JsonProperty("isCasting")
  private Boolean isCasting;

  @JsonProperty("isLive")
  private Boolean isLive;

  @JsonProperty("isMuted")
  private Boolean isMuted;

  @JsonProperty("isp")
  private String isp;

  @JsonProperty("language")
  private String language;

  @JsonProperty("licenseKey")
  private String licenseKey;

  @JsonProperty("operatingSystem")
  private String operatingSystem;

  @JsonProperty("operatingSystemVersionMajor")
  private String operatingSystemVersionMajor;

  @JsonProperty("operatingSystemVersionMinor")
  private String operatingSystemVersionMinor;

  @JsonProperty("pageLoadTime")
  private Integer pageLoadTime;

  @JsonProperty("pageLoadType")
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

  @JsonProperty("playerKey")
  private String playerKey;

  @JsonProperty("playerStartuptime")
  private Integer playerStartuptime;

  @JsonProperty("playerTech")
  private String playerTech;

  @JsonProperty("playerVersion")
  private String playerVersion;

  @JsonProperty("region")
  private String region;

  @JsonProperty("screenHeight")
  private Integer screenHeight;

  @JsonProperty("screenWidth")
  private Integer screenWidth;

  @JsonProperty("seeked")
  private Long seeked;

  @JsonProperty("sequenceNumber")
  private Long sequenceNumber;

  @JsonProperty("size")
  private String size;

  @JsonProperty("startupTime")
  private Integer startupTime;

  @JsonProperty("state")
  private String state;

  @JsonProperty("streamFormat")
  private String streamFormat;

  @JsonProperty("subtitleEnabled")
  private Boolean subtitleEnabled;

  @JsonProperty("subtitleLanguage")
  private String subtitleLanguage;

  @JsonProperty("time")
  private Long time;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("videoBitrate")
  private Long videoBitrate;

  @JsonProperty("videoDuration")
  private Long videoDuration;

  @JsonProperty("videoId")
  private String videoId;

  @JsonProperty("videoTitle")
  private String videoTitle;

  @JsonProperty("videoPlaybackHeight")
  private Integer videoPlaybackHeight;

  @JsonProperty("videoPlaybackWidth")
  private Integer videoPlaybackWidth;

  @JsonProperty("videoStartupTime")
  private Long videoStartupTime;

  @JsonProperty("videotimeEnd")
  private Long videotimeEnd;

  @JsonProperty("videotimeStart")
  private Long videotimeStart;

  @JsonProperty("videoWindowHeight")
  private Integer videoWindowHeight;

  @JsonProperty("videoWindowWidth")
  private Integer videoWindowWidth;


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
   * Autonomous System Number inferred from the IP address
   * @return asn
   */
  public Long getAsn() {
    return asn;
  }

  /**
   * Autonomous System Number inferred from the IP address
   *
   * @param asn
   *        Autonomous System Number inferred from the IP address
   */
  public void setAsn(Long asn) {
    this.asn = asn;
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
   * Operating system
   * @return operatingSystem
   */
  public String getOperatingSystem() {
    return operatingSystem;
  }

  /**
   * Operating system
   *
   * @param operatingSystem
   *        Operating system
   */
  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }


  /**
   * Operating system version major
   * @return operatingSystemVersionMajor
   */
  public String getOperatingSystemVersionMajor() {
    return operatingSystemVersionMajor;
  }

  /**
   * Operating system version major
   *
   * @param operatingSystemVersionMajor
   *        Operating system version major
   */
  public void setOperatingSystemVersionMajor(String operatingSystemVersionMajor) {
    this.operatingSystemVersionMajor = operatingSystemVersionMajor;
  }


  /**
   * Operating system version minor
   * @return operatingSystemVersionMinor
   */
  public String getOperatingSystemVersionMinor() {
    return operatingSystemVersionMinor;
  }

  /**
   * Operating system version minor
   *
   * @param operatingSystemVersionMinor
   *        Operating system version minor
   */
  public void setOperatingSystemVersionMinor(String operatingSystemVersionMinor) {
    this.operatingSystemVersionMinor = operatingSystemVersionMinor;
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
   * @return startupTime
   */
  public Integer getStartupTime() {
    return startupTime;
  }

  /**
   * Combination of player- and videoStartuptime
   *
   * @param startupTime
   *        Combination of player- and videoStartuptime
   */
  public void setStartupTime(Integer startupTime) {
    this.startupTime = startupTime;
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
   * @return videoStartupTime
   */
  public Long getVideoStartupTime() {
    return videoStartupTime;
  }

  /**
   * Time in milliseconds it took to start video playback
   *
   * @param videoStartupTime
   *        Time in milliseconds it took to start video playback
   */
  public void setVideoStartupTime(Long videoStartupTime) {
    this.videoStartupTime = videoStartupTime;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsImpressionDetails analyticsImpressionDetails = (AnalyticsImpressionDetails) o;
    return Objects.equals(this.ad, analyticsImpressionDetails.ad) &&
        Objects.equals(this.analyticsVersion, analyticsImpressionDetails.analyticsVersion) &&
        Objects.equals(this.asn, analyticsImpressionDetails.asn) &&
        Objects.equals(this.audioBitrate, analyticsImpressionDetails.audioBitrate) &&
        Objects.equals(this.audioLanguage, analyticsImpressionDetails.audioLanguage) &&
        Objects.equals(this.autoplay, analyticsImpressionDetails.autoplay) &&
        Objects.equals(this.browser, analyticsImpressionDetails.browser) &&
        Objects.equals(this.browserVersionMajor, analyticsImpressionDetails.browserVersionMajor) &&
        Objects.equals(this.browserVersionMinor, analyticsImpressionDetails.browserVersionMinor) &&
        Objects.equals(this.buffered, analyticsImpressionDetails.buffered) &&
        Objects.equals(this.cdnProvider, analyticsImpressionDetails.cdnProvider) &&
        Objects.equals(this.city, analyticsImpressionDetails.city) &&
        Objects.equals(this.clientTime, analyticsImpressionDetails.clientTime) &&
        Objects.equals(this.country, analyticsImpressionDetails.country) &&
        Objects.equals(this.customUserId, analyticsImpressionDetails.customUserId) &&
        Objects.equals(this.customData1, analyticsImpressionDetails.customData1) &&
        Objects.equals(this.customData2, analyticsImpressionDetails.customData2) &&
        Objects.equals(this.customData3, analyticsImpressionDetails.customData3) &&
        Objects.equals(this.customData4, analyticsImpressionDetails.customData4) &&
        Objects.equals(this.customData5, analyticsImpressionDetails.customData5) &&
        Objects.equals(this.deviceType, analyticsImpressionDetails.deviceType) &&
        Objects.equals(this.domain, analyticsImpressionDetails.domain) &&
        Objects.equals(this.drmLoadTime, analyticsImpressionDetails.drmLoadTime) &&
        Objects.equals(this.drmType, analyticsImpressionDetails.drmType) &&
        Objects.equals(this.droppedFrames, analyticsImpressionDetails.droppedFrames) &&
        Objects.equals(this.duration, analyticsImpressionDetails.duration) &&
        Objects.equals(this.errorCode, analyticsImpressionDetails.errorCode) &&
        Objects.equals(this.errorMessage, analyticsImpressionDetails.errorMessage) &&
        Objects.equals(this.experimentName, analyticsImpressionDetails.experimentName) &&
        Objects.equals(this.impressionId, analyticsImpressionDetails.impressionId) &&
        Objects.equals(this.ipAddress, analyticsImpressionDetails.ipAddress) &&
        Objects.equals(this.isCasting, analyticsImpressionDetails.isCasting) &&
        Objects.equals(this.isLive, analyticsImpressionDetails.isLive) &&
        Objects.equals(this.isMuted, analyticsImpressionDetails.isMuted) &&
        Objects.equals(this.isp, analyticsImpressionDetails.isp) &&
        Objects.equals(this.language, analyticsImpressionDetails.language) &&
        Objects.equals(this.licenseKey, analyticsImpressionDetails.licenseKey) &&
        Objects.equals(this.operatingSystem, analyticsImpressionDetails.operatingSystem) &&
        Objects.equals(this.operatingSystemVersionMajor, analyticsImpressionDetails.operatingSystemVersionMajor) &&
        Objects.equals(this.operatingSystemVersionMinor, analyticsImpressionDetails.operatingSystemVersionMinor) &&
        Objects.equals(this.pageLoadTime, analyticsImpressionDetails.pageLoadTime) &&
        Objects.equals(this.pageLoadType, analyticsImpressionDetails.pageLoadType) &&
        Objects.equals(this.path, analyticsImpressionDetails.path) &&
        Objects.equals(this.paused, analyticsImpressionDetails.paused) &&
        Objects.equals(this.platform, analyticsImpressionDetails.platform) &&
        Objects.equals(this.played, analyticsImpressionDetails.played) &&
        Objects.equals(this.player, analyticsImpressionDetails.player) &&
        Objects.equals(this.playerKey, analyticsImpressionDetails.playerKey) &&
        Objects.equals(this.playerStartuptime, analyticsImpressionDetails.playerStartuptime) &&
        Objects.equals(this.playerTech, analyticsImpressionDetails.playerTech) &&
        Objects.equals(this.playerVersion, analyticsImpressionDetails.playerVersion) &&
        Objects.equals(this.region, analyticsImpressionDetails.region) &&
        Objects.equals(this.screenHeight, analyticsImpressionDetails.screenHeight) &&
        Objects.equals(this.screenWidth, analyticsImpressionDetails.screenWidth) &&
        Objects.equals(this.seeked, analyticsImpressionDetails.seeked) &&
        Objects.equals(this.sequenceNumber, analyticsImpressionDetails.sequenceNumber) &&
        Objects.equals(this.size, analyticsImpressionDetails.size) &&
        Objects.equals(this.startupTime, analyticsImpressionDetails.startupTime) &&
        Objects.equals(this.state, analyticsImpressionDetails.state) &&
        Objects.equals(this.streamFormat, analyticsImpressionDetails.streamFormat) &&
        Objects.equals(this.subtitleEnabled, analyticsImpressionDetails.subtitleEnabled) &&
        Objects.equals(this.subtitleLanguage, analyticsImpressionDetails.subtitleLanguage) &&
        Objects.equals(this.time, analyticsImpressionDetails.time) &&
        Objects.equals(this.userId, analyticsImpressionDetails.userId) &&
        Objects.equals(this.videoBitrate, analyticsImpressionDetails.videoBitrate) &&
        Objects.equals(this.videoDuration, analyticsImpressionDetails.videoDuration) &&
        Objects.equals(this.videoId, analyticsImpressionDetails.videoId) &&
        Objects.equals(this.videoTitle, analyticsImpressionDetails.videoTitle) &&
        Objects.equals(this.videoPlaybackHeight, analyticsImpressionDetails.videoPlaybackHeight) &&
        Objects.equals(this.videoPlaybackWidth, analyticsImpressionDetails.videoPlaybackWidth) &&
        Objects.equals(this.videoStartupTime, analyticsImpressionDetails.videoStartupTime) &&
        Objects.equals(this.videotimeEnd, analyticsImpressionDetails.videotimeEnd) &&
        Objects.equals(this.videotimeStart, analyticsImpressionDetails.videotimeStart) &&
        Objects.equals(this.videoWindowHeight, analyticsImpressionDetails.videoWindowHeight) &&
        Objects.equals(this.videoWindowWidth, analyticsImpressionDetails.videoWindowWidth) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ad, analyticsVersion, asn, audioBitrate, audioLanguage, autoplay, browser, browserVersionMajor, browserVersionMinor, buffered, cdnProvider, city, clientTime, country, customUserId, customData1, customData2, customData3, customData4, customData5, deviceType, domain, drmLoadTime, drmType, droppedFrames, duration, errorCode, errorMessage, experimentName, impressionId, ipAddress, isCasting, isLive, isMuted, isp, language, licenseKey, operatingSystem, operatingSystemVersionMajor, operatingSystemVersionMinor, pageLoadTime, pageLoadType, path, paused, platform, played, player, playerKey, playerStartuptime, playerTech, playerVersion, region, screenHeight, screenWidth, seeked, sequenceNumber, size, startupTime, state, streamFormat, subtitleEnabled, subtitleLanguage, time, userId, videoBitrate, videoDuration, videoId, videoTitle, videoPlaybackHeight, videoPlaybackWidth, videoStartupTime, videotimeEnd, videotimeStart, videoWindowHeight, videoWindowWidth, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsImpressionDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ad: ").append(toIndentedString(ad)).append("\n");
    sb.append("    analyticsVersion: ").append(toIndentedString(analyticsVersion)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    audioBitrate: ").append(toIndentedString(audioBitrate)).append("\n");
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
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    operatingSystemVersionMajor: ").append(toIndentedString(operatingSystemVersionMajor)).append("\n");
    sb.append("    operatingSystemVersionMinor: ").append(toIndentedString(operatingSystemVersionMinor)).append("\n");
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
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    seeked: ").append(toIndentedString(seeked)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    startupTime: ").append(toIndentedString(startupTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    streamFormat: ").append(toIndentedString(streamFormat)).append("\n");
    sb.append("    subtitleEnabled: ").append(toIndentedString(subtitleEnabled)).append("\n");
    sb.append("    subtitleLanguage: ").append(toIndentedString(subtitleLanguage)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    videoBitrate: ").append(toIndentedString(videoBitrate)).append("\n");
    sb.append("    videoDuration: ").append(toIndentedString(videoDuration)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoTitle: ").append(toIndentedString(videoTitle)).append("\n");
    sb.append("    videoPlaybackHeight: ").append(toIndentedString(videoPlaybackHeight)).append("\n");
    sb.append("    videoPlaybackWidth: ").append(toIndentedString(videoPlaybackWidth)).append("\n");
    sb.append("    videoStartupTime: ").append(toIndentedString(videoStartupTime)).append("\n");
    sb.append("    videotimeEnd: ").append(toIndentedString(videotimeEnd)).append("\n");
    sb.append("    videotimeStart: ").append(toIndentedString(videotimeStart)).append("\n");
    sb.append("    videoWindowHeight: ").append(toIndentedString(videoWindowHeight)).append("\n");
    sb.append("    videoWindowWidth: ").append(toIndentedString(videoWindowWidth)).append("\n");
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

