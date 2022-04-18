package com.pt.balitravel.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
public class ActivitesPreference {

    private enum SportiveType {
        MULTI_DAY_TREKS, SHORT_HIKES, SPORT_TRACKS_VOLCANO, TRAIL_RUNNING, MOUNTAIN_BIKE, SMALL_BIKE;
    }

    private enum WaterSportType {
        BEACH, SNORKLING, SCUBA, SURF, WIND_SURF, PADDLE_CANOE, WAKE_BOARD, BANANA_BOAT, JET_SKI, FISHING_TOUR, WATER_BOOM
    }

    private enum CruisesType {
        REEF_CRUISE, CASTAWAY_ESCAPE, ARISTOCAT_SAILING, THREE_ISLAND_CRUISE
    }

    private enum DayBaliTourType {
        WITH_DTIVER, WITH_DRIVER_AND_GUIDES, DAY_NIGHT_TOUR, DAY_CULTURAL_TOUR
    }

    private enum DiscoveryType {
        QUAD_DISCOVERY, BUGGIES_DISCOVERY_TOUR, ELEPHANT_SAFARI_PARK, DOLPHIN_TOUR, PARACHUTE_TANDEM, PARASAILING, VW_SAFARI
    }

    private enum InstagramType {
        SWING, LEMPUYANG_TEMPLE
    }

    private enum LuxuryType {
        LUXURY_YATCH, LUXURY_CAR, HELICOPTER_BALI_TOUR, PHOTOGRAPHER, BOUQUETS_ROSES, CHAMPAGNE, SPECIAL_DINNER
    }

    private enum SpiritualType {
        YOGA_COURSES, MEDITATTION_COURSES, SPA, BALINESE_MASSAGE, MELUKAT
    }

    private enum RentalType {
        RENT_CAR, RENT_SCOOTER, RENT_MOTOR_BIKE, RENT_BYCYCLE, RENT_BOAT
    }


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;
    @Enumerated(EnumType.STRING)
    private SportiveType sportiveType;
    @Enumerated(EnumType.STRING)
    private WaterSportType waterSportType;
    @Enumerated(EnumType.STRING)
    private CruisesType cruisesType;
    @Enumerated(EnumType.STRING)
    private DiscoveryType discoveryType;
    @Enumerated(EnumType.STRING)
    private InstagramType instagramType;
    @Enumerated(EnumType.STRING)
    private LuxuryType luxuryType;
    @Enumerated(EnumType.STRING)
    private SpiritualType spiritualType;
    @Enumerated(EnumType.STRING)
    private RentalType rentalType;
}
