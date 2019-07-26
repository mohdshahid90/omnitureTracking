
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
    "id",
    "startedDateTime",
    "title",
    "pageTimings",
    "comment"
})
public class Page {

    @JsonProperty("id")
    private String id;
    @JsonProperty("startedDateTime")
    private String startedDateTime;
    @JsonProperty("title")
    private String title;
    @JsonProperty("pageTimings")
    private PageTimings pageTimings;
    @JsonProperty("comment")
    private String comment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("startedDateTime")
    public String getStartedDateTime() {
        return startedDateTime;
    }

    @JsonProperty("startedDateTime")
    public void setStartedDateTime(String startedDateTime) {
        this.startedDateTime = startedDateTime;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("pageTimings")
    public PageTimings getPageTimings() {
        return pageTimings;
    }

    @JsonProperty("pageTimings")
    public void setPageTimings(PageTimings pageTimings) {
        this.pageTimings = pageTimings;
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
