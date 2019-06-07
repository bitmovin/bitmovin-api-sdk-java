package com.bitmovin.api.sdk.analytics.licenses.domains;

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
     * @param licenseId License id (required)
     * @param domain  (required)
     * @return Domain
     * @throws BitmovinException if fails to make API call
     */
    public Domain create(String licenseId, Domain domain) throws BitmovinException {
        return this.apiClient.create(licenseId, domain).getData().getResult();
    }
    
    /**
     * Delete Domain
     * 
     * @param licenseId License id (required)
     * @param domainId id of domain to delete (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String licenseId, String domainId) throws BitmovinException {
        return this.apiClient.delete(licenseId, domainId).getData().getResult();
    }
    
    /**
     * List License Domains
     * 
     * @param licenseId License id (required)
     * @return DomainList
     * @throws BitmovinException if fails to make API call
     */
    public DomainList get(String licenseId) throws BitmovinException {
        return this.apiClient.get(licenseId).getData().getResult();
    }
    
    interface DomainsApiClient {
    
        @RequestLine("POST /analytics/licenses/{license_id}/domains")
        ResponseEnvelope<Domain> create(@Param(value = "license_id") String licenseId, Domain domain) throws BitmovinException;
    
        @RequestLine("DELETE /analytics/licenses/{license_id}/domains/{domain_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "license_id") String licenseId, @Param(value = "domain_id") String domainId) throws BitmovinException;
    
        @RequestLine("GET /analytics/licenses/{license_id}/domains")
        ResponseEnvelope<DomainList> get(@Param(value = "license_id") String licenseId) throws BitmovinException;
    }
}
