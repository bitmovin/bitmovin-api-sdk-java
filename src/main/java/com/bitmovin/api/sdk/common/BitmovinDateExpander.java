package com.bitmovin.api.sdk.common;

import feign.Param;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BitmovinDateExpander implements Param.Expander
{
    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public String expand(Object value)
    {
        if(value == null)
        {
            return null;
        }

        Date date = (Date) value;

        return FORMAT.format(date);
    }
}
