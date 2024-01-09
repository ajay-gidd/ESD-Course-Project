package com.example.backend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Domain {
    @Id
    private long domain_id;
    @Column(nullable = false)
    private String program;
    @Column(nullable = false)
    private String batch;

    @Column(nullable = false)
    private long capacity;

    private String qualification;

    @OneToMany(mappedBy="domain")
    private Set<Students> students;

}
