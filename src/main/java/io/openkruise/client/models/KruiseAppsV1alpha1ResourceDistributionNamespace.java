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

/**
 * ResourceDistributionNamespace contains a namespace name
 */
@ApiModel(description = "ResourceDistributionNamespace contains a namespace name")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1ResourceDistributionSpecTargetsExcludedNamespacesList {
  @SerializedName("name")
  private String name = null;

  public KruiseAppsV1alpha1ResourceDistributionSpecTargetsExcludedNamespacesList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Namespace name
   * @return name
  **/
  @ApiModelProperty(value = "Namespace name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1ResourceDistributionSpecTargetsExcludedNamespacesList ioKruiseAppsV1alpha1ResourceDistributionSpecTargetsExcludedNamespacesList = (KruiseAppsV1alpha1ResourceDistributionSpecTargetsExcludedNamespacesList) o;
    return Objects.equals(this.name, ioKruiseAppsV1alpha1ResourceDistributionSpecTargetsExcludedNamespacesList.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ResourceDistributionSpecTargetsExcludedNamespacesList {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
