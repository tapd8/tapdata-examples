# tapdata-sdk

Tapdata OpenAPI
- API version: moa-v1.1.0-117-g6b02a67
  - Build date: 2019-07-29T11:08:48.431+08:00[Asia/Shanghai]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.tapdata</groupId>
  <artifactId>tapdata-sdk</artifactId>
  <version>moa-v1.1.0-117-g6b02a67</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.tapdata:tapdata-sdk:moa-v1.1.0-117-g6b02a67"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/tapdata-sdk-moa-v1.1.0-117-g6b02a67.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.CustomerV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomerV1Api apiInstance = new CustomerV1Api(defaultClient);
    Customer customer = new Customer(); // Customer | 
    try {
      Customer result = apiInstance.customerV1ControllerCreate(customer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerV1Api#customerV1ControllerCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://106.75.162.192:3080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CustomerV1Api* | [**customerV1ControllerCreate**](docs/CustomerV1Api.md#customerV1ControllerCreate) | **POST** /api/v1/Customer | 
*CustomerV1Api* | [**customerV1ControllerDeleteById**](docs/CustomerV1Api.md#customerV1ControllerDeleteById) | **DELETE** /api/v1/Customer/{id} | delete record by id
*CustomerV1Api* | [**customerV1ControllerFindById**](docs/CustomerV1Api.md#customerV1ControllerFindById) | **GET** /api/v1/Customer/{id} | get record by id
*CustomerV1Api* | [**customerV1ControllerFindPage**](docs/CustomerV1Api.md#customerV1ControllerFindPage) | **GET** /api/v1/Customer | get record list by page and limit
*CustomerV1Api* | [**customerV1ControllerUpdateById**](docs/CustomerV1Api.md#customerV1ControllerUpdateById) | **PATCH** /api/v1/Customer/{id} | update record by id
*TransactionLogV1Api* | [**transactionLogV1ControllerCreate**](docs/TransactionLogV1Api.md#transactionLogV1ControllerCreate) | **POST** /api/v1/Transaction_Log | 
*TransactionLogV1Api* | [**transactionLogV1ControllerDeleteById**](docs/TransactionLogV1Api.md#transactionLogV1ControllerDeleteById) | **DELETE** /api/v1/Transaction_Log/{id} | delete record by id
*TransactionLogV1Api* | [**transactionLogV1ControllerFindById**](docs/TransactionLogV1Api.md#transactionLogV1ControllerFindById) | **GET** /api/v1/Transaction_Log/{id} | get record by id
*TransactionLogV1Api* | [**transactionLogV1ControllerFindPage**](docs/TransactionLogV1Api.md#transactionLogV1ControllerFindPage) | **GET** /api/v1/Transaction_Log | get record list by page and limit
*TransactionLogV1Api* | [**transactionLogV1ControllerUpdateById**](docs/TransactionLogV1Api.md#transactionLogV1ControllerUpdateById) | **PATCH** /api/v1/Transaction_Log/{id} | update record by id


## Documentation for Models

 - [ApiV1CustomerFields](docs/ApiV1CustomerFields.md)
 - [ApiV1TransactionLogFields](docs/ApiV1TransactionLogFields.md)
 - [Customer](docs/Customer.md)
 - [Filter](docs/Filter.md)
 - [Filter1](docs/Filter1.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse200Total](docs/InlineResponse200Total.md)
 - [TransactionLog](docs/TransactionLog.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### OAuth2

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: http://127.0.0.1:3030/oauth/authorize
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

## TransactionLogV1ApiTest Run mvn test

### Run all Test
1. create one
2. find by id
3. update one
4. find by id
5. find page
```$xslt
mvn test -Dtest=TransactionLogV1ApiTest#allTest
```

### Create One
```$xslt
mvn test -Dtest=TransactionLogV1ApiTest#transactionLogV1ControllerCreateTest \
-Dcustomer_id=123 -Dshop=LINING
```

### Find by id
```$xslt
mvn test -Dtest=TransactionLogV1ApiTest#transactionLogV1ControllerFindByIdTest \
-Dtransaction_id=5d39171822ac0165bc3d1a8f
```

### Delete by id
```$xslt
mvn test -Dtest=TransactionLogV1ApiTest#transactionLogV1ControllerDeleteByIdTest \
-Dtransaction_id=5d39171822ac0165bc3d1a8f
```

### Find page
```$xslt
mvn test -Dtest=TransactionLogV1ApiTest#transactionLogV1ControllerFindPageTest \
 -Dlimit=5 -Dskip=0
```