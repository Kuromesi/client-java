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
 * Lifecycle defines the lifecycle hooks for Pods pre-available(pre-normal), pre-delete, in-place update.
 */
@ApiModel(description = "Lifecycle defines the lifecycle hooks for Pods pre-available(pre-normal), pre-delete, in-place update.")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsPubLifecycle {
  @SerializedName("inPlaceUpdate")
  private KruiseAppsPubLifecycleHook inPlaceUpdate = null;

  @SerializedName("preDelete")
  private KruiseAppsPubLifecycleHook preDelete = null;

  @SerializedName("preNormal")
  private KruiseAppsPubLifecycleHook preNormal = null;

  public KruiseAppsPubLifecycle inPlaceUpdate(KruiseAppsPubLifecycleHook inPlaceUpdate) {
    this.inPlaceUpdate = inPlaceUpdate;
    return this;
  }

   /**
   * Get inPlaceUpdate
   * @return inPlaceUpdate
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsPubLifecycleHook getInPlaceUpdate() {
    return inPlaceUpdate;
  }

  public void setInPlaceUpdate(KruiseAppsPubLifecycleHook inPlaceUpdate) {
    this.inPlaceUpdate = inPlaceUpdate;
  }

  public KruiseAppsPubLifecycle preDelete(KruiseAppsPubLifecycleHook preDelete) {
    this.preDelete = preDelete;
    return this;
  }

   /**
   * Get preDelete
   * @return preDelete
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsPubLifecycleHook getPreDelete() {
    return preDelete;
  }

  public void setPreDelete(KruiseAppsPubLifecycleHook preDelete) {
    this.preDelete = preDelete;
  }

  public KruiseAppsPubLifecycle preNormal(KruiseAppsPubLifecycleHook preNormal) {
    this.preNormal = preNormal;
    return this;
  }

   /**
   * Get preNormal
   * @return preNormal
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsPubLifecycleHook getPreNormal() {
    return preNormal;
  }

  public void setPreNormal(KruiseAppsPubLifecycleHook preNormal) {
    this.preNormal = preNormal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsPubLifecycle)) {
      return false;
    }
    KruiseAppsPubLifecycle ioKruiseAppsV1alpha1CloneSetSpecLifecycle = (KruiseAppsPubLifecycle) o;
    return Objects.equals(this.inPlaceUpdate, ioKruiseAppsV1alpha1CloneSetSpecLifecycle.inPlaceUpdate) &&
        Objects.equals(this.preDelete, ioKruiseAppsV1alpha1CloneSetSpecLifecycle.preDelete) &&
        Objects.equals(this.preNormal, ioKruiseAppsV1alpha1CloneSetSpecLifecycle.preNormal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inPlaceUpdate, preDelete, preNormal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1CloneSetSpecLifecycle {\n");
    
    sb.append("    inPlaceUpdate: ").append(toIndentedString(inPlaceUpdate)).append("\n");
    sb.append("    preDelete: ").append(toIndentedString(preDelete)).append("\n");
    sb.append("    preNormal: ").append(toIndentedString(preNormal)).append("\n");
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

