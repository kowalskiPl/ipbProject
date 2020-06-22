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


    @Override
    public String toString() {
        return "Diagnosis{" +
                "id=" + id +
                ", currentState=" + currentState +
                ", ifTune=" + ifTune +
                '}';
    }
}
