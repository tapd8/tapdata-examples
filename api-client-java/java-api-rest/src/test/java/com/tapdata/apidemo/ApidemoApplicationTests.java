package com.tapdata.apidemo;

import com.tapdata.apidemo.common.*;
import com.tapdata.apidemo.utils.HttpUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.LinkedMultiValueMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ApidemoApplicationTests {

	private String token = null;
	private String id = null;

	public void getToken() {
		Map<String, Object> map = new HashMap<>(3);
		map.put("grant_type", "client_credentials");
		map.put("client_id", AppConstants.CLIENT_ID);
		map.put("client_secret", AppConstants.CLIENT_SECRET);
		Map<String, Object> result = HttpUtils.httpPost(AppConstants.TOKEN_URL, map, 5000);
		if (result != null && result.get("access_token") != null) {
			token = (String)result.get("access_token");
		}
	}

	public void createTest() {
		Map<String, Object> customer = new HashMap<>();
		customer.put("COUNTRY_CODE", "EE");
		customer.put("CUSTOMER_ID", "EE555");
		customer.put("FIRST_NAME", "TEST");
		Map<String, String> headers = new HashMap<>(1);
		headers.put("access_token", token);
		Map<String, Object> resultMap = HttpUtils.httpPost(AppConstants.FIN_CUSTOMER_URL, customer, headers, 5000);

		// TODO: test validations
		System.out.println("====== Create customer ======");
		System.out.println(resultMap.toString());
		id = resultMap.get("_id").toString();
		System.out.println("\n\n");
	}

	public void patchTest() {
		Map<String, Object> updateMap = new HashMap<>();
		updateMap.put("_id", id);
		updateMap.put("FIRST_NAME", "UPDATED_TEST");
		Map<String, String> headers = new HashMap<>(1);
		headers.put("access_token", token);
		String id = updateMap.get("_id").toString();
		String url = AppConstants.FIN_CUSTOMER_URL + "/" + id;
		updateMap.remove("_id");
		Map<String, Object> resultMap = HttpUtils.httpPatch(url, updateMap, headers, 5000);

		// TODO: test validations
		System.out.println("====== Update FIRST_NAME=" + updateMap + " by id succeed ======\n\n");
	}

	public void getTest() {
		Map<String, String> headers = new HashMap<>(1);
		headers.put("access_token", token);
		String url = AppConstants.FIN_CUSTOMER_URL + "/" + id;
		Map<String, Object> resultMap = HttpUtils.httpGet(url, null, headers, 5000);

		// TODO: test validations
		System.out.println("====== Find by id: " + this.id + " ======");
		System.out.println(resultMap.toString());
		System.out.println("\n\n");
	}

	public void deleteTest() {
		Map<String, String> headers = new HashMap<>(1);
		headers.put("access_token", token);
		String url = AppConstants.FIN_CUSTOMER_URL + "/" + id;
		HttpUtils.httpDelete(url, null, headers, 5000);

		// TODO: test validations
		System.out.println("====== Delete by id: " + this.id + " succeed ======\n\n");
	}

	public void findPageTest() {
		LinkedMultiValueMap<String, String> param = new LinkedMultiValueMap<>();
		param.add("filter[where][COUNTRY_CODE]", "AT");
		param.add("filter[fields][CUSTOMER_ID]", "true");
		param.add("filter[fields][FIRST_NAME]", "true");
		param.add("filter[fields][COUNTRY_CODE]", "true");
		param.add("filter[order]", "CUSTOMER_ID DESC");
		param.add("filter[skip]", "0");
		param.add("filter[limit]", "10");

		Map<String, String> headers = new HashMap<>(1);
		headers.put("access_token", token);

		Map<String, Object> resultMap = HttpUtils.httpGet(AppConstants.FIN_CUSTOMER_URL, param, headers, 5000);
		List<Map<String, Object>> resultList = (List)resultMap.get("data");
		Map<String, Object> totalMap = (Map<String, Object>)resultMap.get("total");

		System.out.println("====== Find by filter ======");
		System.out.println(param.toString());
		System.out.println("Total count: " + (Integer)totalMap.get("count"));
		for (Map<String, Object> datum : resultList) {
			System.out.println(datum.toString());
		}
		System.out.println("\n\n");
	}

	@Test
	public void allTest() {
		getToken();
		createTest();
		patchTest();
		getTest();
		deleteTest();
		findPageTest();
	}
}
