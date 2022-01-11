package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets;

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
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.type.TypeApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.audio.AudioApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.video.VideoApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.subtitle.SubtitleApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.image.ImageApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.RepresentationsApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.contentprotection.ContentprotectionApi;

public class AdaptationsetsApi {
    public final TypeApi type;
    public final AudioApi audio;
    public final VideoApi video;
    public final SubtitleApi subtitle;
    public final ImageApi image;
    public final RepresentationsApi representations;
    public final ContentprotectionApi contentprotection;

    private final AdaptationsetsApiClient apiClient;

    public AdaptationsetsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AdaptationsetsApiClient.class);

        this.type = new TypeApi(clientFactory);
        this.audio = new AudioApi(clientFactory);
        this.video = new VideoApi(clientFactory);
        this.subtitle = new SubtitleApi(clientFactory);
        this.image = new ImageApi(clientFactory);
        this.representations = new RepresentationsApi(clientFactory);
        this.contentprotection = new ContentprotectionApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AdaptationsetsApi
     */
    public static BitmovinApiBuilder<AdaptationsetsApi> builder() {
        return new BitmovinApiBuilder<>(AdaptationsetsApi.class);
    }

    /**
     * List all AdaptationSets
     * 
     * @param manifestId Id of the Manifest (required)
     * @param periodId Id of the Period (required)
     * @return List&lt;AdaptationSet&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AdaptationSet> list(String manifestId, String periodId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all AdaptationSets
     * 
     * @param manifestId Id of the Manifest (required)
     * @param periodId Id of the Period (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AdaptationSet&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AdaptationSet> list(String manifestId, String periodId, AdaptationSetListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface AdaptationsetsApiClient {

        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets")
        ResponseEnvelope<PaginationResponse<AdaptationSet>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
