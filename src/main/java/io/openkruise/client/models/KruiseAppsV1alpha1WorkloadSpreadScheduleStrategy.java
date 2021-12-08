/*
 * Kruise
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.openkruise.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.openkruise.client.models.KruiseAppsV1alpha1AdaptiveWorkloadSpreadStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkloadSpreadScheduleStrategy defines the schedule performance of WorkloadSpread
 */
@ApiModel(description = "WorkloadSpreadScheduleStrategy defines the schedule performance of WorkloadSpread")

public class KruiseAppsV1alpha1WorkloadSpreadScheduleStrategy {
  @SerializedName("adaptive")
  private KruiseAppsV1alpha1AdaptiveWorkloadSpreadStrategy adaptive = null;

  @SerializedName("type")
  private String type = null;

  public KruiseAppsV1alpha1WorkloadSpreadScheduleStrategy adaptive(KruiseAppsV1alpha1AdaptiveWorkloadSpreadStrategy adaptive) {
    this.adaptive = adaptive;
    return this;
  }

   /**
   * Adaptive is used to communicate parameters when Type is AdaptiveWorkloadSpreadScheduleStrategyType.
   * @return adaptive
  **/
  @ApiModelProperty(value = "Adaptive is used to communicate parameters when Type is AdaptiveWorkloadSpreadScheduleStrategyType.")
  public KruiseAppsV1alpha1AdaptiveWorkloadSpreadStrategy getAdaptive() {
    return adaptive;
  }

  public void setAdaptive(KruiseAppsV1alpha1AdaptiveWorkloadSpreadStrategy adaptive) {
    this.adaptive = adaptive;
  }

  public KruiseAppsV1alpha1WorkloadSpreadScheduleStrategy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type indicates the type of the WorkloadSpreadScheduleStrategy. Default is Fixed
   * @return type
  **/
  @ApiModelProperty(value = "Type indicates the type of the WorkloadSpreadScheduleStrategy. Default is Fixed")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1WorkloadSpreadScheduleStrategy kruiseAppsV1alpha1WorkloadSpreadScheduleStrategy = (KruiseAppsV1alpha1WorkloadSpreadScheduleStrategy) o;
    return Objects.equals(this.adaptive, kruiseAppsV1alpha1WorkloadSpreadScheduleStrategy.adaptive) &&
        Objects.equals(this.type, kruiseAppsV1alpha1WorkloadSpreadScheduleStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adaptive, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1WorkloadSpreadScheduleStrategy {\n");
    
    sb.append("    adaptive: ").append(toIndentedString(adaptive)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
