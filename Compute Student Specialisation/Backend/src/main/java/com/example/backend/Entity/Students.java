package com.example.backend.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Set;

@Entity
public class Students {
    @Id
    private long student_id;
    @Column(unique = true, nullable = false)
    private String roll_number;

    @Column( nullable = false)
    private String first_name;

    private String last_name;
    @Column(unique = true, nullable = false)
    private String email;
    private String photograph_path;
    @Column( nullable = false)
    private String cgpa;
    @Column(nullable = false)
    private String total_credit;
    private LocalDate graduation_year;

    @ManyToMany
    @JoinTable(
            name = "Student_Course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    Set<Course> student_course;

    @ManyToOne
    @JoinColumn(name = "domain_id" )
    private Domain domain;

    /////////////////

    @ManyToOne
    @JoinColumn(name="specialisation_id", nullable=false)
    private Specialisation specialisation;



}
