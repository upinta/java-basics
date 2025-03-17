package com.dunnhumby.retailer.repository;

import org.springframework.stereotype.Repository;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;
import software.amazon.awssdk.services.dynamodb.model.GetItemResponse;

import java.util.Map;

@Repository
public class RealTimeAnalyticsRepository {
    private final DynamoDbClient dynamoDbClient;
    private static final String TABLE_NAME = "AdMetrics";

    public RealTimeAnalyticsRepository(DynamoDbClient dynamoDbClient) {
        this.dynamoDbClient = dynamoDbClient;
    }

    public Long getClicks(String campaignID) {
        GetItemRequest request = GetItemRequest.builder()
                .tableName(TABLE_NAME)
                .key(Map.of("campaignID", AttributeValue.fromS(campaignID)))
                .build();

        GetItemResponse response = dynamoDbClient.getItem(request);
        return response.hasItem() ? Long.parseLong(response.item().get("clicks").n()) : 0L;
    }

    public Long getImpressions(String campaignID) {
        GetItemRequest request = GetItemRequest.builder()
                .tableName(TABLE_NAME)
                .key(Map.of("campaignID", AttributeValue.fromS(campaignID)))
                .build();

        GetItemResponse response = dynamoDbClient.getItem(request);
        return response.hasItem() ? Long.parseLong(response.item().get("impressions").n()) : 0L;
    }

    public Long getClickToBasket(String campaignID) {
        GetItemRequest request = GetItemRequest.builder()
                .tableName(TABLE_NAME)
                .key(Map.of("campaignID", AttributeValue.fromS(campaignID)))
                .build();

        GetItemResponse response = dynamoDbClient.getItem(request);
        return response.hasItem() ? Long.parseLong(response.item().get("clickToBasket").n()) : 0L;
    }
}
