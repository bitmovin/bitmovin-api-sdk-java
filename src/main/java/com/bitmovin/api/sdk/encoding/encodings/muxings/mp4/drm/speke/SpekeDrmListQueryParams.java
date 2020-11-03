package com.bitmovin.api.sdk.encoding.encodings.muxings.mp4.drm.speke;

import java.util.Date;
import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class SpekeDrmListQueryParams extends HashMap<String, Object> {

    public String getOffset() {
        return (String) this.get("offset");
    }

    /**
    * @param offset Index of the first item to return, starting at 0. Default is 0 (optional)
    */
    public void setOffset(String offset) {
        this.put("offset", offset);
    }

    public String getLimit() {
        return (String) this.get("limit");
    }

    /**
    * @param limit Maximum number of items to return. Default is 25, maximum is 100 (optional)
    */
    public void setLimit(String limit) {
        this.put("limit", limit);
    }
}
