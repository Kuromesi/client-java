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
 * KruiseAppsV1alpha1CloneSetSpecUpdateStrategyScatterStrategy
 */
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1UpdateScatterTerm {
  @SerializedName("key")
  private String key = null;

  @SerializedName("value")
  private String value = null;

  public KruiseAppsV1alpha1UpdateScatterTerm key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(required = true, value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public KruiseAppsV1alpha1UpdateScatterTerm value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1UpdateScatterTerm)) {
      return false;
    }
    KruiseAppsV1alpha1UpdateScatterTerm ioKruiseAppsV1alpha1CloneSetSpecUpdateStrategyScatterStrategy = (KruiseAppsV1alpha1UpdateScatterTerm) o;
    return Objects.equals(this.key, ioKruiseAppsV1alpha1CloneSetSpecUpdateStrategyScatterStrategy.key) &&
        Objects.equals(this.value, ioKruiseAppsV1alpha1CloneSetSpecUpdateStrategyScatterStrategy.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1CloneSetSpecUpdateStrategyScatterStrategy {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

