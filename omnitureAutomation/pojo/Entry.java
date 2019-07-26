
package com.mmt.flights.omnitureAutomation.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pageref",
    "startedDateTime",
    "request",
    "response",
    "cache",
    "timings",
    "serverIPAddress",
    "comment",
    "time"
})
public class Entry {

    @JsonProperty("pageref")
    private String pageref;
    @JsonProperty("startedDateTime")
    private String startedDateTime;
    @JsonProperty("request")
    private Request request;
    @JsonProperty("response")
    private Response response;
    @JsonProperty("cache")
    private Cache cache;
    @JsonProperty("timings")
    private Timings timings;
    @JsonProperty("serverIPAddress")
    private String serverIPAddress;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("time")
    private Integer time;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pageref")
    public String getPageref() {
        return pageref;
    }

    @JsonProperty("pageref")
    public void setPageref(String pageref) {
        this.pageref = pageref;
    }

    @JsonProperty("startedDateTime")
    public String getStartedDateTime() {
        return startedDateTime;
    }

    @JsonProperty("startedDateTime")
    public void setStartedDateTime(String startedDateTime) {
        this.startedDateTime = startedDateTime;
    }

    @JsonProperty("request")
    public Request getRequest() {
        return request;
    }

    @JsonProperty("request")
    public void setRequest(Request request) {
        this.request = request;
    }

    @JsonProperty("response")
    public Response getResponse() {
        return response;
    }

    @JsonProperty("response")
    public void setResponse(Response response) {
        this.response = response;
    }

    @JsonProperty("cache")
    public Cache getCache() {
        return cache;
    }

    @JsonProperty("cache")
    public void setCache(Cache cache) {
        this.cache = cache;
    }

    @JsonProperty("timings")
    public Timings getTimings() {
        return timings;
    }

    @JsonProperty("timings")
    public void setTimings(Timings timings) {
        this.timings = timings;
    }

    @JsonProperty("serverIPAddress")
    public String getServerIPAddress() {
        return serverIPAddress;
    }

    @JsonProperty("serverIPAddress")
    public void setServerIPAddress(String serverIPAddress) {
        this.serverIPAddress = serverIPAddress;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("time")
    public Integer getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Integer time) {
        this.time = time;
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
        return "Entry{" +
                ", request=" + request +
                '}';
    }
}
