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
 * KruiseAppsV1alpha1PodProbeMarkerSpecProbes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1PodContainerProbe {
  @SerializedName("containerName")
  private String containerName = null;

  @SerializedName("markerPolicy")
  private List<KruiseAppsV1alpha1ProbeMarkerPolicy> markerPolicy = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("podConditionType")
  private String podConditionType = null;

  @SerializedName("probe")
  private KruiseAppsV1alpha1ContainerProbeSpec probe = null;

  public KruiseAppsV1alpha1PodContainerProbe containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

   /**
   * container name
   * @return containerName
  **/
  @ApiModelProperty(required = true, value = "container name")
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }

  public KruiseAppsV1alpha1PodContainerProbe markerPolicy(List<KruiseAppsV1alpha1ProbeMarkerPolicy> markerPolicy) {
    this.markerPolicy = markerPolicy;
    return this;
  }

  public KruiseAppsV1alpha1PodContainerProbe addMarkerPolicyItem(KruiseAppsV1alpha1ProbeMarkerPolicy markerPolicyItem) {
    if (this.markerPolicy == null) {
      this.markerPolicy = new ArrayList<KruiseAppsV1alpha1ProbeMarkerPolicy>();
    }
    this.markerPolicy.add(markerPolicyItem);
    return this;
  }

   /**
   * According to the execution result of ContainerProbe, perform specific actions, such as: patch Pod labels, annotations, ReadinessGate Condition It cannot be null at the same time as PodConditionType.
   * @return markerPolicy
  **/
  @ApiModelProperty(value = "According to the execution result of ContainerProbe, perform specific actions, such as: patch Pod labels, annotations, ReadinessGate Condition It cannot be null at the same time as PodConditionType.")
  public List<KruiseAppsV1alpha1ProbeMarkerPolicy> getMarkerPolicy() {
    return markerPolicy;
  }

  public void setMarkerPolicy(List<KruiseAppsV1alpha1ProbeMarkerPolicy> markerPolicy) {
    this.markerPolicy = markerPolicy;
  }

  public KruiseAppsV1alpha1PodContainerProbe name(String name) {
    this.name = name;
    return this;
  }

   /**
   * probe name, unique within the Pod(Even between different containers, they cannot be the same)
   * @return name
  **/
  @ApiModelProperty(required = true, value = "probe name, unique within the Pod(Even between different containers, they cannot be the same)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public KruiseAppsV1alpha1PodContainerProbe podConditionType(String podConditionType) {
    this.podConditionType = podConditionType;
    return this;
  }

   /**
   * If it is not empty, the Probe execution result will be recorded on the Pod condition. It cannot be null at the same time as MarkerPolicy. For example PodConditionType&#x3D;game.kruise.io/healthy, pod.status.condition.type &#x3D; game.kruise.io/healthy. When probe is Succeeded, pod.status.condition.status &#x3D; True. Otherwise, when the probe fails to execute, pod.status.condition.status &#x3D; False.
   * @return podConditionType
  **/
  @ApiModelProperty(value = "If it is not empty, the Probe execution result will be recorded on the Pod condition. It cannot be null at the same time as MarkerPolicy. For example PodConditionType=game.kruise.io/healthy, pod.status.condition.type = game.kruise.io/healthy. When probe is Succeeded, pod.status.condition.status = True. Otherwise, when the probe fails to execute, pod.status.condition.status = False.")
  public String getPodConditionType() {
    return podConditionType;
  }

  public void setPodConditionType(String podConditionType) {
    this.podConditionType = podConditionType;
  }

  public KruiseAppsV1alpha1PodContainerProbe probe(KruiseAppsV1alpha1ContainerProbeSpec probe) {
    this.probe = probe;
    return this;
  }

   /**
   * Get probe
   * @return probe
  **/
  @ApiModelProperty(required = true, value = "")
  public KruiseAppsV1alpha1ContainerProbeSpec getProbe() {
    return probe;
  }

  public void setProbe(KruiseAppsV1alpha1ContainerProbeSpec probe) {
    this.probe = probe;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1PodContainerProbe ioKruiseAppsV1alpha1PodProbeMarkerSpecProbes = (KruiseAppsV1alpha1PodContainerProbe) o;
    return Objects.equals(this.containerName, ioKruiseAppsV1alpha1PodProbeMarkerSpecProbes.containerName) &&
        Objects.equals(this.markerPolicy, ioKruiseAppsV1alpha1PodProbeMarkerSpecProbes.markerPolicy) &&
        Objects.equals(this.name, ioKruiseAppsV1alpha1PodProbeMarkerSpecProbes.name) &&
        Objects.equals(this.podConditionType, ioKruiseAppsV1alpha1PodProbeMarkerSpecProbes.podConditionType) &&
        Objects.equals(this.probe, ioKruiseAppsV1alpha1PodProbeMarkerSpecProbes.probe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerName, markerPolicy, name, podConditionType, probe);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1PodProbeMarkerSpecProbes {\n");
    
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    markerPolicy: ").append(toIndentedString(markerPolicy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    podConditionType: ").append(toIndentedString(podConditionType)).append("\n");
    sb.append("    probe: ").append(toIndentedString(probe)).append("\n");
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

