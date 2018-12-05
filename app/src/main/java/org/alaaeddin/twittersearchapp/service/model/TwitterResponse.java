
package org.alaaeddin.twittersearchapp.service.model;

import java.util.List;
import com.squareup.moshi.Json;

public class TwitterResponse {

    @Json(name = "statuses")
    private List<Status> statuses = null;
    @Json(name = "search_metadata")
    private SearchMetadata searchMetadata;

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public SearchMetadata getSearchMetadata() {
        return searchMetadata;
    }

    public void setSearchMetadata(SearchMetadata searchMetadata) {
        this.searchMetadata = searchMetadata;
    }

}
