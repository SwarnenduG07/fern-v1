/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.pagination.resources.users;

import com.seed.pagination.core.ClientOptions;
import com.seed.pagination.core.RequestOptions;
import com.seed.pagination.core.pagination.SyncPagingIterable;
import com.seed.pagination.resources.users.requests.ListUsernamesRequest;
import com.seed.pagination.resources.users.requests.ListUsersBodyCursorPaginationRequest;
import com.seed.pagination.resources.users.requests.ListUsersBodyOffsetPaginationRequest;
import com.seed.pagination.resources.users.requests.ListUsersCursorPaginationRequest;
import com.seed.pagination.resources.users.requests.ListUsersDoubleOffsetPaginationRequest;
import com.seed.pagination.resources.users.requests.ListUsersExtendedRequest;
import com.seed.pagination.resources.users.requests.ListUsersExtendedRequestForOptionalData;
import com.seed.pagination.resources.users.requests.ListUsersMixedTypeCursorPaginationRequest;
import com.seed.pagination.resources.users.requests.ListUsersOffsetPaginationRequest;
import com.seed.pagination.resources.users.requests.ListUsersOffsetStepPaginationRequest;
import com.seed.pagination.resources.users.requests.ListWithGlobalConfigRequest;
import com.seed.pagination.resources.users.requests.ListWithOffsetPaginationHasNextPageRequest;
import com.seed.pagination.resources.users.types.User;

public class UsersClient {
    protected final ClientOptions clientOptions;

    private final RawUsersClient rawClient;

    public UsersClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new RawUsersClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public RawUsersClient withRawResponse() {
        return this.rawClient;
    }

    public SyncPagingIterable<User> listWithCursorPagination() {
        return this.rawClient.listWithCursorPagination().body();
    }

    public SyncPagingIterable<User> listWithCursorPagination(ListUsersCursorPaginationRequest request) {
        return this.rawClient.listWithCursorPagination(request).body();
    }

    public SyncPagingIterable<User> listWithCursorPagination(
            ListUsersCursorPaginationRequest request, RequestOptions requestOptions) {
        return this.rawClient.listWithCursorPagination(request, requestOptions).body();
    }

    public SyncPagingIterable<User> listWithMixedTypeCursorPagination() {
        return this.rawClient.listWithMixedTypeCursorPagination().body();
    }

    public SyncPagingIterable<User> listWithMixedTypeCursorPagination(
            ListUsersMixedTypeCursorPaginationRequest request) {
        return this.rawClient.listWithMixedTypeCursorPagination(request).body();
    }

    public SyncPagingIterable<User> listWithMixedTypeCursorPagination(
            ListUsersMixedTypeCursorPaginationRequest request, RequestOptions requestOptions) {
        return this.rawClient
                .listWithMixedTypeCursorPagination(request, requestOptions)
                .body();
    }

    public SyncPagingIterable<User> listWithBodyCursorPagination() {
        return this.rawClient.listWithBodyCursorPagination().body();
    }

    public SyncPagingIterable<User> listWithBodyCursorPagination(ListUsersBodyCursorPaginationRequest request) {
        return this.rawClient.listWithBodyCursorPagination(request).body();
    }

    public SyncPagingIterable<User> listWithBodyCursorPagination(
            ListUsersBodyCursorPaginationRequest request, RequestOptions requestOptions) {
        return this.rawClient
                .listWithBodyCursorPagination(request, requestOptions)
                .body();
    }

    public SyncPagingIterable<User> listWithOffsetPagination() {
        return this.rawClient.listWithOffsetPagination().body();
    }

    public SyncPagingIterable<User> listWithOffsetPagination(ListUsersOffsetPaginationRequest request) {
        return this.rawClient.listWithOffsetPagination(request).body();
    }

    public SyncPagingIterable<User> listWithOffsetPagination(
            ListUsersOffsetPaginationRequest request, RequestOptions requestOptions) {
        return this.rawClient.listWithOffsetPagination(request, requestOptions).body();
    }

    public SyncPagingIterable<User> listWithDoubleOffsetPagination() {
        return this.rawClient.listWithDoubleOffsetPagination().body();
    }

    public SyncPagingIterable<User> listWithDoubleOffsetPagination(ListUsersDoubleOffsetPaginationRequest request) {
        return this.rawClient.listWithDoubleOffsetPagination(request).body();
    }

    public SyncPagingIterable<User> listWithDoubleOffsetPagination(
            ListUsersDoubleOffsetPaginationRequest request, RequestOptions requestOptions) {
        return this.rawClient
                .listWithDoubleOffsetPagination(request, requestOptions)
                .body();
    }

    public SyncPagingIterable<User> listWithBodyOffsetPagination() {
        return this.rawClient.listWithBodyOffsetPagination().body();
    }

    public SyncPagingIterable<User> listWithBodyOffsetPagination(ListUsersBodyOffsetPaginationRequest request) {
        return this.rawClient.listWithBodyOffsetPagination(request).body();
    }

    public SyncPagingIterable<User> listWithBodyOffsetPagination(
            ListUsersBodyOffsetPaginationRequest request, RequestOptions requestOptions) {
        return this.rawClient
                .listWithBodyOffsetPagination(request, requestOptions)
                .body();
    }

    public SyncPagingIterable<User> listWithOffsetStepPagination() {
        return this.rawClient.listWithOffsetStepPagination().body();
    }

    public SyncPagingIterable<User> listWithOffsetStepPagination(ListUsersOffsetStepPaginationRequest request) {
        return this.rawClient.listWithOffsetStepPagination(request).body();
    }

    public SyncPagingIterable<User> listWithOffsetStepPagination(
            ListUsersOffsetStepPaginationRequest request, RequestOptions requestOptions) {
        return this.rawClient
                .listWithOffsetStepPagination(request, requestOptions)
                .body();
    }

    public SyncPagingIterable<User> listWithOffsetPaginationHasNextPage() {
        return this.rawClient.listWithOffsetPaginationHasNextPage().body();
    }

    public SyncPagingIterable<User> listWithOffsetPaginationHasNextPage(
            ListWithOffsetPaginationHasNextPageRequest request) {
        return this.rawClient.listWithOffsetPaginationHasNextPage(request).body();
    }

    public SyncPagingIterable<User> listWithOffsetPaginationHasNextPage(
            ListWithOffsetPaginationHasNextPageRequest request, RequestOptions requestOptions) {
        return this.rawClient
                .listWithOffsetPaginationHasNextPage(request, requestOptions)
                .body();
    }

    public SyncPagingIterable<User> listWithExtendedResults() {
        return this.rawClient.listWithExtendedResults().body();
    }

    public SyncPagingIterable<User> listWithExtendedResults(ListUsersExtendedRequest request) {
        return this.rawClient.listWithExtendedResults(request).body();
    }

    public SyncPagingIterable<User> listWithExtendedResults(
            ListUsersExtendedRequest request, RequestOptions requestOptions) {
        return this.rawClient.listWithExtendedResults(request, requestOptions).body();
    }

    public SyncPagingIterable<User> listWithExtendedResultsAndOptionalData() {
        return this.rawClient.listWithExtendedResultsAndOptionalData().body();
    }

    public SyncPagingIterable<User> listWithExtendedResultsAndOptionalData(
            ListUsersExtendedRequestForOptionalData request) {
        return this.rawClient.listWithExtendedResultsAndOptionalData(request).body();
    }

    public SyncPagingIterable<User> listWithExtendedResultsAndOptionalData(
            ListUsersExtendedRequestForOptionalData request, RequestOptions requestOptions) {
        return this.rawClient
                .listWithExtendedResultsAndOptionalData(request, requestOptions)
                .body();
    }

    public SyncPagingIterable<String> listUsernames() {
        return this.rawClient.listUsernames().body();
    }

    public SyncPagingIterable<String> listUsernames(ListUsernamesRequest request) {
        return this.rawClient.listUsernames(request).body();
    }

    public SyncPagingIterable<String> listUsernames(ListUsernamesRequest request, RequestOptions requestOptions) {
        return this.rawClient.listUsernames(request, requestOptions).body();
    }

    public SyncPagingIterable<String> listWithGlobalConfig() {
        return this.rawClient.listWithGlobalConfig().body();
    }

    public SyncPagingIterable<String> listWithGlobalConfig(ListWithGlobalConfigRequest request) {
        return this.rawClient.listWithGlobalConfig(request).body();
    }

    public SyncPagingIterable<String> listWithGlobalConfig(
            ListWithGlobalConfigRequest request, RequestOptions requestOptions) {
        return this.rawClient.listWithGlobalConfig(request, requestOptions).body();
    }
}
