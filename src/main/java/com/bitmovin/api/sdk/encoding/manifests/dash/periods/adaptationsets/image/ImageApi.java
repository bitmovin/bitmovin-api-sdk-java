package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.image;

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

public class ImageApi {

    private final ImageApiClient apiClient;

    public ImageApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ImageApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ImageApi
     */
    public static BitmovinApiBuilder<ImageApi> builder() {
        return new BitmovinApiBuilder<>(ImageApi.class);
    }
    /**
     * Add Image AdaptationSet
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param imageAdaptationSet The image adaptation set to be added to the period (required)
     * @return ImageAdaptationSet
     * @throws BitmovinException if fails to make API call
     */
    public ImageAdaptationSet create(String manifestId, String periodId, ImageAdaptationSet imageAdaptationSet) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, periodId, imageAdaptationSet).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Image AdaptationSet
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the audio adaptation set to be deleted (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        try {
            return this.apiClient.delete(manifestId, periodId, adaptationsetId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Image AdaptationSet Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the Image adaptation set (required)
     * @return ImageAdaptationSet
     * @throws BitmovinException if fails to make API call
     */
    public ImageAdaptationSet get(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, periodId, adaptationsetId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all Image AdaptationSets
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @return List&lt;ImageAdaptationSet&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ImageAdaptationSet> list(String manifestId, String periodId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Image AdaptationSets
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ImageAdaptationSet&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ImageAdaptationSet> list(String manifestId, String periodId, ImageAdaptationSetListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ImageApiClient { 
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/image")
        ResponseEnvelope<ImageAdaptationSet> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, ImageAdaptationSet imageAdaptationSet) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/image/{adaptationset_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId) throws BitmovinException;
   
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/image/{adaptationset_id}")
        ResponseEnvelope<ImageAdaptationSet> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId) throws BitmovinException;
   
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/image")
        ResponseEnvelope<PaginationResponse<ImageAdaptationSet>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
