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
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.QueryMapWrapper;
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
     * Add Frame ID ID3 Tag to a Progressive TS muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS muxing (required)
     * @param frameIdId3Tag The Frame ID ID3 Tag to be created (required)
     * @return FrameIdId3Tag
     * @throws BitmovinException if fails to make API call
     */
    public FrameIdId3Tag create(String encodingId, String muxingId, FrameIdId3Tag frameIdId3Tag) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, muxingId, frameIdId3Tag).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Frame ID ID3 Tag of a Progressive TS muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS muxing (required)
     * @param id3TagId ID of the Frame ID ID3 Tag (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId, String id3TagId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, muxingId, id3TagId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Frame ID ID3 Tag Details of a Progressive TS muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS muxing (required)
     * @param id3TagId ID of the Frame ID ID3 Tag (required)
     * @return FrameIdId3Tag
     * @throws BitmovinException if fails to make API call
     */
    public FrameIdId3Tag get(String encodingId, String muxingId, String id3TagId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId, id3TagId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Frame ID ID3 Tags of a Progressive TS muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS muxing (required)
     * @return List&lt;FrameIdId3Tag&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<FrameIdId3Tag> list(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Frame ID ID3 Tags of a Progressive TS muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS muxing (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;FrameIdId3Tag&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<FrameIdId3Tag> list(String encodingId, String muxingId, FrameIdId3TagListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface FrameIdApiClient {

        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/id3/frame-id")
        ResponseEnvelope<FrameIdId3Tag> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, FrameIdId3Tag frameIdId3Tag) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/id3/frame-id/{id3_tag_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "id3_tag_id") String id3TagId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/id3/frame-id/{id3_tag_id}")
        ResponseEnvelope<FrameIdId3Tag> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "id3_tag_id") String id3TagId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/id3/frame-id")
        ResponseEnvelope<PaginationResponse<FrameIdId3Tag>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
