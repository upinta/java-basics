package com.dunnhumby.retailer.controller;


import com.dunnhumby.retailer.service.AdInsightsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ad")
@Tag(name = "Ad Insights API", description = "APIs for retrieving real-time and historical ad insights")
public class AdInsightsController {
    private final AdInsightsService adInsightsService;

    public AdInsightsController(AdInsightsService adInsightsService) {
        this.adInsightsService = adInsightsService;
    }

    @GetMapping("/{campaignID}/clicks")
    @Operation(
            summary = "Get Click Count",
            description = "Returns the number of customers who clicked on the ad. Supports real-time and historical queries."
    )
    public ResponseEntity<Long> getClicks(
            @PathVariable @Parameter(description = "Unique campaign identifier") String campaignID,
            @RequestParam(defaultValue = "real-time")
            @Parameter(description = "Query mode: 'real-time' for live data, 'historical' for past data") String mode) {
        return ResponseEntity.ok(adInsightsService.getClicks(campaignID, mode));
    }

    @GetMapping("/{campaignID}/impressions")
    @Operation(
            summary = "Get Impressions Count",
            description = "Returns the number of customers who viewed the ad."
    )
    public ResponseEntity<Long> getImpressions(
            @PathVariable @Parameter(description = "Unique campaign identifier") String campaignID,
            @RequestParam(defaultValue = "real-time")
            @Parameter(description = "Query mode: 'real-time' for live data, 'historical' for past data") String mode) {
        return ResponseEntity.ok(adInsightsService.getImpressions(campaignID, mode));
    }

    @GetMapping("/{campaignID}/clickToBasket")
    @Operation(
            summary = "Get Click-to-Basket Count",
            description = "Returns the number of customers who added a product to their cart after clicking the ad."
    )
    public ResponseEntity<Long> getClickToBasket(
            @PathVariable @Parameter(description = "Unique campaign identifier") String campaignID,
            @RequestParam(defaultValue = "real-time")
            @Parameter(description = "Query mode: 'real-time' for live data, 'historical' for past data") String mode) {
        return ResponseEntity.ok(adInsightsService.getClickToBasket(campaignID, mode));
    }
}
