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
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.proto.Runtime;
import io.openkruise.client.models.KruiseAppsV1alpha1UnitedDeploymentSpecTopologyTolerations;
import io.openkruise.client.models.KruiseAppsV1alpha1WorkloadSpreadSpecPreferredNodeSelectorTerms;
import io.openkruise.client.models.KruiseAppsV1alpha1WorkloadSpreadSpecRequiredNodeSelectorTerm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkloadSpreadSubset defines the details of a subset.
 */
@ApiModel(description = "WorkloadSpreadSubset defines the details of a subset.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1WorkloadSpreadSpecSubsets {
  @SerializedName("maxReplicas")
  private IntOrString maxReplicas = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("patch")
  private Runtime.RawExtension patch = null;

  @SerializedName("preferredNodeSelectorTerms")
  private List<KruiseAppsV1alpha1WorkloadSpreadSpecPreferredNodeSelectorTerms> preferredNodeSelectorTerms = null;

  @SerializedName("requiredNodeSelectorTerm")
  private KruiseAppsV1alpha1WorkloadSpreadSpecRequiredNodeSelectorTerm requiredNodeSelectorTerm = null;

  @SerializedName("tolerations")
  private List<KruiseAppsV1alpha1UnitedDeploymentSpecTopologyTolerations> tolerations = null;

  public KruiseAppsV1alpha1WorkloadSpreadSpecSubsets maxReplicas(IntOrString maxReplicas) {
    this.maxReplicas = maxReplicas;
    return this;
  }

   /**
   * MaxReplicas indicates the desired max replicas of this subset.
   * @return maxReplicas
  **/
  @ApiModelProperty(value = "MaxReplicas indicates the desired max replicas of this subset.")
  public IntOrString getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(IntOrString maxReplicas) {
    this.maxReplicas = maxReplicas;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSpecSubsets name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name should be unique between all of the subsets under one WorkloadSpread.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name should be unique between all of the subsets under one WorkloadSpread.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSpecSubsets patch(Runtime.RawExtension patch) {
    this.patch = patch;
    return this;
  }

   /**
   * Patch indicates patching podTemplate to the Pod.
   * @return patch
  **/
  @ApiModelProperty(value = "Patch indicates patching podTemplate to the Pod.")
  public Runtime.RawExtension getPatch() {
    return patch;
  }

  public void setPatch(Runtime.RawExtension patch) {
    this.patch = patch;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSpecSubsets preferredNodeSelectorTerms(List<KruiseAppsV1alpha1WorkloadSpreadSpecPreferredNodeSelectorTerms> preferredNodeSelectorTerms) {
    this.preferredNodeSelectorTerms = preferredNodeSelectorTerms;
    return this;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSpecSubsets addPreferredNodeSelectorTermsItem(KruiseAppsV1alpha1WorkloadSpreadSpecPreferredNodeSelectorTerms preferredNodeSelectorTermsItem) {
    if (this.preferredNodeSelectorTerms == null) {
      this.preferredNodeSelectorTerms = new ArrayList<KruiseAppsV1alpha1WorkloadSpreadSpecPreferredNodeSelectorTerms>();
    }
    this.preferredNodeSelectorTerms.add(preferredNodeSelectorTermsItem);
    return this;
  }

   /**
   * Indicates the node preferred selector to form the subset.
   * @return preferredNodeSelectorTerms
  **/
  @ApiModelProperty(value = "Indicates the node preferred selector to form the subset.")
  public List<KruiseAppsV1alpha1WorkloadSpreadSpecPreferredNodeSelectorTerms> getPreferredNodeSelectorTerms() {
    return preferredNodeSelectorTerms;
  }

  public void setPreferredNodeSelectorTerms(List<KruiseAppsV1alpha1WorkloadSpreadSpecPreferredNodeSelectorTerms> preferredNodeSelectorTerms) {
    this.preferredNodeSelectorTerms = preferredNodeSelectorTerms;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSpecSubsets requiredNodeSelectorTerm(KruiseAppsV1alpha1WorkloadSpreadSpecRequiredNodeSelectorTerm requiredNodeSelectorTerm) {
    this.requiredNodeSelectorTerm = requiredNodeSelectorTerm;
    return this;
  }

   /**
   * Get requiredNodeSelectorTerm
   * @return requiredNodeSelectorTerm
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsV1alpha1WorkloadSpreadSpecRequiredNodeSelectorTerm getRequiredNodeSelectorTerm() {
    return requiredNodeSelectorTerm;
  }

  public void setRequiredNodeSelectorTerm(KruiseAppsV1alpha1WorkloadSpreadSpecRequiredNodeSelectorTerm requiredNodeSelectorTerm) {
    this.requiredNodeSelectorTerm = requiredNodeSelectorTerm;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSpecSubsets tolerations(List<KruiseAppsV1alpha1UnitedDeploymentSpecTopologyTolerations> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public KruiseAppsV1alpha1WorkloadSpreadSpecSubsets addTolerationsItem(KruiseAppsV1alpha1UnitedDeploymentSpecTopologyTolerations tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<KruiseAppsV1alpha1UnitedDeploymentSpecTopologyTolerations>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * Indicates the tolerations the pods under this subset have.
   * @return tolerations
  **/
  @ApiModelProperty(value = "Indicates the tolerations the pods under this subset have.")
  public List<KruiseAppsV1alpha1UnitedDeploymentSpecTopologyTolerations> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<KruiseAppsV1alpha1UnitedDeploymentSpecTopologyTolerations> tolerations) {
    this.tolerations = tolerations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1WorkloadSpreadSpecSubsets ioKruiseAppsV1alpha1WorkloadSpreadSpecSubsets = (KruiseAppsV1alpha1WorkloadSpreadSpecSubsets) o;
    return Objects.equals(this.maxReplicas, ioKruiseAppsV1alpha1WorkloadSpreadSpecSubsets.maxReplicas) &&
        Objects.equals(this.name, ioKruiseAppsV1alpha1WorkloadSpreadSpecSubsets.name) &&
        Objects.equals(this.patch, ioKruiseAppsV1alpha1WorkloadSpreadSpecSubsets.patch) &&
        Objects.equals(this.preferredNodeSelectorTerms, ioKruiseAppsV1alpha1WorkloadSpreadSpecSubsets.preferredNodeSelectorTerms) &&
        Objects.equals(this.requiredNodeSelectorTerm, ioKruiseAppsV1alpha1WorkloadSpreadSpecSubsets.requiredNodeSelectorTerm) &&
        Objects.equals(this.tolerations, ioKruiseAppsV1alpha1WorkloadSpreadSpecSubsets.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxReplicas, name, patch, preferredNodeSelectorTerms, requiredNodeSelectorTerm, tolerations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1WorkloadSpreadSpecSubsets {\n");
    
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    preferredNodeSelectorTerms: ").append(toIndentedString(preferredNodeSelectorTerms)).append("\n");
    sb.append("    requiredNodeSelectorTerm: ").append(toIndentedString(requiredNodeSelectorTerm)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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
