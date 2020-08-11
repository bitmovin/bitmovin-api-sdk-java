package com.bitmovin.api.sdk.player.licenses.domains;

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
     * @param licenseId Id of the Player License (required)
     * @param domain The Domain to be added to Player License Allowlist (required)
     * @return Domain
     * @throws BitmovinException if fails to make API call
     */
    public Domain create(String licenseId, Domain domain) throws BitmovinException {
        try {
            return this.apiClient.create(licenseId, domain).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Domain
     * 
     * @param licenseId Id of license (required)
     * @param domainId Id of the domain (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String licenseId, String domainId) throws BitmovinException {
        try {
            return this.apiClient.delete(licenseId, domainId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List allowed Domains for Player License
     * 
     * @param licenseId Id of the Player License (required)
     * @return List&lt;Domain&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Domain> list(String licenseId) throws BitmovinException {
        try {
            return this.apiClient.list(licenseId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface DomainsApiClient {
    
        @RequestLine("POST /player/licenses/{license_id}/domains")
        ResponseEnvelope<Domain> create(@Param(value = "license_id") String licenseId, Domain domain) throws BitmovinException;
    
        @RequestLine("DELETE /player/licenses/{license_id}/domains/{domain_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "license_id") String licenseId, @Param(value = "domain_id") String domainId) throws BitmovinException;
    
        @RequestLine("GET /player/licenses/{license_id}/domains")
        ResponseEnvelope<PaginationResponse<Domain>> list(@Param(value = "license_id") String licenseId) throws BitmovinException;
    }
}
