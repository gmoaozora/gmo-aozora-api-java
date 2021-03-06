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


package auth.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ErrorResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-21T11:18:42.855Z")
public class ErrorResponse {
  @SerializedName("error")
  private String error = null;

  @SerializedName("error_description")
  private String errorDescription = null;

  @SerializedName("error_uri")
  private String errorUri = null;

  @SerializedName("state")
  private String state = null;

  public ErrorResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * エラーコード ・invalid_request:要求パラメータが不正(必須パラメータ:パラメータキー要求なし、パラメータの値が空)  ・invalid_client:指定されたクライアント、またはクライアント情報が不正  ・invalid_grant:認可コードが不正、またはリダイレクトURIが不正  ・unauthorized_client:クライアントがグラントタイプauthorization_codeの利用を許可されていない  ・unsupported_grant_type:API-GWがサポートしていないグラントタイプが指定された  ・invalid_scope:指定されたスコープが不正  ・server_error:OPサーバでエラーが発生
   * @return error
  **/
  @ApiModelProperty(example = "invalid_request", required = true, value = "エラーコード ・invalid_request:要求パラメータが不正(必須パラメータ:パラメータキー要求なし、パラメータの値が空)  ・invalid_client:指定されたクライアント、またはクライアント情報が不正  ・invalid_grant:認可コードが不正、またはリダイレクトURIが不正  ・unauthorized_client:クライアントがグラントタイプauthorization_codeの利用を許可されていない  ・unsupported_grant_type:API-GWがサポートしていないグラントタイプが指定された  ・invalid_scope:指定されたスコープが不正  ・server_error:OPサーバでエラーが発生")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ErrorResponse errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * エラー内容(ASCIIコード「%x20-21 / %x23-5B / %x5D-7E」の範囲の文字種)
   * @return errorDescription
  **/
  @ApiModelProperty(example = "Unsupported response_type value", value = "エラー内容(ASCIIコード「%x20-21 / %x23-5B / %x5D-7E」の範囲の文字種)")
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public ErrorResponse errorUri(String errorUri) {
    this.errorUri = errorUri;
    return this;
  }

   /**
   * エラー内容(ASCIIコード「%x20-21 / %x23-5B / %x5D-7E」の範囲の文字種)
   * @return errorUri
  **/
  @ApiModelProperty(example = "Unsupported response_type value", value = "エラー内容(ASCIIコード「%x20-21 / %x23-5B / %x5D-7E」の範囲の文字種)")
  public String getErrorUri() {
    return errorUri;
  }

  public void setErrorUri(String errorUri) {
    this.errorUri = errorUri;
  }

  public ErrorResponse state(String state) {
    this.state = state;
    return this;
  }

   /**
   * 要求パラメータのstate
   * @return state
  **/
  @ApiModelProperty(example = "af0ifjsldkj", value = "要求パラメータのstate")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.error, errorResponse.error) &&
        Objects.equals(this.errorDescription, errorResponse.errorDescription) &&
        Objects.equals(this.errorUri, errorResponse.errorUri) &&
        Objects.equals(this.state, errorResponse.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription, errorUri, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    errorUri: ").append(toIndentedString(errorUri)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

