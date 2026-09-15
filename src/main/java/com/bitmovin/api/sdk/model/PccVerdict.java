package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PccVerdict {
  
  /**
   * What a combination says once every session that measured it has been read. Five of the nine answer for the measurement rather than for the device; &#x60;aboutTheDevice&#x60; says which, and folding those into \&quot;not supported\&quot; is how this data gets misread.
   */
  PLAYED("played"),
  
  /**
   * What a combination says once every session that measured it has been read. Five of the nine answer for the measurement rather than for the device; &#x60;aboutTheDevice&#x60; says which, and folding those into \&quot;not supported\&quot; is how this data gets misread.
   */
  CLAIMED_BUT_NOT_VERIFIED("claimed-but-not-verified"),
  
  /**
   * What a combination says once every session that measured it has been read. Five of the nine answer for the measurement rather than for the device; &#x60;aboutTheDevice&#x60; says which, and folding those into \&quot;not supported\&quot; is how this data gets misread.
   */
  DECLARES_NO_SUPPORT("declares-no-support"),
  
  /**
   * What a combination says once every session that measured it has been read. Five of the nine answer for the measurement rather than for the device; &#x60;aboutTheDevice&#x60; says which, and folding those into \&quot;not supported\&quot; is how this data gets misread.
   */
  INCONSISTENT_CLAIM("inconsistent-claim"),
  
  /**
   * What a combination says once every session that measured it has been read. Five of the nine answer for the measurement rather than for the device; &#x60;aboutTheDevice&#x60; says which, and folding those into \&quot;not supported\&quot; is how this data gets misread.
   */
  INCONCLUSIVE("inconclusive"),
  
  /**
   * What a combination says once every session that measured it has been read. Five of the nine answer for the measurement rather than for the device; &#x60;aboutTheDevice&#x60; says which, and folding those into \&quot;not supported\&quot; is how this data gets misread.
   */
  UNMEASURED("unmeasured"),
  
  /**
   * What a combination says once every session that measured it has been read. Five of the nine answer for the measurement rather than for the device; &#x60;aboutTheDevice&#x60; says which, and folding those into \&quot;not supported\&quot; is how this data gets misread.
   */
  NOT_APPLICABLE("not-applicable"),
  
  /**
   * What a combination says once every session that measured it has been read. Five of the nine answer for the measurement rather than for the device; &#x60;aboutTheDevice&#x60; says which, and folding those into \&quot;not supported\&quot; is how this data gets misread.
   */
  INFRASTRUCTURE_FAULT("infrastructure-fault"),
  
  /**
   * What a combination says once every session that measured it has been read. Five of the nine answer for the measurement rather than for the device; &#x60;aboutTheDevice&#x60; says which, and folding those into \&quot;not supported\&quot; is how this data gets misread.
   */
  NEVER_REACHED("never-reached");

  private String value;

  PccVerdict(String value) {
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
  public static PccVerdict fromValue(String text) {
    for (PccVerdict b : PccVerdict.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

