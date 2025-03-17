package com.dunnhumby.retailer.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HistoricalAnalyticsRepository {
    private final JdbcTemplate jdbcTemplate;

    public HistoricalAnalyticsRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Long getClicks(String campaignID) {
        return jdbcTemplate.queryForObject("SELECT SUM(clicks) FROM ad_metrics WHERE campaign_id = ?",
                new Object[]{campaignID}, Long.class);
    }

    public Long getImpressions(String campaignID) {
        return jdbcTemplate.queryForObject("SELECT SUM(impressions) FROM ad_metrics WHERE campaign_id = ?",
                new Object[]{campaignID}, Long.class);
    }

    public Long getClickToBasket(String campaignID) {
        return jdbcTemplate.queryForObject("SELECT SUM(click_to_basket) FROM ad_metrics WHERE campaign_id = ?",
                new Object[]{campaignID}, Long.class);
    }
}
