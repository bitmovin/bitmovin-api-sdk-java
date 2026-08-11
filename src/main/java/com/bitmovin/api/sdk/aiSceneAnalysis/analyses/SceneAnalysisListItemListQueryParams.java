package com.bitmovin.api.sdk.aiSceneAnalysis.analyses;

import java.util.Date;
import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class SceneAnalysisListItemListQueryParams extends HashMap<String, Object> {

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
    * @param limit Maximum number of items to return. Default is 15, maximum is 100 (optional)
    */
    public void setLimit(Integer limit) {
        this.put("limit", limit);
    }

    public String getSearchText() {
        return (String) this.get("searchText");
    }

    /**
    * @param searchText Natural-language text for semantic analysis search. A value containing at least one non-whitespace character enables semantic search and must contain at least 3 characters; omitted, empty, or whitespace-only values use ordinary list behavior (optional)
    */
    public void setSearchText(String searchText) {
        this.put("searchText", searchText);
    }

    public SceneAnalysisListSort getSort() {
        return (SceneAnalysisListSort) this.get("sort");
    }

    /**
    * @param sort Order the results. When searchText is omitted, empty, or whitespace-only, the default is createdAt:DESC and the supported values are createdAt:DESC and createdAt:ASC. When searchText contains at least one non-whitespace character, relevance:DESC is the default and only supported value. Other combinations are rejected (optional, default to null)
    */
    public void setSort(SceneAnalysisListSort sort) {
        this.put("sort", sort);
    }

    public Date getCreatedAtFrom() {
        return (Date) this.get("createdAtFrom");
    }

    /**
    * @param createdAtFrom Inclusive lower creation-date bound in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (optional)
    */
    public void setCreatedAtFrom(Date createdAtFrom) {
        this.put("createdAtFrom", createdAtFrom);
    }

    public Date getCreatedAtTo() {
        return (Date) this.get("createdAtTo");
    }

    /**
    * @param createdAtTo Inclusive upper creation-date bound in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (optional)
    */
    public void setCreatedAtTo(Date createdAtTo) {
        this.put("createdAtTo", createdAtTo);
    }
}
