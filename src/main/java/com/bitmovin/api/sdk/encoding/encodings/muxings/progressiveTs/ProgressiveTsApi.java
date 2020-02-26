package com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.information.InformationApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.id3.Id3Api;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.drm.DrmApi;

public class ProgressiveTsApi {
    public final CustomdataApi customdata;
    public final InformationApi information;
    public final Id3Api id3;
    public final DrmApi drm;

    private final ProgressiveTsApiClient apiClient;

    public ProgressiveTsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ProgressiveTsApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.information = new InformationApi(clientFactory);
        this.id3 = new Id3Api(clientFactory);
        this.drm = new DrmApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ProgressiveTsApi
     */
    public static BitmovinApiBuilder<ProgressiveTsApi> builder() {
        return new BitmovinApiBuilder<>(ProgressiveTsApi.class);
    }
    
    /**
     * Add Progressive TS muxing
     * 
     * @param encodingId ID of the encoding. (required)
     * @param progressiveTsMuxing The Progressive TS muxing to be created (required)
     * @return ProgressiveTsMuxing
     * @throws BitmovinException if fails to make API call
     */
    public ProgressiveTsMuxing create(String encodingId, ProgressiveTsMuxing progressiveTsMuxing) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, progressiveTsMuxing).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Progressive TS muxing
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS muxing (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Progressive TS muxing details
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the Progressive TS muxing (required)
     * @return ProgressiveTsMuxing
     * @throws BitmovinException if fails to make API call
     */
    public ProgressiveTsMuxing get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Progressive TS muxings
     * 
     * @param encodingId ID of the Encoding. (required)
     * @return List&lt;ProgressiveTsMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ProgressiveTsMuxing> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Progressive TS muxings
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ProgressiveTsMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ProgressiveTsMuxing> list(String encodingId, ProgressiveTsMuxingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface ProgressiveTsApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/progressive-ts")
        ResponseEnvelope<ProgressiveTsMuxing> create(@Param(value = "encoding_id") String encodingId, ProgressiveTsMuxing progressiveTsMuxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}")
        ResponseEnvelope<ProgressiveTsMuxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-ts")
        ResponseEnvelope<PaginationResponse<ProgressiveTsMuxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
