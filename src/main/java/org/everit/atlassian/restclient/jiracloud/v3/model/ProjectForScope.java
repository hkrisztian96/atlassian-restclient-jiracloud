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
import org.everit.atlassian.restclient.jiracloud.v3.model.AvatarUrlsBean;
import org.everit.atlassian.restclient.jiracloud.v3.model.UpdatedProjectCategory;

/**
 * Details about a next-gen project.
 */
@ApiModel(description = "Details about a next-gen project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:32.013+02:00[Europe/Prague]")
public class ProjectForScope {
  @JsonProperty("self")
  private String self;

  @JsonProperty("id")
  private String id;

  @JsonProperty("key")
  private String key;

  @JsonProperty("name")
  private String name;

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   */
  public enum ProjectTypeKeyEnum {
    SOFTWARE("software"),
    
    SERVICE_DESK("service_desk"),
    
    BUSINESS("business");

    private String value;

    ProjectTypeKeyEnum(String value) {
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
    public static ProjectTypeKeyEnum fromValue(String value) {
      for (ProjectTypeKeyEnum b : ProjectTypeKeyEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("projectTypeKey")
  private ProjectTypeKeyEnum projectTypeKey;

  @JsonProperty("simplified")
  private Boolean simplified;

  @JsonProperty("avatarUrls")
  private AvatarUrlsBean avatarUrls;

  @JsonProperty("projectCategory")
  private UpdatedProjectCategory projectCategory;

   /**
   * The URL of the project details.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the project details.")
  public String getSelf() {
    return self;
  }

  public ProjectForScope id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the project.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the project.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The key of the project.
   * @return key
  **/
  @ApiModelProperty(value = "The key of the project.")
  public String getKey() {
    return key;
  }

   /**
   * The name of the project.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the project.")
  public String getName() {
    return name;
  }

   /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   * @return projectTypeKey
  **/
  @ApiModelProperty(value = "The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.")
  public ProjectTypeKeyEnum getProjectTypeKey() {
    return projectTypeKey;
  }

   /**
   * Whether or not the project is simplified.
   * @return simplified
  **/
  @ApiModelProperty(value = "Whether or not the project is simplified.")
  public Boolean getSimplified() {
    return simplified;
  }

   /**
   * The URLs of the project&#39;s avatars.
   * @return avatarUrls
  **/
  @ApiModelProperty(value = "The URLs of the project's avatars.")
  public AvatarUrlsBean getAvatarUrls() {
    return avatarUrls;
  }

   /**
   * The category the project belongs to.
   * @return projectCategory
  **/
  @ApiModelProperty(value = "The category the project belongs to.")
  public UpdatedProjectCategory getProjectCategory() {
    return projectCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectForScope projectForScope = (ProjectForScope) o;
    return Objects.equals(this.self, projectForScope.self) &&
        Objects.equals(this.id, projectForScope.id) &&
        Objects.equals(this.key, projectForScope.key) &&
        Objects.equals(this.name, projectForScope.name) &&
        Objects.equals(this.projectTypeKey, projectForScope.projectTypeKey) &&
        Objects.equals(this.simplified, projectForScope.simplified) &&
        Objects.equals(this.avatarUrls, projectForScope.avatarUrls) &&
        Objects.equals(this.projectCategory, projectForScope.projectCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, key, name, projectTypeKey, simplified, avatarUrls, projectCategory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectForScope {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectTypeKey: ").append(toIndentedString(projectTypeKey)).append("\n");
    sb.append("    simplified: ").append(toIndentedString(simplified)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    projectCategory: ").append(toIndentedString(projectCategory)).append("\n");
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

