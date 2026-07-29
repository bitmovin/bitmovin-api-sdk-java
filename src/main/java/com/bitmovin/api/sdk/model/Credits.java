package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Person;
import com.bitmovin.api.sdk.model.Song;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Credits
 */

public class Credits {
  @JsonProperty("persons")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Person> persons = new ArrayList<Person>();

  @JsonProperty("songs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Song> songs = new ArrayList<Song>();


  public Credits addPersonsItem(Person personsItem) {
    this.persons.add(personsItem);
    return this;
  }

  /**
   * Get persons
   * @return persons
   */
  public List<Person> getPersons() {
    return persons;
  }

  /**
   * Set persons
   *
   * @param persons
   */
  public void setPersons(List<Person> persons) {
    this.persons = persons;
  }


  public Credits addSongsItem(Song songsItem) {
    this.songs.add(songsItem);
    return this;
  }

  /**
   * Get songs
   * @return songs
   */
  public List<Song> getSongs() {
    return songs;
  }

  /**
   * Set songs
   *
   * @param songs
   */
  public void setSongs(List<Song> songs) {
    this.songs = songs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credits credits = (Credits) o;
    return Objects.equals(this.persons, credits.persons) &&
        Objects.equals(this.songs, credits.songs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persons, songs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credits {\n");
    
    sb.append("    persons: ").append(toIndentedString(persons)).append("\n");
    sb.append("    songs: ").append(toIndentedString(songs)).append("\n");
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

