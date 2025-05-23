/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.pagination.model.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seed.pagination.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = NextPage.Builder.class)
public final class NextPage {
    private final int page;

    private final String startingAfter;

    private NextPage(int page, String startingAfter) {
        this.page = page;
        this.startingAfter = startingAfter;
    }

    @JsonProperty("page")
    public int getPage() {
        return page;
    }

    @JsonProperty("starting_after")
    public String getStartingAfter() {
        return startingAfter;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NextPage && equalTo((NextPage) other);
    }

    private boolean equalTo(NextPage other) {
        return page == other.page && startingAfter.equals(other.startingAfter);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.page, this.startingAfter);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static PageStage builder() {
        return new Builder();
    }

    public interface PageStage {
        StartingAfterStage page(int page);

        Builder from(NextPage other);
    }

    public interface StartingAfterStage {
        _FinalStage startingAfter(String startingAfter);
    }

    public interface _FinalStage {
        NextPage build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements PageStage, StartingAfterStage, _FinalStage {
        private int page;

        private String startingAfter;

        private Builder() {}

        @java.lang.Override
        public Builder from(NextPage other) {
            page(other.getPage());
            startingAfter(other.getStartingAfter());
            return this;
        }

        @java.lang.Override
        @JsonSetter("page")
        public StartingAfterStage page(int page) {
            this.page = page;
            return this;
        }

        @java.lang.Override
        @JsonSetter("starting_after")
        public _FinalStage startingAfter(String startingAfter) {
            this.startingAfter = Objects.requireNonNull(startingAfter, "startingAfter must not be null");
            return this;
        }

        @java.lang.Override
        public NextPage build() {
            return new NextPage(page, startingAfter);
        }
    }
}
