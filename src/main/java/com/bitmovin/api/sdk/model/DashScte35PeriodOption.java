package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DashScte35PeriodOption {
  
  /**
   * Controls how SCTE-35 signals are applied at the DASH period level. &lt;ul&gt;   &lt;li&gt;SINGLE_PERIOD: Applies SCTE markers to a single DASH period.&lt;/li&gt;   &lt;li&gt;MULTI_PERIOD: Multiple periods are created based on received SCTE-35 messages.&lt;/li&gt; &lt;/ul&gt; 
   */
  SINGLE_PERIOD("SINGLE_PERIOD"),
  
  /**
   * Controls how SCTE-35 signals are applied at the DASH period level. &lt;ul&gt;   &lt;li&gt;SINGLE_PERIOD: Applies SCTE markers to a single DASH period.&lt;/li&gt;   &lt;li&gt;MULTI_PERIOD: Multiple periods are created based on received SCTE-35 messages.&lt;/li&gt; &lt;/ul&gt; 
   */
  MULTI_PERIOD("MULTI_PERIOD");

  private String value;

  DashScte35PeriodOption(String value) {
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
  public static DashScte35PeriodOption fromValue(String text) {
    for (DashScte35PeriodOption b : DashScte35PeriodOption.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

