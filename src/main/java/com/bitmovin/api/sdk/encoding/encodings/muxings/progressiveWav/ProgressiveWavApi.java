package com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWav;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWav.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWav.information.InformationApi;

public class ProgressiveWavApi {
    public final CustomdataApi customdata;
    public final InformationApi information;

    private final ProgressiveWavApiClient apiClient;

    public ProgressiveWavApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ProgressiveWavApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.information = new InformationApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ProgressiveWavApi
     */
    public static BitmovinApiBuilder<ProgressiveWavApi> builder() {
        return new BitmovinApiBuilder<>(ProgressiveWavApi.class);
    }

    /**
     * Add Progressive Wav muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param progressiveWavMuxing The Progressive WAV muxing to be created (required)
     * @return ProgressiveWavMuxing
     * @throws BitmovinException if fails to make API call
     */
    public ProgressiveWavMuxing create(String encodingId, ProgressiveWavMuxing progressiveWavMuxing) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, progressiveWavMuxing).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Progressive WAV muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive WAV muxing (required)
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
     * Progressive WAV muxing details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive WAV muxing (required)
     * @return ProgressiveWavMuxing
     * @throws BitmovinException if fails to make API call
     */
    public ProgressiveWavMuxing get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Progressive WAV muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;ProgressiveWavMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ProgressiveWavMuxing> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Progressive WAV muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ProgressiveWavMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ProgressiveWavMuxing> list(String encodingId, ProgressiveWavMuxingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ProgressiveWavApiClient {

        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/progressive-wav")
        ResponseEnvelope<ProgressiveWavMuxing> create(@Param(value = "encoding_id") String encodingId, ProgressiveWavMuxing progressiveWavMuxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/progressive-wav/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-wav/{muxing_id}")
        ResponseEnvelope<ProgressiveWavMuxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-wav")
        ResponseEnvelope<PaginationResponse<ProgressiveWavMuxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
