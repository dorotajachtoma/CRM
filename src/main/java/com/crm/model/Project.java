package com.crm.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @Getter
    private Long id;

    @Setter
    @Getter
    @Size(min = 10, max = 80)
    private String name;

    @Setter
    @Getter
    @Size(min = 50, max = 150)
    private String description;




}
