/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * A tag for a pet
 *
 * @param id 
 * @param name 
 */


data class Tag (

    @Json(name = "id")
    var id: kotlin.Long? = null,

    @Json(name = "name")
    var name: kotlin.String? = null

)

