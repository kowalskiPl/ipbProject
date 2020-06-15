package com.project.ipb.ipbProject.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Class containing car characteristics, in Polish to keep the same as in documentation
 */
@Entity(name = "car")
public class Car {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    private String numerRejestracyjny;
    private String marka;
    private String rodzajPaliwa;
    private double pojemnoscSkokowa;
    private double mocSeryjna;
    private double momentObrotowySeryjny;
    private double turbo;

    @OneToMany(mappedBy = "car", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Application> applications;

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public void setNumerRejestracyjny(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getRodzajPaliwa() {
        return rodzajPaliwa;
    }

    public void setRodzajPaliwa(String rodzajPaliwa) {
        this.rodzajPaliwa = rodzajPaliwa;
    }

    public double getPojemnoscSkokowa() {
        return pojemnoscSkokowa;
    }

    public void setPojemnoscSkokowa(double pojemnoscSkokowa) {
        this.pojemnoscSkokowa = pojemnoscSkokowa;
    }

    public double getMocSeryjna() {
        return mocSeryjna;
    }

    public void setMocSeryjna(double mocSeryjna) {
        this.mocSeryjna = mocSeryjna;
    }

    public double getMomentObrotowySeryjny() {
        return momentObrotowySeryjny;
    }

    public void setMomentObrotowySeryjny(double momentObrotowySeryjny) {
        this.momentObrotowySeryjny = momentObrotowySeryjny;
    }

    public double getTurbo() {
        return turbo;
    }

    public void setTurbo(double turbo) {
        this.turbo = turbo;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }
}
