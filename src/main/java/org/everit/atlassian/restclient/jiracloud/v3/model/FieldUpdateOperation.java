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


package org.everit.atlassian.restclient.jiracloud.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Details of an operation to perform on a field.
 */
@ApiModel(description = "Details of an operation to perform on a field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-30T17:05:45.596+02:00[Europe/Prague]")
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
                    public class FieldUpdateOperation {
  @JsonProperty("add")
  private Object add = null;

  @JsonProperty("set")
  private Object set = null;

  @JsonProperty("remove")
  private Object remove = null;

  @JsonProperty("edit")
  private Object edit = null;

  public FieldUpdateOperation add(Object add) {
    this.add = add;
    return this;
  }

   /**
   * A map containing the name of a field and the value to add to it.
   * @return add
  **/
  @ApiModelProperty(example = "{\"labels\":\"Training\",\"issuelinks\":{\"id\":10001}}", value = "A map containing the name of a field and the value to add to it.")
  public Object getAdd() {
    return add;
  }

  public void setAdd(Object add) {
    this.add = add;
  }

  public FieldUpdateOperation set(Object set) {
    this.set = set;
    return this;
  }

   /**
   * A map containing the name of a field and the value to set in it.
   * @return set
  **/
  @ApiModelProperty(example = "{\"summary\":\"A new summary\",\"issuetype\":{\"id\":10010}}", value = "A map containing the name of a field and the value to set in it.")
  public Object getSet() {
    return set;
  }

  public void setSet(Object set) {
    this.set = set;
  }

  public FieldUpdateOperation remove(Object remove) {
    this.remove = remove;
    return this;
  }

   /**
   * A map containing the name of a field and the value to removed from it.
   * @return remove
  **/
  @ApiModelProperty(example = "{\"labels\":\"Training\",\"components\":{\"id\":10017}}", value = "A map containing the name of a field and the value to removed from it.")
  public Object getRemove() {
    return remove;
  }

  public void setRemove(Object remove) {
    this.remove = remove;
  }

  public FieldUpdateOperation edit(Object edit) {
    this.edit = edit;
    return this;
  }

   /**
   * A map containing the name of a field and the value to edit in it.
   * @return edit
  **/
  @ApiModelProperty(example = "{\"timetracking\":{\"key\":\"JIRA\"}}", value = "A map containing the name of a field and the value to edit in it.")
  public Object getEdit() {
    return edit;
  }

  public void setEdit(Object edit) {
    this.edit = edit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldUpdateOperation fieldUpdateOperation = (FieldUpdateOperation) o;
    return Objects.equals(this.add, fieldUpdateOperation.add) &&
        Objects.equals(this.set, fieldUpdateOperation.set) &&
        Objects.equals(this.remove, fieldUpdateOperation.remove) &&
        Objects.equals(this.edit, fieldUpdateOperation.edit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, set, remove, edit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldUpdateOperation {\n");
    
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
    sb.append("    remove: ").append(toIndentedString(remove)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
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

