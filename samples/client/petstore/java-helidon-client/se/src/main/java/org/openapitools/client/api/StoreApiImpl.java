/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import java.util.Objects;
import org.openapitools.client.ApiResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.helidon.common.GenericType;
import io.helidon.common.http.MediaType;
import io.helidon.common.reactive.Single;
import io.helidon.config.Config;
import io.helidon.media.common.MediaSupport;

import io.helidon.media.jackson.JacksonSupport;
import io.helidon.webclient.WebClientRequestBuilder;
import io.helidon.webclient.WebClientResponse;

import org.openapitools.client.ApiClient;

import java.util.List;
import java.util.Map;
import org.openapitools.client.model.Order;

/**
 * OpenAPI Petstore
 *
 * <p>This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 */
public class StoreApiImpl implements StoreApi {

  private final ApiClient apiClient;

  protected static final GenericType<Void> RESPONSE_TYPE_deleteOrder = ResponseType.create(Void.class);
  protected static final GenericType<Map<String, Integer>> RESPONSE_TYPE_getInventory = ResponseType.create(Map.class, String.class, Integer.class);
  protected static final GenericType<Order> RESPONSE_TYPE_getOrderById = ResponseType.create(Order.class);
  protected static final GenericType<Order> RESPONSE_TYPE_placeOrder = ResponseType.create(Order.class);

  /**
   * Creates a new instance of StoreApiImpl initialized with the specified {@link ApiClient}.
   *
   */
  public static StoreApiImpl create(ApiClient apiClient) {
    return new StoreApiImpl(apiClient);
  }

  protected StoreApiImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ApiResponse<Void> deleteOrder(String orderId) {
    Objects.requireNonNull(orderId, "Required parameter 'orderId' not specified");
    WebClientRequestBuilder webClientRequestBuilder = deleteOrderRequestBuilder(orderId);
    return deleteOrderSubmit(webClientRequestBuilder, orderId);
  }

  /**
   * Creates a {@code WebClientRequestBuilder} for the deleteOrder operation.
   * Optional customization point for subclasses.
   *
   * @param orderId ID of the order that needs to be deleted (required)
   * @return WebClientRequestBuilder for deleteOrder
   */
  protected WebClientRequestBuilder deleteOrderRequestBuilder(String orderId) {
    WebClientRequestBuilder webClientRequestBuilder = apiClient.webClient()
            .method("DELETE");

    String path = "/store/order/{order_id}"
            .replace("{order_id}", ApiClient.urlEncode(orderId));
    webClientRequestBuilder.path(path);
    webClientRequestBuilder.accept(MediaType.APPLICATION_JSON);

    return webClientRequestBuilder;
  }

  /**
   * Initiates the request for the deleteOrder operation.
   * Optional customization point for subclasses.
   *
   * @param webClientRequestBuilder the request builder to use for submitting the request
   * @param orderId ID of the order that needs to be deleted (required)
   * @return {@code ApiResponse<Void>} for the submitted request
   */
  protected ApiResponse<Void> deleteOrderSubmit(WebClientRequestBuilder webClientRequestBuilder, String orderId) {
    Single<WebClientResponse> webClientResponse = webClientRequestBuilder.submit();
    return ApiResponse.create(RESPONSE_TYPE_deleteOrder, webClientResponse);
  }

  @Override
  public ApiResponse<Map<String, Integer>> getInventory() {
    WebClientRequestBuilder webClientRequestBuilder = getInventoryRequestBuilder();
    return getInventorySubmit(webClientRequestBuilder);
  }

  /**
   * Creates a {@code WebClientRequestBuilder} for the getInventory operation.
   * Optional customization point for subclasses.
   *
   * @return WebClientRequestBuilder for getInventory
   */
  protected WebClientRequestBuilder getInventoryRequestBuilder() {
    WebClientRequestBuilder webClientRequestBuilder = apiClient.webClient()
            .method("GET");

    webClientRequestBuilder.path("/store/inventory");
    webClientRequestBuilder.accept(MediaType.APPLICATION_JSON);

    return webClientRequestBuilder;
  }

  /**
   * Initiates the request for the getInventory operation.
   * Optional customization point for subclasses.
   *
   * @param webClientRequestBuilder the request builder to use for submitting the request
   * @return {@code ApiResponse<Map<String, Integer>>} for the submitted request
   */
  protected ApiResponse<Map<String, Integer>> getInventorySubmit(WebClientRequestBuilder webClientRequestBuilder) {
    Single<WebClientResponse> webClientResponse = webClientRequestBuilder.submit();
    return ApiResponse.create(RESPONSE_TYPE_getInventory, webClientResponse);
  }

  @Override
  public ApiResponse<Order> getOrderById(Long orderId) {
    Objects.requireNonNull(orderId, "Required parameter 'orderId' not specified");
    WebClientRequestBuilder webClientRequestBuilder = getOrderByIdRequestBuilder(orderId);
    return getOrderByIdSubmit(webClientRequestBuilder, orderId);
  }

  /**
   * Creates a {@code WebClientRequestBuilder} for the getOrderById operation.
   * Optional customization point for subclasses.
   *
   * @param orderId ID of pet that needs to be fetched (required)
   * @return WebClientRequestBuilder for getOrderById
   */
  protected WebClientRequestBuilder getOrderByIdRequestBuilder(Long orderId) {
    WebClientRequestBuilder webClientRequestBuilder = apiClient.webClient()
            .method("GET");

    String path = "/store/order/{order_id}"
            .replace("{order_id}", ApiClient.urlEncode(orderId.toString()));
    webClientRequestBuilder.path(path);
    webClientRequestBuilder.accept(MediaType.APPLICATION_JSON);

    return webClientRequestBuilder;
  }

  /**
   * Initiates the request for the getOrderById operation.
   * Optional customization point for subclasses.
   *
   * @param webClientRequestBuilder the request builder to use for submitting the request
   * @param orderId ID of pet that needs to be fetched (required)
   * @return {@code ApiResponse<Order>} for the submitted request
   */
  protected ApiResponse<Order> getOrderByIdSubmit(WebClientRequestBuilder webClientRequestBuilder, Long orderId) {
    Single<WebClientResponse> webClientResponse = webClientRequestBuilder.submit();
    return ApiResponse.create(RESPONSE_TYPE_getOrderById, webClientResponse);
  }

  @Override
  public ApiResponse<Order> placeOrder(Order order) {
    Objects.requireNonNull(order, "Required parameter 'order' not specified");
    WebClientRequestBuilder webClientRequestBuilder = placeOrderRequestBuilder(order);
    return placeOrderSubmit(webClientRequestBuilder, order);
  }

  /**
   * Creates a {@code WebClientRequestBuilder} for the placeOrder operation.
   * Optional customization point for subclasses.
   *
   * @param order order placed for purchasing the pet (required)
   * @return WebClientRequestBuilder for placeOrder
   */
  protected WebClientRequestBuilder placeOrderRequestBuilder(Order order) {
    WebClientRequestBuilder webClientRequestBuilder = apiClient.webClient()
            .method("POST");

    webClientRequestBuilder.path("/store/order");
    webClientRequestBuilder.contentType(MediaType.APPLICATION_JSON);
    webClientRequestBuilder.accept(MediaType.APPLICATION_JSON);

    return webClientRequestBuilder;
  }

  /**
   * Initiates the request for the placeOrder operation.
   * Optional customization point for subclasses.
   *
   * @param webClientRequestBuilder the request builder to use for submitting the request
   * @param order order placed for purchasing the pet (required)
   * @return {@code ApiResponse<Order>} for the submitted request
   */
  protected ApiResponse<Order> placeOrderSubmit(WebClientRequestBuilder webClientRequestBuilder, Order order) {
    Single<WebClientResponse> webClientResponse = webClientRequestBuilder.submit(order);
    return ApiResponse.create(RESPONSE_TYPE_placeOrder, webClientResponse);
  }

}
