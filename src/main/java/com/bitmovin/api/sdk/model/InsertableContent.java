package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.InsertableContentInput;
import com.bitmovin.api.sdk.model.InsertableContentStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * InsertableContent
 */

public class InsertableContent extends BitmovinResource {
  @JsonProperty("inputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<InsertableContentInput> inputs = new ArrayList<InsertableContentInput>();

  @JsonProperty("status")
  private InsertableContentStatus status;


  public InsertableContent addInputsItem(InsertableContentInput inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * Either a list of movie files to be inserted in the live stream or a single image file. The movie files must have a video stream at stream position 0, which matches the codec, resolution and framerate of the livestream. The number of audio streams must also be the same and they have to match the sample format, number of channels and sample rate of the audio streams of the livestream. Supported image formats are: &#x60;.Y.U.V&#x60;, &#x60;Alias PIX&#x60;, &#x60;animated GIF&#x60;, &#x60;APNG&#x60;, &#x60;BMP&#x60;, &#x60;DPX&#x60;, &#x60;FITS&#x60;, &#x60;JPEG&#x60;, &#x60;JPEG 2000&#x60;, &#x60;JPEG-LS&#x60;, &#x60;PAM&#x60;, &#x60;PBM&#x60;, &#x60;PCX&#x60;, &#x60;PGM&#x60;, &#x60;PGMYUV&#x60;, &#x60;PNG&#x60;, &#x60;PPM&#x60;, &#x60;SGI&#x60;, &#x60;Sun Rasterfile&#x60;, &#x60;TIFF&#x60;, &#x60;Truevision Targa&#x60;, &#x60;WebP&#x60;, &#x60;XBM&#x60;, &#x60;XFace&#x60;, &#x60;XPM&#x60;, &#x60;XWD&#x60;
   * @return inputs
   */
  public List<InsertableContentInput> getInputs() {
    return inputs;
  }

  /**
   * Either a list of movie files to be inserted in the live stream or a single image file. The movie files must have a video stream at stream position 0, which matches the codec, resolution and framerate of the livestream. The number of audio streams must also be the same and they have to match the sample format, number of channels and sample rate of the audio streams of the livestream. Supported image formats are: &#x60;.Y.U.V&#x60;, &#x60;Alias PIX&#x60;, &#x60;animated GIF&#x60;, &#x60;APNG&#x60;, &#x60;BMP&#x60;, &#x60;DPX&#x60;, &#x60;FITS&#x60;, &#x60;JPEG&#x60;, &#x60;JPEG 2000&#x60;, &#x60;JPEG-LS&#x60;, &#x60;PAM&#x60;, &#x60;PBM&#x60;, &#x60;PCX&#x60;, &#x60;PGM&#x60;, &#x60;PGMYUV&#x60;, &#x60;PNG&#x60;, &#x60;PPM&#x60;, &#x60;SGI&#x60;, &#x60;Sun Rasterfile&#x60;, &#x60;TIFF&#x60;, &#x60;Truevision Targa&#x60;, &#x60;WebP&#x60;, &#x60;XBM&#x60;, &#x60;XFace&#x60;, &#x60;XPM&#x60;, &#x60;XWD&#x60;
   *
   * @param inputs
   *        Either a list of movie files to be inserted in the live stream or a single image file. The movie files must have a video stream at stream position 0, which matches the codec, resolution and framerate of the livestream. The number of audio streams must also be the same and they have to match the sample format, number of channels and sample rate of the audio streams of the livestream. Supported image formats are: &#x60;.Y.U.V&#x60;, &#x60;Alias PIX&#x60;, &#x60;animated GIF&#x60;, &#x60;APNG&#x60;, &#x60;BMP&#x60;, &#x60;DPX&#x60;, &#x60;FITS&#x60;, &#x60;JPEG&#x60;, &#x60;JPEG 2000&#x60;, &#x60;JPEG-LS&#x60;, &#x60;PAM&#x60;, &#x60;PBM&#x60;, &#x60;PCX&#x60;, &#x60;PGM&#x60;, &#x60;PGMYUV&#x60;, &#x60;PNG&#x60;, &#x60;PPM&#x60;, &#x60;SGI&#x60;, &#x60;Sun Rasterfile&#x60;, &#x60;TIFF&#x60;, &#x60;Truevision Targa&#x60;, &#x60;WebP&#x60;, &#x60;XBM&#x60;, &#x60;XFace&#x60;, &#x60;XPM&#x60;, &#x60;XWD&#x60;
   */
  public void setInputs(List<InsertableContentInput> inputs) {
    this.inputs = inputs;
  }

  /**
   * Status of the insertable content.
   * @return status
   */
  public InsertableContentStatus getStatus() {
    return status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertableContent insertableContent = (InsertableContent) o;
    return Objects.equals(this.inputs, insertableContent.inputs) &&
        Objects.equals(this.status, insertableContent.status) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputs, status, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertableContent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

