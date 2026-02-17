package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.RtmpIngestPoint;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * UpdateEncodingRtmpIngestPointRequest
 */

public class UpdateEncodingRtmpIngestPointRequest {
  @JsonProperty("ingestPoints")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<RtmpIngestPoint> ingestPoints = new ArrayList<RtmpIngestPoint>();


  public UpdateEncodingRtmpIngestPointRequest addIngestPointsItem(RtmpIngestPoint ingestPointsItem) {
    this.ingestPoints.add(ingestPointsItem);
    return this;
  }

  /**
   * List of ingest points to be updated for the encoding. The RTMPs application name and streamKey will be assigned to the encoding. 
   * @return ingestPoints
   */
  public List<RtmpIngestPoint> getIngestPoints() {
    return ingestPoints;
  }

  /**
   * List of ingest points to be updated for the encoding. The RTMPs application name and streamKey will be assigned to the encoding. 
   *
   * @param ingestPoints
   *        List of ingest points to be updated for the encoding. The RTMPs application name and streamKey will be assigned to the encoding. 
   */
  public void setIngestPoints(List<RtmpIngestPoint> ingestPoints) {
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
    UpdateEncodingRtmpIngestPointRequest updateEncodingRtmpIngestPointRequest = (UpdateEncodingRtmpIngestPointRequest) o;
    return Objects.equals(this.ingestPoints, updateEncodingRtmpIngestPointRequest.ingestPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingestPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEncodingRtmpIngestPointRequest {\n");
    
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

