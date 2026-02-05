package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ScenePacing;
import com.bitmovin.api.sdk.model.SceneTension;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SceneDynamics
 */

public class SceneDynamics {
  @JsonProperty("tension")
  private SceneTension tension;

  @JsonProperty("pacing")
  private ScenePacing pacing;


  /**
   * The detected tension of the scene based on content analysis
   * @return tension
   */
  public SceneTension getTension() {
    return tension;
  }

  /**
   * The detected tension of the scene based on content analysis
   *
   * @param tension
   *        The detected tension of the scene based on content analysis
   */
  public void setTension(SceneTension tension) {
    this.tension = tension;
  }


  /**
   * The detected pacing of the scene based on content analysis
   * @return pacing
   */
  public ScenePacing getPacing() {
    return pacing;
  }

  /**
   * The detected pacing of the scene based on content analysis
   *
   * @param pacing
   *        The detected pacing of the scene based on content analysis
   */
  public void setPacing(ScenePacing pacing) {
    this.pacing = pacing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneDynamics sceneDynamics = (SceneDynamics) o;
    return Objects.equals(this.tension, sceneDynamics.tension) &&
        Objects.equals(this.pacing, sceneDynamics.pacing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tension, pacing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneDynamics {\n");
    
    sb.append("    tension: ").append(toIndentedString(tension)).append("\n");
    sb.append("    pacing: ").append(toIndentedString(pacing)).append("\n");
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

