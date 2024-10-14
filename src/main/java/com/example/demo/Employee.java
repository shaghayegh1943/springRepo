package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empSequence")
    @SequenceGenerator(name = "empSequence", sequenceName = "empSequence", allocationSize = 1)
    private Integer empNo;
    private String firstName;
    private String lastName;
    @Column(nullable = false)
     private char gender;
    private Date hireDate;
    @Column(unique = true)
    private String email;
    @OneToOne
    @JoinColumn(name = "addressId")
    private Address address;

}
