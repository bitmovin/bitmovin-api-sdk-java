package com.bitmovin.api.sdk.encoding.statistics.encodings.live.options;

import java.util.Date;
import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class LiveOptionsStatisticsListByDateRangeQueryParams extends HashMap<String, Object> {

    public Date getFrom() {
        return (Date) this.get("from");
    }

    /**
    * @param from Start date, format: yyyy-MM-dd (optional)
    */
    public void setFrom(Date from) {
        this.put("from", from);
    }

    public Date getTo() {
        return (Date) this.get("to");
    }

    /**
    * @param to End date, format: yyyy-MM-dd (optional)
    */
    public void setTo(Date to) {
        this.put("to", to);
    }

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
}
