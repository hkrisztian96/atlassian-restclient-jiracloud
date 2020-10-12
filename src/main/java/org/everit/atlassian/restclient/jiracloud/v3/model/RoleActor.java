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
import org.everit.atlassian.restclient.jiracloud.v3.model.ProjectRoleGroup;
import org.everit.atlassian.restclient.jiracloud.v3.model.ProjectRoleUser;

/**
 * Details about a user assigned to a project role.
 */
@ApiModel(description = "Details about a user assigned to a project role.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:32.013+02:00[Europe/Prague]")
public class RoleActor {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("displayName")
  private String displayName;

  /**
   * The type of role actor.
   */
  public enum TypeEnum {
    GROUP_ROLE_ACTOR("atlassian-group-role-actor"),
    
    USER_ROLE_ACTOR("atlassian-user-role-actor");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("name")
  private String name;

  @JsonProperty("avatarUrl")
  private URI avatarUrl;

  @JsonProperty("actorUser")
  private ProjectRoleUser actorUser;

  @JsonProperty("actorGroup")
  private ProjectRoleGroup actorGroup;

   /**
   * The ID of the role actor.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the role actor.")
  public Long getId() {
    return id;
  }

   /**
   * The display name of the role actor. For users, depending on the user’s privacy setting, this may return an alternative value for the user&#39;s name.
   * @return displayName
  **/
  @ApiModelProperty(value = "The display name of the role actor. For users, depending on the user’s privacy setting, this may return an alternative value for the user's name.")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * The type of role actor.
   * @return type
  **/
  @ApiModelProperty(value = "The type of role actor.")
  public TypeEnum getType() {
    return type;
  }

   /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return name
  **/
  @ApiModelProperty(value = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")
  public String getName() {
    return name;
  }

   /**
   * The avatar of the role actor.
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "The avatar of the role actor.")
  public URI getAvatarUrl() {
    return avatarUrl;
  }

   /**
   * Get actorUser
   * @return actorUser
  **/
  @ApiModelProperty(value = "")
  public ProjectRoleUser getActorUser() {
    return actorUser;
  }

   /**
   * Get actorGroup
   * @return actorGroup
  **/
  @ApiModelProperty(value = "")
  public ProjectRoleGroup getActorGroup() {
    return actorGroup;
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
        Objects.equals(this.actorGroup, roleActor.actorGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, type, name, avatarUrl, actorUser, actorGroup);
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

