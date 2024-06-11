package com.bitmovin.api.sdk.encoding.filters.azureSpeechToCaptions;

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
import com.bitmovin.api.sdk.encoding.filters.azureSpeechToCaptions.customdata.CustomdataApi;

public class AzureSpeechToCaptionsApi {
    public final CustomdataApi customdata;

    private final AzureSpeechToCaptionsApiClient apiClient;

    public AzureSpeechToCaptionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AzureSpeechToCaptionsApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AzureSpeechToCaptionsApi
     */
    public static BitmovinApiBuilder<AzureSpeechToCaptionsApi> builder() {
        return new BitmovinApiBuilder<>(AzureSpeechToCaptionsApi.class);
    }

    /**
     * Create Azure Speech to captions Filter
     * This filter uses the Azure Speech Services - Speech to captions feature to transcribe an audio stream in real-time.  - Required for this filter is an Azure account with an Azure Speech service resource. - Your own Azure speech service subscription key is required.  - This filter only works for Live Encodings. - This filter transforms an audio input stream into a captions stream. - The filter must be applied to a stream that has an audio input. - The stream&#39;s codec configuration must be a subtitle or caption format (WebVtt, TTML, ..). 
     * @param azureSpeechToCaptionsFilter The Azure Speech to captions Filter to be created (required)
     * @return AzureSpeechToCaptionsFilter
     * @throws BitmovinException if fails to make API call
     */
    public AzureSpeechToCaptionsFilter create(AzureSpeechToCaptionsFilter azureSpeechToCaptionsFilter) throws BitmovinException {
        try {
            return this.apiClient.create(azureSpeechToCaptionsFilter).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Azure Speech to captions Filter
     * 
     * @param filterId Id of the Azure Speech to captions Filter. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String filterId) throws BitmovinException {
        try {
            return this.apiClient.delete(filterId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Azure Speech to captions Filter details
     * 
     * @param filterId Id of the Azure Speech to captions Filter. (required)
     * @return AzureSpeechToCaptionsFilter
     * @throws BitmovinException if fails to make API call
     */
    public AzureSpeechToCaptionsFilter get(String filterId) throws BitmovinException {
        try {
            return this.apiClient.get(filterId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Azure Speech to captions Filters
     * 
     * @return List&lt;AzureSpeechToCaptionsFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AzureSpeechToCaptionsFilter> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Azure Speech to captions Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AzureSpeechToCaptionsFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AzureSpeechToCaptionsFilter> list(AzureSpeechToCaptionsFilterListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface AzureSpeechToCaptionsApiClient {

        @RequestLine("POST /encoding/filters/azure-speech-to-captions")
        ResponseEnvelope<AzureSpeechToCaptionsFilter> create(AzureSpeechToCaptionsFilter azureSpeechToCaptionsFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/azure-speech-to-captions/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/azure-speech-to-captions/{filter_id}")
        ResponseEnvelope<AzureSpeechToCaptionsFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/azure-speech-to-captions")
        ResponseEnvelope<PaginationResponse<AzureSpeechToCaptionsFilter>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
