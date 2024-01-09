package com.example.backend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Department {
    @Id
    private long department_id;
    @Column(nullable = false)
    private String department_name;

    @Column(nullable = false)
    private long capacity;



    @OneToMany(mappedBy="department")
    private Set<Employees> employees;
}
