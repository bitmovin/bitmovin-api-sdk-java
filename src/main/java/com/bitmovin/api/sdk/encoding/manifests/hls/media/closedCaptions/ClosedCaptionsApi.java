package com.bitmovin.api.sdk.encoding.manifests.hls.media.closedCaptions;

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

public class ClosedCaptionsApi {

    private final ClosedCaptionsApiClient apiClient;

    public ClosedCaptionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ClosedCaptionsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ClosedCaptionsApi
     */
    public static BitmovinApiBuilder<ClosedCaptionsApi> builder() {
        return new BitmovinApiBuilder<>(ClosedCaptionsApi.class);
    }
    
    /**
     * Add Closed Captions Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param closedCaptionsMediaInfo  (required)
     * @return ClosedCaptionsMediaInfo
     * @throws BitmovinException if fails to make API call
     */
    public ClosedCaptionsMediaInfo create(String manifestId, ClosedCaptionsMediaInfo closedCaptionsMediaInfo) throws BitmovinException {
        return this.apiClient.create(manifestId, closedCaptionsMediaInfo).getData().getResult();
    }
    
    /**
     * Delete Closed Captions Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the closed captions media. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String mediaId) throws BitmovinException {
        return this.apiClient.delete(manifestId, mediaId).getData().getResult();
    }
    
    /**
     * Closed Captions Media Details
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the closed captions media. (required)
     * @return ClosedCaptionsMediaInfo
     * @throws BitmovinException if fails to make API call
     */
    public ClosedCaptionsMediaInfo get(String manifestId, String mediaId) throws BitmovinException {
        return this.apiClient.get(manifestId, mediaId).getData().getResult();
    }
    
    /**
     * List all Closed Captions Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @return List&lt;ClosedCaptionsMediaInfo&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ClosedCaptionsMediaInfo> list(String manifestId) throws BitmovinException {
        return this.apiClient.list(manifestId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all Closed Captions Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ClosedCaptionsMediaInfo&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ClosedCaptionsMediaInfo> list(String manifestId, ClosedCaptionsMediaInfoListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, queryParams).getData().getResult();
    }
    
    interface ClosedCaptionsApiClient {
    
        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/media/closed-captions")
        ResponseEnvelope<ClosedCaptionsMediaInfo> create(@Param(value = "manifest_id") String manifestId, ClosedCaptionsMediaInfo closedCaptionsMediaInfo) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/hls/{manifest_id}/media/closed-captions/{media_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/media/closed-captions/{media_id}")
        ResponseEnvelope<ClosedCaptionsMediaInfo> get(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/media/closed-captions")
        ResponseEnvelope<PaginationResponse<ClosedCaptionsMediaInfo>> list(@Param(value = "manifest_id") String manifestId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
