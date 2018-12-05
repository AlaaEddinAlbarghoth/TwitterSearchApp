
package org.alaaeddin.twittersearchapp.service.model;

import com.squareup.moshi.Json;

public class SearchMetadata {

    @Json(name = "completed_in")
    private Double completedIn;
    @Json(name = "max_id")
    private Integer maxId;
    @Json(name = "max_id_str")
    private String maxIdStr;
    @Json(name = "next_results")
    private String nextResults;
    @Json(name = "query")
    private String query;
    @Json(name = "refresh_url")
    private String refreshUrl;
    @Json(name = "count")
    private Integer count;
    @Json(name = "since_id")
    private Integer sinceId;
    @Json(name = "since_id_str")
    private String sinceIdStr;

    public Double getCompletedIn() {
        return completedIn;
    }

    public void setCompletedIn(Double completedIn) {
        this.completedIn = completedIn;
    }

    public Integer getMaxId() {
        return maxId;
    }

    public void setMaxId(Integer maxId) {
        this.maxId = maxId;
    }

    public String getMaxIdStr() {
        return maxIdStr;
    }

    public void setMaxIdStr(String maxIdStr) {
        this.maxIdStr = maxIdStr;
    }

    public String getNextResults() {
        return nextResults;
    }

    public void setNextResults(String nextResults) {
        this.nextResults = nextResults;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getRefreshUrl() {
        return refreshUrl;
    }

    public void setRefreshUrl(String refreshUrl) {
        this.refreshUrl = refreshUrl;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSinceId() {
        return sinceId;
    }

    public void setSinceId(Integer sinceId) {
        this.sinceId = sinceId;
    }

    public String getSinceIdStr() {
        return sinceIdStr;
    }

    public void setSinceIdStr(String sinceIdStr) {
        this.sinceIdStr = sinceIdStr;
    }

}
