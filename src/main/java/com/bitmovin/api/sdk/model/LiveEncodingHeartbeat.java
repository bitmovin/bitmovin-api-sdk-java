package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveEncodingHeartbeatEvent;
import com.bitmovin.api.sdk.model.LiveEncodingHeartbeatIngest;
import com.bitmovin.api.sdk.model.LiveEncodingHeartbeatOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Heartbeat data for a Live Encoding.
 */

public class LiveEncodingHeartbeat {
  @JsonProperty("timestamp")
  private Date timestamp;

  @JsonProperty("ingest")
  private LiveEncodingHeartbeatIngest ingest;

  @JsonProperty("events")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<LiveEncodingHeartbeatEvent> events = new ArrayList<LiveEncodingHeartbeatEvent>();

  @JsonProperty("output")
  private LiveEncodingHeartbeatOutput output;


  /**
   * timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   * @return timestamp
   */
  public Date getTimestamp() {
    return timestamp;
  }

  /**
   * timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   *
   * @param timestamp
   *        timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   */
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }


  /**
   * Information about the live ingestion status 
   * @return ingest
   */
  public LiveEncodingHeartbeatIngest getIngest() {
    return ingest;
  }

  /**
   * Information about the live ingestion status 
   *
   * @param ingest
   *        Information about the live ingestion status 
   */
  public void setIngest(LiveEncodingHeartbeatIngest ingest) {
    this.ingest = ingest;
  }


  public LiveEncodingHeartbeat addEventsItem(LiveEncodingHeartbeatEvent eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Live encoding heartbeat events 
   * @return events
   */
  public List<LiveEncodingHeartbeatEvent> getEvents() {
    return events;
  }

  /**
   * Live encoding heartbeat events 
   *
   * @param events
   *        Live encoding heartbeat events 
   */
  public void setEvents(List<LiveEncodingHeartbeatEvent> events) {
    this.events = events;
  }


  /**
   * Output statistics for the live encoding 
   * @return output
   */
  public LiveEncodingHeartbeatOutput getOutput() {
    return output;
  }

  /**
   * Output statistics for the live encoding 
   *
   * @param output
   *        Output statistics for the live encoding 
   */
  public void setOutput(LiveEncodingHeartbeatOutput output) {
    this.output = output;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingHeartbeat liveEncodingHeartbeat = (LiveEncodingHeartbeat) o;
    return Objects.equals(this.timestamp, liveEncodingHeartbeat.timestamp) &&
        Objects.equals(this.ingest, liveEncodingHeartbeat.ingest) &&
        Objects.equals(this.events, liveEncodingHeartbeat.events) &&
        Objects.equals(this.output, liveEncodingHeartbeat.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, ingest, events, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeat {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    ingest: ").append(toIndentedString(ingest)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

