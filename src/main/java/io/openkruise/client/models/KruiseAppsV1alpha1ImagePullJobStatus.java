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
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * ImagePullJobStatus defines the observed state of ImagePullJob
 */
@ApiModel(description = "ImagePullJobStatus defines the observed state of ImagePullJob")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1ImagePullJobStatus {
  @SerializedName("active")
  private Integer active = null;

  @SerializedName("completionTime")
  private DateTime completionTime = null;

  @SerializedName("desired")
  private Integer desired = null;

  @SerializedName("failed")
  private Integer failed = null;

  @SerializedName("failedNodes")
  private List<String> failedNodes = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("succeeded")
  private Integer succeeded = null;

  public KruiseAppsV1alpha1ImagePullJobStatus active(Integer active) {
    this.active = active;
    return this;
  }

   /**
   * The number of actively running pulling tasks.
   * @return active
  **/
  @ApiModelProperty(value = "The number of actively running pulling tasks.")
  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }

  public KruiseAppsV1alpha1ImagePullJobStatus completionTime(DateTime completionTime) {
    this.completionTime = completionTime;
    return this;
  }

   /**
   * Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
   * @return completionTime
  **/
  @ApiModelProperty(value = "Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
  public DateTime getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(DateTime completionTime) {
    this.completionTime = completionTime;
  }

  public KruiseAppsV1alpha1ImagePullJobStatus desired(Integer desired) {
    this.desired = desired;
    return this;
  }

   /**
   * The desired number of pulling tasks, this is typically equal to the number of nodes satisfied.
   * @return desired
  **/
  @ApiModelProperty(required = true, value = "The desired number of pulling tasks, this is typically equal to the number of nodes satisfied.")
  public Integer getDesired() {
    return desired;
  }

  public void setDesired(Integer desired) {
    this.desired = desired;
  }

  public KruiseAppsV1alpha1ImagePullJobStatus failed(Integer failed) {
    this.failed = failed;
    return this;
  }

   /**
   * The number of pulling tasks  which reached phase Failed.
   * @return failed
  **/
  @ApiModelProperty(value = "The number of pulling tasks  which reached phase Failed.")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public KruiseAppsV1alpha1ImagePullJobStatus failedNodes(List<String> failedNodes) {
    this.failedNodes = failedNodes;
    return this;
  }

  public KruiseAppsV1alpha1ImagePullJobStatus addFailedNodesItem(String failedNodesItem) {
    if (this.failedNodes == null) {
      this.failedNodes = new ArrayList<String>();
    }
    this.failedNodes.add(failedNodesItem);
    return this;
  }

   /**
   * The nodes that failed to pull the image.
   * @return failedNodes
  **/
  @ApiModelProperty(value = "The nodes that failed to pull the image.")
  public List<String> getFailedNodes() {
    return failedNodes;
  }

  public void setFailedNodes(List<String> failedNodes) {
    this.failedNodes = failedNodes;
  }

  public KruiseAppsV1alpha1ImagePullJobStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The text prompt for job running status.
   * @return message
  **/
  @ApiModelProperty(value = "The text prompt for job running status.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public KruiseAppsV1alpha1ImagePullJobStatus startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
   * @return startTime
  **/
  @ApiModelProperty(value = "Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public KruiseAppsV1alpha1ImagePullJobStatus succeeded(Integer succeeded) {
    this.succeeded = succeeded;
    return this;
  }

   /**
   * The number of pulling tasks which reached phase Succeeded.
   * @return succeeded
  **/
  @ApiModelProperty(value = "The number of pulling tasks which reached phase Succeeded.")
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
    KruiseAppsV1alpha1ImagePullJobStatus ioKruiseAppsV1alpha1ImagePullJobStatus = (KruiseAppsV1alpha1ImagePullJobStatus) o;
    return Objects.equals(this.active, ioKruiseAppsV1alpha1ImagePullJobStatus.active) &&
        Objects.equals(this.completionTime, ioKruiseAppsV1alpha1ImagePullJobStatus.completionTime) &&
        Objects.equals(this.desired, ioKruiseAppsV1alpha1ImagePullJobStatus.desired) &&
        Objects.equals(this.failed, ioKruiseAppsV1alpha1ImagePullJobStatus.failed) &&
        Objects.equals(this.failedNodes, ioKruiseAppsV1alpha1ImagePullJobStatus.failedNodes) &&
        Objects.equals(this.message, ioKruiseAppsV1alpha1ImagePullJobStatus.message) &&
        Objects.equals(this.startTime, ioKruiseAppsV1alpha1ImagePullJobStatus.startTime) &&
        Objects.equals(this.succeeded, ioKruiseAppsV1alpha1ImagePullJobStatus.succeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, completionTime, desired, failed, failedNodes, message, startTime, succeeded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ImagePullJobStatus {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    desired: ").append(toIndentedString(desired)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    failedNodes: ").append(toIndentedString(failedNodes)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

