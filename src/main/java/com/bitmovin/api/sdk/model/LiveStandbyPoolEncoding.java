package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveStandbyPoolEncodingIngestPoint;
import com.bitmovin.api.sdk.model.LiveStandbyPoolEncodingManifest;
import com.bitmovin.api.sdk.model.LiveStandbyPoolEncodingStatus;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveStandbyPoolEncoding
 */

public class LiveStandbyPoolEncoding {
  @JsonProperty("id")
  private String id;

  @JsonProperty("createdAt")
  private String createdAt;

  @JsonProperty("modifiedAt")
  private String modifiedAt;

  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("manifests")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<LiveStandbyPoolEncodingManifest> manifests = new ArrayList<LiveStandbyPoolEncodingManifest>();

  @JsonProperty("ingestPoints")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<LiveStandbyPoolEncodingIngestPoint> ingestPoints = new ArrayList<LiveStandbyPoolEncodingIngestPoint>();

  @JsonProperty("status")
  private LiveStandbyPoolEncodingStatus status;

  /**
   * Get id
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Get modifiedAt
   * @return modifiedAt
   */
  public String getModifiedAt() {
    return modifiedAt;
  }

  /**
   * ID of the encoding that ready for ingest in the standby pool
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }


  public LiveStandbyPoolEncoding addManifestsItem(LiveStandbyPoolEncodingManifest manifestsItem) {
    this.manifests.add(manifestsItem);
    return this;
  }

  /**
   * Get manifests
   * @return manifests
   */
  public List<LiveStandbyPoolEncodingManifest> getManifests() {
    return manifests;
  }

  /**
   * Set manifests
   *
   * @param manifests
   */
  public void setManifests(List<LiveStandbyPoolEncodingManifest> manifests) {
    this.manifests = manifests;
  }


  public LiveStandbyPoolEncoding addIngestPointsItem(LiveStandbyPoolEncodingIngestPoint ingestPointsItem) {
    this.ingestPoints.add(ingestPointsItem);
    return this;
  }

  /**
   * Get ingestPoints
   * @return ingestPoints
   */
  public List<LiveStandbyPoolEncodingIngestPoint> getIngestPoints() {
    return ingestPoints;
  }

  /**
   * Set ingestPoints
   *
   * @param ingestPoints
   */
  public void setIngestPoints(List<LiveStandbyPoolEncodingIngestPoint> ingestPoints) {
    this.ingestPoints = ingestPoints;
  }


  /**
   * Get status
   * @return status
   */
  public LiveStandbyPoolEncodingStatus getStatus() {
    return status;
  }

  /**
   * Set status
   *
   * @param status
   */
  public void setStatus(LiveStandbyPoolEncodingStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStandbyPoolEncoding liveStandbyPoolEncoding = (LiveStandbyPoolEncoding) o;
    return Objects.equals(this.id, liveStandbyPoolEncoding.id) &&
        Objects.equals(this.createdAt, liveStandbyPoolEncoding.createdAt) &&
        Objects.equals(this.modifiedAt, liveStandbyPoolEncoding.modifiedAt) &&
        Objects.equals(this.encodingId, liveStandbyPoolEncoding.encodingId) &&
        Objects.equals(this.manifests, liveStandbyPoolEncoding.manifests) &&
        Objects.equals(this.ingestPoints, liveStandbyPoolEncoding.ingestPoints) &&
        Objects.equals(this.status, liveStandbyPoolEncoding.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, modifiedAt, encodingId, manifests, ingestPoints, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStandbyPoolEncoding {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    ingestPoints: ").append(toIndentedString(ingestPoints)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

