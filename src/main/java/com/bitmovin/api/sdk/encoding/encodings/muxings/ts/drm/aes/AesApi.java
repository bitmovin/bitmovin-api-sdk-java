package com.bitmovin.api.sdk.encoding.encodings.muxings.ts.drm.aes;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.ts.drm.aes.customdata.CustomdataApi;

public class AesApi {
    public final CustomdataApi customdata;

    private final AesApiClient apiClient;

    public AesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AesApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AesApi
     */
    public static BitmovinApiBuilder<AesApi> builder() {
        return new BitmovinApiBuilder<>(AesApi.class);
    }
    
    /**
     * Add AES Encryption to TS Segment
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the TS muxing. (required)
     * @param aesEncryptionDrm The AES Encryption to be created (required)
     * @return AesEncryptionDrm
     * @throws BitmovinException if fails to make API call
     */
    public AesEncryptionDrm create(String encodingId, String muxingId, AesEncryptionDrm aesEncryptionDrm) throws BitmovinException {
        return this.apiClient.create(encodingId, muxingId, aesEncryptionDrm).getData().getResult();
    }
    
    /**
     * Delete AES Encryption from TS Segment
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the transport stream segment. (required)
     * @param drmId Id of the PlayReady DRM configuration. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId, String drmId) throws BitmovinException {
        return this.apiClient.delete(encodingId, muxingId, drmId).getData().getResult();
    }
    
    /**
     * AES Encryption Details of TS Segment
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the transport stream segment. (required)
     * @param drmId Id of the AESEncryption configuration. (required)
     * @return AesEncryptionDrm
     * @throws BitmovinException if fails to make API call
     */
    public AesEncryptionDrm get(String encodingId, String muxingId, String drmId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId, drmId).getData().getResult();
    }
    
    /**
     * List AES Encryption of TS Segment
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the transport stream segment. (required)
     * @return List&lt;AesEncryptionDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AesEncryptionDrm> list(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List AES Encryption of TS Segment
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the transport stream segment. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AesEncryptionDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AesEncryptionDrm> list(String encodingId, String muxingId, AesEncryptionDrmListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, queryParams).getData().getResult();
    }
    
    interface AesApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/ts/{muxing_id}/drm/aes")
        ResponseEnvelope<AesEncryptionDrm> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, AesEncryptionDrm aesEncryptionDrm) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/ts/{muxing_id}/drm/aes/{drm_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/ts/{muxing_id}/drm/aes/{drm_id}")
        ResponseEnvelope<AesEncryptionDrm> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/ts/{muxing_id}/drm/aes")
        ResponseEnvelope<PaginationResponse<AesEncryptionDrm>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
