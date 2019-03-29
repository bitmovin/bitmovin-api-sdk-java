package com.bitmovin.api.sdk.encoding.encodings.subtitles.dvbsub;

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
import com.bitmovin.api.sdk.encoding.encodings.subtitles.dvbsub.customdata.CustomdataApi;

public class DvbsubApi {
    public final CustomdataApi customdata;

    private final DvbsubApiClient apiClient;

    public DvbsubApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DvbsubApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DvbsubApi
     */
    public static BitmovinApiBuilder<DvbsubApi> builder() {
        return new BitmovinApiBuilder<>(DvbsubApi.class);
    }
    
    /**
     * Extract DVB-SUB Subtitle
     * 
     * @param encodingId Id of the encoding. (required)
     * @param dvbSubtitleSidecarDetails  (optional)
     * @return DvbSubtitleSidecarDetails
     * @throws BitmovinException if fails to make API call
     */
    public DvbSubtitleSidecarDetails create(String encodingId, DvbSubtitleSidecarDetails dvbSubtitleSidecarDetails) throws BitmovinException {
        return this.apiClient.create(encodingId, dvbSubtitleSidecarDetails).getData().getResult();
    }
    
    /**
     * Delete DVB-SUB Subtitle
     * 
     * @param encodingId Id of the encoding. (required)
     * @param subtitleId Id of the subtitle. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String subtitleId) throws BitmovinException {
        return this.apiClient.delete(encodingId, subtitleId).getData().getResult();
    }
    
    /**
     * Subtitle DVB-SUB Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param subtitleId Id of the subtitle. (required)
     * @return DvbSubtitleSidecarDetails
     * @throws BitmovinException if fails to make API call
     */
    public DvbSubtitleSidecarDetails get(String encodingId, String subtitleId) throws BitmovinException {
        return this.apiClient.get(encodingId, subtitleId).getData().getResult();
    }
    
    /**
     * List DVB-SUB Subtitle
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;DvbSubtitleSidecarDetails&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DvbSubtitleSidecarDetails> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List DVB-SUB Subtitle
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DvbSubtitleSidecarDetails&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DvbSubtitleSidecarDetails> list(String encodingId, DvbSubtitleSidecarDetailsListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface DvbsubApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/subtitles/dvbsub")
        ResponseEnvelope<DvbSubtitleSidecarDetails> create(@Param(value = "encoding_id") String encodingId, DvbSubtitleSidecarDetails dvbSubtitleSidecarDetails) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/subtitles/dvbsub/{subtitle_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "subtitle_id") String subtitleId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/subtitles/dvbsub/{subtitle_id}")
        ResponseEnvelope<DvbSubtitleSidecarDetails> get(@Param(value = "encoding_id") String encodingId, @Param(value = "subtitle_id") String subtitleId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/subtitles/dvbsub")
        ResponseEnvelope<PaginationResponse<DvbSubtitleSidecarDetails>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
