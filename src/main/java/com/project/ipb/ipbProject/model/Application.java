package com.project.ipb.ipbProject.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "application")
public class Application {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @ManyToOne
    private Client client;
    @ManyToOne
    private Car car;

    @Temporal(TemporalType.DATE)
    private Date date;

    private boolean canBeTuned = true;

    private Status status = Status.PreparedForTuning;

    public Application() {
    }

    public Date getDate() {
        return date;
    }

    public boolean isCanBeTuned() {
        return canBeTuned;
    }

    public void setCanBeTuned(boolean canBeTuned) {
        this.canBeTuned = canBeTuned;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", klient=" + client +
                ", car=" + car +
                ", date=" + date +
                '}';
    }
}
