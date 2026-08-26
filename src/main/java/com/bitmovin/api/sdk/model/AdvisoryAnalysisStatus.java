package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AdvisoryAnalysisStatus {
  
  /**
   * The shot was analysed for content advisories. An empty list of advisories means none were found
   */
  ANALYZED("ANALYZED"),
  
  /**
   * The shot could not be analysed because the request was blocked by the model safety filter, so no verdict exists for it. Such a shot is reported conservatively rather than as clean: it carries a TOBACCO advisory with UNKNOWN confidence, which is an assumption made on the absence of a verdict and not an observation. Review these shots manually
   */
  BLOCKED("BLOCKED");

  private String value;

  AdvisoryAnalysisStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdvisoryAnalysisStatus fromValue(String text) {
    for (AdvisoryAnalysisStatus b : AdvisoryAnalysisStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

