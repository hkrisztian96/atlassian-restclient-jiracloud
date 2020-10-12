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
import org.everit.atlassian.restclient.jiracloud.v2.model.GroupName;
import org.everit.atlassian.restclient.jiracloud.v2.model.User;

/**
 * Details of a user or group subscribing to a filter.
 */
@ApiModel(description = "Details of a user or group subscribing to a filter.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:24.924+02:00[Europe/Prague]")
public class FilterSubscription {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("user")
  private User user;

  @JsonProperty("group")
  private GroupName group;

   /**
   * The ID of the filter subscription.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the filter subscription.")
  public Long getId() {
    return id;
  }

   /**
   * The user subscribing to filter.
   * @return user
  **/
  @ApiModelProperty(value = "The user subscribing to filter.")
  public User getUser() {
    return user;
  }

   /**
   * The group subscribing to filter.
   * @return group
  **/
  @ApiModelProperty(value = "The group subscribing to filter.")
  public GroupName getGroup() {
    return group;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterSubscription filterSubscription = (FilterSubscription) o;
    return Objects.equals(this.id, filterSubscription.id) &&
        Objects.equals(this.user, filterSubscription.user) &&
        Objects.equals(this.group, filterSubscription.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, group);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterSubscription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

