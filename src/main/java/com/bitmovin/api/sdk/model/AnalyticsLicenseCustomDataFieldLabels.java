package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsLicenseCustomDataFieldLabels
 */

public class AnalyticsLicenseCustomDataFieldLabels {
  @JsonProperty("customData1")
  private String customData1;

  @JsonProperty("customData2")
  private String customData2;

  @JsonProperty("customData3")
  private String customData3;

  @JsonProperty("customData4")
  private String customData4;

  @JsonProperty("customData5")
  private String customData5;

  @JsonProperty("customData6")
  private String customData6;

  @JsonProperty("customData7")
  private String customData7;


  /**
   * Custom Data 1
   * @return customData1
   */
  public String getCustomData1() {
    return customData1;
  }

  /**
   * Custom Data 1
   *
   * @param customData1
   *        Custom Data 1
   */
  public void setCustomData1(String customData1) {
    this.customData1 = customData1;
  }


  /**
   * Custom Data 2
   * @return customData2
   */
  public String getCustomData2() {
    return customData2;
  }

  /**
   * Custom Data 2
   *
   * @param customData2
   *        Custom Data 2
   */
  public void setCustomData2(String customData2) {
    this.customData2 = customData2;
  }


  /**
   * Custom Data 3
   * @return customData3
   */
  public String getCustomData3() {
    return customData3;
  }

  /**
   * Custom Data 3
   *
   * @param customData3
   *        Custom Data 3
   */
  public void setCustomData3(String customData3) {
    this.customData3 = customData3;
  }


  /**
   * Custom Data 4
   * @return customData4
   */
  public String getCustomData4() {
    return customData4;
  }

  /**
   * Custom Data 4
   *
   * @param customData4
   *        Custom Data 4
   */
  public void setCustomData4(String customData4) {
    this.customData4 = customData4;
  }


  /**
   * Custom Data 5
   * @return customData5
   */
  public String getCustomData5() {
    return customData5;
  }

  /**
   * Custom Data 5
   *
   * @param customData5
   *        Custom Data 5
   */
  public void setCustomData5(String customData5) {
    this.customData5 = customData5;
  }


  /**
   * Custom Data 6
   * @return customData6
   */
  public String getCustomData6() {
    return customData6;
  }

  /**
   * Custom Data 6
   *
   * @param customData6
   *        Custom Data 6
   */
  public void setCustomData6(String customData6) {
    this.customData6 = customData6;
  }


  /**
   * Custom Data 7
   * @return customData7
   */
  public String getCustomData7() {
    return customData7;
  }

  /**
   * Custom Data 7
   *
   * @param customData7
   *        Custom Data 7
   */
  public void setCustomData7(String customData7) {
    this.customData7 = customData7;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsLicenseCustomDataFieldLabels analyticsLicenseCustomDataFieldLabels = (AnalyticsLicenseCustomDataFieldLabels) o;
    return Objects.equals(this.customData1, analyticsLicenseCustomDataFieldLabels.customData1) &&
        Objects.equals(this.customData2, analyticsLicenseCustomDataFieldLabels.customData2) &&
        Objects.equals(this.customData3, analyticsLicenseCustomDataFieldLabels.customData3) &&
        Objects.equals(this.customData4, analyticsLicenseCustomDataFieldLabels.customData4) &&
        Objects.equals(this.customData5, analyticsLicenseCustomDataFieldLabels.customData5) &&
        Objects.equals(this.customData6, analyticsLicenseCustomDataFieldLabels.customData6) &&
        Objects.equals(this.customData7, analyticsLicenseCustomDataFieldLabels.customData7);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customData1, customData2, customData3, customData4, customData5, customData6, customData7);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsLicenseCustomDataFieldLabels {\n");
    
    sb.append("    customData1: ").append(toIndentedString(customData1)).append("\n");
    sb.append("    customData2: ").append(toIndentedString(customData2)).append("\n");
    sb.append("    customData3: ").append(toIndentedString(customData3)).append("\n");
    sb.append("    customData4: ").append(toIndentedString(customData4)).append("\n");
    sb.append("    customData5: ").append(toIndentedString(customData5)).append("\n");
    sb.append("    customData6: ").append(toIndentedString(customData6)).append("\n");
    sb.append("    customData7: ").append(toIndentedString(customData7)).append("\n");
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

