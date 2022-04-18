package com.pt.balitravel.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pt.balitravel.entity.Customer;
import com.pt.balitravel.entity.TripPersonalization;
import com.pt.balitravel.service.EmailService;
import com.pt.balitravel.service.TripPersonalizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;

import java.util.UUID;

@RestController
@RequestMapping("/balitravel")
public class EmailController {

    EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @RequestMapping(value = "/email", method = RequestMethod.POST)
    public ResponseEntity<String> sendEmail(@RequestBody Customer customer) {
        customer.setUuid(UUID.randomUUID().toString());
        emailService.sendEmail(customer);
        return ResponseEntity.ok().build();
    }
}
