package com.dunnhumby.retailer.service;

import com.dunnhumby.retailer.repository.HistoricalAnalyticsRepository;
import com.dunnhumby.retailer.repository.RealTimeAnalyticsRepository;
import org.springframework.stereotype.Service;

@Service
public class AdInsightsService {
    private final RealTimeAnalyticsRepository realTimeRepo;
    private final HistoricalAnalyticsRepository historicalRepo;

    public AdInsightsService(RealTimeAnalyticsRepository realTimeRepo,
                             HistoricalAnalyticsRepository historicalRepo) {
        this.realTimeRepo = realTimeRepo;
        this.historicalRepo = historicalRepo;
    }

    public Long getClicks(String campaignID, String mode) {
        return "historical".equalsIgnoreCase(mode)
                ? historicalRepo.getClicks(campaignID)
                : realTimeRepo.getClicks(campaignID);
    }

    public Long getImpressions(String campaignID, String mode) {
        return "historical".equalsIgnoreCase(mode)
                ? historicalRepo.getImpressions(campaignID)
                : realTimeRepo.getImpressions(campaignID);
    }

    public Long getClickToBasket(String campaignID, String mode) {
        return "historical".equalsIgnoreCase(mode)
                ? historicalRepo.getClickToBasket(campaignID)
                : realTimeRepo.getClickToBasket(campaignID);
    }
}
