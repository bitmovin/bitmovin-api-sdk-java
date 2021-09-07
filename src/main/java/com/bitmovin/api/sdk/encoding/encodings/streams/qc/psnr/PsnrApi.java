package com.bitmovin.api.sdk.encoding.encodings.streams.qc.psnr;

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

public class PsnrApi {

    private final PsnrApiClient apiClient;

    public PsnrApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(PsnrApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of PsnrApi
     */
    public static BitmovinApiBuilder<PsnrApi> builder() {
        return new BitmovinApiBuilder<>(PsnrApi.class);
    }

    /**
     * Activate PSNR quality metrics for the selected stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse create(String encodingId, String streamId) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, streamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get Stream PSNR metrics
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return List&lt;PsnrQualityMetric&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PsnrQualityMetric> list(String encodingId, String streamId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get Stream PSNR metrics
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;PsnrQualityMetric&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PsnrQualityMetric> list(String encodingId, String streamId, PsnrQualityMetricListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface PsnrApiClient {

        @RequestLine("POST /encoding/encodings/{encoding_id}/streams/{stream_id}/qc/psnr")
        ResponseEnvelope<BitmovinResponse> create(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/qc/psnr")
        ResponseEnvelope<PaginationResponse<PsnrQualityMetric>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
