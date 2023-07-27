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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * KruiseAppsV1alpha1PersistentPodStateSpecPreferredPersistentTopology
 */
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1PreferredTopologyTerm {
  @SerializedName("preference")
  private KruiseAppsV1alpha1NodeTopologyTerm preference = null;

  @SerializedName("weight")
  private Integer weight = null;

  public KruiseAppsV1alpha1PreferredTopologyTerm preference(KruiseAppsV1alpha1NodeTopologyTerm preference) {
    this.preference = preference;
    return this;
  }

   /**
   * Get preference
   * @return preference
  **/
  @ApiModelProperty(required = true, value = "")
  public KruiseAppsV1alpha1NodeTopologyTerm getPreference() {
    return preference;
  }

  public void setPreference(KruiseAppsV1alpha1NodeTopologyTerm preference) {
    this.preference = preference;
  }

  public KruiseAppsV1alpha1PreferredTopologyTerm weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1PreferredTopologyTerm)) {
      return false;
    }
    KruiseAppsV1alpha1PreferredTopologyTerm ioKruiseAppsV1alpha1PersistentPodStateSpecPreferredPersistentTopology = (KruiseAppsV1alpha1PreferredTopologyTerm) o;
    return Objects.equals(this.preference, ioKruiseAppsV1alpha1PersistentPodStateSpecPreferredPersistentTopology.preference) &&
        Objects.equals(this.weight, ioKruiseAppsV1alpha1PersistentPodStateSpecPreferredPersistentTopology.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preference, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1PersistentPodStateSpecPreferredPersistentTopology {\n");
    
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

