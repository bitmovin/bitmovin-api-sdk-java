package com.bitmovin.api.sdk.encoding.templates;

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

public class TemplatesApi {

    private final TemplatesApiClient apiClient;

    public TemplatesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TemplatesApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of TemplatesApi
     */
    public static BitmovinApiBuilder<TemplatesApi> builder() {
        return new BitmovinApiBuilder<>(TemplatesApi.class);
    }
    /**
     * Store an Encoding Template
     * Stores an Encoding Template that can be used later to start encodings or standby pools 
     * @param encodingTemplateRequest The Encoding Template to be stored (required)
     * @return EncodingTemplateDetails
     * @throws BitmovinException if fails to make API call
     */
    public EncodingTemplateDetails create(Object encodingTemplateRequest) throws BitmovinException {
        try {
            return this.apiClient.create(encodingTemplateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Encoding Template
     * 
     * @param encodingTemplateId Id of the encoding template to delete (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingTemplateId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingTemplateId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Encoding Template details
     * Get the details of a stored Encoding Template 
     * @param encodingTemplateId Id of the Encoding Template (required)
     * @return EncodingTemplateDetails
     * @throws BitmovinException if fails to make API call
     */
    public EncodingTemplateDetails get(String encodingTemplateId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingTemplateId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List stored Encoding Templates
     * 
     * @return List&lt;EncodingTemplateResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EncodingTemplateResponse> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List stored Encoding Templates
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;EncodingTemplateResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EncodingTemplateResponse> list(EncodingTemplateResponseListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * BETA: Start an Encoding defined with an Encoding Template
     * 
     * @param encodingTemplateRequest The Encoding Template to start an Encoding from (required)
     * @return EncodingTemplateStartResponse
     * @throws BitmovinException if fails to make API call
     */
    public EncodingTemplateStartResponse start(Object encodingTemplateRequest) throws BitmovinException {
        try {
            return this.apiClient.start(encodingTemplateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface TemplatesApiClient { 
        @RequestLine("POST /encoding/templates")
        ResponseEnvelope<EncodingTemplateDetails> create(Object encodingTemplateRequest) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/templates/{encoding_template_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_template_id") String encodingTemplateId) throws BitmovinException;
   
        @RequestLine("GET /encoding/templates/{encoding_template_id}")
        ResponseEnvelope<EncodingTemplateDetails> get(@Param(value = "encoding_template_id") String encodingTemplateId) throws BitmovinException;
   
        @RequestLine("GET /encoding/templates")
        ResponseEnvelope<PaginationResponse<EncodingTemplateResponse>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
   
        @RequestLine("POST /encoding/templates/start")
        ResponseEnvelope<EncodingTemplateStartResponse> start(Object encodingTemplateRequest) throws BitmovinException;
    }
}
