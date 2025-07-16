package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DashScte35EventStreamSignalling {
  
  /**
   * Defines how SCTE-35 events are delivered using DASH EventStream. &lt;ul&gt;   &lt;li&gt;XML: Events will contain an XML representation of a SCTE-35 cue message as a SpliceInfoSection element as defined in SCTE-35. The schemeIdUri will be \&quot;urn:scte:scte35:2013:xml.&lt;/li&gt;   &lt;li&gt;XML_BIN: Events will contain an XML representation of a SCTE-35 cue message as a Signal.Binary element as defined in SCTE-35. The schemeIdUri will be \&quot;urn:scte:scte35:2014:xml+bin&lt;/li&gt; &lt;/ul&gt; 
   */
  XML("XML"),
  
  /**
   * Defines how SCTE-35 events are delivered using DASH EventStream. &lt;ul&gt;   &lt;li&gt;XML: Events will contain an XML representation of a SCTE-35 cue message as a SpliceInfoSection element as defined in SCTE-35. The schemeIdUri will be \&quot;urn:scte:scte35:2013:xml.&lt;/li&gt;   &lt;li&gt;XML_BIN: Events will contain an XML representation of a SCTE-35 cue message as a Signal.Binary element as defined in SCTE-35. The schemeIdUri will be \&quot;urn:scte:scte35:2014:xml+bin&lt;/li&gt; &lt;/ul&gt; 
   */
  XML_BIN("XML_BIN");

  private String value;

  DashScte35EventStreamSignalling(String value) {
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
  public static DashScte35EventStreamSignalling fromValue(String text) {
    for (DashScte35EventStreamSignalling b : DashScte35EventStreamSignalling.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

