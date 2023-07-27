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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InjectionStrategy describe the strategy when sidecarset is injected into pods
 */
@ApiModel(description = "InjectionStrategy describe the strategy when sidecarset is injected into pods")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1SidecarSetInjectionStrategy {
  @SerializedName("paused")
  private Boolean paused = null;

  @SerializedName("revision")
  private KruiseAppsV1alpha1SidecarSetInjectionStrategyRevision revision = null;

  public KruiseAppsV1alpha1SidecarSetInjectionStrategy paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Paused indicates that SidecarSet will suspend injection into Pods If Paused is true, the sidecarSet will not be injected to newly created Pods, but the injected sidecar container remains updating and running. default is false
   * @return paused
  **/
  @ApiModelProperty(value = "Paused indicates that SidecarSet will suspend injection into Pods If Paused is true, the sidecarSet will not be injected to newly created Pods, but the injected sidecar container remains updating and running. default is false")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public KruiseAppsV1alpha1SidecarSetInjectionStrategy revision(KruiseAppsV1alpha1SidecarSetInjectionStrategyRevision revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * @return revision
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsV1alpha1SidecarSetInjectionStrategyRevision getRevision() {
    return revision;
  }

  public void setRevision(KruiseAppsV1alpha1SidecarSetInjectionStrategyRevision revision) {
    this.revision = revision;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1SidecarSetInjectionStrategy ioKruiseAppsV1alpha1SidecarSetSpecInjectionStrategy = (KruiseAppsV1alpha1SidecarSetInjectionStrategy) o;
    return Objects.equals(this.paused, ioKruiseAppsV1alpha1SidecarSetSpecInjectionStrategy.paused) &&
        Objects.equals(this.revision, ioKruiseAppsV1alpha1SidecarSetSpecInjectionStrategy.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paused, revision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1SidecarSetSpecInjectionStrategy {\n");
    
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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

