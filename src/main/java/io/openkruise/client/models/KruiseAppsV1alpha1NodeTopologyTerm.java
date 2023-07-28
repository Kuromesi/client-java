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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Pod rebuilt topology required for node labels for example kubernetes.io/hostname, failure-domain.beta.kubernetes.io/zone
 */
@ApiModel(description = "Pod rebuilt topology required for node labels for example kubernetes.io/hostname, failure-domain.beta.kubernetes.io/zone")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1NodeTopologyTerm {
  @SerializedName("nodeTopologyKeys")
  private List<String> nodeTopologyKeys = new ArrayList<String>();

  public KruiseAppsV1alpha1NodeTopologyTerm nodeTopologyKeys(List<String> nodeTopologyKeys) {
    this.nodeTopologyKeys = nodeTopologyKeys;
    return this;
  }

  public KruiseAppsV1alpha1NodeTopologyTerm addNodeTopologyKeysItem(String nodeTopologyKeysItem) {
    this.nodeTopologyKeys.add(nodeTopologyKeysItem);
    return this;
  }

   /**
   * A list of node selector requirements by node&#39;s labels.
   * @return nodeTopologyKeys
  **/
  @ApiModelProperty(required = true, value = "A list of node selector requirements by node's labels.")
  public List<String> getNodeTopologyKeys() {
    return nodeTopologyKeys;
  }

  public void setNodeTopologyKeys(List<String> nodeTopologyKeys) {
    this.nodeTopologyKeys = nodeTopologyKeys;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1NodeTopologyTerm)) {
      return false;
    }
    KruiseAppsV1alpha1NodeTopologyTerm ioKruiseAppsV1alpha1PersistentPodStateSpecRequiredPersistentTopology = (KruiseAppsV1alpha1NodeTopologyTerm) o;
    return Objects.equals(this.nodeTopologyKeys, ioKruiseAppsV1alpha1PersistentPodStateSpecRequiredPersistentTopology.nodeTopologyKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeTopologyKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1PersistentPodStateSpecRequiredPersistentTopology {\n");
    
    sb.append("    nodeTopologyKeys: ").append(toIndentedString(nodeTopologyKeys)).append("\n");
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

