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
import io.openkruise.client.models.KruiseAppsV1alpha1NodePodProbeSpecProbes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * KruiseAppsV1alpha1NodePodProbeSpecPodProbes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1NodePodProbeSpecPodProbes {
  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("probes")
  private List<KruiseAppsV1alpha1NodePodProbeSpecProbes> probes = null;

  @SerializedName("uid")
  private String uid = null;

  public KruiseAppsV1alpha1NodePodProbeSpecPodProbes name(String name) {
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

  public KruiseAppsV1alpha1NodePodProbeSpecPodProbes namespace(String namespace) {
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

  public KruiseAppsV1alpha1NodePodProbeSpecPodProbes probes(List<KruiseAppsV1alpha1NodePodProbeSpecProbes> probes) {
    this.probes = probes;
    return this;
  }

  public KruiseAppsV1alpha1NodePodProbeSpecPodProbes addProbesItem(KruiseAppsV1alpha1NodePodProbeSpecProbes probesItem) {
    if (this.probes == null) {
      this.probes = new ArrayList<KruiseAppsV1alpha1NodePodProbeSpecProbes>();
    }
    this.probes.add(probesItem);
    return this;
  }

   /**
   * Custom container probe, supports Exec, Tcp, and returns the result to Pod yaml
   * @return probes
  **/
  @ApiModelProperty(value = "Custom container probe, supports Exec, Tcp, and returns the result to Pod yaml")
  public List<KruiseAppsV1alpha1NodePodProbeSpecProbes> getProbes() {
    return probes;
  }

  public void setProbes(List<KruiseAppsV1alpha1NodePodProbeSpecProbes> probes) {
    this.probes = probes;
  }

  public KruiseAppsV1alpha1NodePodProbeSpecPodProbes uid(String uid) {
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
    KruiseAppsV1alpha1NodePodProbeSpecPodProbes ioKruiseAppsV1alpha1NodePodProbeSpecPodProbes = (KruiseAppsV1alpha1NodePodProbeSpecPodProbes) o;
    return Objects.equals(this.name, ioKruiseAppsV1alpha1NodePodProbeSpecPodProbes.name) &&
        Objects.equals(this.namespace, ioKruiseAppsV1alpha1NodePodProbeSpecPodProbes.namespace) &&
        Objects.equals(this.probes, ioKruiseAppsV1alpha1NodePodProbeSpecPodProbes.probes) &&
        Objects.equals(this.uid, ioKruiseAppsV1alpha1NodePodProbeSpecPodProbes.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, probes, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1NodePodProbeSpecPodProbes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    probes: ").append(toIndentedString(probes)).append("\n");
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

