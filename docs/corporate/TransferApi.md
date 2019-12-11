# TransferApi

All URIs are relative to *https://stg-api.gmo-aozora.com/ganb/api/corporation/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transferFeeUsingPOST**](TransferApi.md#transferFeeUsingPOST) | **POST** /transfer/transferfee | 振込手数料事前照会
[**transferRequestUsingPOST**](TransferApi.md#transferRequestUsingPOST) | **POST** /transfer/request | 振込依頼
[**transferStatusUsingGET**](TransferApi.md#transferStatusUsingGET) | **GET** /transfer/status | 振込状況照会

# **transferFeeUsingPOST**
> TransferFeeResponse transferFeeUsingPOST(body, xAccessToken)

### 振込手数料事前照会

振込・振込予約を行うための依頼内容の事前チェックと手数料を照会します

### 詳細説明

* 最大99件まで登録可能
* 1件の場合通常の振込扱いとなり、2件以上で一括振込扱いとなります
* 合計振込手数料および個別振込手数料は、振込実行時までに手数料の改定や消費税の変更等が行われた場合は、当APIで返却した手数料とは異なる手数料が適用されることがあります
* 振込無料回数とポイントについては、算出から振込実行までの間に変動する可能性があるため、手数料算出時の計算対象から除外して返却されます 

### Example
```java
import corporate.TransferApi;
import corporate.model.TransferRequest;
import corporate.model.TransferFeeResponse;
import common.ApiException;
import com.google.gson.Gson;

public class SampleCorpTransferFeeUsingPost {
    public static void main(String[] args){
        TransferApi apiInstance = new TransferApi();
        String accountId = "accountId_example"; // String | 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29 
        Gson gson = new Gson();
        String jsonStrTranser = "{" +
                                    "\"transferAmount\":\"transferAmount_example\"," +
                                    "\"beneficiaryBankCode\":\"beneficiaryBankCode_example\"," +
                                    "\"beneficiaryBranchCode\":\"beneficiaryBranchCode_example\"," +
                                    "\"accountTypeCode\":\"accountTypeCode_example\"," +
                                    "\"accountNumber\":\"accountNumber_example\"," +
                                    "\"beneficiaryName\":\"beneficiaryName_example\"" +
                                "}";
        String jsonStrTransferReq = "{" +
                                        "\"accountId\":" + accountId + "," +
                                        "\"transferDesignatedDate\":\"transferDesignatedDate_example\"," +
                                        "\"transfers\":[" + jsonStrTranser + "]" +
                                    "}";
        TransferRequest body = gson.fromJson(jsonStrTransferReq, TransferRequest.class); // TransferRequest | HTTPリクエストボディ
        String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
        try {
            TransferFeeResponse result = apiInstance.transferFeeUsingPOST(body, xAccessToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransferApi#transferFeeUsingPOST");
            e.printStackTrace();
        }
    }
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

# **transferRequestUsingPOST**
> TransferRequestResponse transferRequestUsingPOST(body, xAccessToken)

### 振込依頼

振込・振込予約を行うための依頼をします

### 詳細説明

* 最大99件まで登録可能
* 1件の場合通常の振込扱いとなり、2件以上で一括振込扱いとなります

### Example
```java
import corporate.TransferApi;
import corporate.model.TransferRequest;
import corporate.model.TransferRequestResponse;
import common.ApiException;
import com.google.gson.Gson;

public class SampleCorpTransferRequestUsingPost {
    public static void main(String[] args){
        TransferApi apiInstance = new TransferApi();
        String accountId = "accountId_example"; // String | 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29 
        Gson gson = new Gson();
        String jsonStrTranser = "{" +
                                    "\"transferAmount\":\"transferAmount_example\"," +
                                    "\"beneficiaryBankCode\":\"beneficiaryBankCode_example\"," +
                                    "\"beneficiaryBranchCode\":\"beneficiaryBranchCode_example\"," +
                                    "\"accountTypeCode\":\"accountTypeCode_example\"," +
                                    "\"accountNumber\":\"accountNumber_example\"," +
                                    "\"beneficiaryName\":\"beneficiaryName_example\"" +
                                "}";
        String jsonStrTransferReq = "{" +
                                        "\"accountId\":" + accountId + "," +
                                        "\"transferDesignatedDate\":\"transferDesignatedDate_example\"," +
                                        "\"transfers\":[" + jsonStrTranser + "]" +
                                    "}";
        TransferRequest body = gson.fromJson(jsonStrTransferReq, TransferRequest.class); // TransferRequest | HTTPリクエストボディ
        String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
        try {
            TransferRequestResponse result = apiInstance.transferRequestUsingPOST(body, xAccessToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransferApi#transferRequestUsingPOST");
            e.printStackTrace();
        }
    }
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

# **transferStatusUsingGET**
> TransferStatusResponse transferStatusUsingGET(accountId, queryKeyClass, xAccessToken, applyNo, dateFrom, dateTo, nextItemKey, requestTransferStatuses, requestTransferClass, requestTransferTerm)

### 振込状況照会

仕向の振込状況および履歴を照会します

### 詳細説明

#### 取得上限件数
* 500件
* 取得できる明細数が500に満たないときは取得できる明細のみを返却します
* 取得できる明細が存在しない場合は「200：OK」とし明細を返却しません

#### ページング
* 2ページ目以降を照会する際は、初回と同じリクエスト内容に、初回レスポンスの次明細キーを追加してリクエストしてください

#### ソート順

* 振込照会対象期間区分の指定により下記となります
  * 1：振込申請受付日　第1ソート：振込申請日昇順　第２ソート：振込申請番号昇順
  * 2：振込指定日　　　第1ソート：振込指定日昇順　第２ソート：振込申請番号昇順

※振込照会対象期間区分の指定がない場合は、1：振込申請受付日と同じとします

#### 対象期間

日本語名     | &#9312; | &#9313; | &#9314; | &#9315;
:----|:----:|:----:|:----:|:----:
対象期間From | × | ○ | × | ○
対象期間To   | × | × | ○ | ○
* &#9312;の場合: 当日分の明細を返却
* &#9313;の場合: 対象期間From ～ 当日までの明細を返却
* &#9314;の場合: 取引初回 ～ 対象期間Toまでの明細を返却
* &#9315;の場合: 対象期間From ～ 対象期間Toまでの明細を返却

#### 照会対象ステータス
* 申請中以降のステータスで照会が可能となります
* 依頼中、作成中の状態は照会対象外です

#### 照会対象となる明細
* 振込・振替・およびその予約の履歴と状況が照会対象となります（APIからの依頼結果のみではありません）
* 定額自動振込契約によって自動登録された振込は照会対象となります
* 定額自動振込契約の申請状態と状況は対象外となります

### Example
```java
import corporate.TransferApi;
import corporate.model.RequestTransferStatus;
import corporate.model.TransferStatusResponse;
import common.ApiException;

public class SampleCorpTransferStatusUsingGet {
    public static void main(String[] args){
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
    }
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
 **requestTransferClass** | **String**| 振込照会対象取得区分 半角数字 1：ALL、2：振込申請のみ、3：振込受付情報のみ 照会対象キー区分が2かつ、法人かつ、ビジネスID管理申し込みの場合のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います minLength: 1 maxLength: 1  | [optional]
 **requestTransferTerm** | **String**| 振込照会対象期間区分 半角数字 対象期間Fromと対象期間Toで指定する日付の区分 1：振込申請受付日　2：振込指定日 照会対象キー区分が2のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1  | [optional]

### Return type

[**TransferStatusResponse**](TransferStatusResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8
