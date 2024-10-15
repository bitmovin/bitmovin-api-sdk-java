package com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.id3.raw;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.id3.raw.customdata.CustomdataApi;

public class RawApi {
    public final CustomdataApi customdata;

    private final RawApiClient apiClient;

    public RawApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(RawApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of RawApi
     */
    public static BitmovinApiBuilder<RawApi> builder() {
        return new BitmovinApiBuilder<>(RawApi.class);
    }
    /**
     * Add Raw ID3 Tag to a Progressive TS muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS muxing (required)
     * @param rawId3Tag The Raw ID3 Tag to be created (required)
     * @return RawId3Tag
     * @throws BitmovinException if fails to make API call
     */
    public RawId3Tag create(String encodingId, String muxingId, RawId3Tag rawId3Tag) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, muxingId, rawId3Tag).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Raw ID3 Tag of a Progressive TS muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS muxing (required)
     * @param id3TagId ID of the RAW ID3 Tag (required)
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
     * Raw ID3 Tag Details of a Progressive TS muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS muxing (required)
     * @param id3TagId ID of the Raw ID3 Tag (required)
     * @return RawId3Tag
     * @throws BitmovinException if fails to make API call
     */
    public RawId3Tag get(String encodingId, String muxingId, String id3TagId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId, id3TagId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Raw ID3 Tags of a Progressive TS muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS muxing (required)
     * @return List&lt;RawId3Tag&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<RawId3Tag> list(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Raw ID3 Tags of a Progressive TS muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS muxing (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;RawId3Tag&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<RawId3Tag> list(String encodingId, String muxingId, RawId3TagListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface RawApiClient { 
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/id3/raw")
        ResponseEnvelope<RawId3Tag> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, RawId3Tag rawId3Tag) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/id3/raw/{id3_tag_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "id3_tag_id") String id3TagId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/id3/raw/{id3_tag_id}")
        ResponseEnvelope<RawId3Tag> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "id3_tag_id") String id3TagId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/id3/raw")
        ResponseEnvelope<PaginationResponse<RawId3Tag>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
