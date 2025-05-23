/**
 * This file was auto-generated by Fern from our API Definition.
 */

export type PrimitiveTypeV1 =
    | "INTEGER"
    /**
     * Within the range -2^53 to 2^53 */
    | "LONG"
    | "UINT"
    | "UINT_64"
    | "FLOAT"
    | "DOUBLE"
    | "BOOLEAN"
    | "STRING"
    | "DATE"
    | "DATE_TIME"
    | "UUID"
    | "BASE_64"
    | "BIG_INTEGER";
export const PrimitiveTypeV1 = {
    Integer: "INTEGER",
    Long: "LONG",
    Uint: "UINT",
    Uint64: "UINT_64",
    Float: "FLOAT",
    Double: "DOUBLE",
    Boolean: "BOOLEAN",
    String: "STRING",
    Date: "DATE",
    DateTime: "DATE_TIME",
    Uuid: "UUID",
    Base64: "BASE_64",
    BigInteger: "BIG_INTEGER",
    _visit: <R>(value: PrimitiveTypeV1, visitor: PrimitiveTypeV1.Visitor<R>) => {
        switch (value) {
            case PrimitiveTypeV1.Integer:
                return visitor.integer();
            case PrimitiveTypeV1.Long:
                return visitor.long();
            case PrimitiveTypeV1.Uint:
                return visitor.uint();
            case PrimitiveTypeV1.Uint64:
                return visitor.uint64();
            case PrimitiveTypeV1.Float:
                return visitor.float();
            case PrimitiveTypeV1.Double:
                return visitor.double();
            case PrimitiveTypeV1.Boolean:
                return visitor.boolean();
            case PrimitiveTypeV1.String:
                return visitor.string();
            case PrimitiveTypeV1.Date:
                return visitor.date();
            case PrimitiveTypeV1.DateTime:
                return visitor.dateTime();
            case PrimitiveTypeV1.Uuid:
                return visitor.uuid();
            case PrimitiveTypeV1.Base64:
                return visitor.base64();
            case PrimitiveTypeV1.BigInteger:
                return visitor.bigInteger();
            default:
                return visitor._other();
        }
    },
} as const;

export namespace PrimitiveTypeV1 {
    export interface Visitor<R> {
        integer: () => R;
        long: () => R;
        uint: () => R;
        uint64: () => R;
        float: () => R;
        double: () => R;
        boolean: () => R;
        string: () => R;
        date: () => R;
        dateTime: () => R;
        uuid: () => R;
        base64: () => R;
        bigInteger: () => R;
        _other: () => R;
    }
}
