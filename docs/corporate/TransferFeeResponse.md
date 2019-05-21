
# TransferFeeResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | 口座ID 半角英数字 口座を識別するID  | 
**baseDate** | **String** | 基準日 応答日付、もしくは手数料計算を実施した基準日を示します YYYY-MM-DD形式  | 
**baseTime** | **String** | 基準時刻 応答時刻、もしくは手数料計算を実施した基準時刻を示します HH:MM:SS+09:00形式  | 
**totalFee** | **String** | 合計振込手数料 半角数字 手数料の合計額を表示  | 
**transferFeeDetails** | [**List&lt;TransferFeeDetail&gt;**](TransferFeeDetail.md) | 振込手数料明細情報 個別明細を設定  | 



