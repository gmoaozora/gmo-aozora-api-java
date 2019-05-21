# VirtualAccountApi

All URIs are relative to *https://api.gmo-aozora.com/ganb/api/personal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**depositTransactionsUsingGET**](VirtualAccountApi.md#depositTransactionsUsingGET) | **GET** /va/deposit-transactions | 振込入金口座入金明細照会
[**issueUsingPOST**](VirtualAccountApi.md#issueUsingPOST) | **POST** /va/issue | 振込入金口座発行
[**statusChangeUsingPOST**](VirtualAccountApi.md#statusChangeUsingPOST) | **POST** /va/status-change | 振込入金口座状態変更
[**vaCloseRequestUsingPOST**](VirtualAccountApi.md#vaCloseRequestUsingPOST) | **POST** /va/close-request | 振込入金口座解約申込
[**vaListUsingPOST**](VirtualAccountApi.md#vaListUsingPOST) | **POST** /va/list | 振込入金口座一覧照会


<a name="depositTransactionsUsingGET"></a>
# **depositTransactionsUsingGET**
> VaDepositTransactionsResponse depositTransactionsUsingGET(xAccessToken, vaContractAuthKey, raId, vaId, dateFrom, dateTo, sortOrderCode, nextItemKey)

振込入金口座入金明細照会

振込入金口座の入金明細を照会します ※個人事業主のみ対象となり、個人は対象外となります 対象期間From、対象期間Toを設定しない場合、当日分の入金明細を返却します ■ページング ・1回のリクエストで照会できる明細は、最大500件です ・2ページ目以降を照会する際は、初回と同じリクエスト内容に、初回レスポンスの次明細キーを追加してリクエストしてください  ■ソート順 ・デフォルト　取引日の昇順です。 　ソート順コードを指定することにより、ソート順を変更できます。

### Example
```java
// Import classes:
common.client
personal.personal


VirtualAccountApi apiInstance = new VirtualAccountApi();
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
String vaContractAuthKey = "vaContractAuthKey_example"; // String | 振込入金口座API認証情報 半角英数字 NULLを設定 値が設定されている場合は「400 Bad Request」を返却  minLength: 1 maxLength: 400 
String raId = "raId_example"; // String | 入金口座ID 半角数字 入金先の口座を識別するID 本値が設定されていない場合、振込入金口座IDは必須 科目コードが以下の口座IDのみ受け付けます ・01=普通預金（有利息） ・02=普通預金（決済用）  minLength: 12 maxLength: 29 
String vaId = "vaId_example"; // String | 振込入金口座ID 半角数字 振込入金口座を識別するID 本値が設定されていない場合、入金口座IDは必須  minLength: 10 maxLength: 10 
String dateFrom = "dateFrom_example"; // String | 対象期間From 半角文字 YYYY-MM-DD形式 指定する場合は照会する日付より6ヶ月以内の日付とし、超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10 
String dateTo = "dateTo_example"; // String | 対象期間To 半角文字 YYYY-MM-DD形式 指定する場合は照会する日付より6ヶ月以内の日付とし、超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10 
String sortOrderCode = "sortOrderCode_example"; // String | ソート順コード 半角数字 取引日のソート順を指定するコード値 ・1=昇順 ・2=降順  minLength: 1 maxLength: 1 
String nextItemKey = "nextItemKey_example"; // String | 次明細キー 半角数字 初回要求時は未設定 初回応答で次明細キーが「true」の場合、返却された同項目を2回目以降に設定  minLength: 1 maxLength: 24 
try {
    VaDepositTransactionsResponse result = apiInstance.depositTransactionsUsingGET(xAccessToken, vaContractAuthKey, raId, vaId, dateFrom, dateTo, sortOrderCode, nextItemKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualAccountApi#depositTransactionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |
 **vaContractAuthKey** | **String**| 振込入金口座API認証情報 半角英数字 NULLを設定 値が設定されている場合は「400 Bad Request」を返却  minLength: 1 maxLength: 400  | [optional]
 **raId** | **String**| 入金口座ID 半角数字 入金先の口座を識別するID 本値が設定されていない場合、振込入金口座IDは必須 科目コードが以下の口座IDのみ受け付けます ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用）  minLength: 12 maxLength: 29  | [optional]
 **vaId** | **String**| 振込入金口座ID 半角数字 振込入金口座を識別するID 本値が設定されていない場合、入金口座IDは必須  minLength: 10 maxLength: 10  | [optional]
 **dateFrom** | **String**| 対象期間From 半角文字 YYYY-MM-DD形式 指定する場合は照会する日付より6ヶ月以内の日付とし、超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10  | [optional]
 **dateTo** | **String**| 対象期間To 半角文字 YYYY-MM-DD形式 指定する場合は照会する日付より6ヶ月以内の日付とし、超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10  | [optional]
 **sortOrderCode** | **String**| ソート順コード 半角数字 取引日のソート順を指定するコード値 ・1&#x3D;昇順 ・2&#x3D;降順  minLength: 1 maxLength: 1  | [optional]
 **nextItemKey** | **String**| 次明細キー 半角数字 初回要求時は未設定 初回応答で次明細キーが「true」の場合、返却された同項目を2回目以降に設定  minLength: 1 maxLength: 24  | [optional]

### Return type

[**VaDepositTransactionsResponse**](VaDepositTransactionsResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="issueUsingPOST"></a>
# **issueUsingPOST**
> VaIssueResponse issueUsingPOST(xAccessToken, body)

振込入金口座発行

振込入金口座の発行を行います ※個人事業主のみ対象となり、個人は対象外となります 

### Example
```java
// Import classes:
//import client.ApiException;
personal.personal


VirtualAccountApi apiInstance = new VirtualAccountApi();
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
VaIssueRequest body = new VaIssueRequest(); // VaIssueRequest | HTTPリクエストボディ
try {
    VaIssueResponse result = apiInstance.issueUsingPOST(xAccessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualAccountApi#issueUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |
 **body** | [**VaIssueRequest**](VaIssueRequest.md)| HTTPリクエストボディ | [optional]

### Return type

[**VaIssueResponse**](VaIssueResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="statusChangeUsingPOST"></a>
# **statusChangeUsingPOST**
> VaStatusChangeResponse statusChangeUsingPOST(xAccessToken, body)

振込入金口座状態変更

振込入金口座の状態変更（停止・再開・削除）を行います ※個人事業主のみ対象となり、個人は対象外となります 

### Example
```java
// Import classes:
//import client.ApiException;
//import personal.VirtualAccountApi;


VirtualAccountApi apiInstance = new VirtualAccountApi();
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
VaStatusChangeRequest body = new VaStatusChangeRequest(); // VaStatusChangeRequest | HTTPリクエストボディ
try {
    VaStatusChangeResponse result = apiInstance.statusChangeUsingPOST(xAccessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualAccountApi#statusChangeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |
 **body** | [**VaStatusChangeRequest**](VaStatusChangeRequest.md)| HTTPリクエストボディ | [optional]

### Return type

[**VaStatusChangeResponse**](VaStatusChangeResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="vaCloseRequestUsingPOST"></a>
# **vaCloseRequestUsingPOST**
> VaCloseRequestResponse vaCloseRequestUsingPOST(xAccessToken, body)

振込入金口座解約申込

振込入金口座契約の解約申込を行います ※個人事業主のみ対象となり、個人は対象外となります 

### Example
```java
// Import classes:
//import client.ApiException;
//import personal.VirtualAccountApi;


VirtualAccountApi apiInstance = new VirtualAccountApi();
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
VaCloseRequest body = new VaCloseRequest(); // VaCloseRequest | HTTPリクエストボディ
try {
    VaCloseRequestResponse result = apiInstance.vaCloseRequestUsingPOST(xAccessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualAccountApi#vaCloseRequestUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |
 **body** | [**VaCloseRequest**](VaCloseRequest.md)| HTTPリクエストボディ | [optional]

### Return type

[**VaCloseRequestResponse**](VaCloseRequestResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="vaListUsingPOST"></a>
# **vaListUsingPOST**
> VaListResponse vaListUsingPOST(xAccessToken, body)

振込入金口座一覧照会

振込入金口座一覧を照会します ※個人事業主のみ対象となり、個人は対象外となります ソート順コードを指定しない場合、発行日時の昇順です ■ページング ・1回のリクエストで照会できる明細は、最大500件です ・2ページ目以降を照会する際は、初回と同じリクエスト内容に、初回レスポンスの次一覧キーを追加してリクエストしてください ■振込入金口座API認証情報 ・提携企業契約時は必須で、この値が設定されていない場合、銀行契約の一覧照会を提供する 

### Example
```java
// Import classes:
//import client.ApiException;
//import personal.VirtualAccountApi;


VirtualAccountApi apiInstance = new VirtualAccountApi();
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
VaListRequest body = new VaListRequest(); // VaListRequest | HTTPリクエストボディ
try {
    VaListResponse result = apiInstance.vaListUsingPOST(xAccessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualAccountApi#vaListUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |
 **body** | [**VaListRequest**](VaListRequest.md)| HTTPリクエストボディ | [optional]

### Return type

[**VaListResponse**](VaListResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

