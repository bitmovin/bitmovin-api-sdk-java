package com.bitmovin.api.sdk.encoding.encodings.streams.watermarking.nexguardFileMarker;

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
import com.bitmovin.api.sdk.encoding.encodings.streams.watermarking.nexguardFileMarker.customdata.CustomdataApi;

public class NexguardFileMarkerApi {
    public final CustomdataApi customdata;

    private final NexguardFileMarkerApiClient apiClient;

    public NexguardFileMarkerApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(NexguardFileMarkerApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of NexguardFileMarkerApi
     */
    public static BitmovinApiBuilder<NexguardFileMarkerApi> builder() {
        return new BitmovinApiBuilder<>(NexguardFileMarkerApi.class);
    }

    /**
     * Add a nexguard file marker watermarking configurations
     * Nexguard FileMarker watermarking has several restrictions on the shape of your streams and muxings. The supported muxings are currently fMP4, TS and WebM; segment naming must follow &#x60;&lt;filename&gt;_&lt;number&gt;.&lt;extension&gt;&#x60;; init segment naming must follow &#x60;&lt;filename&gt;_init.&lt;extension&gt;&#x60; Supported framerates:   * 23.976   * 24.000   * 25.000   * 29.970   * 30.000   * 48.000   * 50.000   * 59.940   * 60.000  Resolution:   * 320 &lt;&#x3D; width &lt;&#x3D; 5120   * 240 &lt;&#x3D; height &lt;&#x3D; 3200  And the GOP size has to be 2 or 2.002 seconds. Please note that our api requires the gop size to be in frames. 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param nexGuardFileMarker The nexguard file marker configurations (required)
     * @return NexGuardFileMarker
     * @throws BitmovinException if fails to make API call
     */
    public NexGuardFileMarker create(String encodingId, String streamId, NexGuardFileMarker nexGuardFileMarker) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, streamId, nexGuardFileMarker).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete nexguard file marker watermarking configurations
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param nexguardId Id of the nexguard file marker watermarking configurations (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String streamId, String nexguardId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, streamId, nexguardId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Nexguard file marker watermarking configurations details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param nexguardId Id of the nexguard file marker watermarking configurations. (required)
     * @return NexGuardFileMarker
     * @throws BitmovinException if fails to make API call
     */
    public NexGuardFileMarker get(String encodingId, String streamId, String nexguardId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, streamId, nexguardId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List nexguard file marker watermarking configurations
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return List&lt;NexGuardFileMarker&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<NexGuardFileMarker> list(String encodingId, String streamId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List nexguard file marker watermarking configurations
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;NexGuardFileMarker&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<NexGuardFileMarker> list(String encodingId, String streamId, NexGuardFileMarkerListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface NexguardFileMarkerApiClient {

        @RequestLine("POST /encoding/encodings/{encoding_id}/streams/{stream_id}/watermarking/nexguard-file-marker")
        ResponseEnvelope<NexGuardFileMarker> create(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, NexGuardFileMarker nexGuardFileMarker) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}/watermarking/nexguard-file-marker/{nexguard_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "nexguard_id") String nexguardId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/watermarking/nexguard-file-marker/{nexguard_id}")
        ResponseEnvelope<NexGuardFileMarker> get(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "nexguard_id") String nexguardId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/watermarking/nexguard-file-marker")
        ResponseEnvelope<PaginationResponse<NexGuardFileMarker>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
