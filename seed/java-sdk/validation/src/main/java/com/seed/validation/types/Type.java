/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.validation.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seed.validation.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Type.Builder.class)
public final class Type {
    private final double decimal;

    private final int even;

    private final String name;

    private final Shape shape;

    private final Map<String, Object> additionalProperties;

    private Type(double decimal, int even, String name, Shape shape, Map<String, Object> additionalProperties) {
        this.decimal = decimal;
        this.even = even;
        this.name = name;
        this.shape = shape;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("decimal")
    public double getDecimal() {
        return decimal;
    }

    @JsonProperty("even")
    public int getEven() {
        return even;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("shape")
    public Shape getShape() {
        return shape;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Type && equalTo((Type) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Type other) {
        return decimal == other.decimal && even == other.even && name.equals(other.name) && shape.equals(other.shape);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.decimal, this.even, this.name, this.shape);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DecimalStage builder() {
        return new Builder();
    }

    public interface DecimalStage {
        EvenStage decimal(double decimal);

        Builder from(Type other);
    }

    public interface EvenStage {
        NameStage even(int even);
    }

    public interface NameStage {
        ShapeStage name(@NotNull String name);
    }

    public interface ShapeStage {
        _FinalStage shape(@NotNull Shape shape);
    }

    public interface _FinalStage {
        Type build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DecimalStage, EvenStage, NameStage, ShapeStage, _FinalStage {
        private double decimal;

        private int even;

        private String name;

        private Shape shape;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Type other) {
            decimal(other.getDecimal());
            even(other.getEven());
            name(other.getName());
            shape(other.getShape());
            return this;
        }

        @java.lang.Override
        @JsonSetter("decimal")
        public EvenStage decimal(double decimal) {
            this.decimal = decimal;
            return this;
        }

        @java.lang.Override
        @JsonSetter("even")
        public NameStage even(int even) {
            this.even = even;
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public ShapeStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("shape")
        public _FinalStage shape(@NotNull Shape shape) {
            this.shape = Objects.requireNonNull(shape, "shape must not be null");
            return this;
        }

        @java.lang.Override
        public Type build() {
            return new Type(decimal, even, name, shape, additionalProperties);
        }
    }
}
