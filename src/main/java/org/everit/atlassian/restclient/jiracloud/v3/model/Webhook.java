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

/**
 * A webhook.
 */
@ApiModel(description = "A webhook.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:32.013+02:00[Europe/Prague]")
public class Webhook {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("jqlFilter")
  private String jqlFilter;

  /**
   * Gets or Sets events
   */
  public enum EventsEnum {
    JIRA_ISSUE_CREATED("jira:issue_created"),
    
    JIRA_ISSUE_UPDATED("jira:issue_updated"),
    
    JIRA_ISSUE_DELETED("jira:issue_deleted"),
    
    COMMENT_CREATED("comment_created"),
    
    COMMENT_UPDATED("comment_updated"),
    
    COMMENT_DELETED("comment_deleted"),
    
    ISSUE_PROPERTY_SET("issue_property_set"),
    
    ISSUE_PROPERTY_DELETED("issue_property_deleted");

    private String value;

    EventsEnum(String value) {
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
    public static EventsEnum fromValue(String value) {
      for (EventsEnum b : EventsEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("events")
  private List<EventsEnum> events = new ArrayList<>();

  @JsonProperty("expirationDate")
  private Long expirationDate;

  public Webhook id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the webhook.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the webhook.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Webhook jqlFilter(String jqlFilter) {
    this.jqlFilter = jqlFilter;
    return this;
  }

   /**
   * The JQL filter that specifies which issues the webhook is sent for.
   * @return jqlFilter
  **/
  @ApiModelProperty(required = true, value = "The JQL filter that specifies which issues the webhook is sent for.")
  public String getJqlFilter() {
    return jqlFilter;
  }

  public void setJqlFilter(String jqlFilter) {
    this.jqlFilter = jqlFilter;
  }

  public Webhook events(List<EventsEnum> events) {
    this.events = events;
    return this;
  }

  public Webhook addEventsItem(EventsEnum eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * The Jira events that trigger the webhook.
   * @return events
  **/
  @ApiModelProperty(value = "The Jira events that trigger the webhook.")
  public List<EventsEnum> getEvents() {
    return events;
  }

  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getExpirationDate() {
    return expirationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.jqlFilter, webhook.jqlFilter) &&
        Objects.equals(this.events, webhook.events) &&
        Objects.equals(this.expirationDate, webhook.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jqlFilter, events, expirationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jqlFilter: ").append(toIndentedString(jqlFilter)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

