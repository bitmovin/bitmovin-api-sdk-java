package com.bitmovin.api.sdk.encoding.encodings.muxings;

import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class MuxingListQueryParams extends HashMap<String, Object> {

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

    public StreamMode getStreamMode() {
        return (StreamMode) this.get("streamMode");
    }

    /**
    * @param streamMode Filter muxings to only show the ones with the stream modes specified. Accepts multiple values separated by commas. (optional, default to null)
    */
    public void setStreamMode(StreamMode streamMode) {
        this.put("streamMode", streamMode);
    }
}
