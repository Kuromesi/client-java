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
 * CompletionPolicy indicates the completion policy of the job. Default is Always CompletionPolicyType.
 */
@ApiModel(description = "CompletionPolicy indicates the completion policy of the job. Default is Always CompletionPolicyType.")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1CompletionPolicy {
  @SerializedName("activeDeadlineSeconds")
  private Long activeDeadlineSeconds = null;

  @SerializedName("ttlSecondsAfterFinished")
  private Integer ttlSecondsAfterFinished = null;

  @SerializedName("type")
  private String type = null;

  public KruiseAppsV1alpha1CompletionPolicy activeDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

   /**
   * ActiveDeadlineSeconds specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it; value must be positive integer. Only works for Always type.
   * @return activeDeadlineSeconds
  **/
  @ApiModelProperty(value = "ActiveDeadlineSeconds specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it; value must be positive integer. Only works for Always type.")
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  public KruiseAppsV1alpha1CompletionPolicy ttlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    return this;
  }

   /**
   * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won&#39;t be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes. This field is alpha-level and is only honored by servers that enable the TTLAfterFinished feature. Only works for Always type
   * @return ttlSecondsAfterFinished
  **/
  @ApiModelProperty(value = "ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes. This field is alpha-level and is only honored by servers that enable the TTLAfterFinished feature. Only works for Always type")
  public Integer getTtlSecondsAfterFinished() {
    return ttlSecondsAfterFinished;
  }

  public void setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
  }

  public KruiseAppsV1alpha1CompletionPolicy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type indicates the type of the CompletionPolicy. Default is Always.
   * @return type
  **/
  @ApiModelProperty(value = "Type indicates the type of the CompletionPolicy. Default is Always.")
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
    if (!(o instanceof KruiseAppsV1alpha1CompletionPolicy)) {
      return false;
    }
    KruiseAppsV1alpha1CompletionPolicy ioKruiseAppsV1Alpha1CompletionPolicy = (KruiseAppsV1alpha1CompletionPolicy) o;
    return Objects.equals(this.activeDeadlineSeconds, ioKruiseAppsV1Alpha1CompletionPolicy.activeDeadlineSeconds) &&
        Objects.equals(this.ttlSecondsAfterFinished, ioKruiseAppsV1Alpha1CompletionPolicy.ttlSecondsAfterFinished) &&
        Objects.equals(this.type, ioKruiseAppsV1Alpha1CompletionPolicy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, ttlSecondsAfterFinished, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecCompletionPolicy {\n");
    
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    ttlSecondsAfterFinished: ").append(toIndentedString(ttlSecondsAfterFinished)).append("\n");
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

