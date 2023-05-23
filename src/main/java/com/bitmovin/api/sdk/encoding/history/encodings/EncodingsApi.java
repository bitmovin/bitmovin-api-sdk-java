package com.bitmovin.api.sdk.encoding.history.encodings;

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

public class EncodingsApi {

    private final EncodingsApiClient apiClient;

    public EncodingsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(EncodingsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of EncodingsApi
     */
    public static BitmovinApiBuilder<EncodingsApi> builder() {
        return new BitmovinApiBuilder<>(EncodingsApi.class);
    }

    /**
     * (Experimental) History Encoding Details
     * Returns every configuration and result related to an Encoding.
     * @param encodingId Id of the encoding. (required)
     * @return HistoryEncoding
     * @throws BitmovinException if fails to make API call
     */
    public HistoryEncoding get(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * (Experimental) List all History Encodings
     * Returns a list of History Encodings. Recently created Encodings might not be available as History Encoding.
     * @return List&lt;Encoding&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Encoding> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * (Experimental) List all History Encodings
     * Returns a list of History Encodings. Recently created Encodings might not be available as History Encoding.
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Encoding&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Encoding> list(EncodingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface EncodingsApiClient {

        @RequestLine("GET /encoding/history/encodings/{encoding_id}")
        ResponseEnvelope<HistoryEncoding> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/history/encodings")
        ResponseEnvelope<PaginationResponse<Encoding>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
