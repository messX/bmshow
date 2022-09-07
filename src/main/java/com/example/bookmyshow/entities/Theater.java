package com.example.bookmyshow.entities;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Theater extends BaseEntity{
    String name;
    String address;
    String city;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Screen> screenList;
}
