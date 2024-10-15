package com.bitmovin.api.sdk.encoding.inputs;

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
import com.bitmovin.api.sdk.encoding.inputs.type.TypeApi;
import com.bitmovin.api.sdk.encoding.inputs.rtmp.RtmpApi;
import com.bitmovin.api.sdk.encoding.inputs.redundantRtmp.RedundantRtmpApi;
import com.bitmovin.api.sdk.encoding.inputs.s3.S3Api;
import com.bitmovin.api.sdk.encoding.inputs.s3RoleBased.S3RoleBasedApi;
import com.bitmovin.api.sdk.encoding.inputs.genericS3.GenericS3Api;
import com.bitmovin.api.sdk.encoding.inputs.local.LocalApi;
import com.bitmovin.api.sdk.encoding.inputs.gcs.GcsApi;
import com.bitmovin.api.sdk.encoding.inputs.gcsServiceAccount.GcsServiceAccountApi;
import com.bitmovin.api.sdk.encoding.inputs.azure.AzureApi;
import com.bitmovin.api.sdk.encoding.inputs.ftp.FtpApi;
import com.bitmovin.api.sdk.encoding.inputs.sftp.SftpApi;
import com.bitmovin.api.sdk.encoding.inputs.http.HttpApi;
import com.bitmovin.api.sdk.encoding.inputs.https.HttpsApi;
import com.bitmovin.api.sdk.encoding.inputs.aspera.AsperaApi;
import com.bitmovin.api.sdk.encoding.inputs.akamaiNetstorage.AkamaiNetstorageApi;
import com.bitmovin.api.sdk.encoding.inputs.srt.SrtApi;
import com.bitmovin.api.sdk.encoding.inputs.zixi.ZixiApi;
import com.bitmovin.api.sdk.encoding.inputs.directFileUpload.DirectFileUploadApi;

public class InputsApi {
    public final TypeApi type;
    public final RtmpApi rtmp;
    public final RedundantRtmpApi redundantRtmp;
    public final S3Api s3;
    public final S3RoleBasedApi s3RoleBased;
    public final GenericS3Api genericS3;
    public final LocalApi local;
    public final GcsApi gcs;
    public final GcsServiceAccountApi gcsServiceAccount;
    public final AzureApi azure;
    public final FtpApi ftp;
    public final SftpApi sftp;
    public final HttpApi http;
    public final HttpsApi https;
    public final AsperaApi aspera;
    public final AkamaiNetstorageApi akamaiNetstorage;
    public final SrtApi srt;
    public final ZixiApi zixi;
    public final DirectFileUploadApi directFileUpload;

    private final InputsApiClient apiClient;

    public InputsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(InputsApiClient.class);

        this.type = new TypeApi(clientFactory);
        this.rtmp = new RtmpApi(clientFactory);
        this.redundantRtmp = new RedundantRtmpApi(clientFactory);
        this.s3 = new S3Api(clientFactory);
        this.s3RoleBased = new S3RoleBasedApi(clientFactory);
        this.genericS3 = new GenericS3Api(clientFactory);
        this.local = new LocalApi(clientFactory);
        this.gcs = new GcsApi(clientFactory);
        this.gcsServiceAccount = new GcsServiceAccountApi(clientFactory);
        this.azure = new AzureApi(clientFactory);
        this.ftp = new FtpApi(clientFactory);
        this.sftp = new SftpApi(clientFactory);
        this.http = new HttpApi(clientFactory);
        this.https = new HttpsApi(clientFactory);
        this.aspera = new AsperaApi(clientFactory);
        this.akamaiNetstorage = new AkamaiNetstorageApi(clientFactory);
        this.srt = new SrtApi(clientFactory);
        this.zixi = new ZixiApi(clientFactory);
        this.directFileUpload = new DirectFileUploadApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of InputsApi
     */
    public static BitmovinApiBuilder<InputsApi> builder() {
        return new BitmovinApiBuilder<>(InputsApi.class);
    }
    /**
     * Get Input Details
     * 
     * @param inputId Id of the Input (required)
     * @return Input
     * @throws BitmovinException if fails to make API call
     */
    public Input get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all Inputs
     * 
     * @return List&lt;Input&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Input> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Input&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Input> list(InputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface InputsApiClient { 
        @RequestLine("GET /encoding/inputs/{input_id}")
        ResponseEnvelope<Input> get(@Param(value = "input_id") String inputId) throws BitmovinException;
   
        @RequestLine("GET /encoding/inputs")
        ResponseEnvelope<PaginationResponse<Input>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
