# Bitmovin Java API Client [![Javadocs](https://www.javadoc.io/badge/com.bitmovin.api.sdk/bitmovin-api-sdk.svg)](https://www.javadoc.io/doc/com.bitmovin.api.sdk/bitmovin-api-sdk)

[![bitmovin](http://bitmovin-a.akamaihd.net/webpages/bitmovin-logo-github.png)](http://www.bitmovin.com)

Java-Client which enables you to seamlessly integrate the Bitmovin API into your projects. Using this API client requires an active account.

[Sign up for a Bitmovin Account!](https://dashboard.bitmovin.com/signup)

The full API reference can be found [here](https://bitmovin.com/docs).

## Installation

### Maven

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.bitmovin.api.sdk</groupId>
  <artifactId>bitmovin-api-sdk</artifactId>
  <version>1.18.0</version>
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
compile group: 'com.bitmovin.api.sdk', name= 'bitmovin-api-sdk', version: '1.18.0'
```

## Initialization

```java
import com.bitmovin.api.sdk.BitmovinApi;

BitmovinApi bitmovinApi = BitmovinApi.builder()
    .withApiKey("<YOUR_API_KEY>")
    .build();
```
