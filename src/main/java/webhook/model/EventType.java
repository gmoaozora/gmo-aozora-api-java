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
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Objects;

/**
 * EventType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-11T10:04:38.046Z")
public class EventType implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("eventType")
  private String eventType = null;

  public EventType eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * イベント種別 半角英数記号文字 va-deposit-transaction &#x3D; 振込入金口座への入金明細通知 
   * @return eventType
  **/
  @ApiModelProperty(example = "va-deposit-transaction", required = true, value = "イベント種別 半角英数記号文字 va-deposit-transaction = 振込入金口座への入金明細通知 ")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventType eventType = (EventType) o;
    return Objects.equals(this.eventType, eventType.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventType {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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
