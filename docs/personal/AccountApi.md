# AccountApi

All URIs are relative to *https://api.gmo-aozora.com/ganb/api/personal.personal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountsDepositTransactionsUsingGET**](AccountApi.md#accountsDepositTransactionsUsingGET) | **GET** /accounts/deposit-transactions | 振込入金明細照会
[**accountsUsingGET**](AccountApi.md#accountsUsingGET) | **GET** /accounts | 口座一覧照会
[**balancesUsingGET**](AccountApi.md#balancesUsingGET) | **GET** /accounts/balances | 残高照会
[**transactionsUsingGET**](AccountApi.md#transactionsUsingGET) | **GET** /accounts/transactions | 入出金明細照会


<a name="accountsDepositTransactionsUsingGET"></a>
# **accountsDepositTransactionsUsingGET**
> DepositTransactionsResponse accountsDepositTransactionsUsingGET(accountId, xAccessToken, dateFrom, dateTo, nextItemKey)

振込入金明細照会

指定した円普通預金口座の入金明細情報を照会します ※個人事業主のみ対象となり、個人は対象外となります 対象期間From、対象期間Toを設定しない場合、当日分の入金明細を返却します ■ページング ・1回のリクエストで照会できる明細は、最大500件です ・2ページ目以降を照会する際は、初回と同じリクエスト内容に、初回レスポンスの次明細キーを追加してリクエストしてください ■ソート順 ・取引の昇順 

### Example
```java
// Import classes:
//import ApiException;
//import personal.AccountApi;


AccountApi apiInstance = new AccountApi();
String accountId = "accountId_example"; // String | 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29 
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
String dateFrom = "dateFrom_example"; // String | 対象期間From 半角文字 YYYY-MM-DD形式 指定しない場合はTODAY  minLength: 10 maxLength: 10 
String dateTo = "dateTo_example"; // String | 対象期間To 半角文字 YYYY-MM-DD形式 対象期間FROMと対象期間Toを指定する場合は対象期間FROM≦対象期間TOとし、それを超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10 
String nextItemKey = "nextItemKey_example"; // String | 次明細キー 半角数字 初回要求時は未設定 初回応答で次明細フラグが「true」の場合、返却された同項目を2回目以降に設定  minLength: 1 maxLength: 24 
try {
    DepositTransactionsResponse result = apiInstance.accountsDepositTransactionsUsingGET(accountId, xAccessToken, dateFrom, dateTo, nextItemKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountsDepositTransactionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29  |
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |
 **dateFrom** | **String**| 対象期間From 半角文字 YYYY-MM-DD形式 指定しない場合はTODAY  minLength: 10 maxLength: 10  | [optional]
 **dateTo** | **String**| 対象期間To 半角文字 YYYY-MM-DD形式 対象期間FROMと対象期間Toを指定する場合は対象期間FROM≦対象期間TOとし、それを超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10  | [optional]
 **nextItemKey** | **String**| 次明細キー 半角数字 初回要求時は未設定 初回応答で次明細フラグが「true」の場合、返却された同項目を2回目以降に設定  minLength: 1 maxLength: 24  | [optional]

### Return type

[**DepositTransactionsResponse**](DepositTransactionsResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="accountsUsingGET"></a>
# **accountsUsingGET**
> AccountsResponse accountsUsingGET(xAccessToken)

口座一覧照会

保有する全ての口座情報一覧を照会します

### Example
```java
// Import classes:
//import ApiException;
//import personal.AccountApi;


AccountApi apiInstance = new AccountApi();
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
try {
    AccountsResponse result = apiInstance.accountsUsingGET(xAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |

### Return type

[**AccountsResponse**](AccountsResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="balancesUsingGET"></a>
# **balancesUsingGET**
> BalancesResponse balancesUsingGET(xAccessToken, accountId)

残高照会

保有する口座の残高情報を照会します 口座IDを指定した場合、該当する口座の残高情報を照会します 口座IDを指定しない場合、保有する口座全ての残高情報を照会します 

### Example
```java
// Import classes:
common.clcommon.client/import personal.AccountApi;


AccountApi apiInstance = new AccountApi();
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
String accountId = "accountId_example"; // String | 口座ID 口座を識別するIDまたは、つかいわけ口座を識別するID  minLength: 12 maxLength: 29 
try {
    BalancesResponse result = apiInstance.balancesUsingGET(xAccessToken, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#balancesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |
 **accountId** | **String**| 口座ID 口座を識別するIDまたは、つかいわけ口座を識別するID  minLength: 12 maxLength: 29  | [optional]

### Return type

[**BalancesResponse**](BalancesResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="transactionsUsingGET"></a>
# **transactionsUsingGET**
> TransactionsResponse transactionsUsingGET(accountId, xAccessToken, dateFrom, dateTo, nextItemKey)

入出金明細照会

指定した円普通預金口座の入出金明細情報を照会します 対象期間From、対象期間Toを設定しない場合、当日分の入出金明細を返却します ■ページング ・1回のリクエストで照会できる明細は、最大500件です ・2ページ目以降を照会する際は、初回と同じリクエスト内容に、初回レスポンスの次明細キーを追加してリクエストしてください ■ソート順 ・取引の昇順

### Example
```java
// Import classes:
//import client.ApiExceptcommon.client/import personal.AccountApi;


AccountApi apiInstance = new AccountApi();
String accountId = "accountId_example"; // String | 口座ID 半角英数字 口座を識別するIDまたは、つかいわけ口座を識別するID  科目コードが以下の場合のみ受け付けます ・01=普通預金（有利息） ・02=普通預金（決済用）  minLength: 12 maxLength: 29 
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128            
String dateFrom = "dateFrom_example"; // String | 対象期間From 半角文字 YYYY-MM-DD形式  minLength: 10 maxLength: 10 
String dateTo = "dateTo_example"; // String | 対象期間To 半角文字 YYYY-MM-DD形式  minLength: 10 maxLength: 10 
String nextItemKey = "nextItemKey_example"; // String | 次明細キー 半角数字 初回要求時は未設定 初回応答で次明細キーが「true」の場合、返却された同項目を2回目以降に設定  minLength: 1 maxLength: 24 
try {
    TransactionsResponse result = apiInstance.transactionsUsingGET(accountId, xAccessToken, dateFrom, dateTo, nextItemKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#transactionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| 口座ID 半角英数字 口座を識別するIDまたは、つかいわけ口座を識別するID  科目コードが以下の場合のみ受け付けます ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用）  minLength: 12 maxLength: 29  |
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128             |
 **dateFrom** | **String**| 対象期間From 半角文字 YYYY-MM-DD形式  minLength: 10 maxLength: 10  | [optional]
 **dateTo** | **String**| 対象期間To 半角文字 YYYY-MM-DD形式  minLength: 10 maxLength: 10  | [optional]
 **nextItemKey** | **String**| 次明細キー 半角数字 初回要求時は未設定 初回応答で次明細キーが「true」の場合、返却された同項目を2回目以降に設定  minLength: 1 maxLength: 24  | [optional]

### Return type

[**TransactionsResponse**](TransactionsResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8
