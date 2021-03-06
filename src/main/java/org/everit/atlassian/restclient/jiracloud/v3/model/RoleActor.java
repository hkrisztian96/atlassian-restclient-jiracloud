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
import java.net.URI;
import org.everit.atlassian.restclient.jiracloud.v3.model.ProjectRoleGroupBean;
import org.everit.atlassian.restclient.jiracloud.v3.model.ProjectRoleUserBean;

/**
 * Details about a user assigned to a project role.
 */
@ApiModel(description = "Details about a user assigned to a project role.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-05T12:17:37.034+02:00[Europe/Prague]")
public class RoleActor {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("type")
  private String type;

  @JsonProperty("name")
  private String name;

  @JsonProperty("avatarUrl")
  private URI avatarUrl;

  @JsonProperty("actorUser")
  private ProjectRoleUserBean actorUser;

  @JsonProperty("actorGroup")
  private ProjectRoleGroupBean actorGroup;

  @JsonProperty("user")
  private String user;

  public RoleActor id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

   /**
   * The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
   * @return displayName
  **/
  @ApiModelProperty(value = "The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.")
  public String getDisplayName() {
    return displayName;
  }

  public RoleActor type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

   /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return name
  **/
  @ApiModelProperty(value = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")
  public String getName() {
    return name;
  }

  public RoleActor avatarUrl(URI avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "")
  public URI getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(URI avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public RoleActor actorUser(ProjectRoleUserBean actorUser) {
    this.actorUser = actorUser;
    return this;
  }

   /**
   * Get actorUser
   * @return actorUser
  **/
  @ApiModelProperty(value = "")
  public ProjectRoleUserBean getActorUser() {
    return actorUser;
  }

  public void setActorUser(ProjectRoleUserBean actorUser) {
    this.actorUser = actorUser;
  }

  public RoleActor actorGroup(ProjectRoleGroupBean actorGroup) {
    this.actorGroup = actorGroup;
    return this;
  }

   /**
   * Get actorGroup
   * @return actorGroup
  **/
  @ApiModelProperty(value = "")
  public ProjectRoleGroupBean getActorGroup() {
    return actorGroup;
  }

  public void setActorGroup(ProjectRoleGroupBean actorGroup) {
    this.actorGroup = actorGroup;
  }

  public RoleActor user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleActor roleActor = (RoleActor) o;
    return Objects.equals(this.id, roleActor.id) &&
        Objects.equals(this.displayName, roleActor.displayName) &&
        Objects.equals(this.type, roleActor.type) &&
        Objects.equals(this.name, roleActor.name) &&
        Objects.equals(this.avatarUrl, roleActor.avatarUrl) &&
        Objects.equals(this.actorUser, roleActor.actorUser) &&
        Objects.equals(this.actorGroup, roleActor.actorGroup) &&
        Objects.equals(this.user, roleActor.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, type, name, avatarUrl, actorUser, actorGroup, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleActor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    actorUser: ").append(toIndentedString(actorUser)).append("\n");
    sb.append("    actorGroup: ").append(toIndentedString(actorGroup)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

