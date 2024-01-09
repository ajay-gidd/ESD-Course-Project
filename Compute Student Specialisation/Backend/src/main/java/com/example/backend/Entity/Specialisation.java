package com.example.backend.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
public class Specialisation {

    @Id
    private long specialisation_id;
     @Column(unique = true, nullable = true)
    private  String code;

     @Column(nullable = false)
    private String specialisation_name;

     private String description;

     private LocalDate year;

     private long required_credit;

    @ManyToMany(mappedBy = "specialisation_Course")
    Set<Course> course_specialisation;

    ///////////////////////////
    @OneToMany(mappedBy="specialisation")
    private Set<Students> students;
}
