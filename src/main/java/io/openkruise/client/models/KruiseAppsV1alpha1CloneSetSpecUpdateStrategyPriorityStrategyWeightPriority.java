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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.kubernetes.client.openapi.models.V1LabelSelector;

/**
 * UpdatePriorityWeightTerm defines weight priority.
 */
@ApiModel(description = "UpdatePriorityWeightTerm defines weight priority.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyWeightPriority {
  @SerializedName("matchSelector")
  private V1LabelSelector matchSelector = null;

  @SerializedName("weight")
  private Integer weight = null;

  public KruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyWeightPriority matchSelector(V1LabelSelector matchSelector) {
    this.matchSelector = matchSelector;
    return this;
  }

   /**
   * Get matchSelector
   * @return matchSelector
  **/
  @ApiModelProperty(required = true, value = "")
  public V1LabelSelector getMatchSelector() {
    return matchSelector;
  }

  public void setMatchSelector(V1LabelSelector matchSelector) {
    this.matchSelector = matchSelector;
  }

  public KruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyWeightPriority weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Weight associated with matching the corresponding matchExpressions, in the range 1-100.
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "Weight associated with matching the corresponding matchExpressions, in the range 1-100.")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyWeightPriority ioKruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyWeightPriority = (KruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyWeightPriority) o;
    return Objects.equals(this.matchSelector, ioKruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyWeightPriority.matchSelector) &&
        Objects.equals(this.weight, ioKruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyWeightPriority.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchSelector, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyWeightPriority {\n");
    
    sb.append("    matchSelector: ").append(toIndentedString(matchSelector)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

