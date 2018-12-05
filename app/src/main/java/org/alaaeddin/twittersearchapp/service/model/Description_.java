
package org.alaaeddin.twittersearchapp.service.model;

import java.util.List;
import com.squareup.moshi.Json;

public class Description_ {

    @Json(name = "urls")
    private List<Object> urls = null;

    public List<Object> getUrls() {
        return urls;
    }

    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

}
