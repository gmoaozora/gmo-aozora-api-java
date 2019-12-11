# BulkTransferApi

All URIs are relative to *https://stg-api.gmo-aozora.com/ganb/api/corporation/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkTransferFeeUsingPOST**](BulkTransferApi.md#bulkTransferFeeUsingPOST) | **POST** /bulktransfer/transferfee | 総合振込手数料事前照会
[**bulkTransferRequestUsingPOST**](BulkTransferApi.md#bulkTransferRequestUsingPOST) | **POST** /bulktransfer/request | 総合振込依頼
[**bulkTransferStatusUsingGET**](BulkTransferApi.md#bulkTransferStatusUsingGET) | **GET** /bulktransfer/status | 総合振込状況照会

# **bulkTransferFeeUsingPOST**
> TransferFeeResponse bulkTransferFeeUsingPOST(body, xAccessToken)

### 総合振込手数料事前照会

総合振込・総合振込予約を行うための依頼内容の事前チェックと手数料を照会します

### 詳細説明
* 合計振込手数料および個別振込手数料は、振込実行時までに手数料の改定や消費税の変更等が行われた場合は、当APIで返却した手数料とは異なる手数料が適用されることがあります
* ポイントについては、算出から振込実行までの間に変動する可能性があるため、手数料算出時の計算対象から除外して返却されます

### Example
```java
import corporate.BulkTransferApi;
import corporate.model.BulkTransferRequest;
import corporate.model.TransferFeeResponse;
import common.ApiException;
import com.google.gson.Gson;

public class SampleCorpBulkTransferFeeUsingPost {
    public static void main(String[] args){
        BulkTransferApi apiInstance = new BulkTransferApi();
        String accountId = "accountId_example"; // String | 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29 
        Gson gson = new Gson();
        String jsonStrBulkTranser1 = "{" +
                                        "\"itemId\":\"1\"," +
                                        "\"transferAmount\":\"transferAmount_example\"," +
                                        "\"beneficiaryBankCode\":\"beneficiaryBankCode_example\"," +
                                        "\"beneficiaryBranchCode\":\"beneficiaryBranchCode_example\"," +
                                        "\"accountTypeCode\":\"accountTypeCode_example\"," +
                                        "\"accountNumber\":\"accountNumber_example\"," +
                                        "\"beneficiaryName\":\"beneficiaryName_example\"" +
                                     "}";
        String jsonStrBulkTranser2 = "{" +
                                        "\"itemId\":\"2\"," +
                                        "\"transferAmount\":\"transferAmount_example\"," +
                                        "\"beneficiaryBankCode\":\"beneficiaryBankCode_example\"," +
                                        "\"beneficiaryBranchCode\":\"beneficiaryBranchCode_example\"," +
                                        "\"accountTypeCode\":\"accountTypeCode_example\"," +
                                        "\"accountNumber\":\"accountNumber_example\"," +
                                        "\"beneficiaryName\":\"beneficiaryName_example\"" +
                                     "}";
        String jsonStrBulkTransferReq = "{" +
                                            "\"accountId\":" + accountId + "," +
                                            "\"transferDesignatedDate\":\"transferDesignatedDate_example\"," +
                                            "\"totalCount\":\"2\"," +
                                            "\"totalAmount\":\"totalAmount_example\"," +
                                            "\"bulkTransfers\":[" + jsonStrBulkTranser1 + "," + jsonStrBulkTranser2 + "]" +
                                        "}";
        BulkTransferRequest body = gson.fromJson(jsonStrBulkTransferReq, BulkTransferRequest.class); // BulkTransferRequest | HTTPリクエストボディ
        String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
        try {
            TransferFeeResponse result = apiInstance.bulkTransferFeeUsingPOST(body, xAccessToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkTransferApi#bulkTransferFeeUsingPOST");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulkTransferRequest**](BulkTransferRequest.md)| HTTPリクエストボディ |
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |

### Return type

[**TransferFeeResponse**](TransferFeeResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

# **bulkTransferRequestUsingPOST**
> BulkTransferRequestResponse bulkTransferRequestUsingPOST(body, xAccessToken)

### 総合振込依頼

総合振込を申請します

### Example
```java
import corporate.BulkTransferApi;
import corporate.model.BulkTransferRequest;
import corporate.model.BulkTransferRequestResponse;
import common.ApiException;
import com.google.gson.Gson;

public class SampleCorpBulkTransferRequestUsingPost {
    public static void main(String[] args){
        BulkTransferApi apiInstance = new BulkTransferApi();
        String accountId = "accountId_example"; // String | 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29 
        Gson gson = new Gson();
        String jsonStrBulkTranser1 = "{" +
                                        "\"itemId\":\"1\"," +
                                        "\"transferAmount\":\"transferAmount_example\"," +
                                        "\"beneficiaryBankCode\":\"beneficiaryBankCode_example\"," +
                                        "\"beneficiaryBranchCode\":\"beneficiaryBranchCode_example\"," +
                                        "\"accountTypeCode\":\"accountTypeCode_example\"," +
                                        "\"accountNumber\":\"accountNumber_example\"," +
                                        "\"beneficiaryName\":\"beneficiaryName_example\"" +
                                     "}";
        String jsonStrBulkTranser2 = "{" +
                                        "\"itemId\":\"2\"," +
                                        "\"transferAmount\":\"transferAmount_example\"," +
                                        "\"beneficiaryBankCode\":\"beneficiaryBankCode_example\"," +
                                        "\"beneficiaryBranchCode\":\"beneficiaryBranchCode_example\"," +
                                        "\"accountTypeCode\":\"accountTypeCode_example\"," +
                                        "\"accountNumber\":\"accountNumber_example\"," +
                                        "\"beneficiaryName\":\"beneficiaryName_example\"" +
                                     "}";
        String jsonStrBulkTransferReq = "{" +
                                            "\"accountId\":" + accountId + "," +
                                            "\"transferDesignatedDate\":\"transferDesignatedDate_example\"," +
                                            "\"totalCount\":\"2\"," +
                                            "\"totalAmount\":\"totalAmount_example\"," +
                                            "\"bulkTransfers\":[" + jsonStrBulkTranser1 + "," + jsonStrBulkTranser2 + "]" +
                                        "}";
        BulkTransferRequest body = gson.fromJson(jsonStrBulkTransferReq, BulkTransferRequest.class); // BulkTransferRequest | HTTPリクエストボディ
        String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
        try {
            BulkTransferRequestResponse result = apiInstance.bulkTransferRequestUsingPOST(body, xAccessToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkTransferApi#bulkTransferRequestUsingPOST");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulkTransferRequest**](BulkTransferRequest.md)| HTTPリクエストボディ |
 **xAccessToken** | **String**| アクセストークン  minLength: 1 maxLength: 128  |

### Return type

[**BulkTransferRequestResponse**](BulkTransferRequestResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

# **bulkTransferStatusUsingGET**
> BulkTransferStatusResponse bulkTransferStatusUsingGET(accountId, queryKeyClass, xAccessToken, detailInfoNecessity, bulktransferItemKey, applyNo, dateFrom, dateTo, nextItemKey, requestTransferStatuses, requestTransferClass, requestTransferTerm)

### 総合振込状況照会

仕向の総合振込状況および履歴を照会します

### 詳細説明

#### 取得上限件数
* 総合振込照会明細情報: 500件（明細情報取得フラグが「False:取得しない」の場合）
* 総合振込明細情報: 500件（明細情報取得フラグが「True：取得する」の場合）
* 1回のリクエストで照会できる明細は、総合振込照会明細情報または総合振込明細情報のいずれか最大500件です
* 取得できる明細が存在しない場合は「200：OK」とし明細を返却しません
* 取得できる明細数が500に満たないときは取得できる明細のみを返却します

#### ページング
* 2ページ目以降を照会する際は、初回と同じリクエスト内容に、初回レスポンスの次明細キーまたは総合振込明細情報取得対象キーを追加してリクエストしてください

#### ソート順
##### 明細情報取得フラグが「False：取得しない」のとき

振込照会対象期間区分の指定により下記となります

  * 1：振込申請受付日　第1ソート：振込申請日昇順　第２ソート：振込申請番号昇順
  * 2：振込指定日　　　第1ソート：振込指定日昇順　第２ソート：振込申請番号昇順

※振込照会対象期間区分の指定がない場合は、1：振込申請受付日と同じとします

##### 明細情報取得フラグが、「True：取得する」のとき
* 明細番号の昇順

#### 対象期間

日本語名     | &#9312; | &#9313; | &#9314; | &#9315;
:----|:----:|:----:|:----:|:----:
対象期間From | × | ○ | × | ○
対象期間To   | × | × | ○ | ○
* &#9312;の場合: 当日分の明細を返却
* &#9313;の場合: 対象期間From ～ 当日までの明細を返却
* &#9314;の場合: 取引初回 ～ 対象期間Toまでの明細を返却
* &#9315;の場合: 対象期間From ～ 対象期間Toまでの明細を返却

※現在契約中の総合振込サービスのみ照会可能となります

#### 照会対象ステータス
* 申請中以降のステータスで照会が可能となります
* 依頼中、作成中の状態は照会対象外です

#### 照会対象となる明細
* 総合振込・およびその予約の履歴と状況が照会対象となります（APIからの依頼結果のみではありません）

### Example
```java
import corporate.BulkTransferApi;
import corporate.model.RequestTransferStatus;
import corporate.model.BulkTransferStatusResponse;
import common.ApiException;

public class SampleCorpBulkTransferStatusUsingGet {
    public static void main(String[] args){
        BulkTransferApi apiInstance = new BulkTransferApi();
        String accountId = "accountId_example"; // String | 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29 
        String queryKeyClass = "queryKeyClass_example"; // String | 照会対象キー区分 半角数字 照会対象のキー 1：振込申請照会対象指定、2：振込一括照会対象指定  minLength: 1 maxLength: 1 
        String xAccessToken = "xAccessToken_example"; // String | アクセストークン  minLength: 1 maxLength: 128 
        Boolean detailInfoNecessity = true; // Boolean | 明細情報取得フラグ 総合振込明細情報の取得要否 照会対象キー区分が、1のときは「True：取得する」を指定可 True：取得する、False:取得しない　省略/NULLは　false扱い 
        String bulktransferItemKey = "bulktransferItemKey_example"; // String | 総合振込明細情報取得対象キー 半角数字 明細情報取得フラグが、「True：取得する」のとき指定可 総合振込明細情報を取得するときに取得を開始する番号 明細情報取得フラグが、「True：取得する」のときの省略/NULLは1扱い 1500明細を取得する場合、は以下のように設定 1電文目：1 2電文目：501 3電文目：1001  minLength: 1 maxLength: 6 
        String applyNo = "applyNo_example"; // String | 受付番号（振込申請番号） 半角数字 照会対象の番号を設定 照会対象キー区分が、1のときは必須 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）  minLength: 16 maxLength: 16 
        String dateFrom = "dateFrom_example"; // String | 対象期間From 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）              minLength: 10 maxLength: 10 
        String dateTo = "dateTo_example"; // String | 対象期間To 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 対象期間FROMと対象期間Toを指定する場合は、対象期間FROM≦対象期間TOとします。それを超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10 
        String nextItemKey = "nextItemKey_example"; // String | 次明細キー 半角数字 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）              minLength: 1 maxLength: 24 
        RequestTransferStatus requestTransferStatuses = new RequestTransferStatus(); // RequestTransferStatus | 振込一括照会対象ステータス 照会対象キー区分が、2のときは設定可 それ以外は設定しません（値が設定されている場合は、「400 Bad Request」を返却） 
        String requestTransferClass = "requestTransferClass_example"; // String | 振込照会対象取得区分 半角数字 1：ALL、2：振込申請のみ、3：振込受付情報のみ 照会対象キー区分が2かつ、法人かつ、ビジネスID管理利用中の場合のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1 
        String requestTransferTerm = "requestTransferTerm_example"; // String | 振込照会対象期間区分 半角数字 対象期間Fromと対象期間Toで指定する日付の区分 1：振込申請受付日　2：振込指定日 照会対象キー区分が2のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1 
        try {
            BulkTransferStatusResponse result = apiInstance.bulkTransferStatusUsingGET(accountId, queryKeyClass, xAccessToken, detailInfoNecessity, bulktransferItemKey, applyNo, dateFrom, dateTo, nextItemKey, requestTransferStatuses, requestTransferClass, requestTransferTerm);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkTransferApi#bulkTransferStatusUsingGET");
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
 **detailInfoNecessity** | **Boolean**| 明細情報取得フラグ 総合振込明細情報の取得要否 照会対象キー区分が、1のときは「True：取得する」を指定可 True：取得する、False:取得しない　省略/NULLは　false扱い  | [optional]
 **bulktransferItemKey** | **String**| 総合振込明細情報取得対象キー 半角数字 明細情報取得フラグが、「True：取得する」のとき指定可 総合振込明細情報を取得するときに取得を開始する番号 明細情報取得フラグが、「True：取得する」のときの省略/NULLは1扱い 1500明細を取得する場合、は以下のように設定 1電文目：1 2電文目：501 3電文目：1001  minLength: 1 maxLength: 6  | [optional]
 **applyNo** | **String**| 受付番号（振込申請番号） 半角数字 照会対象の番号を設定 照会対象キー区分が、1のときは必須 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）  minLength: 16 maxLength: 16  | [optional]
 **dateFrom** | **String**| 対象期間From 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）              minLength: 10 maxLength: 10  | [optional]
 **dateTo** | **String**| 対象期間To 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 対象期間FROMと対象期間Toを指定する場合は、対象期間FROM≦対象期間TOとします。それを超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10  | [optional]
 **nextItemKey** | **String**| 次明細キー 半角数字 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）              minLength: 1 maxLength: 24  | [optional]
 **requestTransferStatuses** | [**RequestTransferStatus**](RequestTransferStatus.md)| 振込一括照会対象ステータス 照会対象キー区分が、2のときは設定可 それ以外は設定しません（値が設定されている場合は、「400 Bad Request」を返却）  | [optional]
 **requestTransferClass** | **String**| 振込照会対象取得区分 半角数字 1：ALL、2：振込申請のみ、3：振込受付情報のみ 照会対象キー区分が2かつ、法人かつ、ビジネスID管理利用中の場合のときのみ入力可 それ以外はNULLを設定(値が設定されている場合は、「400 Bad Request」を返却) 照会対象キー区分が、2のときに指定しない場合は1と扱います minLength: 1 maxLength: 1  | [optional]
 **requestTransferTerm** | **String**| 振込照会対象期間区分 半角数字 対象期間Fromと対象期間Toで指定する日付の区分 1：振込申請受付日　2：振込指定日 照会対象キー区分が2のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1  | [optional]

### Return type

[**BulkTransferStatusResponse**](BulkTransferStatusResponse.md)

### application.AuthController

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8
