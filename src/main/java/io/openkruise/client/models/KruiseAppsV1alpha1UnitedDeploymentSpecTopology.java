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

import java.util.ArrayList;
import java.util.List;

/**
 * Topology describes the pods distribution detail between each of subsets.
 */
@ApiModel(description = "Topology describes the pods distribution detail between each of subsets.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1UnitedDeploymentSpecTopology {
  @SerializedName("subsets")
  private List<KruiseAppsV1alpha1Subset> subsets = null;

  public KruiseAppsV1alpha1UnitedDeploymentSpecTopology subsets(List<KruiseAppsV1alpha1Subset> subsets) {
    this.subsets = subsets;
    return this;
  }

  public KruiseAppsV1alpha1UnitedDeploymentSpecTopology addSubsetsItem(KruiseAppsV1alpha1Subset subsetsItem) {
    if (this.subsets == null) {
      this.subsets = new ArrayList<KruiseAppsV1alpha1Subset>();
    }
    this.subsets.add(subsetsItem);
    return this;
  }

   /**
   * Contains the details of each subset. Each element in this array represents one subset which will be provisioned and managed by UnitedDeployment.
   * @return subsets
  **/
  @ApiModelProperty(value = "Contains the details of each subset. Each element in this array represents one subset which will be provisioned and managed by UnitedDeployment.")
  public List<KruiseAppsV1alpha1Subset> getSubsets() {
    return subsets;
  }

  public void setSubsets(List<KruiseAppsV1alpha1Subset> subsets) {
    this.subsets = subsets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1UnitedDeploymentSpecTopology ioKruiseAppsV1alpha1UnitedDeploymentSpecTopology = (KruiseAppsV1alpha1UnitedDeploymentSpecTopology) o;
    return Objects.equals(this.subsets, ioKruiseAppsV1alpha1UnitedDeploymentSpecTopology.subsets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subsets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1UnitedDeploymentSpecTopology {\n");
    
    sb.append("    subsets: ").append(toIndentedString(subsets)).append("\n");
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

