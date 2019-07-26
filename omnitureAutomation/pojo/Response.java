
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
    "status",
    "statusText",
    "httpVersion",
    "cookies",
    "headers",
    "content",
    "redirectURL",
    "headersSize",
    "bodySize",
    "comment"
})
public class Response {

    @JsonProperty("status")
    private Integer status;
    @JsonProperty("statusText")
    private String statusText;
    @JsonProperty("httpVersion")
    private String httpVersion;
    @JsonProperty("cookies")
    private List<Object> cookies = null;
    @JsonProperty("headers")
    private List<Object> headers = null;
    @JsonProperty("content")
    private Content content;
    @JsonProperty("redirectURL")
    private String redirectURL;
    @JsonProperty("headersSize")
    private Integer headersSize;
    @JsonProperty("bodySize")
    private Integer bodySize;
    @JsonProperty("comment")
    private String comment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("statusText")
    public String getStatusText() {
        return statusText;
    }

    @JsonProperty("statusText")
    public void setStatusText(String statusText) {
        this.statusText = statusText;
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

    @JsonProperty("content")
    public Content getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(Content content) {
        this.content = content;
    }

    @JsonProperty("redirectURL")
    public String getRedirectURL() {
        return redirectURL;
    }

    @JsonProperty("redirectURL")
    public void setRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
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


}
