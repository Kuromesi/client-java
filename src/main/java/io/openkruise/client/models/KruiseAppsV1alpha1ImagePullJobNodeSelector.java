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
import io.kubernetes.client.openapi.models.V1LabelSelectorRequirement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Selector is a query over nodes that should match the job. nil to match all nodes.
 */
@ApiModel(description = "Selector is a query over nodes that should match the job. nil to match all nodes.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1ImagePullJobNodeSelector {
  @SerializedName("matchExpressions")
  private List<V1LabelSelectorRequirement> matchExpressions = null;

  @SerializedName("matchLabels")
  private Map<String, String> matchLabels = null;

  @SerializedName("names")
  private List<String> names = null;

  public KruiseAppsV1alpha1ImagePullJobNodeSelector matchExpressions(List<V1LabelSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
    return this;
  }

  public KruiseAppsV1alpha1ImagePullJobNodeSelector addMatchExpressionsItem(V1LabelSelectorRequirement matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<V1LabelSelectorRequirement>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

   /**
   * matchExpressions is a list of label selector requirements. The requirements are ANDed.
   * @return matchExpressions
  **/
  @ApiModelProperty(value = "matchExpressions is a list of label selector requirements. The requirements are ANDed.")
  public List<V1LabelSelectorRequirement> getMatchExpressions() {
    return matchExpressions;
  }

  public void setMatchExpressions(List<V1LabelSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }

  public KruiseAppsV1alpha1ImagePullJobNodeSelector matchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
    return this;
  }

  public KruiseAppsV1alpha1ImagePullJobNodeSelector putMatchLabelsItem(String key, String matchLabelsItem) {
    if (this.matchLabels == null) {
      this.matchLabels = new HashMap<String, String>();
    }
    this.matchLabels.put(key, matchLabelsItem);
    return this;
  }

   /**
   * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \&quot;key\&quot;, the operator is \&quot;In\&quot;, and the values array contains only \&quot;value\&quot;. The requirements are ANDed.
   * @return matchLabels
  **/
  @ApiModelProperty(value = "matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \"key\", the operator is \"In\", and the values array contains only \"value\". The requirements are ANDed.")
  public Map<String, String> getMatchLabels() {
    return matchLabels;
  }

  public void setMatchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
  }

  public KruiseAppsV1alpha1ImagePullJobNodeSelector names(List<String> names) {
    this.names = names;
    return this;
  }

  public KruiseAppsV1alpha1ImagePullJobNodeSelector addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<String>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Names specify a set of nodes to execute the job.
   * @return names
  **/
  @ApiModelProperty(value = "Names specify a set of nodes to execute the job.")
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1ImagePullJobNodeSelector ioKruiseAppsV1alpha1ImageListPullJobSpecSelector = (KruiseAppsV1alpha1ImagePullJobNodeSelector) o;
    return Objects.equals(this.matchExpressions, ioKruiseAppsV1alpha1ImageListPullJobSpecSelector.matchExpressions) &&
        Objects.equals(this.matchLabels, ioKruiseAppsV1alpha1ImageListPullJobSpecSelector.matchLabels) &&
        Objects.equals(this.names, ioKruiseAppsV1alpha1ImageListPullJobSpecSelector.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchLabels, names);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ImageListPullJobSpecSelector {\n");
    
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

