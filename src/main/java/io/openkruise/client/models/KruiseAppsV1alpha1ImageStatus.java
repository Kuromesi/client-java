/*
 * Kruise
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.openkruise.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.openkruise.client.models.KruiseAppsV1alpha1ImageTagStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ImageStatus defines the pulling status of an image
 */
@ApiModel(description = "ImageStatus defines the pulling status of an image")

public class KruiseAppsV1alpha1ImageStatus {
  @SerializedName("tags")
  private List<KruiseAppsV1alpha1ImageTagStatus> tags = new ArrayList<KruiseAppsV1alpha1ImageTagStatus>();

  public KruiseAppsV1alpha1ImageStatus tags(List<KruiseAppsV1alpha1ImageTagStatus> tags) {
    this.tags = tags;
    return this;
  }

  public KruiseAppsV1alpha1ImageStatus addTagsItem(KruiseAppsV1alpha1ImageTagStatus tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Represents statuses of pulling tasks on this node
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "Represents statuses of pulling tasks on this node")
  public List<KruiseAppsV1alpha1ImageTagStatus> getTags() {
    return tags;
  }

  public void setTags(List<KruiseAppsV1alpha1ImageTagStatus> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1ImageStatus kruiseAppsV1alpha1ImageStatus = (KruiseAppsV1alpha1ImageStatus) o;
    return Objects.equals(this.tags, kruiseAppsV1alpha1ImageStatus.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ImageStatus {\n");
    
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
