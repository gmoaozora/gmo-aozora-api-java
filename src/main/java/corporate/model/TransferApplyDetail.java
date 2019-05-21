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
import java.util.Objects;

/**
 * TransferApplyDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class TransferApplyDetail {
  @SerializedName("applyDatetime")
  private String applyDatetime = null;

  @SerializedName("applyStatus")
  private String applyStatus = null;

  @SerializedName("applyUser")
  private String applyUser = null;

  @SerializedName("applyComment")
  private String applyComment = null;

  @SerializedName("approvalUser")
  private String approvalUser = null;

  @SerializedName("approvalComment")
  private String approvalComment = null;

  public TransferApplyDetail applyDatetime(String applyDatetime) {
    this.applyDatetime = applyDatetime;
    return this;
  }

   /**
   * 振込申請受付日時 半角文字 YYYY-MM-DDTHH:MM:SS+09:00形式 この申請の受付日時 
   * @return applyDatetime
  **/
  @ApiModelProperty(example = "2018-07-29T10:00:00+09:00", value = "振込申請受付日時 半角文字 YYYY-MM-DDTHH:MM:SS+09:00形式 この申請の受付日時 ")
  public String getApplyDatetime() {
    return applyDatetime;
  }

  public void setApplyDatetime(String applyDatetime) {
    this.applyDatetime = applyDatetime;
  }

  public TransferApplyDetail applyStatus(String applyStatus) {
    this.applyStatus = applyStatus;
    return this;
  }

   /**
   * 振込申請ステータス 半角数字 1桁目、0：未申請、1：申請中、2：差戻、3：取下げ、4：期限切れ、5：承認済、6：承認取消、7：自動承認 該当する情報が無い場合はNULLを返却 
   * @return applyStatus
  **/
  @ApiModelProperty(example = "1", value = "振込申請ステータス 半角数字 1桁目、0：未申請、1：申請中、2：差戻、3：取下げ、4：期限切れ、5：承認済、6：承認取消、7：自動承認 該当する情報が無い場合はNULLを返却 ")
  public String getApplyStatus() {
    return applyStatus;
  }

  public void setApplyStatus(String applyStatus) {
    this.applyStatus = applyStatus;
  }

  public TransferApplyDetail applyUser(String applyUser) {
    this.applyUser = applyUser;
    return this;
  }

   /**
   * 申請者 全半角文字 申請をしたユーザ名 該当する情報が無い場合はNULLを返却 
   * @return applyUser
  **/
  @ApiModelProperty(example = "山田二郎", value = "申請者 全半角文字 申請をしたユーザ名 該当する情報が無い場合はNULLを返却 ")
  public String getApplyUser() {
    return applyUser;
  }

  public void setApplyUser(String applyUser) {
    this.applyUser = applyUser;
  }

  public TransferApplyDetail applyComment(String applyComment) {
    this.applyComment = applyComment;
    return this;
  }

   /**
   * 申請者コメント 全半角文字 申請したユーザのコメント 該当する情報が無い場合はNULLを返却 
   * @return applyComment
  **/
  @ApiModelProperty(example = "緊急でお願いします。", value = "申請者コメント 全半角文字 申請したユーザのコメント 該当する情報が無い場合はNULLを返却 ")
  public String getApplyComment() {
    return applyComment;
  }

  public void setApplyComment(String applyComment) {
    this.applyComment = applyComment;
  }

  public TransferApplyDetail approvalUser(String approvalUser) {
    this.approvalUser = approvalUser;
    return this;
  }

   /**
   * 決裁者 全半角文字 承認をしたユーザ名 該当する情報が無い場合はNULLを返却 
   * @return approvalUser
  **/
  @ApiModelProperty(example = "田中太郎", value = "決裁者 全半角文字 承認をしたユーザ名 該当する情報が無い場合はNULLを返却 ")
  public String getApprovalUser() {
    return approvalUser;
  }

  public void setApprovalUser(String approvalUser) {
    this.approvalUser = approvalUser;
  }

  public TransferApplyDetail approvalComment(String approvalComment) {
    this.approvalComment = approvalComment;
    return this;
  }

   /**
   * 決裁者コメント 全半角文字 承認をしたユーザのコメント 該当する情報が無い場合はNULLを返却 
   * @return approvalComment
  **/
  @ApiModelProperty(example = "実施しました", value = "決裁者コメント 全半角文字 承認をしたユーザのコメント 該当する情報が無い場合はNULLを返却 ")
  public String getApprovalComment() {
    return approvalComment;
  }

  public void setApprovalComment(String approvalComment) {
    this.approvalComment = approvalComment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferApplyDetail transferApplyDetail = (TransferApplyDetail) o;
    return Objects.equals(this.applyDatetime, transferApplyDetail.applyDatetime) &&
        Objects.equals(this.applyStatus, transferApplyDetail.applyStatus) &&
        Objects.equals(this.applyUser, transferApplyDetail.applyUser) &&
        Objects.equals(this.applyComment, transferApplyDetail.applyComment) &&
        Objects.equals(this.approvalUser, transferApplyDetail.approvalUser) &&
        Objects.equals(this.approvalComment, transferApplyDetail.approvalComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyDatetime, applyStatus, applyUser, applyComment, approvalUser, approvalComment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferApplyDetail {\n");

    sb.append("    applyDatetime: ").append(toIndentedString(applyDatetime)).append("\n");
    sb.append("    applyStatus: ").append(toIndentedString(applyStatus)).append("\n");
    sb.append("    applyUser: ").append(toIndentedString(applyUser)).append("\n");
    sb.append("    applyComment: ").append(toIndentedString(applyComment)).append("\n");
    sb.append("    approvalUser: ").append(toIndentedString(approvalUser)).append("\n");
    sb.append("    approvalComment: ").append(toIndentedString(approvalComment)).append("\n");
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

