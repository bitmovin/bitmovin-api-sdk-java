package com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.drm;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.drm.widevine.WidevineApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.drm.playready.PlayreadyApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.drm.primetime.PrimetimeApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.drm.fairplay.FairplayApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.drm.marlin.MarlinApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.drm.clearkey.ClearkeyApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.drm.cenc.CencApi;

public class DrmApi {
    public final WidevineApi widevine;
    public final PlayreadyApi playready;
    public final PrimetimeApi primetime;
    public final FairplayApi fairplay;
    public final MarlinApi marlin;
    public final ClearkeyApi clearkey;
    public final CencApi cenc;

    private final DrmApiClient apiClient;

    public DrmApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DrmApiClient.class);

        this.widevine = new WidevineApi(clientFactory);
        this.playready = new PlayreadyApi(clientFactory);
        this.primetime = new PrimetimeApi(clientFactory);
        this.fairplay = new FairplayApi(clientFactory);
        this.marlin = new MarlinApi(clientFactory);
        this.clearkey = new ClearkeyApi(clientFactory);
        this.cenc = new CencApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DrmApi
     */
    public static BitmovinApiBuilder<DrmApi> builder() {
        return new BitmovinApiBuilder<>(DrmApi.class);
    }
    
    /**
     * List all DRMs of FMP4 Muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing (required)
     * @return List&lt;Drm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Drm> list(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId).getData().getResult();
    }
    
    interface DrmApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}/drm")
        ResponseEnvelope<PaginationResponse<Drm>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    }
}
