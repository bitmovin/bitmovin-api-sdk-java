package com.bitmovin.api.sdk.encoding.encodings.muxings.mp4.drm.cenc;

import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class CencDrmListQueryParams extends HashMap<String, Object> {

    public String getOffset() {
        return (String) this.get("offset");
    }

    /**
    * @param offset TODO Add description (optional)
    */
    public void setOffset(String offset) {
        this.put("offset", offset);
    }

    public String getLimit() {
        return (String) this.get("limit");
    }

    /**
    * @param limit TODO Add description (optional)
    */
    public void setLimit(String limit) {
        this.put("limit", limit);
    }
}
