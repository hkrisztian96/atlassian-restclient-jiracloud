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
import java.util.ArrayList;
import java.util.List;
import org.everit.atlassian.restclient.jiracloud.v3.model.Avatar;

/**
 * List of project avatars.
 */
@ApiModel(description = "List of project avatars.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-05T12:17:37.034+02:00[Europe/Prague]")
public class ProjectAvatars {
  @JsonProperty("system")
  private List<Avatar> system = new ArrayList<>();

  @JsonProperty("custom")
  private List<Avatar> custom = new ArrayList<>();

   /**
   * List of avatars included with Jira. These avatars cannot be deleted.
   * @return system
  **/
  @ApiModelProperty(value = "List of avatars included with Jira. These avatars cannot be deleted.")
  public List<Avatar> getSystem() {
    return system;
  }

   /**
   * List of avatars added to Jira. These avatars may be deleted.
   * @return custom
  **/
  @ApiModelProperty(value = "List of avatars added to Jira. These avatars may be deleted.")
  public List<Avatar> getCustom() {
    return custom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectAvatars projectAvatars = (ProjectAvatars) o;
    return Objects.equals(this.system, projectAvatars.system) &&
        Objects.equals(this.custom, projectAvatars.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(system, custom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectAvatars {\n");
    
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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
