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


---

## Documentation & Release Notes
+ Full Bitmovin API reference documentation: https://bitmovin.com/docs/encoding/api-reference
+ SDK reference documentation for Java: https://www.javadoc.io/doc/com.bitmovin.api.sdk/bitmovin-api-sdk
+ Release Notes: https://bitmovin.com/docs/encoding/changelogs/rest

## Support
If you have any questions or issues with this SDK or its examples, or you require other technical support for our services, please login to your Bitmovin Dashboard at https://bitmovin.com/dashboard and [create a new support ticket](https://bitmovin.com/dashboard/support/cases/create?tab=encoding). Our team will get back to you as soon as possible :+1:

---

## Installation

### Maven

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.bitmovin.api.sdk</groupId>
  <artifactId>bitmovin-api-sdk</artifactId>
  <version>1.111.0</version>
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
compile group: 'com.bitmovin.api.sdk', name: 'bitmovin-api-sdk', version: '1.111.0'
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
 
---

## Deprecated API Client (Legacy)

`bitmovin-api-sdk-java` is the latest Bitmovin API client for Java. It guarantees 100% specification conformity at any given time and access to all features of the API as soon as they are released.

However, if you need to use the previous version for legacy reasons, you can still find it at [bitmovin-java](https://github.com/bitmovin/bitmovin-java).
