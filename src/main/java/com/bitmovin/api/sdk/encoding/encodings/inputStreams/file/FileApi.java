package com.bitmovin.api.sdk.encoding.encodings.inputStreams.file;

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

public class FileApi {

    private final FileApiClient apiClient;

    public FileApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(FileApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of FileApi
     */
    public static BitmovinApiBuilder<FileApi> builder() {
        return new BitmovinApiBuilder<>(FileApi.class);
    }
    /**
     * Add File input stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param fileInputStream The File input stream to be created (required)
     * @return FileInputStream
     * @throws BitmovinException if fails to make API call
     */
    public FileInputStream create(String encodingId, FileInputStream fileInputStream) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, fileInputStream).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete File stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the File input stream. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String inputStreamId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, inputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * File input stream details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the File input stream. (required)
     * @return FileInputStream
     * @throws BitmovinException if fails to make API call
     */
    public FileInputStream get(String encodingId, String inputStreamId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List File input stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;FileInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<FileInputStream> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List File input stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;FileInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<FileInputStream> list(String encodingId, FileInputStreamListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface FileApiClient { 
        @RequestLine("POST /encoding/encodings/{encoding_id}/input-streams/file")
        ResponseEnvelope<FileInputStream> create(@Param(value = "encoding_id") String encodingId, FileInputStream fileInputStream) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/input-streams/file/{input_stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/file/{input_stream_id}")
        ResponseEnvelope<FileInputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/file")
        ResponseEnvelope<PaginationResponse<FileInputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
