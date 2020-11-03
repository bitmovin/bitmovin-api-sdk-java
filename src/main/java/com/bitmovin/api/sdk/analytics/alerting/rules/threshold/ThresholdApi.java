package com.bitmovin.api.sdk.analytics.alerting.rules.threshold;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import feign.Body;
import feign.Headers;

import com.bitmovin.api.sdk.model.*;
import com.bitmovin.api.sdk.common.BitmovinException;
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.QueryMapWrapper;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class ThresholdApi {

    private final ThresholdApiClient apiClient;

    public ThresholdApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ThresholdApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ThresholdApi
     */
    public static BitmovinApiBuilder<ThresholdApi> builder() {
        return new BitmovinApiBuilder<>(ThresholdApi.class);
    }
    
    /**
     * Create Analytics Alerting Rule
     * 
     * @param licenseKey License key (required)
     * @param analyticsAlertingRule Analytics alerting rule details to be created (required)
     * @return AnalyticsAlertingRule
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsAlertingRule create(String licenseKey, AnalyticsAlertingRule analyticsAlertingRule) throws BitmovinException {
        try {
            return this.apiClient.create(licenseKey, analyticsAlertingRule).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Update Analytics Alerting Rule
     * 
     * @param licenseKey License key (required)
     * @param ruleId Rule id (required)
     * @param analyticsAlertingRule Analytics alerting rule details to be updated (required)
     * @return AnalyticsAlertingRule
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsAlertingRule update(String licenseKey, String ruleId, AnalyticsAlertingRule analyticsAlertingRule) throws BitmovinException {
        try {
            return this.apiClient.update(licenseKey, ruleId, analyticsAlertingRule).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface ThresholdApiClient {
    
        @RequestLine("POST /analytics/alerting/rules/{license_key}/threshold")
        ResponseEnvelope<AnalyticsAlertingRule> create(@Param(value = "license_key") String licenseKey, AnalyticsAlertingRule analyticsAlertingRule) throws BitmovinException;
    
        @RequestLine("PUT /analytics/alerting/rules/{license_key}/threshold/{rule_id}")
        ResponseEnvelope<AnalyticsAlertingRule> update(@Param(value = "license_key") String licenseKey, @Param(value = "rule_id") String ruleId, AnalyticsAlertingRule analyticsAlertingRule) throws BitmovinException;
    }
}
