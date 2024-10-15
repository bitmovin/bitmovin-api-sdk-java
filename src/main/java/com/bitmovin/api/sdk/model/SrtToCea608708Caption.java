package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.CaptionCharacterEncoding;
import com.bitmovin.api.sdk.model.Cea608ChannelType;
import com.bitmovin.api.sdk.model.InputPath;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SrtToCea608708Caption
 */

public class SrtToCea608708Caption extends BitmovinResource {
  @JsonProperty("input")
  private InputPath input;

  @JsonProperty("ccChannel")
  private Cea608ChannelType ccChannel;

  @JsonProperty("characterEncoding")
  private CaptionCharacterEncoding characterEncoding;


  /**
   * Input location of the SRT file (required)
   * @return input
   */
  public InputPath getInput() {
    return input;
  }

  /**
   * Input location of the SRT file (required)
   *
   * @param input
   *        Input location of the SRT file (required)
   */
  public void setInput(InputPath input) {
    this.input = input;
  }


  /**
   * The channel number to embed the CEA subtitles in (required)
   * @return ccChannel
   */
  public Cea608ChannelType getCcChannel() {
    return ccChannel;
  }

  /**
   * The channel number to embed the CEA subtitles in (required)
   *
   * @param ccChannel
   *        The channel number to embed the CEA subtitles in (required)
   */
  public void setCcChannel(Cea608ChannelType ccChannel) {
    this.ccChannel = ccChannel;
  }


  /**
   * Character encoding of the input SRT file (required)
   * @return characterEncoding
   */
  public CaptionCharacterEncoding getCharacterEncoding() {
    return characterEncoding;
  }

  /**
   * Character encoding of the input SRT file (required)
   *
   * @param characterEncoding
   *        Character encoding of the input SRT file (required)
   */
  public void setCharacterEncoding(CaptionCharacterEncoding characterEncoding) {
    this.characterEncoding = characterEncoding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SrtToCea608708Caption srtToCea608708Caption = (SrtToCea608708Caption) o;
    return Objects.equals(this.input, srtToCea608708Caption.input) &&
        Objects.equals(this.ccChannel, srtToCea608708Caption.ccChannel) &&
        Objects.equals(this.characterEncoding, srtToCea608708Caption.characterEncoding) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, ccChannel, characterEncoding, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SrtToCea608708Caption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    ccChannel: ").append(toIndentedString(ccChannel)).append("\n");
    sb.append("    characterEncoding: ").append(toIndentedString(characterEncoding)).append("\n");
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

