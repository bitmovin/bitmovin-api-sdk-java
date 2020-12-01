<p align="center">
  <a href="https://www.bitmovin.com">
    <img alt="Bitmovin Java API SDK Header" src="https://cdn.bitmovin.com/frontend/encoding/openapi-clients/readme-headers/ReadmeHeader_JavaSdk.png" >
  </a>

  <h4 align="center">
    Java API SDK which enables you to seamlessly integrate the Bitmovin API into your projects.
  </h4>

  <p align="center">
    <a href="https://search.maven.org/artifact/com.bitmovin.api.sdk/bitmovin-api-sdk"><img src="https://img.shields.io/maven-central/v/com.bitmovin.api.sdk/bitmovin-api-sdk.svg" alt="Maven"></img></a>
    <a href="https://www.javadoc.io/doc/com.bitmovin.api.sdk/bitmovin-api-sdk"><img src="https://www.javadoc.io/badge/com.bitmovin.api.sdk/bitmovin-api-sdk.svg" alt="Javadocs"></a>
    <a href="LICENSE"><img src="https://img.shields.io/badge/License-MIT-yellow.svg" alt="License"></a>
  </p>
</p>

Using this API client requires an active account.

> Don't have an account yet? [Sign up for a free Bitmovin trial plan](https://dashboard.bitmovin.com/signup)!

For full documentation of all available API endpoints, see the [Bitmovin API reference](https://bitmovin.com/docs).

## Installation

### Maven

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.bitmovin.api.sdk</groupId>
  <artifactId>bitmovin-api-sdk</artifactId>
  <version>1.54.0</version>
  <scope>compile</scope>
</dependency>
```

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

### Gradle

Add this dependency to your project's build file:

```groovy
compile group: 'com.bitmovin.api.sdk', name: 'bitmovin-api-sdk', version: '1.54.0'
```

## Initialization

```java
import com.bitmovin.api.sdk.BitmovinApi;

BitmovinApi bitmovinApi = BitmovinApi.builder()
    .withApiKey("<YOUR_API_KEY>")
    .build();
```

## Examples
You can find sample workflow scripts in the [Bitmovin API SDK examples](https://github.com/bitmovin/bitmovin-api-sdk-examples) repository.

# Previous API Client (Legacy)

`bitmovin-api-sdk-java` is the latest Bitmovin API client for Java. It guarantees 100% specification conformity at any given time and access to all features of the API as soon as they are released. 

However, if you need to use the previous version for legacy reasons, you can still find it at [bitmovin-java](https://github.com/bitmovin/bitmovin-java). 
