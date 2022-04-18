package com.pt.balitravel.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@SuperBuilder
public class SitesPreference {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;
    @Enumerated(EnumType.STRING)
    private Preference ocean;
    @Enumerated(EnumType.STRING)
    private Preference mountain;
    @Enumerated(EnumType.STRING)
    private Preference riceField;
    @Enumerated(EnumType.STRING)
    private Preference culuturalSites;
    @Enumerated(EnumType.STRING)
    private Preference shoppingTouristCenters;
    @Column
    private String custom;
}
