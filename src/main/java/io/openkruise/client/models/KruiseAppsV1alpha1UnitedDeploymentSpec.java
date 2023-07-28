/*
* Kruise
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

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * UnitedDeploymentSpec defines the desired state of UnitedDeployment.
 */
@ApiModel(description = "UnitedDeploymentSpec defines the desired state of UnitedDeployment.")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1UnitedDeploymentSpec {
  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("revisionHistoryLimit")
  private Integer revisionHistoryLimit = null;

  @SerializedName("selector")
  private V1LabelSelector selector = null;

  @SerializedName("template")
  private KruiseAppsV1alpha1SubsetTemplate template = null;

  @SerializedName("topology")
  private KruiseAppsV1alpha1Topology topology = null;

  @SerializedName("updateStrategy")
  private KruiseAppsV1alpha1UnitedDeploymentUpdateStrategy updateStrategy = null;

  public KruiseAppsV1alpha1UnitedDeploymentSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the total desired replicas of all the subsets. If unspecified, defaults to 1.
   * @return replicas
  **/
  @ApiModelProperty(value = "Replicas is the total desired replicas of all the subsets. If unspecified, defaults to 1.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public KruiseAppsV1alpha1UnitedDeploymentSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

   /**
   * Indicates the number of histories to be conserved. If unspecified, defaults to 10.
   * @return revisionHistoryLimit
  **/
  @ApiModelProperty(value = "Indicates the number of histories to be conserved. If unspecified, defaults to 10.")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public KruiseAppsV1alpha1UnitedDeploymentSpec selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @ApiModelProperty(required = true, value = "")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public KruiseAppsV1alpha1UnitedDeploymentSpec template(KruiseAppsV1alpha1SubsetTemplate template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsV1alpha1SubsetTemplate getTemplate() {
    return template;
  }

  public void setTemplate(KruiseAppsV1alpha1SubsetTemplate template) {
    this.template = template;
  }

  public KruiseAppsV1alpha1UnitedDeploymentSpec topology(KruiseAppsV1alpha1Topology topology) {
    this.topology = topology;
    return this;
  }

   /**
   * Get topology
   * @return topology
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsV1alpha1Topology getTopology() {
    return topology;
  }

  public void setTopology(KruiseAppsV1alpha1Topology topology) {
    this.topology = topology;
  }

  public KruiseAppsV1alpha1UnitedDeploymentSpec updateStrategy(KruiseAppsV1alpha1UnitedDeploymentUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
    return this;
  }

   /**
   * Get updateStrategy
   * @return updateStrategy
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsV1alpha1UnitedDeploymentUpdateStrategy getUpdateStrategy() {
    return updateStrategy;
  }

  public void setUpdateStrategy(KruiseAppsV1alpha1UnitedDeploymentUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1UnitedDeploymentSpec)) {
      return false;
    }
    KruiseAppsV1alpha1UnitedDeploymentSpec ioKruiseAppsV1alpha1UnitedDeploymentSpec = (KruiseAppsV1alpha1UnitedDeploymentSpec) o;
    return Objects.equals(this.replicas, ioKruiseAppsV1alpha1UnitedDeploymentSpec.replicas) &&
        Objects.equals(this.revisionHistoryLimit, ioKruiseAppsV1alpha1UnitedDeploymentSpec.revisionHistoryLimit) &&
        Objects.equals(this.selector, ioKruiseAppsV1alpha1UnitedDeploymentSpec.selector) &&
        Objects.equals(this.template, ioKruiseAppsV1alpha1UnitedDeploymentSpec.template) &&
        Objects.equals(this.topology, ioKruiseAppsV1alpha1UnitedDeploymentSpec.topology) &&
        Objects.equals(this.updateStrategy, ioKruiseAppsV1alpha1UnitedDeploymentSpec.updateStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicas, revisionHistoryLimit, selector, template, topology, updateStrategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1UnitedDeploymentSpec {\n");
    
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
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

