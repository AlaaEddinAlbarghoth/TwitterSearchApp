
package org.alaaeddin.twittersearchapp.service.model;

import com.squareup.moshi.Json;

public class Status {

    @Json(name = "created_at")
    private String createdAt;
    @Json(name = "id")
    private Integer id;
    @Json(name = "id_str")
    private String idStr;
    @Json(name = "text")
    private String text;
    @Json(name = "truncated")
    private Boolean truncated;
    @Json(name = "entities")
    private Entities entities;
    @Json(name = "metadata")
    private Metadata metadata;
    @Json(name = "source")
    private String source;
    @Json(name = "in_reply_to_status_id")
    private Object inReplyToStatusId;
    @Json(name = "in_reply_to_status_id_str")
    private Object inReplyToStatusIdStr;
    @Json(name = "in_reply_to_user_id")
    private Object inReplyToUserId;
    @Json(name = "in_reply_to_user_id_str")
    private Object inReplyToUserIdStr;
    @Json(name = "in_reply_to_screen_name")
    private Object inReplyToScreenName;
    @Json(name = "user")
    private User user;
    @Json(name = "geo")
    private Object geo;
    @Json(name = "coordinates")
    private Object coordinates;
    @Json(name = "place")
    private Object place;
    @Json(name = "contributors")
    private Object contributors;
    @Json(name = "is_quote_status")
    private Boolean isQuoteStatus;
    @Json(name = "retweet_count")
    private Integer retweetCount;
    @Json(name = "favorite_count")
    private Integer favoriteCount;
    @Json(name = "favorited")
    private Boolean favorited;
    @Json(name = "retweeted")
    private Boolean retweeted;
    @Json(name = "possibly_sensitive")
    private Boolean possiblySensitive;
    @Json(name = "lang")
    private String lang;
    @Json(name = "retweeted_status")
    private RetweetedStatus retweetedStatus;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Object getGeo() {
        return geo;
    }

    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public Object getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    public Object getPlace() {
        return place;
    }

    public void setPlace(Object place) {
        this.place = place;
    }

    public Object getContributors() {
        return contributors;
    }

    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    public Boolean getIsQuoteStatus() {
        return isQuoteStatus;
    }

    public void setIsQuoteStatus(Boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
    }

    public Integer getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Boolean getFavorited() {
        return favorited;
    }

    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public Boolean getRetweeted() {
        return retweeted;
    }

    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    public Boolean getPossiblySensitive() {
        return possiblySensitive;
    }

    public void setPossiblySensitive(Boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public RetweetedStatus getRetweetedStatus() {
        return retweetedStatus;
    }

    public void setRetweetedStatus(RetweetedStatus retweetedStatus) {
        this.retweetedStatus = retweetedStatus;
    }

}
