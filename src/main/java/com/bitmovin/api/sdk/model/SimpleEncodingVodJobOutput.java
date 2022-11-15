package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingVodJobOutputArtifact;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingVodJobOutput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = SimpleEncodingVodJobOutput.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = SimpleEncodingVodJobUrlOutput.class, name = "URL"),
  @JsonSubTypes.Type(value = SimpleEncodingVodJobCdnOutput.class, name = "CDN"),
})

public class SimpleEncodingVodJobOutput {
  @JsonProperty("artifacts")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<SimpleEncodingVodJobOutputArtifact> artifacts = new ArrayList<SimpleEncodingVodJobOutputArtifact>();

  /**
   * List of artifacts created by the encoding job. Artifacts are files essential for playback of the generated content, e.g. manifests. 
   * @return artifacts
   */
  public List<SimpleEncodingVodJobOutputArtifact> getArtifacts() {
    return artifacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleEncodingVodJobOutput simpleEncodingVodJobOutput = (SimpleEncodingVodJobOutput) o;
    return Objects.equals(this.artifacts, simpleEncodingVodJobOutput.artifacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingVodJobOutput {\n");
    
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
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

