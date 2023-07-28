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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import org.joda.time.DateTime;

/**
 * BroadcastJobStatus defines the observed state of BroadcastJob
 */
@ApiModel(description = "BroadcastJobStatus defines the observed state of BroadcastJob")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1BroadcastJobStatus {
  @SerializedName("active")
  private Integer active = null;

  @SerializedName("completionTime")
  private DateTime completionTime = null;

  @SerializedName("conditions")
  private List<KruiseAppsV1alpha1JobCondition> conditions = null;

  @SerializedName("desired")
  private Integer desired = null;

  @SerializedName("failed")
  private Integer failed = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("succeeded")
  private Integer succeeded = null;

  public KruiseAppsV1alpha1BroadcastJobStatus active(Integer active) {
    this.active = active;
    return this;
  }

   /**
   * The number of actively running pods.
   * @return active
  **/
  @ApiModelProperty(value = "The number of actively running pods.")
  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }

  public KruiseAppsV1alpha1BroadcastJobStatus completionTime(DateTime completionTime) {
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

  public KruiseAppsV1alpha1BroadcastJobStatus conditions(List<KruiseAppsV1alpha1JobCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public KruiseAppsV1alpha1BroadcastJobStatus addConditionsItem(KruiseAppsV1alpha1JobCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<KruiseAppsV1alpha1JobCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The latest available observations of an object&#39;s current state.
   * @return conditions
  **/
  @ApiModelProperty(value = "The latest available observations of an object's current state.")
  public List<KruiseAppsV1alpha1JobCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<KruiseAppsV1alpha1JobCondition> conditions) {
    this.conditions = conditions;
  }

  public KruiseAppsV1alpha1BroadcastJobStatus desired(Integer desired) {
    this.desired = desired;
    return this;
  }

   /**
   * The desired number of pods, this is typically equal to the number of nodes satisfied to run pods.
   * @return desired
  **/
  @ApiModelProperty(value = "The desired number of pods, this is typically equal to the number of nodes satisfied to run pods.")
  public Integer getDesired() {
    return desired;
  }

  public void setDesired(Integer desired) {
    this.desired = desired;
  }

  public KruiseAppsV1alpha1BroadcastJobStatus failed(Integer failed) {
    this.failed = failed;
    return this;
  }

   /**
   * The number of pods which reached phase Failed.
   * @return failed
  **/
  @ApiModelProperty(value = "The number of pods which reached phase Failed.")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public KruiseAppsV1alpha1BroadcastJobStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * The phase of the job.
   * @return phase
  **/
  @ApiModelProperty(value = "The phase of the job.")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public KruiseAppsV1alpha1BroadcastJobStatus startTime(DateTime startTime) {
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

  public KruiseAppsV1alpha1BroadcastJobStatus succeeded(Integer succeeded) {
    this.succeeded = succeeded;
    return this;
  }

   /**
   * The number of pods which reached phase Succeeded.
   * @return succeeded
  **/
  @ApiModelProperty(value = "The number of pods which reached phase Succeeded.")
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
    if (!(o instanceof KruiseAppsV1alpha1BroadcastJobStatus)) {
      return false;
    }
    KruiseAppsV1alpha1BroadcastJobStatus ioKruiseAppsV1alpha1BroadcastJobStatus = (KruiseAppsV1alpha1BroadcastJobStatus) o;
    return Objects.equals(this.active, ioKruiseAppsV1alpha1BroadcastJobStatus.active) &&
        Objects.equals(this.completionTime, ioKruiseAppsV1alpha1BroadcastJobStatus.completionTime) &&
        Objects.equals(this.conditions, ioKruiseAppsV1alpha1BroadcastJobStatus.conditions) &&
        Objects.equals(this.desired, ioKruiseAppsV1alpha1BroadcastJobStatus.desired) &&
        Objects.equals(this.failed, ioKruiseAppsV1alpha1BroadcastJobStatus.failed) &&
        Objects.equals(this.phase, ioKruiseAppsV1alpha1BroadcastJobStatus.phase) &&
        Objects.equals(this.startTime, ioKruiseAppsV1alpha1BroadcastJobStatus.startTime) &&
        Objects.equals(this.succeeded, ioKruiseAppsV1alpha1BroadcastJobStatus.succeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, completionTime, conditions, desired, failed, phase, startTime, succeeded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1BroadcastJobStatus {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    desired: ").append(toIndentedString(desired)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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

