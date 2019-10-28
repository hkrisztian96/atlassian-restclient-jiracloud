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
 * List of custom fields using the version.
 */
@ApiModel(description = "List of custom fields using the version.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-05T12:17:37.034+02:00[Europe/Prague]")
public class VersionUsageInCustomField {
  @JsonProperty("fieldName")
  private String fieldName;

  @JsonProperty("customFieldId")
  private Long customFieldId;

  @JsonProperty("issueCountWithVersionInCustomField")
  private Long issueCountWithVersionInCustomField;

   /**
   * The name of the custom field.
   * @return fieldName
  **/
  @ApiModelProperty(value = "The name of the custom field.")
  public String getFieldName() {
    return fieldName;
  }

   /**
   * The ID of the custom field.
   * @return customFieldId
  **/
  @ApiModelProperty(value = "The ID of the custom field.")
  public Long getCustomFieldId() {
    return customFieldId;
  }

   /**
   * Count of the issues where the custom field contains the version.
   * @return issueCountWithVersionInCustomField
  **/
  @ApiModelProperty(value = "Count of the issues where the custom field contains the version.")
  public Long getIssueCountWithVersionInCustomField() {
    return issueCountWithVersionInCustomField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionUsageInCustomField versionUsageInCustomField = (VersionUsageInCustomField) o;
    return Objects.equals(this.fieldName, versionUsageInCustomField.fieldName) &&
        Objects.equals(this.customFieldId, versionUsageInCustomField.customFieldId) &&
        Objects.equals(this.issueCountWithVersionInCustomField, versionUsageInCustomField.issueCountWithVersionInCustomField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, customFieldId, issueCountWithVersionInCustomField);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionUsageInCustomField {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    customFieldId: ").append(toIndentedString(customFieldId)).append("\n");
    sb.append("    issueCountWithVersionInCustomField: ").append(toIndentedString(issueCountWithVersionInCustomField)).append("\n");
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
