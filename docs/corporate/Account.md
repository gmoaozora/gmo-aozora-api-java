
# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | 口座ID 半角英数字 口座を識別するID  | 
**branchCode** | **String** | 支店コード 半角数字 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用）  |  [optional]
**branchName** | **String** | 支店名 全角文字 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用）  |  [optional]
**accountTypeCode** | **String** | 科目コード 半角数字 ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用） ・11&#x3D;円定期預金 ・51&#x3D;外貨普通預金 ・81&#x3D;証券コネクト口座  | 
**accountTypeName** | **String** | 科目名 全角文字 科目コードの名称  | 
**accountNumber** | **String** | 口座番号 半角数字 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用）  |  [optional]
**primaryAccountCode** | **String** | 代表口座コード ・1&#x3D;代表口座 ・2&#x3D;追加口座 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用）  |  [optional]
**primaryAccountCodeName** | **String** | 代表口座コードの名称 全角文字 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用）  |  [optional]
**accountName** | **String** | 口座名義 全角文字 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用）  |  [optional]
**accountNameKana** | **String** | 口座名義カナ 半角文字 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用）  |  [optional]
**currencyCode** | **String** | 通貨コード 半角文字 ISO4217に準拠した通貨コード  | 
**currencyName** | **String** | 通貨名 全角文字 ISO4217に準拠した通貨コードの当行での名称  | 
**transferLimitAmount** | **String** | 振込限度額 半角数字 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用）  |  [optional]



