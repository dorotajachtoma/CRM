package com.crm.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Setter
    @Getter
    @ManyToMany(mappedBy = "users",fetch = FetchType.EAGER)
    private Set<Project> projects;

    public User() {
    }
}
