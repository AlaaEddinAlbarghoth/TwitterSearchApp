
package org.alaaeddin.twittersearchapp.service.model;

import java.util.List;
import com.squareup.moshi.Json;

public class Entities {

    @Json(name = "hashtags")
    private List<Hashtag> hashtags = null;
    @Json(name = "symbols")
    private List<Object> symbols = null;
    @Json(name = "user_mentions")
    private List<UserMention> userMentions = null;
    @Json(name = "urls")
    private List<Url> urls = null;

    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Object> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    public List<UserMention> getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(List<UserMention> userMentions) {
        this.userMentions = userMentions;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

}
