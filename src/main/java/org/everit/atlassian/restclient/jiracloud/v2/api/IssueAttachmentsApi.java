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

import org.everit.atlassian.restclient.jiracloud.v2.model.Attachment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssueAttachmentsApi {

  private static final String DEFAULT_BASE_PATH = "http://localhost";

  private static final TypeReference<List<Attachment>> returnType_addAttachment = new TypeReference<List<Attachment>>() {};

  private final RestClient restClient;

  public IssueAttachmentsApi(RestClient restClient) {
    this.restClient = restClient;
  }

  /**
   * Add attachment
   * <p>Adds one or more attachments to an issue. Attachments are posted as multipart/form-data (<a href=\"https://www.ietf.org/rfc/rfc1867.txt\">RFC 1867</a>).</p> <p>Note that:</p> <ul> <li>The request must have a <code>X-Atlassian-Token: no-check</code> header, if not it is blocked. See <a href=\"#special-request-headers\">Special headers</a> for more information.</li> <li>The name of the multipart/form-data parameter that contains the attachments must be <code>file</code>.</li> </ul> <p>The following example uploads a file called <em>myfile.txt</em> to the issue <em>TEST-123</em>:</p> <p><code>curl -D- -u admin:admin -X POST -H &quot;X-Atlassian-Token: no-check&quot; -F &quot;file=@myfile.txt&quot; https://your-domain.atlassian.net/rest/api/2/issue/TEST-123/attachments</code></p> <p>Tip: Use a client library. Many client libraries have classes for handling multipart POST operations. For example, in Java, the Apache HTTP Components library provides a <a href=\"http://hc.apache.org/httpcomponents-client-ga/httpmime/apidocs/org/apache/http/entity/mime/MultipartEntity.html\">MultiPartEntity</a> class for multipart POST operations.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse Projects</em> and <em>Create attachments</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\"> project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue that attachments are added to.</p>  (required)
   * @param restRequestEnhancer <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;List&lt;Attachment&gt;&gt;
   */
  public Single<List<Attachment>> addAttachment(
    String issueIdOrKey, Optional<RestRequestEnhancer> restRequestEnhancer) {

    RestRequest.Builder requestBuilder = RestRequest.builder()
        .method(HttpMethod.POST)
        .basePath(DEFAULT_BASE_PATH)
        .path("/rest/api/2/issue/{issueIdOrKey}/attachments");

    Map<String, String> pathParams = new HashMap<>();
    pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    requestBuilder.pathParams(pathParams);

    Map<String, Collection<String>> queryParams = new HashMap<>();
    requestBuilder.queryParams(queryParams);

    Map<String, String> headers = new HashMap<>();
    requestBuilder.headers(headers);

    return restClient.callEndpoint(requestBuilder.build(), restRequestEnhancer, returnType_addAttachment);
  }

}
