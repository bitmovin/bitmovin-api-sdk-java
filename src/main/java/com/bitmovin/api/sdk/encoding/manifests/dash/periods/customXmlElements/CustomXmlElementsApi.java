package com.bitmovin.api.sdk.encoding.manifests.dash.periods.customXmlElements;

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

public class CustomXmlElementsApi {

    private final CustomXmlElementsApiClient apiClient;

    public CustomXmlElementsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CustomXmlElementsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of CustomXmlElementsApi
     */
    public static BitmovinApiBuilder<CustomXmlElementsApi> builder() {
        return new BitmovinApiBuilder<>(CustomXmlElementsApi.class);
    }
    
    /**
     * Add Custom XML Element to Period
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param customXmlElement Data of the custom XML element to be added to the period (optional)
     * @return CustomXmlElement
     * @throws BitmovinException if fails to make API call
     */
    public CustomXmlElement create(String manifestId, String periodId, CustomXmlElement customXmlElement) throws BitmovinException {
        return this.apiClient.create(manifestId, periodId, customXmlElement).getData().getResult();
    }
    
    /**
     * Delete Custom XML Element
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param customXmlElementId Id of the Custom XML Element (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String periodId, String customXmlElementId) throws BitmovinException {
        return this.apiClient.delete(manifestId, periodId, customXmlElementId).getData().getResult();
    }
    
    /**
     * Custom XML Element Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param customXmlElementId Id of the Custom XML Element (required)
     * @return CustomXmlElement
     * @throws BitmovinException if fails to make API call
     */
    public CustomXmlElement get(String manifestId, String periodId, String customXmlElementId) throws BitmovinException {
        return this.apiClient.get(manifestId, periodId, customXmlElementId).getData().getResult();
    }
    
    /**
     * List all Custom XML Elements of Period
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @return List&lt;CustomXmlElement&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CustomXmlElement> list(String manifestId, String periodId) throws BitmovinException {
        return this.apiClient.list(manifestId, periodId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all Custom XML Elements of Period
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;CustomXmlElement&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CustomXmlElement> list(String manifestId, String periodId, CustomXmlElementListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, periodId, queryParams).getData().getResult();
    }
    
    interface CustomXmlElementsApiClient {
    
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/custom-xml-elements")
        ResponseEnvelope<CustomXmlElement> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, CustomXmlElement customXmlElement) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/custom-xml-elements/{custom_xml_element_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "custom_xml_element_id") String customXmlElementId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/custom-xml-elements/{custom_xml_element_id}")
        ResponseEnvelope<CustomXmlElement> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "custom_xml_element_id") String customXmlElementId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/custom-xml-elements")
        ResponseEnvelope<PaginationResponse<CustomXmlElement>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
