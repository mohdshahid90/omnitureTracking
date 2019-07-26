
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
    "comment",
    "ssl",
    "blocked",
    "dns",
    "connect",
    "send",
    "wait",
    "receive"
})
public class Timings {

    @JsonProperty("comment")
    private String comment;
    @JsonProperty("ssl")
    private Integer ssl;
    @JsonProperty("blocked")
    private Integer blocked;
    @JsonProperty("dns")
    private Integer dns;
    @JsonProperty("connect")
    private Integer connect;
    @JsonProperty("send")
    private Integer send;
    @JsonProperty("wait")
    private Integer wait;
    @JsonProperty("receive")
    private Integer receive;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("ssl")
    public Integer getSsl() {
        return ssl;
    }

    @JsonProperty("ssl")
    public void setSsl(Integer ssl) {
        this.ssl = ssl;
    }

    @JsonProperty("blocked")
    public Integer getBlocked() {
        return blocked;
    }

    @JsonProperty("blocked")
    public void setBlocked(Integer blocked) {
        this.blocked = blocked;
    }

    @JsonProperty("dns")
    public Integer getDns() {
        return dns;
    }

    @JsonProperty("dns")
    public void setDns(Integer dns) {
        this.dns = dns;
    }

    @JsonProperty("connect")
    public Integer getConnect() {
        return connect;
    }

    @JsonProperty("connect")
    public void setConnect(Integer connect) {
        this.connect = connect;
    }

    @JsonProperty("send")
    public Integer getSend() {
        return send;
    }

    @JsonProperty("send")
    public void setSend(Integer send) {
        this.send = send;
    }

    @JsonProperty("wait")
    public Integer getWait() {
        return wait;
    }

    @JsonProperty("wait")
    public void setWait(Integer wait) {
        this.wait = wait;
    }

    @JsonProperty("receive")
    public Integer getReceive() {
        return receive;
    }

    @JsonProperty("receive")
    public void setReceive(Integer receive) {
        this.receive = receive;
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
