package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AiServiceProvider;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AiService
 */

public class AiService {
  @JsonProperty("provider")
  private AiServiceProvider provider;


  /**
   * AI service provider
   * @return provider
   */
  public AiServiceProvider getProvider() {
    return provider;
  }

  /**
   * AI service provider
   *
   * @param provider
   *        AI service provider
   */
  public void setProvider(AiServiceProvider provider) {
    this.provider = provider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiService aiService = (AiService) o;
    return Objects.equals(this.provider, aiService.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiService {\n");
    
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

