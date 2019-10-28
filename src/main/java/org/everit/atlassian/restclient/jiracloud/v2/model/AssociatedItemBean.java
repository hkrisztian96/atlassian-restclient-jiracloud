/*
 * Copyright © 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.everit.atlassian.restclient.jiracloud.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Details of an item associated with the changed record.
 */
@ApiModel(description = "Details of an item associated with the changed record.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-05T12:17:30.184+02:00[Europe/Prague]")
public class AssociatedItemBean {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("typeName")
  private String typeName;

  @JsonProperty("parentId")
  private String parentId;

  @JsonProperty("parentName")
  private String parentName;

   /**
   * The ID of the associated record.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the associated record.")
  public String getId() {
    return id;
  }

   /**
   * The name of the associated record.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the associated record.")
  public String getName() {
    return name;
  }

   /**
   * The type of the associated record.
   * @return typeName
  **/
  @ApiModelProperty(value = "The type of the associated record.")
  public String getTypeName() {
    return typeName;
  }

   /**
   * The ID of the associated parent record.
   * @return parentId
  **/
  @ApiModelProperty(value = "The ID of the associated parent record.")
  public String getParentId() {
    return parentId;
  }

   /**
   * The name of the associated parent record.
   * @return parentName
  **/
  @ApiModelProperty(value = "The name of the associated parent record.")
  public String getParentName() {
    return parentName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociatedItemBean associatedItemBean = (AssociatedItemBean) o;
    return Objects.equals(this.id, associatedItemBean.id) &&
        Objects.equals(this.name, associatedItemBean.name) &&
        Objects.equals(this.typeName, associatedItemBean.typeName) &&
        Objects.equals(this.parentId, associatedItemBean.parentId) &&
        Objects.equals(this.parentName, associatedItemBean.parentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, typeName, parentId, parentName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatedItemBean {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
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
