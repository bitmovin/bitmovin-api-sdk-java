package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AutomaticAdPlacementPosition;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AiContentAnalysisAutomaticAdPlacement
 */

public class AiContentAnalysisAutomaticAdPlacement {
  @JsonProperty("schedule")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AutomaticAdPlacementPosition> schedule = new ArrayList<AutomaticAdPlacementPosition>();


  public AiContentAnalysisAutomaticAdPlacement addScheduleItem(AutomaticAdPlacementPosition scheduleItem) {
    this.schedule.add(scheduleItem);
    return this;
  }

  /**
   * Ad placements schedule 
   * @return schedule
   */
  public List<AutomaticAdPlacementPosition> getSchedule() {
    return schedule;
  }

  /**
   * Ad placements schedule 
   *
   * @param schedule
   *        Ad placements schedule 
   */
  public void setSchedule(List<AutomaticAdPlacementPosition> schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiContentAnalysisAutomaticAdPlacement aiContentAnalysisAutomaticAdPlacement = (AiContentAnalysisAutomaticAdPlacement) o;
    return Objects.equals(this.schedule, aiContentAnalysisAutomaticAdPlacement.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiContentAnalysisAutomaticAdPlacement {\n");
    
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

