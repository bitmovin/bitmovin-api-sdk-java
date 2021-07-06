package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DolbyDigitalPlusSurroundMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DolbyDigitalPlusBitstreamInfo
 */

public class DolbyDigitalPlusBitstreamInfo {
  @JsonProperty("surroundMode")
  private DolbyDigitalPlusSurroundMode surroundMode;

  @JsonProperty("surroundExMode")
  private DolbyDigitalPlusSurroundMode surroundExMode;


  /**
   * This parameter indicates to a decoder whether the two‐channel encoded bitstream contains a Dolby Surround (Lt/Rt) program that requires Dolby Pro Logic decoding.  When downmixing to stereo from a multichannel input, set this value according to the type of downmix performed (Lt/Rt: &#x60;ENABLED&#x60;, Lo/Ro: &#x60;DISABLED&#x60;). When transcoding a stereo Dolby Digital, Dolby Digital Plus, or Dolby E input, the value must be passed through from the input bitstream to the output bitstream. When transcoding a third-party stereo input to stereo Dolby Digital set the value to &#x60;NOT_INDICATED&#x60;. 
   * @return surroundMode
   */
  public DolbyDigitalPlusSurroundMode getSurroundMode() {
    return surroundMode;
  }

  /**
   * This parameter indicates to a decoder whether the two‐channel encoded bitstream contains a Dolby Surround (Lt/Rt) program that requires Dolby Pro Logic decoding.  When downmixing to stereo from a multichannel input, set this value according to the type of downmix performed (Lt/Rt: &#x60;ENABLED&#x60;, Lo/Ro: &#x60;DISABLED&#x60;). When transcoding a stereo Dolby Digital, Dolby Digital Plus, or Dolby E input, the value must be passed through from the input bitstream to the output bitstream. When transcoding a third-party stereo input to stereo Dolby Digital set the value to &#x60;NOT_INDICATED&#x60;. 
   *
   * @param surroundMode
   *        This parameter indicates to a decoder whether the two‐channel encoded bitstream contains a Dolby Surround (Lt/Rt) program that requires Dolby Pro Logic decoding.  When downmixing to stereo from a multichannel input, set this value according to the type of downmix performed (Lt/Rt: &#x60;ENABLED&#x60;, Lo/Ro: &#x60;DISABLED&#x60;). When transcoding a stereo Dolby Digital, Dolby Digital Plus, or Dolby E input, the value must be passed through from the input bitstream to the output bitstream. When transcoding a third-party stereo input to stereo Dolby Digital set the value to &#x60;NOT_INDICATED&#x60;. 
   */
  public void setSurroundMode(DolbyDigitalPlusSurroundMode surroundMode) {
    this.surroundMode = surroundMode;
  }


  /**
   * This is used to identify the encoded audio as material encoded in Dolby Digital Surround EX. This parameter is used only if the encoded audio has two surround channels.  An amplifier or receiver with Dolby Digital Surround EX decoding can use this parameter as a flag to switch the decoding on or off automatically. The behavior is similar to that of the &#x60;surroundMode&#x60; parameter. 
   * @return surroundExMode
   */
  public DolbyDigitalPlusSurroundMode getSurroundExMode() {
    return surroundExMode;
  }

  /**
   * This is used to identify the encoded audio as material encoded in Dolby Digital Surround EX. This parameter is used only if the encoded audio has two surround channels.  An amplifier or receiver with Dolby Digital Surround EX decoding can use this parameter as a flag to switch the decoding on or off automatically. The behavior is similar to that of the &#x60;surroundMode&#x60; parameter. 
   *
   * @param surroundExMode
   *        This is used to identify the encoded audio as material encoded in Dolby Digital Surround EX. This parameter is used only if the encoded audio has two surround channels.  An amplifier or receiver with Dolby Digital Surround EX decoding can use this parameter as a flag to switch the decoding on or off automatically. The behavior is similar to that of the &#x60;surroundMode&#x60; parameter. 
   */
  public void setSurroundExMode(DolbyDigitalPlusSurroundMode surroundExMode) {
    this.surroundExMode = surroundExMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DolbyDigitalPlusBitstreamInfo dolbyDigitalPlusBitstreamInfo = (DolbyDigitalPlusBitstreamInfo) o;
    return Objects.equals(this.surroundMode, dolbyDigitalPlusBitstreamInfo.surroundMode) &&
        Objects.equals(this.surroundExMode, dolbyDigitalPlusBitstreamInfo.surroundExMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surroundMode, surroundExMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyDigitalPlusBitstreamInfo {\n");
    
    sb.append("    surroundMode: ").append(toIndentedString(surroundMode)).append("\n");
    sb.append("    surroundExMode: ").append(toIndentedString(surroundExMode)).append("\n");
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

