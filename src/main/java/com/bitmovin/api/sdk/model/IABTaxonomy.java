package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * IABTaxonomy
 */

public class IABTaxonomy {
  @JsonProperty("contentVersion")
  private String contentVersion;

  @JsonProperty("adProductVersion")
  private String adProductVersion;

  @JsonProperty("contentTaxonomies")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> contentTaxonomies = new ArrayList<String>();

  @JsonProperty("adOpportunityTaxonomies")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> adOpportunityTaxonomies = new ArrayList<String>();

  @JsonProperty("sensitiveTopicTaxonomies")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> sensitiveTopicTaxonomies = new ArrayList<String>();


  /**
   * Get contentVersion
   * @return contentVersion
   */
  public String getContentVersion() {
    return contentVersion;
  }

  /**
   * Set contentVersion
   *
   * @param contentVersion
   */
  public void setContentVersion(String contentVersion) {
    this.contentVersion = contentVersion;
  }


  /**
   * Get adProductVersion
   * @return adProductVersion
   */
  public String getAdProductVersion() {
    return adProductVersion;
  }

  /**
   * Set adProductVersion
   *
   * @param adProductVersion
   */
  public void setAdProductVersion(String adProductVersion) {
    this.adProductVersion = adProductVersion;
  }


  public IABTaxonomy addContentTaxonomiesItem(String contentTaxonomiesItem) {
    this.contentTaxonomies.add(contentTaxonomiesItem);
    return this;
  }

  /**
   * Get contentTaxonomies
   * @return contentTaxonomies
   */
  public List<String> getContentTaxonomies() {
    return contentTaxonomies;
  }

  /**
   * Set contentTaxonomies
   *
   * @param contentTaxonomies
   */
  public void setContentTaxonomies(List<String> contentTaxonomies) {
    this.contentTaxonomies = contentTaxonomies;
  }


  public IABTaxonomy addAdOpportunityTaxonomiesItem(String adOpportunityTaxonomiesItem) {
    this.adOpportunityTaxonomies.add(adOpportunityTaxonomiesItem);
    return this;
  }

  /**
   * Get adOpportunityTaxonomies
   * @return adOpportunityTaxonomies
   */
  public List<String> getAdOpportunityTaxonomies() {
    return adOpportunityTaxonomies;
  }

  /**
   * Set adOpportunityTaxonomies
   *
   * @param adOpportunityTaxonomies
   */
  public void setAdOpportunityTaxonomies(List<String> adOpportunityTaxonomies) {
    this.adOpportunityTaxonomies = adOpportunityTaxonomies;
  }


  public IABTaxonomy addSensitiveTopicTaxonomiesItem(String sensitiveTopicTaxonomiesItem) {
    this.sensitiveTopicTaxonomies.add(sensitiveTopicTaxonomiesItem);
    return this;
  }

  /**
   * Get sensitiveTopicTaxonomies
   * @return sensitiveTopicTaxonomies
   */
  public List<String> getSensitiveTopicTaxonomies() {
    return sensitiveTopicTaxonomies;
  }

  /**
   * Set sensitiveTopicTaxonomies
   *
   * @param sensitiveTopicTaxonomies
   */
  public void setSensitiveTopicTaxonomies(List<String> sensitiveTopicTaxonomies) {
    this.sensitiveTopicTaxonomies = sensitiveTopicTaxonomies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IABTaxonomy iaBTaxonomy = (IABTaxonomy) o;
    return Objects.equals(this.contentVersion, iaBTaxonomy.contentVersion) &&
        Objects.equals(this.adProductVersion, iaBTaxonomy.adProductVersion) &&
        Objects.equals(this.contentTaxonomies, iaBTaxonomy.contentTaxonomies) &&
        Objects.equals(this.adOpportunityTaxonomies, iaBTaxonomy.adOpportunityTaxonomies) &&
        Objects.equals(this.sensitiveTopicTaxonomies, iaBTaxonomy.sensitiveTopicTaxonomies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentVersion, adProductVersion, contentTaxonomies, adOpportunityTaxonomies, sensitiveTopicTaxonomies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IABTaxonomy {\n");
    
    sb.append("    contentVersion: ").append(toIndentedString(contentVersion)).append("\n");
    sb.append("    adProductVersion: ").append(toIndentedString(adProductVersion)).append("\n");
    sb.append("    contentTaxonomies: ").append(toIndentedString(contentTaxonomies)).append("\n");
    sb.append("    adOpportunityTaxonomies: ").append(toIndentedString(adOpportunityTaxonomies)).append("\n");
    sb.append("    sensitiveTopicTaxonomies: ").append(toIndentedString(sensitiveTopicTaxonomies)).append("\n");
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

