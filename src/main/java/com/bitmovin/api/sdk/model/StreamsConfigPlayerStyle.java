package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Player style config
 */

public class StreamsConfigPlayerStyle {
  @JsonProperty("playbackMarkerBgColor")
  private String playbackMarkerBgColor;

  @JsonProperty("playbackMarkerBorderColor")
  private String playbackMarkerBorderColor;

  @JsonProperty("playbackTrackPlayedColor")
  private String playbackTrackPlayedColor;

  @JsonProperty("playbackTrackBufferedColor")
  private String playbackTrackBufferedColor;

  @JsonProperty("playbackTrackBgColor")
  private String playbackTrackBgColor;

  @JsonProperty("textColor")
  private String textColor;

  @JsonProperty("backgroundColor")
  private String backgroundColor;


  /**
   * Playback marker background color
   * @return playbackMarkerBgColor
   */
  public String getPlaybackMarkerBgColor() {
    return playbackMarkerBgColor;
  }

  /**
   * Playback marker background color
   *
   * @param playbackMarkerBgColor
   *        Playback marker background color
   */
  public void setPlaybackMarkerBgColor(String playbackMarkerBgColor) {
    this.playbackMarkerBgColor = playbackMarkerBgColor;
  }


  /**
   * Playback marker border color
   * @return playbackMarkerBorderColor
   */
  public String getPlaybackMarkerBorderColor() {
    return playbackMarkerBorderColor;
  }

  /**
   * Playback marker border color
   *
   * @param playbackMarkerBorderColor
   *        Playback marker border color
   */
  public void setPlaybackMarkerBorderColor(String playbackMarkerBorderColor) {
    this.playbackMarkerBorderColor = playbackMarkerBorderColor;
  }


  /**
   * Playback track played color
   * @return playbackTrackPlayedColor
   */
  public String getPlaybackTrackPlayedColor() {
    return playbackTrackPlayedColor;
  }

  /**
   * Playback track played color
   *
   * @param playbackTrackPlayedColor
   *        Playback track played color
   */
  public void setPlaybackTrackPlayedColor(String playbackTrackPlayedColor) {
    this.playbackTrackPlayedColor = playbackTrackPlayedColor;
  }


  /**
   * Playback track buffered color
   * @return playbackTrackBufferedColor
   */
  public String getPlaybackTrackBufferedColor() {
    return playbackTrackBufferedColor;
  }

  /**
   * Playback track buffered color
   *
   * @param playbackTrackBufferedColor
   *        Playback track buffered color
   */
  public void setPlaybackTrackBufferedColor(String playbackTrackBufferedColor) {
    this.playbackTrackBufferedColor = playbackTrackBufferedColor;
  }


  /**
   * Playback track background color
   * @return playbackTrackBgColor
   */
  public String getPlaybackTrackBgColor() {
    return playbackTrackBgColor;
  }

  /**
   * Playback track background color
   *
   * @param playbackTrackBgColor
   *        Playback track background color
   */
  public void setPlaybackTrackBgColor(String playbackTrackBgColor) {
    this.playbackTrackBgColor = playbackTrackBgColor;
  }


  /**
   * Text color
   * @return textColor
   */
  public String getTextColor() {
    return textColor;
  }

  /**
   * Text color
   *
   * @param textColor
   *        Text color
   */
  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }


  /**
   * Background color
   * @return backgroundColor
   */
  public String getBackgroundColor() {
    return backgroundColor;
  }

  /**
   * Background color
   *
   * @param backgroundColor
   *        Background color
   */
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsConfigPlayerStyle streamsConfigPlayerStyle = (StreamsConfigPlayerStyle) o;
    return Objects.equals(this.playbackMarkerBgColor, streamsConfigPlayerStyle.playbackMarkerBgColor) &&
        Objects.equals(this.playbackMarkerBorderColor, streamsConfigPlayerStyle.playbackMarkerBorderColor) &&
        Objects.equals(this.playbackTrackPlayedColor, streamsConfigPlayerStyle.playbackTrackPlayedColor) &&
        Objects.equals(this.playbackTrackBufferedColor, streamsConfigPlayerStyle.playbackTrackBufferedColor) &&
        Objects.equals(this.playbackTrackBgColor, streamsConfigPlayerStyle.playbackTrackBgColor) &&
        Objects.equals(this.textColor, streamsConfigPlayerStyle.textColor) &&
        Objects.equals(this.backgroundColor, streamsConfigPlayerStyle.backgroundColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playbackMarkerBgColor, playbackMarkerBorderColor, playbackTrackPlayedColor, playbackTrackBufferedColor, playbackTrackBgColor, textColor, backgroundColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsConfigPlayerStyle {\n");
    
    sb.append("    playbackMarkerBgColor: ").append(toIndentedString(playbackMarkerBgColor)).append("\n");
    sb.append("    playbackMarkerBorderColor: ").append(toIndentedString(playbackMarkerBorderColor)).append("\n");
    sb.append("    playbackTrackPlayedColor: ").append(toIndentedString(playbackTrackPlayedColor)).append("\n");
    sb.append("    playbackTrackBufferedColor: ").append(toIndentedString(playbackTrackBufferedColor)).append("\n");
    sb.append("    playbackTrackBgColor: ").append(toIndentedString(playbackTrackBgColor)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
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

