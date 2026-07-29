package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AgeRange;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CharacterAppearance
 */

public class CharacterAppearance {
  @JsonProperty("summary")
  private String summary;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("approximateAge")
  private AgeRange approximateAge;

  @JsonProperty("hairColor")
  private String hairColor;

  @JsonProperty("hairStyle")
  private String hairStyle;

  @JsonProperty("hairFullness")
  private String hairFullness;

  @JsonProperty("facialHair")
  private String facialHair;

  @JsonProperty("physicalBuild")
  private String physicalBuild;

  @JsonProperty("distinguishingFeatures")
  private String distinguishingFeatures;

  @JsonProperty("clothing")
  private String clothing;


  /**
   * Get summary
   * @return summary
   */
  public String getSummary() {
    return summary;
  }

  /**
   * Set summary
   *
   * @param summary
   */
  public void setSummary(String summary) {
    this.summary = summary;
  }


  /**
   * Get gender
   * @return gender
   */
  public String getGender() {
    return gender;
  }

  /**
   * Set gender
   *
   * @param gender
   */
  public void setGender(String gender) {
    this.gender = gender;
  }


  /**
   * The approximate age range of the character
   * @return approximateAge
   */
  public AgeRange getApproximateAge() {
    return approximateAge;
  }

  /**
   * The approximate age range of the character
   *
   * @param approximateAge
   *        The approximate age range of the character
   */
  public void setApproximateAge(AgeRange approximateAge) {
    this.approximateAge = approximateAge;
  }


  /**
   * Get hairColor
   * @return hairColor
   */
  public String getHairColor() {
    return hairColor;
  }

  /**
   * Set hairColor
   *
   * @param hairColor
   */
  public void setHairColor(String hairColor) {
    this.hairColor = hairColor;
  }


  /**
   * Get hairStyle
   * @return hairStyle
   */
  public String getHairStyle() {
    return hairStyle;
  }

  /**
   * Set hairStyle
   *
   * @param hairStyle
   */
  public void setHairStyle(String hairStyle) {
    this.hairStyle = hairStyle;
  }


  /**
   * Get hairFullness
   * @return hairFullness
   */
  public String getHairFullness() {
    return hairFullness;
  }

  /**
   * Set hairFullness
   *
   * @param hairFullness
   */
  public void setHairFullness(String hairFullness) {
    this.hairFullness = hairFullness;
  }


  /**
   * Get facialHair
   * @return facialHair
   */
  public String getFacialHair() {
    return facialHair;
  }

  /**
   * Set facialHair
   *
   * @param facialHair
   */
  public void setFacialHair(String facialHair) {
    this.facialHair = facialHair;
  }


  /**
   * Get physicalBuild
   * @return physicalBuild
   */
  public String getPhysicalBuild() {
    return physicalBuild;
  }

  /**
   * Set physicalBuild
   *
   * @param physicalBuild
   */
  public void setPhysicalBuild(String physicalBuild) {
    this.physicalBuild = physicalBuild;
  }


  /**
   * Get distinguishingFeatures
   * @return distinguishingFeatures
   */
  public String getDistinguishingFeatures() {
    return distinguishingFeatures;
  }

  /**
   * Set distinguishingFeatures
   *
   * @param distinguishingFeatures
   */
  public void setDistinguishingFeatures(String distinguishingFeatures) {
    this.distinguishingFeatures = distinguishingFeatures;
  }


  /**
   * Get clothing
   * @return clothing
   */
  public String getClothing() {
    return clothing;
  }

  /**
   * Set clothing
   *
   * @param clothing
   */
  public void setClothing(String clothing) {
    this.clothing = clothing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterAppearance characterAppearance = (CharacterAppearance) o;
    return Objects.equals(this.summary, characterAppearance.summary) &&
        Objects.equals(this.gender, characterAppearance.gender) &&
        Objects.equals(this.approximateAge, characterAppearance.approximateAge) &&
        Objects.equals(this.hairColor, characterAppearance.hairColor) &&
        Objects.equals(this.hairStyle, characterAppearance.hairStyle) &&
        Objects.equals(this.hairFullness, characterAppearance.hairFullness) &&
        Objects.equals(this.facialHair, characterAppearance.facialHair) &&
        Objects.equals(this.physicalBuild, characterAppearance.physicalBuild) &&
        Objects.equals(this.distinguishingFeatures, characterAppearance.distinguishingFeatures) &&
        Objects.equals(this.clothing, characterAppearance.clothing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, gender, approximateAge, hairColor, hairStyle, hairFullness, facialHair, physicalBuild, distinguishingFeatures, clothing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterAppearance {\n");
    
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    approximateAge: ").append(toIndentedString(approximateAge)).append("\n");
    sb.append("    hairColor: ").append(toIndentedString(hairColor)).append("\n");
    sb.append("    hairStyle: ").append(toIndentedString(hairStyle)).append("\n");
    sb.append("    hairFullness: ").append(toIndentedString(hairFullness)).append("\n");
    sb.append("    facialHair: ").append(toIndentedString(facialHair)).append("\n");
    sb.append("    physicalBuild: ").append(toIndentedString(physicalBuild)).append("\n");
    sb.append("    distinguishingFeatures: ").append(toIndentedString(distinguishingFeatures)).append("\n");
    sb.append("    clothing: ").append(toIndentedString(clothing)).append("\n");
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

