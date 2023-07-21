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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * KruiseAppsV1alpha1SidecarSetSpecPatchPodMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1SidecarSetSpecPatchPodMetadata {
  @SerializedName("annotations")
  private Map<String, String> annotations = null;

  @SerializedName("patchPolicy")
  private String patchPolicy = null;

  public KruiseAppsV1alpha1SidecarSetSpecPatchPodMetadata annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public KruiseAppsV1alpha1SidecarSetSpecPatchPodMetadata putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, String>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * annotations
   * @return annotations
  **/
  @ApiModelProperty(value = "annotations")
  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public KruiseAppsV1alpha1SidecarSetSpecPatchPodMetadata patchPolicy(String patchPolicy) {
    this.patchPolicy = patchPolicy;
    return this;
  }

   /**
   * labels map[string]string &#x60;json:\&quot;labels,omitempty\&quot;&#x60; patch pod metadata policy, Default is \&quot;Retain\&quot;
   * @return patchPolicy
  **/
  @ApiModelProperty(value = "labels map[string]string `json:\"labels,omitempty\"` patch pod metadata policy, Default is \"Retain\"")
  public String getPatchPolicy() {
    return patchPolicy;
  }

  public void setPatchPolicy(String patchPolicy) {
    this.patchPolicy = patchPolicy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1SidecarSetSpecPatchPodMetadata ioKruiseAppsV1alpha1SidecarSetSpecPatchPodMetadata = (KruiseAppsV1alpha1SidecarSetSpecPatchPodMetadata) o;
    return Objects.equals(this.annotations, ioKruiseAppsV1alpha1SidecarSetSpecPatchPodMetadata.annotations) &&
        Objects.equals(this.patchPolicy, ioKruiseAppsV1alpha1SidecarSetSpecPatchPodMetadata.patchPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, patchPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1SidecarSetSpecPatchPodMetadata {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    patchPolicy: ").append(toIndentedString(patchPolicy)).append("\n");
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
