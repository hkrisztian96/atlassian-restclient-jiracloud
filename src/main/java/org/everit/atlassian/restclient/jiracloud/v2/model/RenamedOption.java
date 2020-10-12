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
import java.util.ArrayList;
import java.util.List;
import org.everit.atlassian.restclient.jiracloud.v2.model.RenamedCascadingOption;

/**
 * Details of a custom field option to rename.
 */
@ApiModel(description = "Details of a custom field option to rename.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:24.924+02:00[Europe/Prague]")
public class RenamedOption {
  @JsonProperty("value")
  private String value;

  @JsonProperty("newValue")
  private String newValue;

  @JsonProperty("cascadingOptions")
  private List<RenamedCascadingOption> cascadingOptions = new ArrayList<>();

  public RenamedOption value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The current option value.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The current option value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public RenamedOption newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

   /**
   * The new value of the option.
   * @return newValue
  **/
  @ApiModelProperty(required = true, value = "The new value of the option.")
  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }

  public RenamedOption cascadingOptions(List<RenamedCascadingOption> cascadingOptions) {
    this.cascadingOptions = cascadingOptions;
    return this;
  }

  public RenamedOption addCascadingOptionsItem(RenamedCascadingOption cascadingOptionsItem) {
    if (this.cascadingOptions == null) {
      this.cascadingOptions = new ArrayList<>();
    }
    this.cascadingOptions.add(cascadingOptionsItem);
    return this;
  }

   /**
   * The new values for the cascading options of this option. Only used for Select List (cascading) fields.
   * @return cascadingOptions
  **/
  @ApiModelProperty(value = "The new values for the cascading options of this option. Only used for Select List (cascading) fields.")
  public List<RenamedCascadingOption> getCascadingOptions() {
    return cascadingOptions;
  }

  public void setCascadingOptions(List<RenamedCascadingOption> cascadingOptions) {
    this.cascadingOptions = cascadingOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenamedOption renamedOption = (RenamedOption) o;
    return Objects.equals(this.value, renamedOption.value) &&
        Objects.equals(this.newValue, renamedOption.newValue) &&
        Objects.equals(this.cascadingOptions, renamedOption.cascadingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, newValue, cascadingOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenamedOption {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    cascadingOptions: ").append(toIndentedString(cascadingOptions)).append("\n");
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

