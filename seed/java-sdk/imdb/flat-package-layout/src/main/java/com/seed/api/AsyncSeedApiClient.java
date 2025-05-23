/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.api;

import com.seed.api.core.ClientOptions;
import com.seed.api.core.Suppliers;
import java.util.function.Supplier;

public class AsyncSeedApiClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<AsyncImdbClient> imdbClient;

    public AsyncSeedApiClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.imdbClient = Suppliers.memoize(() -> new AsyncImdbClient(clientOptions));
    }

    public AsyncImdbClient imdb() {
        return this.imdbClient.get();
    }

    public static AsyncSeedApiClientBuilder builder() {
        return new AsyncSeedApiClientBuilder();
    }
}
