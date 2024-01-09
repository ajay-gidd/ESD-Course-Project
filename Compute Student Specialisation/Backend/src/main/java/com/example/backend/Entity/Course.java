package com.example.backend.Entity;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
public class Course {
    @Id
    private long course_id;

    @Column(unique = true, nullable = false)
    private String course_code;

    @Column(nullable = false)
    private String course_name;

    private String description;
    @Column(nullable = false)
    private LocalDate year;
    @Column(nullable = false)
    private long term;

    @Column(nullable = false)
    private long credits;

    @Column(nullable = false)
    private long capacity;

    @ManyToMany(mappedBy = "student_course")
    Set<Students> course_student;

    @ManyToMany
    @JoinTable(
            name = "specialisation_Course",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "specialisation_id"))
    Set<Specialisation> specialisation_Course;


}
