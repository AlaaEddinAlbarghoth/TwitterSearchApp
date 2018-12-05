
package org.alaaeddin.twittersearchapp.service.model;

import java.util.List;
import com.squareup.moshi.Json;

public class Url {

    @Json(name = "url")
    private String url;
    @Json(name = "expanded_url")
    private String expandedUrl;
    @Json(name = "display_url")
    private String displayUrl;
    @Json(name = "indices")
    private List<Integer> indices = null;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExpandedUrl() {
        return expandedUrl;
    }

    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public List<Integer> getIndices() {
        return indices;
    }

    public void setIndices(List<Integer> indices) {
        this.indices = indices;
    }

}
