package com.project.ipb.ipbProject.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity(name = "estimate")
public class Estimate {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;
    private double cost;
    @Enumerated
    private TuningType tuningType;
    @ElementCollection
    private List<String> changedParts;

    public Estimate() {
    }

    public Estimate(TuningType tuningType, double cost, List<String> changedParts){
        this.tuningType=tuningType;
        this.cost=cost;
        this.changedParts=changedParts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<String> getChangedParts() {
        return changedParts;
    }

    public void setChangedParts(List<String> changedParts) {
        this.changedParts = changedParts;
    }

    public TuningType getTuningType() {
        return tuningType;
    }

    public void setTuningType(TuningType tuningType) {
        this.tuningType = tuningType;
    }

    @Override
    public String toString() {
        return "Estimate{" +
                "id=" + id +
                ", cost=" + cost +
                ", tuningType=" + tuningType +
                ", changedParts=" + changedParts +
                '}';
    }
}
