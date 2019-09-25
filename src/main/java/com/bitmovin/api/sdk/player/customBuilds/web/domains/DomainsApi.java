package com.bitmovin.api.sdk.player.customBuilds.web.domains;

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
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class DomainsApi {

    private final DomainsApiClient apiClient;

    public DomainsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DomainsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of DomainsApi
     */
    public static BitmovinApiBuilder<DomainsApi> builder() {
        return new BitmovinApiBuilder<>(DomainsApi.class);
    }
    
    /**
     * Add Domain
     * 
     * @param customWebPlayerBuildDomain The Domain to be added (required)
     * @return CustomWebPlayerBuildDomain
     * @throws BitmovinException if fails to make API call
     */
    public CustomWebPlayerBuildDomain create(CustomWebPlayerBuildDomain customWebPlayerBuildDomain) throws BitmovinException {
        try {
            return this.apiClient.create(customWebPlayerBuildDomain).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Domain
     * 
     * @param domainId Id of the domain (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String domainId) throws BitmovinException {
        try {
            return this.apiClient.delete(domainId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Get Domain Details
     * 
     * @param domainId Id of the domain (required)
     * @return CustomWebPlayerBuildDomain
     * @throws BitmovinException if fails to make API call
     */
    public CustomWebPlayerBuildDomain get(String domainId) throws BitmovinException {
        try {
            return this.apiClient.get(domainId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Domain Details
     * 
     * @return List&lt;CustomWebPlayerBuildDomain&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CustomWebPlayerBuildDomain> list() throws BitmovinException {
        try {
            return this.apiClient.list().getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface DomainsApiClient {
    
        @RequestLine("POST /player/custom-builds/web/domains")
        ResponseEnvelope<CustomWebPlayerBuildDomain> create(CustomWebPlayerBuildDomain customWebPlayerBuildDomain) throws BitmovinException;
    
        @RequestLine("DELETE /player/custom-builds/web/domains/{domain_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "domain_id") String domainId) throws BitmovinException;
    
        @RequestLine("GET /player/custom-builds/web/domains/{domain_id}")
        ResponseEnvelope<CustomWebPlayerBuildDomain> get(@Param(value = "domain_id") String domainId) throws BitmovinException;
    
        @RequestLine("GET /player/custom-builds/web/domains")
        ResponseEnvelope<PaginationResponse<CustomWebPlayerBuildDomain>> list() throws BitmovinException;
    }
}
