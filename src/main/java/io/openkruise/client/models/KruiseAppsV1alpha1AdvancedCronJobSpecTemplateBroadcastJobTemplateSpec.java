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
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.openkruise.client.models.KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecCompletionPolicy;
import io.openkruise.client.models.KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecFailurePolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Specification of the desired behavior of the broadcastjob.
 */
@ApiModel(description = "Specification of the desired behavior of the broadcastjob.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec {
  @SerializedName("completionPolicy")
  private KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecCompletionPolicy completionPolicy = null;

  @SerializedName("failurePolicy")
  private KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecFailurePolicy failurePolicy = null;

  @SerializedName("parallelism")
  private IntOrString parallelism = null;

  @SerializedName("paused")
  private Boolean paused = null;

  @SerializedName("template")
  private V1PodTemplateSpec template = null;

  public KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec completionPolicy(KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecCompletionPolicy completionPolicy) {
    this.completionPolicy = completionPolicy;
    return this;
  }

   /**
   * Get completionPolicy
   * @return completionPolicy
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecCompletionPolicy getCompletionPolicy() {
    return completionPolicy;
  }

  public void setCompletionPolicy(KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecCompletionPolicy completionPolicy) {
    this.completionPolicy = completionPolicy;
  }

  public KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec failurePolicy(KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecFailurePolicy failurePolicy) {
    this.failurePolicy = failurePolicy;
    return this;
  }

   /**
   * Get failurePolicy
   * @return failurePolicy
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecFailurePolicy getFailurePolicy() {
    return failurePolicy;
  }

  public void setFailurePolicy(KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecFailurePolicy failurePolicy) {
    this.failurePolicy = failurePolicy;
  }

  public KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec parallelism(IntOrString parallelism) {
    this.parallelism = parallelism;
    return this;
  }

   /**
   * Parallelism specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when the work left to do is less than max parallelism. Not setting this value means no limit.
   * @return parallelism
  **/
  @ApiModelProperty(value = "Parallelism specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when the work left to do is less than max parallelism. Not setting this value means no limit.")
  public IntOrString getParallelism() {
    return parallelism;
  }

  public void setParallelism(IntOrString parallelism) {
    this.parallelism = parallelism;
  }

  public KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Paused will pause the job.
   * @return paused
  **/
  @ApiModelProperty(value = "Paused will pause the job.")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec template(V1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

   /**
   * Template describes the pod that will be created when executing a job.
   * @return template
  **/
  @ApiModelProperty(required = true, value = "Template describes the pod that will be created when executing a job.")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec ioKruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec = (KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec) o;
    return Objects.equals(this.completionPolicy, ioKruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec.completionPolicy) &&
        Objects.equals(this.failurePolicy, ioKruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec.failurePolicy) &&
        Objects.equals(this.parallelism, ioKruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec.parallelism) &&
        Objects.equals(this.paused, ioKruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec.paused) &&
        Objects.equals(this.template, ioKruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionPolicy, failurePolicy, parallelism, paused, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpec {\n");
    
    sb.append("    completionPolicy: ").append(toIndentedString(completionPolicy)).append("\n");
    sb.append("    failurePolicy: ").append(toIndentedString(failurePolicy)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

