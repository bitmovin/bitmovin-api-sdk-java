package com.bitmovin.api.sdk.encoding.manifests.smooth.contentprotection;

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

public class ContentprotectionApi {

    private final ContentprotectionApiClient apiClient;

    public ContentprotectionApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ContentprotectionApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ContentprotectionApi
     */
    public static BitmovinApiBuilder<ContentprotectionApi> builder() {
        return new BitmovinApiBuilder<>(ContentprotectionApi.class);
    }
    
    /**
     * Add Content Protection to Smooth Streaming
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @param smoothManifestContentProtection The Content Protection to be added (required)
     * @return SmoothManifestContentProtection
     * @throws BitmovinException if fails to make API call
     */
    public SmoothManifestContentProtection create(String manifestId, SmoothManifestContentProtection smoothManifestContentProtection) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, smoothManifestContentProtection).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Content Protection of Smooth Streaming
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @param protectionId Id of the content protection. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String protectionId) throws BitmovinException {
        try {
            return this.apiClient.delete(manifestId, protectionId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Content Protection of Smooth Streaming Representation Details
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @param protectionId Id of the content protection. (required)
     * @return SmoothManifestContentProtection
     * @throws BitmovinException if fails to make API call
     */
    public SmoothManifestContentProtection get(String manifestId, String protectionId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, protectionId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Content Protection of Smooth Streaming
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @return List&lt;SmoothManifestContentProtection&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SmoothManifestContentProtection> list(String manifestId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Content Protection of Smooth Streaming
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SmoothManifestContentProtection&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SmoothManifestContentProtection> list(String manifestId, SmoothManifestContentProtectionListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface ContentprotectionApiClient {
    
        @RequestLine("POST /encoding/manifests/smooth/{manifest_id}/contentprotection")
        ResponseEnvelope<SmoothManifestContentProtection> create(@Param(value = "manifest_id") String manifestId, SmoothManifestContentProtection smoothManifestContentProtection) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/smooth/{manifest_id}/contentprotection/{protection_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "protection_id") String protectionId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/smooth/{manifest_id}/contentprotection/{protection_id}")
        ResponseEnvelope<SmoothManifestContentProtection> get(@Param(value = "manifest_id") String manifestId, @Param(value = "protection_id") String protectionId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/smooth/{manifest_id}/contentprotection")
        ResponseEnvelope<PaginationResponse<SmoothManifestContentProtection>> list(@Param(value = "manifest_id") String manifestId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
