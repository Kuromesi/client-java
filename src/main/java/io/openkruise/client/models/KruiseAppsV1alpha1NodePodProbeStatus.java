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
import io.openkruise.client.models.KruiseAppsV1alpha1NodePodProbeStatusPodProbeStatuses;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * KruiseAppsV1alpha1NodePodProbeStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1NodePodProbeStatus {
  @SerializedName("podProbeStatuses")
  private List<KruiseAppsV1alpha1NodePodProbeStatusPodProbeStatuses> podProbeStatuses = null;

  public KruiseAppsV1alpha1NodePodProbeStatus podProbeStatuses(List<KruiseAppsV1alpha1NodePodProbeStatusPodProbeStatuses> podProbeStatuses) {
    this.podProbeStatuses = podProbeStatuses;
    return this;
  }

  public KruiseAppsV1alpha1NodePodProbeStatus addPodProbeStatusesItem(KruiseAppsV1alpha1NodePodProbeStatusPodProbeStatuses podProbeStatusesItem) {
    if (this.podProbeStatuses == null) {
      this.podProbeStatuses = new ArrayList<KruiseAppsV1alpha1NodePodProbeStatusPodProbeStatuses>();
    }
    this.podProbeStatuses.add(podProbeStatusesItem);
    return this;
  }

   /**
   * pod probe results
   * @return podProbeStatuses
  **/
  @ApiModelProperty(value = "pod probe results")
  public List<KruiseAppsV1alpha1NodePodProbeStatusPodProbeStatuses> getPodProbeStatuses() {
    return podProbeStatuses;
  }

  public void setPodProbeStatuses(List<KruiseAppsV1alpha1NodePodProbeStatusPodProbeStatuses> podProbeStatuses) {
    this.podProbeStatuses = podProbeStatuses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1NodePodProbeStatus ioKruiseAppsV1alpha1NodePodProbeStatus = (KruiseAppsV1alpha1NodePodProbeStatus) o;
    return Objects.equals(this.podProbeStatuses, ioKruiseAppsV1alpha1NodePodProbeStatus.podProbeStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podProbeStatuses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1NodePodProbeStatus {\n");
    
    sb.append("    podProbeStatuses: ").append(toIndentedString(podProbeStatuses)).append("\n");
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

