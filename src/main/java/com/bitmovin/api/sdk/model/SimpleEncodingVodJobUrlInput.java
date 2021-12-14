package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingVodJobCredentials;
import com.bitmovin.api.sdk.model.SimpleEncodingVodJobInputType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingVodJobUrlInput
 */

public class SimpleEncodingVodJobUrlInput {
  @JsonProperty("url")
  private String url;

  @JsonProperty("credentials")
  private SimpleEncodingVodJobCredentials credentials;

  @JsonProperty("inputType")
  private SimpleEncodingVodJobInputType inputType;

  @JsonProperty("language")
  private String language;


  /**
   * Define a URL pointing to the asset that should be encoded. The URL has to point to a file.  Currently the following protocols/storages systems are supported: HTTP(S), (S)FTP, S3, GCS, Azure Blob Storage, Akamai NetStorage. Note that most protocols will require &#x60;credentials&#x60; to access the asset. Check the description below which ones are applicable. See below how to construct the URLs for the individual protocals/storage systems.  ---  **HTTP** and **HTTPS**: * &#x60;http://&lt;host&gt;[:&lt;port&gt;]/path/file.mp4&#x60; * &#x60;https://&lt;host&gt;[:&lt;port&gt;]/path/file.mp4&#x60;  The port is defaulted to 80 if it&#39;s not provided. If the content is secured by Basic Authentication please provide corresponding credentials.  **FTP** and **SFTP**: * &#x60;ftp://&lt;host&gt;[:&lt;port&gt;]/path/file.mp4&#x60; * &#x60;sftp://&lt;host&gt;[:&lt;port&gt;]/path/file.mp4&#x60;  The port is defaulted to 21 (ftp) or  22 (sftp) if it&#39;s not provided. If the content is secured please provide corresponding credentials.  **S3**: * &#x60;s3://&lt;my-bucket&gt;/path/file.mp4&#x60;  Authentication can be done via accesskey/secretkey or role-based authentication. Generic S3 is currently NOT supported.  **GCS**: * &#x60;gcs://&lt;my-bucket&gt;/path/file.mp4&#x60;  Authentication can be done via accesskey/secretkey or a service account  **Azure Blob Storage (ABS)**: * &#x60;https://&lt;account&gt;.blob.core.windows.net/&lt;container&gt;/path/file.mp4&#x60;  It is required to provide the Azure key credentials for authentication.  **Akamai NetStorage**: * &#x60;https://&lt;host&gt;-nsu.akamaihd.net/&lt;CP-code&gt;/path/file.mp4&#x60;  It is required to provider username/password credentials for authentication. (required)
   * @return url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Define a URL pointing to the asset that should be encoded. The URL has to point to a file.  Currently the following protocols/storages systems are supported: HTTP(S), (S)FTP, S3, GCS, Azure Blob Storage, Akamai NetStorage. Note that most protocols will require &#x60;credentials&#x60; to access the asset. Check the description below which ones are applicable. See below how to construct the URLs for the individual protocals/storage systems.  ---  **HTTP** and **HTTPS**: * &#x60;http://&lt;host&gt;[:&lt;port&gt;]/path/file.mp4&#x60; * &#x60;https://&lt;host&gt;[:&lt;port&gt;]/path/file.mp4&#x60;  The port is defaulted to 80 if it&#39;s not provided. If the content is secured by Basic Authentication please provide corresponding credentials.  **FTP** and **SFTP**: * &#x60;ftp://&lt;host&gt;[:&lt;port&gt;]/path/file.mp4&#x60; * &#x60;sftp://&lt;host&gt;[:&lt;port&gt;]/path/file.mp4&#x60;  The port is defaulted to 21 (ftp) or  22 (sftp) if it&#39;s not provided. If the content is secured please provide corresponding credentials.  **S3**: * &#x60;s3://&lt;my-bucket&gt;/path/file.mp4&#x60;  Authentication can be done via accesskey/secretkey or role-based authentication. Generic S3 is currently NOT supported.  **GCS**: * &#x60;gcs://&lt;my-bucket&gt;/path/file.mp4&#x60;  Authentication can be done via accesskey/secretkey or a service account  **Azure Blob Storage (ABS)**: * &#x60;https://&lt;account&gt;.blob.core.windows.net/&lt;container&gt;/path/file.mp4&#x60;  It is required to provide the Azure key credentials for authentication.  **Akamai NetStorage**: * &#x60;https://&lt;host&gt;-nsu.akamaihd.net/&lt;CP-code&gt;/path/file.mp4&#x60;  It is required to provider username/password credentials for authentication. (required)
   *
   * @param url
   *        Define a URL pointing to the asset that should be encoded. The URL has to point to a file.  Currently the following protocols/storages systems are supported: HTTP(S), (S)FTP, S3, GCS, Azure Blob Storage, Akamai NetStorage. Note that most protocols will require &#x60;credentials&#x60; to access the asset. Check the description below which ones are applicable. See below how to construct the URLs for the individual protocals/storage systems.  ---  **HTTP** and **HTTPS**: * &#x60;http://&lt;host&gt;[:&lt;port&gt;]/path/file.mp4&#x60; * &#x60;https://&lt;host&gt;[:&lt;port&gt;]/path/file.mp4&#x60;  The port is defaulted to 80 if it&#39;s not provided. If the content is secured by Basic Authentication please provide corresponding credentials.  **FTP** and **SFTP**: * &#x60;ftp://&lt;host&gt;[:&lt;port&gt;]/path/file.mp4&#x60; * &#x60;sftp://&lt;host&gt;[:&lt;port&gt;]/path/file.mp4&#x60;  The port is defaulted to 21 (ftp) or  22 (sftp) if it&#39;s not provided. If the content is secured please provide corresponding credentials.  **S3**: * &#x60;s3://&lt;my-bucket&gt;/path/file.mp4&#x60;  Authentication can be done via accesskey/secretkey or role-based authentication. Generic S3 is currently NOT supported.  **GCS**: * &#x60;gcs://&lt;my-bucket&gt;/path/file.mp4&#x60;  Authentication can be done via accesskey/secretkey or a service account  **Azure Blob Storage (ABS)**: * &#x60;https://&lt;account&gt;.blob.core.windows.net/&lt;container&gt;/path/file.mp4&#x60;  It is required to provide the Azure key credentials for authentication.  **Akamai NetStorage**: * &#x60;https://&lt;host&gt;-nsu.akamaihd.net/&lt;CP-code&gt;/path/file.mp4&#x60;  It is required to provider username/password credentials for authentication. (required)
   */
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Credentials to be used for authentication and accessing the file. Check out the examples on how to define the credentials correctly. 
   * @return credentials
   */
  public SimpleEncodingVodJobCredentials getCredentials() {
    return credentials;
  }

  /**
   * Credentials to be used for authentication and accessing the file. Check out the examples on how to define the credentials correctly. 
   *
   * @param credentials
   *        Credentials to be used for authentication and accessing the file. Check out the examples on how to define the credentials correctly. 
   */
  public void setCredentials(SimpleEncodingVodJobCredentials credentials) {
    this.credentials = credentials;
  }


  /**
   * Defines the type of the input file, if no type is set it is assumed that the input file contains at least one video stream and optionally one or multiple audio streams. 
   * @return inputType
   */
  public SimpleEncodingVodJobInputType getInputType() {
    return inputType;
  }

  /**
   * Defines the type of the input file, if no type is set it is assumed that the input file contains at least one video stream and optionally one or multiple audio streams. 
   *
   * @param inputType
   *        Defines the type of the input file, if no type is set it is assumed that the input file contains at least one video stream and optionally one or multiple audio streams. 
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
    SimpleEncodingVodJobUrlInput simpleEncodingVodJobUrlInput = (SimpleEncodingVodJobUrlInput) o;
    return Objects.equals(this.url, simpleEncodingVodJobUrlInput.url) &&
        Objects.equals(this.credentials, simpleEncodingVodJobUrlInput.credentials) &&
        Objects.equals(this.inputType, simpleEncodingVodJobUrlInput.inputType) &&
        Objects.equals(this.language, simpleEncodingVodJobUrlInput.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, credentials, inputType, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingVodJobUrlInput {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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

