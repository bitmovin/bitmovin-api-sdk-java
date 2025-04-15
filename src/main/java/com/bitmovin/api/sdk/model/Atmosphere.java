package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Atmosphere
 */

public class Atmosphere {
  @JsonProperty("mood")
  private String mood;

  @JsonProperty("lighting")
  private String lighting;

  @JsonProperty("weather")
  private String weather;


  /**
   * Get mood
   * @return mood
   */
  public String getMood() {
    return mood;
  }

  /**
   * Set mood
   *
   * @param mood
   */
  public void setMood(String mood) {
    this.mood = mood;
  }


  /**
   * Get lighting
   * @return lighting
   */
  public String getLighting() {
    return lighting;
  }

  /**
   * Set lighting
   *
   * @param lighting
   */
  public void setLighting(String lighting) {
    this.lighting = lighting;
  }


  /**
   * Get weather
   * @return weather
   */
  public String getWeather() {
    return weather;
  }

  /**
   * Set weather
   *
   * @param weather
   */
  public void setWeather(String weather) {
    this.weather = weather;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Atmosphere atmosphere = (Atmosphere) o;
    return Objects.equals(this.mood, atmosphere.mood) &&
        Objects.equals(this.lighting, atmosphere.lighting) &&
        Objects.equals(this.weather, atmosphere.weather);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mood, lighting, weather);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Atmosphere {\n");
    
    sb.append("    mood: ").append(toIndentedString(mood)).append("\n");
    sb.append("    lighting: ").append(toIndentedString(lighting)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
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

