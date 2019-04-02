package com.bitmovin.api.sdk.encoding.outputs;

import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class OutputListQueryParams extends HashMap<String, Object> {

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

    public String getName() {
        return (String) this.get("name");
    }

    /**
    * @param name Filter output by name (optional)
    */
    public void setName(String name) {
        this.put("name", name);
    }
}
