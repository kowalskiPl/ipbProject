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

    @ElementCollection
    private List<String> changedParts;

    public Estimate() {
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

    @Override
    public String toString() {
        return "Estimate{" +
                "id=" + id +
                ", cost=" + cost +
                ", changedParts=" + changedParts +
                '}';
    }
}
