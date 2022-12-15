/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.jediverse.coruscant.api;

import io.jediverse.coruscant.model.SwaggerCollection;
import io.micronaut.http.*;
import io.micronaut.http.annotation.*;
import io.reactivex.Single;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.responses.*;

import javax.annotation.Nullable;
import javax.validation.Valid;


@Controller
public interface UsersApi {


    @Operation(summary = "Get the public outbox collection for an actor.", operationId = "s2sOutboxGet", description = "Note that the response will be a Collection with a page as `first`, as shown below, if `page` is `false`.  If `page` is `true`, then the response will be a single `CollectionPage` without the wrapping `Collection`.  HTTP signature is required on the request." , tags = {"s2s/federation"})
    @ApiResponse(responseCode = "200", description = "")
    @ApiResponse(responseCode = "400", description = "bad request")
    @ApiResponse(responseCode = "401", description = "unauthorized")
    @ApiResponse(responseCode = "403", description = "forbidden")
    @ApiResponse(responseCode = "404", description = "not found")
    @Get(value = "/users/{username}/outbox", produces = { "application/activity+json" })
    default Single<HttpResponse<SwaggerCollection>> s2sOutboxGet(@Parameter(description = "Username of the account.") @PathVariable("username") String username
, @Nullable @Parameter(description = "Return response as a CollectionPage.") @Valid @QueryValue(value = "page", defaultValue = "false") Boolean page
, @Nullable @Parameter(description = "Minimum ID of the next status, used for paging.") @Valid @QueryValue(value = "min_id") String minId
, @Nullable @Parameter(description = "Maximum ID of the next status, used for paging.") @Valid @QueryValue(value = "max_id") String maxId
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Get the replies collection for a status.", operationId = "s2sRepliesGet", description = "Note that the response will be a Collection with a page as `first`, as shown below, if `page` is `false`.  If `page` is `true`, then the response will be a single `CollectionPage` without the wrapping `Collection`.  HTTP signature is required on the request." , tags = {"s2s/federation"})
    @ApiResponse(responseCode = "200", description = "")
    @ApiResponse(responseCode = "400", description = "bad request")
    @ApiResponse(responseCode = "401", description = "unauthorized")
    @ApiResponse(responseCode = "403", description = "forbidden")
    @ApiResponse(responseCode = "404", description = "not found")
    @Get(value = "/users/{username}/statuses/{status}/replies", produces = { "application/activity+json" })
    default Single<HttpResponse<SwaggerCollection>> s2sRepliesGet(@Parameter(description = "Username of the account.") @PathVariable("username") String username
,@Parameter(description = "ID of the status.") @PathVariable("status") String status
,@Nullable @Parameter(description = "Return response as a CollectionPage.") @Valid @QueryValue(value = "page", defaultValue = "false") Boolean page
,@Nullable @Parameter(description = "Return replies only from accounts other than the status owner.") @Valid @QueryValue(value = "only_other_accounts", defaultValue = "false") Boolean onlyOtherAccounts
,@Nullable @Parameter(description = "Minimum ID of the next status, used for paging.") @Valid @QueryValue(value = "min_id") String minId
) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}