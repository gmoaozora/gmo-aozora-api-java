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


package personal.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VaStatusChangeRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class VaStatusChangeRequest {
  @SerializedName("vaContractAuthKey")
  private String vaContractAuthKey = null;

  @SerializedName("vaStatusChangeCode")
  private String vaStatusChangeCode = null;

  @SerializedName("vaIdList")
  private List<VaId> vaIdList = new ArrayList<>();

  public VaStatusChangeRequest vaContractAuthKey(String vaContractAuthKey) {
    this.vaContractAuthKey = vaContractAuthKey;
    return this;
  }

   /**
   * 振込入金口座API認証情報 半角英数字 NULLを設定 値が設定されている場合は「400 Bad Request」を返却 
   * @return vaContractAuthKey
  **/
  @ApiModelProperty(example = "5CSDFG1515A54DF", value = "振込入金口座API認証情報 半角英数字 NULLを設定 値が設定されている場合は「400 Bad Request」を返却 ")
  public String getVaContractAuthKey() {
    return vaContractAuthKey;
  }

  public void setVaContractAuthKey(String vaContractAuthKey) {
    this.vaContractAuthKey = vaContractAuthKey;
  }

  public VaStatusChangeRequest vaStatusChangeCode(String vaStatusChangeCode) {
    this.vaStatusChangeCode = vaStatusChangeCode;
    return this;
  }

   /**
   * 振込入金口座状態変更依頼コード 半角数字 以下の変更したコード値を設定 ・1&#x3D;停止 ・2&#x3D;再開 ・3&#x3D;削除 
   * @return vaStatusChangeCode
  **/
  @ApiModelProperty(example = "1", required = true, value = "振込入金口座状態変更依頼コード 半角数字 以下の変更したコード値を設定 ・1=停止 ・2=再開 ・3=削除 ")
  public String getVaStatusChangeCode() {
    return vaStatusChangeCode;
  }

  public void setVaStatusChangeCode(String vaStatusChangeCode) {
    this.vaStatusChangeCode = vaStatusChangeCode;
  }

  public VaStatusChangeRequest vaIdList(List<VaId> vaIdList) {
    this.vaIdList = vaIdList;
    return this;
  }

  public VaStatusChangeRequest addVaIdListItem(VaId vaIdListItem) {
    this.vaIdList.add(vaIdListItem);
    return this;
  }

   /**
   * 振込入金口座IDリスト 上限は100件 
   * @return vaIdList
  **/
  @ApiModelProperty(required = true, value = "振込入金口座IDリスト 上限は100件 ")
  public List<VaId> getVaIdList() {
    return vaIdList;
  }

  public void setVaIdList(List<VaId> vaIdList) {
    this.vaIdList = vaIdList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VaStatusChangeRequest vaStatusChangeRequest = (VaStatusChangeRequest) o;
    return Objects.equals(this.vaContractAuthKey, vaStatusChangeRequest.vaContractAuthKey) &&
        Objects.equals(this.vaStatusChangeCode, vaStatusChangeRequest.vaStatusChangeCode) &&
        Objects.equals(this.vaIdList, vaStatusChangeRequest.vaIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaContractAuthKey, vaStatusChangeCode, vaIdList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VaStatusChangeRequest {\n");
    
    sb.append("    vaContractAuthKey: ").append(toIndentedString(vaContractAuthKey)).append("\n");
    sb.append("    vaStatusChangeCode: ").append(toIndentedString(vaStatusChangeCode)).append("\n");
    sb.append("    vaIdList: ").append(toIndentedString(vaIdList)).append("\n");
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

