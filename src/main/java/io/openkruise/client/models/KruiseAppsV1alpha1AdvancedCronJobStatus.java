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
import io.openkruise.client.models.KruiseAppsV1alpha1AdvancedCronJobStatusActive;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * AdvancedCronJobStatus defines the observed state of AdvancedCronJob
 */
@ApiModel(description = "AdvancedCronJobStatus defines the observed state of AdvancedCronJob")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1AdvancedCronJobStatus {
  @SerializedName("active")
  private List<KruiseAppsV1alpha1AdvancedCronJobStatusActive> active = null;

  @SerializedName("lastScheduleTime")
  private DateTime lastScheduleTime = null;

  @SerializedName("type")
  private String type = null;

  public KruiseAppsV1alpha1AdvancedCronJobStatus active(List<KruiseAppsV1alpha1AdvancedCronJobStatusActive> active) {
    this.active = active;
    return this;
  }

  public KruiseAppsV1alpha1AdvancedCronJobStatus addActiveItem(KruiseAppsV1alpha1AdvancedCronJobStatusActive activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<KruiseAppsV1alpha1AdvancedCronJobStatusActive>();
    }
    this.active.add(activeItem);
    return this;
  }

   /**
   * A list of pointers to currently running jobs.
   * @return active
  **/
  @ApiModelProperty(value = "A list of pointers to currently running jobs.")
  public List<KruiseAppsV1alpha1AdvancedCronJobStatusActive> getActive() {
    return active;
  }

  public void setActive(List<KruiseAppsV1alpha1AdvancedCronJobStatusActive> active) {
    this.active = active;
  }

  public KruiseAppsV1alpha1AdvancedCronJobStatus lastScheduleTime(DateTime lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
    return this;
  }

   /**
   * Information when was the last time the job was successfully scheduled.
   * @return lastScheduleTime
  **/
  @ApiModelProperty(value = "Information when was the last time the job was successfully scheduled.")
  public DateTime getLastScheduleTime() {
    return lastScheduleTime;
  }

  public void setLastScheduleTime(DateTime lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
  }

  public KruiseAppsV1alpha1AdvancedCronJobStatus type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
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
    KruiseAppsV1alpha1AdvancedCronJobStatus ioKruiseAppsV1alpha1AdvancedCronJobStatus = (KruiseAppsV1alpha1AdvancedCronJobStatus) o;
    return Objects.equals(this.active, ioKruiseAppsV1alpha1AdvancedCronJobStatus.active) &&
        Objects.equals(this.lastScheduleTime, ioKruiseAppsV1alpha1AdvancedCronJobStatus.lastScheduleTime) &&
        Objects.equals(this.type, ioKruiseAppsV1alpha1AdvancedCronJobStatus.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, lastScheduleTime, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1AdvancedCronJobStatus {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastScheduleTime: ").append(toIndentedString(lastScheduleTime)).append("\n");
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

