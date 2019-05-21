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
 * VaId
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class VaId {
  @SerializedName("vaId")
  private String vaId = null;

  public VaId vaId(String vaId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VaId vaId = (VaId) o;
    return Objects.equals(this.vaId, vaId.vaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VaId {\n");

    sb.append("    vaId: ").append(toIndentedString(vaId)).append("\n");
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

