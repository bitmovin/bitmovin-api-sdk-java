package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsAdsImpressionSample
 */

public class AnalyticsAdsImpressionSample {
  @JsonProperty("ad_clickthrough_url")
  private String adClickthroughUrl;

  @JsonProperty("ad_description")
  private String adDescription;

  @JsonProperty("ad_duration")
  private Long adDuration;

  @JsonProperty("ad_fallback_index")
  private Long adFallbackIndex;

  @JsonProperty("ad_id")
  private String adId;

  @JsonProperty("ad_id_player")
  private String adIdPlayer;

  @JsonProperty("ad_impression_id")
  private String adImpressionId;

  @JsonProperty("ad_is_persistent")
  private Boolean adIsPersistent;

  @JsonProperty("ad_module")
  private String adModule;

  @JsonProperty("ad_module_version")
  private String adModuleVersion;

  @JsonProperty("ad_offset")
  private String adOffset;

  @JsonProperty("ad_playback_height")
  private Long adPlaybackHeight;

  @JsonProperty("ad_playback_width")
  private Long adPlaybackWidth;

  @JsonProperty("ad_pod_position")
  private Long adPodPosition;

  @JsonProperty("ad_position")
  private String adPosition;

  @JsonProperty("ad_preload_offset")
  private Long adPreloadOffset;

  @JsonProperty("ad_replace_content_duration")
  private Long adReplaceContentDuration;

  @JsonProperty("ad_schedule_time")
  private Long adScheduleTime;

  @JsonProperty("ad_skip_after")
  private Long adSkipAfter;

  @JsonProperty("ad_skippable")
  private Boolean adSkippable;

  @JsonProperty("ad_startup_time")
  private Long adStartupTime;

  @JsonProperty("ad_system")
  private String adSystem;

  @JsonProperty("ad_tag_path")
  private String adTagPath;

  @JsonProperty("ad_tag_server")
  private String adTagServer;

  @JsonProperty("ad_tag_type")
  private String adTagType;

  @JsonProperty("ad_tag_url")
  private String adTagUrl;

  @JsonProperty("ad_title")
  private String adTitle;

  @JsonProperty("ad_wrapper_ads_count")
  private Long adWrapperAdsCount;

  @JsonProperty("advertiser_name")
  private String advertiserName;

  @JsonProperty("analytics_version")
  private String analyticsVersion;

  @JsonProperty("api_framework")
  private String apiFramework;

  @JsonProperty("apiorg_id")
  private String apiorgId;

  @JsonProperty("apiuser_id")
  private String apiuserId;

  @JsonProperty("audio_bitrate")
  private Long audioBitrate;

  @JsonProperty("autoplay")
  private Boolean autoplay;

  @JsonProperty("browser")
  private String browser;

  @JsonProperty("browser_is_bot")
  private Boolean browserIsBot;

  @JsonProperty("browser_version_major")
  private String browserVersionMajor;

  @JsonProperty("browser_version_minor")
  private String browserVersionMinor;

  @JsonProperty("cdn_provider")
  private String cdnProvider;

  @JsonProperty("city")
  private String city;

  @JsonProperty("click_percentage")
  private Long clickPercentage;

  @JsonProperty("click_position")
  private Long clickPosition;

  @JsonProperty("clicked")
  private Integer clicked;

  @JsonProperty("client_time")
  private Long clientTime;

  @JsonProperty("close_percentage")
  private Long closePercentage;

  @JsonProperty("close_position")
  private Long closePosition;

  @JsonProperty("closed")
  private Integer closed;

  @JsonProperty("completed")
  private Integer completed;

  @JsonProperty("country")
  private String country;

  @JsonProperty("creative_ad_id")
  private String creativeAdId;

  @JsonProperty("creative_id")
  private String creativeId;

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

  @JsonProperty("custom_user_id")
  private String customUserId;

  @JsonProperty("deal_id")
  private String dealId;

  @JsonProperty("device_class")
  private String deviceClass;

  @JsonProperty("device_type")
  private String deviceType;

  @JsonProperty("domain")
  private String domain;

  @JsonProperty("error_code")
  private Integer errorCode;

  @JsonProperty("error_data")
  private String errorData;

  @JsonProperty("error_message")
  private String errorMessage;

  @JsonProperty("error_percentage")
  private Integer errorPercentage;

  @JsonProperty("error_position")
  private Long errorPosition;

  @JsonProperty("exit_position")
  private Long exitPosition;

  @JsonProperty("experiment_name")
  private String experimentName;

  @JsonProperty("ip_address")
  private String ipAddress;

  @JsonProperty("isp")
  private String isp;

  @JsonProperty("language")
  private String language;

  @JsonProperty("license_key")
  private String licenseKey;

  @JsonProperty("manifest_download_time")
  private Long manifestDownloadTime;

  @JsonProperty("media_path")
  private String mediaPath;

  @JsonProperty("media_server")
  private String mediaServer;

  @JsonProperty("media_url")
  private String mediaUrl;

  @JsonProperty("midpoint")
  private Integer midpoint;

  @JsonProperty("min_suggested_duration")
  private Long minSuggestedDuration;

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

  @JsonProperty("percentage_in_viewport")
  private Long percentageInViewport;

  @JsonProperty("platform")
  private String platform;

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

  @JsonProperty("play_percentage")
  private Integer playPercentage;

  @JsonProperty("quartile_1")
  private Integer quartile1;

  @JsonProperty("quartile_3")
  private Integer quartile3;

  @JsonProperty("region")
  private String region;

  @JsonProperty("screen_height")
  private Integer screenHeight;

  @JsonProperty("screen_width")
  private Integer screenWidth;

  @JsonProperty("size")
  private String size;

  @JsonProperty("skip_percentage")
  private Integer skipPercentage;

  @JsonProperty("skip_position")
  private Long skipPosition;

  @JsonProperty("skipped")
  private Integer skipped;

  @JsonProperty("started")
  private Integer started;

  @JsonProperty("stream_format")
  private String streamFormat;

  @JsonProperty("survey_url")
  private String surveyUrl;

  @JsonProperty("time")
  private Long time;

  @JsonProperty("time_from_content")
  private Long timeFromContent;

  @JsonProperty("time_hovered")
  private Long timeHovered;

  @JsonProperty("time_in_viewport")
  private Long timeInViewport;

  @JsonProperty("time_played")
  private Long timePlayed;

  @JsonProperty("time_to_content")
  private Long timeToContent;

  @JsonProperty("time_to_hover")
  private Long timeToHover;

  @JsonProperty("universal_ad_id_registry")
  private String universalAdIdRegistry;

  @JsonProperty("universal_ad_id_value")
  private String universalAdIdValue;

  @JsonProperty("user_id")
  private String userId;

  @JsonProperty("video_bitrate")
  private Long videoBitrate;

  @JsonProperty("video_id")
  private String videoId;

  @JsonProperty("video_impression_id")
  private String videoImpressionId;

  @JsonProperty("video_title")
  private String videoTitle;

  @JsonProperty("video_window_height")
  private Integer videoWindowHeight;

  @JsonProperty("video_window_width")
  private Integer videoWindowWidth;


  /**
   * Ad click through url
   * @return adClickthroughUrl
   */
  public String getAdClickthroughUrl() {
    return adClickthroughUrl;
  }

  /**
   * Ad click through url
   *
   * @param adClickthroughUrl
   *        Ad click through url
   */
  public void setAdClickthroughUrl(String adClickthroughUrl) {
    this.adClickthroughUrl = adClickthroughUrl;
  }


  /**
   * Ad description
   * @return adDescription
   */
  public String getAdDescription() {
    return adDescription;
  }

  /**
   * Ad description
   *
   * @param adDescription
   *        Ad description
   */
  public void setAdDescription(String adDescription) {
    this.adDescription = adDescription;
  }


  /**
   * Ad duration
   * @return adDuration
   */
  public Long getAdDuration() {
    return adDuration;
  }

  /**
   * Ad duration
   *
   * @param adDuration
   *        Ad duration
   */
  public void setAdDuration(Long adDuration) {
    this.adDuration = adDuration;
  }


  /**
   * Ad fallback index
   * @return adFallbackIndex
   */
  public Long getAdFallbackIndex() {
    return adFallbackIndex;
  }

  /**
   * Ad fallback index
   *
   * @param adFallbackIndex
   *        Ad fallback index
   */
  public void setAdFallbackIndex(Long adFallbackIndex) {
    this.adFallbackIndex = adFallbackIndex;
  }


  /**
   * Ad id
   * @return adId
   */
  public String getAdId() {
    return adId;
  }

  /**
   * Ad id
   *
   * @param adId
   *        Ad id
   */
  public void setAdId(String adId) {
    this.adId = adId;
  }


  /**
   * Ad id player
   * @return adIdPlayer
   */
  public String getAdIdPlayer() {
    return adIdPlayer;
  }

  /**
   * Ad id player
   *
   * @param adIdPlayer
   *        Ad id player
   */
  public void setAdIdPlayer(String adIdPlayer) {
    this.adIdPlayer = adIdPlayer;
  }


  /**
   * Ad impression id
   * @return adImpressionId
   */
  public String getAdImpressionId() {
    return adImpressionId;
  }

  /**
   * Ad impression id
   *
   * @param adImpressionId
   *        Ad impression id
   */
  public void setAdImpressionId(String adImpressionId) {
    this.adImpressionId = adImpressionId;
  }


  /**
   * Ad is persistent
   * @return adIsPersistent
   */
  public Boolean getAdIsPersistent() {
    return adIsPersistent;
  }

  /**
   * Ad is persistent
   *
   * @param adIsPersistent
   *        Ad is persistent
   */
  public void setAdIsPersistent(Boolean adIsPersistent) {
    this.adIsPersistent = adIsPersistent;
  }


  /**
   * Ad module
   * @return adModule
   */
  public String getAdModule() {
    return adModule;
  }

  /**
   * Ad module
   *
   * @param adModule
   *        Ad module
   */
  public void setAdModule(String adModule) {
    this.adModule = adModule;
  }


  /**
   * Ad module version
   * @return adModuleVersion
   */
  public String getAdModuleVersion() {
    return adModuleVersion;
  }

  /**
   * Ad module version
   *
   * @param adModuleVersion
   *        Ad module version
   */
  public void setAdModuleVersion(String adModuleVersion) {
    this.adModuleVersion = adModuleVersion;
  }


  /**
   * Ad offset
   * @return adOffset
   */
  public String getAdOffset() {
    return adOffset;
  }

  /**
   * Ad offset
   *
   * @param adOffset
   *        Ad offset
   */
  public void setAdOffset(String adOffset) {
    this.adOffset = adOffset;
  }


  /**
   * Ad playback height
   * @return adPlaybackHeight
   */
  public Long getAdPlaybackHeight() {
    return adPlaybackHeight;
  }

  /**
   * Ad playback height
   *
   * @param adPlaybackHeight
   *        Ad playback height
   */
  public void setAdPlaybackHeight(Long adPlaybackHeight) {
    this.adPlaybackHeight = adPlaybackHeight;
  }


  /**
   * Ad playback width
   * @return adPlaybackWidth
   */
  public Long getAdPlaybackWidth() {
    return adPlaybackWidth;
  }

  /**
   * Ad playback width
   *
   * @param adPlaybackWidth
   *        Ad playback width
   */
  public void setAdPlaybackWidth(Long adPlaybackWidth) {
    this.adPlaybackWidth = adPlaybackWidth;
  }


  /**
   * Ad pod position
   * @return adPodPosition
   */
  public Long getAdPodPosition() {
    return adPodPosition;
  }

  /**
   * Ad pod position
   *
   * @param adPodPosition
   *        Ad pod position
   */
  public void setAdPodPosition(Long adPodPosition) {
    this.adPodPosition = adPodPosition;
  }


  /**
   * Ad position
   * @return adPosition
   */
  public String getAdPosition() {
    return adPosition;
  }

  /**
   * Ad position
   *
   * @param adPosition
   *        Ad position
   */
  public void setAdPosition(String adPosition) {
    this.adPosition = adPosition;
  }


  /**
   * Ad preload offset
   * @return adPreloadOffset
   */
  public Long getAdPreloadOffset() {
    return adPreloadOffset;
  }

  /**
   * Ad preload offset
   *
   * @param adPreloadOffset
   *        Ad preload offset
   */
  public void setAdPreloadOffset(Long adPreloadOffset) {
    this.adPreloadOffset = adPreloadOffset;
  }


  /**
   * Ad replace content duration
   * @return adReplaceContentDuration
   */
  public Long getAdReplaceContentDuration() {
    return adReplaceContentDuration;
  }

  /**
   * Ad replace content duration
   *
   * @param adReplaceContentDuration
   *        Ad replace content duration
   */
  public void setAdReplaceContentDuration(Long adReplaceContentDuration) {
    this.adReplaceContentDuration = adReplaceContentDuration;
  }


  /**
   * Ad schedule duration
   * @return adScheduleTime
   */
  public Long getAdScheduleTime() {
    return adScheduleTime;
  }

  /**
   * Ad schedule duration
   *
   * @param adScheduleTime
   *        Ad schedule duration
   */
  public void setAdScheduleTime(Long adScheduleTime) {
    this.adScheduleTime = adScheduleTime;
  }


  /**
   * Ad skip after
   * @return adSkipAfter
   */
  public Long getAdSkipAfter() {
    return adSkipAfter;
  }

  /**
   * Ad skip after
   *
   * @param adSkipAfter
   *        Ad skip after
   */
  public void setAdSkipAfter(Long adSkipAfter) {
    this.adSkipAfter = adSkipAfter;
  }


  /**
   * Ad is skippable
   * @return adSkippable
   */
  public Boolean getAdSkippable() {
    return adSkippable;
  }

  /**
   * Ad is skippable
   *
   * @param adSkippable
   *        Ad is skippable
   */
  public void setAdSkippable(Boolean adSkippable) {
    this.adSkippable = adSkippable;
  }


  /**
   * Ad startup time
   * @return adStartupTime
   */
  public Long getAdStartupTime() {
    return adStartupTime;
  }

  /**
   * Ad startup time
   *
   * @param adStartupTime
   *        Ad startup time
   */
  public void setAdStartupTime(Long adStartupTime) {
    this.adStartupTime = adStartupTime;
  }


  /**
   * Ad system
   * @return adSystem
   */
  public String getAdSystem() {
    return adSystem;
  }

  /**
   * Ad system
   *
   * @param adSystem
   *        Ad system
   */
  public void setAdSystem(String adSystem) {
    this.adSystem = adSystem;
  }


  /**
   * Ad tag path
   * @return adTagPath
   */
  public String getAdTagPath() {
    return adTagPath;
  }

  /**
   * Ad tag path
   *
   * @param adTagPath
   *        Ad tag path
   */
  public void setAdTagPath(String adTagPath) {
    this.adTagPath = adTagPath;
  }


  /**
   * Ad system
   * @return adTagServer
   */
  public String getAdTagServer() {
    return adTagServer;
  }

  /**
   * Ad system
   *
   * @param adTagServer
   *        Ad system
   */
  public void setAdTagServer(String adTagServer) {
    this.adTagServer = adTagServer;
  }


  /**
   * Ad tag type
   * @return adTagType
   */
  public String getAdTagType() {
    return adTagType;
  }

  /**
   * Ad tag type
   *
   * @param adTagType
   *        Ad tag type
   */
  public void setAdTagType(String adTagType) {
    this.adTagType = adTagType;
  }


  /**
   * Ad tag url
   * @return adTagUrl
   */
  public String getAdTagUrl() {
    return adTagUrl;
  }

  /**
   * Ad tag url
   *
   * @param adTagUrl
   *        Ad tag url
   */
  public void setAdTagUrl(String adTagUrl) {
    this.adTagUrl = adTagUrl;
  }


  /**
   * Ad title
   * @return adTitle
   */
  public String getAdTitle() {
    return adTitle;
  }

  /**
   * Ad title
   *
   * @param adTitle
   *        Ad title
   */
  public void setAdTitle(String adTitle) {
    this.adTitle = adTitle;
  }


  /**
   * Ad wrapper ads count
   * @return adWrapperAdsCount
   */
  public Long getAdWrapperAdsCount() {
    return adWrapperAdsCount;
  }

  /**
   * Ad wrapper ads count
   *
   * @param adWrapperAdsCount
   *        Ad wrapper ads count
   */
  public void setAdWrapperAdsCount(Long adWrapperAdsCount) {
    this.adWrapperAdsCount = adWrapperAdsCount;
  }


  /**
   * Advertiser name
   * @return advertiserName
   */
  public String getAdvertiserName() {
    return advertiserName;
  }

  /**
   * Advertiser name
   *
   * @param advertiserName
   *        Advertiser name
   */
  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  /**
   * Analytics version
   * @return analyticsVersion
   */
  public String getAnalyticsVersion() {
    return analyticsVersion;
  }

  /**
   * Analytics version
   *
   * @param analyticsVersion
   *        Analytics version
   */
  public void setAnalyticsVersion(String analyticsVersion) {
    this.analyticsVersion = analyticsVersion;
  }


  /**
   * Api framework
   * @return apiFramework
   */
  public String getApiFramework() {
    return apiFramework;
  }

  /**
   * Api framework
   *
   * @param apiFramework
   *        Api framework
   */
  public void setApiFramework(String apiFramework) {
    this.apiFramework = apiFramework;
  }


  /**
   * Organization id
   * @return apiorgId
   */
  public String getApiorgId() {
    return apiorgId;
  }

  /**
   * Organization id
   *
   * @param apiorgId
   *        Organization id
   */
  public void setApiorgId(String apiorgId) {
    this.apiorgId = apiorgId;
  }


  /**
   * User id
   * @return apiuserId
   */
  public String getApiuserId() {
    return apiuserId;
  }

  /**
   * User id
   *
   * @param apiuserId
   *        User id
   */
  public void setApiuserId(String apiuserId) {
    this.apiuserId = apiuserId;
  }


  /**
   * Audio bitrate
   * @return audioBitrate
   */
  public Long getAudioBitrate() {
    return audioBitrate;
  }

  /**
   * Audio bitrate
   *
   * @param audioBitrate
   *        Audio bitrate
   */
  public void setAudioBitrate(Long audioBitrate) {
    this.audioBitrate = audioBitrate;
  }


  /**
   * Is autoplay
   * @return autoplay
   */
  public Boolean getAutoplay() {
    return autoplay;
  }

  /**
   * Is autoplay
   *
   * @param autoplay
   *        Is autoplay
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
   * Browser is bot
   * @return browserIsBot
   */
  public Boolean getBrowserIsBot() {
    return browserIsBot;
  }

  /**
   * Browser is bot
   *
   * @param browserIsBot
   *        Browser is bot
   */
  public void setBrowserIsBot(Boolean browserIsBot) {
    this.browserIsBot = browserIsBot;
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
   * Click percentage
   * @return clickPercentage
   */
  public Long getClickPercentage() {
    return clickPercentage;
  }

  /**
   * Click percentage
   *
   * @param clickPercentage
   *        Click percentage
   */
  public void setClickPercentage(Long clickPercentage) {
    this.clickPercentage = clickPercentage;
  }


  /**
   * Click position
   * @return clickPosition
   */
  public Long getClickPosition() {
    return clickPosition;
  }

  /**
   * Click position
   *
   * @param clickPosition
   *        Click position
   */
  public void setClickPosition(Long clickPosition) {
    this.clickPosition = clickPosition;
  }


  /**
   * Clicked
   * @return clicked
   */
  public Integer getClicked() {
    return clicked;
  }

  /**
   * Clicked
   *
   * @param clicked
   *        Clicked
   */
  public void setClicked(Integer clicked) {
    this.clicked = clicked;
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
   * Close percentage
   * @return closePercentage
   */
  public Long getClosePercentage() {
    return closePercentage;
  }

  /**
   * Close percentage
   *
   * @param closePercentage
   *        Close percentage
   */
  public void setClosePercentage(Long closePercentage) {
    this.closePercentage = closePercentage;
  }


  /**
   * Close position
   * @return closePosition
   */
  public Long getClosePosition() {
    return closePosition;
  }

  /**
   * Close position
   *
   * @param closePosition
   *        Close position
   */
  public void setClosePosition(Long closePosition) {
    this.closePosition = closePosition;
  }


  /**
   * Closed
   * @return closed
   */
  public Integer getClosed() {
    return closed;
  }

  /**
   * Closed
   *
   * @param closed
   *        Closed
   */
  public void setClosed(Integer closed) {
    this.closed = closed;
  }


  /**
   * Completed
   * @return completed
   */
  public Integer getCompleted() {
    return completed;
  }

  /**
   * Completed
   *
   * @param completed
   *        Completed
   */
  public void setCompleted(Integer completed) {
    this.completed = completed;
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
   * Creative ad id
   * @return creativeAdId
   */
  public String getCreativeAdId() {
    return creativeAdId;
  }

  /**
   * Creative ad id
   *
   * @param creativeAdId
   *        Creative ad id
   */
  public void setCreativeAdId(String creativeAdId) {
    this.creativeAdId = creativeAdId;
  }


  /**
   * Creative id
   * @return creativeId
   */
  public String getCreativeId() {
    return creativeId;
  }

  /**
   * Creative id
   *
   * @param creativeId
   *        Creative id
   */
  public void setCreativeId(String creativeId) {
    this.creativeId = creativeId;
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
   * Deal id
   * @return dealId
   */
  public String getDealId() {
    return dealId;
  }

  /**
   * Deal id
   *
   * @param dealId
   *        Deal id
   */
  public void setDealId(String dealId) {
    this.dealId = dealId;
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
   * Error data
   * @return errorData
   */
  public String getErrorData() {
    return errorData;
  }

  /**
   * Error data
   *
   * @param errorData
   *        Error data
   */
  public void setErrorData(String errorData) {
    this.errorData = errorData;
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
   * Error percentage
   * @return errorPercentage
   */
  public Integer getErrorPercentage() {
    return errorPercentage;
  }

  /**
   * Error percentage
   *
   * @param errorPercentage
   *        Error percentage
   */
  public void setErrorPercentage(Integer errorPercentage) {
    this.errorPercentage = errorPercentage;
  }


  /**
   * Error position
   * @return errorPosition
   */
  public Long getErrorPosition() {
    return errorPosition;
  }

  /**
   * Error position
   *
   * @param errorPosition
   *        Error position
   */
  public void setErrorPosition(Long errorPosition) {
    this.errorPosition = errorPosition;
  }


  /**
   * Exit position
   * @return exitPosition
   */
  public Long getExitPosition() {
    return exitPosition;
  }

  /**
   * Exit position
   *
   * @param exitPosition
   *        Exit position
   */
  public void setExitPosition(Long exitPosition) {
    this.exitPosition = exitPosition;
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
   * Manifest download time
   * @return manifestDownloadTime
   */
  public Long getManifestDownloadTime() {
    return manifestDownloadTime;
  }

  /**
   * Manifest download time
   *
   * @param manifestDownloadTime
   *        Manifest download time
   */
  public void setManifestDownloadTime(Long manifestDownloadTime) {
    this.manifestDownloadTime = manifestDownloadTime;
  }


  /**
   * Media path
   * @return mediaPath
   */
  public String getMediaPath() {
    return mediaPath;
  }

  /**
   * Media path
   *
   * @param mediaPath
   *        Media path
   */
  public void setMediaPath(String mediaPath) {
    this.mediaPath = mediaPath;
  }


  /**
   * Media server
   * @return mediaServer
   */
  public String getMediaServer() {
    return mediaServer;
  }

  /**
   * Media server
   *
   * @param mediaServer
   *        Media server
   */
  public void setMediaServer(String mediaServer) {
    this.mediaServer = mediaServer;
  }


  /**
   * Media url
   * @return mediaUrl
   */
  public String getMediaUrl() {
    return mediaUrl;
  }

  /**
   * Media url
   *
   * @param mediaUrl
   *        Media url
   */
  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }


  /**
   * Midpoint
   * @return midpoint
   */
  public Integer getMidpoint() {
    return midpoint;
  }

  /**
   * Midpoint
   *
   * @param midpoint
   *        Midpoint
   */
  public void setMidpoint(Integer midpoint) {
    this.midpoint = midpoint;
  }


  /**
   * Minimum suggested duration
   * @return minSuggestedDuration
   */
  public Long getMinSuggestedDuration() {
    return minSuggestedDuration;
  }

  /**
   * Minimum suggested duration
   *
   * @param minSuggestedDuration
   *        Minimum suggested duration
   */
  public void setMinSuggestedDuration(Long minSuggestedDuration) {
    this.minSuggestedDuration = minSuggestedDuration;
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
   * Percentage in viewport
   * @return percentageInViewport
   */
  public Long getPercentageInViewport() {
    return percentageInViewport;
  }

  /**
   * Percentage in viewport
   *
   * @param percentageInViewport
   *        Percentage in viewport
   */
  public void setPercentageInViewport(Long percentageInViewport) {
    this.percentageInViewport = percentageInViewport;
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
   * Play percentage
   * @return playPercentage
   */
  public Integer getPlayPercentage() {
    return playPercentage;
  }

  /**
   * Play percentage
   *
   * @param playPercentage
   *        Play percentage
   */
  public void setPlayPercentage(Integer playPercentage) {
    this.playPercentage = playPercentage;
  }


  /**
   * Quartile 1
   * @return quartile1
   */
  public Integer getQuartile1() {
    return quartile1;
  }

  /**
   * Quartile 1
   *
   * @param quartile1
   *        Quartile 1
   */
  public void setQuartile1(Integer quartile1) {
    this.quartile1 = quartile1;
  }


  /**
   * Quartile 3
   * @return quartile3
   */
  public Integer getQuartile3() {
    return quartile3;
  }

  /**
   * Quartile 3
   *
   * @param quartile3
   *        Quartile 3
   */
  public void setQuartile3(Integer quartile3) {
    this.quartile3 = quartile3;
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
   * Skip percentage
   * @return skipPercentage
   */
  public Integer getSkipPercentage() {
    return skipPercentage;
  }

  /**
   * Skip percentage
   *
   * @param skipPercentage
   *        Skip percentage
   */
  public void setSkipPercentage(Integer skipPercentage) {
    this.skipPercentage = skipPercentage;
  }


  /**
   * Skip position
   * @return skipPosition
   */
  public Long getSkipPosition() {
    return skipPosition;
  }

  /**
   * Skip position
   *
   * @param skipPosition
   *        Skip position
   */
  public void setSkipPosition(Long skipPosition) {
    this.skipPosition = skipPosition;
  }


  /**
   * Skipped
   * @return skipped
   */
  public Integer getSkipped() {
    return skipped;
  }

  /**
   * Skipped
   *
   * @param skipped
   *        Skipped
   */
  public void setSkipped(Integer skipped) {
    this.skipped = skipped;
  }


  /**
   * Started
   * @return started
   */
  public Integer getStarted() {
    return started;
  }

  /**
   * Started
   *
   * @param started
   *        Started
   */
  public void setStarted(Integer started) {
    this.started = started;
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
   * Survey url
   * @return surveyUrl
   */
  public String getSurveyUrl() {
    return surveyUrl;
  }

  /**
   * Survey url
   *
   * @param surveyUrl
   *        Survey url
   */
  public void setSurveyUrl(String surveyUrl) {
    this.surveyUrl = surveyUrl;
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
   * Time from content
   * @return timeFromContent
   */
  public Long getTimeFromContent() {
    return timeFromContent;
  }

  /**
   * Time from content
   *
   * @param timeFromContent
   *        Time from content
   */
  public void setTimeFromContent(Long timeFromContent) {
    this.timeFromContent = timeFromContent;
  }


  /**
   * Time hovered
   * @return timeHovered
   */
  public Long getTimeHovered() {
    return timeHovered;
  }

  /**
   * Time hovered
   *
   * @param timeHovered
   *        Time hovered
   */
  public void setTimeHovered(Long timeHovered) {
    this.timeHovered = timeHovered;
  }


  /**
   * Time in viewport
   * @return timeInViewport
   */
  public Long getTimeInViewport() {
    return timeInViewport;
  }

  /**
   * Time in viewport
   *
   * @param timeInViewport
   *        Time in viewport
   */
  public void setTimeInViewport(Long timeInViewport) {
    this.timeInViewport = timeInViewport;
  }


  /**
   * Time played
   * @return timePlayed
   */
  public Long getTimePlayed() {
    return timePlayed;
  }

  /**
   * Time played
   *
   * @param timePlayed
   *        Time played
   */
  public void setTimePlayed(Long timePlayed) {
    this.timePlayed = timePlayed;
  }


  /**
   * Time to content
   * @return timeToContent
   */
  public Long getTimeToContent() {
    return timeToContent;
  }

  /**
   * Time to content
   *
   * @param timeToContent
   *        Time to content
   */
  public void setTimeToContent(Long timeToContent) {
    this.timeToContent = timeToContent;
  }


  /**
   * Time to hover
   * @return timeToHover
   */
  public Long getTimeToHover() {
    return timeToHover;
  }

  /**
   * Time to hover
   *
   * @param timeToHover
   *        Time to hover
   */
  public void setTimeToHover(Long timeToHover) {
    this.timeToHover = timeToHover;
  }


  /**
   * Universal ad id registry
   * @return universalAdIdRegistry
   */
  public String getUniversalAdIdRegistry() {
    return universalAdIdRegistry;
  }

  /**
   * Universal ad id registry
   *
   * @param universalAdIdRegistry
   *        Universal ad id registry
   */
  public void setUniversalAdIdRegistry(String universalAdIdRegistry) {
    this.universalAdIdRegistry = universalAdIdRegistry;
  }


  /**
   * Universal ad id value
   * @return universalAdIdValue
   */
  public String getUniversalAdIdValue() {
    return universalAdIdValue;
  }

  /**
   * Universal ad id value
   *
   * @param universalAdIdValue
   *        Universal ad id value
   */
  public void setUniversalAdIdValue(String universalAdIdValue) {
    this.universalAdIdValue = universalAdIdValue;
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
   * ID of the video 
   * @return videoId
   */
  public String getVideoId() {
    return videoId;
  }

  /**
   * ID of the video 
   *
   * @param videoId
   *        ID of the video 
   */
  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  /**
   * ID of related video impression
   * @return videoImpressionId
   */
  public String getVideoImpressionId() {
    return videoImpressionId;
  }

  /**
   * ID of related video impression
   *
   * @param videoImpressionId
   *        ID of related video impression
   */
  public void setVideoImpressionId(String videoImpressionId) {
    this.videoImpressionId = videoImpressionId;
  }


  /**
   * Free form human readable video ad title
   * @return videoTitle
   */
  public String getVideoTitle() {
    return videoTitle;
  }

  /**
   * Free form human readable video ad title
   *
   * @param videoTitle
   *        Free form human readable video ad title
   */
  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
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
    AnalyticsAdsImpressionSample analyticsAdsImpressionSample = (AnalyticsAdsImpressionSample) o;
    return Objects.equals(this.adClickthroughUrl, analyticsAdsImpressionSample.adClickthroughUrl) &&
        Objects.equals(this.adDescription, analyticsAdsImpressionSample.adDescription) &&
        Objects.equals(this.adDuration, analyticsAdsImpressionSample.adDuration) &&
        Objects.equals(this.adFallbackIndex, analyticsAdsImpressionSample.adFallbackIndex) &&
        Objects.equals(this.adId, analyticsAdsImpressionSample.adId) &&
        Objects.equals(this.adIdPlayer, analyticsAdsImpressionSample.adIdPlayer) &&
        Objects.equals(this.adImpressionId, analyticsAdsImpressionSample.adImpressionId) &&
        Objects.equals(this.adIsPersistent, analyticsAdsImpressionSample.adIsPersistent) &&
        Objects.equals(this.adModule, analyticsAdsImpressionSample.adModule) &&
        Objects.equals(this.adModuleVersion, analyticsAdsImpressionSample.adModuleVersion) &&
        Objects.equals(this.adOffset, analyticsAdsImpressionSample.adOffset) &&
        Objects.equals(this.adPlaybackHeight, analyticsAdsImpressionSample.adPlaybackHeight) &&
        Objects.equals(this.adPlaybackWidth, analyticsAdsImpressionSample.adPlaybackWidth) &&
        Objects.equals(this.adPodPosition, analyticsAdsImpressionSample.adPodPosition) &&
        Objects.equals(this.adPosition, analyticsAdsImpressionSample.adPosition) &&
        Objects.equals(this.adPreloadOffset, analyticsAdsImpressionSample.adPreloadOffset) &&
        Objects.equals(this.adReplaceContentDuration, analyticsAdsImpressionSample.adReplaceContentDuration) &&
        Objects.equals(this.adScheduleTime, analyticsAdsImpressionSample.adScheduleTime) &&
        Objects.equals(this.adSkipAfter, analyticsAdsImpressionSample.adSkipAfter) &&
        Objects.equals(this.adSkippable, analyticsAdsImpressionSample.adSkippable) &&
        Objects.equals(this.adStartupTime, analyticsAdsImpressionSample.adStartupTime) &&
        Objects.equals(this.adSystem, analyticsAdsImpressionSample.adSystem) &&
        Objects.equals(this.adTagPath, analyticsAdsImpressionSample.adTagPath) &&
        Objects.equals(this.adTagServer, analyticsAdsImpressionSample.adTagServer) &&
        Objects.equals(this.adTagType, analyticsAdsImpressionSample.adTagType) &&
        Objects.equals(this.adTagUrl, analyticsAdsImpressionSample.adTagUrl) &&
        Objects.equals(this.adTitle, analyticsAdsImpressionSample.adTitle) &&
        Objects.equals(this.adWrapperAdsCount, analyticsAdsImpressionSample.adWrapperAdsCount) &&
        Objects.equals(this.advertiserName, analyticsAdsImpressionSample.advertiserName) &&
        Objects.equals(this.analyticsVersion, analyticsAdsImpressionSample.analyticsVersion) &&
        Objects.equals(this.apiFramework, analyticsAdsImpressionSample.apiFramework) &&
        Objects.equals(this.apiorgId, analyticsAdsImpressionSample.apiorgId) &&
        Objects.equals(this.apiuserId, analyticsAdsImpressionSample.apiuserId) &&
        Objects.equals(this.audioBitrate, analyticsAdsImpressionSample.audioBitrate) &&
        Objects.equals(this.autoplay, analyticsAdsImpressionSample.autoplay) &&
        Objects.equals(this.browser, analyticsAdsImpressionSample.browser) &&
        Objects.equals(this.browserIsBot, analyticsAdsImpressionSample.browserIsBot) &&
        Objects.equals(this.browserVersionMajor, analyticsAdsImpressionSample.browserVersionMajor) &&
        Objects.equals(this.browserVersionMinor, analyticsAdsImpressionSample.browserVersionMinor) &&
        Objects.equals(this.cdnProvider, analyticsAdsImpressionSample.cdnProvider) &&
        Objects.equals(this.city, analyticsAdsImpressionSample.city) &&
        Objects.equals(this.clickPercentage, analyticsAdsImpressionSample.clickPercentage) &&
        Objects.equals(this.clickPosition, analyticsAdsImpressionSample.clickPosition) &&
        Objects.equals(this.clicked, analyticsAdsImpressionSample.clicked) &&
        Objects.equals(this.clientTime, analyticsAdsImpressionSample.clientTime) &&
        Objects.equals(this.closePercentage, analyticsAdsImpressionSample.closePercentage) &&
        Objects.equals(this.closePosition, analyticsAdsImpressionSample.closePosition) &&
        Objects.equals(this.closed, analyticsAdsImpressionSample.closed) &&
        Objects.equals(this.completed, analyticsAdsImpressionSample.completed) &&
        Objects.equals(this.country, analyticsAdsImpressionSample.country) &&
        Objects.equals(this.creativeAdId, analyticsAdsImpressionSample.creativeAdId) &&
        Objects.equals(this.creativeId, analyticsAdsImpressionSample.creativeId) &&
        Objects.equals(this.customData1, analyticsAdsImpressionSample.customData1) &&
        Objects.equals(this.customData2, analyticsAdsImpressionSample.customData2) &&
        Objects.equals(this.customData3, analyticsAdsImpressionSample.customData3) &&
        Objects.equals(this.customData4, analyticsAdsImpressionSample.customData4) &&
        Objects.equals(this.customData5, analyticsAdsImpressionSample.customData5) &&
        Objects.equals(this.customData6, analyticsAdsImpressionSample.customData6) &&
        Objects.equals(this.customData7, analyticsAdsImpressionSample.customData7) &&
        Objects.equals(this.customUserId, analyticsAdsImpressionSample.customUserId) &&
        Objects.equals(this.dealId, analyticsAdsImpressionSample.dealId) &&
        Objects.equals(this.deviceClass, analyticsAdsImpressionSample.deviceClass) &&
        Objects.equals(this.deviceType, analyticsAdsImpressionSample.deviceType) &&
        Objects.equals(this.domain, analyticsAdsImpressionSample.domain) &&
        Objects.equals(this.errorCode, analyticsAdsImpressionSample.errorCode) &&
        Objects.equals(this.errorData, analyticsAdsImpressionSample.errorData) &&
        Objects.equals(this.errorMessage, analyticsAdsImpressionSample.errorMessage) &&
        Objects.equals(this.errorPercentage, analyticsAdsImpressionSample.errorPercentage) &&
        Objects.equals(this.errorPosition, analyticsAdsImpressionSample.errorPosition) &&
        Objects.equals(this.exitPosition, analyticsAdsImpressionSample.exitPosition) &&
        Objects.equals(this.experimentName, analyticsAdsImpressionSample.experimentName) &&
        Objects.equals(this.ipAddress, analyticsAdsImpressionSample.ipAddress) &&
        Objects.equals(this.isp, analyticsAdsImpressionSample.isp) &&
        Objects.equals(this.language, analyticsAdsImpressionSample.language) &&
        Objects.equals(this.licenseKey, analyticsAdsImpressionSample.licenseKey) &&
        Objects.equals(this.manifestDownloadTime, analyticsAdsImpressionSample.manifestDownloadTime) &&
        Objects.equals(this.mediaPath, analyticsAdsImpressionSample.mediaPath) &&
        Objects.equals(this.mediaServer, analyticsAdsImpressionSample.mediaServer) &&
        Objects.equals(this.mediaUrl, analyticsAdsImpressionSample.mediaUrl) &&
        Objects.equals(this.midpoint, analyticsAdsImpressionSample.midpoint) &&
        Objects.equals(this.minSuggestedDuration, analyticsAdsImpressionSample.minSuggestedDuration) &&
        Objects.equals(this.operatingsystem, analyticsAdsImpressionSample.operatingsystem) &&
        Objects.equals(this.operatingsystemVersionMajor, analyticsAdsImpressionSample.operatingsystemVersionMajor) &&
        Objects.equals(this.operatingsystemVersionMinor, analyticsAdsImpressionSample.operatingsystemVersionMinor) &&
        Objects.equals(this.pageLoadTime, analyticsAdsImpressionSample.pageLoadTime) &&
        Objects.equals(this.pageLoadType, analyticsAdsImpressionSample.pageLoadType) &&
        Objects.equals(this.path, analyticsAdsImpressionSample.path) &&
        Objects.equals(this.percentageInViewport, analyticsAdsImpressionSample.percentageInViewport) &&
        Objects.equals(this.platform, analyticsAdsImpressionSample.platform) &&
        Objects.equals(this.player, analyticsAdsImpressionSample.player) &&
        Objects.equals(this.playerKey, analyticsAdsImpressionSample.playerKey) &&
        Objects.equals(this.playerStartuptime, analyticsAdsImpressionSample.playerStartuptime) &&
        Objects.equals(this.playerTech, analyticsAdsImpressionSample.playerTech) &&
        Objects.equals(this.playerVersion, analyticsAdsImpressionSample.playerVersion) &&
        Objects.equals(this.playPercentage, analyticsAdsImpressionSample.playPercentage) &&
        Objects.equals(this.quartile1, analyticsAdsImpressionSample.quartile1) &&
        Objects.equals(this.quartile3, analyticsAdsImpressionSample.quartile3) &&
        Objects.equals(this.region, analyticsAdsImpressionSample.region) &&
        Objects.equals(this.screenHeight, analyticsAdsImpressionSample.screenHeight) &&
        Objects.equals(this.screenWidth, analyticsAdsImpressionSample.screenWidth) &&
        Objects.equals(this.size, analyticsAdsImpressionSample.size) &&
        Objects.equals(this.skipPercentage, analyticsAdsImpressionSample.skipPercentage) &&
        Objects.equals(this.skipPosition, analyticsAdsImpressionSample.skipPosition) &&
        Objects.equals(this.skipped, analyticsAdsImpressionSample.skipped) &&
        Objects.equals(this.started, analyticsAdsImpressionSample.started) &&
        Objects.equals(this.streamFormat, analyticsAdsImpressionSample.streamFormat) &&
        Objects.equals(this.surveyUrl, analyticsAdsImpressionSample.surveyUrl) &&
        Objects.equals(this.time, analyticsAdsImpressionSample.time) &&
        Objects.equals(this.timeFromContent, analyticsAdsImpressionSample.timeFromContent) &&
        Objects.equals(this.timeHovered, analyticsAdsImpressionSample.timeHovered) &&
        Objects.equals(this.timeInViewport, analyticsAdsImpressionSample.timeInViewport) &&
        Objects.equals(this.timePlayed, analyticsAdsImpressionSample.timePlayed) &&
        Objects.equals(this.timeToContent, analyticsAdsImpressionSample.timeToContent) &&
        Objects.equals(this.timeToHover, analyticsAdsImpressionSample.timeToHover) &&
        Objects.equals(this.universalAdIdRegistry, analyticsAdsImpressionSample.universalAdIdRegistry) &&
        Objects.equals(this.universalAdIdValue, analyticsAdsImpressionSample.universalAdIdValue) &&
        Objects.equals(this.userId, analyticsAdsImpressionSample.userId) &&
        Objects.equals(this.videoBitrate, analyticsAdsImpressionSample.videoBitrate) &&
        Objects.equals(this.videoId, analyticsAdsImpressionSample.videoId) &&
        Objects.equals(this.videoImpressionId, analyticsAdsImpressionSample.videoImpressionId) &&
        Objects.equals(this.videoTitle, analyticsAdsImpressionSample.videoTitle) &&
        Objects.equals(this.videoWindowHeight, analyticsAdsImpressionSample.videoWindowHeight) &&
        Objects.equals(this.videoWindowWidth, analyticsAdsImpressionSample.videoWindowWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adClickthroughUrl, adDescription, adDuration, adFallbackIndex, adId, adIdPlayer, adImpressionId, adIsPersistent, adModule, adModuleVersion, adOffset, adPlaybackHeight, adPlaybackWidth, adPodPosition, adPosition, adPreloadOffset, adReplaceContentDuration, adScheduleTime, adSkipAfter, adSkippable, adStartupTime, adSystem, adTagPath, adTagServer, adTagType, adTagUrl, adTitle, adWrapperAdsCount, advertiserName, analyticsVersion, apiFramework, apiorgId, apiuserId, audioBitrate, autoplay, browser, browserIsBot, browserVersionMajor, browserVersionMinor, cdnProvider, city, clickPercentage, clickPosition, clicked, clientTime, closePercentage, closePosition, closed, completed, country, creativeAdId, creativeId, customData1, customData2, customData3, customData4, customData5, customData6, customData7, customUserId, dealId, deviceClass, deviceType, domain, errorCode, errorData, errorMessage, errorPercentage, errorPosition, exitPosition, experimentName, ipAddress, isp, language, licenseKey, manifestDownloadTime, mediaPath, mediaServer, mediaUrl, midpoint, minSuggestedDuration, operatingsystem, operatingsystemVersionMajor, operatingsystemVersionMinor, pageLoadTime, pageLoadType, path, percentageInViewport, platform, player, playerKey, playerStartuptime, playerTech, playerVersion, playPercentage, quartile1, quartile3, region, screenHeight, screenWidth, size, skipPercentage, skipPosition, skipped, started, streamFormat, surveyUrl, time, timeFromContent, timeHovered, timeInViewport, timePlayed, timeToContent, timeToHover, universalAdIdRegistry, universalAdIdValue, userId, videoBitrate, videoId, videoImpressionId, videoTitle, videoWindowHeight, videoWindowWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAdsImpressionSample {\n");
    
    sb.append("    adClickthroughUrl: ").append(toIndentedString(adClickthroughUrl)).append("\n");
    sb.append("    adDescription: ").append(toIndentedString(adDescription)).append("\n");
    sb.append("    adDuration: ").append(toIndentedString(adDuration)).append("\n");
    sb.append("    adFallbackIndex: ").append(toIndentedString(adFallbackIndex)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adIdPlayer: ").append(toIndentedString(adIdPlayer)).append("\n");
    sb.append("    adImpressionId: ").append(toIndentedString(adImpressionId)).append("\n");
    sb.append("    adIsPersistent: ").append(toIndentedString(adIsPersistent)).append("\n");
    sb.append("    adModule: ").append(toIndentedString(adModule)).append("\n");
    sb.append("    adModuleVersion: ").append(toIndentedString(adModuleVersion)).append("\n");
    sb.append("    adOffset: ").append(toIndentedString(adOffset)).append("\n");
    sb.append("    adPlaybackHeight: ").append(toIndentedString(adPlaybackHeight)).append("\n");
    sb.append("    adPlaybackWidth: ").append(toIndentedString(adPlaybackWidth)).append("\n");
    sb.append("    adPodPosition: ").append(toIndentedString(adPodPosition)).append("\n");
    sb.append("    adPosition: ").append(toIndentedString(adPosition)).append("\n");
    sb.append("    adPreloadOffset: ").append(toIndentedString(adPreloadOffset)).append("\n");
    sb.append("    adReplaceContentDuration: ").append(toIndentedString(adReplaceContentDuration)).append("\n");
    sb.append("    adScheduleTime: ").append(toIndentedString(adScheduleTime)).append("\n");
    sb.append("    adSkipAfter: ").append(toIndentedString(adSkipAfter)).append("\n");
    sb.append("    adSkippable: ").append(toIndentedString(adSkippable)).append("\n");
    sb.append("    adStartupTime: ").append(toIndentedString(adStartupTime)).append("\n");
    sb.append("    adSystem: ").append(toIndentedString(adSystem)).append("\n");
    sb.append("    adTagPath: ").append(toIndentedString(adTagPath)).append("\n");
    sb.append("    adTagServer: ").append(toIndentedString(adTagServer)).append("\n");
    sb.append("    adTagType: ").append(toIndentedString(adTagType)).append("\n");
    sb.append("    adTagUrl: ").append(toIndentedString(adTagUrl)).append("\n");
    sb.append("    adTitle: ").append(toIndentedString(adTitle)).append("\n");
    sb.append("    adWrapperAdsCount: ").append(toIndentedString(adWrapperAdsCount)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    analyticsVersion: ").append(toIndentedString(analyticsVersion)).append("\n");
    sb.append("    apiFramework: ").append(toIndentedString(apiFramework)).append("\n");
    sb.append("    apiorgId: ").append(toIndentedString(apiorgId)).append("\n");
    sb.append("    apiuserId: ").append(toIndentedString(apiuserId)).append("\n");
    sb.append("    audioBitrate: ").append(toIndentedString(audioBitrate)).append("\n");
    sb.append("    autoplay: ").append(toIndentedString(autoplay)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    browserIsBot: ").append(toIndentedString(browserIsBot)).append("\n");
    sb.append("    browserVersionMajor: ").append(toIndentedString(browserVersionMajor)).append("\n");
    sb.append("    browserVersionMinor: ").append(toIndentedString(browserVersionMinor)).append("\n");
    sb.append("    cdnProvider: ").append(toIndentedString(cdnProvider)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    clickPercentage: ").append(toIndentedString(clickPercentage)).append("\n");
    sb.append("    clickPosition: ").append(toIndentedString(clickPosition)).append("\n");
    sb.append("    clicked: ").append(toIndentedString(clicked)).append("\n");
    sb.append("    clientTime: ").append(toIndentedString(clientTime)).append("\n");
    sb.append("    closePercentage: ").append(toIndentedString(closePercentage)).append("\n");
    sb.append("    closePosition: ").append(toIndentedString(closePosition)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    creativeAdId: ").append(toIndentedString(creativeAdId)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    customData1: ").append(toIndentedString(customData1)).append("\n");
    sb.append("    customData2: ").append(toIndentedString(customData2)).append("\n");
    sb.append("    customData3: ").append(toIndentedString(customData3)).append("\n");
    sb.append("    customData4: ").append(toIndentedString(customData4)).append("\n");
    sb.append("    customData5: ").append(toIndentedString(customData5)).append("\n");
    sb.append("    customData6: ").append(toIndentedString(customData6)).append("\n");
    sb.append("    customData7: ").append(toIndentedString(customData7)).append("\n");
    sb.append("    customUserId: ").append(toIndentedString(customUserId)).append("\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    deviceClass: ").append(toIndentedString(deviceClass)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorData: ").append(toIndentedString(errorData)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorPercentage: ").append(toIndentedString(errorPercentage)).append("\n");
    sb.append("    errorPosition: ").append(toIndentedString(errorPosition)).append("\n");
    sb.append("    exitPosition: ").append(toIndentedString(exitPosition)).append("\n");
    sb.append("    experimentName: ").append(toIndentedString(experimentName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    licenseKey: ").append(toIndentedString(licenseKey)).append("\n");
    sb.append("    manifestDownloadTime: ").append(toIndentedString(manifestDownloadTime)).append("\n");
    sb.append("    mediaPath: ").append(toIndentedString(mediaPath)).append("\n");
    sb.append("    mediaServer: ").append(toIndentedString(mediaServer)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    midpoint: ").append(toIndentedString(midpoint)).append("\n");
    sb.append("    minSuggestedDuration: ").append(toIndentedString(minSuggestedDuration)).append("\n");
    sb.append("    operatingsystem: ").append(toIndentedString(operatingsystem)).append("\n");
    sb.append("    operatingsystemVersionMajor: ").append(toIndentedString(operatingsystemVersionMajor)).append("\n");
    sb.append("    operatingsystemVersionMinor: ").append(toIndentedString(operatingsystemVersionMinor)).append("\n");
    sb.append("    pageLoadTime: ").append(toIndentedString(pageLoadTime)).append("\n");
    sb.append("    pageLoadType: ").append(toIndentedString(pageLoadType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    percentageInViewport: ").append(toIndentedString(percentageInViewport)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    player: ").append(toIndentedString(player)).append("\n");
    sb.append("    playerKey: ").append(toIndentedString(playerKey)).append("\n");
    sb.append("    playerStartuptime: ").append(toIndentedString(playerStartuptime)).append("\n");
    sb.append("    playerTech: ").append(toIndentedString(playerTech)).append("\n");
    sb.append("    playerVersion: ").append(toIndentedString(playerVersion)).append("\n");
    sb.append("    playPercentage: ").append(toIndentedString(playPercentage)).append("\n");
    sb.append("    quartile1: ").append(toIndentedString(quartile1)).append("\n");
    sb.append("    quartile3: ").append(toIndentedString(quartile3)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    skipPercentage: ").append(toIndentedString(skipPercentage)).append("\n");
    sb.append("    skipPosition: ").append(toIndentedString(skipPosition)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    streamFormat: ").append(toIndentedString(streamFormat)).append("\n");
    sb.append("    surveyUrl: ").append(toIndentedString(surveyUrl)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timeFromContent: ").append(toIndentedString(timeFromContent)).append("\n");
    sb.append("    timeHovered: ").append(toIndentedString(timeHovered)).append("\n");
    sb.append("    timeInViewport: ").append(toIndentedString(timeInViewport)).append("\n");
    sb.append("    timePlayed: ").append(toIndentedString(timePlayed)).append("\n");
    sb.append("    timeToContent: ").append(toIndentedString(timeToContent)).append("\n");
    sb.append("    timeToHover: ").append(toIndentedString(timeToHover)).append("\n");
    sb.append("    universalAdIdRegistry: ").append(toIndentedString(universalAdIdRegistry)).append("\n");
    sb.append("    universalAdIdValue: ").append(toIndentedString(universalAdIdValue)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    videoBitrate: ").append(toIndentedString(videoBitrate)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoImpressionId: ").append(toIndentedString(videoImpressionId)).append("\n");
    sb.append("    videoTitle: ").append(toIndentedString(videoTitle)).append("\n");
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

