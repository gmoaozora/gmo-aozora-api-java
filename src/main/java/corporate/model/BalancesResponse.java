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
 * BalancesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class BalancesResponse {
  @SerializedName("balances")
  private List<Balance> balances = null;

  @SerializedName("spAccountBalances")
  private List<SpAccountBalance> spAccountBalances = null;

  public BalancesResponse balances(List<Balance> balances) {
    this.balances = balances;
    return this;
  }

  public BalancesResponse addBalancesItem(Balance balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<>();
    }
    this.balances.add(balancesItem);
    return this;
  }

   /**
   * 残高情報リスト 該当する情報が無い場合は、空のリストを返却します
   * @return balances
  **/
  @ApiModelProperty(value = "残高情報リスト 該当する情報が無い場合は、空のリストを返却します ")
  public List<Balance> getBalances() {
    return balances;
  }

  public void setBalances(List<Balance> balances) {
    this.balances = balances;
  }

  public BalancesResponse spAccountBalances(List<SpAccountBalance> spAccountBalances) {
    this.spAccountBalances = spAccountBalances;
    return this;
  }

  public BalancesResponse addSpAccountBalancesItem(SpAccountBalance spAccountBalancesItem) {
    if (this.spAccountBalances == null) {
      this.spAccountBalances = new ArrayList<>();
    }
    this.spAccountBalances.add(spAccountBalancesItem);
    return this;
  }

   /**
   * つかいわけ口座残高情報リスト 該当する情報が無い場合は、項目自体を設定しません
   * @return spAccountBalances
  **/
  @ApiModelProperty(value = "つかいわけ口座残高情報リスト 該当する情報が無い場合は、項目自体を設定しません ")
  public List<SpAccountBalance> getSpAccountBalances() {
    return spAccountBalances;
  }

  public void setSpAccountBalances(List<SpAccountBalance> spAccountBalances) {
    this.spAccountBalances = spAccountBalances;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalancesResponse balancesResponse = (BalancesResponse) o;
    return Objects.equals(this.balances, balancesResponse.balances) &&
        Objects.equals(this.spAccountBalances, balancesResponse.spAccountBalances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances, spAccountBalances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalancesResponse {\n");

    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    spAccountBalances: ").append(toIndentedString(spAccountBalances)).append("\n");
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

