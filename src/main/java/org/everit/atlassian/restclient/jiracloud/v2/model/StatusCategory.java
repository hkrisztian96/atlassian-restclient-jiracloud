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
import java.util.HashMap;
import java.util.Map;

/**
 * A status category.
 */
@ApiModel(description = "A status category.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:24.924+02:00[Europe/Prague]")
public class StatusCategory {
  @JsonProperty("self")
  private String self;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("key")
  private String key;

  @JsonProperty("colorName")
  private String colorName;

  @JsonProperty("name")
  private String name;

  private HashMap<String, Object> additionalProperties_ = new HashMap<String, Object>();

   /**
   * The URL of the status category.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the status category.")
  public String getSelf() {
    return self;
  }

   /**
   * The ID of the status category.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the status category.")
  public Long getId() {
    return id;
  }

   /**
   * The key of the status category.
   * @return key
  **/
  @ApiModelProperty(value = "The key of the status category.")
  public String getKey() {
    return key;
  }

   /**
   * The name of the color used to represent the status category.
   * @return colorName
  **/
  @ApiModelProperty(value = "The name of the color used to represent the status category.")
  public String getColorName() {
    return colorName;
  }

   /**
   * The name of the status category.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the status category.")
  public String getName() {
    return name;
  }


  @com.fasterxml.jackson.annotation.JsonAnyGetter
  public Map<String, Object> any() {
   return this.additionalProperties_;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter
  public void set(String name, Object value) {
   this.additionalProperties_.put(name, value);
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCategory statusCategory = (StatusCategory) o;
    return Objects.equals(this.self, statusCategory.self) &&
        Objects.equals(this.id, statusCategory.id) &&
        Objects.equals(this.key, statusCategory.key) &&
        Objects.equals(this.colorName, statusCategory.colorName) &&
        Objects.equals(this.name, statusCategory.name) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, key, colorName, name, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCategory {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    colorName: ").append(toIndentedString(colorName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties_)).append("\n");
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

