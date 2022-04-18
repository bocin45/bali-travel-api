package com.pt.balitravel.datagenerator;

import com.pt.balitravel.entity.Customer;
import com.pt.balitravel.entity.Participant;
import com.pt.balitravel.entity.TripPersonalization;
import com.pt.balitravel.repository.TripPersonalizationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.mail.Part;
import javax.persistence.Column;
import java.util.UUID;

@Component
public class DataLoader implements CommandLineRunner {

    TripPersonalizationRepository tripPersonalizationRepository;

    public DataLoader(TripPersonalizationRepository tripPersonalizationRepository) {
        this.tripPersonalizationRepository = tripPersonalizationRepository;
    }

    @Override
    public void run(String... args) throws Exception {

//        TripPersonalization tripPersonalization = new TripPersonalization.builder()
//                .uuid(UUID.randomUUID().toString())
//                .participant(new Participant.builder()
//                        .uuid(UUID.randomUUID().toString())
//                        .adultParticipant(2)
//                        .childParticipant(2)
//                        .extraBed(true)
//                        .typeOfBeds(Participant.BedType.DOUBLE_BED)
//                        .numberOfBedroom(3).build())
//                .build();
//
//        tripPersonalizationRepository.save(tripPersonalization);

    }
}
