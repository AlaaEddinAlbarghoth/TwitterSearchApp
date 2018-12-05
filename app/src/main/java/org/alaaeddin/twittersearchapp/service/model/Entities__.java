
package org.alaaeddin.twittersearchapp.service.model;

import java.util.List;
import com.squareup.moshi.Json;

public class Entities__ {

    @Json(name = "hashtags")
    private List<Object> hashtags = null;
    @Json(name = "symbols")
    private List<Object> symbols = null;
    @Json(name = "user_mentions")
    private List<Object> userMentions = null;
    @Json(name = "urls")
    private List<Url____> urls = null;

    public List<Object> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Object> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    public List<Object> getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(List<Object> userMentions) {
        this.userMentions = userMentions;
    }

    public List<Url____> getUrls() {
        return urls;
    }

    public void setUrls(List<Url____> urls) {
        this.urls = urls;
    }

}
