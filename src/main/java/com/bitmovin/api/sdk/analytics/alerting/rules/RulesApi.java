package com.bitmovin.api.sdk.analytics.alerting.rules;

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
import com.bitmovin.api.sdk.analytics.alerting.rules.threshold.ThresholdApi;

public class RulesApi {
    public final ThresholdApi threshold;

    private final RulesApiClient apiClient;

    public RulesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(RulesApiClient.class);

        this.threshold = new ThresholdApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of RulesApi
     */
    public static BitmovinApiBuilder<RulesApi> builder() {
        return new BitmovinApiBuilder<>(RulesApi.class);
    }
    
    /**
     * Delete Analytics Alerting Rule By License Key And Id
     * 
     * @param licenseKey License key (required)
     * @param ruleId Rule id (required)
     * @return AnalyticsAlertingRule
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsAlertingRule delete(String licenseKey, String ruleId) throws BitmovinException {
        try {
            return this.apiClient.delete(licenseKey, ruleId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Get Analytics Alerting Rule By License Key And Id
     * 
     * @param licenseKey License key (required)
     * @param ruleId Rule id (required)
     * @return AnalyticsAlertingRule
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsAlertingRule get(String licenseKey, String ruleId) throws BitmovinException {
        try {
            return this.apiClient.get(licenseKey, ruleId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Analytics Alerting Rules
     * 
     * @return List&lt;AnalyticsAlertingRule&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsAlertingRule> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Analytics Alerting Rules
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AnalyticsAlertingRule&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsAlertingRule> list(AnalyticsAlertingRuleListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface RulesApiClient {
    
        @RequestLine("DELETE /analytics/alerting/rules/{license_key}/{rule_id}")
        ResponseEnvelope<AnalyticsAlertingRule> delete(@Param(value = "license_key") String licenseKey, @Param(value = "rule_id") String ruleId) throws BitmovinException;
    
        @RequestLine("GET /analytics/alerting/rules/{license_key}/{rule_id}")
        ResponseEnvelope<AnalyticsAlertingRule> get(@Param(value = "license_key") String licenseKey, @Param(value = "rule_id") String ruleId) throws BitmovinException;
    
        @RequestLine("GET /analytics/alerting/rules")
        ResponseEnvelope<PaginationResponse<AnalyticsAlertingRule>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
