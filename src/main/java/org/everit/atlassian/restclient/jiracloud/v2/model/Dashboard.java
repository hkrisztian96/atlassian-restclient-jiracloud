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
import java.util.ArrayList;
import java.util.List;
import org.everit.atlassian.restclient.jiracloud.v2.model.SharePermission;
import org.everit.atlassian.restclient.jiracloud.v2.model.UserBean;

/**
 * Details of a dashboard.
 */
@ApiModel(description = "Details of a dashboard.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:24.924+02:00[Europe/Prague]")
public class Dashboard {
  @JsonProperty("description")
  private String description;

  @JsonProperty("id")
  private String id;

  @JsonProperty("isFavourite")
  private Boolean isFavourite;

  @JsonProperty("name")
  private String name;

  @JsonProperty("owner")
  private UserBean owner;

  @JsonProperty("popularity")
  private Long popularity;

  @JsonProperty("rank")
  private Integer rank;

  @JsonProperty("self")
  private URI self;

  @JsonProperty("sharePermissions")
  private List<SharePermission> sharePermissions = new ArrayList<>();

  @JsonProperty("view")
  private String view;

  public Dashboard description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * The ID of the dashboard.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the dashboard.")
  public String getId() {
    return id;
  }

   /**
   * Whether the dashboard is selected as a favorite by the user.
   * @return isFavourite
  **/
  @ApiModelProperty(value = "Whether the dashboard is selected as a favorite by the user.")
  public Boolean getIsFavourite() {
    return isFavourite;
  }

   /**
   * The name of the dashboard.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the dashboard.")
  public String getName() {
    return name;
  }

   /**
   * The owner of the dashboard.
   * @return owner
  **/
  @ApiModelProperty(value = "The owner of the dashboard.")
  public UserBean getOwner() {
    return owner;
  }

   /**
   * The number of users who have this dashboard as a favorite.
   * @return popularity
  **/
  @ApiModelProperty(value = "The number of users who have this dashboard as a favorite.")
  public Long getPopularity() {
    return popularity;
  }

   /**
   * The rank of this dashboard.
   * @return rank
  **/
  @ApiModelProperty(value = "The rank of this dashboard.")
  public Integer getRank() {
    return rank;
  }

   /**
   * The URL of these dashboard details.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of these dashboard details.")
  public URI getSelf() {
    return self;
  }

   /**
   * The details of any share permissions for the dashboard.
   * @return sharePermissions
  **/
  @ApiModelProperty(value = "The details of any share permissions for the dashboard.")
  public List<SharePermission> getSharePermissions() {
    return sharePermissions;
  }

   /**
   * The URL of the dashboard.
   * @return view
  **/
  @ApiModelProperty(value = "The URL of the dashboard.")
  public String getView() {
    return view;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboard dashboard = (Dashboard) o;
    return Objects.equals(this.description, dashboard.description) &&
        Objects.equals(this.id, dashboard.id) &&
        Objects.equals(this.isFavourite, dashboard.isFavourite) &&
        Objects.equals(this.name, dashboard.name) &&
        Objects.equals(this.owner, dashboard.owner) &&
        Objects.equals(this.popularity, dashboard.popularity) &&
        Objects.equals(this.rank, dashboard.rank) &&
        Objects.equals(this.self, dashboard.self) &&
        Objects.equals(this.sharePermissions, dashboard.sharePermissions) &&
        Objects.equals(this.view, dashboard.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isFavourite, name, owner, popularity, rank, self, sharePermissions, view);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboard {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFavourite: ").append(toIndentedString(isFavourite)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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

