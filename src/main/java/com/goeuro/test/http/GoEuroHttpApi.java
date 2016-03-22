package com.goeuro.test.http;

import com.goolla.http.BaseHttpApi;
import com.goolla.http.HttpExecutor;

/**
 * @author szagriichuk.
 */
class GoEuroHttpApi extends BaseHttpApi {
    GoEuroHttpApi() {
        super(null, new HttpExecutor());
    }
}
