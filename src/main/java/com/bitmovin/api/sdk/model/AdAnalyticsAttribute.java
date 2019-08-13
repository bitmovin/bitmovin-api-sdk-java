package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AdAnalyticsAttribute
 */
public enum AdAnalyticsAttribute {
  
  
  AD_IMPRESSION_ID("AD_IMPRESSION_ID"),
  
  
  AD_CLICKTHROUGH_URL("AD_CLICKTHROUGH_URL"),
  
  
  AD_DESCRIPTION("AD_DESCRIPTION"),
  
  
  AD_DURATION("AD_DURATION"),
  
  
  AD_FALLBACK_INDEX("AD_FALLBACK_INDEX"),
  
  
  AD_ID("AD_ID"),
  
  
  AD_ID_PLAYER("AD_ID_PLAYER"),
  
  
  AD_IS_PERSISTENT("AD_IS_PERSISTENT"),
  
  
  AD_MODULE("AD_MODULE"),
  
  
  AD_OFFSET("AD_OFFSET"),
  
  
  AD_PLAYBACK_HEIGHT("AD_PLAYBACK_HEIGHT"),
  
  
  AD_PLAYBACK_WIDTH("AD_PLAYBACK_WIDTH"),
  
  
  AD_POD_POSITION("AD_POD_POSITION"),
  
  
  AD_POSITION("AD_POSITION"),
  
  
  AD_PRELOAD_OFFSET("AD_PRELOAD_OFFSET"),
  
  
  AD_REPLACE_CONTENT_DURATION("AD_REPLACE_CONTENT_DURATION"),
  
  
  AD_SCHEDULE_TIME("AD_SCHEDULE_TIME"),
  
  
  AD_SKIP_AFTER("AD_SKIP_AFTER"),
  
  
  AD_SKIPPABLE("AD_SKIPPABLE"),
  
  
  AD_STARTUP_TIME("AD_STARTUP_TIME"),
  
  
  AD_SYSTEM("AD_SYSTEM"),
  
  
  AD_TAG_PATH("AD_TAG_PATH"),
  
  
  AD_TAG_SERVER("AD_TAG_SERVER"),
  
  
  AD_TAG_TYPE("AD_TAG_TYPE"),
  
  
  AD_TAG_URL("AD_TAG_URL"),
  
  
  AD_TITLE("AD_TITLE"),
  
  
  AD_WRAPPER_ADS_COUNT("AD_WRAPPER_ADS_COUNT"),
  
  
  ADVERTISER_NAME("ADVERTISER_NAME"),
  
  
  ANALYTICS_VERSION("ANALYTICS_VERSION"),
  
  
  API_FRAMEWORK("API_FRAMEWORK"),
  
  
  ASN("ASN"),
  
  
  AUDIO_BITRATE("AUDIO_BITRATE"),
  
  
  AUDIO_CODEC("AUDIO_CODEC"),
  
  
  AUTOPLAY("AUTOPLAY"),
  
  
  BROWSER("BROWSER"),
  
  
  BROWSER_VERSION_MAJOR("BROWSER_VERSION_MAJOR"),
  
  
  CDN_PROVIDER("CDN_PROVIDER"),
  
  
  CITY("CITY"),
  
  
  CLICK_PERCENTAGE("CLICK_PERCENTAGE"),
  
  
  CLICK_POSITION("CLICK_POSITION"),
  
  
  CLICKED("CLICKED"),
  
  
  CLIENT_TIME("CLIENT_TIME"),
  
  
  CLOSE_PERCENTAGE("CLOSE_PERCENTAGE"),
  
  
  CLOSE_POSITION("CLOSE_POSITION"),
  
  
  CLOSED("CLOSED"),
  
  
  COMPLETED("COMPLETED"),
  
  
  COUNTRY("COUNTRY"),
  
  
  CREATIVE_AD_ID("CREATIVE_AD_ID"),
  
  
  CREATIVE_ID("CREATIVE_ID"),
  
  
  CUSTOM_DATA_1("CUSTOM_DATA_1"),
  
  
  CUSTOM_DATA_2("CUSTOM_DATA_2"),
  
  
  CUSTOM_DATA_3("CUSTOM_DATA_3"),
  
  
  CUSTOM_DATA_4("CUSTOM_DATA_4"),
  
  
  CUSTOM_DATA_5("CUSTOM_DATA_5"),
  
  
  CUSTOM_USER_ID("CUSTOM_USER_ID"),
  
  
  DAY("DAY"),
  
  
  DEAL_ID("DEAL_ID"),
  
  
  DEVICE_CLASS("DEVICE_CLASS"),
  
  
  DEVICE_TYPE("DEVICE_TYPE"),
  
  
  DOMAIN("DOMAIN"),
  
  
  ERROR_CODE("ERROR_CODE"),
  
  
  ERROR_PERCENTAGE("ERROR_PERCENTAGE"),
  
  
  ERROR_POSITION("ERROR_POSITION"),
  
  
  EXIT_POSITION("EXIT_POSITION"),
  
  
  EXPERIMENT_NAME("EXPERIMENT_NAME"),
  
  
  HOUR("HOUR"),
  
  
  IP_ADDRESS("IP_ADDRESS"),
  
  
  IS_LINEAR("IS_LINEAR"),
  
  
  ISP("ISP"),
  
  
  LANGUAGE("LANGUAGE"),
  
  
  LICENSE_KEY("LICENSE_KEY"),
  
  
  MANIFEST_DOWNLOAD_TIME("MANIFEST_DOWNLOAD_TIME"),
  
  
  MEDIA_PATH("MEDIA_PATH"),
  
  
  MEDIA_SERVER("MEDIA_SERVER"),
  
  
  MEDIA_URL("MEDIA_URL"),
  
  
  MIDPOINT("MIDPOINT"),
  
  
  MIN_SUGGESTED_DURATION("MIN_SUGGESTED_DURATION"),
  
  
  MINUTE("MINUTE"),
  
  
  MONTH("MONTH"),
  
  
  OPERATINGSYSTEM("OPERATINGSYSTEM"),
  
  
  OPERATINGSYSTEM_VERSION_MAJOR("OPERATINGSYSTEM_VERSION_MAJOR"),
  
  
  PAGE_LOAD_TIME("PAGE_LOAD_TIME"),
  
  
  PAGE_LOAD_TYPE("PAGE_LOAD_TYPE"),
  
  
  PATH("PATH"),
  
  
  PERCENTAGE_IN_VIEWPORT("PERCENTAGE_IN_VIEWPORT"),
  
  
  PLATFORM("PLATFORM"),
  
  
  PLAY_PERCENTAGE("PLAY_PERCENTAGE"),
  
  
  PLAYER("PLAYER"),
  
  
  PLAYER_KEY("PLAYER_KEY"),
  
  
  PLAYER_STARTUPTIME("PLAYER_STARTUPTIME"),
  
  
  PLAYER_TECH("PLAYER_TECH"),
  
  
  PLAYER_VERSION("PLAYER_VERSION"),
  
  
  QUARTILE_1("QUARTILE_1"),
  
  
  QUARTILE_3("QUARTILE_3"),
  
  
  REGION("REGION"),
  
  
  SCALE_FACTOR("SCALE_FACTOR"),
  
  
  SCREEN_HEIGHT("SCREEN_HEIGHT"),
  
  
  SCREEN_WIDTH("SCREEN_WIDTH"),
  
  
  SIZE("SIZE"),
  
  
  SKIP_PERCENTAGE("SKIP_PERCENTAGE"),
  
  
  SKIP_POSITION("SKIP_POSITION"),
  
  
  SKIPPED("SKIPPED"),
  
  
  STARTED("STARTED"),
  
  
  STREAM_FORMAT("STREAM_FORMAT"),
  
  
  SURVEY_URL("SURVEY_URL"),
  
  
  TIME("TIME"),
  
  
  TIME_FROM_CONTENT("TIME_FROM_CONTENT"),
  
  
  TIME_IN_VIEWPORT("TIME_IN_VIEWPORT"),
  
  
  TIME_PLAYED("TIME_PLAYED"),
  
  
  TIME_TO_CONTENT("TIME_TO_CONTENT"),
  
  
  UNIVERSAL_AD_ID_REGISTRY("UNIVERSAL_AD_ID_REGISTRY"),
  
  
  UNIVERSAL_AD_ID_VALUE("UNIVERSAL_AD_ID_VALUE"),
  
  
  USER_ID("USER_ID"),
  
  
  VIDEO_BITRATE("VIDEO_BITRATE"),
  
  
  VIDEO_CODEC("VIDEO_CODEC"),
  
  
  VIDEO_ID("VIDEO_ID"),
  
  
  VIDEO_IMPRESSION_ID("VIDEO_IMPRESSION_ID"),
  
  
  VIDEO_TITLE("VIDEO_TITLE"),
  
  
  VIDEO_WINDOW_HEIGHT("VIDEO_WINDOW_HEIGHT"),
  
  
  VIDEO_WINDOW_WIDTH("VIDEO_WINDOW_WIDTH");

  private String value;

  AdAnalyticsAttribute(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdAnalyticsAttribute fromValue(String text) {
    for (AdAnalyticsAttribute b : AdAnalyticsAttribute.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

