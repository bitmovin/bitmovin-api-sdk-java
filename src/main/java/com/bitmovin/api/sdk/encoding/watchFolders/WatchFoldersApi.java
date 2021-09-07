package com.bitmovin.api.sdk.encoding.watchFolders;

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

public class WatchFoldersApi {

    private final WatchFoldersApiClient apiClient;

    public WatchFoldersApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(WatchFoldersApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of WatchFoldersApi
     */
    public static BitmovinApiBuilder<WatchFoldersApi> builder() {
        return new BitmovinApiBuilder<>(WatchFoldersApi.class);
    }

    /**
     * Create Watch Folder
     * 
     * @param watchFolder The Watch Folder to be created (required)
     * @return WatchFolder
     * @throws BitmovinException if fails to make API call
     */
    public WatchFolder create(WatchFolder watchFolder) throws BitmovinException {
        try {
            return this.apiClient.create(watchFolder).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Watch Folder
     * 
     * @param watchFolderId Id of the Watch Folder (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String watchFolderId) throws BitmovinException {
        try {
            return this.apiClient.delete(watchFolderId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Watch Folder details
     * 
     * @param watchFolderId Id of the Watch Folder (required)
     * @return WatchFolder
     * @throws BitmovinException if fails to make API call
     */
    public WatchFolder get(String watchFolderId) throws BitmovinException {
        try {
            return this.apiClient.get(watchFolderId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Watch Folders
     * 
     * @return List&lt;WatchFolder&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WatchFolder> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Watch Folders
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;WatchFolder&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WatchFolder> list(WatchFolderListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Start Watch Folder
     * 
     * @param watchFolderId Id of the Watch Folder (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse start(String watchFolderId) throws BitmovinException {
        try {
            return this.apiClient.start(watchFolderId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Stop Watch Folder
     * 
     * @param watchFolderId Id of the Watch Folder (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse stop(String watchFolderId) throws BitmovinException {
        try {
            return this.apiClient.stop(watchFolderId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface WatchFoldersApiClient {

        @RequestLine("POST /encoding/watch-folders")
        ResponseEnvelope<WatchFolder> create(WatchFolder watchFolder) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/watch-folders/{watch_folder_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "watch_folder_id") String watchFolderId) throws BitmovinException;
    
        @RequestLine("GET /encoding/watch-folders/{watch_folder_id}")
        ResponseEnvelope<WatchFolder> get(@Param(value = "watch_folder_id") String watchFolderId) throws BitmovinException;
    
        @RequestLine("GET /encoding/watch-folders")
        ResponseEnvelope<PaginationResponse<WatchFolder>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    
        @RequestLine("POST /encoding/watch-folders/{watch_folder_id}/start")
        ResponseEnvelope<BitmovinResponse> start(@Param(value = "watch_folder_id") String watchFolderId) throws BitmovinException;
    
        @RequestLine("POST /encoding/watch-folders/{watch_folder_id}/stop")
        ResponseEnvelope<BitmovinResponse> stop(@Param(value = "watch_folder_id") String watchFolderId) throws BitmovinException;
    }
}
