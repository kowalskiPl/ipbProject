package com.project.ipb.ipbProject.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javafx.scene.shape.VLineTo;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity(name = "client")
public class Client extends Person {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;
    private String adress;
    private String email;

    @OneToMany(mappedBy = "client", orphanRemoval = true, cascade = CascadeType.ALL)
    @LazyCollection(value = LazyCollectionOption.FALSE)
    private List<Application> applications;


    public Client() {
    }

    public Client(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @JsonManagedReference
    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", pesel=" + pesel +
                ", login='" + login + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                '}';
    }
}
