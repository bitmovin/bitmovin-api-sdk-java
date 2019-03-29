package com.bitmovin.api.sdk.encoding.manifests.hls.media.vtt;

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

public class VttApi {

    private final VttApiClient apiClient;

    public VttApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(VttApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of VttApi
     */
    public static BitmovinApiBuilder<VttApi> builder() {
        return new BitmovinApiBuilder<>(VttApi.class);
    }
    
    /**
     * Add VTT Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param vttMediaInfo  (optional)
     * @return VttMediaInfo
     * @throws BitmovinException if fails to make API call
     */
    public VttMediaInfo create(String manifestId, VttMediaInfo vttMediaInfo) throws BitmovinException {
        return this.apiClient.create(manifestId, vttMediaInfo).getData().getResult();
    }
    
    /**
     * Delete VTT Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the VTT media. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String mediaId) throws BitmovinException {
        return this.apiClient.delete(manifestId, mediaId).getData().getResult();
    }
    
    /**
     * VTT Media Details
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the VTT media. (required)
     * @return VttMediaInfo
     * @throws BitmovinException if fails to make API call
     */
    public VttMediaInfo get(String manifestId, String mediaId) throws BitmovinException {
        return this.apiClient.get(manifestId, mediaId).getData().getResult();
    }
    
    /**
     * List all VTT Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @return List&lt;VttMediaInfo&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<VttMediaInfo> list(String manifestId) throws BitmovinException {
        return this.apiClient.list(manifestId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all VTT Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;VttMediaInfo&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<VttMediaInfo> list(String manifestId, VttMediaInfoListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, queryParams).getData().getResult();
    }
    
    interface VttApiClient {
    
        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/media/vtt")
        ResponseEnvelope<VttMediaInfo> create(@Param(value = "manifest_id") String manifestId, VttMediaInfo vttMediaInfo) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/hls/{manifest_id}/media/vtt/{media_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/media/vtt/{media_id}")
        ResponseEnvelope<VttMediaInfo> get(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/media/vtt")
        ResponseEnvelope<PaginationResponse<VttMediaInfo>> list(@Param(value = "manifest_id") String manifestId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
