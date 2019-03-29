package com.bitmovin.api.sdk;

import feign.Logger;
import feign.slf4j.Slf4jLogger;
import org.junit.Test;

public class ApiTest
{
    @Test
    public void testCreateApi()
    {
        BitmovinApi bitmovinApi =
                BitmovinApi.builder()
                           .withApiKey("[API_KEY]")
                           .withLogger(new Slf4jLogger(), Logger.Level.FULL)
                           .build();
    }
}
