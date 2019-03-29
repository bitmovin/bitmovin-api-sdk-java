package com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.drm.primetime;

import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class PrimeTimeDrmListQueryParams extends HashMap<String, Object> {

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
