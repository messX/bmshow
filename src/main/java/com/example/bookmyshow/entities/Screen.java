package com.example.bookmyshow.entities;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Screen extends BaseEntity{
    String name;
    @OneToMany(cascade = CascadeType.ALL)
    List<Show> showList;
}
