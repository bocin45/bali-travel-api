package com.pt.balitravel.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Calendar;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
public class Participant {

    public enum BedType {
        DOUBLE_BED, TWIN_BED, NO_PREFERENCE
    }

    public enum TripStylePreference {
        DISCOVER_MAXIMUM, QUIET_STAY, MIX
    }

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String uuid;

    /**
     * Participant
     */
    @Column
    private int adultParticipant;
    @Column
    private int childParticipant;
    @Column
    private int numberOfBedroom;
    @Enumerated(EnumType.STRING)
    private Participant.BedType typeOfBeds;
    @Column
    private boolean extraBed;
    @Column
    private TripStylePreference tripStylePreference;
    @Column
    private Calendar fromPeriod;
    @Column
    private Calendar toPeriod;
}
