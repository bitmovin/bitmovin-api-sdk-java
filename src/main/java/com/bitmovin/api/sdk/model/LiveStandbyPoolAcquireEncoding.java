package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveStandbyPoolEncodingIngestPoint;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveStandbyPoolAcquireEncoding
 */

public class LiveStandbyPoolAcquireEncoding {
  @JsonProperty("ingestPoints")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<LiveStandbyPoolEncodingIngestPoint> ingestPoints = new ArrayList<LiveStandbyPoolEncodingIngestPoint>();


  public LiveStandbyPoolAcquireEncoding addIngestPointsItem(LiveStandbyPoolEncodingIngestPoint ingestPointsItem) {
    this.ingestPoints.add(ingestPointsItem);
    return this;
  }

  /**
   * Note: This is not implemented yet and will be ignored if provided. List of ingest points to be used for the acquired encoding. The DNS hostname and RTMPs application name and streamKey will be assigned to the encoding. 
   * @return ingestPoints
   */
  public List<LiveStandbyPoolEncodingIngestPoint> getIngestPoints() {
    return ingestPoints;
  }

  /**
   * Note: This is not implemented yet and will be ignored if provided. List of ingest points to be used for the acquired encoding. The DNS hostname and RTMPs application name and streamKey will be assigned to the encoding. 
   *
   * @param ingestPoints
   *        Note: This is not implemented yet and will be ignored if provided. List of ingest points to be used for the acquired encoding. The DNS hostname and RTMPs application name and streamKey will be assigned to the encoding. 
   */
  public void setIngestPoints(List<LiveStandbyPoolEncodingIngestPoint> ingestPoints) {
    this.ingestPoints = ingestPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStandbyPoolAcquireEncoding liveStandbyPoolAcquireEncoding = (LiveStandbyPoolAcquireEncoding) o;
    return Objects.equals(this.ingestPoints, liveStandbyPoolAcquireEncoding.ingestPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingestPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStandbyPoolAcquireEncoding {\n");
    
    sb.append("    ingestPoints: ").append(toIndentedString(ingestPoints)).append("\n");
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

