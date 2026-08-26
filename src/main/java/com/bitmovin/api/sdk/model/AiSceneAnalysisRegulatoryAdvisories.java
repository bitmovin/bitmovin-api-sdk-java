package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.RegulatoryAdvisoryTopic;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AiSceneAnalysisRegulatoryAdvisories
 */

public class AiSceneAnalysisRegulatoryAdvisories {
  @JsonProperty("topics")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<RegulatoryAdvisoryTopic> topics = new ArrayList<RegulatoryAdvisoryTopic>();


  public AiSceneAnalysisRegulatoryAdvisories addTopicsItem(RegulatoryAdvisoryTopic topicsItem) {
    this.topics.add(topicsItem);
    return this;
  }

  /**
   * The regulatory advisory topics to screen the asset for. At least one topic must be set. (required)
   * @return topics
   */
  public List<RegulatoryAdvisoryTopic> getTopics() {
    return topics;
  }

  /**
   * The regulatory advisory topics to screen the asset for. At least one topic must be set. (required)
   *
   * @param topics
   *        The regulatory advisory topics to screen the asset for. At least one topic must be set. (required)
   */
  public void setTopics(List<RegulatoryAdvisoryTopic> topics) {
    this.topics = topics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiSceneAnalysisRegulatoryAdvisories aiSceneAnalysisRegulatoryAdvisories = (AiSceneAnalysisRegulatoryAdvisories) o;
    return Objects.equals(this.topics, aiSceneAnalysisRegulatoryAdvisories.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysisRegulatoryAdvisories {\n");
    
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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

