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

/**
 * PullPolicy is an optional field to set parameters of the pulling task. If not specified, the system will use the default values.
 */
@ApiModel(description = "PullPolicy is an optional field to set parameters of the pulling task. If not specified, the system will use the default values.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1ImageTagPullPolicy {
  @SerializedName("activeDeadlineSeconds")
  private Long activeDeadlineSeconds = null;

  @SerializedName("backoffLimit")
  private Integer backoffLimit = null;

  @SerializedName("timeoutSeconds")
  private Integer timeoutSeconds = null;

  @SerializedName("ttlSecondsAfterFinished")
  private Integer ttlSecondsAfterFinished = null;

  public KruiseAppsV1alpha1ImageTagPullPolicy activeDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

   /**
   * ActiveDeadlineSeconds specifies the duration in seconds relative to the startTime that the task may be active before the system tries to terminate it; value must be positive integer. if not specified, the system will never terminate it.
   * @return activeDeadlineSeconds
  **/
  @ApiModelProperty(value = "ActiveDeadlineSeconds specifies the duration in seconds relative to the startTime that the task may be active before the system tries to terminate it; value must be positive integer. if not specified, the system will never terminate it.")
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  public KruiseAppsV1alpha1ImageTagPullPolicy backoffLimit(Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
    return this;
  }

   /**
   * Specifies the number of retries before marking the pulling task failed. Defaults to 3
   * @return backoffLimit
  **/
  @ApiModelProperty(value = "Specifies the number of retries before marking the pulling task failed. Defaults to 3")
  public Integer getBackoffLimit() {
    return backoffLimit;
  }

  public void setBackoffLimit(Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
  }

  public KruiseAppsV1alpha1ImageTagPullPolicy timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * Specifies the timeout of the pulling task. Defaults to 600
   * @return timeoutSeconds
  **/
  @ApiModelProperty(value = "Specifies the timeout of the pulling task. Defaults to 600")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  public KruiseAppsV1alpha1ImageTagPullPolicy ttlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    return this;
  }

   /**
   * TTLSecondsAfterFinished limits the lifetime of a pulling task that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the task finishes, it is eligible to be automatically deleted. If this field is unset, the task won&#39;t be automatically deleted. If this field is set to zero, the task becomes eligible to be deleted immediately after it finishes.
   * @return ttlSecondsAfterFinished
  **/
  @ApiModelProperty(value = "TTLSecondsAfterFinished limits the lifetime of a pulling task that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the task finishes, it is eligible to be automatically deleted. If this field is unset, the task won't be automatically deleted. If this field is set to zero, the task becomes eligible to be deleted immediately after it finishes.")
  public Integer getTtlSecondsAfterFinished() {
    return ttlSecondsAfterFinished;
  }

  public void setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1ImageTagPullPolicy ioKruiseAppsV1alpha1NodeImageSpecPullPolicy = (KruiseAppsV1alpha1ImageTagPullPolicy) o;
    return Objects.equals(this.activeDeadlineSeconds, ioKruiseAppsV1alpha1NodeImageSpecPullPolicy.activeDeadlineSeconds) &&
        Objects.equals(this.backoffLimit, ioKruiseAppsV1alpha1NodeImageSpecPullPolicy.backoffLimit) &&
        Objects.equals(this.timeoutSeconds, ioKruiseAppsV1alpha1NodeImageSpecPullPolicy.timeoutSeconds) &&
        Objects.equals(this.ttlSecondsAfterFinished, ioKruiseAppsV1alpha1NodeImageSpecPullPolicy.ttlSecondsAfterFinished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, backoffLimit, timeoutSeconds, ttlSecondsAfterFinished);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1NodeImageSpecPullPolicy {\n");
    
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    backoffLimit: ").append(toIndentedString(backoffLimit)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    ttlSecondsAfterFinished: ").append(toIndentedString(ttlSecondsAfterFinished)).append("\n");
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

