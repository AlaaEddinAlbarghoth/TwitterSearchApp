
package org.alaaeddin.twittersearchapp.service.model;

import com.squareup.moshi.Json;

public class Entities_ {

    @Json(name = "description")
    private Description description;
    @Json(name = "url")
    private Url__ url;

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Url__ getUrl() {
        return url;
    }

    public void setUrl(Url__ url) {
        this.url = url;
    }

}
