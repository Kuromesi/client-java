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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * ImageStatus defines the pulling status of an image
 */
@ApiModel(description = "ImageStatus defines the pulling status of an image")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1ImageStatus)) {
      return false;
    }
    KruiseAppsV1alpha1ImageStatus ioKruiseAppsV1alpha1NodeImageStatusImageStatuses = (KruiseAppsV1alpha1ImageStatus) o;
    return Objects.equals(this.tags, ioKruiseAppsV1alpha1NodeImageStatusImageStatuses.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1NodeImageStatusImageStatuses {\n");
    
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

