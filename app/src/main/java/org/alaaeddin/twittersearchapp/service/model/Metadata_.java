
package org.alaaeddin.twittersearchapp.service.model;

import com.squareup.moshi.Json;

public class Metadata_ {

    @Json(name = "iso_language_code")
    private String isoLanguageCode;
    @Json(name = "result_type")
    private String resultType;

    public String getIsoLanguageCode() {
        return isoLanguageCode;
    }

    public void setIsoLanguageCode(String isoLanguageCode) {
        this.isoLanguageCode = isoLanguageCode;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

}
