package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveAutoShutdownConfiguration;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * The auto shutdown configuration that was accepted and applied to the running Live Encoding, together with the instant the encoder armed the shutdown for.  &#x60;streamTimeoutMinutes&#x60; was applied from the moment the encoder accepted the update, not from the start of the encoding, so &#x60;scheduledShutdownAt&#x60; rather than the timeout value is what says when this encoding stops. 
 */

public class LiveAutoShutdownConfigurationUpdateResponse extends LiveAutoShutdownConfiguration {
  @JsonProperty("scheduledShutdownAt")
  private Date scheduledShutdownAt;

  /**
   * The instant at which the Live Encoding is currently scheduled to shut down, as reported by the encoder. &#x60;null&#x60; means no shutdown is scheduled.  &#x60;bytesReadTimeoutSeconds&#x60; is not reflected here, as it only arms once the input stops flowing, so the encoding can still shut down earlier than this. 
   * @return scheduledShutdownAt
   */
  public Date getScheduledShutdownAt() {
    return scheduledShutdownAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveAutoShutdownConfigurationUpdateResponse liveAutoShutdownConfigurationUpdateResponse = (LiveAutoShutdownConfigurationUpdateResponse) o;
    return Objects.equals(this.scheduledShutdownAt, liveAutoShutdownConfigurationUpdateResponse.scheduledShutdownAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledShutdownAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveAutoShutdownConfigurationUpdateResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    scheduledShutdownAt: ").append(toIndentedString(scheduledShutdownAt)).append("\n");
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

