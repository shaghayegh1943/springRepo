package com.example.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "addressSequence")
    @SequenceGenerator(name ="addressSequence", sequenceName ="addressSequence",allocationSize = 1)
    private Integer id;
    private String street;
    private String houseNo;
    private String City;
    private String zipCode;
}
