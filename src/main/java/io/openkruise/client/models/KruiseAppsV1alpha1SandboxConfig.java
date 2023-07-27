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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * SandboxConfig support attach metadata in PullImage CRI interface during ImagePulljobs
 */
@ApiModel(description = "SandboxConfig support attach metadata in PullImage CRI interface during ImagePulljobs")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1SandboxConfig {
  @SerializedName("annotations")
  private Map<String, String> annotations = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  public KruiseAppsV1alpha1SandboxConfig annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public KruiseAppsV1alpha1SandboxConfig putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, String>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public KruiseAppsV1alpha1SandboxConfig labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public KruiseAppsV1alpha1SandboxConfig putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1SandboxConfig)) {
      return false;
    }
    KruiseAppsV1alpha1SandboxConfig ioKruiseAppsV1alpha1ImageListPullJobSpecSandboxConfig = (KruiseAppsV1alpha1SandboxConfig) o;
    return Objects.equals(this.annotations, ioKruiseAppsV1alpha1ImageListPullJobSpecSandboxConfig.annotations) &&
        Objects.equals(this.labels, ioKruiseAppsV1alpha1ImageListPullJobSpecSandboxConfig.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ImageListPullJobSpecSandboxConfig {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

