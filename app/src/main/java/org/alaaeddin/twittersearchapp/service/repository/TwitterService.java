package org.alaaeddin.twittersearchapp.service.repository;

import org.alaaeddin.twittersearchapp.service.model.TwitterResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

// Creating an interface to define the endpoints that we will be hitting on the API.
public interface TwitterService {

    // Twitter Api Url
    String BASE_URL = "https://api.twitter.com/1.1/search";

    // Param: 'query' to search tweets.
    @Headers({
            "oauth_consumer_key:KkMeY3R7qqU5lAC7D0MTEu3as",
            "oauth_token:4002126376-vw0BvGQUYGrj2Q1kBQ4QGvvXyjyicnlfdRJCopo",
            "oauth_signature_method:HMAC-SHA1",
            "oauth_timestamp:1543920393",
            "oauth_nonce:ZAmJUmC8T4U",
            "oauth_version:1.0",
            "oauth_signature:ZX%2FKn%2BOkCeFofZclWkh9Ug9vopw%3D"
    })
    @GET("/tweets.json")
    Call<TwitterResponse> getTweets(@Query("q") String query);
}
