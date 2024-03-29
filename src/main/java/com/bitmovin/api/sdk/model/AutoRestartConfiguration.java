package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AutoRestartConfiguration
 */

public class AutoRestartConfiguration {
  @JsonProperty("segmentsWrittenTimeout")
  private Double segmentsWrittenTimeout;

  @JsonProperty("bytesWrittenTimeout")
  private Double bytesWrittenTimeout;

  @JsonProperty("framesWrittenTimeout")
  private Double framesWrittenTimeout;

  @JsonProperty("hlsManifestsUpdateTimeout")
  private Double hlsManifestsUpdateTimeout;

  @JsonProperty("dashManifestsUpdateTimeout")
  private Double dashManifestsUpdateTimeout;

  @JsonProperty("scheduleExpression")
  private String scheduleExpression;

  @JsonProperty("restartOnEncoderError")
  private Boolean restartOnEncoderError;


  /**
   * If no segments were generated for the given number of seconds, a restart is triggered. Minimum: 30.0
   * minimum: 30
   * @return segmentsWrittenTimeout
   */
  public Double getSegmentsWrittenTimeout() {
    return segmentsWrittenTimeout;
  }

  /**
   * If no segments were generated for the given number of seconds, a restart is triggered. Minimum: 30.0
   * minimum: 30
   *
   * @param segmentsWrittenTimeout
   *        If no segments were generated for the given number of seconds, a restart is triggered. Minimum: 30.0
   *        minimum: 30
   */
  public void setSegmentsWrittenTimeout(Double segmentsWrittenTimeout) {
    this.segmentsWrittenTimeout = segmentsWrittenTimeout;
  }


  /**
   * If no data was written for the given number of seconds, a restart is triggered. Minimum: 30.0
   * minimum: 30
   * @return bytesWrittenTimeout
   */
  public Double getBytesWrittenTimeout() {
    return bytesWrittenTimeout;
  }

  /**
   * If no data was written for the given number of seconds, a restart is triggered. Minimum: 30.0
   * minimum: 30
   *
   * @param bytesWrittenTimeout
   *        If no data was written for the given number of seconds, a restart is triggered. Minimum: 30.0
   *        minimum: 30
   */
  public void setBytesWrittenTimeout(Double bytesWrittenTimeout) {
    this.bytesWrittenTimeout = bytesWrittenTimeout;
  }


  /**
   * If no frames were generated for the given number of seconds, a restart is triggered. Minimum: 30.0
   * minimum: 30
   * @return framesWrittenTimeout
   */
  public Double getFramesWrittenTimeout() {
    return framesWrittenTimeout;
  }

  /**
   * If no frames were generated for the given number of seconds, a restart is triggered. Minimum: 30.0
   * minimum: 30
   *
   * @param framesWrittenTimeout
   *        If no frames were generated for the given number of seconds, a restart is triggered. Minimum: 30.0
   *        minimum: 30
   */
  public void setFramesWrittenTimeout(Double framesWrittenTimeout) {
    this.framesWrittenTimeout = framesWrittenTimeout;
  }


  /**
   * If HLS manifests were not updated for the given number of seconds, a restart is triggered. Minimum: 30.0
   * minimum: 30
   * @return hlsManifestsUpdateTimeout
   */
  public Double getHlsManifestsUpdateTimeout() {
    return hlsManifestsUpdateTimeout;
  }

  /**
   * If HLS manifests were not updated for the given number of seconds, a restart is triggered. Minimum: 30.0
   * minimum: 30
   *
   * @param hlsManifestsUpdateTimeout
   *        If HLS manifests were not updated for the given number of seconds, a restart is triggered. Minimum: 30.0
   *        minimum: 30
   */
  public void setHlsManifestsUpdateTimeout(Double hlsManifestsUpdateTimeout) {
    this.hlsManifestsUpdateTimeout = hlsManifestsUpdateTimeout;
  }


  /**
   * If DASH manifests were not updated for the given number of seconds, a restart is triggered. Minimum: 30.0
   * minimum: 30
   * @return dashManifestsUpdateTimeout
   */
  public Double getDashManifestsUpdateTimeout() {
    return dashManifestsUpdateTimeout;
  }

  /**
   * If DASH manifests were not updated for the given number of seconds, a restart is triggered. Minimum: 30.0
   * minimum: 30
   *
   * @param dashManifestsUpdateTimeout
   *        If DASH manifests were not updated for the given number of seconds, a restart is triggered. Minimum: 30.0
   *        minimum: 30
   */
  public void setDashManifestsUpdateTimeout(Double dashManifestsUpdateTimeout) {
    this.dashManifestsUpdateTimeout = dashManifestsUpdateTimeout;
  }


  /**
   * Defines a schedule for restarts using the unix crontab syntax. This example would trigger a restart every monday at 05:30 (AM)
   * @return scheduleExpression
   */
  public String getScheduleExpression() {
    return scheduleExpression;
  }

  /**
   * Defines a schedule for restarts using the unix crontab syntax. This example would trigger a restart every monday at 05:30 (AM)
   *
   * @param scheduleExpression
   *        Defines a schedule for restarts using the unix crontab syntax. This example would trigger a restart every monday at 05:30 (AM)
   */
  public void setScheduleExpression(String scheduleExpression) {
    this.scheduleExpression = scheduleExpression;
  }


  /**
   * Defines if the encoding should be restarted in case of an error during encoding.
   * @return restartOnEncoderError
   */
  public Boolean getRestartOnEncoderError() {
    return restartOnEncoderError;
  }

  /**
   * Defines if the encoding should be restarted in case of an error during encoding.
   *
   * @param restartOnEncoderError
   *        Defines if the encoding should be restarted in case of an error during encoding.
   */
  public void setRestartOnEncoderError(Boolean restartOnEncoderError) {
    this.restartOnEncoderError = restartOnEncoderError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoRestartConfiguration autoRestartConfiguration = (AutoRestartConfiguration) o;
    return Objects.equals(this.segmentsWrittenTimeout, autoRestartConfiguration.segmentsWrittenTimeout) &&
        Objects.equals(this.bytesWrittenTimeout, autoRestartConfiguration.bytesWrittenTimeout) &&
        Objects.equals(this.framesWrittenTimeout, autoRestartConfiguration.framesWrittenTimeout) &&
        Objects.equals(this.hlsManifestsUpdateTimeout, autoRestartConfiguration.hlsManifestsUpdateTimeout) &&
        Objects.equals(this.dashManifestsUpdateTimeout, autoRestartConfiguration.dashManifestsUpdateTimeout) &&
        Objects.equals(this.scheduleExpression, autoRestartConfiguration.scheduleExpression) &&
        Objects.equals(this.restartOnEncoderError, autoRestartConfiguration.restartOnEncoderError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentsWrittenTimeout, bytesWrittenTimeout, framesWrittenTimeout, hlsManifestsUpdateTimeout, dashManifestsUpdateTimeout, scheduleExpression, restartOnEncoderError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoRestartConfiguration {\n");
    
    sb.append("    segmentsWrittenTimeout: ").append(toIndentedString(segmentsWrittenTimeout)).append("\n");
    sb.append("    bytesWrittenTimeout: ").append(toIndentedString(bytesWrittenTimeout)).append("\n");
    sb.append("    framesWrittenTimeout: ").append(toIndentedString(framesWrittenTimeout)).append("\n");
    sb.append("    hlsManifestsUpdateTimeout: ").append(toIndentedString(hlsManifestsUpdateTimeout)).append("\n");
    sb.append("    dashManifestsUpdateTimeout: ").append(toIndentedString(dashManifestsUpdateTimeout)).append("\n");
    sb.append("    scheduleExpression: ").append(toIndentedString(scheduleExpression)).append("\n");
    sb.append("    restartOnEncoderError: ").append(toIndentedString(restartOnEncoderError)).append("\n");
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

