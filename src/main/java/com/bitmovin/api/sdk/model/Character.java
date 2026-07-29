package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.CharacterAppearance;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Character
 */

public class Character {
  @JsonProperty("characterAppearance")
  private CharacterAppearance characterAppearance;

  @JsonProperty("name")
  private String name;

  @JsonProperty("playedBy")
  private String playedBy;

  @JsonProperty("description")
  private String description;


  /**
   * Get characterAppearance
   * @return characterAppearance
   */
  public CharacterAppearance getCharacterAppearance() {
    return characterAppearance;
  }

  /**
   * Set characterAppearance
   *
   * @param characterAppearance
   */
  public void setCharacterAppearance(CharacterAppearance characterAppearance) {
    this.characterAppearance = characterAppearance;
  }


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
   * Get playedBy
   * @return playedBy
   */
  public String getPlayedBy() {
    return playedBy;
  }

  /**
   * Set playedBy
   *
   * @param playedBy
   */
  public void setPlayedBy(String playedBy) {
    this.playedBy = playedBy;
  }


  /**
   * Get description
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Set description
   *
   * @param description
   */
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Character character = (Character) o;
    return Objects.equals(this.characterAppearance, character.characterAppearance) &&
        Objects.equals(this.name, character.name) &&
        Objects.equals(this.playedBy, character.playedBy) &&
        Objects.equals(this.description, character.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterAppearance, name, playedBy, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Character {\n");
    
    sb.append("    characterAppearance: ").append(toIndentedString(characterAppearance)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    playedBy: ").append(toIndentedString(playedBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

