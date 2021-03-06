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
package org.everit.atlassian.restclient.jiracloud.v2.api;

import java.util.Optional;

import io.reactivex.Single;
import io.reactivex.Completable;

import org.everit.http.client.HttpMethod;

import org.everit.http.restclient.RestClient;
import org.everit.http.restclient.RestClientUtil;
import org.everit.http.restclient.RestRequest;
import org.everit.http.restclient.RestRequestEnhancer;
import org.everit.http.restclient.TypeReference;

import org.everit.atlassian.restclient.jiracloud.v2.model.ErrorCollection;
import org.everit.atlassian.restclient.jiracloud.v2.model.PageBeanWorkflowTransitionRules;
import org.everit.atlassian.restclient.jiracloud.v2.model.WorkflowTransitionRulesUpdate;
import org.everit.atlassian.restclient.jiracloud.v2.model.WorkflowTransitionRulesUpdateErrors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkflowRuleConfigApi {

  private static final String DEFAULT_BASE_PATH = "http://localhost";

  private static final TypeReference<PageBeanWorkflowTransitionRules> returnType_getWorkflowTransitionRuleConfigurations = new TypeReference<PageBeanWorkflowTransitionRules>() {};

  private static final TypeReference<WorkflowTransitionRulesUpdateErrors> returnType_updateWorkflowTransitionRuleConfigurations = new TypeReference<WorkflowTransitionRulesUpdateErrors>() {};

  private final RestClient restClient;

  public WorkflowRuleConfigApi(RestClient restClient) {
    this.restClient = restClient;
  }

  /**
   * Get workflow transition rule configurations
   * <p>Returns a paginated list of workflows with transition rules. The workflows can be filtered to return only those containing workflow transition rules:</p> <ul> <li>of one or more transition rule types, such as <a href=\"https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/\">workflow post functions</a>.</li> <li>matching one or more transition rule keys.</li> </ul> <p>Only workflows containing transition rules created by the calling Connect app are returned. However, if a workflow is returned all transition rules that match the filters are returned for that workflow.</p> <p>Due to server-side optimizations, workflows with an empty list of rules may be returned; these workflows can be ignored.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> Only Connect apps can use this operation.</p> 
   * @param startAt <p>The index of the first item to return in a page of results (page offset).</p>  (optional, default to 0l)
   * @param maxResults <p>The maximum number of items to return per page.</p>  (optional, default to 10)
   * @param types <p>The types of the transition rules to return.</p>  (optional, default to new ArrayList&lt;&gt;())
   * @param keys <p>The transition rule class keys, as defined in the Connect app descriptor, of the transition rules to return.</p>  (optional, default to new ArrayList&lt;&gt;())
   * @param expand <p>Use <a href=\"#expansion\">expand</a> to include additional information in the response. This parameter accepts multiple values separated by a comma:</p> <ul> <li><code>transition</code> For each rule, returns information about the transition the rule is assigned to.</li> </ul>  (optional)
   * @param restRequestEnhancer <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;PageBeanWorkflowTransitionRules&gt;
   */
  public Single<PageBeanWorkflowTransitionRules> getWorkflowTransitionRuleConfigurations(
    Optional<Long> startAt, Optional<Integer> maxResults, Optional<List<String>> types, Optional<List<String>> keys, Optional<String> expand, Optional<RestRequestEnhancer> restRequestEnhancer) {

    RestRequest.Builder requestBuilder = RestRequest.builder()
        .method(HttpMethod.GET)
        .basePath(DEFAULT_BASE_PATH)
        .path("/rest/api/2/workflow/rule/config");

    Map<String, String> pathParams = new HashMap<>();
    requestBuilder.pathParams(pathParams);

    Map<String, Collection<String>> queryParams = new HashMap<>();
    if (startAt.isPresent()) {
      queryParams.put("startAt", Collections.singleton(String.valueOf(startAt.get())));
    }
    if (maxResults.isPresent()) {
      queryParams.put("maxResults", Collections.singleton(String.valueOf(maxResults.get())));
    }
    if (types.isPresent()) {
      queryParams.put("types", RestClientUtil.objectCollectionToStringCollection(types.get()));
    }
    if (keys.isPresent()) {
      queryParams.put("keys", RestClientUtil.objectCollectionToStringCollection(keys.get()));
    }
    if (expand.isPresent()) {
      queryParams.put("expand", Collections.singleton(String.valueOf(expand.get())));
    }
    requestBuilder.queryParams(queryParams);

    Map<String, String> headers = new HashMap<>();
    requestBuilder.headers(headers);

    return restClient.callEndpoint(requestBuilder.build(), restRequestEnhancer, returnType_getWorkflowTransitionRuleConfigurations);
  }

  /**
   * Update workflow transition rule configurations
   * <p>Updates configuration of workflow transition rules. The following rule types are supported:</p> <ul> <li><a href=\"https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/\">post functions</a></li> <li><a href=\"https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/\">conditions</a></li> <li><a href=\"https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/\">validators</a></li> </ul> <p>Only rules created by the calling Connect app can be updated.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> Only Connect apps can use this operation.</p> 
   * @param workflowTransitionRulesUpdate  (required)
   * @param restRequestEnhancer <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;WorkflowTransitionRulesUpdateErrors&gt;
   */
  public Single<WorkflowTransitionRulesUpdateErrors> updateWorkflowTransitionRuleConfigurations(
    WorkflowTransitionRulesUpdate workflowTransitionRulesUpdate, Optional<RestRequestEnhancer> restRequestEnhancer) {

    RestRequest.Builder requestBuilder = RestRequest.builder()
        .method(HttpMethod.PUT)
        .basePath(DEFAULT_BASE_PATH)
        .path("/rest/api/2/workflow/rule/config");

    Map<String, String> pathParams = new HashMap<>();
    requestBuilder.pathParams(pathParams);

    Map<String, Collection<String>> queryParams = new HashMap<>();
    requestBuilder.queryParams(queryParams);

    Map<String, String> headers = new HashMap<>();
    requestBuilder.headers(headers);

    requestBuilder.requestBody(Optional.of(workflowTransitionRulesUpdate));

    return restClient.callEndpoint(requestBuilder.build(), restRequestEnhancer, returnType_updateWorkflowTransitionRuleConfigurations);
  }

}
