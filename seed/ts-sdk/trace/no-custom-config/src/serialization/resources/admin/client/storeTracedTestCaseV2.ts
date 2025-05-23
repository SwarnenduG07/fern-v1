/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as SeedTrace from "../../../../api/index";
import * as core from "../../../../core";
import { TraceResponseV2 } from "../../submission/types/TraceResponseV2";

export const Request: core.serialization.Schema<
    serializers.admin.storeTracedTestCaseV2.Request.Raw,
    SeedTrace.TraceResponseV2[]
> = core.serialization.list(TraceResponseV2);

export declare namespace Request {
    export type Raw = TraceResponseV2.Raw[];
}
