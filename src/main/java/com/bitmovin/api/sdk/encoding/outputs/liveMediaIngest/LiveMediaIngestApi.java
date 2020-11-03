package com.bitmovin.api.sdk.encoding.outputs.liveMediaIngest;

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
import com.bitmovin.api.sdk.encoding.outputs.liveMediaIngest.customdata.CustomdataApi;

public class LiveMediaIngestApi {
    public final CustomdataApi customdata;

    private final LiveMediaIngestApiClient apiClient;

    public LiveMediaIngestApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LiveMediaIngestApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of LiveMediaIngestApi
     */
    public static BitmovinApiBuilder<LiveMediaIngestApi> builder() {
        return new BitmovinApiBuilder<>(LiveMediaIngestApi.class);
    }
    
    /**
     * Create Live Media Ingest Output
     * 
     * @param liveMediaIngestOutput The Live Media Ingest output to be created (required)
     * @return LiveMediaIngestOutput
     * @throws BitmovinException if fails to make API call
     */
    public LiveMediaIngestOutput create(LiveMediaIngestOutput liveMediaIngestOutput) throws BitmovinException {
        try {
            return this.apiClient.create(liveMediaIngestOutput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Live Media Ingest Output
     * 
     * @param outputId Id of the output (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String outputId) throws BitmovinException {
        try {
            return this.apiClient.delete(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Live Media Ingest Output Details
     * 
     * @param outputId Id of the output (required)
     * @return LiveMediaIngestOutput
     * @throws BitmovinException if fails to make API call
     */
    public LiveMediaIngestOutput get(String outputId) throws BitmovinException {
        try {
            return this.apiClient.get(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Live Media Ingest Outputs
     * 
     * @return List&lt;LiveMediaIngestOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LiveMediaIngestOutput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Live Media Ingest Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;LiveMediaIngestOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LiveMediaIngestOutput> list(LiveMediaIngestOutputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface LiveMediaIngestApiClient {
    
        @RequestLine("POST /encoding/outputs/live-media-ingest")
        ResponseEnvelope<LiveMediaIngestOutput> create(LiveMediaIngestOutput liveMediaIngestOutput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/outputs/live-media-ingest/{output_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/live-media-ingest/{output_id}")
        ResponseEnvelope<LiveMediaIngestOutput> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/live-media-ingest")
        ResponseEnvelope<PaginationResponse<LiveMediaIngestOutput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
