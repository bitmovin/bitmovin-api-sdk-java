package com.bitmovin.api.sdk.streams.search;

import java.util.Date;
import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class StreamsResponseListQueryParams extends HashMap<String, Object> {

    public Integer getOffset() {
        return (Integer) this.get("offset");
    }

    /**
    * @param offset Index of the first item to return, starting at 0. Default is 0 (optional)
    */
    public void setOffset(Integer offset) {
        this.put("offset", offset);
    }

    public Integer getLimit() {
        return (Integer) this.get("limit");
    }

    /**
    * @param limit Maximum number of items to return. Default is 25, maximum is 100 (optional)
    */
    public void setLimit(Integer limit) {
        this.put("limit", limit);
    }

    public String getQuery() {
        return (String) this.get("query");
    }

    /**
    * @param query Query to search for in a streams&#39; title, description and ID (optional)
    */
    public void setQuery(String query) {
        this.put("query", query);
    }

    public StreamsType getType() {
        return (StreamsType) this.get("type");
    }

    /**
    * @param type Type of stream to search for (optional, default to null)
    */
    public void setType(StreamsType type) {
        this.put("type", type);
    }

    public StreamsVideoStatus getStatus() {
        return (StreamsVideoStatus) this.get("status");
    }

    /**
    * @param status Status of the streams to search for (optional, default to null)
    */
    public void setStatus(StreamsVideoStatus status) {
        this.put("status", status);
    }

    public String getCreatedBefore() {
        return (String) this.get("createdBefore");
    }

    /**
    * @param createdBefore Upper limit for the creation date of found streams as UTC in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (optional)
    */
    public void setCreatedBefore(String createdBefore) {
        this.put("createdBefore", createdBefore);
    }

    public String getCreatedAfter() {
        return (String) this.get("createdAfter");
    }

    /**
    * @param createdAfter Lower limit for the creation date of found streams as UTC in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (optional)
    */
    public void setCreatedAfter(String createdAfter) {
        this.put("createdAfter", createdAfter);
    }

    public Boolean getSigned() {
        return (Boolean) this.get("signed");
    }

    /**
    * @param signed Filter for token-protected/signed streams (optional)
    */
    public void setSigned(Boolean signed) {
        this.put("signed", signed);
    }

    public Boolean getDomainRestricted() {
        return (Boolean) this.get("domainRestricted");
    }

    /**
    * @param domainRestricted Filter for domain-restricted streams (optional)
    */
    public void setDomainRestricted(Boolean domainRestricted) {
        this.put("domainRestricted", domainRestricted);
    }
}
