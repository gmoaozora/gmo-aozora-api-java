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


package corporate.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SpAccountBalance
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class SpAccountBalance {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("odBalance")
  private String odBalance = null;

  @SerializedName("tdTotalBalance")
  private String tdTotalBalance = null;

  @SerializedName("fodTotalBalanceYenEquivalent")
  private String fodTotalBalanceYenEquivalent = null;

  @SerializedName("spAccountFcyBalances")
  private List<SpAccountFcyBalance> spAccountFcyBalances = null;

  public SpAccountBalance accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * 口座ID 半角英数字 つかいわけ口座を識別するID
   * @return accountId
  **/
  @ApiModelProperty(example = "SP101011234567", required = true, value = "口座ID 半角英数字 つかいわけ口座を識別するID ")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public SpAccountBalance odBalance(String odBalance) {
    this.odBalance = odBalance;
    return this;
  }

   /**
   * 円普通預金残高 半角数字　マイナス含む 該当しない場合NULL
   * @return odBalance
  **/
  @ApiModelProperty(example = "1500000", value = "円普通預金残高 半角数字　マイナス含む 該当しない場合NULL ")
  public String getOdBalance() {
    return odBalance;
  }

  public void setOdBalance(String odBalance) {
    this.odBalance = odBalance;
  }

  public SpAccountBalance tdTotalBalance(String tdTotalBalance) {
    this.tdTotalBalance = tdTotalBalance;
    return this;
  }

   /**
   * 円定期預金（総額） 半角数字　マイナス含む つかいわけ口座に紐付いた、円定期預金の総残高
   * @return tdTotalBalance
  **/
  @ApiModelProperty(example = "10000000", value = "円定期預金（総額） 半角数字　マイナス含む つかいわけ口座に紐付いた、円定期預金の総残高 ")
  public String getTdTotalBalance() {
    return tdTotalBalance;
  }

  public void setTdTotalBalance(String tdTotalBalance) {
    this.tdTotalBalance = tdTotalBalance;
  }

  public SpAccountBalance fodTotalBalanceYenEquivalent(String fodTotalBalanceYenEquivalent) {
    this.fodTotalBalanceYenEquivalent = fodTotalBalanceYenEquivalent;
    return this;
  }

   /**
   * 外貨普通預金（総評価額） 半角数字　マイナス含む つかいわけ口座に紐付いた、外貨普通預金の総残高を円に換算した額
   * @return fodTotalBalanceYenEquivalent
  **/
  @ApiModelProperty(example = "921834", value = "外貨普通預金（総評価額） 半角数字　マイナス含む つかいわけ口座に紐付いた、外貨普通預金の総残高を円に換算した額 ")
  public String getFodTotalBalanceYenEquivalent() {
    return fodTotalBalanceYenEquivalent;
  }

  public void setFodTotalBalanceYenEquivalent(String fodTotalBalanceYenEquivalent) {
    this.fodTotalBalanceYenEquivalent = fodTotalBalanceYenEquivalent;
  }

  public SpAccountBalance spAccountFcyBalances(List<SpAccountFcyBalance> spAccountFcyBalances) {
    this.spAccountFcyBalances = spAccountFcyBalances;
    return this;
  }

  public SpAccountBalance addSpAccountFcyBalancesItem(SpAccountFcyBalance spAccountFcyBalancesItem) {
    if (this.spAccountFcyBalances == null) {
      this.spAccountFcyBalances = new ArrayList<>();
    }
    this.spAccountFcyBalances.add(spAccountFcyBalancesItem);
    return this;
  }

   /**
   * つかわけ口座外貨残高情報リスト 該当する情報が無い場合は、空のリストを返却します
   * @return spAccountFcyBalances
  **/
  @ApiModelProperty(value = "つかわけ口座外貨残高情報リスト 該当する情報が無い場合は、空のリストを返却します ")
  public List<SpAccountFcyBalance> getSpAccountFcyBalances() {
    return spAccountFcyBalances;
  }

  public void setSpAccountFcyBalances(List<SpAccountFcyBalance> spAccountFcyBalances) {
    this.spAccountFcyBalances = spAccountFcyBalances;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpAccountBalance spAccountBalance = (SpAccountBalance) o;
    return Objects.equals(this.accountId, spAccountBalance.accountId) &&
        Objects.equals(this.odBalance, spAccountBalance.odBalance) &&
        Objects.equals(this.tdTotalBalance, spAccountBalance.tdTotalBalance) &&
        Objects.equals(this.fodTotalBalanceYenEquivalent, spAccountBalance.fodTotalBalanceYenEquivalent) &&
        Objects.equals(this.spAccountFcyBalances, spAccountBalance.spAccountFcyBalances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, odBalance, tdTotalBalance, fodTotalBalanceYenEquivalent, spAccountFcyBalances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpAccountBalance {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    odBalance: ").append(toIndentedString(odBalance)).append("\n");
    sb.append("    tdTotalBalance: ").append(toIndentedString(tdTotalBalance)).append("\n");
    sb.append("    fodTotalBalanceYenEquivalent: ").append(toIndentedString(fodTotalBalanceYenEquivalent)).append("\n");
    sb.append("    spAccountFcyBalances: ").append(toIndentedString(spAccountFcyBalances)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

