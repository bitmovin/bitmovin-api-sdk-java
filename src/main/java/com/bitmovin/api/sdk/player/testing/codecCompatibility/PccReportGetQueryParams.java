package com.bitmovin.api.sdk.player.testing.codecCompatibility;

import java.util.Date;
import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class PccReportGetQueryParams extends HashMap<String, Object> {

    public Boolean getIncludePrerelease() {
        return (Boolean) this.get("includePrerelease");
    }

    /**
    * @param includePrerelease Include pools with only prerelease browser evidence. Available to every report reader. Literal true or false. (optional, default to false)
    */
    public void setIncludePrerelease(Boolean includePrerelease) {
        this.put("includePrerelease", includePrerelease);
    }

    public Boolean getReportedOnly() {
        return (Boolean) this.get("reportedOnly");
    }

    /**
    * @param reportedOnly Keep pools with a device answer in at least one selected cell. Literal true or false. (optional, default to false)
    */
    public void setReportedOnly(Boolean reportedOnly) {
        this.put("reportedOnly", reportedOnly);
    }

    public Boolean getHdrOnly() {
        return (Boolean) this.get("hdrOnly");
    }

    /**
    * @param hdrOnly Select only HDR columns. Literal true or false. (optional, default to false)
    */
    public void setHdrOnly(Boolean hdrOnly) {
        this.put("hdrOnly", hdrOnly);
    }

    public String getCodec() {
        return (String) this.get("codec");
    }

    /**
    * @param codec Trimmed case-insensitive substring of the codec identifier. (optional)
    */
    public void setCodec(String codec) {
        this.put("codec", codec);
    }

    public String getDevice() {
        return (String) this.get("device");
    }

    /**
    * @param device Trimmed case-insensitive substring of the published device name and qualifier. (optional)
    */
    public void setDevice(String device) {
        this.put("device", device);
    }
}
