/*
* Kruise
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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.openkruise.client.models.KruiseAppsV1alpha1StatefulSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * StatefulSetList is a list of StatefulSet
 */
@ApiModel(description = "StatefulSetList is a list of StatefulSet")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1StatefulSetList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<KruiseAppsV1alpha1StatefulSet> items = new ArrayList<KruiseAppsV1alpha1StatefulSet>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ListMeta metadata = null;

  public KruiseAppsV1alpha1StatefulSetList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public KruiseAppsV1alpha1StatefulSetList items(List<KruiseAppsV1alpha1StatefulSet> items) {
    this.items = items;
    return this;
  }

  public KruiseAppsV1alpha1StatefulSetList addItemsItem(KruiseAppsV1alpha1StatefulSet itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of statefulsets. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md
   * @return items
  **/
  @ApiModelProperty(required = true, value = "List of statefulsets. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md")
  public List<KruiseAppsV1alpha1StatefulSet> getItems() {
    return items;
  }

  public void setItems(List<KruiseAppsV1alpha1StatefulSet> items) {
    this.items = items;
  }

  public KruiseAppsV1alpha1StatefulSetList kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public KruiseAppsV1alpha1StatefulSetList metadata(V1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1StatefulSetList)) {
      return false;
    }
    KruiseAppsV1alpha1StatefulSetList ioKruiseAppsV1alpha1StatefulSetList = (KruiseAppsV1alpha1StatefulSetList) o;
    return Objects.equals(this.apiVersion, ioKruiseAppsV1alpha1StatefulSetList.apiVersion) &&
        Objects.equals(this.items, ioKruiseAppsV1alpha1StatefulSetList.items) &&
        Objects.equals(this.kind, ioKruiseAppsV1alpha1StatefulSetList.kind) &&
        Objects.equals(this.metadata, ioKruiseAppsV1alpha1StatefulSetList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1StatefulSetList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

