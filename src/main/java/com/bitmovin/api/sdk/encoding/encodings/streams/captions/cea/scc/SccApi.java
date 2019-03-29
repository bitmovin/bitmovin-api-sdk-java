package com.bitmovin.api.sdk.encoding.encodings.streams.captions.cea.scc;

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
import com.bitmovin.api.sdk.encoding.encodings.streams.captions.cea.scc.customdata.CustomdataApi;

public class SccApi {
    public final CustomdataApi customdata;

    private final SccApiClient apiClient;

    public SccApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SccApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SccApi
     */
    public static BitmovinApiBuilder<SccApi> builder() {
        return new BitmovinApiBuilder<>(SccApi.class);
    }
    
    /**
     * Embed SCC captions as 608/708 into Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param sccCaption  (optional)
     * @return SccCaption
     * @throws BitmovinException if fails to make API call
     */
    public SccCaption create(String encodingId, String streamId, SccCaption sccCaption) throws BitmovinException {
        return this.apiClient.create(encodingId, streamId, sccCaption).getData().getResult();
    }
    
    /**
     * Delete SCC captions as 608/708 from Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param captionsId Id of the caption. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String streamId, String captionsId) throws BitmovinException {
        return this.apiClient.delete(encodingId, streamId, captionsId).getData().getResult();
    }
    
    /**
     * Embed SCC captions as 608/708 Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param captionsId Id of the caption. (required)
     * @return SccCaption
     * @throws BitmovinException if fails to make API call
     */
    public SccCaption get(String encodingId, String streamId, String captionsId) throws BitmovinException {
        return this.apiClient.get(encodingId, streamId, captionsId).getData().getResult();
    }
    
    /**
     * List SCC captions as 608/708 from Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return List&lt;SccCaption&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SccCaption> list(String encodingId, String streamId) throws BitmovinException {
        return this.apiClient.list(encodingId, streamId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List SCC captions as 608/708 from Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SccCaption&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SccCaption> list(String encodingId, String streamId, SccCaptionListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, streamId, queryParams).getData().getResult();
    }
    
    interface SccApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/streams/{stream_id}/captions/608-708/scc")
        ResponseEnvelope<SccCaption> create(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, SccCaption sccCaption) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}/captions/608-708/scc/{captions_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/captions/608-708/scc/{captions_id}")
        ResponseEnvelope<SccCaption> get(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/captions/608-708/scc")
        ResponseEnvelope<PaginationResponse<SccCaption>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
