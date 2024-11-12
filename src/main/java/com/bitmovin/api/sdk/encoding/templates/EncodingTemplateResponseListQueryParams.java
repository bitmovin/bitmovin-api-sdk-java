package com.bitmovin.api.sdk.encoding.templates;

import java.util.Date;
import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class EncodingTemplateResponseListQueryParams extends HashMap<String, Object> {

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

    public EncodingTemplateType getType() {
        return (EncodingTemplateType) this.get("type");
    }

    /**
    * @param type Filter the stored templates by type (optional, default to null)
    */
    public void setType(EncodingTemplateType type) {
        this.put("type", type);
    }
}
