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
package org.everit.atlassian.restclient.jiracloud.v3.api;

import java.util.Optional;

import io.reactivex.Single;
import io.reactivex.Completable;

import org.everit.http.client.HttpMethod;

import org.everit.http.restclient.RestClient;
import org.everit.http.restclient.RestClientUtil;
import org.everit.http.restclient.RestRequest;
import org.everit.http.restclient.RestRequestEnhancer;
import org.everit.http.restclient.TypeReference;

import org.everit.atlassian.restclient.jiracloud.v3.model.IssueFieldOption;
import org.everit.atlassian.restclient.jiracloud.v3.model.IssueFieldOptionCreateBean;
import org.everit.atlassian.restclient.jiracloud.v3.model.PageBeanIssueFieldOption;
import org.everit.atlassian.restclient.jiracloud.v3.model.TaskProgressBeanRemoveOptionFromIssuesResult;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssueFieldOptionApi {

  private static final String DEFAULT_BASE_PATH = "http://localhost";

  private static final TypeReference<IssueFieldOption> returnType_createIssueFieldOption = new TypeReference<IssueFieldOption>() {};

  private static final TypeReference<Object> returnType_deleteIssueFieldOption = new TypeReference<Object>() {};

  private static final TypeReference<PageBeanIssueFieldOption> returnType_getAllIssueFieldOptions = new TypeReference<PageBeanIssueFieldOption>() {};

  private static final TypeReference<IssueFieldOption> returnType_getIssueFieldOption = new TypeReference<IssueFieldOption>() {};

  private static final TypeReference<PageBeanIssueFieldOption> returnType_getSelectableIssueFieldOptions = new TypeReference<PageBeanIssueFieldOption>() {};

  private static final TypeReference<PageBeanIssueFieldOption> returnType_getVisibleIssueFieldOptions = new TypeReference<PageBeanIssueFieldOption>() {};

  private static final TypeReference<IssueFieldOption> returnType_updateIssueFieldOption = new TypeReference<IssueFieldOption>() {};

  private final RestClient restClient;

  public IssueFieldOptionApi(RestClient restClient) {
    this.restClient = restClient;
  }

  /**
   * Create issue field option
   * <p>Creates an option for a select list issue field.</p> <p>Note that this operation <strong>cannot be used with the built-in custom fields</strong>. It only works with issue fields added by Connect apps, as described above.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> <em>Administer Jira</em> <a href=\"https://confluence.atlassian.com/x/x4dKLg\">global permission</a>. Jira permissions are not required for the app providing the field.</p> 
   * @param fieldKey <p>The field key is specified in the following format: <strong>$(app-key)\\_\\_$(field-key)</strong>. For example, <em>example-add-on\\_\\_example-issue-field</em>.</p>  (required)
   * @param requestBody  (required)
   * @param restRequestEnhancer <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;IssueFieldOption&gt;
   */
  public Single<IssueFieldOption> createIssueFieldOption(
    String fieldKey, IssueFieldOptionCreateBean requestBody, Optional<RestRequestEnhancer> restRequestEnhancer) {

    RestRequest.Builder requestBuilder = RestRequest.builder()
        .method(HttpMethod.POST)
        .basePath(DEFAULT_BASE_PATH)
        .path("/rest/api/3/field/{fieldKey}/option");

    Map<String, String> pathParams = new HashMap<>();
    pathParams.put("fieldKey", String.valueOf(fieldKey));
    requestBuilder.pathParams(pathParams);

    Map<String, Collection<String>> queryParams = new HashMap<>();
    requestBuilder.queryParams(queryParams);

    Map<String, String> headers = new HashMap<>();
    requestBuilder.headers(headers);

    requestBuilder.requestBody(Optional.of(requestBody));

    return restClient.callEndpoint(requestBuilder.build(), restRequestEnhancer, returnType_createIssueFieldOption);
  }

  /**
   * Delete issue field option
   * <p>Deletes an option from a select list issue field.</p> <p>Note that this operation <strong>cannot be used with the built-in custom fields</strong>. It only works with issue fields added by Connect apps, as described above.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> <em>Administer Jira</em> <a href=\"https://confluence.atlassian.com/x/x4dKLg\">global permission</a>. Jira permissions are not required for the app providing the field.</p> 
   * @param fieldKey <p>The field key is specified in the following format: <strong>$(app-key)\\_\\_$(field-key)</strong>. For example, <em>example-add-on\\_\\_example-issue-field</em>.</p>  (required)
   * @param optionId <p>The ID of the option to be deleted.</p>  (required)
   * @param restRequestEnhancer <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;Object&gt;
   */
  public Single<Object> deleteIssueFieldOption(
    String fieldKey, Long optionId, Optional<RestRequestEnhancer> restRequestEnhancer) {

    RestRequest.Builder requestBuilder = RestRequest.builder()
        .method(HttpMethod.DELETE)
        .basePath(DEFAULT_BASE_PATH)
        .path("/rest/api/3/field/{fieldKey}/option/{optionId}");

    Map<String, String> pathParams = new HashMap<>();
    pathParams.put("fieldKey", String.valueOf(fieldKey));
    pathParams.put("optionId", String.valueOf(optionId));
    requestBuilder.pathParams(pathParams);

    Map<String, Collection<String>> queryParams = new HashMap<>();
    requestBuilder.queryParams(queryParams);

    Map<String, String> headers = new HashMap<>();
    requestBuilder.headers(headers);

    return restClient.callEndpoint(requestBuilder.build(), restRequestEnhancer, returnType_deleteIssueFieldOption);
  }

  /**
   * Get all issue field options
   * <p>Returns all options defined for a select list issue field. A select list issue field is a type of <a href=\"https://developer.atlassian.com/cloud/jira/platform/modules/issue-field/\">issue field</a> that allows a user to select n value from a list of options.</p> <p>Note that this operation <strong>cannot be used with the built-in custom fields</strong>. It only works with issue fields added by Connect apps, as described above.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> <em>Administer Jira</em> <a href=\"https://confluence.atlassian.com/x/x4dKLg\">global permission</a>. Jira permissions are not required for the app providing the field.</p> 
   * @param fieldKey <p>The field key is specified in the following format: <strong>$(app-key)\\_\\_$(field-key)</strong>. For example, <em>example-add-on\\_\\_example-issue-field</em>.</p>  (required)
   * @param startAt <p>The index of the first item to return in a page of results (page offset).</p>  (optional, default to 0l)
   * @param maxResults <p>The maximum number of items to return per page. The maximum is <code>100</code>.</p>  (optional, default to 50)
   * @param restRequestEnhancer <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;PageBeanIssueFieldOption&gt;
   */
  public Single<PageBeanIssueFieldOption> getAllIssueFieldOptions(
    String fieldKey, Optional<Long> startAt, Optional<Integer> maxResults, Optional<RestRequestEnhancer> restRequestEnhancer) {

    RestRequest.Builder requestBuilder = RestRequest.builder()
        .method(HttpMethod.GET)
        .basePath(DEFAULT_BASE_PATH)
        .path("/rest/api/3/field/{fieldKey}/option");

    Map<String, String> pathParams = new HashMap<>();
    pathParams.put("fieldKey", String.valueOf(fieldKey));
    requestBuilder.pathParams(pathParams);

    Map<String, Collection<String>> queryParams = new HashMap<>();
    if (startAt.isPresent()) {
      queryParams.put("startAt", Collections.singleton(String.valueOf(startAt.get())));
    }
    if (maxResults.isPresent()) {
      queryParams.put("maxResults", Collections.singleton(String.valueOf(maxResults.get())));
    }
    requestBuilder.queryParams(queryParams);

    Map<String, String> headers = new HashMap<>();
    requestBuilder.headers(headers);

    return restClient.callEndpoint(requestBuilder.build(), restRequestEnhancer, returnType_getAllIssueFieldOptions);
  }

  /**
   * Get issue field option
   * <p>Returns an option from a select list issue field.</p> <p>Note that this operation <strong>cannot be used with the built-in custom fields</strong>. It only works with issue fields added by Connect apps, as described above.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> <em>Administer Jira</em> <a href=\"https://confluence.atlassian.com/x/x4dKLg\">global permission</a>. Jira permissions are not required for the app providing the field.</p> 
   * @param fieldKey <p>The field key is specified in the following format: <strong>$(app-key)\\_\\_$(field-key)</strong>. For example, <em>example-add-on\\_\\_example-issue-field</em>.</p>  (required)
   * @param optionId <p>The ID of the option to be returned.</p>  (required)
   * @param restRequestEnhancer <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;IssueFieldOption&gt;
   */
  public Single<IssueFieldOption> getIssueFieldOption(
    String fieldKey, Long optionId, Optional<RestRequestEnhancer> restRequestEnhancer) {

    RestRequest.Builder requestBuilder = RestRequest.builder()
        .method(HttpMethod.GET)
        .basePath(DEFAULT_BASE_PATH)
        .path("/rest/api/3/field/{fieldKey}/option/{optionId}");

    Map<String, String> pathParams = new HashMap<>();
    pathParams.put("fieldKey", String.valueOf(fieldKey));
    pathParams.put("optionId", String.valueOf(optionId));
    requestBuilder.pathParams(pathParams);

    Map<String, Collection<String>> queryParams = new HashMap<>();
    requestBuilder.queryParams(queryParams);

    Map<String, String> headers = new HashMap<>();
    requestBuilder.headers(headers);

    return restClient.callEndpoint(requestBuilder.build(), restRequestEnhancer, returnType_getIssueFieldOption);
  }

  /**
   * Get selectable issue field options
   * <p>Returns options defined for a select list issue field that can be viewed and selected by the user.</p> <p>Note that this operation <strong>cannot be used with the built-in custom fields</strong>. It only works with issue fields added by Connect apps, as described above.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> Permission to access Jira.</p> 
   * @param fieldKey <p>The field key is specified in the following format: <strong>$(app-key)\\_\\_$(field-key)</strong>. For example, <em>example-add-on\\_\\_example-issue-field</em>.</p>  (required)
   * @param startAt <p>The index of the first item to return in a page of results (page offset).</p>  (optional, default to 0l)
   * @param maxResults <p>The maximum number of items to return per page. The maximum is <code>100</code>.</p>  (optional, default to 50)
   * @param projectId <p>Filters the results to options that are only available in the specified project.</p>  (optional)
   * @param restRequestEnhancer <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;PageBeanIssueFieldOption&gt;
   */
  public Single<PageBeanIssueFieldOption> getSelectableIssueFieldOptions(
    String fieldKey, Optional<Long> startAt, Optional<Integer> maxResults, Optional<Long> projectId, Optional<RestRequestEnhancer> restRequestEnhancer) {

    RestRequest.Builder requestBuilder = RestRequest.builder()
        .method(HttpMethod.GET)
        .basePath(DEFAULT_BASE_PATH)
        .path("/rest/api/3/field/{fieldKey}/option/suggestions/edit");

    Map<String, String> pathParams = new HashMap<>();
    pathParams.put("fieldKey", String.valueOf(fieldKey));
    requestBuilder.pathParams(pathParams);

    Map<String, Collection<String>> queryParams = new HashMap<>();
    if (startAt.isPresent()) {
      queryParams.put("startAt", Collections.singleton(String.valueOf(startAt.get())));
    }
    if (maxResults.isPresent()) {
      queryParams.put("maxResults", Collections.singleton(String.valueOf(maxResults.get())));
    }
    if (projectId.isPresent()) {
      queryParams.put("projectId", Collections.singleton(String.valueOf(projectId.get())));
    }
    requestBuilder.queryParams(queryParams);

    Map<String, String> headers = new HashMap<>();
    requestBuilder.headers(headers);

    return restClient.callEndpoint(requestBuilder.build(), restRequestEnhancer, returnType_getSelectableIssueFieldOptions);
  }

  /**
   * Get visible issue field options
   * <p>Returns options defined for a select list issue field that can be viewed by the user.</p> <p>Note that this operation <strong>cannot be used with the built-in custom fields</strong>. It only works with issue fields added by Connect apps, as described above.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> Permission to access Jira.</p> 
   * @param fieldKey <p>The field key is specified in the following format: <strong>$(app-key)\\_\\_$(field-key)</strong>. For example, <em>example-add-on\\_\\_example-issue-field</em>.</p>  (required)
   * @param startAt <p>The index of the first item to return in a page of results (page offset).</p>  (optional, default to 0l)
   * @param maxResults <p>The maximum number of items to return per page. The maximum is <code>100</code>.</p>  (optional)
   * @param projectId <p>Filters the results to options that are only available in the specified project.</p>  (optional)
   * @param restRequestEnhancer <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;PageBeanIssueFieldOption&gt;
   */
  public Single<PageBeanIssueFieldOption> getVisibleIssueFieldOptions(
    String fieldKey, Optional<Long> startAt, Optional<Integer> maxResults, Optional<Long> projectId, Optional<RestRequestEnhancer> restRequestEnhancer) {

    RestRequest.Builder requestBuilder = RestRequest.builder()
        .method(HttpMethod.GET)
        .basePath(DEFAULT_BASE_PATH)
        .path("/rest/api/3/field/{fieldKey}/option/suggestions/search");

    Map<String, String> pathParams = new HashMap<>();
    pathParams.put("fieldKey", String.valueOf(fieldKey));
    requestBuilder.pathParams(pathParams);

    Map<String, Collection<String>> queryParams = new HashMap<>();
    if (startAt.isPresent()) {
      queryParams.put("startAt", Collections.singleton(String.valueOf(startAt.get())));
    }
    if (maxResults.isPresent()) {
      queryParams.put("maxResults", Collections.singleton(String.valueOf(maxResults.get())));
    }
    if (projectId.isPresent()) {
      queryParams.put("projectId", Collections.singleton(String.valueOf(projectId.get())));
    }
    requestBuilder.queryParams(queryParams);

    Map<String, String> headers = new HashMap<>();
    requestBuilder.headers(headers);

    return restClient.callEndpoint(requestBuilder.build(), restRequestEnhancer, returnType_getVisibleIssueFieldOptions);
  }

  /**
   * Replace issue field option
   * <p>Deselects an issue-field select-list option from all issues where it is selected. A different option can be selected to replace the deselected option. The update can also be limited to a smaller set of issues by using a JQL query.</p> <p>This is an <a href=\"#async\">asynchronous operation</a>. The response object contains a link to the long-running task.</p> <p>Note that this operation <strong>cannot be used with the built-in custom fields</strong>. It only works with issue fields added by Connect apps, as described above.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> <em>Administer Jira</em> <a href=\"https://confluence.atlassian.com/x/x4dKLg\">global permission</a>. Jira permissions are not required for the app providing the field.</p> 
   * @param fieldKey <p>The field key is specified in the following format: <strong>$(app-key)\\_\\_$(field-key)</strong>. For example, <em>example-add-on\\_\\_example-issue-field</em>.</p>  (required)
   * @param optionId <p>The ID of the option to be deselected.</p>  (required)
   * @param replaceWith <p>The ID of the option that will replace the currently selected option.</p>  (optional)
   * @param jql <p>A JQL query that specifies the issues to be updated. For example, <em>project=10000</em>.</p>  (optional)
   * @param restRequestEnhancer <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Completable
   */
  public Completable replaceIssueFieldOption(
    String fieldKey, Long optionId, Optional<Long> replaceWith, Optional<String> jql, Optional<RestRequestEnhancer> restRequestEnhancer) {

    RestRequest.Builder requestBuilder = RestRequest.builder()
        .method(HttpMethod.DELETE)
        .basePath(DEFAULT_BASE_PATH)
        .path("/rest/api/3/field/{fieldKey}/option/{optionId}/issue");

    Map<String, String> pathParams = new HashMap<>();
    pathParams.put("fieldKey", String.valueOf(fieldKey));
    pathParams.put("optionId", String.valueOf(optionId));
    requestBuilder.pathParams(pathParams);

    Map<String, Collection<String>> queryParams = new HashMap<>();
    if (replaceWith.isPresent()) {
      queryParams.put("replaceWith", Collections.singleton(String.valueOf(replaceWith.get())));
    }
    if (jql.isPresent()) {
      queryParams.put("jql", Collections.singleton(String.valueOf(jql.get())));
    }
    requestBuilder.queryParams(queryParams);

    Map<String, String> headers = new HashMap<>();
    requestBuilder.headers(headers);

    return restClient.callEndpoint(requestBuilder.build(), restRequestEnhancer);
  }

  /**
   * Update issue field option
   * <p>Updates or creates an option for a select list issue field. This operation requires that the option ID is provided when creating an option, therefore, the option ID needs to be specified as a path and body parameter. The option ID provided in the path and body must be identical.</p> <p>Note that this operation <strong>cannot be used with the built-in custom fields</strong>. It only works with issue fields added by Connect apps, as described above.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> <em>Administer Jira</em> <a href=\"https://confluence.atlassian.com/x/x4dKLg\">global permission</a>. Jira permissions are not required for the app providing the field.</p> 
   * @param fieldKey <p>The field key is specified in the following format: <strong>$(app-key)\\_\\_$(field-key)</strong>. For example, <em>example-add-on\\_\\_example-issue-field</em>.</p>  (required)
   * @param optionId <p>The ID of the option to be updated.</p>  (required)
   * @param issueFieldOption  (required)
   * @param restRequestEnhancer <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;IssueFieldOption&gt;
   */
  public Single<IssueFieldOption> updateIssueFieldOption(
    String fieldKey, Long optionId, IssueFieldOption issueFieldOption, Optional<RestRequestEnhancer> restRequestEnhancer) {

    RestRequest.Builder requestBuilder = RestRequest.builder()
        .method(HttpMethod.PUT)
        .basePath(DEFAULT_BASE_PATH)
        .path("/rest/api/3/field/{fieldKey}/option/{optionId}");

    Map<String, String> pathParams = new HashMap<>();
    pathParams.put("fieldKey", String.valueOf(fieldKey));
    pathParams.put("optionId", String.valueOf(optionId));
    requestBuilder.pathParams(pathParams);

    Map<String, Collection<String>> queryParams = new HashMap<>();
    requestBuilder.queryParams(queryParams);

    Map<String, String> headers = new HashMap<>();
    requestBuilder.headers(headers);

    requestBuilder.requestBody(Optional.of(issueFieldOption));

    return restClient.callEndpoint(requestBuilder.build(), restRequestEnhancer, returnType_updateIssueFieldOption);
  }

}
