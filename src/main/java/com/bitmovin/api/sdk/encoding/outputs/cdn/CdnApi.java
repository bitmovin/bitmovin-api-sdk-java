package com.bitmovin.api.sdk.encoding.outputs.cdn;

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

public class CdnApi {

    private final CdnApiClient apiClient;

    public CdnApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CdnApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of CdnApi
     */
    public static BitmovinApiBuilder<CdnApi> builder() {
        return new BitmovinApiBuilder<>(CdnApi.class);
    }

    /**
     * CDN Output Details
     * 
     * @param outputId Id of the output (required)
     * @return CdnOutput
     * @throws BitmovinException if fails to make API call
     */
    public CdnOutput get(String outputId) throws BitmovinException {
        try {
            return this.apiClient.get(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List CDN Outputs
     * 
     * @return List&lt;CdnOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CdnOutput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List CDN Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;CdnOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CdnOutput> list(CdnOutputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface CdnApiClient {

        @RequestLine("GET /encoding/outputs/cdn/{output_id}")
        ResponseEnvelope<CdnOutput> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/cdn")
        ResponseEnvelope<PaginationResponse<CdnOutput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
