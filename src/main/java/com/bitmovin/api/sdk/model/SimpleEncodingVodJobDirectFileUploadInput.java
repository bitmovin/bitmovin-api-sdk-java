package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingVodJobInput;
import com.bitmovin.api.sdk.model.SimpleEncodingVodJobInputType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingVodJobDirectFileUploadInput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = SimpleEncodingVodJobDirectFileUploadInput.class)
public class SimpleEncodingVodJobDirectFileUploadInput extends SimpleEncodingVodJobInput {
  @JsonProperty("inputId")
  private String inputId;

  @JsonProperty("inputType")
  private SimpleEncodingVodJobInputType inputType;

  @JsonProperty("language")
  private String language;


  /**
   * Id of a DirectFileUploadInput (required)
   * @return inputId
   */
  public String getInputId() {
    return inputId;
  }

  /**
   * Id of a DirectFileUploadInput (required)
   *
   * @param inputId
   *        Id of a DirectFileUploadInput (required)
   */
  public void setInputId(String inputId) {
    this.inputId = inputId;
  }


  /**
   * Defines the type of the input file, if no type is set it is assumed that the input file contains at least one video stream and optionally one or multiple audio streams.  Note that when defining video and audio inputs, you can either - add one single input without inputType, in which case that source file must contain a video stream and (if you want audio) one audio stream, or - add one single input with inputType&#x3D;VIDEO and (if you want audio) one or more inputs with inputType&#x3D;AUDIO (each containing one audio stream)  Other combinations are not valid. 
   * @return inputType
   */
  public SimpleEncodingVodJobInputType getInputType() {
    return inputType;
  }

  /**
   * Defines the type of the input file, if no type is set it is assumed that the input file contains at least one video stream and optionally one or multiple audio streams.  Note that when defining video and audio inputs, you can either - add one single input without inputType, in which case that source file must contain a video stream and (if you want audio) one audio stream, or - add one single input with inputType&#x3D;VIDEO and (if you want audio) one or more inputs with inputType&#x3D;AUDIO (each containing one audio stream)  Other combinations are not valid. 
   *
   * @param inputType
   *        Defines the type of the input file, if no type is set it is assumed that the input file contains at least one video stream and optionally one or multiple audio streams.  Note that when defining video and audio inputs, you can either - add one single input without inputType, in which case that source file must contain a video stream and (if you want audio) one audio stream, or - add one single input with inputType&#x3D;VIDEO and (if you want audio) one or more inputs with inputType&#x3D;AUDIO (each containing one audio stream)  Other combinations are not valid. 
   */
  public void setInputType(SimpleEncodingVodJobInputType inputType) {
    this.inputType = inputType;
  }


  /**
   * The language of the audio track, the subtitles, or closed captions file. The language code  must be compliant with [BCP 47](https://datatracker.ietf.org/doc/html/rfc5646).  This property is mandatory if the input provided is of type SUBTITLES or CLOSED_CAPTIONS and  recommended for input type AUDIO and an input that does not specify an input type (combined  audio and video). If an audio input does not specify the language, it is defaulted to &#x60;und&#x60;  (undefined). 
   * @return language
   */
  public String getLanguage() {
    return language;
  }

  /**
   * The language of the audio track, the subtitles, or closed captions file. The language code  must be compliant with [BCP 47](https://datatracker.ietf.org/doc/html/rfc5646).  This property is mandatory if the input provided is of type SUBTITLES or CLOSED_CAPTIONS and  recommended for input type AUDIO and an input that does not specify an input type (combined  audio and video). If an audio input does not specify the language, it is defaulted to &#x60;und&#x60;  (undefined). 
   *
   * @param language
   *        The language of the audio track, the subtitles, or closed captions file. The language code  must be compliant with [BCP 47](https://datatracker.ietf.org/doc/html/rfc5646).  This property is mandatory if the input provided is of type SUBTITLES or CLOSED_CAPTIONS and  recommended for input type AUDIO and an input that does not specify an input type (combined  audio and video). If an audio input does not specify the language, it is defaulted to &#x60;und&#x60;  (undefined). 
   */
  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleEncodingVodJobDirectFileUploadInput simpleEncodingVodJobDirectFileUploadInput = (SimpleEncodingVodJobDirectFileUploadInput) o;
    return Objects.equals(this.inputId, simpleEncodingVodJobDirectFileUploadInput.inputId) &&
        Objects.equals(this.inputType, simpleEncodingVodJobDirectFileUploadInput.inputType) &&
        Objects.equals(this.language, simpleEncodingVodJobDirectFileUploadInput.language) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputId, inputType, language, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingVodJobDirectFileUploadInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputId: ").append(toIndentedString(inputId)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

