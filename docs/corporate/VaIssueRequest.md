
# VaIssueRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vaTypeCode** | **String** | 振込入金口座　種類コード 半角数字 ・1&#x3D;期限型 ・2&#x3D;継続型  | 
**issueRequestCount** | **String** | 発行口座数 半角数字 1回のリクエストで1,000口座まで発行可能  | 
**raId** | **String** | 入金先口座ID 半角数字 科目コードが以下の口座IDのみ受け付けます ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用） 必須  |  [optional]
**vaContractAuthKey** | **String** | 振込入金口座API認証情報 半角英数字 NULLを設定 値が設定されている場合は「400 Bad Request」を返却  |  [optional]
**vaHolderNameKana** | **String** | 追加名義カナ 半角カナ英数記号 口座名義カナの文字数 + 追加名義カナの文字数が40文字以内 ・使用可能な記号は「/」、「)」、「.」、「‐」 ・濁点、半濁点は１文字として数えます  |  [optional]
**vaHolderNamePos** | **String** | 追加名義位置 半角数字 追加名義カナを口座名義の前につけるか後ろにつけるかの指定 ・1&#x3D;通常（後ろにつける） ・2&#x3D;前につける 指定が無い場合は後ろにつけます  |  [optional]



