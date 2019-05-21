# TransferCommonApi

All URIs are relative to *https://api.gmo-aozora.com/ganb/api/personal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transferCancelUsingPOST**](TransferCommonApi.md#transferCancelUsingPOST) | **POST** /transfer/cancel | 振込取消依頼
[**transferRequestResultUsingGET**](TransferCommonApi.md#transferRequestResultUsingGET) | **GET** /transfer/request-result | 振込依頼結果照会


<a name="transferCancelUsingPOST"></a>
# **transferCancelUsingPOST**
> TransferCancelResponse transferCancelUsingPOST(body, xAccessToken)

振込取消依頼

振込・振込予約・総合振込の取消を申請します  ■取消対象ステータス ・申請中以降のステータスで照会が可能です ・依頼中、作成中の状態は照会対象外です ■取消対象キー区分   ・取消対象の取引の内容について指定して下さい ・取消対象キー区分と、取消対象の振込申請番号の状態がマッチしない場合は、「400 Bad  Request」を返却します ・1または3の場合、申請者による申請中ステータスの「取下」が可能。ビジネスID管理未利用だと、指定不可 ・2または4の場合、ビジネスID管理利用中だと、承認者可能者による予約中ステータスの「承認取消」が可能 ・1または2の場合、振込・振替/一括振込が対象 ・3または4の場合、総合振込が対象 ■2重依頼について ・振込取消依頼は前回の振込取消依頼期限切れとなるまで依頼はできません（2重依頼は不可） ■照会対象となる明細   ・振込・振替・およびその予約と申請です ・定額自動振込契約から作成された振込みは照会対象となります ・定額自動振込契約そのものの申請状態や、状況は対象外となります 

### Example
```java
// Import classes:
//import client.ApiException;
//import personal.TransferCommonApi;


TransferCommonApi apiInstance = new TransferCommonApi();
TransferCancelRequest body = new TransferCancelRequest(); // TransferCancelRequest | HTTPリクエストボディ
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
try {
    TransferCancelResponse result = apiInstance.transferCancelUsingPOST(body, xAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferCommonApi#transferCancelUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransferCancelRequest**](TransferCancelRequest.md)| HTTPリクエストボディ |
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |

### Return type

[**TransferCancelResponse**](TransferCancelResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

<a name="transferRequestResultUsingGET"></a>
# **transferRequestResultUsingGET**
> TransferRequestResultResponse transferRequestResultUsingGET(accountId, applyNo, xAccessToken)

振込依頼結果照会

振込更新系のAPIの処理状態を照会します 振込依頼、総合振込依頼、振込取消依頼での依頼のみが照会対象 振込取消依頼をした場合は、最後の依頼の結果コードが照会対象となります 

### Example
```java
// Import classes:
//import client.ApiException;
//import personal.TransferCommonApi;


TransferCommonApi apiInstance = new TransferCommonApi();
String accountId = "accountId_example"; // String | 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29 
String applyNo = "applyNo_example"; // String | 受付番号（振込申請番号） 半角数字 すべての振込・総合振込で採番される、照会の基本単位となる番号  minLength: 16 maxLength: 16 
String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
try {
    TransferRequestResultResponse result = apiInstance.transferRequestResultUsingGET(accountId, applyNo, xAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferCommonApi#transferRequestResultUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29  |
 **applyNo** | **String**| 受付番号（振込申請番号） 半角数字 すべての振込・総合振込で採番される、照会の基本単位となる番号  minLength: 16 maxLength: 16  |
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |

### Return type

[**TransferRequestResultResponse**](TransferRequestResultResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

