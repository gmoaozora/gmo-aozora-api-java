# TokenApi

All URIs are relative to *https://stg-api.gmo-aozora.com/ganb/api/auth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tokenUsingPOST**](TokenApi.md#tokenUsingPOST) | **POST** /token | アクセストークン発行

# **tokenUsingPOST**
> TokenResponse tokenUsingPOST(contentType, body, authorization)

### アクセストークン発行

認可エンドポイントで取得した認可コードを用いたアクセストークンの取得及びリフレッシュトークンを用いたアクセストークンの更 新を行うためのエンドポイント

### Example
```java
import auth.TokenApi;
import auth.model.TokenRequest;
import auth.model.TokenResponse;
import common.ApiException;
import com.google.gson.Gson;

public class SampleTokenUsingPost {
    public static void main(String[] args){
        TokenApi apiInstance = new TokenApi();
        String contentType = "application/x-www-form-urlencoded"; // String | application/x-www-form-urlencodedに固定
        Gson gson = new Gson();
        String jsonStr = "{" +
                             "\"grant_type\":\"authorization_code\"," +
                             "\"client_id\":\"client_id_example\"," +
                             "\"client_secret\":\"client_secret_example\"," +
                             "\"redirect_uri\":\"redirect_uri_example\"," +
                             "\"code\":\"code_example\"" +
                         "}";
        TokenRequest body = gson.fromJson(jsonStr, TokenRequest.class); // TokenRequest | HTTPリクエストボディ
        String authorization = "authorization_example"; // String | クライアント認証用のBasic認証値。 (クライアントIDとクライアントシーレットを:(コロン)で連結し、Base64エンコードしたものを設定。) 事前に登録する「クライアント認証方式」にclient_secret_basic(ベーシック認証)を設定した場合、必須。 「クライアント認証方式」にclient_secret_post(パラメーター認証)を設定した場合、設定不要。
        try {
            TokenResponse result = apiInstance.tokenUsingPOST(contentType, body, authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenApi#tokenUsingPOST");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**| application/x-www-form-urlencodedに固定 |
 **body** | [**TokenRequest**](TokenRequest.md)| HTTPリクエストボディ |
 **authorization** | **String**| クライアント認証用のBasic認証値。 (クライアントIDとクライアントシーレットを:(コロン)で連結し、Base64エンコードしたものを設定。) 事前に登録する「クライアント認証方式」にclient_secret_basic(ベーシック認証)を設定した場合、必須。 「クライアント認証方式」にclient_secret_post(パラメーター認証)を設定した場合、設定不要。 | [optional]

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json;charset=UTF-8

