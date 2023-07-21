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
import io.openkruise.client.models.KruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategyManualUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateStrategy indicates the strategy the UnitedDeployment use to preform the update, when template is changed.
 */
@ApiModel(description = "UpdateStrategy indicates the strategy the UnitedDeployment use to preform the update, when template is changed.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategy {
  @SerializedName("manualUpdate")
  private KruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategyManualUpdate manualUpdate = null;

  @SerializedName("type")
  private String type = null;

  public KruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategy manualUpdate(KruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategyManualUpdate manualUpdate) {
    this.manualUpdate = manualUpdate;
    return this;
  }

   /**
   * Get manualUpdate
   * @return manualUpdate
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategyManualUpdate getManualUpdate() {
    return manualUpdate;
  }

  public void setManualUpdate(KruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategyManualUpdate manualUpdate) {
    this.manualUpdate = manualUpdate;
  }

  public KruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of UnitedDeployment update strategy. Default is Manual.
   * @return type
  **/
  @ApiModelProperty(value = "Type of UnitedDeployment update strategy. Default is Manual.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategy ioKruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategy = (KruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategy) o;
    return Objects.equals(this.manualUpdate, ioKruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategy.manualUpdate) &&
        Objects.equals(this.type, ioKruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manualUpdate, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1UnitedDeploymentSpecUpdateStrategy {\n");
    
    sb.append("    manualUpdate: ").append(toIndentedString(manualUpdate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
