/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.openkruise.client.models;

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
 * UpdatePriorityOrderTerm defines order priority.
 */
@ApiModel(description = "UpdatePriorityOrderTerm defines order priority.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyOrderPriority {
  @SerializedName("orderedKey")
  private String orderedKey = null;

  public KruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyOrderPriority orderedKey(String orderedKey) {
    this.orderedKey = orderedKey;
    return this;
  }

   /**
   * Calculate priority by value of this key. Values of this key, will be sorted by GetInt(val). GetInt method will find the last int in value, such as getting 5 in value &#39;5&#39;, getting 10 in value &#39;sts-10&#39;.
   * @return orderedKey
  **/
  @ApiModelProperty(required = true, value = "Calculate priority by value of this key. Values of this key, will be sorted by GetInt(val). GetInt method will find the last int in value, such as getting 5 in value '5', getting 10 in value 'sts-10'.")
  public String getOrderedKey() {
    return orderedKey;
  }

  public void setOrderedKey(String orderedKey) {
    this.orderedKey = orderedKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyOrderPriority ioKruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyOrderPriority = (KruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyOrderPriority) o;
    return Objects.equals(this.orderedKey, ioKruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyOrderPriority.orderedKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderedKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyOrderPriority {\n");
    
    sb.append("    orderedKey: ").append(toIndentedString(orderedKey)).append("\n");
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
