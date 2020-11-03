package com.bitmovin.api.sdk.encoding.manifests;

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
import com.bitmovin.api.sdk.encoding.manifests.type.TypeApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.DashApi;
import com.bitmovin.api.sdk.encoding.manifests.hls.HlsApi;
import com.bitmovin.api.sdk.encoding.manifests.smooth.SmoothApi;

public class ManifestsApi {
    public final TypeApi type;
    public final DashApi dash;
    public final HlsApi hls;
    public final SmoothApi smooth;

    private final ManifestsApiClient apiClient;

    public ManifestsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ManifestsApiClient.class);

        this.type = new TypeApi(clientFactory);
        this.dash = new DashApi(clientFactory);
        this.hls = new HlsApi(clientFactory);
        this.smooth = new SmoothApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ManifestsApi
     */
    public static BitmovinApiBuilder<ManifestsApi> builder() {
        return new BitmovinApiBuilder<>(ManifestsApi.class);
    }
    
    /**
     * List all Manifests
     * 
     * @return List&lt;Manifest&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Manifest> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all Manifests
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Manifest&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Manifest> list(ManifestListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface ManifestsApiClient {
    
        @RequestLine("GET /encoding/manifests")
        ResponseEnvelope<PaginationResponse<Manifest>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
