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
 * Details of the instance&#39;s attachment settings.
 */
@ApiModel(description = "Details of the instance's attachment settings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:24.924+02:00[Europe/Prague]")
public class AttachmentSettings {
  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("uploadLimit")
  private Long uploadLimit;

   /**
   * Whether the ability to add attachments is enabled.
   * @return enabled
  **/
  @ApiModelProperty(value = "Whether the ability to add attachments is enabled.")
  public Boolean getEnabled() {
    return enabled;
  }

   /**
   * The maximum size of attachments permitted, in bytes.
   * @return uploadLimit
  **/
  @ApiModelProperty(value = "The maximum size of attachments permitted, in bytes.")
  public Long getUploadLimit() {
    return uploadLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentSettings attachmentSettings = (AttachmentSettings) o;
    return Objects.equals(this.enabled, attachmentSettings.enabled) &&
        Objects.equals(this.uploadLimit, attachmentSettings.uploadLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, uploadLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    uploadLimit: ").append(toIndentedString(uploadLimit)).append("\n");
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

