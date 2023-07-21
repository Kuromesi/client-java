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
import io.openkruise.client.models.KruiseAppsV1alpha1CloneSetSpecSelectorMatchExpressions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A label query over nodes that are managed by the daemon set RollingUpdate. Must match in order to be controlled. It must match the node&#39;s labels.
 */
@ApiModel(description = "A label query over nodes that are managed by the daemon set RollingUpdate. Must match in order to be controlled. It must match the node's labels.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1DaemonSetSpecUpdateStrategyRollingUpdateSelector {
  @SerializedName("matchExpressions")
  private List<KruiseAppsV1alpha1CloneSetSpecSelectorMatchExpressions> matchExpressions = null;

  @SerializedName("matchLabels")
  private Map<String, String> matchLabels = null;

  public KruiseAppsV1alpha1DaemonSetSpecUpdateStrategyRollingUpdateSelector matchExpressions(List<KruiseAppsV1alpha1CloneSetSpecSelectorMatchExpressions> matchExpressions) {
    this.matchExpressions = matchExpressions;
    return this;
  }

  public KruiseAppsV1alpha1DaemonSetSpecUpdateStrategyRollingUpdateSelector addMatchExpressionsItem(KruiseAppsV1alpha1CloneSetSpecSelectorMatchExpressions matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<KruiseAppsV1alpha1CloneSetSpecSelectorMatchExpressions>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

   /**
   * matchExpressions is a list of label selector requirements. The requirements are ANDed.
   * @return matchExpressions
  **/
  @ApiModelProperty(value = "matchExpressions is a list of label selector requirements. The requirements are ANDed.")
  public List<KruiseAppsV1alpha1CloneSetSpecSelectorMatchExpressions> getMatchExpressions() {
    return matchExpressions;
  }

  public void setMatchExpressions(List<KruiseAppsV1alpha1CloneSetSpecSelectorMatchExpressions> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }

  public KruiseAppsV1alpha1DaemonSetSpecUpdateStrategyRollingUpdateSelector matchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
    return this;
  }

  public KruiseAppsV1alpha1DaemonSetSpecUpdateStrategyRollingUpdateSelector putMatchLabelsItem(String key, String matchLabelsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1DaemonSetSpecUpdateStrategyRollingUpdateSelector ioKruiseAppsV1alpha1DaemonSetSpecUpdateStrategyRollingUpdateSelector = (KruiseAppsV1alpha1DaemonSetSpecUpdateStrategyRollingUpdateSelector) o;
    return Objects.equals(this.matchExpressions, ioKruiseAppsV1alpha1DaemonSetSpecUpdateStrategyRollingUpdateSelector.matchExpressions) &&
        Objects.equals(this.matchLabels, ioKruiseAppsV1alpha1DaemonSetSpecUpdateStrategyRollingUpdateSelector.matchLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchLabels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1DaemonSetSpecUpdateStrategyRollingUpdateSelector {\n");
    
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
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

