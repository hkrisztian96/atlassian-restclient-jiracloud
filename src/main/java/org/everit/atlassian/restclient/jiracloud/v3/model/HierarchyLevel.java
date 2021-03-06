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
import java.util.UUID;

/**
 * HierarchyLevel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-05T12:17:37.034+02:00[Europe/Prague]")
public class HierarchyLevel {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("aboveLevelId")
  private Long aboveLevelId;

  @JsonProperty("belowLevelId")
  private Long belowLevelId;

  @JsonProperty("projectConfigurationId")
  private Long projectConfigurationId;

  @JsonProperty("issueTypeIds")
  private List<Long> issueTypeIds = new ArrayList<>();

  @JsonProperty("externalUuid")
  private UUID externalUuid;

  public HierarchyLevel id(Long id) {
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

  public HierarchyLevel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HierarchyLevel aboveLevelId(Long aboveLevelId) {
    this.aboveLevelId = aboveLevelId;
    return this;
  }

   /**
   * Get aboveLevelId
   * @return aboveLevelId
  **/
  @ApiModelProperty(value = "")
  public Long getAboveLevelId() {
    return aboveLevelId;
  }

  public void setAboveLevelId(Long aboveLevelId) {
    this.aboveLevelId = aboveLevelId;
  }

  public HierarchyLevel belowLevelId(Long belowLevelId) {
    this.belowLevelId = belowLevelId;
    return this;
  }

   /**
   * Get belowLevelId
   * @return belowLevelId
  **/
  @ApiModelProperty(value = "")
  public Long getBelowLevelId() {
    return belowLevelId;
  }

  public void setBelowLevelId(Long belowLevelId) {
    this.belowLevelId = belowLevelId;
  }

  public HierarchyLevel projectConfigurationId(Long projectConfigurationId) {
    this.projectConfigurationId = projectConfigurationId;
    return this;
  }

   /**
   * Get projectConfigurationId
   * @return projectConfigurationId
  **/
  @ApiModelProperty(value = "")
  public Long getProjectConfigurationId() {
    return projectConfigurationId;
  }

  public void setProjectConfigurationId(Long projectConfigurationId) {
    this.projectConfigurationId = projectConfigurationId;
  }

  public HierarchyLevel issueTypeIds(List<Long> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
    return this;
  }

  public HierarchyLevel addIssueTypeIdsItem(Long issueTypeIdsItem) {
    if (this.issueTypeIds == null) {
      this.issueTypeIds = new ArrayList<>();
    }
    this.issueTypeIds.add(issueTypeIdsItem);
    return this;
  }

   /**
   * Get issueTypeIds
   * @return issueTypeIds
  **/
  @ApiModelProperty(value = "")
  public List<Long> getIssueTypeIds() {
    return issueTypeIds;
  }

  public void setIssueTypeIds(List<Long> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }

  public HierarchyLevel externalUuid(UUID externalUuid) {
    this.externalUuid = externalUuid;
    return this;
  }

   /**
   * Get externalUuid
   * @return externalUuid
  **/
  @ApiModelProperty(value = "")
  public UUID getExternalUuid() {
    return externalUuid;
  }

  public void setExternalUuid(UUID externalUuid) {
    this.externalUuid = externalUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HierarchyLevel hierarchyLevel = (HierarchyLevel) o;
    return Objects.equals(this.id, hierarchyLevel.id) &&
        Objects.equals(this.name, hierarchyLevel.name) &&
        Objects.equals(this.aboveLevelId, hierarchyLevel.aboveLevelId) &&
        Objects.equals(this.belowLevelId, hierarchyLevel.belowLevelId) &&
        Objects.equals(this.projectConfigurationId, hierarchyLevel.projectConfigurationId) &&
        Objects.equals(this.issueTypeIds, hierarchyLevel.issueTypeIds) &&
        Objects.equals(this.externalUuid, hierarchyLevel.externalUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, aboveLevelId, belowLevelId, projectConfigurationId, issueTypeIds, externalUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HierarchyLevel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    aboveLevelId: ").append(toIndentedString(aboveLevelId)).append("\n");
    sb.append("    belowLevelId: ").append(toIndentedString(belowLevelId)).append("\n");
    sb.append("    projectConfigurationId: ").append(toIndentedString(projectConfigurationId)).append("\n");
    sb.append("    issueTypeIds: ").append(toIndentedString(issueTypeIds)).append("\n");
    sb.append("    externalUuid: ").append(toIndentedString(externalUuid)).append("\n");
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

