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
import org.everit.atlassian.restclient.jiracloud.v2.model.SimpleErrorCollection;

/**
 * RemoveOptionFromIssuesResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:24.924+02:00[Europe/Prague]")
public class RemoveOptionFromIssuesResult {
  @JsonProperty("modifiedIssues")
  private List<Long> modifiedIssues = new ArrayList<>();

  @JsonProperty("unmodifiedIssues")
  private List<Long> unmodifiedIssues = new ArrayList<>();

  @JsonProperty("errors")
  private SimpleErrorCollection errors;

  public RemoveOptionFromIssuesResult modifiedIssues(List<Long> modifiedIssues) {
    this.modifiedIssues = modifiedIssues;
    return this;
  }

  public RemoveOptionFromIssuesResult addModifiedIssuesItem(Long modifiedIssuesItem) {
    if (this.modifiedIssues == null) {
      this.modifiedIssues = new ArrayList<>();
    }
    this.modifiedIssues.add(modifiedIssuesItem);
    return this;
  }

   /**
   * The IDs of the modified issues.
   * @return modifiedIssues
  **/
  @ApiModelProperty(value = "The IDs of the modified issues.")
  public List<Long> getModifiedIssues() {
    return modifiedIssues;
  }

  public void setModifiedIssues(List<Long> modifiedIssues) {
    this.modifiedIssues = modifiedIssues;
  }

  public RemoveOptionFromIssuesResult unmodifiedIssues(List<Long> unmodifiedIssues) {
    this.unmodifiedIssues = unmodifiedIssues;
    return this;
  }

  public RemoveOptionFromIssuesResult addUnmodifiedIssuesItem(Long unmodifiedIssuesItem) {
    if (this.unmodifiedIssues == null) {
      this.unmodifiedIssues = new ArrayList<>();
    }
    this.unmodifiedIssues.add(unmodifiedIssuesItem);
    return this;
  }

   /**
   * The IDs of the unchanged issues, those issues where errors prevent modification.
   * @return unmodifiedIssues
  **/
  @ApiModelProperty(value = "The IDs of the unchanged issues, those issues where errors prevent modification.")
  public List<Long> getUnmodifiedIssues() {
    return unmodifiedIssues;
  }

  public void setUnmodifiedIssues(List<Long> unmodifiedIssues) {
    this.unmodifiedIssues = unmodifiedIssues;
  }

  public RemoveOptionFromIssuesResult errors(SimpleErrorCollection errors) {
    this.errors = errors;
    return this;
  }

   /**
   * A collection of errors related to unchanged issues. The collection size is limited, which means not all errors may be returned.
   * @return errors
  **/
  @ApiModelProperty(value = "A collection of errors related to unchanged issues. The collection size is limited, which means not all errors may be returned.")
  public SimpleErrorCollection getErrors() {
    return errors;
  }

  public void setErrors(SimpleErrorCollection errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveOptionFromIssuesResult removeOptionFromIssuesResult = (RemoveOptionFromIssuesResult) o;
    return Objects.equals(this.modifiedIssues, removeOptionFromIssuesResult.modifiedIssues) &&
        Objects.equals(this.unmodifiedIssues, removeOptionFromIssuesResult.unmodifiedIssues) &&
        Objects.equals(this.errors, removeOptionFromIssuesResult.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifiedIssues, unmodifiedIssues, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveOptionFromIssuesResult {\n");
    
    sb.append("    modifiedIssues: ").append(toIndentedString(modifiedIssues)).append("\n");
    sb.append("    unmodifiedIssues: ").append(toIndentedString(unmodifiedIssues)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

