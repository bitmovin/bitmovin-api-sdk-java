package com.bitmovin.api.sdk.streams.config.domainRestriction;

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

public class DomainRestrictionApi {

    private final DomainRestrictionApiClient apiClient;

    public DomainRestrictionApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DomainRestrictionApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of DomainRestrictionApi
     */
    public static BitmovinApiBuilder<DomainRestrictionApi> builder() {
        return new BitmovinApiBuilder<>(DomainRestrictionApi.class);
    }

    /**
     * Create new streams domain restriction
     * 
     * @param streamsDomainRestrictionCreateRequest Create a new streams domain restriction (required)
     * @return StreamsDomainRestrictionResponse
     * @throws BitmovinException if fails to make API call
     */
    public StreamsDomainRestrictionResponse create(StreamsDomainRestrictionCreateRequest streamsDomainRestrictionCreateRequest) throws BitmovinException {
        try {
            return this.apiClient.create(streamsDomainRestrictionCreateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete streams domain restriction by id
     * 
     * @param domainRestrictionId Id of the streams domain restriction. (required)
     * @throws BitmovinException if fails to make API call
     */
    public void delete(String domainRestrictionId) throws BitmovinException {
        try {
            this.apiClient.delete(domainRestrictionId);
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get streams domain restriction config by id
     * 
     * @param domainRestrictionId Id of the streams domain restriction. (required)
     * @return StreamsDomainRestrictionResponse
     * @throws BitmovinException if fails to make API call
     */
    public StreamsDomainRestrictionResponse get(String domainRestrictionId) throws BitmovinException {
        try {
            return this.apiClient.get(domainRestrictionId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get paginated list of domain restriction configurations
     * 
     * @return List&lt;StreamsDomainRestrictionResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamsDomainRestrictionResponse> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get paginated list of domain restriction configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;StreamsDomainRestrictionResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamsDomainRestrictionResponse> list(StreamsDomainRestrictionResponseListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Partially update streams domain restriction by id
     * 
     * @param domainRestrictionId Id of the streams domain restriction. (required)
     * @param streamsDomainRestrictionUpdateRequest The updated streams domain restriction object. (required)
     * @return StreamsDomainRestrictionResponse
     * @throws BitmovinException if fails to make API call
     */
    public StreamsDomainRestrictionResponse patchStreamsDomainRestriction(String domainRestrictionId, StreamsDomainRestrictionUpdateRequest streamsDomainRestrictionUpdateRequest) throws BitmovinException {
        try {
            return this.apiClient.patchStreamsDomainRestriction(domainRestrictionId, streamsDomainRestrictionUpdateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DomainRestrictionApiClient {

        @RequestLine("POST /streams/config/domain-restriction/")
        ResponseEnvelope<StreamsDomainRestrictionResponse> create(StreamsDomainRestrictionCreateRequest streamsDomainRestrictionCreateRequest) throws BitmovinException;
    
        @RequestLine("DELETE /streams/config/domain-restriction/{domain_restriction_id}")
        void delete(@Param(value = "domain_restriction_id") String domainRestrictionId) throws BitmovinException;
    
        @RequestLine("GET /streams/config/domain-restriction/{domain_restriction_id}")
        ResponseEnvelope<StreamsDomainRestrictionResponse> get(@Param(value = "domain_restriction_id") String domainRestrictionId) throws BitmovinException;
    
        @RequestLine("GET /streams/config/domain-restriction/")
        ResponseEnvelope<PaginationResponse<StreamsDomainRestrictionResponse>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    
        @RequestLine("PATCH /streams/config/domain-restriction/{domain_restriction_id}")
        ResponseEnvelope<StreamsDomainRestrictionResponse> patchStreamsDomainRestriction(@Param(value = "domain_restriction_id") String domainRestrictionId, StreamsDomainRestrictionUpdateRequest streamsDomainRestrictionUpdateRequest) throws BitmovinException;
    }
}
