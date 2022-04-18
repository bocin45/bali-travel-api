package com.pt.balitravel.service;

import com.pt.balitravel.entity.TripPersonalization;

import java.util.Optional;

public interface TripPersonalizationService {

    public TripPersonalization save(TripPersonalization tripPersonalization);

    public Optional<TripPersonalization> findById(String id);
}
