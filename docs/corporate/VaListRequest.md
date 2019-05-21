
# VaListRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vaContractAuthKey** | **String** | 振込入金口座API認証情報 半角英数字 NULLを設定 値が設定されている場合は「400 Bad Request」を返却  |  [optional]
**vaTypeCode** | **String** | 振込入金口座　種類コード 半角数字 ・1&#x3D;期限型 ・2&#x3D;継続型  |  [optional]
**depositAmountExistCode** | **String** | 入金有無コード 半角数字 ・1&#x3D;入金あり ・2&#x3D;入金なし  |  [optional]
**vaHolderNameKana** | **String** | 振込入金口座名義カナ 半角文字 振込許容文字を指定可 ただし、一部の非許容文字は、許容文字に変換を行う  |  [optional]
**vaStatusCodeList** | [**List&lt;VaStatusCode&gt;**](VaStatusCode.md) | 振込入金口座IDリスト 照会したい振込入金口座状態コードのリスト 上限3件まで設定可能  |  [optional]
**latestDepositDateFrom** | **String** | 最終入金日From 半角文字 YYYY-MM-DD形式  |  [optional]
**latestDepositDateTo** | **String** | 最終入金日To 半角文字 YYYY-MM-DD形式  |  [optional]
**vaIssueDateFrom** | **String** | 振込入金口座発行日From 半角文字 YYYY-MM-DD形式  |  [optional]
**vaIssueDateTo** | **String** | 振込入金口座発行日To 半角文字 YYYY-MM-DD形式  |  [optional]
**expireDateFrom** | **String** | 有効期限From 半角文字 YYYY-MM-DD形式  |  [optional]
**expireDateTo** | **String** | 有効期限To 半角文字 YYYY-MM-DD形式  |  [optional]
**raId** | **String** | 入金先口座ID 半角数字 口座一覧照会APIで取得できる口座IDを設定  |  [optional]
**nextItemKey** | **String** | 次一覧キー 半角英数字  |  [optional]
**sortItemCode** | **String** | ソート項目コード 半角数字 ・1&#x3D;有効期限日時 ・2&#x3D;最終入金日 ・3&#x3D;発行日時 ・4&#x3D;最終入金金額  |  [optional]
**sortOrderCode** | **String** | ソート順コード 半角数字 取引日のソート中を指定するコード値 ・1&#x3D;昇順 ・2&#x3D;降順  |  [optional]
**vaIdList** | [**List&lt;VaId&gt;**](VaId.md) | 振込入金口座IDリスト 照会したい振込入金口座IDのリスト 上限500件まで設定可能  |  [optional]



