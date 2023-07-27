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
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * KruiseAppsV1alpha1NodePodProbeStatusPodProbeStatuses
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1PodProbeStatus {
  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("probeStates")
  private List<KruiseAppsV1alpha1ContainerProbeState> probeStates = null;

  @SerializedName("uid")
  private String uid = null;

  public KruiseAppsV1alpha1PodProbeStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * pod name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "pod name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public KruiseAppsV1alpha1PodProbeStatus namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * pod namespace
   * @return namespace
  **/
  @ApiModelProperty(required = true, value = "pod namespace")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public KruiseAppsV1alpha1PodProbeStatus probeStates(List<KruiseAppsV1alpha1ContainerProbeState> probeStates) {
    this.probeStates = probeStates;
    return this;
  }

  public KruiseAppsV1alpha1PodProbeStatus addProbeStatesItem(KruiseAppsV1alpha1ContainerProbeState probeStatesItem) {
    if (this.probeStates == null) {
      this.probeStates = new ArrayList<KruiseAppsV1alpha1ContainerProbeState>();
    }
    this.probeStates.add(probeStatesItem);
    return this;
  }

   /**
   * pod probe result
   * @return probeStates
  **/
  @ApiModelProperty(value = "pod probe result")
  public List<KruiseAppsV1alpha1ContainerProbeState> getProbeStates() {
    return probeStates;
  }

  public void setProbeStates(List<KruiseAppsV1alpha1ContainerProbeState> probeStates) {
    this.probeStates = probeStates;
  }

  public KruiseAppsV1alpha1PodProbeStatus uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * pod uid
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "pod uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1PodProbeStatus ioKruiseAppsV1alpha1NodePodProbeStatusPodProbeStatuses = (KruiseAppsV1alpha1PodProbeStatus) o;
    return Objects.equals(this.name, ioKruiseAppsV1alpha1NodePodProbeStatusPodProbeStatuses.name) &&
        Objects.equals(this.namespace, ioKruiseAppsV1alpha1NodePodProbeStatusPodProbeStatuses.namespace) &&
        Objects.equals(this.probeStates, ioKruiseAppsV1alpha1NodePodProbeStatusPodProbeStatuses.probeStates) &&
        Objects.equals(this.uid, ioKruiseAppsV1alpha1NodePodProbeStatusPodProbeStatuses.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, probeStates, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1NodePodProbeStatusPodProbeStatuses {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    probeStates: ").append(toIndentedString(probeStates)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

