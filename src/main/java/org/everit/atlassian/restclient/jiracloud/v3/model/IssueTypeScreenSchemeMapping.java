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
 * The IDs of the screen schemes for the issue type IDs.
 */
@ApiModel(description = "The IDs of the screen schemes for the issue type IDs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:32.013+02:00[Europe/Prague]")
public class IssueTypeScreenSchemeMapping {
  @JsonProperty("issueTypeId")
  private String issueTypeId;

  @JsonProperty("screenSchemeId")
  private String screenSchemeId;

  public IssueTypeScreenSchemeMapping issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

   /**
   * The ID of the issue type or *default*. Only issue types used in classic projects are accepted. An entry for *default* must be provided and defines the mapping for all issue types without a screen scheme.
   * @return issueTypeId
  **/
  @ApiModelProperty(required = true, value = "The ID of the issue type or *default*. Only issue types used in classic projects are accepted. An entry for *default* must be provided and defines the mapping for all issue types without a screen scheme.")
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  public IssueTypeScreenSchemeMapping screenSchemeId(String screenSchemeId) {
    this.screenSchemeId = screenSchemeId;
    return this;
  }

   /**
   * The ID of the screen scheme. Only screen schemes used in classic projects are accepted.
   * @return screenSchemeId
  **/
  @ApiModelProperty(required = true, value = "The ID of the screen scheme. Only screen schemes used in classic projects are accepted.")
  public String getScreenSchemeId() {
    return screenSchemeId;
  }

  public void setScreenSchemeId(String screenSchemeId) {
    this.screenSchemeId = screenSchemeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeScreenSchemeMapping issueTypeScreenSchemeMapping = (IssueTypeScreenSchemeMapping) o;
    return Objects.equals(this.issueTypeId, issueTypeScreenSchemeMapping.issueTypeId) &&
        Objects.equals(this.screenSchemeId, issueTypeScreenSchemeMapping.screenSchemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeId, screenSchemeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenSchemeMapping {\n");
    
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    screenSchemeId: ").append(toIndentedString(screenSchemeId)).append("\n");
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

