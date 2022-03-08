package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveJobCredentials;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveMaxResolution;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingLiveJobUrlOutput
 */

public class SimpleEncodingLiveJobUrlOutput {
  @JsonProperty("url")
  private String url;

  @JsonProperty("credentials")
  private SimpleEncodingLiveJobCredentials credentials;

  @JsonProperty("makePublic")
  private Boolean makePublic;

  @JsonProperty("maxResolution")
  private SimpleEncodingLiveMaxResolution maxResolution;


  /**
   * Define a URL pointing to a folder which will be used to upload the encoded assets.  The output folder structure used looks the following way: &lt;br&gt;&lt;br&gt; &#x60;http://host/my-folder&#x60;     &lt;ul&gt;       &lt;li&gt;         &#x60;/video&#x60;         &lt;ul&gt;           &lt;li&gt;&#x60;/{width}x{height}/&#x60; (multiple subfolders containing different output renditions)&lt;/li&gt;         &lt;/ul&gt;       &lt;/li&gt;       &lt;li&gt;&#x60;/audio&#x60; &lt;/li&gt;       &lt;li&gt;&#x60;/index.m3u8&#x60; (HLS manifest file) &lt;/li&gt;       &lt;li&gt;&#x60;/stream.mpd&#x60; (DASH manifest file) &lt;/li&gt;     &lt;/ul&gt;  Currently the following protocols/storages systems are supported: S3, GCS, Azure Blob Storage, Akamai NetStorage. Note that most protocols will require &#x60;credentials&#x60; to access the asset. Check the description below which ones are applicable. See below how to construct the URLs for the individual protocals/storage systems.  **S3**: * &#x60;s3://&lt;my-bucket&gt;/path/&#x60;  Authentication can be done via accesskey/secretkey or role-based authentication. Generic S3 is currently NOT supported.  **GCS**: * &#x60;gcs://&lt;my-bucket&gt;/path/&#x60;  Authentication can be done via accesskey/secretkey or a service account  **Azure Blob Storage (ABS)**: * &#x60;https://&lt;account&gt;.blob.core.windows.net/&lt;container&gt;/path/&#x60;  It is required to provide the Azure key credentials for authentication.  **Akamai NetStorage**: * &#x60;https://&lt;host&gt;-nsu.akamaihd.net/&lt;CP-code&gt;/path/&#x60;  It is required to provider username/password credentials for authentication. (required)
   * @return url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Define a URL pointing to a folder which will be used to upload the encoded assets.  The output folder structure used looks the following way: &lt;br&gt;&lt;br&gt; &#x60;http://host/my-folder&#x60;     &lt;ul&gt;       &lt;li&gt;         &#x60;/video&#x60;         &lt;ul&gt;           &lt;li&gt;&#x60;/{width}x{height}/&#x60; (multiple subfolders containing different output renditions)&lt;/li&gt;         &lt;/ul&gt;       &lt;/li&gt;       &lt;li&gt;&#x60;/audio&#x60; &lt;/li&gt;       &lt;li&gt;&#x60;/index.m3u8&#x60; (HLS manifest file) &lt;/li&gt;       &lt;li&gt;&#x60;/stream.mpd&#x60; (DASH manifest file) &lt;/li&gt;     &lt;/ul&gt;  Currently the following protocols/storages systems are supported: S3, GCS, Azure Blob Storage, Akamai NetStorage. Note that most protocols will require &#x60;credentials&#x60; to access the asset. Check the description below which ones are applicable. See below how to construct the URLs for the individual protocals/storage systems.  **S3**: * &#x60;s3://&lt;my-bucket&gt;/path/&#x60;  Authentication can be done via accesskey/secretkey or role-based authentication. Generic S3 is currently NOT supported.  **GCS**: * &#x60;gcs://&lt;my-bucket&gt;/path/&#x60;  Authentication can be done via accesskey/secretkey or a service account  **Azure Blob Storage (ABS)**: * &#x60;https://&lt;account&gt;.blob.core.windows.net/&lt;container&gt;/path/&#x60;  It is required to provide the Azure key credentials for authentication.  **Akamai NetStorage**: * &#x60;https://&lt;host&gt;-nsu.akamaihd.net/&lt;CP-code&gt;/path/&#x60;  It is required to provider username/password credentials for authentication. (required)
   *
   * @param url
   *        Define a URL pointing to a folder which will be used to upload the encoded assets.  The output folder structure used looks the following way: &lt;br&gt;&lt;br&gt; &#x60;http://host/my-folder&#x60;     &lt;ul&gt;       &lt;li&gt;         &#x60;/video&#x60;         &lt;ul&gt;           &lt;li&gt;&#x60;/{width}x{height}/&#x60; (multiple subfolders containing different output renditions)&lt;/li&gt;         &lt;/ul&gt;       &lt;/li&gt;       &lt;li&gt;&#x60;/audio&#x60; &lt;/li&gt;       &lt;li&gt;&#x60;/index.m3u8&#x60; (HLS manifest file) &lt;/li&gt;       &lt;li&gt;&#x60;/stream.mpd&#x60; (DASH manifest file) &lt;/li&gt;     &lt;/ul&gt;  Currently the following protocols/storages systems are supported: S3, GCS, Azure Blob Storage, Akamai NetStorage. Note that most protocols will require &#x60;credentials&#x60; to access the asset. Check the description below which ones are applicable. See below how to construct the URLs for the individual protocals/storage systems.  **S3**: * &#x60;s3://&lt;my-bucket&gt;/path/&#x60;  Authentication can be done via accesskey/secretkey or role-based authentication. Generic S3 is currently NOT supported.  **GCS**: * &#x60;gcs://&lt;my-bucket&gt;/path/&#x60;  Authentication can be done via accesskey/secretkey or a service account  **Azure Blob Storage (ABS)**: * &#x60;https://&lt;account&gt;.blob.core.windows.net/&lt;container&gt;/path/&#x60;  It is required to provide the Azure key credentials for authentication.  **Akamai NetStorage**: * &#x60;https://&lt;host&gt;-nsu.akamaihd.net/&lt;CP-code&gt;/path/&#x60;  It is required to provider username/password credentials for authentication. (required)
   */
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Credentials to be used for authentication and accessing the folder. 
   * @return credentials
   */
  public SimpleEncodingLiveJobCredentials getCredentials() {
    return credentials;
  }

  /**
   * Credentials to be used for authentication and accessing the folder. 
   *
   * @param credentials
   *        Credentials to be used for authentication and accessing the folder. 
   */
  public void setCredentials(SimpleEncodingLiveJobCredentials credentials) {
    this.credentials = credentials;
  }


  /**
   * Indicates if the output should be publically available so that playback immediately works over the internet. Note that not every storage provider supports public output, in this case the flag will be ignored (e.g., Akamai NetStorage).  It might forbidden by some storage configuration to make files public, for example an S3 buckets can be configured to disallow public access. In this case set it to false. 
   * @return makePublic
   */
  public Boolean getMakePublic() {
    return makePublic;
  }

  /**
   * Indicates if the output should be publically available so that playback immediately works over the internet. Note that not every storage provider supports public output, in this case the flag will be ignored (e.g., Akamai NetStorage).  It might forbidden by some storage configuration to make files public, for example an S3 buckets can be configured to disallow public access. In this case set it to false. 
   *
   * @param makePublic
   *        Indicates if the output should be publically available so that playback immediately works over the internet. Note that not every storage provider supports public output, in this case the flag will be ignored (e.g., Akamai NetStorage).  It might forbidden by some storage configuration to make files public, for example an S3 buckets can be configured to disallow public access. In this case set it to false. 
   */
  public void setMakePublic(Boolean makePublic) {
    this.makePublic = makePublic;
  }


  /**
   * This sets the maximum output resolution that will be generated.
   * @return maxResolution
   */
  public SimpleEncodingLiveMaxResolution getMaxResolution() {
    return maxResolution;
  }

  /**
   * This sets the maximum output resolution that will be generated.
   *
   * @param maxResolution
   *        This sets the maximum output resolution that will be generated.
   */
  public void setMaxResolution(SimpleEncodingLiveMaxResolution maxResolution) {
    this.maxResolution = maxResolution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleEncodingLiveJobUrlOutput simpleEncodingLiveJobUrlOutput = (SimpleEncodingLiveJobUrlOutput) o;
    return Objects.equals(this.url, simpleEncodingLiveJobUrlOutput.url) &&
        Objects.equals(this.credentials, simpleEncodingLiveJobUrlOutput.credentials) &&
        Objects.equals(this.makePublic, simpleEncodingLiveJobUrlOutput.makePublic) &&
        Objects.equals(this.maxResolution, simpleEncodingLiveJobUrlOutput.maxResolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, credentials, makePublic, maxResolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingLiveJobUrlOutput {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    makePublic: ").append(toIndentedString(makePublic)).append("\n");
    sb.append("    maxResolution: ").append(toIndentedString(maxResolution)).append("\n");
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

