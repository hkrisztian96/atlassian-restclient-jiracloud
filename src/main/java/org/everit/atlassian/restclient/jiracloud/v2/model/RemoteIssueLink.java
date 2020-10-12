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
import org.everit.atlassian.restclient.jiracloud.v2.model.Application;
import org.everit.atlassian.restclient.jiracloud.v2.model.RemoteObject;

/**
 * Details of an issue remote link.
 */
@ApiModel(description = "Details of an issue remote link.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:24.924+02:00[Europe/Prague]")
public class RemoteIssueLink {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("self")
  private URI self;

  @JsonProperty("globalId")
  private String globalId;

  @JsonProperty("application")
  private Application application;

  @JsonProperty("relationship")
  private String relationship;

  @JsonProperty("object")
  private RemoteObject _object;

  public RemoteIssueLink id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the link.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the link.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RemoteIssueLink self(URI self) {
    this.self = self;
    return this;
  }

   /**
   * The URL of the link.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the link.")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public RemoteIssueLink globalId(String globalId) {
    this.globalId = globalId;
    return this;
  }

   /**
   * The global ID of the link, such as the ID of the item on the remote system.
   * @return globalId
  **/
  @ApiModelProperty(value = "The global ID of the link, such as the ID of the item on the remote system.")
  public String getGlobalId() {
    return globalId;
  }

  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }

  public RemoteIssueLink application(Application application) {
    this.application = application;
    return this;
  }

   /**
   * Details of the remote application the linked item is in.
   * @return application
  **/
  @ApiModelProperty(value = "Details of the remote application the linked item is in.")
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public RemoteIssueLink relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }

   /**
   * Description of the relationship between the issue and the linked item.
   * @return relationship
  **/
  @ApiModelProperty(value = "Description of the relationship between the issue and the linked item.")
  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }

  public RemoteIssueLink _object(RemoteObject _object) {
    this._object = _object;
    return this;
  }

   /**
   * Details of the item linked to.
   * @return _object
  **/
  @ApiModelProperty(value = "Details of the item linked to.")
  public RemoteObject getObject() {
    return _object;
  }

  public void setObject(RemoteObject _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteIssueLink remoteIssueLink = (RemoteIssueLink) o;
    return Objects.equals(this.id, remoteIssueLink.id) &&
        Objects.equals(this.self, remoteIssueLink.self) &&
        Objects.equals(this.globalId, remoteIssueLink.globalId) &&
        Objects.equals(this.application, remoteIssueLink.application) &&
        Objects.equals(this.relationship, remoteIssueLink.relationship) &&
        Objects.equals(this._object, remoteIssueLink._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, self, globalId, application, relationship, _object);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteIssueLink {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

