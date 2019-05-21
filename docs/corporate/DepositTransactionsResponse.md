
# DepositTransactionsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | 口座ID 半角英数字 口座を識別するID  | 
**dateFrom** | **String** | 対象期間From 半角文字 YYYY-MM-DD形式 リクエストに対象期間From、Toが設定されていない場合当日日付が設定されます  | 
**dateTo** | **String** | 対象期間To 半角文字 YYYY-MM-DD形式 リクエストに対象期間From、Toが設定されていない場合当日日付が設定されます  | 
**baseDate** | **String** | 基準日 半角文字 YYYY-MM-DD形式 応答日付、もしくは振込入金明細の基準日を示します  | 
**baseTime** | **String** | 基準時刻 HH:MM:SS+09:00形式 応答時刻、もしくは振込入金明細の基準時刻を示します  | 
**hasNext** | **Boolean** | 次明細フラグ ・true&#x3D;次明細あり ・false&#x3D;次明細なし  | 
**nextItemKey** | **String** | 次明細キー 半角数字 次明細フラグがfalseの場合はNULL  |  [optional]
**count** | **String** | 明細取得件数 半角数字  | 
**paymentArrivals** | [**List&lt;PaymentArrival&gt;**](PaymentArrival.md) | 振込入金明細情報 該当する情報が無い場合は、空のリストを返却します  |  [optional]



