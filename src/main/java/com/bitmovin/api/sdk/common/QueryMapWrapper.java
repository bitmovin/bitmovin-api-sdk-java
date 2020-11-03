package com.bitmovin.api.sdk.common;

import java.util.HashMap;

/** Intention of this wrapper is to hide the contained Map from feign, forcing it to apply {@link BitmovinQueryMapEncoder} which contains some conversion logic */
public class QueryMapWrapper
{
    private final HashMap<String, Object> queryMap;

    public QueryMapWrapper() {
        this.queryMap = new HashMap<>();
    }

    public QueryMapWrapper(HashMap<String, Object> queryMap) {
        this.queryMap = queryMap;
    }

    public HashMap<String, Object> getQueryMap() {
        return queryMap;
    }
}
