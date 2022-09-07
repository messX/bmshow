package com.example.bookmyshow.entities;

import com.example.bookmyshow.enums.TicketStatus;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Ticket extends BaseEntity{
    String ticketNumber;
    @OneToMany
    List<Seat> seatList;
    TicketStatus status;
}
