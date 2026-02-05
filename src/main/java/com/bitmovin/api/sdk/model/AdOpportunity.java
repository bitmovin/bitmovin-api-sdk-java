package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AdOpportunity
 */

public class AdOpportunity {
  @JsonProperty("reason")
  private String reason;

  @JsonProperty("score")
  private BigDecimal score;


  /**
   * The reason why the scene was rated with a certain score
   * @return reason
   */
  public String getReason() {
    return reason;
  }

  /**
   * The reason why the scene was rated with a certain score
   *
   * @param reason
   *        The reason why the scene was rated with a certain score
   */
  public void setReason(String reason) {
    this.reason = reason;
  }


  /**
   * Score from 0.0 to 1.0 rating the ad placement suitability at the end of a scene based on content analysis
   * minimum: 0
   * maximum: 1
   * @return score
   */
  public BigDecimal getScore() {
    return score;
  }

  /**
   * Score from 0.0 to 1.0 rating the ad placement suitability at the end of a scene based on content analysis
   * minimum: 0
   * maximum: 1
   *
   * @param score
   *        Score from 0.0 to 1.0 rating the ad placement suitability at the end of a scene based on content analysis
   *        minimum: 0
   *        maximum: 1
   */
  public void setScore(BigDecimal score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdOpportunity adOpportunity = (AdOpportunity) o;
    return Objects.equals(this.reason, adOpportunity.reason) &&
        Objects.equals(this.score, adOpportunity.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdOpportunity {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

