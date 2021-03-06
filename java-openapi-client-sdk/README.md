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

## 查询条件说明

调用分页查询接口，可以在 URL 查询字符串中添加 “filter” 查询条件过滤数据。

**sdk对于查询条件，已有一些优化处理，在编写条件时，可以不需填入filter**

以下为where的示例
```
Filter filter = new Filter();

Map<String, Object> where = new HashMap();
where.put("[field1]", "value");
where.put("[field2][gt]", 1000);

filter.setWhere(where);
```

默认支持以下几种过滤器：
- **字段过滤器(Field filter)**: 按需返回指定的字段
- **限定返回记录数过滤器(limit filter)**: 限定返回记录行数
- **跳过指定记录数过滤器(Skip filter)**: 跳过指定行数返回
- **查询条件过滤器(Where filter)**: 根据一组具有逻辑关系的条件查询匹配数据并返回，类似SQL 的 WHERE 子句。

### 字段过滤器(Field filter)

字段过滤器是指定返回的数据中包含或不包含某些字段。

```
filter[fields][propertyName]=<true|false>&filter[fields][propertyName]=<true|false>...
```

默认情况下，查询返回结果中包含数据模型的所有属性。如果您指定了至少一个字段过滤器的值为 true，那么查询返回结果中将仅包含您专门指定包含的那些字段。

**例子**

只返回 Logs 数据模型中的 level、date、message 字段属性的值：

```
?filter[fields][level]=true&filter[fields][message]=true&filter[fields][date]=true
```

返回的结果：

```
{
"data": [
{
"level": "INFO",
"message": "generator controller /home/lg/workspace/nodejs/apig/src/controllers/logs-v-1.controller.ts",         "date": "2019-07-13T09:12:05.134Z"
}, {
"level": "INFO",
"message": "generator controller /home/lg/workspace/nodejs/apig/src/controllers/logs-v-1.controller.ts",         "date": "2019-07-13T09:12:05.134Z"
},      ...
]
}
```

### 限定返回记录数过滤器(limit filter)

限制返回记录总条数等于或小于一个指定的数值。通常与 skip filter 配合使用，实现分页查询。

```
filter[limit]=n
```

**例子**

只返回10条查询结果：

```
?filter[limit]=10
```

### 跳过指定记录数过滤器(skip filter)

返回第 1 个开始跳过指定个数记录后的查询结果。通常与 limit filter 配合使用，实现分页查询。

```
filter[skip]=n
```

**例子**

查询结果中，从第 10 条记录开始返回：

```
?filter[skip]=10
```

**分页查询例子：**

每页数据显示 10 条记录，查询第 5 页的数据：

```
?filter[limit]=10&filter[skip]=50
```

### 查询条件过滤器(where filter)

在实现业务逻辑过程中，通常需要使用至少一组具有逻辑关系的查询条件来过滤出需要的数据。

在这里您也可以指定一组或多组查询条件来查询数据。

where filter 通常有两种写法，在下面的第一种写法，表示 指定属性 等于 指定值，即 等值查询；第二种写法表示 指定属性 操作符号 指定值，适用于类似 大于、小于 等逻辑查询。

```
?filter[where][property]=value

?filter[where][property][operator]=value
```

- property: 数据模型中的属性名称
- operator: 逻辑操作符，必须是下面表格中一个

#### 操作符列表

| 操作符号 | 说明 |
| ------- | --- |
| and | 逻辑 AND 操作。|
| or | 逻辑 OR 操作。 |
| gt, gte | 数字大小比较 大于(>)、大于等于(>=)。 |
| lt, lte | 数字大小比较 小于（<）、小于等于（<）。 |
| between | 区间查询，大于等于第一个值，小于等于第二个值。 |
| inq, nin | IN / NOT IN 一组值. |
| like, nlike | LIKE / NOT LIKE 模糊查询 |
| regexp | 正则表达式匹配查询 |

#### AND / OR 组合条件查询

使用 and / or 操作符号，可以组合两个或多个查询条件调用接口查询数据。

```
filter[where][<and|or>][0]condition1&filter[where][<and|or>][1]condition2...
```

例一，查询 api-server 程序的 INFO 日志：

```
?filter[where][and][0][level]=INFO&filter[where][and][1][loggerName]=api-server
```

例二，查询 api-server 程序的 INFO 日志和 tapdata-managent 程序的 ERROR 日志：

```
?filter[where][or][0][and][0][level]=ERROR&filter[where][or][0][and][1][loggerName]=tapdata-managent&filter[where][or][1][and][0][level]=INFO&filter[where][or][1][and][1][loggerName]=api-server
```

#### gt / gte / lt / lte / like / nlike / regexp 操作符

```
filter[where][property][operator]=value
```

例一，查询日志时间大于指定日期的日志：

```
?filter[where][date][gte]=2019-07-18T10:26:00.000Z
```

注：日期格式为

例二，正则表达式匹配 message ：

```
?filter[where][message][regexp]=LogsController.*findPage
```

#### inq / nin 操作符号

```
filter[where][property][<inq | nin>][0]=value1&filter[where][property][<inq | nin>][1]=value2...
    ```

    #### between 操作符号

    ```
    filter[where][property][<inq | nin>][0]=value1&filter[where][property][<inq | nin>][1]=value2...
        ```

        例一，查询日期在 2019-07-01 到 2019-07-02 之间的日志

        ```
        ?filter[where][date][between][0]=2019-07-01T00:00:00.000Z&filter[where][date][between][1]=2019-07-02T00:00:00.000Z
        ```