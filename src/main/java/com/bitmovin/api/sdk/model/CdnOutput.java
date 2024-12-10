package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AclEntry;
import com.bitmovin.api.sdk.model.CdnProvider;
import com.bitmovin.api.sdk.model.Output;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CdnOutput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = CdnOutput.class)
public class CdnOutput extends Output {
  @JsonProperty("domainName")
  private String domainName;

  @JsonProperty("cdnProvider")
  private CdnProvider cdnProvider;

  /**
   * Domain name for public access to CDN content
   * @return domainName
   */
  public String getDomainName() {
    return domainName;
  }


  /**
   * CDN Provider of the Output
   * @return cdnProvider
   */
  public CdnProvider getCdnProvider() {
    return cdnProvider;
  }

  /**
   * CDN Provider of the Output
   *
   * @param cdnProvider
   *        CDN Provider of the Output
   */
  public void setCdnProvider(CdnProvider cdnProvider) {
    this.cdnProvider = cdnProvider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdnOutput cdnOutput = (CdnOutput) o;
    return Objects.equals(this.domainName, cdnOutput.domainName) &&
        Objects.equals(this.cdnProvider, cdnOutput.cdnProvider) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, cdnProvider, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdnOutput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    cdnProvider: ").append(toIndentedString(cdnProvider)).append("\n");
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

