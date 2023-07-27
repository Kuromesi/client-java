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
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Revision can help users rolling update SidecarSet safely. If users set this filed, SidecarSet will try to inject specific revision according to different policies.
 */
@ApiModel(description = "Revision can help users rolling update SidecarSet safely. If users set this filed, SidecarSet will try to inject specific revision according to different policies.")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1SidecarSetInjectionStrategyRevision {
  @SerializedName("customVersion")
  private String customVersion = null;

  @SerializedName("policy")
  private String policy = null;

  @SerializedName("revisionName")
  private String revisionName = null;

  public KruiseAppsV1alpha1SidecarSetInjectionStrategyRevision customVersion(String customVersion) {
    this.customVersion = customVersion;
    return this;
  }

   /**
   * CustomVersion corresponds to label &#39;apps.kruise.io/sidecarset-custom-version&#39; of (History) SidecarSet. SidecarSet will select the specific ControllerRevision via this CustomVersion, and then restore the history SidecarSet to inject specific version of the sidecar to pods.
   * @return customVersion
  **/
  @ApiModelProperty(value = "CustomVersion corresponds to label 'apps.kruise.io/sidecarset-custom-version' of (History) SidecarSet. SidecarSet will select the specific ControllerRevision via this CustomVersion, and then restore the history SidecarSet to inject specific version of the sidecar to pods.")
  public String getCustomVersion() {
    return customVersion;
  }

  public void setCustomVersion(String customVersion) {
    this.customVersion = customVersion;
  }

  public KruiseAppsV1alpha1SidecarSetInjectionStrategyRevision policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Policy describes the behavior of revision injection. Defaults to Always.
   * @return policy
  **/
  @ApiModelProperty(value = "Policy describes the behavior of revision injection. Defaults to Always.")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public KruiseAppsV1alpha1SidecarSetInjectionStrategyRevision revisionName(String revisionName) {
    this.revisionName = revisionName;
    return this;
  }

   /**
   * RevisionName corresponds to a specific ControllerRevision name of SidecarSet that you want to inject to Pods.
   * @return revisionName
  **/
  @ApiModelProperty(value = "RevisionName corresponds to a specific ControllerRevision name of SidecarSet that you want to inject to Pods.")
  public String getRevisionName() {
    return revisionName;
  }

  public void setRevisionName(String revisionName) {
    this.revisionName = revisionName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1SidecarSetInjectionStrategyRevision)) {
      return false;
    }
    KruiseAppsV1alpha1SidecarSetInjectionStrategyRevision ioKruiseAppsV1alpha1SidecarSetSpecInjectionStrategyRevision = (KruiseAppsV1alpha1SidecarSetInjectionStrategyRevision) o;
    return Objects.equals(this.customVersion, ioKruiseAppsV1alpha1SidecarSetSpecInjectionStrategyRevision.customVersion) &&
        Objects.equals(this.policy, ioKruiseAppsV1alpha1SidecarSetSpecInjectionStrategyRevision.policy) &&
        Objects.equals(this.revisionName, ioKruiseAppsV1alpha1SidecarSetSpecInjectionStrategyRevision.revisionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customVersion, policy, revisionName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1SidecarSetSpecInjectionStrategyRevision {\n");
    
    sb.append("    customVersion: ").append(toIndentedString(customVersion)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    revisionName: ").append(toIndentedString(revisionName)).append("\n");
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

