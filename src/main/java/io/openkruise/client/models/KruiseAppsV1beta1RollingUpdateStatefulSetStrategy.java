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
import io.kubernetes.client.custom.IntOrString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
 */
@ApiModel(description = "RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1beta1RollingUpdateStatefulSetStrategy {
  @SerializedName("inPlaceUpdateStrategy")
  private KruiseAppsPubInPlaceUpdateStrategy inPlaceUpdateStrategy = null;

  @SerializedName("maxUnavailable")
  private IntOrString maxUnavailable = null;

  @SerializedName("minReadySeconds")
  private Integer minReadySeconds = null;

  @SerializedName("partition")
  private Integer partition = null;

  @SerializedName("paused")
  private Boolean paused = null;

  @SerializedName("podUpdatePolicy")
  private String podUpdatePolicy = null;

  @SerializedName("unorderedUpdate")
  private KruiseAppsV1beta1UnorderedUpdateStrategy unorderedUpdate = null;

  public KruiseAppsV1beta1RollingUpdateStatefulSetStrategy inPlaceUpdateStrategy(KruiseAppsPubInPlaceUpdateStrategy inPlaceUpdateStrategy) {
    this.inPlaceUpdateStrategy = inPlaceUpdateStrategy;
    return this;
  }

   /**
   * Get inPlaceUpdateStrategy
   * @return inPlaceUpdateStrategy
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsPubInPlaceUpdateStrategy getInPlaceUpdateStrategy() {
    return inPlaceUpdateStrategy;
  }

  public void setInPlaceUpdateStrategy(KruiseAppsPubInPlaceUpdateStrategy inPlaceUpdateStrategy) {
    this.inPlaceUpdateStrategy = inPlaceUpdateStrategy;
  }

  public KruiseAppsV1beta1RollingUpdateStatefulSetStrategy maxUnavailable(IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return this;
  }

   /**
   * The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. Also, maxUnavailable can just be allowed to work with Parallel podManagementPolicy. Defaults to 1.
   * @return maxUnavailable
  **/
  @ApiModelProperty(value = "The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. Also, maxUnavailable can just be allowed to work with Parallel podManagementPolicy. Defaults to 1.")
  public IntOrString getMaxUnavailable() {
    return maxUnavailable;
  }

  public void setMaxUnavailable(IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
  }

  public KruiseAppsV1beta1RollingUpdateStatefulSetStrategy minReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

   /**
   * MinReadySeconds indicates how long will the pod be considered ready after it&#39;s updated. MinReadySeconds works with both OrderedReady and Parallel podManagementPolicy. It affects the pod scale up speed when the podManagementPolicy is set to be OrderedReady. Combined with MaxUnavailable, it affects the pod update speed regardless of podManagementPolicy. Default value is 0, max is 300.
   * @return minReadySeconds
  **/
  @ApiModelProperty(value = "MinReadySeconds indicates how long will the pod be considered ready after it's updated. MinReadySeconds works with both OrderedReady and Parallel podManagementPolicy. It affects the pod scale up speed when the podManagementPolicy is set to be OrderedReady. Combined with MaxUnavailable, it affects the pod update speed regardless of podManagementPolicy. Default value is 0, max is 300.")
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }

  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }

  public KruiseAppsV1beta1RollingUpdateStatefulSetStrategy partition(Integer partition) {
    this.partition = partition;
    return this;
  }

   /**
   * Partition indicates the ordinal at which the StatefulSet should be partitioned by default. But if unorderedUpdate has been set:   - Partition indicates the number of pods with non-updated revisions when rolling update.   - It means controller will update $(replicas - partition) number of pod. Default value is 0.
   * @return partition
  **/
  @ApiModelProperty(value = "Partition indicates the ordinal at which the StatefulSet should be partitioned by default. But if unorderedUpdate has been set:   - Partition indicates the number of pods with non-updated revisions when rolling update.   - It means controller will update $(replicas - partition) number of pod. Default value is 0.")
  public Integer getPartition() {
    return partition;
  }

  public void setPartition(Integer partition) {
    this.partition = partition;
  }

  public KruiseAppsV1beta1RollingUpdateStatefulSetStrategy paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Paused indicates that the StatefulSet is paused. Default value is false
   * @return paused
  **/
  @ApiModelProperty(value = "Paused indicates that the StatefulSet is paused. Default value is false")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public KruiseAppsV1beta1RollingUpdateStatefulSetStrategy podUpdatePolicy(String podUpdatePolicy) {
    this.podUpdatePolicy = podUpdatePolicy;
    return this;
  }

   /**
   * PodUpdatePolicy indicates how pods should be updated Default value is \&quot;ReCreate\&quot;
   * @return podUpdatePolicy
  **/
  @ApiModelProperty(value = "PodUpdatePolicy indicates how pods should be updated Default value is \"ReCreate\"")
  public String getPodUpdatePolicy() {
    return podUpdatePolicy;
  }

  public void setPodUpdatePolicy(String podUpdatePolicy) {
    this.podUpdatePolicy = podUpdatePolicy;
  }

  public KruiseAppsV1beta1RollingUpdateStatefulSetStrategy unorderedUpdate(KruiseAppsV1beta1UnorderedUpdateStrategy unorderedUpdate) {
    this.unorderedUpdate = unorderedUpdate;
    return this;
  }

   /**
   * Get unorderedUpdate
   * @return unorderedUpdate
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsV1beta1UnorderedUpdateStrategy getUnorderedUpdate() {
    return unorderedUpdate;
  }

  public void setUnorderedUpdate(KruiseAppsV1beta1UnorderedUpdateStrategy unorderedUpdate) {
    this.unorderedUpdate = unorderedUpdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1beta1RollingUpdateStatefulSetStrategy)) {
      return false;
    }
    KruiseAppsV1beta1RollingUpdateStatefulSetStrategy ioKruiseAppsV1alpha1StatefulSetSpecUpdateStrategyRollingUpdate = (KruiseAppsV1beta1RollingUpdateStatefulSetStrategy) o;
    return Objects.equals(this.inPlaceUpdateStrategy, ioKruiseAppsV1alpha1StatefulSetSpecUpdateStrategyRollingUpdate.inPlaceUpdateStrategy) &&
        Objects.equals(this.maxUnavailable, ioKruiseAppsV1alpha1StatefulSetSpecUpdateStrategyRollingUpdate.maxUnavailable) &&
        Objects.equals(this.minReadySeconds, ioKruiseAppsV1alpha1StatefulSetSpecUpdateStrategyRollingUpdate.minReadySeconds) &&
        Objects.equals(this.partition, ioKruiseAppsV1alpha1StatefulSetSpecUpdateStrategyRollingUpdate.partition) &&
        Objects.equals(this.paused, ioKruiseAppsV1alpha1StatefulSetSpecUpdateStrategyRollingUpdate.paused) &&
        Objects.equals(this.podUpdatePolicy, ioKruiseAppsV1alpha1StatefulSetSpecUpdateStrategyRollingUpdate.podUpdatePolicy) &&
        Objects.equals(this.unorderedUpdate, ioKruiseAppsV1alpha1StatefulSetSpecUpdateStrategyRollingUpdate.unorderedUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inPlaceUpdateStrategy, maxUnavailable, minReadySeconds, partition, paused, podUpdatePolicy, unorderedUpdate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1StatefulSetSpecUpdateStrategyRollingUpdate {\n");
    
    sb.append("    inPlaceUpdateStrategy: ").append(toIndentedString(inPlaceUpdateStrategy)).append("\n");
    sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    podUpdatePolicy: ").append(toIndentedString(podUpdatePolicy)).append("\n");
    sb.append("    unorderedUpdate: ").append(toIndentedString(unorderedUpdate)).append("\n");
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
