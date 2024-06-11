package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AzureSpeechServicesCredentials;
import com.bitmovin.api.sdk.model.AzureSpeechToCaptionsProfanity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AzureSpeechToCaptionsSettings
 */

public class AzureSpeechToCaptionsSettings {
  @JsonProperty("azureSpeechServicesCredentials")
  private AzureSpeechServicesCredentials azureSpeechServicesCredentials;

  @JsonProperty("region")
  private String region;

  @JsonProperty("apiEndpoint")
  private String apiEndpoint;

  @JsonProperty("language")
  private String language;

  @JsonProperty("captionDelay")
  private Long captionDelay;

  @JsonProperty("captionRemainTime")
  private Long captionRemainTime;

  @JsonProperty("captionMaxLineLength")
  private Long captionMaxLineLength;

  @JsonProperty("captionLines")
  private Long captionLines;

  @JsonProperty("profanityOption")
  private AzureSpeechToCaptionsProfanity profanityOption;


  /**
   * Credential settings to access Azure Speech Services 
   * @return azureSpeechServicesCredentials
   */
  public AzureSpeechServicesCredentials getAzureSpeechServicesCredentials() {
    return azureSpeechServicesCredentials;
  }

  /**
   * Credential settings to access Azure Speech Services 
   *
   * @param azureSpeechServicesCredentials
   *        Credential settings to access Azure Speech Services 
   */
  public void setAzureSpeechServicesCredentials(AzureSpeechServicesCredentials azureSpeechServicesCredentials) {
    this.azureSpeechServicesCredentials = azureSpeechServicesCredentials;
  }


  /**
   * Azure Speech Services Region Identifier. The list of speech service supported regions can be found at Azure&#39;s official documentation. 
   * @return region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Azure Speech Services Region Identifier. The list of speech service supported regions can be found at Azure&#39;s official documentation. 
   *
   * @param region
   *        Azure Speech Services Region Identifier. The list of speech service supported regions can be found at Azure&#39;s official documentation. 
   */
  public void setRegion(String region) {
    this.region = region;
  }


  /**
   * Azure Speech Services API endpoint. This information can be found in Azure&#39;s Speech resource data. 
   * @return apiEndpoint
   */
  public String getApiEndpoint() {
    return apiEndpoint;
  }

  /**
   * Azure Speech Services API endpoint. This information can be found in Azure&#39;s Speech resource data. 
   *
   * @param apiEndpoint
   *        Azure Speech Services API endpoint. This information can be found in Azure&#39;s Speech resource data. 
   */
  public void setApiEndpoint(String apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
  }


  /**
   * Azure Speech to captions supported language (IETF BCP 47 language tag). The list of supported languages can be found at Azure&#39;s official documentation. 
   * @return language
   */
  public String getLanguage() {
    return language;
  }

  /**
   * Azure Speech to captions supported language (IETF BCP 47 language tag). The list of supported languages can be found at Azure&#39;s official documentation. 
   *
   * @param language
   *        Azure Speech to captions supported language (IETF BCP 47 language tag). The list of supported languages can be found at Azure&#39;s official documentation. 
   */
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * How many MILLISECONDS to delay the display of each caption, to mimic a real-time experience. The minimum value is 0. 
   * @return captionDelay
   */
  public Long getCaptionDelay() {
    return captionDelay;
  }

  /**
   * How many MILLISECONDS to delay the display of each caption, to mimic a real-time experience. The minimum value is 0. 
   *
   * @param captionDelay
   *        How many MILLISECONDS to delay the display of each caption, to mimic a real-time experience. The minimum value is 0. 
   */
  public void setCaptionDelay(Long captionDelay) {
    this.captionDelay = captionDelay;
  }


  /**
   * How many MILLISECONDS a caption should remain on screen if it is not replaced by another. The minimum value is 0. 
   * @return captionRemainTime
   */
  public Long getCaptionRemainTime() {
    return captionRemainTime;
  }

  /**
   * How many MILLISECONDS a caption should remain on screen if it is not replaced by another. The minimum value is 0. 
   *
   * @param captionRemainTime
   *        How many MILLISECONDS a caption should remain on screen if it is not replaced by another. The minimum value is 0. 
   */
  public void setCaptionRemainTime(Long captionRemainTime) {
    this.captionRemainTime = captionRemainTime;
  }


  /**
   * The maximum number of characters per line for a caption.  The minimum value is 20. 
   * @return captionMaxLineLength
   */
  public Long getCaptionMaxLineLength() {
    return captionMaxLineLength;
  }

  /**
   * The maximum number of characters per line for a caption.  The minimum value is 20. 
   *
   * @param captionMaxLineLength
   *        The maximum number of characters per line for a caption.  The minimum value is 20. 
   */
  public void setCaptionMaxLineLength(Long captionMaxLineLength) {
    this.captionMaxLineLength = captionMaxLineLength;
  }


  /**
   * The number of lines for a caption. The minimum value is 1. 
   * @return captionLines
   */
  public Long getCaptionLines() {
    return captionLines;
  }

  /**
   * The number of lines for a caption. The minimum value is 1. 
   *
   * @param captionLines
   *        The number of lines for a caption. The minimum value is 1. 
   */
  public void setCaptionLines(Long captionLines) {
    this.captionLines = captionLines;
  }


  /**
   * The profanity filter options are:  - Masked: Replaces letters in profane words with asterisk (*) characters. - Raw: Include the profane words verbatim. - Removed: Removes profane words. 
   * @return profanityOption
   */
  public AzureSpeechToCaptionsProfanity getProfanityOption() {
    return profanityOption;
  }

  /**
   * The profanity filter options are:  - Masked: Replaces letters in profane words with asterisk (*) characters. - Raw: Include the profane words verbatim. - Removed: Removes profane words. 
   *
   * @param profanityOption
   *        The profanity filter options are:  - Masked: Replaces letters in profane words with asterisk (*) characters. - Raw: Include the profane words verbatim. - Removed: Removes profane words. 
   */
  public void setProfanityOption(AzureSpeechToCaptionsProfanity profanityOption) {
    this.profanityOption = profanityOption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureSpeechToCaptionsSettings azureSpeechToCaptionsSettings = (AzureSpeechToCaptionsSettings) o;
    return Objects.equals(this.azureSpeechServicesCredentials, azureSpeechToCaptionsSettings.azureSpeechServicesCredentials) &&
        Objects.equals(this.region, azureSpeechToCaptionsSettings.region) &&
        Objects.equals(this.apiEndpoint, azureSpeechToCaptionsSettings.apiEndpoint) &&
        Objects.equals(this.language, azureSpeechToCaptionsSettings.language) &&
        Objects.equals(this.captionDelay, azureSpeechToCaptionsSettings.captionDelay) &&
        Objects.equals(this.captionRemainTime, azureSpeechToCaptionsSettings.captionRemainTime) &&
        Objects.equals(this.captionMaxLineLength, azureSpeechToCaptionsSettings.captionMaxLineLength) &&
        Objects.equals(this.captionLines, azureSpeechToCaptionsSettings.captionLines) &&
        Objects.equals(this.profanityOption, azureSpeechToCaptionsSettings.profanityOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureSpeechServicesCredentials, region, apiEndpoint, language, captionDelay, captionRemainTime, captionMaxLineLength, captionLines, profanityOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureSpeechToCaptionsSettings {\n");
    
    sb.append("    azureSpeechServicesCredentials: ").append(toIndentedString(azureSpeechServicesCredentials)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    apiEndpoint: ").append(toIndentedString(apiEndpoint)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    captionDelay: ").append(toIndentedString(captionDelay)).append("\n");
    sb.append("    captionRemainTime: ").append(toIndentedString(captionRemainTime)).append("\n");
    sb.append("    captionMaxLineLength: ").append(toIndentedString(captionMaxLineLength)).append("\n");
    sb.append("    captionLines: ").append(toIndentedString(captionLines)).append("\n");
    sb.append("    profanityOption: ").append(toIndentedString(profanityOption)).append("\n");
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

