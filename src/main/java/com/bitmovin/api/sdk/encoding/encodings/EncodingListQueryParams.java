package com.bitmovin.api.sdk.encoding.encodings;

import java.util.HashMap;
import com.bitmovin.api.sdk.model.*;

public class EncodingListQueryParams extends HashMap<String, Object> {

    public Integer getOffset() {
        return (Integer) this.get("offset");
    }

    /**
    * @param offset Index of the first item to return, starting at 0. Default is 0 (optional)
    */
    public void setOffset(Integer offset) {
        this.put("offset", offset);
    }

    public Integer getLimit() {
        return (Integer) this.get("limit");
    }

    /**
    * @param limit Maximum number of items to return. Default is 25, maximum is 100 (optional)
    */
    public void setLimit(Integer limit) {
        this.put("limit", limit);
    }

    public String getSort() {
        return (String) this.get("sort");
    }

    /**
    * @param sort Order list result according an encoding resource attribute (optional)
    */
    public void setSort(String sort) {
        this.put("sort", sort);
    }

    public String getType() {
        return (String) this.get("type");
    }

    /**
    * @param type Filter encodings to only show the ones with the type specified. (optional)
    */
    public void setType(String type) {
        this.put("type", type);
    }

    public String getStatus() {
        return (String) this.get("status");
    }

    /**
    * @param status Filter encodings to only show the ones with the status specified. (optional)
    */
    public void setStatus(String status) {
        this.put("status", status);
    }

    public CloudRegion getCloudRegion() {
        return (CloudRegion) this.get("cloudRegion");
    }

    /**
    * @param cloudRegion Filter encodings to only show the ones with the cloudRegion specified. (optional, default to null)
    */
    public void setCloudRegion(CloudRegion cloudRegion) {
        this.put("cloudRegion", cloudRegion);
    }

    public CloudRegion getSelectedCloudRegion() {
        return (CloudRegion) this.get("selectedCloudRegion");
    }

    /**
    * @param selectedCloudRegion Filter encodings to only show the ones with the selectedCloudRegion specified which was selected when cloudregion:AUTO was set (optional, default to null)
    */
    public void setSelectedCloudRegion(CloudRegion selectedCloudRegion) {
        this.put("selectedCloudRegion", selectedCloudRegion);
    }

    public String getEncoderVersion() {
        return (String) this.get("encoderVersion");
    }

    /**
    * @param encoderVersion Filter encodings to only show the ones with the encoderVersion specified. (optional)
    */
    public void setEncoderVersion(String encoderVersion) {
        this.put("encoderVersion", encoderVersion);
    }

    public String getSelectedEncoderVersion() {
        return (String) this.get("selectedEncoderVersion");
    }

    /**
    * @param selectedEncoderVersion Filter encodings to only show the ones with the encoderVersion specified that was actually used for the encoding. (optional)
    */
    public void setSelectedEncoderVersion(String selectedEncoderVersion) {
        this.put("selectedEncoderVersion", selectedEncoderVersion);
    }

    public EncodingMode getSelectedEncodingMode() {
        return (EncodingMode) this.get("selectedEncodingMode");
    }

    /**
    * @param selectedEncodingMode Filter encodings to only show the ones with the encodingMode specified that was actually used for the encoding. (optional, default to null)
    */
    public void setSelectedEncodingMode(EncodingMode selectedEncodingMode) {
        this.put("selectedEncodingMode", selectedEncodingMode);
    }

    public String getName() {
        return (String) this.get("name");
    }

    /**
    * @param name Filter encodings to only show the ones with this exact name. (optional)
    */
    public void setName(String name) {
        this.put("name", name);
    }

    public String getSearch() {
        return (String) this.get("search");
    }

    /**
    * @param search The search query string for advanced filtering.  We are using the [Apache Lucene](https://lucene.apache.org/) query syntax here.  Only lucene queries equivalent to exact matching and startsWith are supported. Also only AND conjunctions supported at the moment.  Please be aware that our filters are **case-insensitive**  Examples of supported lucene queries: + &#x60;name:MyEncoding1&#x60; - This searches for encodings with names that are equal to &#x60;myencoding1&#x60;  + &#x60;name:\&quot;My Encoding\&quot;&#x60; - This searches for encodings with names that are equal to &#x60;my encoding&#x60;  + &#x60;name:MyEncoding\\*&#x60; - This searches for encodings with names that are equal to &#x60;myencoding*&#x60; Please have a look at the [Lucene Documentation - Escaping Special Characters](https://lucene.apache.org/core/8_1_1/queryparser/org/apache/lucene/queryparser/classic/package-summary.html#Escaping_Special_Characters) section to see what characters have to be escaped.  + &#x60;name:test*&#x60; - This searches for encodings with names that start with &#x60;test&#x60;  + &#x60;name:test* AND labels:Customer1&#x60; - This searches for encodings with names starting with &#x60;test&#x60; and labels containing an entry that is equal to &#x60;customer1&#x60;  Available search fields: + &#x60;name&#x60;  + &#x60;labels&#x60;  Please be aware to send these queries url encoded.  If you provide fields or lucene queries that are not supported, it will result in an error response.  (optional)
    */
    public void setSearch(String search) {
        this.put("search", search);
    }
}
