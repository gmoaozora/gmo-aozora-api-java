/*
 * GMO Aozora Net Bank Open API
 * <p>Ph2.5向けに作成したもの</p> 
 *
 * OpenAPI spec version: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package webhook.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Objects;

/**
 * 振込入金口座入金明細情報 
 */
@ApiModel(description = "振込入金口座入金明細情報 ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-11T10:04:38.046Z")
public class VaTransaction implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("vaId")
  private String vaId = null;

  @SerializedName("transactionDate")
  private String transactionDate = null;

  @SerializedName("valueDate")
  private String valueDate = null;

  @SerializedName("vaBranchCode")
  private String vaBranchCode = null;

  @SerializedName("vaBranchNameKana")
  private String vaBranchNameKana = null;

  @SerializedName("vaAccountNumber")
  private String vaAccountNumber = null;

  @SerializedName("vaAccountNameKana")
  private String vaAccountNameKana = null;

  @SerializedName("depositAmount")
  private String depositAmount = null;

  @SerializedName("remitterNameKana")
  private String remitterNameKana = null;

  @SerializedName("paymentBankName")
  private String paymentBankName = null;

  @SerializedName("paymentBranchName")
  private String paymentBranchName = null;

  @SerializedName("partnerName")
  private String partnerName = null;

  @SerializedName("remarks")
  private String remarks = null;

  @SerializedName("itemKey")
  private String itemKey = null;

  public VaTransaction vaId(String vaId) {
    this.vaId = vaId;
    return this;
  }

   /**
   * 振込入金口座ID 半角数字 振込入金口座を識別するID 
   * @return vaId
  **/
  @ApiModelProperty(example = "5021099622", required = true, value = "振込入金口座ID 半角数字 振込入金口座を識別するID ")
  public String getVaId() {
    return vaId;
  }

  public void setVaId(String vaId) {
    this.vaId = vaId;
  }

  public VaTransaction transactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * 取引日 半角文字 YYYY-MM-DD形式 
   * @return transactionDate
  **/
  @ApiModelProperty(example = "2018-08-02", required = true, value = "取引日 半角文字 YYYY-MM-DD形式 ")
  public String getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }

  public VaTransaction valueDate(String valueDate) {
    this.valueDate = valueDate;
    return this;
  }

   /**
   * 起算日 半角文字 YYYY-MM-DD形式 
   * @return valueDate
  **/
  @ApiModelProperty(example = "2018-08-02", required = true, value = "起算日 半角文字 YYYY-MM-DD形式 ")
  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }

  public VaTransaction vaBranchCode(String vaBranchCode) {
    this.vaBranchCode = vaBranchCode;
    return this;
  }

   /**
   * 支店コード 半角数字 
   * @return vaBranchCode
  **/
  @ApiModelProperty(example = "502", required = true, value = "支店コード 半角数字 ")
  public String getVaBranchCode() {
    return vaBranchCode;
  }

  public void setVaBranchCode(String vaBranchCode) {
    this.vaBranchCode = vaBranchCode;
  }

  public VaTransaction vaBranchNameKana(String vaBranchNameKana) {
    this.vaBranchNameKana = vaBranchNameKana;
    return this;
  }

   /**
   * 支店名カナ 半角文字 
   * @return vaBranchNameKana
  **/
  @ApiModelProperty(example = "ｱｼﾞｻｲ", required = true, value = "支店名カナ 半角文字 ")
  public String getVaBranchNameKana() {
    return vaBranchNameKana;
  }

  public void setVaBranchNameKana(String vaBranchNameKana) {
    this.vaBranchNameKana = vaBranchNameKana;
  }

  public VaTransaction vaAccountNumber(String vaAccountNumber) {
    this.vaAccountNumber = vaAccountNumber;
    return this;
  }

   /**
   * 口座番号 半角数字 
   * @return vaAccountNumber
  **/
  @ApiModelProperty(example = "1099622", required = true, value = "口座番号 半角数字 ")
  public String getVaAccountNumber() {
    return vaAccountNumber;
  }

  public void setVaAccountNumber(String vaAccountNumber) {
    this.vaAccountNumber = vaAccountNumber;
  }

  public VaTransaction vaAccountNameKana(String vaAccountNameKana) {
    this.vaAccountNameKana = vaAccountNameKana;
    return this;
  }

   /**
   * 口座名義カナ 半角文字 
   * @return vaAccountNameKana
  **/
  @ApiModelProperty(example = "ｱｵｿﾞﾗ ﾀﾛｳﾃｽﾄﾆﾕｳｷﾝｸﾞﾁ", required = true, value = "口座名義カナ 半角文字 ")
  public String getVaAccountNameKana() {
    return vaAccountNameKana;
  }

  public void setVaAccountNameKana(String vaAccountNameKana) {
    this.vaAccountNameKana = vaAccountNameKana;
  }

  public VaTransaction depositAmount(String depositAmount) {
    this.depositAmount = depositAmount;
    return this;
  }

   /**
   * 入金金額 半角数字 
   * @return depositAmount
  **/
  @ApiModelProperty(example = "10000", required = true, value = "入金金額 半角数字 ")
  public String getDepositAmount() {
    return depositAmount;
  }

  public void setDepositAmount(String depositAmount) {
    this.depositAmount = depositAmount;
  }

  public VaTransaction remitterNameKana(String remitterNameKana) {
    this.remitterNameKana = remitterNameKana;
    return this;
  }

   /**
   * 振込依頼人名カナ 半角文字 
   * @return remitterNameKana
  **/
  @ApiModelProperty(example = "ﾃｽﾄ ﾀﾛｳ", required = true, value = "振込依頼人名カナ 半角文字 ")
  public String getRemitterNameKana() {
    return remitterNameKana;
  }

  public void setRemitterNameKana(String remitterNameKana) {
    this.remitterNameKana = remitterNameKana;
  }

  public VaTransaction paymentBankName(String paymentBankName) {
    this.paymentBankName = paymentBankName;
    return this;
  }

   /**
   * 仕向金融機関名カナ 半角文字 
   * @return paymentBankName
  **/
  @ApiModelProperty(example = "ｱｵｿﾞﾗｷﾞﾝｺｳ", required = true, value = "仕向金融機関名カナ 半角文字 ")
  public String getPaymentBankName() {
    return paymentBankName;
  }

  public void setPaymentBankName(String paymentBankName) {
    this.paymentBankName = paymentBankName;
  }

  public VaTransaction paymentBranchName(String paymentBranchName) {
    this.paymentBranchName = paymentBranchName;
    return this;
  }

   /**
   * 仕向支店名カナ 半角文字 
   * @return paymentBranchName
  **/
  @ApiModelProperty(example = "ﾎﾝﾃﾝ", required = true, value = "仕向支店名カナ 半角文字 ")
  public String getPaymentBranchName() {
    return paymentBranchName;
  }

  public void setPaymentBranchName(String paymentBranchName) {
    this.paymentBranchName = paymentBranchName;
  }

  public VaTransaction partnerName(String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

   /**
   * サービス企業名 全角文字 振込入金口座契約サービス企業名 
   * @return partnerName
  **/
  @ApiModelProperty(example = "GMOあおぞらネット銀行", required = true, value = "サービス企業名 全角文字 振込入金口座契約サービス企業名 ")
  public String getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  public VaTransaction remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

   /**
   * 摘要内容 全半角文字 該当データがない場合は項目自体を設定しません 
   * @return remarks
  **/
  @ApiModelProperty(example = "振込 ｲｰﾃﾞｲｰｱｲ テスト　タロウ あじさい支店 1036971", value = "摘要内容 全半角文字 該当データがない場合は項目自体を設定しません ")
  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public VaTransaction itemKey(String itemKey) {
    this.itemKey = itemKey;
    return this;
  }

   /**
   * 明細キー 半角数字 口座ID毎に設定される明細キー（明細データtimestamp（μs））
   * @return itemKey
  **/
  @ApiModelProperty(example = "20181012090520112541", required = true, value = "明細キー 半角数字 口座ID毎に設定される明細キー（明細データtimestamp（μs））")
  public String getItemKey() {
    return itemKey;
  }

  public void setItemKey(String itemKey) {
    this.itemKey = itemKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VaTransaction vaTransaction = (VaTransaction) o;
    return Objects.equals(this.vaId, vaTransaction.vaId) &&
        Objects.equals(this.transactionDate, vaTransaction.transactionDate) &&
        Objects.equals(this.valueDate, vaTransaction.valueDate) &&
        Objects.equals(this.vaBranchCode, vaTransaction.vaBranchCode) &&
        Objects.equals(this.vaBranchNameKana, vaTransaction.vaBranchNameKana) &&
        Objects.equals(this.vaAccountNumber, vaTransaction.vaAccountNumber) &&
        Objects.equals(this.vaAccountNameKana, vaTransaction.vaAccountNameKana) &&
        Objects.equals(this.depositAmount, vaTransaction.depositAmount) &&
        Objects.equals(this.remitterNameKana, vaTransaction.remitterNameKana) &&
        Objects.equals(this.paymentBankName, vaTransaction.paymentBankName) &&
        Objects.equals(this.paymentBranchName, vaTransaction.paymentBranchName) &&
        Objects.equals(this.partnerName, vaTransaction.partnerName) &&
        Objects.equals(this.remarks, vaTransaction.remarks) &&
        Objects.equals(this.itemKey, vaTransaction.itemKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaId, transactionDate, valueDate, vaBranchCode, vaBranchNameKana, vaAccountNumber, vaAccountNameKana, depositAmount, remitterNameKana, paymentBankName, paymentBranchName, partnerName, remarks, itemKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VaTransaction {\n");
    
    sb.append("    vaId: ").append(toIndentedString(vaId)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    vaBranchCode: ").append(toIndentedString(vaBranchCode)).append("\n");
    sb.append("    vaBranchNameKana: ").append(toIndentedString(vaBranchNameKana)).append("\n");
    sb.append("    vaAccountNumber: ").append(toIndentedString(vaAccountNumber)).append("\n");
    sb.append("    vaAccountNameKana: ").append(toIndentedString(vaAccountNameKana)).append("\n");
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    remitterNameKana: ").append(toIndentedString(remitterNameKana)).append("\n");
    sb.append("    paymentBankName: ").append(toIndentedString(paymentBankName)).append("\n");
    sb.append("    paymentBranchName: ").append(toIndentedString(paymentBranchName)).append("\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    itemKey: ").append(toIndentedString(itemKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

