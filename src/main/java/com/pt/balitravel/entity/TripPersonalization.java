package com.pt.balitravel.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@SuperBuilder
public class TripPersonalization {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String uuid;

    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Participant participant;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Region region;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private HotelPreference hotelPreference;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private SitesPreference sitesPreference;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private BudgetPreference budgetPreference;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private ActivitesPreference activitesPreference;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private AdditionalPreference additionalPreference;


}
