/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../index";
import * as SeedExamples from "../../api/index";
import * as core from "../../core";

export const Identifier: core.serialization.ObjectSchema<serializers.Identifier.Raw, SeedExamples.Identifier> =
    core.serialization.object({
        type: core.serialization.lazy(() => serializers.Type),
        value: core.serialization.string(),
        label: core.serialization.string(),
    });

export declare namespace Identifier {
    export interface Raw {
        type: serializers.Type.Raw;
        value: string;
        label: string;
    }
}
