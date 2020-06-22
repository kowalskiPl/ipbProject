package com.project.ipb.ipbProject.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Modification")
public class Modification {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Enumerated
    private TuningType tuningType;

    @ElementCollection
    private List<String> changedParts;

    @Transient
    private double powerIncrease;

    @Transient
    private double torqueIncrease;

    @ManyToOne(cascade = CascadeType.ALL)
    private Car car;

    public Modification() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TuningType getTuningType() {
        return tuningType;
    }

    public void setTuningType(TuningType tuningType) {
        this.tuningType = tuningType;
    }

    public List<String> getChangedParts() {
        return changedParts;
    }

    public void setChangedParts(List<String> changedParts) {
        this.changedParts = changedParts;
    }

    public double getPowerIncrease() {
        return powerIncrease;
    }

    public void setPowerIncrease(double powerIncrease) {
        this.powerIncrease = powerIncrease;
    }

    public double getTorqueIncrease() {
        return torqueIncrease;
    }

    public void setTorqueIncrease(double torqueIncrease) {
        this.torqueIncrease = torqueIncrease;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Modification{" +
                "id=" + id +
                ", tuningType=" + tuningType +
                ", changedParts=" + changedParts +
                ", powerIncrease=" + powerIncrease +
                ", torqueIncrease=" + torqueIncrease +
                '}';
    }
}
