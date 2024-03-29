package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Filter;
import com.bitmovin.api.sdk.model.TextFilterFont;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Only one of those properties may be set: fontSize, fontSizeExpression.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = TextFilter.class)
public class TextFilter extends Filter {
  @JsonProperty("font")
  private TextFilterFont font;

  @JsonProperty("box")
  private Boolean box;

  @JsonProperty("boxBorderWidth")
  private Integer boxBorderWidth;

  @JsonProperty("boxColor")
  private String boxColor;

  @JsonProperty("lineSpacing")
  private Integer lineSpacing;

  @JsonProperty("borderWidth")
  private Integer borderWidth;

  @JsonProperty("fixBounds")
  private Boolean fixBounds;

  @JsonProperty("fontColor")
  private String fontColor;

  @JsonProperty("fontSize")
  private Integer fontSize;

  @JsonProperty("fontSizeExpression")
  private String fontSizeExpression;

  @JsonProperty("alpha")
  private Double alpha;

  @JsonProperty("shadowColor")
  private String shadowColor;

  @JsonProperty("shadowX")
  private Integer shadowX;

  @JsonProperty("shadowY")
  private Integer shadowY;

  @JsonProperty("timecode")
  private String timecode;

  @JsonProperty("text")
  private String text;

  @JsonProperty("x")
  private String x;

  @JsonProperty("y")
  private String y;

  @JsonProperty("rate")
  private String rate;


  /**
   * Get font
   * @return font
   */
  public TextFilterFont getFont() {
    return font;
  }

  /**
   * Set font
   *
   * @param font
   */
  public void setFont(TextFilterFont font) {
    this.font = font;
  }


  /**
   * If set to true a box is drawn around the text using the background color.
   * @return box
   */
  public Boolean getBox() {
    return box;
  }

  /**
   * If set to true a box is drawn around the text using the background color.
   *
   * @param box
   *        If set to true a box is drawn around the text using the background color.
   */
  public void setBox(Boolean box) {
    this.box = box;
  }


  /**
   * The width of the box drawn around the text.
   * @return boxBorderWidth
   */
  public Integer getBoxBorderWidth() {
    return boxBorderWidth;
  }

  /**
   * The width of the box drawn around the text.
   *
   * @param boxBorderWidth
   *        The width of the box drawn around the text.
   */
  public void setBoxBorderWidth(Integer boxBorderWidth) {
    this.boxBorderWidth = boxBorderWidth;
  }


  /**
   * The background color to be used for drawing the box.
   * @return boxColor
   */
  public String getBoxColor() {
    return boxColor;
  }

  /**
   * The background color to be used for drawing the box.
   *
   * @param boxColor
   *        The background color to be used for drawing the box.
   */
  public void setBoxColor(String boxColor) {
    this.boxColor = boxColor;
  }


  /**
   * Line spacing of the border around the box in pixels
   * @return lineSpacing
   */
  public Integer getLineSpacing() {
    return lineSpacing;
  }

  /**
   * Line spacing of the border around the box in pixels
   *
   * @param lineSpacing
   *        Line spacing of the border around the box in pixels
   */
  public void setLineSpacing(Integer lineSpacing) {
    this.lineSpacing = lineSpacing;
  }


  /**
   * Width of the border around the text
   * @return borderWidth
   */
  public Integer getBorderWidth() {
    return borderWidth;
  }

  /**
   * Width of the border around the text
   *
   * @param borderWidth
   *        Width of the border around the text
   */
  public void setBorderWidth(Integer borderWidth) {
    this.borderWidth = borderWidth;
  }


  /**
   * If set to true, it will fix text coordinates to avoid clipping if necessary
   * @return fixBounds
   */
  public Boolean getFixBounds() {
    return fixBounds;
  }

  /**
   * If set to true, it will fix text coordinates to avoid clipping if necessary
   *
   * @param fixBounds
   *        If set to true, it will fix text coordinates to avoid clipping if necessary
   */
  public void setFixBounds(Boolean fixBounds) {
    this.fixBounds = fixBounds;
  }


  /**
   * The color to be used to draw the text
   * @return fontColor
   */
  public String getFontColor() {
    return fontColor;
  }

  /**
   * The color to be used to draw the text
   *
   * @param fontColor
   *        The color to be used to draw the text
   */
  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }


  /**
   * Font size to be used to draw the text
   * @return fontSize
   */
  public Integer getFontSize() {
    return fontSize;
  }

  /**
   * Font size to be used to draw the text
   *
   * @param fontSize
   *        Font size to be used to draw the text
   */
  public void setFontSize(Integer fontSize) {
    this.fontSize = fontSize;
  }


  /**
   * An expression for the Font size. Either fontSize or fontSizeExpression can be set at the same time. The following variables are valid: main_h, h, H for input height and main_w, w, W for the input_width
   * @return fontSizeExpression
   */
  public String getFontSizeExpression() {
    return fontSizeExpression;
  }

  /**
   * An expression for the Font size. Either fontSize or fontSizeExpression can be set at the same time. The following variables are valid: main_h, h, H for input height and main_w, w, W for the input_width
   *
   * @param fontSizeExpression
   *        An expression for the Font size. Either fontSize or fontSizeExpression can be set at the same time. The following variables are valid: main_h, h, H for input height and main_w, w, W for the input_width
   */
  public void setFontSizeExpression(String fontSizeExpression) {
    this.fontSizeExpression = fontSizeExpression;
  }


  /**
   * If set, alpha blending for the text is applied. Values are valid between 0.0 and 1.0.
   * @return alpha
   */
  public Double getAlpha() {
    return alpha;
  }

  /**
   * If set, alpha blending for the text is applied. Values are valid between 0.0 and 1.0.
   *
   * @param alpha
   *        If set, alpha blending for the text is applied. Values are valid between 0.0 and 1.0.
   */
  public void setAlpha(Double alpha) {
    this.alpha = alpha;
  }


  /**
   * Color of the shadow
   * @return shadowColor
   */
  public String getShadowColor() {
    return shadowColor;
  }

  /**
   * Color of the shadow
   *
   * @param shadowColor
   *        Color of the shadow
   */
  public void setShadowColor(String shadowColor) {
    this.shadowColor = shadowColor;
  }


  /**
   * X offset of the shadow
   * @return shadowX
   */
  public Integer getShadowX() {
    return shadowX;
  }

  /**
   * X offset of the shadow
   *
   * @param shadowX
   *        X offset of the shadow
   */
  public void setShadowX(Integer shadowX) {
    this.shadowX = shadowX;
  }


  /**
   * Y offset of the shadow
   * @return shadowY
   */
  public Integer getShadowY() {
    return shadowY;
  }

  /**
   * Y offset of the shadow
   *
   * @param shadowY
   *        Y offset of the shadow
   */
  public void setShadowY(Integer shadowY) {
    this.shadowY = shadowY;
  }


  /**
   * If set, the timecode representation in \&quot;hh:mm:ss[:;.]ff\&quot; format will be applied. Drop-frame timecodes (containing \&quot;;\&quot; or \&quot;.\&quot;) must only be used with video frame rates of 29.97, 30, 59.94 or 60 FPS, according to the SMPTE standard
   * @return timecode
   */
  public String getTimecode() {
    return timecode;
  }

  /**
   * If set, the timecode representation in \&quot;hh:mm:ss[:;.]ff\&quot; format will be applied. Drop-frame timecodes (containing \&quot;;\&quot; or \&quot;.\&quot;) must only be used with video frame rates of 29.97, 30, 59.94 or 60 FPS, according to the SMPTE standard
   *
   * @param timecode
   *        If set, the timecode representation in \&quot;hh:mm:ss[:;.]ff\&quot; format will be applied. Drop-frame timecodes (containing \&quot;;\&quot; or \&quot;.\&quot;) must only be used with video frame rates of 29.97, 30, 59.94 or 60 FPS, according to the SMPTE standard
   */
  public void setTimecode(String timecode) {
    this.timecode = timecode;
  }


  /**
   * String to be drawn
   * @return text
   */
  public String getText() {
    return text;
  }

  /**
   * String to be drawn
   *
   * @param text
   *        String to be drawn
   */
  public void setText(String text) {
    this.text = text;
  }


  /**
   * X position of the text. Also an expression can be used. The following variables are valid: line_h - height of each text line; main_h - input height; main_w - input width; n - number of input frame; text_h - Text height; text_w - Text width (required)
   * @return x
   */
  public String getX() {
    return x;
  }

  /**
   * X position of the text. Also an expression can be used. The following variables are valid: line_h - height of each text line; main_h - input height; main_w - input width; n - number of input frame; text_h - Text height; text_w - Text width (required)
   *
   * @param x
   *        X position of the text. Also an expression can be used. The following variables are valid: line_h - height of each text line; main_h - input height; main_w - input width; n - number of input frame; text_h - Text height; text_w - Text width (required)
   */
  public void setX(String x) {
    this.x = x;
  }


  /**
   * Y position of the text. Also an expression can be used. The following variables are valid: line_h - height of each text line; main_h - input height; main_w - input width; n - number of input frame; text_h - Text height; text_w - Text width (required)
   * @return y
   */
  public String getY() {
    return y;
  }

  /**
   * Y position of the text. Also an expression can be used. The following variables are valid: line_h - height of each text line; main_h - input height; main_w - input width; n - number of input frame; text_h - Text height; text_w - Text width (required)
   *
   * @param y
   *        Y position of the text. Also an expression can be used. The following variables are valid: line_h - height of each text line; main_h - input height; main_w - input width; n - number of input frame; text_h - Text height; text_w - Text width (required)
   */
  public void setY(String y) {
    this.y = y;
  }


  /**
   * Video frame rate
   * @return rate
   */
  public String getRate() {
    return rate;
  }

  /**
   * Video frame rate
   *
   * @param rate
   *        Video frame rate
   */
  public void setRate(String rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextFilter textFilter = (TextFilter) o;
    return Objects.equals(this.font, textFilter.font) &&
        Objects.equals(this.box, textFilter.box) &&
        Objects.equals(this.boxBorderWidth, textFilter.boxBorderWidth) &&
        Objects.equals(this.boxColor, textFilter.boxColor) &&
        Objects.equals(this.lineSpacing, textFilter.lineSpacing) &&
        Objects.equals(this.borderWidth, textFilter.borderWidth) &&
        Objects.equals(this.fixBounds, textFilter.fixBounds) &&
        Objects.equals(this.fontColor, textFilter.fontColor) &&
        Objects.equals(this.fontSize, textFilter.fontSize) &&
        Objects.equals(this.fontSizeExpression, textFilter.fontSizeExpression) &&
        Objects.equals(this.alpha, textFilter.alpha) &&
        Objects.equals(this.shadowColor, textFilter.shadowColor) &&
        Objects.equals(this.shadowX, textFilter.shadowX) &&
        Objects.equals(this.shadowY, textFilter.shadowY) &&
        Objects.equals(this.timecode, textFilter.timecode) &&
        Objects.equals(this.text, textFilter.text) &&
        Objects.equals(this.x, textFilter.x) &&
        Objects.equals(this.y, textFilter.y) &&
        Objects.equals(this.rate, textFilter.rate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(font, box, boxBorderWidth, boxColor, lineSpacing, borderWidth, fixBounds, fontColor, fontSize, fontSizeExpression, alpha, shadowColor, shadowX, shadowY, timecode, text, x, y, rate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    box: ").append(toIndentedString(box)).append("\n");
    sb.append("    boxBorderWidth: ").append(toIndentedString(boxBorderWidth)).append("\n");
    sb.append("    boxColor: ").append(toIndentedString(boxColor)).append("\n");
    sb.append("    lineSpacing: ").append(toIndentedString(lineSpacing)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
    sb.append("    fixBounds: ").append(toIndentedString(fixBounds)).append("\n");
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontSizeExpression: ").append(toIndentedString(fontSizeExpression)).append("\n");
    sb.append("    alpha: ").append(toIndentedString(alpha)).append("\n");
    sb.append("    shadowColor: ").append(toIndentedString(shadowColor)).append("\n");
    sb.append("    shadowX: ").append(toIndentedString(shadowX)).append("\n");
    sb.append("    shadowY: ").append(toIndentedString(shadowY)).append("\n");
    sb.append("    timecode: ").append(toIndentedString(timecode)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

