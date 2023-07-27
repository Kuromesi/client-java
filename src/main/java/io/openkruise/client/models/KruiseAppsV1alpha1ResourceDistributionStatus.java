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
 * ResourceDistributionStatus defines the observed state of ResourceDistribution. ResourceDistributionStatus is recorded by kruise, users&#39; modification is invalid and meaningless.
 */
@ApiModel(description = "ResourceDistributionStatus defines the observed state of ResourceDistribution. ResourceDistributionStatus is recorded by kruise, users' modification is invalid and meaningless.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1ResourceDistributionStatus {
  @SerializedName("conditions")
  private List<KruiseAppsV1alpha1ResourceDistributionCondition> conditions = null;

  @SerializedName("desired")
  private Integer desired = null;

  @SerializedName("failed")
  private Integer failed = null;

  @SerializedName("observedGeneration")
  private Long observedGeneration = null;

  @SerializedName("succeeded")
  private Integer succeeded = null;

  public KruiseAppsV1alpha1ResourceDistributionStatus conditions(List<KruiseAppsV1alpha1ResourceDistributionCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public KruiseAppsV1alpha1ResourceDistributionStatus addConditionsItem(KruiseAppsV1alpha1ResourceDistributionCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<KruiseAppsV1alpha1ResourceDistributionCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions describe the condition when Resource creating, updating and deleting.
   * @return conditions
  **/
  @ApiModelProperty(value = "Conditions describe the condition when Resource creating, updating and deleting.")
  public List<KruiseAppsV1alpha1ResourceDistributionCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<KruiseAppsV1alpha1ResourceDistributionCondition> conditions) {
    this.conditions = conditions;
  }

  public KruiseAppsV1alpha1ResourceDistributionStatus desired(Integer desired) {
    this.desired = desired;
    return this;
  }

   /**
   * Desired represents the number of total target namespaces.
   * @return desired
  **/
  @ApiModelProperty(value = "Desired represents the number of total target namespaces.")
  public Integer getDesired() {
    return desired;
  }

  public void setDesired(Integer desired) {
    this.desired = desired;
  }

  public KruiseAppsV1alpha1ResourceDistributionStatus failed(Integer failed) {
    this.failed = failed;
    return this;
  }

   /**
   * Failed represents the number of failed distributions.
   * @return failed
  **/
  @ApiModelProperty(value = "Failed represents the number of failed distributions.")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public KruiseAppsV1alpha1ResourceDistributionStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * ObservedGeneration represents the .metadata.generation that the condition was set based upon.
   * @return observedGeneration
  **/
  @ApiModelProperty(value = "ObservedGeneration represents the .metadata.generation that the condition was set based upon.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public KruiseAppsV1alpha1ResourceDistributionStatus succeeded(Integer succeeded) {
    this.succeeded = succeeded;
    return this;
  }

   /**
   * Succeeded represents the number of successful distributions.
   * @return succeeded
  **/
  @ApiModelProperty(value = "Succeeded represents the number of successful distributions.")
  public Integer getSucceeded() {
    return succeeded;
  }

  public void setSucceeded(Integer succeeded) {
    this.succeeded = succeeded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1ResourceDistributionStatus ioKruiseAppsV1alpha1ResourceDistributionStatus = (KruiseAppsV1alpha1ResourceDistributionStatus) o;
    return Objects.equals(this.conditions, ioKruiseAppsV1alpha1ResourceDistributionStatus.conditions) &&
        Objects.equals(this.desired, ioKruiseAppsV1alpha1ResourceDistributionStatus.desired) &&
        Objects.equals(this.failed, ioKruiseAppsV1alpha1ResourceDistributionStatus.failed) &&
        Objects.equals(this.observedGeneration, ioKruiseAppsV1alpha1ResourceDistributionStatus.observedGeneration) &&
        Objects.equals(this.succeeded, ioKruiseAppsV1alpha1ResourceDistributionStatus.succeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, desired, failed, observedGeneration, succeeded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ResourceDistributionStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    desired: ").append(toIndentedString(desired)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
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

