# TransferApi

All URIs are relative to *https://api.gmo-aozora.com/ganb/api/personal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spAccountTransferUsingPOST**](TransferApi.md#spAccountTransferUsingPOST) | **POST** /transfer/spaccounts-transfer | つかいわけ口座間振替
[**transferFeeUsingPOST**](TransferApi.md#transferFeeUsingPOST) | **POST** /transfer/transferfee | 振込手数料事前照会
[**transferRequestUsingPOST**](TransferApi.md#transferRequestUsingPOST) | **POST** /transfer/request | 振込依頼
[**transferStatusUsingGET**](TransferApi.md#transferStatusUsingGET) | **GET** /transfer/status | 振込状況照会


<a name="spAccountTransferUsingPOST"></a>
# **spAccountTransferUsingPOST**
> SpAccountTransferResponse spAccountTransferUsingPOST(body, xAccessToken)

つかいわけ口座間振替

円普通預金、証券コネクト口座、つかいわけ口座間の振替を実行します 振替の実行は即時となります つかいわけ口座間の明細移動は当APIの対象外です 

### Example
```java
// Import classes:
//import client.ApiException;
//import personal.TransferApi;


TransferApi apiInstance = new TransferApi();
SpAccountTransferRequest body = new SpAccountTransferRequest(); // SpAccountTransferRequest | HTTPリクエストボディ
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
try {
    SpAccountTransferResponse result = apiInstance.spAccountTransferUsingPOST(body, xAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferApi#spAccountTransferUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SpAccountTransferRequest**](SpAccountTransferRequest.md)| HTTPリクエストボディ |
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |

### Return type

[**SpAccountTransferResponse**](SpAccountTransferResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="transferFeeUsingPOST"></a>
# **transferFeeUsingPOST**
> TransferFeeResponse transferFeeUsingPOST(body, xAccessToken)

振込手数料事前照会

振込・振込予約をAPIから行うための申請内容の事前チェックと手数料を照会します 画面と同じく最大99件まで登録可能 1件だと通常の振込扱いで2件以上だと一括振込扱いとなります 振込無料回数とポイントについては、算出から振込実行までに変動する可能性があるため、手数料算出時の計算対象から除外してます

### Example
```java
// Import classes:
//import client.ApiException;
//import personal.TransferApi;


TransferApi apiInstance = new TransferApi();
TransferRequest body = new TransferRequest(); // TransferRequest | HTTPリクエストボディ
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
try {
    TransferFeeResponse result = apiInstance.transferFeeUsingPOST(body, xAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferApi#transferFeeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransferRequest**](TransferRequest.md)| HTTPリクエストボディ |
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |

### Return type

[**TransferFeeResponse**](TransferFeeResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="transferRequestUsingPOST"></a>
# **transferRequestUsingPOST**
> TransferRequestResponse transferRequestUsingPOST(body, xAccessToken)

振込依頼

振込・振込予約を申請します 画面と同じく最大99件まで登録可能 1件だと通常の振込扱いで2件以上だと一括振込扱いとなります

### Example
```java
// Import classes:
//import client.ApiException;
//import personal.TransferApi;


TransferApi apiInstance = new TransferApi();
TransferRequest body = new TransferRequest(); // TransferRequest | HTTPリクエストボディ
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
try {
    TransferRequestResponse result = apiInstance.transferRequestUsingPOST(body, xAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferApi#transferRequestUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransferRequest**](TransferRequest.md)| HTTPリクエストボディ |
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |

### Return type

[**TransferRequestResponse**](TransferRequestResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="transferStatusUsingGET"></a>
# **transferStatusUsingGET**
> TransferStatusResponse transferStatusUsingGET(accountId, queryKeyClass, xAccessToken, applyNo, dateFrom, dateTo, nextItemKey, requestTransferStatuses, requestTransferClass, requestTransferTerm)

振込状況照会

仕向の振込履歴情報を照会します 対象期間From、対象期間Toを設定しない場合、当日分の振込明細を返却します ■ソート順 振込照会対象期間区分の指定により下記となります 　1：振込申請受付日　　第1ソート：振込申請日昇順　　第２ソート：振込申請番号昇順 　2：振込指定日　　　　第1ソート：振込指定日昇順　　第２ソート：振込申請番号昇順 ■ページング ・1回のリクエストで照会できる明細は、最大500件です ・2ページ目以降を照会する際は、初回と同じリクエスト内容に、初回レスポンスの次明細キーを追加してリクエストしてください ■照会対象ステータス   ・申請中以降のステータスで照会が可能となります ・依頼中、作成中の状態は照会対象外です ■照会対象となる明細   ・振込・振替・およびその予約の履歴と状況が照会対象となります（APIからの依頼結果のみではありません） ・定額自動振込契約によって自動登録された振込は照会対象となります ・定額自動振込契約の申請状態と状況は対象外となります 

### Example
```java
// Import classes:
//import client.ApiException;
personal.personal


TransferApi apiInstance = new TransferApi();
String accountId = "accountId_example"; // String | 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29 
String queryKeyClass = "queryKeyClass_example"; // String | 照会対象キー区分 半角数字 照会対象のキー 1：振込申請照会対象指定、2：振込一括照会対象指定  minLength: 1 maxLength: 1 
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
String applyNo = "applyNo_example"; // String | 受付番号（振込申請番号） 半角数字 照会対象の番号を設定 照会対象キー区分が、1のときは必須 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）  minLength: 16 maxLength: 16 
String dateFrom = "dateFrom_example"; // String | 対象期間From 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 対象期間FROMと対象期間Toをどちらも指定する場合は、対象期間FROM≦対象期間TOとする それを超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10 
String dateTo = "dateTo_example"; // String | 対象期間To 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 対象期間FROMと対象期間Toを指定する場合は、対象期間FROM≦対象期間TOとする　それを超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10 
String nextItemKey = "nextItemKey_example"; // String | 次明細キー 半角数字 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）              minLength: 1 maxLength: 24 
RequestTransferStatus requestTransferStatuses = new RequestTransferStatus(); // RequestTransferStatus | 振込一括照会対象ステータス 照会対象キー区分が、2のときは設定可 それ以外は設定しません（値が設定されている場合は、「400 Bad Request」を返却） 
String requestTransferClass = "requestTransferClass_example"; // String | 振込照会対象取得区分 半角数字 1：ALL、2：振込申請のみ、3：振込受付情報のみ 照会対象キー区分が2かつ、法人かつ、ビジネスID管理申し込みの場合のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1 
String requestTransferTerm = "requestTransferTerm_example"; // String | 振込照会対象期間区分 半角数字 対象期間Fromと対象期間Toで指定する日付の区分 1：振込申請受付日　2：振込指定日 照会対象キー区分が2のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1 
try {
    TransferStatusResponse result = apiInstance.transferStatusUsingGET(accountId, queryKeyClass, xAccessToken, applyNo, dateFrom, dateTo, nextItemKey, requestTransferStatuses, requestTransferClass, requestTransferTerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferApi#transferStatusUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29  |
 **queryKeyClass** | **String**| 照会対象キー区分 半角数字 照会対象のキー 1：振込申請照会対象指定、2：振込一括照会対象指定  minLength: 1 maxLength: 1  |
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |
 **applyNo** | **String**| 受付番号（振込申請番号） 半角数字 照会対象の番号を設定 照会対象キー区分が、1のときは必須 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）  minLength: 16 maxLength: 16  | [optional]
 **dateFrom** | **String**| 対象期間From 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 対象期間FROMと対象期間Toをどちらも指定する場合は、対象期間FROM≦対象期間TOとする それを超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10  | [optional]
 **dateTo** | **String**| 対象期間To 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 対象期間FROMと対象期間Toを指定する場合は、対象期間FROM≦対象期間TOとする　それを超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10  | [optional]
 **nextItemKey** | **String**| 次明細キー 半角数字 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）              minLength: 1 maxLength: 24  | [optional]
 **requestTransferStatuses** | [**RequestTransferStatus**](RequestTransferStatus.md)| 振込一括照会対象ステータス 照会対象キー区分が、2のときは設定可 それ以外は設定しません（値が設定されている場合は、「400 Bad Request」を返却）  | [optional]
 **requestTransferClass** | **String**| 振込照会対象取得区分 半角数字 1：ALL、2：振込申請のみ、3：振込受付情報のみ 照会対象キー区分が2かつ、法人かつ、ビジネスID管理申し込みの場合のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1  | [optional]
 **requestTransferTerm** | **String**| 振込照会対象期間区分 半角数字 対象期間Fromと対象期間Toで指定する日付の区分 1：振込申請受付日　2：振込指定日 照会対象キー区分が2のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1  | [optional]

### Return type

[**TransferStatusResponse**](TransferStatusResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

