package com.crm.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    @Setter
    @Getter
    private String identifier;

    @Setter
    @Getter
    @ManyToMany
    @JoinTable(name  = "projects_user")
    private Set<User> users;

    @Setter
    @Getter
    private boolean avaible;



    public String getIdentifier() {
        makeIdentifier();
        return identifier;
    }

    public void setIdentifier(String identifier) {
        makeIdentifier();
        this.identifier = identifier;
    }

    public String makeIdentifier(){
        Pattern pattern = Pattern.compile("ż|ź|ł|ą|ę|ł|ć|ś|ń|ó");
        Matcher matcher = pattern.matcher(identifier);
        if(matcher.find() || identifier.contains(" ")){
            identifier.replace("ż|ź|ł|ą|ę|ł|ć|ś|ń|ó", "");
            identifier.replace(" ", "-");
        }
        return  identifier;
    }

    public Project() {
    }
}
