package com.bitmovin.api.sdk.encoding.manifests.smooth.representations.mp4;

import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class SmoothStreamingRepresentationListQueryParams extends HashMap<String, Object> {

    public Long getOffset() {
        return (Long) this.get("offset");
    }

    /**
    * @param offset Index of the first item to return, starting at 0. Default is 0 (optional)
    */
    public void setOffset(Long offset) {
        this.put("offset", offset);
    }

    public Long getLimit() {
        return (Long) this.get("limit");
    }

    /**
    * @param limit Maximum number of items to return. Default is 25, maximum is 100 (optional)
    */
    public void setLimit(Long limit) {
        this.put("limit", limit);
    }
}
