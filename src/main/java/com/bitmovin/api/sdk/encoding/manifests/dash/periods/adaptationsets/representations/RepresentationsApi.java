package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations;

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
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.type.TypeApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.vtt.VttApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.imsc.ImscApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.sprite.SpriteApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.fmp4.Fmp4Api;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.chunkedText.ChunkedTextApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.cmaf.CmafApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.mp4.Mp4Api;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.webm.WebmApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.progressiveWebm.ProgressiveWebmApi;

public class RepresentationsApi {
    public final TypeApi type;
    public final VttApi vtt;
    public final ImscApi imsc;
    public final SpriteApi sprite;
    public final Fmp4Api fmp4;
    public final ChunkedTextApi chunkedText;
    public final CmafApi cmaf;
    public final Mp4Api mp4;
    public final WebmApi webm;
    public final ProgressiveWebmApi progressiveWebm;

    private final RepresentationsApiClient apiClient;

    public RepresentationsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(RepresentationsApiClient.class);

        this.type = new TypeApi(clientFactory);
        this.vtt = new VttApi(clientFactory);
        this.imsc = new ImscApi(clientFactory);
        this.sprite = new SpriteApi(clientFactory);
        this.fmp4 = new Fmp4Api(clientFactory);
        this.chunkedText = new ChunkedTextApi(clientFactory);
        this.cmaf = new CmafApi(clientFactory);
        this.mp4 = new Mp4Api(clientFactory);
        this.webm = new WebmApi(clientFactory);
        this.progressiveWebm = new ProgressiveWebmApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of RepresentationsApi
     */
    public static BitmovinApiBuilder<RepresentationsApi> builder() {
        return new BitmovinApiBuilder<>(RepresentationsApi.class);
    }

    /**
     * List all DASH Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @return List&lt;DashRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashRepresentation> list(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all DASH Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DashRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashRepresentation> list(String manifestId, String periodId, String adaptationsetId, DashRepresentationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface RepresentationsApiClient {

        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations")
        ResponseEnvelope<PaginationResponse<DashRepresentation>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
