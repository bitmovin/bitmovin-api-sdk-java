package com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.id3;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.id3.raw.RawApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.id3.frameId.FrameIdApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.id3.plainText.PlainTextApi;

public class Id3Api {
    public final RawApi raw;
    public final FrameIdApi frameId;
    public final PlainTextApi plainText;

    private final Id3ApiClient apiClient;

    public Id3Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Id3ApiClient.class);

        this.raw = new RawApi(clientFactory);
        this.frameId = new FrameIdApi(clientFactory);
        this.plainText = new PlainTextApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of Id3Api
     */
    public static BitmovinApiBuilder<Id3Api> builder() {
        return new BitmovinApiBuilder<>(Id3Api.class);
    }
    
    /**
     * List all ID3 Tags of Progressive TS muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS muxing (required)
     * @return List&lt;Id3Tag&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Id3Tag> list(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all ID3 Tags of Progressive TS muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS muxing (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Id3Tag&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Id3Tag> list(String encodingId, String muxingId, Id3TagListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface Id3ApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/id3")
        ResponseEnvelope<PaginationResponse<Id3Tag>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
