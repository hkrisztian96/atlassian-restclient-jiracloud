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

import org.everit.atlassian.restclient.jiracloud.v3.model.IssueMatches;
import org.everit.atlassian.restclient.jiracloud.v3.model.IssuesAndJQLQueries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssueMatchApi {

  private static final String DEFAULT_BASE_PATH = "http://localhost";

  private static final TypeReference<IssueMatches> returnType_matchIssues = new TypeReference<IssueMatches>() {};

  private final RestClient restClient;

  public IssueMatchApi(RestClient restClient) {
    this.restClient = restClient;
  }

  /**
   * Check issues against JQL
   * <p>Checks whether one or more issues would be returned by one or more JQL queries.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> None, however, issues are only matched against JQL queries where the user has:</p> <ul> <li><em>Browse projects</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issuesAndJQLQueries  (required)
   * @param restRequestEnhancer <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;IssueMatches&gt;
   */
  public Single<IssueMatches> matchIssues(
    IssuesAndJQLQueries issuesAndJQLQueries, Optional<RestRequestEnhancer> restRequestEnhancer) {

    RestRequest.Builder requestBuilder = RestRequest.builder()
        .method(HttpMethod.POST)
        .basePath(DEFAULT_BASE_PATH)
        .path("/rest/api/3/jql/match");

    Map<String, String> pathParams = new HashMap<>();
    requestBuilder.pathParams(pathParams);

    Map<String, Collection<String>> queryParams = new HashMap<>();
    requestBuilder.queryParams(queryParams);

    Map<String, String> headers = new HashMap<>();
    requestBuilder.headers(headers);

    requestBuilder.requestBody(Optional.of(issuesAndJQLQueries));

    return restClient.callEndpoint(requestBuilder.build(), restRequestEnhancer, returnType_matchIssues);
  }

}
