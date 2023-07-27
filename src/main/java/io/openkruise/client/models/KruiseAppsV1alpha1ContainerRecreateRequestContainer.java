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
import io.kubernetes.client.openapi.models.V1ContainerPort;
import io.kubernetes.client.openapi.models.V1Handler;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * ContainerRecreateRequestContainer defines the container that need to recreate.
 */
@ApiModel(description = "ContainerRecreateRequestContainer defines the container that need to recreate.")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1ContainerRecreateRequestContainer {
  @SerializedName("name")
  private String name = null;

  @SerializedName("ports")
  private List<V1ContainerPort> ports = null;

  @SerializedName("preStop")
  private V1Handler preStop = null;

  @SerializedName("statusContext")
  private KruiseAppsV1alpha1ContainerRecreateRequestContext statusContext = null;

  public KruiseAppsV1alpha1ContainerRecreateRequestContainer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the container that need to recreate. It must be existing in the real pod.Spec.Containers.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the container that need to recreate. It must be existing in the real pod.Spec.Containers.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestContainer ports(List<V1ContainerPort> ports) {
    this.ports = ports;
    return this;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestContainer addPortsItem(V1ContainerPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<V1ContainerPort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Ports is synced from the real container in Pod spec during this ContainerRecreateRequest creating. Populated by the system. Read-only.
   * @return ports
  **/
  @ApiModelProperty(value = "Ports is synced from the real container in Pod spec during this ContainerRecreateRequest creating. Populated by the system. Read-only.")
  public List<V1ContainerPort> getPorts() {
    return ports;
  }

  public void setPorts(List<V1ContainerPort> ports) {
    this.ports = ports;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestContainer preStop(V1Handler preStop) {
    this.preStop = preStop;
    return this;
  }

   /**
   * Get preStop
   * @return preStop
  **/
  @ApiModelProperty(value = "")
  public V1Handler getPreStop() {
    return preStop;
  }

  public void setPreStop(V1Handler preStop) {
    this.preStop = preStop;
  }

  public KruiseAppsV1alpha1ContainerRecreateRequestContainer statusContext(KruiseAppsV1alpha1ContainerRecreateRequestContext statusContext) {
    this.statusContext = statusContext;
    return this;
  }

   /**
   * Get statusContext
   * @return statusContext
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsV1alpha1ContainerRecreateRequestContext getStatusContext() {
    return statusContext;
  }

  public void setStatusContext(KruiseAppsV1alpha1ContainerRecreateRequestContext statusContext) {
    this.statusContext = statusContext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1ContainerRecreateRequestContainer)) {
      return false;
    }
    KruiseAppsV1alpha1ContainerRecreateRequestContainer ioKruiseAppsV1alpha1ContainerRecreateRequestSpecContainers = (KruiseAppsV1alpha1ContainerRecreateRequestContainer) o;
    return Objects.equals(this.name, ioKruiseAppsV1alpha1ContainerRecreateRequestSpecContainers.name) &&
        Objects.equals(this.ports, ioKruiseAppsV1alpha1ContainerRecreateRequestSpecContainers.ports) &&
        Objects.equals(this.preStop, ioKruiseAppsV1alpha1ContainerRecreateRequestSpecContainers.preStop) &&
        Objects.equals(this.statusContext, ioKruiseAppsV1alpha1ContainerRecreateRequestSpecContainers.statusContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ports, preStop, statusContext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ContainerRecreateRequestSpecContainers {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
    sb.append("    statusContext: ").append(toIndentedString(statusContext)).append("\n");
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

