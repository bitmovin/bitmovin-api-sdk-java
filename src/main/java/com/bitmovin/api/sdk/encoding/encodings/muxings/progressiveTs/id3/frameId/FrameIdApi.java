package com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.id3.frameId;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.id3.frameId.customdata.CustomdataApi;

public class FrameIdApi {
    public final CustomdataApi customdata;

    private final FrameIdApiClient apiClient;

    public FrameIdApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(FrameIdApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of FrameIdApi
     */
    public static BitmovinApiBuilder<FrameIdApi> builder() {
        return new BitmovinApiBuilder<>(FrameIdApi.class);
    }
    
    /**
     * Add Frame ID ID3 Tag to Progressive TS Muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS Muxing (required)
     * @param frameIdId3Tag  (required)
     * @return FrameIdId3Tag
     * @throws BitmovinException if fails to make API call
     */
    public FrameIdId3Tag create(String encodingId, String muxingId, FrameIdId3Tag frameIdId3Tag) throws BitmovinException {
        return this.apiClient.create(encodingId, muxingId, frameIdId3Tag).getData().getResult();
    }
    
    /**
     * Delete Frame ID ID3 Tag of Progressive TS Muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS Muxing (required)
     * @param id3TagId ID of the Frame ID ID3 Tag (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId, String id3TagId) throws BitmovinException {
        return this.apiClient.delete(encodingId, muxingId, id3TagId).getData().getResult();
    }
    
    /**
     * Frame ID ID3 Tag Details of Progressive TS Muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS Muxing (required)
     * @param id3TagId ID of the Frame ID ID3 Tag (required)
     * @return FrameIdId3Tag
     * @throws BitmovinException if fails to make API call
     */
    public FrameIdId3Tag get(String encodingId, String muxingId, String id3TagId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId, id3TagId).getData().getResult();
    }
    
    /**
     * List Frame ID ID3 Tags of Progressive TS Muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS Muxing (required)
     * @return List&lt;FrameIdId3Tag&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<FrameIdId3Tag> list(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Frame ID ID3 Tags of Progressive TS Muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS Muxing (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;FrameIdId3Tag&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<FrameIdId3Tag> list(String encodingId, String muxingId, FrameIdId3TagListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, queryParams).getData().getResult();
    }
    
    interface FrameIdApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/id3/frame-id")
        ResponseEnvelope<FrameIdId3Tag> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, FrameIdId3Tag frameIdId3Tag) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/id3/frame-id/{id3_tag_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "id3_tag_id") String id3TagId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/id3/frame-id/{id3_tag_id}")
        ResponseEnvelope<FrameIdId3Tag> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "id3_tag_id") String id3TagId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/id3/frame-id")
        ResponseEnvelope<PaginationResponse<FrameIdId3Tag>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
