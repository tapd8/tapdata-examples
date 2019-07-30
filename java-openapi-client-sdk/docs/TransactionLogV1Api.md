# TransactionLogV1Api

All URIs are relative to *http://106.75.162.192:3080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionLogV1ControllerCreate**](TransactionLogV1Api.md#transactionLogV1ControllerCreate) | **POST** /api/v1/Transaction_Log | 
[**transactionLogV1ControllerDeleteById**](TransactionLogV1Api.md#transactionLogV1ControllerDeleteById) | **DELETE** /api/v1/Transaction_Log/{id} | delete record by id
[**transactionLogV1ControllerFindById**](TransactionLogV1Api.md#transactionLogV1ControllerFindById) | **GET** /api/v1/Transaction_Log/{id} | get record by id
[**transactionLogV1ControllerFindPage**](TransactionLogV1Api.md#transactionLogV1ControllerFindPage) | **GET** /api/v1/Transaction_Log | get record list by page and limit
[**transactionLogV1ControllerUpdateById**](TransactionLogV1Api.md#transactionLogV1ControllerUpdateById) | **PATCH** /api/v1/Transaction_Log/{id} | update record by id


<a name="transactionLogV1ControllerCreate"></a>
# **transactionLogV1ControllerCreate**
> TransactionLog transactionLogV1ControllerCreate(transactionLog)



### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.TransactionLogV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionLogV1Api apiInstance = new TransactionLogV1Api(defaultClient);
    TransactionLog transactionLog = new TransactionLog(); // TransactionLog | 
    try {
      TransactionLog result = apiInstance.transactionLogV1ControllerCreate(transactionLog);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionLogV1Api#transactionLogV1ControllerCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionLog** | [**TransactionLog**](TransactionLog.md)|  | [optional]

### Return type

[**TransactionLog**](TransactionLog.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Transaction_Log model instance |  -  |

<a name="transactionLogV1ControllerDeleteById"></a>
# **transactionLogV1ControllerDeleteById**
> transactionLogV1ControllerDeleteById(id)

delete record by id

### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.TransactionLogV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionLogV1Api apiInstance = new TransactionLogV1Api(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.transactionLogV1ControllerDeleteById(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionLogV1Api#transactionLogV1ControllerDeleteById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Transaction_Log DELETE success |  -  |

<a name="transactionLogV1ControllerFindById"></a>
# **transactionLogV1ControllerFindById**
> TransactionLog transactionLogV1ControllerFindById(id)

get record by id

### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.TransactionLogV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionLogV1Api apiInstance = new TransactionLogV1Api(defaultClient);
    String id = "id_example"; // String | 
    try {
      TransactionLog result = apiInstance.transactionLogV1ControllerFindById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionLogV1Api#transactionLogV1ControllerFindById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**TransactionLog**](TransactionLog.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Transaction_Log model instance |  -  |

<a name="transactionLogV1ControllerFindPage"></a>
# **transactionLogV1ControllerFindPage**
> InlineResponse2001 transactionLogV1ControllerFindPage(filter)

get record list by page and limit

### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.TransactionLogV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionLogV1Api apiInstance = new TransactionLogV1Api(defaultClient);
    Filter1 filter = new Filter1(); // Filter1 | 
    try {
      InlineResponse2001 result = apiInstance.transactionLogV1ControllerFindPage(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionLogV1Api#transactionLogV1ControllerFindPage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**Filter1**](.md)|  | [optional] [default to null]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Object of page data, result.data is Transaction_Log model instances, result.total is model count. |  -  |

<a name="transactionLogV1ControllerUpdateById"></a>
# **transactionLogV1ControllerUpdateById**
> transactionLogV1ControllerUpdateById(id, transactionLog)

update record by id

### Example
```java
// Import classes:
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.auth.*;
import io.tapdata.sdk.models.*;
import io.tapdata.sdk.api.TransactionLogV1Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://106.75.162.192:3080");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionLogV1Api apiInstance = new TransactionLogV1Api(defaultClient);
    String id = "id_example"; // String | 
    TransactionLog transactionLog = new TransactionLog(); // TransactionLog | 
    try {
      apiInstance.transactionLogV1ControllerUpdateById(id, transactionLog);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionLogV1Api#transactionLogV1ControllerUpdateById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **transactionLog** | [**TransactionLog**](TransactionLog.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Transaction_Log PATCH success |  -  |

