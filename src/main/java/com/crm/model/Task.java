package com.crm.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;


    @Setter
    @Getter
    private LocalDate createdOn;

    @Setter
    @Getter
    private String subject;

    @Setter
    @Getter
    @OneToOne
    private Project project;

    @Setter
    @Getter
    @Min(50)
    @Max(100)
    private String description;

    @Setter
    @Getter
    @ManyToOne
    private Status status;

    @Setter@Getter
    @ManyToOne
    private Priority priority;

    @Setter
    @Getter
    @OneToMany
    private Set<User> users;




    private void getCurrentUsers(){

    }


    @PrePersist
    public void prePersist() {
        createdOn = LocalDate.now();
    }
}
