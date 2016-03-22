package com.goeuro.test.http;

import com.goolla.Goolla;
import com.goolla.http.callback.ResponseCallback;

import static com.goolla.Goolla.asyncApi;

/**
 * @author szagriichuk.
 */
public class GoEuroApi {
    private Goolla.AsyncApi asyncApi;

    public GoEuroApi() {
        asyncApi = asyncApi(new GoEuroHttpApi());
    }

    public void readData(String name, ResponseCallback callback) {
        asyncApi.get("http://api.goeuro.com/api/v2/position/suggest/en", callback, name);
    }
}
