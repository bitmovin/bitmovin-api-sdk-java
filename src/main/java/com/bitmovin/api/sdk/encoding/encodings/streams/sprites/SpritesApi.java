package com.bitmovin.api.sdk.encoding.encodings.streams.sprites;

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
import com.bitmovin.api.sdk.encoding.encodings.streams.sprites.customdata.CustomdataApi;

public class SpritesApi {
    public final CustomdataApi customdata;

    private final SpritesApiClient apiClient;

    public SpritesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SpritesApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SpritesApi
     */
    public static BitmovinApiBuilder<SpritesApi> builder() {
        return new BitmovinApiBuilder<>(SpritesApi.class);
    }
    
    /**
     * Add Sprite
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param sprite  (required)
     * @return Sprite
     * @throws BitmovinException if fails to make API call
     */
    public Sprite create(String encodingId, String streamId, Sprite sprite) throws BitmovinException {
        return this.apiClient.create(encodingId, streamId, sprite).getData().getResult();
    }
    
    /**
     * Delete Sprite
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param spriteId Id of the sprite. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String streamId, String spriteId) throws BitmovinException {
        return this.apiClient.delete(encodingId, streamId, spriteId).getData().getResult();
    }
    
    /**
     * Sprite Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param spriteId Id of the sprite configuration. (required)
     * @return Sprite
     * @throws BitmovinException if fails to make API call
     */
    public Sprite get(String encodingId, String streamId, String spriteId) throws BitmovinException {
        return this.apiClient.get(encodingId, streamId, spriteId).getData().getResult();
    }
    
    /**
     * List Sprites
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return List&lt;Sprite&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Sprite> list(String encodingId, String streamId) throws BitmovinException {
        return this.apiClient.list(encodingId, streamId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Sprites
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Sprite&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Sprite> list(String encodingId, String streamId, SpriteListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, streamId, queryParams).getData().getResult();
    }
    
    interface SpritesApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/streams/{stream_id}/sprites")
        ResponseEnvelope<Sprite> create(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, Sprite sprite) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}/sprites/{sprite_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "sprite_id") String spriteId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/sprites/{sprite_id}")
        ResponseEnvelope<Sprite> get(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "sprite_id") String spriteId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/sprites")
        ResponseEnvelope<PaginationResponse<Sprite>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
