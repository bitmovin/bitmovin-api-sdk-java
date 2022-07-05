package com.bitmovin.api.sdk.encoding.statistics.cdn.usage;

import java.util.Date;
import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class CdnUsageStatisticsGetQueryParams extends HashMap<String, Object> {

    public Date getFrom() {
        return (Date) this.get("from");
    }

    /**
    * @param from Start date. Accepted formats: yyyy-MM-ddThh:mm:ssZ or yyyy-MM-dd (required)
    */
    public void setFrom(Date from) {
        this.put("from", from);
    }

    public Date getTo() {
        return (Date) this.get("to");
    }

    /**
    * @param to End date. Accepted formats: yyyy-MM-ddThh:mm:ssZ or yyyy-MM-dd (required)
    */
    public void setTo(Date to) {
        this.put("to", to);
    }
}
