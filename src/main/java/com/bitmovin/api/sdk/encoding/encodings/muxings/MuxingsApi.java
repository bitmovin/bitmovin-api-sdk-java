package com.bitmovin.api.sdk.encoding.encodings.muxings;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.Fmp4Api;
import com.bitmovin.api.sdk.encoding.encodings.muxings.chunkedText.ChunkedTextApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.cmaf.CmafApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.segmentedRaw.SegmentedRawApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.text.TextApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.ts.TsApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.webm.WebmApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.mp3.Mp3Api;
import com.bitmovin.api.sdk.encoding.encodings.muxings.mp4.Mp4Api;
import com.bitmovin.api.sdk.encoding.encodings.muxings.mxf.MxfApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.ProgressiveTsApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.broadcastTs.BroadcastTsApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm.ProgressiveWebmApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveMov.ProgressiveMovApi;

public class MuxingsApi {
    public final Fmp4Api fmp4;
    public final ChunkedTextApi chunkedText;
    public final CmafApi cmaf;
    public final SegmentedRawApi segmentedRaw;
    public final TextApi text;
    public final TsApi ts;
    public final WebmApi webm;
    public final Mp3Api mp3;
    public final Mp4Api mp4;
    public final MxfApi mxf;
    public final ProgressiveTsApi progressiveTs;
    public final BroadcastTsApi broadcastTs;
    public final ProgressiveWebmApi progressiveWebm;
    public final ProgressiveMovApi progressiveMov;

    private final MuxingsApiClient apiClient;

    public MuxingsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(MuxingsApiClient.class);

        this.fmp4 = new Fmp4Api(clientFactory);
        this.chunkedText = new ChunkedTextApi(clientFactory);
        this.cmaf = new CmafApi(clientFactory);
        this.segmentedRaw = new SegmentedRawApi(clientFactory);
        this.text = new TextApi(clientFactory);
        this.ts = new TsApi(clientFactory);
        this.webm = new WebmApi(clientFactory);
        this.mp3 = new Mp3Api(clientFactory);
        this.mp4 = new Mp4Api(clientFactory);
        this.mxf = new MxfApi(clientFactory);
        this.progressiveTs = new ProgressiveTsApi(clientFactory);
        this.broadcastTs = new BroadcastTsApi(clientFactory);
        this.progressiveWebm = new ProgressiveWebmApi(clientFactory);
        this.progressiveMov = new ProgressiveMovApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of MuxingsApi
     */
    public static BitmovinApiBuilder<MuxingsApi> builder() {
        return new BitmovinApiBuilder<>(MuxingsApi.class);
    }
    
    /**
     * Muxing Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the muxing. (required)
     * @return Muxing
     * @throws BitmovinException if fails to make API call
     */
    public Muxing get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List All Muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;Muxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Muxing> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List All Muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Muxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Muxing> list(String encodingId, MuxingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface MuxingsApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/{muxing_id}")
        ResponseEnvelope<Muxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings")
        ResponseEnvelope<PaginationResponse<Muxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
