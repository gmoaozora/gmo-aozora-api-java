
# TransferError

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorCode** | **String** | エラーコード 半角英数文字  | 
**errorMessage** | **String** | エラーメッセージ 全半角英数記号文字  | 
**errorDetails** | [**List&lt;ErrorDetail&gt;**](ErrorDetail.md) | エラー詳細情報 該当する情報が無い場合は空のリストを返却  |  [optional]
**transferErrorDetails** | [**List&lt;TransferErrorDetail&gt;**](TransferErrorDetail.md) | 個別明細がエラーの場合のみ応答 該当する情報が無い場合は空のリストを返却  |  [optional]



