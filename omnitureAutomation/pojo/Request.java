
package com.mmt.flights.omnitureAutomation.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "method",
    "url",
    "httpVersion",
    "cookies",
    "headers",
    "queryString",
    "headersSize",
    "bodySize",
    "comment"
})
public class Request {

    @JsonProperty("method")
    private String method;
    @JsonProperty("url")
    private String url;
    @JsonProperty("httpVersion")
    private String httpVersion;
    @JsonProperty("cookies")
    private List<Object> cookies = null;
    @JsonProperty("headers")
    private List<Object> headers = null;
    @JsonProperty("queryString")
    private List<QueryString> queryString = null;
    @JsonProperty("headersSize")
    private Integer headersSize;
    @JsonProperty("bodySize")
    private Integer bodySize;
    @JsonProperty("comment")
    private String comment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(String method) {
        this.method = method;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("httpVersion")
    public String getHttpVersion() {
        return httpVersion;
    }

    @JsonProperty("httpVersion")
    public void setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
    }

    @JsonProperty("cookies")
    public List<Object> getCookies() {
        return cookies;
    }

    @JsonProperty("cookies")
    public void setCookies(List<Object> cookies) {
        this.cookies = cookies;
    }

    @JsonProperty("headers")
    public List<Object> getHeaders() {
        return headers;
    }

    @JsonProperty("headers")
    public void setHeaders(List<Object> headers) {
        this.headers = headers;
    }

    @JsonProperty("queryString")
    public List<QueryString> getQueryString() {
        return queryString;
    }

    @JsonProperty("queryString")
    public void setQueryString(List<QueryString> queryString) {
        this.queryString = queryString;
    }

    @JsonProperty("headersSize")
    public Integer getHeadersSize() {
        return headersSize;
    }

    @JsonProperty("headersSize")
    public void setHeadersSize(Integer headersSize) {
        this.headersSize = headersSize;
    }

    @JsonProperty("bodySize")
    public Integer getBodySize() {
        return bodySize;
    }

    @JsonProperty("bodySize")
    public void setBodySize(Integer bodySize) {
        this.bodySize = bodySize;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Request{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", queryString=" + queryString +
                '}';
    }
}
