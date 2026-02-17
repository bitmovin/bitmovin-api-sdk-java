package com.bitmovin.api.sdk.common;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Custom DateFormat that uses ISO 8601 Zulu time (UTC) format.
 * <p>Format examples:
 * <pre>
 *   "2019-07-19T09:26:25Z"
 *   "2022-01-01T00:00:10.123Z"
 * </pre>
 */
public class BitmovinISOInstantDateFormat extends DateFormat {

    public BitmovinISOInstantDateFormat() {
        this.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("UTC")));
        this.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override
    public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }

        String formatted = DateTimeFormatter.ISO_INSTANT.format(date.toInstant());
        toAppendTo.append(formatted);
        return toAppendTo;
    }

    @Override
    public Date parse(String source, ParsePosition pos) {
        if (source == null) {
            pos.setErrorIndex(0);
            return null;
        }

        try {
            Instant instant = Instant.parse(source);
            Date date = Date.from(instant);
            pos.setIndex(source.length());
            return date;
        } catch (Exception e) {
            pos.setErrorIndex(0);
            return null;
        }
    }

    @Override
    public Object clone() {
        return new BitmovinISOInstantDateFormat();
    }
}
