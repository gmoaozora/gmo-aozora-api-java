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
import java.util.Objects;

/**
 * RequestTransferStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class RequestTransferStatus {
  @SerializedName("requestTransferStatus")
  private String requestTransferStatus = null;

  public RequestTransferStatus requestTransferStatus(String requestTransferStatus) {
    this.requestTransferStatus = requestTransferStatus;
    return this;
  }

   /**
   * 照会対象ステータス 半角数字 2:申請中、3:差戻、4:取下げ、5:期限切れ、8:承認取消/予約取消、 11:予約中、12:手続中、13:リトライ中、 20:手続済、22:資金返却、24:組戻手続中、25:組戻済、26:組戻不成立、 30:不能・組戻あり、 40:手続不成立 配列のため、複数設定した場合は対象のステータスをOR条件で検索します 省略した場合は全てを設定したものとみなします 22、24、25、26は振込状況照会でのみ指定可 30は総合振込状況照会でのみ指定可 レスポンスの場合はリクエストしたときと同じ内容となります 
   * @return requestTransferStatus
  **/
  @ApiModelProperty(example = "3", value = "照会対象ステータス 半角数字 2:申請中、3:差戻、4:取下げ、5:期限切れ、8:承認取消/予約取消、 11:予約中、12:手続中、13:リトライ中、 20:手続済、22:資金返却、24:組戻手続中、25:組戻済、26:組戻不成立、 30:不能・組戻あり、 40:手続不成立 配列のため、複数設定した場合は対象のステータスをOR条件で検索します 省略した場合は全てを設定したものとみなします 22、24、25、26は振込状況照会でのみ指定可 30は総合振込状況照会でのみ指定可 レスポンスの場合はリクエストしたときと同じ内容となります ")
  public String getRequestTransferStatus() {
    return requestTransferStatus;
  }

  public void setRequestTransferStatus(String requestTransferStatus) {
    this.requestTransferStatus = requestTransferStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestTransferStatus requestTransferStatus = (RequestTransferStatus) o;
    return Objects.equals(this.requestTransferStatus, requestTransferStatus.requestTransferStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestTransferStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestTransferStatus {\n");
    
    sb.append("    requestTransferStatus: ").append(toIndentedString(requestTransferStatus)).append("\n");
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

