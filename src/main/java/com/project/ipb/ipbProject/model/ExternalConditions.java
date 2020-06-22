package com.project.ipb.ipbProject.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "ExternalConditions")
public class ExternalConditions {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    private double temperatuere;
    private double humidity;
    private LocalDate date;

    @OneToMany(mappedBy = "externalConditions", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Measurement> measurements;

    public ExternalConditions() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTemperatuere() {
        return temperatuere;
    }

    public void setTemperatuere(double temperatuere) {
        this.temperatuere = temperatuere;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ExternalConditions{" +
                "id=" + id +
                ", temperatuere=" + temperatuere +
                ", humidity=" + humidity +
                ", date=" + date +
                '}';
    }
}
