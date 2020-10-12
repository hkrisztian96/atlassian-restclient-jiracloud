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

/**
 * An operand that is a function. See [Advanced searching - functions reference](https://confluence.atlassian.com/x/dwiiLQ) for more information about JQL functions.
 */
@ApiModel(description = "An operand that is a function. See [Advanced searching - functions reference](https://confluence.atlassian.com/x/dwiiLQ) for more information about JQL functions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-12T12:22:24.924+02:00[Europe/Prague]")
public class FunctionOperand {
  @JsonProperty("function")
  private String function;

  @JsonProperty("arguments")
  private List<String> arguments = new ArrayList<>();

  public FunctionOperand function(String function) {
    this.function = function;
    return this;
  }

   /**
   * The name of the function.
   * @return function
  **/
  @ApiModelProperty(required = true, value = "The name of the function.")
  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }

  public FunctionOperand arguments(List<String> arguments) {
    this.arguments = arguments;
    return this;
  }

  public FunctionOperand addArgumentsItem(String argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

   /**
   * The list of function arguments.
   * @return arguments
  **/
  @ApiModelProperty(value = "The list of function arguments.")
  public List<String> getArguments() {
    return arguments;
  }

  public void setArguments(List<String> arguments) {
    this.arguments = arguments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunctionOperand functionOperand = (FunctionOperand) o;
    return Objects.equals(this.function, functionOperand.function) &&
        Objects.equals(this.arguments, functionOperand.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(function, arguments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionOperand {\n");
    
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

