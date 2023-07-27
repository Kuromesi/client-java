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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * JobCondition describes current state of a job.
 */
@ApiModel(description = "JobCondition describes current state of a job.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1BroadcastJobStatusConditions {
  @SerializedName("lastProbeTime")
  private DateTime lastProbeTime = null;

  @SerializedName("lastTransitionTime")
  private DateTime lastTransitionTime = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("type")
  private String type = null;

  public KruiseAppsV1alpha1BroadcastJobStatusConditions lastProbeTime(DateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
    return this;
  }

   /**
   * Last time the condition was checked.
   * @return lastProbeTime
  **/
  @ApiModelProperty(value = "Last time the condition was checked.")
  public DateTime getLastProbeTime() {
    return lastProbeTime;
  }

  public void setLastProbeTime(DateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
  }

  public KruiseAppsV1alpha1BroadcastJobStatusConditions lastTransitionTime(DateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Last time the condition transit from one status to another.
   * @return lastTransitionTime
  **/
  @ApiModelProperty(value = "Last time the condition transit from one status to another.")
  public DateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(DateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public KruiseAppsV1alpha1BroadcastJobStatusConditions message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Human readable message indicating details about last transition.
   * @return message
  **/
  @ApiModelProperty(value = "Human readable message indicating details about last transition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public KruiseAppsV1alpha1BroadcastJobStatusConditions reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * (brief) reason for the condition&#39;s last transition.
   * @return reason
  **/
  @ApiModelProperty(value = "(brief) reason for the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public KruiseAppsV1alpha1BroadcastJobStatusConditions status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the condition, one of True, False, Unknown.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of the condition, one of True, False, Unknown.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public KruiseAppsV1alpha1BroadcastJobStatusConditions type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of job condition, Complete or Failed.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of job condition, Complete or Failed.")
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
    KruiseAppsV1alpha1BroadcastJobStatusConditions ioKruiseAppsV1alpha1BroadcastJobStatusConditions = (KruiseAppsV1alpha1BroadcastJobStatusConditions) o;
    return Objects.equals(this.lastProbeTime, ioKruiseAppsV1alpha1BroadcastJobStatusConditions.lastProbeTime) &&
        Objects.equals(this.lastTransitionTime, ioKruiseAppsV1alpha1BroadcastJobStatusConditions.lastTransitionTime) &&
        Objects.equals(this.message, ioKruiseAppsV1alpha1BroadcastJobStatusConditions.message) &&
        Objects.equals(this.reason, ioKruiseAppsV1alpha1BroadcastJobStatusConditions.reason) &&
        Objects.equals(this.status, ioKruiseAppsV1alpha1BroadcastJobStatusConditions.status) &&
        Objects.equals(this.type, ioKruiseAppsV1alpha1BroadcastJobStatusConditions.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProbeTime, lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1BroadcastJobStatusConditions {\n");
    
    sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
