package com.dunnhumby.retailer.controller;


import com.dunnhumby.retailer.service.AdInsightsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ad")
public class AdInsightsController {
    private final AdInsightsService adInsightsService;

    public AdInsightsController(AdInsightsService adInsightsService) {
        this.adInsightsService = adInsightsService;
    }

    @GetMapping("/{campaignID}/clicks")
    public ResponseEntity<Long> getClicks(@PathVariable String campaignID,
                                          @RequestParam(defaultValue = "real-time") String mode) {
        return ResponseEntity.ok(adInsightsService.getClicks(campaignID, mode));
    }

    @GetMapping("/{campaignID}/impressions")
    public ResponseEntity<Long> getImpressions(@PathVariable String campaignID,
                                               @RequestParam(defaultValue = "real-time") String mode) {
        return ResponseEntity.ok(adInsightsService.getImpressions(campaignID, mode));
    }

    @GetMapping("/{campaignID}/clickToBasket")
    public ResponseEntity<Long> getClickToBasket(@PathVariable String campaignID,
                                                 @RequestParam(defaultValue = "real-time") String mode) {
        return ResponseEntity.ok(adInsightsService.getClickToBasket(campaignID, mode));
    }
}
