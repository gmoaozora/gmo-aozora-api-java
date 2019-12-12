# TransferCommonApi

All URIs are relative to *https://stg-api.gmo-aozora.com/ganb/api/personal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transferCancelUsingPOST**](TransferCommonApi.md#transferCancelUsingPOST) | **POST** /transfer/cancel | 振込取消依頼
[**transferRequestResultUsingGET**](TransferCommonApi.md#transferRequestResultUsingGET) | **GET** /transfer/request-result | 振込依頼結果照会

# **transferCancelUsingPOST**
> TransferCancelResponse transferCancelUsingPOST(body, xAccessToken)

### 振込取消依頼

振込・振込予約・総合振込の取消を申請します

### 詳細説明

##### 取消対象ステータス
* 申請中以降のステータスで取消が可能です
* 依頼中、作成中の状態は取消対象外です

#### 取消対象キー区分
* 取消対象の取引の内容について指定して下さい
* 取消対象キー区分と、取消対象の振込申請番号の状態がマッチしない場合は、「400 Bad Request」を返却します
* 総合振込の対象は3または4のみとなります

##### API: 振込取消依頼の場合
* 振込・振替/一括振込の対象は1または2のみとなります
* 3、4は指定不可となります
* ビジネスID管理未利用の場合は、2を指定してください。その他は指定不可となります
* ビジネスID管理利用中かつ、申請者による申請中ステータスの「取下」を行いたい場合は、1を指定してください
* ビジネスID管理利用中かつ、承認可能者による予約中ステータスの「承認取消」を行いたい場合は、2を指定してください

##### API: 総合振込取消依頼の場合
* 総合振込の対象は3または4のみとなります
* 1、2は指定不可となります
* ビジネスID管理未利用の場合は、4を指定してください。その他は指定不可となります
* ビジネスID管理利用中かつ、申請者による申請中ステータスの「取下」を行いたい場合は、3を指定してください
* ビジネスID管理利用中かつ、承認可能者による予約中ステータスの「承認取消」を行いたい場合は、4を指定してください

#### 重複した依頼
* 同一の受付番号（振込申請番号）への重複した依頼はできません
* なお、前回の総合振込取消依頼が期限切れとなれば依頼は可能となります

### Example
```java
import personal.TransferCommonApi;
import personal.model.TransferCancelRequest;
import personal.model.TransferCancelResponse;
import common.ApiException;
import com.google.gson.Gson;

public class SamplePersonalTransferCancelUsingPost {
    public static void main(String[] args){
        TransferCommonApi apiInstance = new TransferCommonApi();
        String accountId = "accountId_example"; // String | 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29 
        Gson gson = new Gson();
        String jsonStrTransferCancelReq = "{" +
                                            "\"accountId\":" + accountId + "," +
                                            "\"cancelTargetKeyClass\":\"cancelTargetKeyClass_example\"," +
                                            "\"applyNo\":\"applyNo_example\"" +
                                          "}";
        TransferCancelRequest body = gson.fromJson(jsonStrTransferCancelReq, TransferCancelRequest.class); // TransferCancelRequest | HTTPリクエストボディ
        String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
        try {
            TransferCancelResponse result = apiInstance.transferCancelUsingPOST(body, xAccessToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransferCommonApi#transferCancelUsingPOST");
            e.printStackTrace();
        }
    }
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

# **transferRequestResultUsingGET**
> TransferRequestResultResponse transferRequestResultUsingGET(accountId, applyNo, xAccessToken)

### 振込依頼結果照会

振込更新系のAPIの処理状態を照会します
* 振込依頼、総合振込依頼、振込取消依頼での依頼のみが照会対象
* 振込取消依頼をした場合は、最後の依頼の結果コードが照会対象となります 

### Example
```java
import personal.TransferCommonApi;
import personal.model.TransferRequestResultResponse;
import common.ApiException;
import com.google.gson.Gson;

public class SamplePersonalTransferRequestResultUsingGet {
    public static void main(String[] args){
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
    }
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

