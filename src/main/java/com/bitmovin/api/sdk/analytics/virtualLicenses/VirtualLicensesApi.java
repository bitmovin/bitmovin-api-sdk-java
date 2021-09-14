package com.bitmovin.api.sdk.analytics.virtualLicenses;

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

public class VirtualLicensesApi {

    private final VirtualLicensesApiClient apiClient;

    public VirtualLicensesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(VirtualLicensesApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of VirtualLicensesApi
     */
    public static BitmovinApiBuilder<VirtualLicensesApi> builder() {
        return new BitmovinApiBuilder<>(VirtualLicensesApi.class);
    }

    /**
     * Create Virtual License
     * 
     * @param virtualLicenseCreateRequest Virtual License to be created (required)
     * @return VirtualLicense
     * @throws BitmovinException if fails to make API call
     */
    public VirtualLicense create(VirtualLicenseCreateRequest virtualLicenseCreateRequest) throws BitmovinException {
        try {
            return this.apiClient.create(virtualLicenseCreateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface VirtualLicensesApiClient {

        @RequestLine("POST /analytics/virtual-licenses")
        ResponseEnvelope<VirtualLicense> create(VirtualLicenseCreateRequest virtualLicenseCreateRequest) throws BitmovinException;
    }
}
