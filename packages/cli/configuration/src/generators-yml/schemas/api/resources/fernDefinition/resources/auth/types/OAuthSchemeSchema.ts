/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as FernDefinition from "../../../../../index";

export interface OAuthSchemeSchema extends FernDefinition.fernDefinition.WithDocsSchema {
    scheme: "oauth";
    type: "client-credentials";
    scopes?: string[];
    "client-id-env"?: string;
    "client-secret-env"?: string;
    /** Sets the token header value prefix. Defaults to 'Bearer' */
    "token-prefix"?: string;
    /** Sets the token header key name. Defaults to 'Authorization' */
    "token-header"?: string;
    "get-token": FernDefinition.fernDefinition.OAuthGetTokenEndpointSchema;
    "refresh-token"?: FernDefinition.fernDefinition.OAuthRefreshTokenEndpointSchema;
}
