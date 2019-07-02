package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.ThumbnailUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Thumbnail
 */

public class Thumbnail extends BitmovinResource {
  @JsonProperty("height")
  private Integer height;

  @JsonProperty("pattern")
  private String pattern;

  @JsonProperty("interval")
  private Double interval;

  @JsonProperty("positions")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Double> positions = new ArrayList<Double>();

  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EncodingOutput> outputs = new ArrayList<EncodingOutput>();

  @JsonProperty("unit")
  private ThumbnailUnit unit;


  /**
   * Height of the thumbnail. (required)
   * @return height
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * Height of the thumbnail. (required)
   *
   * @param height
   *        Height of the thumbnail. (required)
   */
  public void setHeight(Integer height) {
    this.height = height;
  }


  /**
   *  Pattern which describes the thumbnail filenames. For example with thumbnail-%number%.png as pattern and 3 positions: thumbnail-3_0.png, thumbnail-5_0.png and thumbnail-25_5.png. (The number represents the position in the source video in seconds, in the previous example the first filename represents the thumbnail at 3s, the second one at 5s and the third one at 25.5s).
   * @return pattern
   */
  public String getPattern() {
    return pattern;
  }

  /**
   *  Pattern which describes the thumbnail filenames. For example with thumbnail-%number%.png as pattern and 3 positions: thumbnail-3_0.png, thumbnail-5_0.png and thumbnail-25_5.png. (The number represents the position in the source video in seconds, in the previous example the first filename represents the thumbnail at 3s, the second one at 5s and the third one at 25.5s).
   *
   * @param pattern
   *         Pattern which describes the thumbnail filenames. For example with thumbnail-%number%.png as pattern and 3 positions: thumbnail-3_0.png, thumbnail-5_0.png and thumbnail-25_5.png. (The number represents the position in the source video in seconds, in the previous example the first filename represents the thumbnail at 3s, the second one at 5s and the third one at 25.5s).
   */
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  /**
   * The interval in which to create thumbnails. In seconds (E.g. a value of 4 means create a thumbnail every 4 seconds). Mutually exclusive with positions/unit. Has to be equal to or greater than 1.
   * @return interval
   */
  public Double getInterval() {
    return interval;
  }

  /**
   * The interval in which to create thumbnails. In seconds (E.g. a value of 4 means create a thumbnail every 4 seconds). Mutually exclusive with positions/unit. Has to be equal to or greater than 1.
   *
   * @param interval
   *        The interval in which to create thumbnails. In seconds (E.g. a value of 4 means create a thumbnail every 4 seconds). Mutually exclusive with positions/unit. Has to be equal to or greater than 1.
   */
  public void setInterval(Double interval) {
    this.interval = interval;
  }


  public Thumbnail addPositionsItem(Double positionsItem) {
    this.positions.add(positionsItem);
    return this;
  }

  /**
   * Position in the unit where the thumbnail should be created from. Mutually exclusive with interval.
   * @return positions
   */
  public List<Double> getPositions() {
    return positions;
  }

  /**
   * Position in the unit where the thumbnail should be created from. Mutually exclusive with interval.
   *
   * @param positions
   *        Position in the unit where the thumbnail should be created from. Mutually exclusive with interval.
   */
  public void setPositions(List<Double> positions) {
    this.positions = positions;
  }


  public Thumbnail addOutputsItem(EncodingOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Get outputs
   * @return outputs
   */
  public List<EncodingOutput> getOutputs() {
    return outputs;
  }

  /**
   * Set outputs
   *
   * @param outputs
   */
  public void setOutputs(List<EncodingOutput> outputs) {
    this.outputs = outputs;
  }


  /**
   * Unit of the values in the positions array.
   * @return unit
   */
  public ThumbnailUnit getUnit() {
    return unit;
  }

  /**
   * Unit of the values in the positions array.
   *
   * @param unit
   *        Unit of the values in the positions array.
   */
  public void setUnit(ThumbnailUnit unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Thumbnail thumbnail = (Thumbnail) o;
    return Objects.equals(this.height, thumbnail.height) &&
        Objects.equals(this.pattern, thumbnail.pattern) &&
        Objects.equals(this.interval, thumbnail.interval) &&
        Objects.equals(this.positions, thumbnail.positions) &&
        Objects.equals(this.outputs, thumbnail.outputs) &&
        Objects.equals(this.unit, thumbnail.unit) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, pattern, interval, positions, outputs, unit, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Thumbnail {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    positions: ").append(toIndentedString(positions)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

