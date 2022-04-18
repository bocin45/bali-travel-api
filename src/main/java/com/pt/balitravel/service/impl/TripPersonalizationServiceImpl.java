package com.pt.balitravel.service.impl;

import com.pt.balitravel.entity.TripPersonalization;
import com.pt.balitravel.repository.TripPersonalizationRepository;
import com.pt.balitravel.service.TripPersonalizationService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TripPersonalizationServiceImpl implements TripPersonalizationService {

    private TripPersonalizationRepository tripPersonalizationRepository;

    public TripPersonalizationServiceImpl(TripPersonalizationRepository tripPersonalizationRepository) {
        this.tripPersonalizationRepository = tripPersonalizationRepository;
    }

    @Override
    public TripPersonalization save(TripPersonalization tripPersonalization) {
        return tripPersonalizationRepository.save(tripPersonalization);
    }

    @Override
    public Optional<TripPersonalization> findById(String id) {
        return tripPersonalizationRepository.findById(id);
    }
}
