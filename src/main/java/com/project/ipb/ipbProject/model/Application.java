package com.project.ipb.ipbProject.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
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
