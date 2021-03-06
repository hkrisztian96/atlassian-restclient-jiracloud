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
import org.everit.atlassian.restclient.jiracloud.v2.model.AttachmentArchiveItemReadable;

/**
 * Metadata for an archive (for example a zip) and its contents.
 */
@ApiModel(description = "Metadata for an archive (for example a zip) and its contents.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-05T12:17:30.184+02:00[Europe/Prague]")
public class AttachmentArchiveMetadataReadable {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("entries")
  private List<AttachmentArchiveItemReadable> entries = new ArrayList<>();

  @JsonProperty("totalEntryCount")
  private Long totalEntryCount;

  @JsonProperty("mediaType")
  private String mediaType;

   /**
   * The ID of the attachment.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the attachment.")
  public Long getId() {
    return id;
  }

   /**
   * The name of the archive file.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the archive file.")
  public String getName() {
    return name;
  }

   /**
   * The list of the items included in the archive.
   * @return entries
  **/
  @ApiModelProperty(value = "The list of the items included in the archive.")
  public List<AttachmentArchiveItemReadable> getEntries() {
    return entries;
  }

   /**
   * The number of items included in the archive.
   * @return totalEntryCount
  **/
  @ApiModelProperty(value = "The number of items included in the archive.")
  public Long getTotalEntryCount() {
    return totalEntryCount;
  }

   /**
   * The MIME type of the attachment.
   * @return mediaType
  **/
  @ApiModelProperty(value = "The MIME type of the attachment.")
  public String getMediaType() {
    return mediaType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchiveMetadataReadable attachmentArchiveMetadataReadable = (AttachmentArchiveMetadataReadable) o;
    return Objects.equals(this.id, attachmentArchiveMetadataReadable.id) &&
        Objects.equals(this.name, attachmentArchiveMetadataReadable.name) &&
        Objects.equals(this.entries, attachmentArchiveMetadataReadable.entries) &&
        Objects.equals(this.totalEntryCount, attachmentArchiveMetadataReadable.totalEntryCount) &&
        Objects.equals(this.mediaType, attachmentArchiveMetadataReadable.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, entries, totalEntryCount, mediaType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchiveMetadataReadable {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    totalEntryCount: ").append(toIndentedString(totalEntryCount)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

