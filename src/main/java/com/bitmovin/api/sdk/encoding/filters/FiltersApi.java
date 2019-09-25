package com.bitmovin.api.sdk.encoding.filters;

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
import com.bitmovin.api.sdk.encoding.filters.conform.ConformApi;
import com.bitmovin.api.sdk.encoding.filters.watermark.WatermarkApi;
import com.bitmovin.api.sdk.encoding.filters.audioVolume.AudioVolumeApi;
import com.bitmovin.api.sdk.encoding.filters.enhancedWatermark.EnhancedWatermarkApi;
import com.bitmovin.api.sdk.encoding.filters.crop.CropApi;
import com.bitmovin.api.sdk.encoding.filters.rotate.RotateApi;
import com.bitmovin.api.sdk.encoding.filters.deinterlace.DeinterlaceApi;
import com.bitmovin.api.sdk.encoding.filters.audioMix.AudioMixApi;
import com.bitmovin.api.sdk.encoding.filters.denoiseHqdn3d.DenoiseHqdn3dApi;
import com.bitmovin.api.sdk.encoding.filters.ebuR128SinglePass.EbuR128SinglePassApi;
import com.bitmovin.api.sdk.encoding.filters.text.TextApi;
import com.bitmovin.api.sdk.encoding.filters.interlace.InterlaceApi;
import com.bitmovin.api.sdk.encoding.filters.unsharp.UnsharpApi;
import com.bitmovin.api.sdk.encoding.filters.scale.ScaleApi;
import com.bitmovin.api.sdk.encoding.filters.type.TypeApi;

public class FiltersApi {
    public final ConformApi conform;
    public final WatermarkApi watermark;
    public final AudioVolumeApi audioVolume;
    public final EnhancedWatermarkApi enhancedWatermark;
    public final CropApi crop;
    public final RotateApi rotate;
    public final DeinterlaceApi deinterlace;
    public final AudioMixApi audioMix;
    public final DenoiseHqdn3dApi denoiseHqdn3d;
    public final EbuR128SinglePassApi ebuR128SinglePass;
    public final TextApi text;
    public final InterlaceApi interlace;
    public final UnsharpApi unsharp;
    public final ScaleApi scale;
    public final TypeApi type;

    private final FiltersApiClient apiClient;

    public FiltersApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(FiltersApiClient.class);

        this.conform = new ConformApi(clientFactory);
        this.watermark = new WatermarkApi(clientFactory);
        this.audioVolume = new AudioVolumeApi(clientFactory);
        this.enhancedWatermark = new EnhancedWatermarkApi(clientFactory);
        this.crop = new CropApi(clientFactory);
        this.rotate = new RotateApi(clientFactory);
        this.deinterlace = new DeinterlaceApi(clientFactory);
        this.audioMix = new AudioMixApi(clientFactory);
        this.denoiseHqdn3d = new DenoiseHqdn3dApi(clientFactory);
        this.ebuR128SinglePass = new EbuR128SinglePassApi(clientFactory);
        this.text = new TextApi(clientFactory);
        this.interlace = new InterlaceApi(clientFactory);
        this.unsharp = new UnsharpApi(clientFactory);
        this.scale = new ScaleApi(clientFactory);
        this.type = new TypeApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of FiltersApi
     */
    public static BitmovinApiBuilder<FiltersApi> builder() {
        return new BitmovinApiBuilder<>(FiltersApi.class);
    }
    
    /**
     * List all Filters
     * 
     * @return List&lt;Filter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Filter> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Filter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Filter> list(FilterListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface FiltersApiClient {
    
        @RequestLine("GET /encoding/filters")
        ResponseEnvelope<PaginationResponse<Filter>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
