package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.SpriteCreationMode;
import com.bitmovin.api.sdk.model.SpriteJpegConfig;
import com.bitmovin.api.sdk.model.SpriteUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Sprite
 */

public class Sprite extends BitmovinResource {
  @JsonProperty("height")
  private Integer height;

  @JsonProperty("width")
  private Integer width;

  @JsonProperty("unit")
  private SpriteUnit unit;

  @JsonProperty("distance")
  private Double distance;

  @JsonProperty("spriteName")
  private String spriteName;

  @JsonProperty("filename")
  private String filename;

  @JsonProperty("vttName")
  private String vttName;

  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EncodingOutput> outputs = new ArrayList<EncodingOutput>();

  @JsonProperty("imagesPerFile")
  private Integer imagesPerFile;

  @JsonProperty("hTiles")
  private Integer hTiles;

  @JsonProperty("vTiles")
  private Integer vTiles;

  @JsonProperty("jpegConfig")
  private SpriteJpegConfig jpegConfig;

  @JsonProperty("creationMode")
  private SpriteCreationMode creationMode;


  /**
   * Height of one thumbnail (required)
   * @return height
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * Height of one thumbnail (required)
   *
   * @param height
   *        Height of one thumbnail (required)
   */
  public void setHeight(Integer height) {
    this.height = height;
  }


  /**
   * Width of one thumbnail (required)
   * @return width
   */
  public Integer getWidth() {
    return width;
  }

  /**
   * Width of one thumbnail (required)
   *
   * @param width
   *        Width of one thumbnail (required)
   */
  public void setWidth(Integer width) {
    this.width = width;
  }


  /**
   * Get unit
   * @return unit
   */
  public SpriteUnit getUnit() {
    return unit;
  }

  /**
   * Set unit
   *
   * @param unit
   */
  public void setUnit(SpriteUnit unit) {
    this.unit = unit;
  }


  /**
   * Distance in the given unit between a screenshot
   * @return distance
   */
  public Double getDistance() {
    return distance;
  }

  /**
   * Distance in the given unit between a screenshot
   *
   * @param distance
   *        Distance in the given unit between a screenshot
   */
  public void setDistance(Double distance) {
    this.distance = distance;
  }


  /**
   * Name of the sprite image. File extension \&quot;.jpg\&quot;/\&quot;.jpeg\&quot; or \&quot;.png\&quot; is required. (required)
   * @return spriteName
   */
  public String getSpriteName() {
    return spriteName;
  }

  /**
   * Name of the sprite image. File extension \&quot;.jpg\&quot;/\&quot;.jpeg\&quot; or \&quot;.png\&quot; is required. (required)
   *
   * @param spriteName
   *        Name of the sprite image. File extension \&quot;.jpg\&quot;/\&quot;.jpeg\&quot; or \&quot;.png\&quot; is required. (required)
   */
  public void setSpriteName(String spriteName) {
    this.spriteName = spriteName;
  }


  /**
   * Filename of the sprite image. If not set, spriteName will be used, but without an extension.
   * @return filename
   */
  public String getFilename() {
    return filename;
  }

  /**
   * Filename of the sprite image. If not set, spriteName will be used, but without an extension.
   *
   * @param filename
   *        Filename of the sprite image. If not set, spriteName will be used, but without an extension.
   */
  public void setFilename(String filename) {
    this.filename = filename;
  }


  /**
   * Filename of the vtt-file. The file-extension \&quot;.vtt\&quot; is required.
   * @return vttName
   */
  public String getVttName() {
    return vttName;
  }

  /**
   * Filename of the vtt-file. The file-extension \&quot;.vtt\&quot; is required.
   *
   * @param vttName
   *        Filename of the vtt-file. The file-extension \&quot;.vtt\&quot; is required.
   */
  public void setVttName(String vttName) {
    this.vttName = vttName;
  }


  public Sprite addOutputsItem(EncodingOutput outputsItem) {
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
   * Number of images per file. If more images are generated than specified in this value, multiple sprites will be created. You can use the placeholder &#39;%number%&#39; in the spriteName to specify the naming policy. Either this property must be set or hTiles and vTiles. 
   * @return imagesPerFile
   */
  public Integer getImagesPerFile() {
    return imagesPerFile;
  }

  /**
   * Number of images per file. If more images are generated than specified in this value, multiple sprites will be created. You can use the placeholder &#39;%number%&#39; in the spriteName to specify the naming policy. Either this property must be set or hTiles and vTiles. 
   *
   * @param imagesPerFile
   *        Number of images per file. If more images are generated than specified in this value, multiple sprites will be created. You can use the placeholder &#39;%number%&#39; in the spriteName to specify the naming policy. Either this property must be set or hTiles and vTiles. 
   */
  public void setImagesPerFile(Integer imagesPerFile) {
    this.imagesPerFile = imagesPerFile;
  }


  /**
   * Number of rows of images per file.  Has to be set together with vTiles. If this property and vTiles are set, the imagesPerFile property must not be set.  It is recommended to use the placeholder &#39;%number%&#39; in the spriteName to allow the generation of multiple sprites.  Only supported starting with encoder version &#x60;2.76.0&#x60;. 
   * minimum: 1
   * @return hTiles
   */
  public Integer getHTiles() {
    return hTiles;
  }

  /**
   * Number of rows of images per file.  Has to be set together with vTiles. If this property and vTiles are set, the imagesPerFile property must not be set.  It is recommended to use the placeholder &#39;%number%&#39; in the spriteName to allow the generation of multiple sprites.  Only supported starting with encoder version &#x60;2.76.0&#x60;. 
   * minimum: 1
   *
   * @param hTiles
   *        Number of rows of images per file.  Has to be set together with vTiles. If this property and vTiles are set, the imagesPerFile property must not be set.  It is recommended to use the placeholder &#39;%number%&#39; in the spriteName to allow the generation of multiple sprites.  Only supported starting with encoder version &#x60;2.76.0&#x60;. 
   * minimum: 1
   */
  public void setHTiles(Integer hTiles) {
    this.hTiles = hTiles;
  }


  /**
   * Number of columns of images per file.  Has to be set together with hTiles. If this property and hTiles are set, the imagesPerFile property must not be set.  It is recommended to use the placeholder &#39;%number%&#39; in the spriteName to allow the generation of multiple sprites.  Only supported starting with encoder version &#x60;2.76.0&#x60;. 
   * minimum: 1
   * @return vTiles
   */
  public Integer getVTiles() {
    return vTiles;
  }

  /**
   * Number of columns of images per file.  Has to be set together with hTiles. If this property and hTiles are set, the imagesPerFile property must not be set.  It is recommended to use the placeholder &#39;%number%&#39; in the spriteName to allow the generation of multiple sprites.  Only supported starting with encoder version &#x60;2.76.0&#x60;. 
   * minimum: 1
   *
   * @param vTiles
   *        Number of columns of images per file.  Has to be set together with hTiles. If this property and hTiles are set, the imagesPerFile property must not be set.  It is recommended to use the placeholder &#39;%number%&#39; in the spriteName to allow the generation of multiple sprites.  Only supported starting with encoder version &#x60;2.76.0&#x60;. 
   * minimum: 1
   */
  public void setVTiles(Integer vTiles) {
    this.vTiles = vTiles;
  }


  /**
   * Additional configuration for JPEG sprite generation.  If this property is set the extension of the file must be &#39;.jpg.&#39; or &#39;.jpeg&#39;  Only supported starting with encoder version &#x60;2.76.0&#x60; 
   * @return jpegConfig
   */
  public SpriteJpegConfig getJpegConfig() {
    return jpegConfig;
  }

  /**
   * Additional configuration for JPEG sprite generation.  If this property is set the extension of the file must be &#39;.jpg.&#39; or &#39;.jpeg&#39;  Only supported starting with encoder version &#x60;2.76.0&#x60; 
   *
   * @param jpegConfig
   *        Additional configuration for JPEG sprite generation.  If this property is set the extension of the file must be &#39;.jpg.&#39; or &#39;.jpeg&#39;  Only supported starting with encoder version &#x60;2.76.0&#x60; 
   */
  public void setJpegConfig(SpriteJpegConfig jpegConfig) {
    this.jpegConfig = jpegConfig;
  }


  /**
   * The creation mode for the thumbnails in the Sprite.  Two possible creation modes exist: generate thumbnails starting with the beginning of the video or after the first configured period.  When using distance&#x3D;10 and unit&#x3D;SECONDS and INTERVAL_END, the first image of the sprite is from the second 10 of the video. When using distance&#x3D;10 and unit&#x3D;SECONDS and INTERVAL_START, the first image of the sprite is from the very start of the video, while the second image is from second 10 of the video.  It is recommended to use &#39;INTERVAL_START&#39; when using the sprites for trick play so that there is an additional thumbnail from the beginning of the video.  Only supported starting with encoder version &#x60;2.76.0&#x60;. 
   * @return creationMode
   */
  public SpriteCreationMode getCreationMode() {
    return creationMode;
  }

  /**
   * The creation mode for the thumbnails in the Sprite.  Two possible creation modes exist: generate thumbnails starting with the beginning of the video or after the first configured period.  When using distance&#x3D;10 and unit&#x3D;SECONDS and INTERVAL_END, the first image of the sprite is from the second 10 of the video. When using distance&#x3D;10 and unit&#x3D;SECONDS and INTERVAL_START, the first image of the sprite is from the very start of the video, while the second image is from second 10 of the video.  It is recommended to use &#39;INTERVAL_START&#39; when using the sprites for trick play so that there is an additional thumbnail from the beginning of the video.  Only supported starting with encoder version &#x60;2.76.0&#x60;. 
   *
   * @param creationMode
   *        The creation mode for the thumbnails in the Sprite.  Two possible creation modes exist: generate thumbnails starting with the beginning of the video or after the first configured period.  When using distance&#x3D;10 and unit&#x3D;SECONDS and INTERVAL_END, the first image of the sprite is from the second 10 of the video. When using distance&#x3D;10 and unit&#x3D;SECONDS and INTERVAL_START, the first image of the sprite is from the very start of the video, while the second image is from second 10 of the video.  It is recommended to use &#39;INTERVAL_START&#39; when using the sprites for trick play so that there is an additional thumbnail from the beginning of the video.  Only supported starting with encoder version &#x60;2.76.0&#x60;. 
   */
  public void setCreationMode(SpriteCreationMode creationMode) {
    this.creationMode = creationMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sprite sprite = (Sprite) o;
    return Objects.equals(this.height, sprite.height) &&
        Objects.equals(this.width, sprite.width) &&
        Objects.equals(this.unit, sprite.unit) &&
        Objects.equals(this.distance, sprite.distance) &&
        Objects.equals(this.spriteName, sprite.spriteName) &&
        Objects.equals(this.filename, sprite.filename) &&
        Objects.equals(this.vttName, sprite.vttName) &&
        Objects.equals(this.outputs, sprite.outputs) &&
        Objects.equals(this.imagesPerFile, sprite.imagesPerFile) &&
        Objects.equals(this.hTiles, sprite.hTiles) &&
        Objects.equals(this.vTiles, sprite.vTiles) &&
        Objects.equals(this.jpegConfig, sprite.jpegConfig) &&
        Objects.equals(this.creationMode, sprite.creationMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, width, unit, distance, spriteName, filename, vttName, outputs, imagesPerFile, hTiles, vTiles, jpegConfig, creationMode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sprite {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    spriteName: ").append(toIndentedString(spriteName)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    vttName: ").append(toIndentedString(vttName)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    imagesPerFile: ").append(toIndentedString(imagesPerFile)).append("\n");
    sb.append("    hTiles: ").append(toIndentedString(hTiles)).append("\n");
    sb.append("    vTiles: ").append(toIndentedString(vTiles)).append("\n");
    sb.append("    jpegConfig: ").append(toIndentedString(jpegConfig)).append("\n");
    sb.append("    creationMode: ").append(toIndentedString(creationMode)).append("\n");
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

