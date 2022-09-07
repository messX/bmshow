package com.example.bookmyshow.entities;

import com.example.bookmyshow.enums.SeatStatus;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Seat extends BaseEntity{
    Long seatNumber;
    SeatStatus status;
    @Basic(optional = false)
    @Column(name = "last_touched_timestamp", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    Date lastTouchedTimestamp;
}
