package com.bitmovin.api.sdk.encoding.live.standbyPools.encodings;

import java.util.Date;
import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class LiveStandbyPoolEncodingListQueryParams extends HashMap<String, Object> {

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

    public String getSort() {
        return (String) this.get("sort");
    }

    /**
    * @param sort Order list result according a stream key attribute.  The fields that can be used for sorting are: + &#x60;createdAt&#x60; + &#x60;name&#x60; + &#x60;status&#x60;  (optional)
    */
    public void setSort(String sort) {
        this.put("sort", sort);
    }

    public String getStatus() {
        return (String) this.get("status");
    }

    /**
    * @param status Filter standby encodings by status (optional)
    */
    public void setStatus(String status) {
        this.put("status", status);
    }
}
