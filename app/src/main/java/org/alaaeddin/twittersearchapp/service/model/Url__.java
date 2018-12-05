
package org.alaaeddin.twittersearchapp.service.model;

import java.util.List;
import com.squareup.moshi.Json;

public class Url__ {

    @Json(name = "urls")
    private List<Url___> urls = null;

    public List<Url___> getUrls() {
        return urls;
    }

    public void setUrls(List<Url___> urls) {
        this.urls = urls;
    }

}
