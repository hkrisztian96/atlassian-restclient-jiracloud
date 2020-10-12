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
import java.net.URI;

/**
 * This object is used as follows:   *  In the [ issueLink](#api-rest-api-2-issueLink-post) resource it defines and reports on the type of link between the issues. Find a list of issue link types with [Get issue link types](#api-rest-api-2-issueLinkType-get).  *  In the [ issueLinkType](#api-rest-api-2-issueLinkType-post) resource it defines and reports on issue link types.
 */
@ApiModel(description = "This object is used as follows:   *  In the [ issueLink](#api-rest-api-2-issueLink-post) resource it defines and reports on the type of link between the issues. Find a list of issue link types with [Get issue link types](#api-rest-api-2-issueLinkType-get).  *  In the [ issueLinkType](#api-rest-api-2-issueLinkType-post) resource it defines and reports on issue link types.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:24.924+02:00[Europe/Prague]")
public class IssueLinkType {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("inward")
  private String inward;

  @JsonProperty("outward")
  private String outward;

  @JsonProperty("self")
  private URI self;

  public IssueLinkType id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the issue link type and is used as follows:   *  In the [ issueLink](#api-rest-api-2-issueLink-post) resource it is the type of issue link. Required on create when &#x60;name&#x60; isn&#39;t provided. Otherwise, read only.  *  In the [ issueLinkType](#api-rest-api-2-issueLinkType-post) resource it is read only.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the issue link type and is used as follows:   *  In the [ issueLink](#api-rest-api-2-issueLink-post) resource it is the type of issue link. Required on create when `name` isn't provided. Otherwise, read only.  *  In the [ issueLinkType](#api-rest-api-2-issueLinkType-post) resource it is read only.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IssueLinkType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the issue link type and is used as follows:   *  In the [ issueLink](#api-rest-api-2-issueLink-post) resource it is the type of issue link. Required on create when &#x60;id&#x60; isn&#39;t provided. Otherwise, read only.  *  In the [ issueLinkType](#api-rest-api-2-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the issue link type and is used as follows:   *  In the [ issueLink](#api-rest-api-2-issueLink-post) resource it is the type of issue link. Required on create when `id` isn't provided. Otherwise, read only.  *  In the [ issueLinkType](#api-rest-api-2-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IssueLinkType inward(String inward) {
    this.inward = inward;
    return this;
  }

   /**
   * The description of the issue link type inward link and is used as follows:   *  In the [ issueLink](#api-rest-api-2-issueLink-post) resource it is read only.  *  In the [ issueLinkType](#api-rest-api-2-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
   * @return inward
  **/
  @ApiModelProperty(value = "The description of the issue link type inward link and is used as follows:   *  In the [ issueLink](#api-rest-api-2-issueLink-post) resource it is read only.  *  In the [ issueLinkType](#api-rest-api-2-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.")
  public String getInward() {
    return inward;
  }

  public void setInward(String inward) {
    this.inward = inward;
  }

  public IssueLinkType outward(String outward) {
    this.outward = outward;
    return this;
  }

   /**
   * The description of the issue link type outward link and is used as follows:   *  In the [ issueLink](#api-rest-api-2-issueLink-post) resource it is read only.  *  In the [ issueLinkType](#api-rest-api-2-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
   * @return outward
  **/
  @ApiModelProperty(value = "The description of the issue link type outward link and is used as follows:   *  In the [ issueLink](#api-rest-api-2-issueLink-post) resource it is read only.  *  In the [ issueLinkType](#api-rest-api-2-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.")
  public String getOutward() {
    return outward;
  }

  public void setOutward(String outward) {
    this.outward = outward;
  }

   /**
   * The URL of the issue link type. Read only.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the issue link type. Read only.")
  public URI getSelf() {
    return self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLinkType issueLinkType = (IssueLinkType) o;
    return Objects.equals(this.id, issueLinkType.id) &&
        Objects.equals(this.name, issueLinkType.name) &&
        Objects.equals(this.inward, issueLinkType.inward) &&
        Objects.equals(this.outward, issueLinkType.outward) &&
        Objects.equals(this.self, issueLinkType.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, inward, outward, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLinkType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inward: ").append(toIndentedString(inward)).append("\n");
    sb.append("    outward: ").append(toIndentedString(outward)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

