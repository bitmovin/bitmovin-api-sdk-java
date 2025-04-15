package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Character;
import com.bitmovin.api.sdk.model.SceneObject;
import com.bitmovin.api.sdk.model.Setting;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Content
 */

public class Content {
  @JsonProperty("characters")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Character> characters = new ArrayList<Character>();

  @JsonProperty("objects")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<SceneObject> objects = new ArrayList<SceneObject>();

  @JsonProperty("settings")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Setting> settings = new ArrayList<Setting>();


  public Content addCharactersItem(Character charactersItem) {
    this.characters.add(charactersItem);
    return this;
  }

  /**
   * Get characters
   * @return characters
   */
  public List<Character> getCharacters() {
    return characters;
  }

  /**
   * Set characters
   *
   * @param characters
   */
  public void setCharacters(List<Character> characters) {
    this.characters = characters;
  }


  public Content addObjectsItem(SceneObject objectsItem) {
    this.objects.add(objectsItem);
    return this;
  }

  /**
   * Get objects
   * @return objects
   */
  public List<SceneObject> getObjects() {
    return objects;
  }

  /**
   * Set objects
   *
   * @param objects
   */
  public void setObjects(List<SceneObject> objects) {
    this.objects = objects;
  }


  public Content addSettingsItem(Setting settingsItem) {
    this.settings.add(settingsItem);
    return this;
  }

  /**
   * Get settings
   * @return settings
   */
  public List<Setting> getSettings() {
    return settings;
  }

  /**
   * Set settings
   *
   * @param settings
   */
  public void setSettings(List<Setting> settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Content content = (Content) o;
    return Objects.equals(this.characters, content.characters) &&
        Objects.equals(this.objects, content.objects) &&
        Objects.equals(this.settings, content.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characters, objects, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Content {\n");
    
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

