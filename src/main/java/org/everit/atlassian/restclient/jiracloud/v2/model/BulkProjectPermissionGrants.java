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

/**
 * List of project permissions and the projects and issues those permissions grant access to.
 */
@ApiModel(description = "List of project permissions and the projects and issues those permissions grant access to.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:24.924+02:00[Europe/Prague]")
public class BulkProjectPermissionGrants {
  @JsonProperty("permission")
  private String permission;

  @JsonProperty("issues")
  private List<Long> issues = new ArrayList<>();

  @JsonProperty("projects")
  private List<Long> projects = new ArrayList<>();

  public BulkProjectPermissionGrants permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * A project permission,
   * @return permission
  **/
  @ApiModelProperty(required = true, value = "A project permission,")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public BulkProjectPermissionGrants issues(List<Long> issues) {
    this.issues = issues;
    return this;
  }

  public BulkProjectPermissionGrants addIssuesItem(Long issuesItem) {
    this.issues.add(issuesItem);
    return this;
  }

   /**
   * IDs of the issues the user has the permission for.
   * @return issues
  **/
  @ApiModelProperty(required = true, value = "IDs of the issues the user has the permission for.")
  public List<Long> getIssues() {
    return issues;
  }

  public void setIssues(List<Long> issues) {
    this.issues = issues;
  }

  public BulkProjectPermissionGrants projects(List<Long> projects) {
    this.projects = projects;
    return this;
  }

  public BulkProjectPermissionGrants addProjectsItem(Long projectsItem) {
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * IDs of the projects the user has the permission for.
   * @return projects
  **/
  @ApiModelProperty(required = true, value = "IDs of the projects the user has the permission for.")
  public List<Long> getProjects() {
    return projects;
  }

  public void setProjects(List<Long> projects) {
    this.projects = projects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkProjectPermissionGrants bulkProjectPermissionGrants = (BulkProjectPermissionGrants) o;
    return Objects.equals(this.permission, bulkProjectPermissionGrants.permission) &&
        Objects.equals(this.issues, bulkProjectPermissionGrants.issues) &&
        Objects.equals(this.projects, bulkProjectPermissionGrants.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, issues, projects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkProjectPermissionGrants {\n");
    
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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

