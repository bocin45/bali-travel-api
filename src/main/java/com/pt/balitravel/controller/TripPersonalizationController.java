package com.pt.balitravel.controller;

import com.pt.balitravel.entity.TripPersonalization;
import com.pt.balitravel.service.EmailService;
import com.pt.balitravel.service.TripPersonalizationService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/balitravel")
public class TripPersonalizationController {

    private TripPersonalizationService tripPersonalizationService;

    public TripPersonalizationController(TripPersonalizationService tripPersonalizationService) {
        this.tripPersonalizationService = tripPersonalizationService;
    }

    @PostMapping(value = "/personalization", consumes = "application/*")
    public ResponseEntity<?> saveTripPersonalization(@RequestBody(required = true) TripPersonalization tripPersonalization) {
        tripPersonalization = tripPersonalizationService.save(tripPersonalization);

        return new ResponseEntity<TripPersonalization>(tripPersonalization, HttpStatus.OK);
    }
}
