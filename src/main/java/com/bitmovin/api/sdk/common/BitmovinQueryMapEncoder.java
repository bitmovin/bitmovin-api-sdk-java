package com.bitmovin.api.sdk.common;

import feign.QueryMapEncoder;
import feign.codec.EncodeException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

/** This will be applied by feign when encountering a {@link feign.QueryMap} parameter which is not a Map */
public class BitmovinQueryMapEncoder implements QueryMapEncoder
{
    private final SimpleDateFormat ISO8601UTC_FORMAT;

    public BitmovinQueryMapEncoder() {
        ISO8601UTC_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
        ISO8601UTC_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /** unbox the query parameter map from the wrapper, clone it and convert Date entries to their ISO8601 string representation in UTC */
    public Map<String, Object> encode(Object object) throws EncodeException
    {
        if (!(object instanceof QueryMapWrapper)) {
            throw new RuntimeException(
                    String.format("QueryMap parameter is of type %s, but expected %s. Please contact support.",
                            object.getClass().getSimpleName(),
                            QueryMapWrapper.class.getSimpleName())
            );
        }
        QueryMapWrapper wrapper = (QueryMapWrapper) object;
        Map<String, Object> queryMap = (Map<String, Object>) wrapper.getQueryMap().clone();
        convertDateEntriesToIso8601Utc(queryMap);
        return queryMap;
    }

    private void convertDateEntriesToIso8601Utc(Map<String, Object> queryMap) {
        for (Map.Entry<String, Object> entry : queryMap.entrySet()) {
            if (entry.getValue() instanceof Date) {
                String iso8601UtcString = ISO8601UTC_FORMAT.format(entry.getValue());
                queryMap.put(entry.getKey(), iso8601UtcString);
            }
        }
    }
}
