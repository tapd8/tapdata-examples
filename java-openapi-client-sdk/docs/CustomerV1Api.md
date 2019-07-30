# CustomerV1Api

All URIs are relative to *http://106.75.162.192:3080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerV1ControllerCreate**](CustomerV1Api.md#customerV1ControllerCreate) | **POST** /api/v1/Customer | 
[**customerV1ControllerDeleteById**](CustomerV1Api.md#customerV1ControllerDeleteById) | **DELETE** /api/v1/Customer/{id} | delete record by id
[**customerV1ControllerFindById**](CustomerV1Api.md#customerV1ControllerFindById) | **GET** /api/v1/Customer/{id} | get record by id
[**customerV1ControllerFindPage**](CustomerV1Api.md#customerV1ControllerFindPage) | **GET** /api/v1/Customer | get record list by page and limit
[**customerV1ControllerUpdateById**](CustomerV1Api.md#customerV1ControllerUpdateById) | **PATCH** /api/v1/Customer/{id} | update record by id


<a name="customerV1ControllerCreate"></a>
# **customerV1ControllerCreate**
> Customer customerV1ControllerCreate(customer)



### Example
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)|  | [optional]

### Return type

[**Customer**](Customer.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Customer model instance |  -  |

<a name="customerV1ControllerDeleteById"></a>
# **customerV1ControllerDeleteById**
> customerV1ControllerDeleteById(id)

delete record by id

### Example
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
    String id = "id_example"; // String | 
    try {
      apiInstance.customerV1ControllerDeleteById(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerV1Api#customerV1ControllerDeleteById");
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
**204** | Customer DELETE success |  -  |

<a name="customerV1ControllerFindById"></a>
# **customerV1ControllerFindById**
> Customer customerV1ControllerFindById(id)

get record by id

### Example
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
    String id = "id_example"; // String | 
    try {
      Customer result = apiInstance.customerV1ControllerFindById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerV1Api#customerV1ControllerFindById");
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

[**Customer**](Customer.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Customer model instance |  -  |

<a name="customerV1ControllerFindPage"></a>
# **customerV1ControllerFindPage**
> InlineResponse200 customerV1ControllerFindPage(filter)

get record list by page and limit

### Example
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
    Filter filter = new Filter(); // Filter | 
    try {
      InlineResponse200 result = apiInstance.customerV1ControllerFindPage(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerV1Api#customerV1ControllerFindPage");
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
 **filter** | [**Filter**](.md)|  | [optional] [default to null]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Object of page data, result.data is Customer model instances, result.total is model count. |  -  |

<a name="customerV1ControllerUpdateById"></a>
# **customerV1ControllerUpdateById**
> customerV1ControllerUpdateById(id, customer)

update record by id

### Example
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
    String id = "id_example"; // String | 
    Customer customer = new Customer(); // Customer | 
    try {
      apiInstance.customerV1ControllerUpdateById(id, customer);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerV1Api#customerV1ControllerUpdateById");
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
 **customer** | [**Customer**](Customer.md)|  | [optional]

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
**204** | Customer PATCH success |  -  |

