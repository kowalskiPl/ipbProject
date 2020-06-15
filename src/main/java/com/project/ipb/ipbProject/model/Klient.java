package com.project.ipb.ipbProject.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity(name = "klient")
public class Klient extends Osoba{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @OneToMany(mappedBy = "klient", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Application> applications;

}
