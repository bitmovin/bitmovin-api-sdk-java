package com.bitmovin.api.sdk.player.licenses.thirdPartyLicensing;

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

public class ThirdPartyLicensingApi {

    private final ThirdPartyLicensingApiClient apiClient;

    public ThirdPartyLicensingApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ThirdPartyLicensingApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ThirdPartyLicensingApi
     */
    public static BitmovinApiBuilder<ThirdPartyLicensingApi> builder() {
        return new BitmovinApiBuilder<>(ThirdPartyLicensingApi.class);
    }
    
    /**
     * Enable Third Party Licensing
     * 
     * @param licenseId Id of the Player License (required)
     * @param playerThirdPartyLicensing Third Party Licensing settings to apply to Player License (required)
     * @return PlayerThirdPartyLicensing
     * @throws BitmovinException if fails to make API call
     */
    public PlayerThirdPartyLicensing create(String licenseId, PlayerThirdPartyLicensing playerThirdPartyLicensing) throws BitmovinException {
        try {
            return this.apiClient.create(licenseId, playerThirdPartyLicensing).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Third Party Licensing Configuration
     * 
     * @param licenseId Id of the Player License (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String licenseId) throws BitmovinException {
        try {
            return this.apiClient.delete(licenseId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Get Third Party Licensing Configuration
     * 
     * @param licenseId Id of the Player License (required)
     * @return PlayerThirdPartyLicensing
     * @throws BitmovinException if fails to make API call
     */
    public PlayerThirdPartyLicensing get(String licenseId) throws BitmovinException {
        try {
            return this.apiClient.get(licenseId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface ThirdPartyLicensingApiClient {
    
        @RequestLine("POST /player/licenses/{license_id}/third-party-licensing")
        ResponseEnvelope<PlayerThirdPartyLicensing> create(@Param(value = "license_id") String licenseId, PlayerThirdPartyLicensing playerThirdPartyLicensing) throws BitmovinException;
    
        @RequestLine("DELETE /player/licenses/{license_id}/third-party-licensing")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "license_id") String licenseId) throws BitmovinException;
    
        @RequestLine("GET /player/licenses/{license_id}/third-party-licensing")
        ResponseEnvelope<PlayerThirdPartyLicensing> get(@Param(value = "license_id") String licenseId) throws BitmovinException;
    }
}
