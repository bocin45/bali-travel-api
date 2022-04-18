package com.pt.balitravel.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@SuperBuilder
public class HotelPreference {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;
    @Enumerated(EnumType.STRING)
    private Preference homeStay;
    @Enumerated(EnumType.STRING)
    private Preference charmingHotels;
    @Enumerated(EnumType.STRING)
    private Preference smallIntimateComfortableHotels;
    @Enumerated(EnumType.STRING)
    private Preference charmingHotelsAndGuestHouse;
    @Enumerated(EnumType.STRING)
    private Preference luxuryBoutiqueHotelsFrom200Dollar;
    @Enumerated(EnumType.STRING)
    private Preference luxuryBoutiqueHotelsFrom300Dollar;
    @Enumerated(EnumType.STRING)
    private Preference hotelInternationalLuxury;
    @Column
    private String custom;

}
