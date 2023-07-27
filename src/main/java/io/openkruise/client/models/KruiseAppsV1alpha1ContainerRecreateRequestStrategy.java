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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Strategy defines strategies for containers recreation.
 */
@ApiModel(description = "Strategy defines strategies for containers recreation.")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1ContainerRecreateRequestStrategy {
  @SerializedName("failurePolicy")
  private String failurePolicy = null;

  @SerializedName("forceRecreate")
  private Boolean forceRecreate = null;

  @SerializedName("minStartedSeconds")
  private Integer minStartedSeconds = null;

  @SerializedName("orderedRecreate")
  private Boolean orderedRecreate = null;

  @SerializedName("terminationGracePeriodSeconds")
  private Long terminationGracePeriodSeconds = null;

  @SerializedName("unreadyGracePeriodSeconds")
  private Long unreadyGracePeriodSeconds = null;

  public KruiseAppsV1alpha1ContainerRecreateRequestStrategy failurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
    return this;
  }

   /**
   * FailurePolicy decides whether to continue if one container fails to recreate
   * @return failurePolicy
  **/
  @ApiModelProperty(value = "FailurePolicy decides whether to continue if one container fails to recreate")
  public String getFailurePolicy() {
    return failurePolicy;
  }

  public void setFailurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestStrategy forceRecreate(Boolean forceRecreate) {
    this.forceRecreate = forceRecreate;
    return this;
  }

   /**
   * ForceRecreate indicates whether to force kill the container even if the previous container is starting.
   * @return forceRecreate
  **/
  @ApiModelProperty(value = "ForceRecreate indicates whether to force kill the container even if the previous container is starting.")
  public Boolean isForceRecreate() {
    return forceRecreate;
  }

  public void setForceRecreate(Boolean forceRecreate) {
    this.forceRecreate = forceRecreate;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestStrategy minStartedSeconds(Integer minStartedSeconds) {
    this.minStartedSeconds = minStartedSeconds;
    return this;
  }

   /**
   * Minimum number of seconds for which a newly created container should be started and ready without any of its container crashing, for it to be considered Succeeded. Defaults to 0 (container will be considered Succeeded as soon as it is started and ready)
   * @return minStartedSeconds
  **/
  @ApiModelProperty(value = "Minimum number of seconds for which a newly created container should be started and ready without any of its container crashing, for it to be considered Succeeded. Defaults to 0 (container will be considered Succeeded as soon as it is started and ready)")
  public Integer getMinStartedSeconds() {
    return minStartedSeconds;
  }

  public void setMinStartedSeconds(Integer minStartedSeconds) {
    this.minStartedSeconds = minStartedSeconds;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestStrategy orderedRecreate(Boolean orderedRecreate) {
    this.orderedRecreate = orderedRecreate;
    return this;
  }

   /**
   * OrderedRecreate indicates whether to recreate the next container only if the previous one has recreated completely.
   * @return orderedRecreate
  **/
  @ApiModelProperty(value = "OrderedRecreate indicates whether to recreate the next container only if the previous one has recreated completely.")
  public Boolean isOrderedRecreate() {
    return orderedRecreate;
  }

  public void setOrderedRecreate(Boolean orderedRecreate) {
    this.orderedRecreate = orderedRecreate;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestStrategy terminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return this;
  }

   /**
   * TerminationGracePeriodSeconds is the optional duration in seconds to wait the container terminating gracefully. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, we will use pod.Spec.TerminationGracePeriodSeconds as default value.
   * @return terminationGracePeriodSeconds
  **/
  @ApiModelProperty(value = "TerminationGracePeriodSeconds is the optional duration in seconds to wait the container terminating gracefully. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, we will use pod.Spec.TerminationGracePeriodSeconds as default value.")
  public Long getTerminationGracePeriodSeconds() {
    return terminationGracePeriodSeconds;
  }

  public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestStrategy unreadyGracePeriodSeconds(Long unreadyGracePeriodSeconds) {
    this.unreadyGracePeriodSeconds = unreadyGracePeriodSeconds;
    return this;
  }

   /**
   * UnreadyGracePeriodSeconds is the optional duration in seconds to mark Pod as not ready over this duration before executing preStop hook and stopping the container.
   * @return unreadyGracePeriodSeconds
  **/
  @ApiModelProperty(value = "UnreadyGracePeriodSeconds is the optional duration in seconds to mark Pod as not ready over this duration before executing preStop hook and stopping the container.")
  public Long getUnreadyGracePeriodSeconds() {
    return unreadyGracePeriodSeconds;
  }

  public void setUnreadyGracePeriodSeconds(Long unreadyGracePeriodSeconds) {
    this.unreadyGracePeriodSeconds = unreadyGracePeriodSeconds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1ContainerRecreateRequestStrategy)) {
      return false;
    }
    KruiseAppsV1alpha1ContainerRecreateRequestStrategy ioKruiseAppsV1alpha1ContainerRecreateRequestSpecStrategy = (KruiseAppsV1alpha1ContainerRecreateRequestStrategy) o;
    return Objects.equals(this.failurePolicy, ioKruiseAppsV1alpha1ContainerRecreateRequestSpecStrategy.failurePolicy) &&
        Objects.equals(this.forceRecreate, ioKruiseAppsV1alpha1ContainerRecreateRequestSpecStrategy.forceRecreate) &&
        Objects.equals(this.minStartedSeconds, ioKruiseAppsV1alpha1ContainerRecreateRequestSpecStrategy.minStartedSeconds) &&
        Objects.equals(this.orderedRecreate, ioKruiseAppsV1alpha1ContainerRecreateRequestSpecStrategy.orderedRecreate) &&
        Objects.equals(this.terminationGracePeriodSeconds, ioKruiseAppsV1alpha1ContainerRecreateRequestSpecStrategy.terminationGracePeriodSeconds) &&
        Objects.equals(this.unreadyGracePeriodSeconds, ioKruiseAppsV1alpha1ContainerRecreateRequestSpecStrategy.unreadyGracePeriodSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failurePolicy, forceRecreate, minStartedSeconds, orderedRecreate, terminationGracePeriodSeconds, unreadyGracePeriodSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ContainerRecreateRequestSpecStrategy {\n");
    
    sb.append("    failurePolicy: ").append(toIndentedString(failurePolicy)).append("\n");
    sb.append("    forceRecreate: ").append(toIndentedString(forceRecreate)).append("\n");
    sb.append("    minStartedSeconds: ").append(toIndentedString(minStartedSeconds)).append("\n");
    sb.append("    orderedRecreate: ").append(toIndentedString(orderedRecreate)).append("\n");
    sb.append("    terminationGracePeriodSeconds: ").append(toIndentedString(terminationGracePeriodSeconds)).append("\n");
    sb.append("    unreadyGracePeriodSeconds: ").append(toIndentedString(unreadyGracePeriodSeconds)).append("\n");
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

