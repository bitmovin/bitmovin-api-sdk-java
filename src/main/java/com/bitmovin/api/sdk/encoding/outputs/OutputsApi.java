package com.bitmovin.api.sdk.encoding.outputs;

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
import com.bitmovin.api.sdk.encoding.outputs.type.TypeApi;
import com.bitmovin.api.sdk.encoding.outputs.s3.S3Api;
import com.bitmovin.api.sdk.encoding.outputs.s3RoleBased.S3RoleBasedApi;
import com.bitmovin.api.sdk.encoding.outputs.genericS3.GenericS3Api;
import com.bitmovin.api.sdk.encoding.outputs.local.LocalApi;
import com.bitmovin.api.sdk.encoding.outputs.gcs.GcsApi;
import com.bitmovin.api.sdk.encoding.outputs.gcsServiceAccount.GcsServiceAccountApi;
import com.bitmovin.api.sdk.encoding.outputs.azure.AzureApi;
import com.bitmovin.api.sdk.encoding.outputs.ftp.FtpApi;
import com.bitmovin.api.sdk.encoding.outputs.sftp.SftpApi;
import com.bitmovin.api.sdk.encoding.outputs.akamaiMsl.AkamaiMslApi;
import com.bitmovin.api.sdk.encoding.outputs.akamaiNetstorage.AkamaiNetstorageApi;
import com.bitmovin.api.sdk.encoding.outputs.liveMediaIngest.LiveMediaIngestApi;
import com.bitmovin.api.sdk.encoding.outputs.cdn.CdnApi;

public class OutputsApi {
    public final TypeApi type;
    public final S3Api s3;
    public final S3RoleBasedApi s3RoleBased;
    public final GenericS3Api genericS3;
    public final LocalApi local;
    public final GcsApi gcs;
    public final GcsServiceAccountApi gcsServiceAccount;
    public final AzureApi azure;
    public final FtpApi ftp;
    public final SftpApi sftp;
    public final AkamaiMslApi akamaiMsl;
    public final AkamaiNetstorageApi akamaiNetstorage;
    public final LiveMediaIngestApi liveMediaIngest;
    public final CdnApi cdn;

    private final OutputsApiClient apiClient;

    public OutputsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(OutputsApiClient.class);

        this.type = new TypeApi(clientFactory);
        this.s3 = new S3Api(clientFactory);
        this.s3RoleBased = new S3RoleBasedApi(clientFactory);
        this.genericS3 = new GenericS3Api(clientFactory);
        this.local = new LocalApi(clientFactory);
        this.gcs = new GcsApi(clientFactory);
        this.gcsServiceAccount = new GcsServiceAccountApi(clientFactory);
        this.azure = new AzureApi(clientFactory);
        this.ftp = new FtpApi(clientFactory);
        this.sftp = new SftpApi(clientFactory);
        this.akamaiMsl = new AkamaiMslApi(clientFactory);
        this.akamaiNetstorage = new AkamaiNetstorageApi(clientFactory);
        this.liveMediaIngest = new LiveMediaIngestApi(clientFactory);
        this.cdn = new CdnApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of OutputsApi
     */
    public static BitmovinApiBuilder<OutputsApi> builder() {
        return new BitmovinApiBuilder<>(OutputsApi.class);
    }
    /**
     * Check output permissions (S3 only)
     * 
     * @param outputId Id of the output to be checked. Currently limited to S3 outputs. The access credentials that have been provided for this Output still need to be valid, otherwise the request will fail. If they are not valid any more, create a new Output with new credentials (resources are immutable). (required)
     * @return CheckOutputPermissionsResponse
     * @throws BitmovinException if fails to make API call
     */
    public CheckOutputPermissionsResponse checkPermissions(String outputId) throws BitmovinException {
        try {
            return this.apiClient.checkPermissions(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Check output permissions (S3 only)
     * 
     * @param outputId Id of the output to be checked. Currently limited to S3 outputs. The access credentials that have been provided for this Output still need to be valid, otherwise the request will fail. If they are not valid any more, create a new Output with new credentials (resources are immutable). (required)
     * @param checkOutputPermissionsRequest Additional parameters for the permissions check (optional)
     * @return CheckOutputPermissionsResponse
     * @throws BitmovinException if fails to make API call
     */
    public CheckOutputPermissionsResponse checkPermissions(String outputId, CheckOutputPermissionsRequest checkOutputPermissionsRequest) throws BitmovinException {
        try {
            return this.apiClient.checkPermissions(outputId, checkOutputPermissionsRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Get Output Details
     * 
     * @param outputId Id of the wanted output (required)
     * @return Output
     * @throws BitmovinException if fails to make API call
     */
    public Output get(String outputId) throws BitmovinException {
        try {
            return this.apiClient.get(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all Outputs
     * 
     * @return List&lt;Output&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Output> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Output&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Output> list(OutputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface OutputsApiClient { 
        @RequestLine("POST /encoding/outputs/{output_id}/check-permissions")
        ResponseEnvelope<CheckOutputPermissionsResponse> checkPermissions(@Param(value = "output_id") String outputId) throws BitmovinException;

        @RequestLine("POST /encoding/outputs/{output_id}/check-permissions")
        ResponseEnvelope<CheckOutputPermissionsResponse> checkPermissions(@Param(value = "output_id") String outputId, CheckOutputPermissionsRequest checkOutputPermissionsRequest) throws BitmovinException;
   
        @RequestLine("GET /encoding/outputs/{output_id}")
        ResponseEnvelope<Output> get(@Param(value = "output_id") String outputId) throws BitmovinException;
   
        @RequestLine("GET /encoding/outputs")
        ResponseEnvelope<PaginationResponse<Output>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
