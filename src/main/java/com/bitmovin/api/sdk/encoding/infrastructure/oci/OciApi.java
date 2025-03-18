package com.bitmovin.api.sdk.encoding.infrastructure.oci;

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
import com.bitmovin.api.sdk.encoding.infrastructure.oci.regions.RegionsApi;

public class OciApi {
    public final RegionsApi regions;

    private final OciApiClient apiClient;

    public OciApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(OciApiClient.class);

        this.regions = new RegionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of OciApi
     */
    public static BitmovinApiBuilder<OciApi> builder() {
        return new BitmovinApiBuilder<>(OciApi.class);
    }
    /**
     * Add OCI account
     * 
     * @param ociAccount The OCI account to be added (required)
     * @return OciAccount
     * @throws BitmovinException if fails to make API call
     */
    public OciAccount create(OciAccount ociAccount) throws BitmovinException {
        try {
            return this.apiClient.create(ociAccount).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete OCI account
     * 
     * @param infrastructureId Id of the OCI account (required)
     * @return OciAccount
     * @throws BitmovinException if fails to make API call
     */
    public OciAccount delete(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.delete(infrastructureId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * OCI account details
     * 
     * @param infrastructureId Id of the OCI account (required)
     * @return OciAccount
     * @throws BitmovinException if fails to make API call
     */
    public OciAccount get(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.get(infrastructureId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List OCI accounts
     * 
     * @return List&lt;OciAccount&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<OciAccount> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List OCI accounts
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;OciAccount&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<OciAccount> list(OciAccountListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface OciApiClient { 
        @RequestLine("POST /encoding/infrastructure/oci")
        ResponseEnvelope<OciAccount> create(OciAccount ociAccount) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/infrastructure/oci/{infrastructure_id}")
        ResponseEnvelope<OciAccount> delete(@Param(value = "infrastructure_id") String infrastructureId) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/oci/{infrastructure_id}")
        ResponseEnvelope<OciAccount> get(@Param(value = "infrastructure_id") String infrastructureId) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/oci")
        ResponseEnvelope<PaginationResponse<OciAccount>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
