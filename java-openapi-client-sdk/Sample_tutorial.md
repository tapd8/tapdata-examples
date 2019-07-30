# java sdk使用说明

## 目录结构

- src/main: 主程序
	- io.tapdata.sdk 包名
		- api 根据发布的api，实现具体的CURD操作代码
		- auth 负责oauth鉴权代码
		- model 根据发布的api schema，映射的java pojo
		- ApiClient.java 负责执行http api调用的实现代码
		- ... 其余的工具类
- src/test: 单元测试

## 使用

进入io.tapdata.sdk.api.TransactionLogV1ApiTest单元测试类

1. 填入鉴权信息

```
private final ApiClient apiClient = new ApiClient(
    "your_client_id",
    "your_client_secret",
    "api_url", // http://127.0.0.1:3080
    "auth_url" // http://127.0.0.1:3030/oauth/token
);
```

- &lt;your_client_id&gt;: Data Publish->API Clients列表，Client ID列的值
- &lt;your_client_secret&gt;: Data Publish->API Clients列表, Client Secret列的值

2. 测试用例

    以下为[tapdata-example](https://github.com/tapd8/tapdata-examples) github仓库的示例代码
    
    请根据自己的实际环境，进行调整

- create

	在对象中set期望插入的值，执行即可
	
	```
    TransactionLog transactionLog = new TransactionLog();
    transactionLog.setCUSTOMERID(customerId);
    transactionLog.setAMOUNT(10000.23);
    transactionLog.setBUYTIME(OffsetDateTime.now());
    transactionLog.setSHOP(shop);
    TransactionLog response = api.transactionLogV1ControllerCreate(transactionLog);
	```

- find by id

	设置id的值，即为MongoDB _id的字符串部分，执行即可
	
	```
	String id = "5d3aad74b5c5eb5e905e7f38";
	TransactionLog response = api.transactionLogV1ControllerFindById(id);
	```
	
- find page

	查看README.md底部([查询条件说明](README.md)),根据需求设置对应的filter属性，简单的分页查询如下
	
	```
	Filter1 filter = new Filter1();
	filter.setLimit(10);
	filter.setSkip(0);
	
	InlineResponse2001 response = api.transactionLogV1ControllerFindPage(filter);
	```
- update

	设置id的值，即为MongoDB _id的字符串部分，在pojo中set希望修改的值，执行
	
	```
	String id = this.id;
	TransactionLog transactionLog = new TransactionLog();
	BigDecimal update = new BigDecimal(33.56);
	transactionLog.setAMOUNT(update);
	api.transactionLogV1ControllerUpdateById(id, transactionLog);
	```
- delete by id

	设置id的值，即为MongoDB _id的字符串部分，执行
	
	```
	String id = "5d3aad74b5c5eb5e905e7f38";
	api.transactionLogV1ControllerDeleteById(id);
	```