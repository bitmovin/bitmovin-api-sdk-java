package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingVodJobOptions
 */

public class SimpleEncodingVodJobOptions {
  @JsonProperty("singleFileOutput")
  private Boolean singleFileOutput;


  /**
   * Defines if the job should additionally produce a single file as output (e.g., an MP4) for every rendition the Per-Title algorithm produces. This can be useful to provide customers with features such as downloading of videos for different screen sizes.  The single file contains both audio and video streams along the segmented output. Note that currently we do not include subtitles in this file. 
   * @return singleFileOutput
   */
  public Boolean getSingleFileOutput() {
    return singleFileOutput;
  }

  /**
   * Defines if the job should additionally produce a single file as output (e.g., an MP4) for every rendition the Per-Title algorithm produces. This can be useful to provide customers with features such as downloading of videos for different screen sizes.  The single file contains both audio and video streams along the segmented output. Note that currently we do not include subtitles in this file. 
   *
   * @param singleFileOutput
   *        Defines if the job should additionally produce a single file as output (e.g., an MP4) for every rendition the Per-Title algorithm produces. This can be useful to provide customers with features such as downloading of videos for different screen sizes.  The single file contains both audio and video streams along the segmented output. Note that currently we do not include subtitles in this file. 
   */
  public void setSingleFileOutput(Boolean singleFileOutput) {
    this.singleFileOutput = singleFileOutput;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleEncodingVodJobOptions simpleEncodingVodJobOptions = (SimpleEncodingVodJobOptions) o;
    return Objects.equals(this.singleFileOutput, simpleEncodingVodJobOptions.singleFileOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(singleFileOutput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingVodJobOptions {\n");
    
    sb.append("    singleFileOutput: ").append(toIndentedString(singleFileOutput)).append("\n");
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

