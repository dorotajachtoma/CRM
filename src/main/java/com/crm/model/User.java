package com.crm.model;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @Getter
    private Long id;

    @Column(unique = true)
    @Setter
    @Getter
    private String login;

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private String lastName;

    @Setter
    @Getter
    private String password;


}
