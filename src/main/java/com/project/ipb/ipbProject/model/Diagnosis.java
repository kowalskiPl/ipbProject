package com.project.ipb.ipbProject.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Diagnosis")
public class Diagnosis {

    public enum CurrentState{ suitableForTuning, nonSuitableForTuning }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;
    @Enumerated
    private CurrentState currentState;
    @Transient
    private boolean ifTune;
    @ManyToMany(mappedBy = "diagnoses", cascade = CascadeType.ALL)
    private List<TechnicalEmployee> technicalEmployees;

    public Diagnosis() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CurrentState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(CurrentState currentState) {
        this.currentState = currentState;
    }

    public boolean isIfTune() {
        return ifTune;
    }

    public void setIfTune(boolean ifTune) {
        this.ifTune = ifTune;
    }

    public List<TechnicalEmployee> getTechnicalEmployees() {
        return technicalEmployees;
    }

    public void setTechnicalEmployees(List<TechnicalEmployee> technicalEmployees) {
        this.technicalEmployees = technicalEmployees;
    }

    @Override
    public String toString() {
        return "Diagnosis{" +
                "id=" + id +
                ", currentState=" + currentState +
                ", ifTune=" + ifTune +
                ", technicalEmployees=" + technicalEmployees +
                '}';
    }
}
