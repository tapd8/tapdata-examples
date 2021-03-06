/*
 * Tapdata OpenAPI
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: moa-v1.1.0-117-g6b02a67
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.tapdata.sdk.api;

import io.tapdata.sdk.ApiCallback;
import io.tapdata.sdk.ApiClient;
import io.tapdata.sdk.ApiException;
import io.tapdata.sdk.ApiResponse;
import io.tapdata.sdk.Configuration;
import io.tapdata.sdk.Pair;
import io.tapdata.sdk.ProgressRequestBody;
import io.tapdata.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.tapdata.sdk.model.Customer;
import io.tapdata.sdk.model.Filter;
import io.tapdata.sdk.model.InlineResponse200;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerV1Api {
    private ApiClient localVarApiClient;

    public CustomerV1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomerV1Api(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for customerV1ControllerCreate
     * @param customer  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Customer model instance </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call customerV1ControllerCreateCall(Customer customer, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = customer;

        // create path and map variables
        String localVarPath = "/api/v1/Customer";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }


    @SuppressWarnings("rawtypes")
    private okhttp3.Call customerV1ControllerCreateValidateBeforeCall(Customer customer, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = customerV1ControllerCreateCall(customer, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param customer  (optional)
     * @return Customer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Customer model instance </td><td>  -  </td></tr>
     </table>
     */
    public Customer customerV1ControllerCreate(Customer customer) throws ApiException {
        ApiResponse<Customer> localVarResp = customerV1ControllerCreateWithHttpInfo(customer);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param customer  (optional)
     * @return ApiResponse&lt;Customer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Customer model instance </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Customer> customerV1ControllerCreateWithHttpInfo(Customer customer) throws ApiException {
        okhttp3.Call localVarCall = customerV1ControllerCreateValidateBeforeCall(customer, null);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param customer  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Customer model instance </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call customerV1ControllerCreateAsync(Customer customer, final ApiCallback<Customer> _callback) throws ApiException {

        okhttp3.Call localVarCall = customerV1ControllerCreateValidateBeforeCall(customer, _callback);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for customerV1ControllerDeleteById
     * @param id  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Customer DELETE success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call customerV1ControllerDeleteByIdCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/v1/Customer/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }


    @SuppressWarnings("rawtypes")
    private okhttp3.Call customerV1ControllerDeleteByIdValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling customerV1ControllerDeleteById(Async)");
        }
        

        okhttp3.Call localVarCall = customerV1ControllerDeleteByIdCall(id, _callback);
        return localVarCall;

    }

    /**
     * delete record by id
     * 
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Customer DELETE success </td><td>  -  </td></tr>
     </table>
     */
    public void customerV1ControllerDeleteById(String id) throws ApiException {
        customerV1ControllerDeleteByIdWithHttpInfo(id);
    }

    /**
     * delete record by id
     * 
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Customer DELETE success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> customerV1ControllerDeleteByIdWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = customerV1ControllerDeleteByIdValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * delete record by id (asynchronously)
     * 
     * @param id  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Customer DELETE success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call customerV1ControllerDeleteByIdAsync(String id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = customerV1ControllerDeleteByIdValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for customerV1ControllerFindById
     * @param id  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Customer model instance </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call customerV1ControllerFindByIdCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/v1/Customer/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }


    @SuppressWarnings("rawtypes")
    private okhttp3.Call customerV1ControllerFindByIdValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling customerV1ControllerFindById(Async)");
        }
        

        okhttp3.Call localVarCall = customerV1ControllerFindByIdCall(id, _callback);
        return localVarCall;

    }

    /**
     * get record by id
     * 
     * @param id  (required)
     * @return Customer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Customer model instance </td><td>  -  </td></tr>
     </table>
     */
    public Customer customerV1ControllerFindById(String id) throws ApiException {
        ApiResponse<Customer> localVarResp = customerV1ControllerFindByIdWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * get record by id
     * 
     * @param id  (required)
     * @return ApiResponse&lt;Customer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Customer model instance </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Customer> customerV1ControllerFindByIdWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = customerV1ControllerFindByIdValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * get record by id (asynchronously)
     * 
     * @param id  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Customer model instance </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call customerV1ControllerFindByIdAsync(String id, final ApiCallback<Customer> _callback) throws ApiException {

        okhttp3.Call localVarCall = customerV1ControllerFindByIdValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Customer>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for customerV1ControllerFindPage
     * @param filter  (optional, default to null)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Object of page data, result.data is Customer model instances, result.total is model count. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call customerV1ControllerFindPageCall(Filter filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/v1/Customer";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filter != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPair(buildQuery(filter)));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    private Map<String, String> buildQuery(Filter filter) {
        Map<String, String> filterMap = new HashMap<>();
        Object where = filter.getWhere();
        Integer limit = filter.getLimit();
        Integer skip = filter.getSkip();
        List<String> order = filter.getOrder();
        if (where != null && where instanceof Map && !((Map) where).isEmpty()) {
            for (Map.Entry<String, Object> entry : ((Map<String, Object>) where).entrySet()) {
                filterMap.put("filter[where]" + entry.getKey(), entry.getValue().toString());
            }
        }

        if (limit != null && limit > 0) {
            filterMap.put("filter[limit]", limit.toString());
        }

        if (skip != null && skip >= 0) {
            filterMap.put("filter[skip]", skip.toString());
        }

        if (order != null && !order.isEmpty()) {
            for (int i = 0; i < order.size(); i++) {
                filterMap.put("filter[order][" + i + "]", order.get(i));
            }
        }

        return filterMap;
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call customerV1ControllerFindPageValidateBeforeCall(Filter filter, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = customerV1ControllerFindPageCall(filter, _callback);
        return localVarCall;

    }

    /**
     * get record list by page and limit
     * 
     * @param filter  (optional, default to null)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Object of page data, result.data is Customer model instances, result.total is model count. </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse200 customerV1ControllerFindPage(Filter filter) throws ApiException {
        ApiResponse<InlineResponse200> localVarResp = customerV1ControllerFindPageWithHttpInfo(filter);
        return localVarResp.getData();
    }

    /**
     * get record list by page and limit
     * 
     * @param filter  (optional, default to null)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Object of page data, result.data is Customer model instances, result.total is model count. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse200> customerV1ControllerFindPageWithHttpInfo(Filter filter) throws ApiException {
        okhttp3.Call localVarCall = customerV1ControllerFindPageValidateBeforeCall(filter, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * get record list by page and limit (asynchronously)
     * 
     * @param filter  (optional, default to null)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Object of page data, result.data is Customer model instances, result.total is model count. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call customerV1ControllerFindPageAsync(Filter filter, final ApiCallback<InlineResponse200> _callback) throws ApiException {

        okhttp3.Call localVarCall = customerV1ControllerFindPageValidateBeforeCall(filter, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for customerV1ControllerUpdateById
     * @param id  (required)
     * @param customer  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Customer PATCH success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call customerV1ControllerUpdateByIdCall(String id, Customer customer, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = customer;

        // create path and map variables
        String localVarPath = "/api/v1/Customer/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }


    @SuppressWarnings("rawtypes")
    private okhttp3.Call customerV1ControllerUpdateByIdValidateBeforeCall(String id, Customer customer, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling customerV1ControllerUpdateById(Async)");
        }
        

        okhttp3.Call localVarCall = customerV1ControllerUpdateByIdCall(id, customer, _callback);
        return localVarCall;

    }

    /**
     * update record by id
     * 
     * @param id  (required)
     * @param customer  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Customer PATCH success </td><td>  -  </td></tr>
     </table>
     */
    public void customerV1ControllerUpdateById(String id, Customer customer) throws ApiException {
        customerV1ControllerUpdateByIdWithHttpInfo(id, customer);
    }

    /**
     * update record by id
     * 
     * @param id  (required)
     * @param customer  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Customer PATCH success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> customerV1ControllerUpdateByIdWithHttpInfo(String id, Customer customer) throws ApiException {
        okhttp3.Call localVarCall = customerV1ControllerUpdateByIdValidateBeforeCall(id, customer, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * update record by id (asynchronously)
     * 
     * @param id  (required)
     * @param customer  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Customer PATCH success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call customerV1ControllerUpdateByIdAsync(String id, Customer customer, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = customerV1ControllerUpdateByIdValidateBeforeCall(id, customer, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
