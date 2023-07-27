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
 * KruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy {
  @SerializedName("annotations")
  private Map<String, String> annotations = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  @SerializedName("state")
  private String state = null;

  public KruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public KruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, String>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Patch annotations pod.annotations
   * @return annotations
  **/
  @ApiModelProperty(value = "Patch annotations pod.annotations")
  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public KruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public KruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Patch Labels pod.labels
   * @return labels
  **/
  @ApiModelProperty(value = "Patch Labels pod.labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public KruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy state(String state) {
    this.state = state;
    return this;
  }

   /**
   * probe status, True or False For example: State&#x3D;Succeeded, annotations[controller.kubernetes.io/pod-deletion-cost] &#x3D; &#39;10&#39;. State&#x3D;Failed, annotations[controller.kubernetes.io/pod-deletion-cost] &#x3D; &#39;-10&#39;. In addition, if State&#x3D;Failed is not defined, Exec execution fails, and the annotations[controller.kubernetes.io/pod-deletion-cost] will be Deleted
   * @return state
  **/
  @ApiModelProperty(required = true, value = "probe status, True or False For example: State=Succeeded, annotations[controller.kubernetes.io/pod-deletion-cost] = '10'. State=Failed, annotations[controller.kubernetes.io/pod-deletion-cost] = '-10'. In addition, if State=Failed is not defined, Exec execution fails, and the annotations[controller.kubernetes.io/pod-deletion-cost] will be Deleted")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy ioKruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy = (KruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy) o;
    return Objects.equals(this.annotations, ioKruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy.annotations) &&
        Objects.equals(this.labels, ioKruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy.labels) &&
        Objects.equals(this.state, ioKruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, labels, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
