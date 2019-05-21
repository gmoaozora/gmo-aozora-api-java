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

import common.ApiException;
import corporate.model.AccountsResponse;
import corporate.model.BalancesResponse;
import corporate.model.DepositTransactionsResponse;
import corporate.model.TransactionsResponse;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for AccountApi
 */
@Ignore
public class AccountApiTest {

    private final AccountApi api = new AccountApi();

    
    /**
     * 振込入金明細照会
     *
     * 指定した円普通預金口座の入金明細情報を照会します ※個人事業主のみ対象となり、個人は対象外となります 対象期間From、対象期間Toを設定しない場合、当日分の入金明細を返却します ■ページング ・1回のリクエストで照会できる明細は、最大500件です ・2ページ目以降を照会する際は、初回と同じリクエスト内容に、初回レスポンスの次明細キーを追加してリクエストしてください ■ソート順 ・取引の昇順 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountsDepositTransactionsUsingGETTest() throws ApiException {
        String accountId = null;
        String xAccessToken = null;
        String dateFrom = null;
        String dateTo = null;
        String nextItemKey = null;
        DepositTransactionsResponse response = api.accountsDepositTransactionsUsingGET(accountId, xAccessToken, dateFrom, dateTo, nextItemKey);

        // TODO: test validations
    }
    
    /**
     * 口座一覧照会
     *
     * 保有する全ての口座情報一覧を照会します
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountsUsingGETTest() throws ApiException {
        String xAccessToken = null;
        AccountsResponse response = api.accountsUsingGET(xAccessToken);

        // TODO: test validations
    }
    
    /**
     * 残高照会
     *
     * 保有する口座の残高情報を照会します 口座IDを指定した場合、該当する口座の残高情報を照会します 口座IDを指定しない場合、保有する口座全ての残高情報を照会します 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void balancesUsingGETTest() throws ApiException {
        String xAccessToken = null;
        String accountId = null;
        BalancesResponse response = api.balancesUsingGET(xAccessToken, accountId);

        // TODO: test validations
    }
    
    /**
     * 入出金明細照会
     *
     * 指定した円普通預金口座の入出金明細情報を照会します 対象期間From、対象期間Toを設定しない場合、当日分の入出金明細を返却します ■ページング ・1回のリクエストで照会できる明細は、最大500件です ・2ページ目以降を照会する際は、初回と同じリクエスト内容に、初回レスポンスの次明細キーを追加してリクエストしてください ■ソート順 ・取引の昇順
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionsUsingGETTest() throws ApiException {
        String accountId = null;
        String xAccessToken = null;
        String dateFrom = null;
        String dateTo = null;
        String nextItemKey = null;
        TransactionsResponse response = api.transactionsUsingGET(accountId, xAccessToken, dateFrom, dateTo, nextItemKey);

        // TODO: test validations
    }
    
}
