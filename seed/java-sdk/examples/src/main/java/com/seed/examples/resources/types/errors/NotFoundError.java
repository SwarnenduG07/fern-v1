/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.examples.resources.types.errors;

import com.seed.examples.core.SeedExamplesApiException;
import okhttp3.Response;

public final class NotFoundError extends SeedExamplesApiException {
    /**
     * The body of the response that triggered the exception.
     */
    private final String body;

    public NotFoundError(String body) {
        super("NotFoundError", 404, body);
        this.body = body;
    }

    public NotFoundError(String body, Response rawResponse) {
        super("NotFoundError", 404, body, rawResponse);
        this.body = body;
    }

    /**
     * @return the body
     */
    @java.lang.Override
    public String body() {
        return this.body;
    }
}
