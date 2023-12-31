package com.sqli.sportevent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {
    @Id
    private Long id;

    private String firstName;

    private String lastName;
}
