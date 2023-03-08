/*
 * GMO Aozora Net Bank Open API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package corporate;

import com.google.gson.reflect.TypeToken;
import common.ApiCallback;
import common.ApiClient;
import common.ApiException;
import common.ApiResponse;
import common.BeanValidationException;
import common.Configuration;
import common.Pair;
import common.ProgressRequestBody;
import common.ProgressResponseBody;
import corporate.model.BulkTransferRequest;
import corporate.model.BulkTransferRequestResponse;
import corporate.model.BulkTransferStatusResponse;
import corporate.model.RequestTransferStatus;
import corporate.model.TransferFeeResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.executable.ExecutableValidator;

public class BulkTransferApi {
    private ApiClient apiClient;

    public BulkTransferApi() {
        this(Configuration.getCorporateApiClient());
    }

    public BulkTransferApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for bulkTransferFeeUsingPOST
     * @param body HTTPリクエストボディ (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call bulkTransferFeeUsingPOSTCall(BulkTransferRequest body, String xAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/bulktransfer/transferfee";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xAccessToken != null)
        localVarHeaderParams.put("x-access-token", apiClient.parameterToString(xAccessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call bulkTransferFeeUsingPOSTValidateBeforeCall(BulkTransferRequest body, String xAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        try {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            ExecutableValidator executableValidator = factory.getValidator().forExecutables();

            Object[] parameterValues = { body, xAccessToken };
            Method method = this.getClass().getMethod("bulkTransferFeeUsingPOSTWithHttpInfo", BulkTransferRequest.class, String.class);
            Set<ConstraintViolation<BulkTransferApi>> violations = executableValidator.validateParameters(this, method,
                    parameterValues);

            if (violations.size() == 0) {
                com.squareup.okhttp.Call call = bulkTransferFeeUsingPOSTCall(body, xAccessToken, progressListener, progressRequestListener);
                return call;

            } else {
                throw new BeanValidationException((Set) violations);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }

    }

    /**
     * 総合振込手数料事前照会
     * 総合振込・総合振込予約をAPIから行うための申請内容の事前チェックと手数料を照会します ※個人事業主のみ対象となり、個人は対象外となります
     * @param body HTTPリクエストボディ (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @return TransferFeeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransferFeeResponse bulkTransferFeeUsingPOST(BulkTransferRequest body, String xAccessToken) throws ApiException {
        ApiResponse<TransferFeeResponse> resp = bulkTransferFeeUsingPOSTWithHttpInfo(body, xAccessToken);
        return resp.getData();
    }

    /**
     * 総合振込手数料事前照会
     * 総合振込・総合振込予約をAPIから行うための申請内容の事前チェックと手数料を照会します ※個人事業主のみ対象となり、個人は対象外となります
     * @param body HTTPリクエストボディ (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @return ApiResponse&lt;TransferFeeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransferFeeResponse> bulkTransferFeeUsingPOSTWithHttpInfo(BulkTransferRequest body, String xAccessToken) throws ApiException {
        com.squareup.okhttp.Call call = bulkTransferFeeUsingPOSTValidateBeforeCall(body, xAccessToken, null, null);
        Type localVarReturnType = new TypeToken<TransferFeeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 総合振込手数料事前照会 (asynchronously)
     * 総合振込・総合振込予約をAPIから行うための申請内容の事前チェックと手数料を照会します ※個人事業主のみ対象となり、個人は対象外となります
     * @param body HTTPリクエストボディ (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call bulkTransferFeeUsingPOSTAsync(
        BulkTransferRequest body, String xAccessToken, final ApiCallback<TransferFeeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = bulkTransferFeeUsingPOSTValidateBeforeCall(body, xAccessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransferFeeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for bulkTransferRequestUsingPOST
     * @param body HTTPリクエストボディ (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call bulkTransferRequestUsingPOSTCall(BulkTransferRequest body, String xAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/bulktransfer/request";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xAccessToken != null)
        localVarHeaderParams.put("x-access-token", apiClient.parameterToString(xAccessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call bulkTransferRequestUsingPOSTValidateBeforeCall(BulkTransferRequest body, String xAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        try {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            ExecutableValidator executableValidator = factory.getValidator().forExecutables();

            Object[] parameterValues = { body, xAccessToken };
            Method method = this.getClass().getMethod("bulkTransferRequestUsingPOSTWithHttpInfo", BulkTransferRequest.class, String.class);
            Set<ConstraintViolation<BulkTransferApi>> violations = executableValidator.validateParameters(this, method,
                    parameterValues);

            if (violations.size() == 0) {
                com.squareup.okhttp.Call call = bulkTransferRequestUsingPOSTCall(body, xAccessToken, progressListener, progressRequestListener);
                return call;

            } else {
                throw new BeanValidationException((Set) violations);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }

    }

    /**
     * 総合振込依頼
     * 総合振込を申請します ※個人事業主のみ対象となり、個人は対象外となります
     * @param body HTTPリクエストボディ (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @return BulkTransferRequestResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BulkTransferRequestResponse bulkTransferRequestUsingPOST(BulkTransferRequest body, String xAccessToken) throws ApiException {
        ApiResponse<BulkTransferRequestResponse> resp = bulkTransferRequestUsingPOSTWithHttpInfo(body, xAccessToken);
        return resp.getData();
    }

    /**
     * 総合振込依頼
     * 総合振込を申請します ※個人事業主のみ対象となり、個人は対象外となります
     * @param body HTTPリクエストボディ (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @return ApiResponse&lt;BulkTransferRequestResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BulkTransferRequestResponse> bulkTransferRequestUsingPOSTWithHttpInfo(BulkTransferRequest body, String xAccessToken) throws ApiException {
        com.squareup.okhttp.Call call = bulkTransferRequestUsingPOSTValidateBeforeCall(body, xAccessToken, null, null);
        Type localVarReturnType = new TypeToken<BulkTransferRequestResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 総合振込依頼 (asynchronously)
     * 総合振込を申請します ※個人事業主のみ対象となり、個人は対象外となります
     * @param body HTTPリクエストボディ (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call bulkTransferRequestUsingPOSTAsync(BulkTransferRequest body, String xAccessToken, final ApiCallback<BulkTransferRequestResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = bulkTransferRequestUsingPOSTValidateBeforeCall(body, xAccessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BulkTransferRequestResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for bulkTransferStatusUsingGET
     * @param accountId 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29  (required)
     * @param queryKeyClass 照会対象キー区分 半角数字 照会対象のキー 1：振込申請照会対象指定、2：振込一括照会対象指定  minLength: 1 maxLength: 1  (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @param detailInfoNecessity 明細情報取得フラグ 総合振込明細情報の取得要否 照会対象キー区分が、1のときは「True：取得する」を指定可 True：取得する、False:取得しない　省略/NULLは　false扱い  (optional)
     * @param bulktransferItemKey 総合振込明細情報取得対象キー 半角数字 明細情報取得フラグが、「True：取得する」のとき指定可 総合振込明細情報を取得するときに取得を開始する番号 明細情報取得フラグが、「True：取得する」のときの省略/NULLは1扱い 1500明細を取得する場合、は以下のように設定 1電文目：1 2電文目：501 3電文目：1001  minLength: 1 maxLength: 6  (optional)
     * @param applyNo 受付番号（振込申請番号） 半角数字 照会対象の番号を設定 照会対象キー区分が、1のときは必須 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）  minLength: 16 maxLength: 16  (optional)
     * @param dateFrom 対象期間From 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）              minLength: 10 maxLength: 10  (optional)
     * @param dateTo 対象期間To 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 対象期間FROMと対象期間Toを指定する場合は、対象期間FROM≦対象期間TOとします。それを超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10  (optional)
     * @param nextItemKey 次明細キー 半角数字 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）              minLength: 1 maxLength: 24  (optional)
     * @param requestTransferStatuses 振込一括照会対象ステータス 照会対象キー区分が、2のときは設定可 それ以外は設定しません（値が設定されている場合は、「400 Bad Request」を返却）  (optional)
     * @param requestTransferClass 振込照会対象取得区分 半角数字 1：ALL、2：振込申請のみ、3：振込受付情報のみ 照会対象キー区分が2かつ、法人かつ、ビジネスID管理利用中の場合のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1  (optional)
     * @param requestTransferTerm 振込照会対象期間区分 半角数字 対象期間Fromと対象期間Toで指定する日付の区分 1：振込申請受付日　2：振込指定日 照会対象キー区分が2のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call bulkTransferStatusUsingGETCall(String accountId, String queryKeyClass, String xAccessToken, Boolean detailInfoNecessity, String bulktransferItemKey, String applyNo, String dateFrom, String dateTo, String nextItemKey, RequestTransferStatus requestTransferStatuses, String requestTransferClass, String requestTransferTerm, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestTransferStatuses;

        // create path and map variables
        String localVarPath = "/bulktransfer/status";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accountId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("accountId", accountId));
        if (queryKeyClass != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("queryKeyClass", queryKeyClass));
        if (detailInfoNecessity != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("detailInfoNecessity", detailInfoNecessity));
        if (bulktransferItemKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("bulktransferItemKey", bulktransferItemKey));
        if (applyNo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("applyNo", applyNo));
        if (dateFrom != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dateFrom", dateFrom));
        if (dateTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dateTo", dateTo));
        if (nextItemKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("nextItemKey", nextItemKey));
        if (requestTransferClass != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("requestTransferClass", requestTransferClass));
        if (requestTransferTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("requestTransferTerm", requestTransferTerm));
        if (requestTransferStatuses != null && requestTransferStatuses.getRequestTransferStatus() != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("requestTransferStatus", requestTransferStatuses.getRequestTransferStatus()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xAccessToken != null)
        localVarHeaderParams.put("x-access-token", apiClient.parameterToString(xAccessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call bulkTransferStatusUsingGETValidateBeforeCall(String accountId, String queryKeyClass, String xAccessToken, Boolean detailInfoNecessity, String bulktransferItemKey, String applyNo, String dateFrom, String dateTo, String nextItemKey, RequestTransferStatus requestTransferStatuses, String requestTransferClass, String requestTransferTerm, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        try {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            ExecutableValidator executableValidator = factory.getValidator().forExecutables();

            Object[] parameterValues = { accountId, queryKeyClass, xAccessToken, detailInfoNecessity, bulktransferItemKey, applyNo, dateFrom, dateTo, nextItemKey, requestTransferStatuses, requestTransferClass, requestTransferTerm };
            Method method = this.getClass().getMethod("bulkTransferStatusUsingGETWithHttpInfo", String.class, String.class, String.class, Boolean.class, String.class, String.class, String.class, String.class, String.class, RequestTransferStatus.class, String.class, String.class);
            Set<ConstraintViolation<BulkTransferApi>> violations = executableValidator.validateParameters(this, method,
                    parameterValues);

            if (violations.size() == 0) {
                com.squareup.okhttp.Call call = bulkTransferStatusUsingGETCall(accountId, queryKeyClass, xAccessToken, detailInfoNecessity, bulktransferItemKey, applyNo, dateFrom, dateTo, nextItemKey, requestTransferStatuses, requestTransferClass, requestTransferTerm, progressListener, progressRequestListener);
                return call;

            } else {
                throw new BeanValidationException((Set) violations);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }

    }

    /**
     * 総合振込状況照会
     * 仕向の総合振込の状況・履歴情報を照会します ※個人事業主のみ対象となり、個人は対象外となります 対象期間From、対象期間Toを設定しない場合、当日分総合振込明細を返却します ■ソート順 明細情報取得フラグが、「False：取得しない」のとき 　1：振込申請受付日　　第1ソート：振込申請日昇順　　第２ソート：振込申請番号昇順 　2：振込指定日　　　  第1ソート：振込指定日昇順　　第２ソート：振込申請番号昇順 　※振込照会対象期間区分の指定がない場合は、1：振込申請受付日と同じとなります 明細情報取得フラグが、「True：取得する」のとき 　明細番号の昇順 ■ページング ・1回のリクエストで照会できる明細は、振込照会明細情報または総合振込明細情報のいずれか最大500件です ・2ページ目以降を照会する際は、初回と同じリクエスト内容に、初回レスポンスの次明細キーまたは総合振込明細情報取得対象キーを追加してリクエストしてください ・取得できる明細が存在しない場合は200：OKとし明細を返却しません ■照会対象ステータス   ・申請中以降のステータスで照会が可能となります ・依頼中、作成中の状態は照会対象外です ■照会対象となる明細   ・総合振込・およびその予約の履歴と状況が照会対象となります（APIからの依頼結果のみではありません） 
     * @param accountId 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29  (required)
     * @param queryKeyClass 照会対象キー区分 半角数字 照会対象のキー 1：振込申請照会対象指定、2：振込一括照会対象指定  minLength: 1 maxLength: 1  (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @param detailInfoNecessity 明細情報取得フラグ 総合振込明細情報の取得要否 照会対象キー区分が、1のときは「True：取得する」を指定可 True：取得する、False:取得しない　省略/NULLは　false扱い  (optional)
     * @param bulktransferItemKey 総合振込明細情報取得対象キー 半角数字 明細情報取得フラグが、「True：取得する」のとき指定可 総合振込明細情報を取得するときに取得を開始する番号 明細情報取得フラグが、「True：取得する」のときの省略/NULLは1扱い 1500明細を取得する場合、は以下のように設定 1電文目：1 2電文目：501 3電文目：1001  minLength: 1 maxLength: 6  (optional)
     * @param applyNo 受付番号（振込申請番号） 半角数字 照会対象の番号を設定 照会対象キー区分が、1のときは必須 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）  minLength: 16 maxLength: 16  (optional)
     * @param dateFrom 対象期間From 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）              minLength: 10 maxLength: 10  (optional)
     * @param dateTo 対象期間To 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 対象期間FROMと対象期間Toを指定する場合は、対象期間FROM≦対象期間TOとします。それを超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10  (optional)
     * @param nextItemKey 次明細キー 半角数字 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）              minLength: 1 maxLength: 24  (optional)
     * @param requestTransferStatuses 振込一括照会対象ステータス 照会対象キー区分が、2のときは設定可 それ以外は設定しません（値が設定されている場合は、「400 Bad Request」を返却）  (optional)
     * @param requestTransferClass 振込照会対象取得区分 半角数字 1：ALL、2：振込申請のみ、3：振込受付情報のみ 照会対象キー区分が2かつ、法人かつ、ビジネスID管理利用中の場合のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1  (optional)
     * @param requestTransferTerm 振込照会対象期間区分 半角数字 対象期間Fromと対象期間Toで指定する日付の区分 1：振込申請受付日　2：振込指定日 照会対象キー区分が2のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1  (optional)
     * @return BulkTransferStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BulkTransferStatusResponse bulkTransferStatusUsingGET(String accountId, String queryKeyClass, String xAccessToken, Boolean detailInfoNecessity, String bulktransferItemKey, String applyNo, String dateFrom, String dateTo, String nextItemKey, RequestTransferStatus requestTransferStatuses, String requestTransferClass, String requestTransferTerm) throws ApiException {
        ApiResponse<BulkTransferStatusResponse> resp = bulkTransferStatusUsingGETWithHttpInfo(accountId, queryKeyClass, xAccessToken, detailInfoNecessity, bulktransferItemKey, applyNo, dateFrom, dateTo, nextItemKey, requestTransferStatuses, requestTransferClass, requestTransferTerm);
        return resp.getData();
    }

    /**
     * 総合振込状況照会
     * 仕向の総合振込の状況・履歴情報を照会します ※個人事業主のみ対象となり、個人は対象外となります 対象期間From、対象期間Toを設定しない場合、当日分総合振込明細を返却します ■ソート順 明細情報取得フラグが、「False：取得しない」のとき 　1：振込申請受付日　　第1ソート：振込申請日昇順　　第２ソート：振込申請番号昇順 　2：振込指定日　　　  第1ソート：振込指定日昇順　　第２ソート：振込申請番号昇順 　※振込照会対象期間区分の指定がない場合は、1：振込申請受付日と同じとなります 明細情報取得フラグが、「True：取得する」のとき 　明細番号の昇順 ■ページング ・1回のリクエストで照会できる明細は、振込照会明細情報または総合振込明細情報のいずれか最大500件です ・2ページ目以降を照会する際は、初回と同じリクエスト内容に、初回レスポンスの次明細キーまたは総合振込明細情報取得対象キーを追加してリクエストしてください ・取得できる明細が存在しない場合は200：OKとし明細を返却しません ■照会対象ステータス   ・申請中以降のステータスで照会が可能となります ・依頼中、作成中の状態は照会対象外です ■照会対象となる明細   ・総合振込・およびその予約の履歴と状況が照会対象となります（APIからの依頼結果のみではありません） 
     * @param accountId 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29  (required)
     * @param queryKeyClass 照会対象キー区分 半角数字 照会対象のキー 1：振込申請照会対象指定、2：振込一括照会対象指定  minLength: 1 maxLength: 1  (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @param detailInfoNecessity 明細情報取得フラグ 総合振込明細情報の取得要否 照会対象キー区分が、1のときは「True：取得する」を指定可 True：取得する、False:取得しない　省略/NULLは　false扱い  (optional)
     * @param bulktransferItemKey 総合振込明細情報取得対象キー 半角数字 明細情報取得フラグが、「True：取得する」のとき指定可 総合振込明細情報を取得するときに取得を開始する番号 明細情報取得フラグが、「True：取得する」のときの省略/NULLは1扱い 1500明細を取得する場合、は以下のように設定 1電文目：1 2電文目：501 3電文目：1001  minLength: 1 maxLength: 6  (optional)
     * @param applyNo 受付番号（振込申請番号） 半角数字 照会対象の番号を設定 照会対象キー区分が、1のときは必須 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）  minLength: 16 maxLength: 16  (optional)
     * @param dateFrom 対象期間From 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）              minLength: 10 maxLength: 10  (optional)
     * @param dateTo 対象期間To 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 対象期間FROMと対象期間Toを指定する場合は、対象期間FROM≦対象期間TOとします。それを超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10  (optional)
     * @param nextItemKey 次明細キー 半角数字 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）              minLength: 1 maxLength: 24  (optional)
     * @param requestTransferStatuses 振込一括照会対象ステータス 照会対象キー区分が、2のときは設定可 それ以外は設定しません（値が設定されている場合は、「400 Bad Request」を返却）  (optional)
     * @param requestTransferClass 振込照会対象取得区分 半角数字 1：ALL、2：振込申請のみ、3：振込受付情報のみ 照会対象キー区分が2かつ、法人かつ、ビジネスID管理利用中の場合のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1  (optional)
     * @param requestTransferTerm 振込照会対象期間区分 半角数字 対象期間Fromと対象期間Toで指定する日付の区分 1：振込申請受付日　2：振込指定日 照会対象キー区分が2のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1  (optional)
     * @return ApiResponse&lt;BulkTransferStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BulkTransferStatusResponse> bulkTransferStatusUsingGETWithHttpInfo(String accountId, String queryKeyClass, String xAccessToken, Boolean detailInfoNecessity, String bulktransferItemKey, String applyNo, String dateFrom, String dateTo, String nextItemKey, RequestTransferStatus requestTransferStatuses, String requestTransferClass, String requestTransferTerm) throws ApiException {
        com.squareup.okhttp.Call call = bulkTransferStatusUsingGETValidateBeforeCall(accountId, queryKeyClass, xAccessToken, detailInfoNecessity, bulktransferItemKey, applyNo, dateFrom, dateTo, nextItemKey, requestTransferStatuses, requestTransferClass, requestTransferTerm, null, null);
        Type localVarReturnType = new TypeToken<BulkTransferStatusResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 総合振込状況照会 (asynchronously)
     * 仕向の総合振込の状況・履歴情報を照会します ※個人事業主のみ対象となり、個人は対象外となります 対象期間From、対象期間Toを設定しない場合、当日分総合振込明細を返却します ■ソート順 明細情報取得フラグが、「False：取得しない」のとき 　1：振込申請受付日　　第1ソート：振込申請日昇順　　第２ソート：振込申請番号昇順 　2：振込指定日　　　  第1ソート：振込指定日昇順　　第２ソート：振込申請番号昇順 　※振込照会対象期間区分の指定がない場合は、1：振込申請受付日と同じとなります 明細情報取得フラグが、「True：取得する」のとき 　明細番号の昇順 ■ページング ・1回のリクエストで照会できる明細は、振込照会明細情報または総合振込明細情報のいずれか最大500件です ・2ページ目以降を照会する際は、初回と同じリクエスト内容に、初回レスポンスの次明細キーまたは総合振込明細情報取得対象キーを追加してリクエストしてください ・取得できる明細が存在しない場合は200：OKとし明細を返却しません ■照会対象ステータス   ・申請中以降のステータスで照会が可能となります ・依頼中、作成中の状態は照会対象外です ■照会対象となる明細   ・総合振込・およびその予約の履歴と状況が照会対象となります（APIからの依頼結果のみではありません） 
     * @param accountId 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29  (required)
     * @param queryKeyClass 照会対象キー区分 半角数字 照会対象のキー 1：振込申請照会対象指定、2：振込一括照会対象指定  minLength: 1 maxLength: 1  (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @param detailInfoNecessity 明細情報取得フラグ 総合振込明細情報の取得要否 照会対象キー区分が、1のときは「True：取得する」を指定可 True：取得する、False:取得しない　省略/NULLは　false扱い  (optional)
     * @param bulktransferItemKey 総合振込明細情報取得対象キー 半角数字 明細情報取得フラグが、「True：取得する」のとき指定可 総合振込明細情報を取得するときに取得を開始する番号 明細情報取得フラグが、「True：取得する」のときの省略/NULLは1扱い 1500明細を取得する場合、は以下のように設定 1電文目：1 2電文目：501 3電文目：1001  minLength: 1 maxLength: 6  (optional)
     * @param applyNo 受付番号（振込申請番号） 半角数字 照会対象の番号を設定 照会対象キー区分が、1のときは必須 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）  minLength: 16 maxLength: 16  (optional)
     * @param dateFrom 対象期間From 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）              minLength: 10 maxLength: 10  (optional)
     * @param dateTo 対象期間To 半角文字 YYYY-MM-DD形式 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 対象期間FROMと対象期間Toを指定する場合は、対象期間FROM≦対象期間TOとします。それを超えた場合は「400 Bad Request」を返却  minLength: 10 maxLength: 10  (optional)
     * @param nextItemKey 次明細キー 半角数字 照会対象キー区分が、2のときは入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却）              minLength: 1 maxLength: 24  (optional)
     * @param requestTransferStatuses 振込一括照会対象ステータス 照会対象キー区分が、2のときは設定可 それ以外は設定しません（値が設定されている場合は、「400 Bad Request」を返却）  (optional)
     * @param requestTransferClass 振込照会対象取得区分 半角数字 1：ALL、2：振込申請のみ、3：振込受付情報のみ 照会対象キー区分が2かつ、法人かつ、ビジネスID管理利用中の場合のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1  (optional)
     * @param requestTransferTerm 振込照会対象期間区分 半角数字 対象期間Fromと対象期間Toで指定する日付の区分 1：振込申請受付日　2：振込指定日 照会対象キー区分が2のときのみ入力可 それ以外はNULLを設定（値が設定されている場合は、「400 Bad Request」を返却） 照会対象キー区分が、2のときに指定しない場合は1と扱います  minLength: 1 maxLength: 1  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call bulkTransferStatusUsingGETAsync(String accountId, String queryKeyClass, String xAccessToken, Boolean detailInfoNecessity, String bulktransferItemKey, String applyNo, String dateFrom, String dateTo, String nextItemKey, RequestTransferStatus requestTransferStatuses, String requestTransferClass, String requestTransferTerm, final ApiCallback<BulkTransferStatusResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = bulkTransferStatusUsingGETValidateBeforeCall(accountId, queryKeyClass, xAccessToken, detailInfoNecessity, bulktransferItemKey, applyNo, dateFrom, dateTo, nextItemKey, requestTransferStatuses, requestTransferClass, requestTransferTerm, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BulkTransferStatusResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
