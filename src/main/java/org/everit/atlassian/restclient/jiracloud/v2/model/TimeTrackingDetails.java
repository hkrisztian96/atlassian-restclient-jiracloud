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

/**
 * Time tracking details.
 */
@ApiModel(description = "Time tracking details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:24.924+02:00[Europe/Prague]")
public class TimeTrackingDetails {
  @JsonProperty("originalEstimate")
  private String originalEstimate;

  @JsonProperty("remainingEstimate")
  private String remainingEstimate;

  @JsonProperty("timeSpent")
  private String timeSpent;

  @JsonProperty("originalEstimateSeconds")
  private Long originalEstimateSeconds;

  @JsonProperty("remainingEstimateSeconds")
  private Long remainingEstimateSeconds;

  @JsonProperty("timeSpentSeconds")
  private Long timeSpentSeconds;

   /**
   * The original estimate of time needed for this issue in readable format.
   * @return originalEstimate
  **/
  @ApiModelProperty(value = "The original estimate of time needed for this issue in readable format.")
  public String getOriginalEstimate() {
    return originalEstimate;
  }

   /**
   * The remaining estimate of time needed for this issue in readable format.
   * @return remainingEstimate
  **/
  @ApiModelProperty(value = "The remaining estimate of time needed for this issue in readable format.")
  public String getRemainingEstimate() {
    return remainingEstimate;
  }

   /**
   * Time worked on this issue in readable format.
   * @return timeSpent
  **/
  @ApiModelProperty(value = "Time worked on this issue in readable format.")
  public String getTimeSpent() {
    return timeSpent;
  }

   /**
   * The original estimate of time needed for this issue in seconds.
   * @return originalEstimateSeconds
  **/
  @ApiModelProperty(value = "The original estimate of time needed for this issue in seconds.")
  public Long getOriginalEstimateSeconds() {
    return originalEstimateSeconds;
  }

   /**
   * The remaining estimate of time needed for this issue in seconds.
   * @return remainingEstimateSeconds
  **/
  @ApiModelProperty(value = "The remaining estimate of time needed for this issue in seconds.")
  public Long getRemainingEstimateSeconds() {
    return remainingEstimateSeconds;
  }

   /**
   * Time worked on this issue in seconds.
   * @return timeSpentSeconds
  **/
  @ApiModelProperty(value = "Time worked on this issue in seconds.")
  public Long getTimeSpentSeconds() {
    return timeSpentSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeTrackingDetails timeTrackingDetails = (TimeTrackingDetails) o;
    return Objects.equals(this.originalEstimate, timeTrackingDetails.originalEstimate) &&
        Objects.equals(this.remainingEstimate, timeTrackingDetails.remainingEstimate) &&
        Objects.equals(this.timeSpent, timeTrackingDetails.timeSpent) &&
        Objects.equals(this.originalEstimateSeconds, timeTrackingDetails.originalEstimateSeconds) &&
        Objects.equals(this.remainingEstimateSeconds, timeTrackingDetails.remainingEstimateSeconds) &&
        Objects.equals(this.timeSpentSeconds, timeTrackingDetails.timeSpentSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalEstimate, remainingEstimate, timeSpent, originalEstimateSeconds, remainingEstimateSeconds, timeSpentSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingDetails {\n");
    
    sb.append("    originalEstimate: ").append(toIndentedString(originalEstimate)).append("\n");
    sb.append("    remainingEstimate: ").append(toIndentedString(remainingEstimate)).append("\n");
    sb.append("    timeSpent: ").append(toIndentedString(timeSpent)).append("\n");
    sb.append("    originalEstimateSeconds: ").append(toIndentedString(originalEstimateSeconds)).append("\n");
    sb.append("    remainingEstimateSeconds: ").append(toIndentedString(remainingEstimateSeconds)).append("\n");
    sb.append("    timeSpentSeconds: ").append(toIndentedString(timeSpentSeconds)).append("\n");
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

