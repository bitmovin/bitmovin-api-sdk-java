package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Song
 */

public class Song {
  @JsonProperty("name")
  private String name;

  @JsonProperty("artist")
  private String artist;


  /**
   * Get name
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Set name
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Get artist
   * @return artist
   */
  public String getArtist() {
    return artist;
  }

  /**
   * Set artist
   *
   * @param artist
   */
  public void setArtist(String artist) {
    this.artist = artist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Song song = (Song) o;
    return Objects.equals(this.name, song.name) &&
        Objects.equals(this.artist, song.artist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, artist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Song {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
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

