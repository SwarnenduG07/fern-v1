/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as FernIr from "../../../../api/index";
import * as core from "../../../../core";
import { V2EndpointLocation } from "./V2EndpointLocation";
import { V2EnvironmentValues } from "./V2EnvironmentValues";
import { V2AuthValues } from "./V2AuthValues";
import { V2ValueExamples } from "./V2ValueExamples";
import { WithDocs } from "../../commons/types/WithDocs";

export const V2HttpEndpointRequest: core.serialization.ObjectSchema<
    serializers.V2HttpEndpointRequest.Raw,
    FernIr.V2HttpEndpointRequest
> = core.serialization
    .objectWithoutOptionalProperties({
        endpoint: V2EndpointLocation,
        baseUrl: core.serialization.property("baseURL", core.serialization.string().optional()),
        environment: V2EnvironmentValues.optional(),
        auth: V2AuthValues.optional(),
        pathParameters: V2ValueExamples.optional(),
        queryParameters: V2ValueExamples.optional(),
        headers: V2ValueExamples.optional(),
        requestBody: core.serialization.unknown().optional(),
    })
    .extend(WithDocs);

export declare namespace V2HttpEndpointRequest {
    export interface Raw extends WithDocs.Raw {
        endpoint: V2EndpointLocation.Raw;
        baseURL?: string | null;
        environment?: V2EnvironmentValues.Raw | null;
        auth?: V2AuthValues.Raw | null;
        pathParameters?: V2ValueExamples.Raw | null;
        queryParameters?: V2ValueExamples.Raw | null;
        headers?: V2ValueExamples.Raw | null;
        requestBody?: unknown | null;
    }
}
