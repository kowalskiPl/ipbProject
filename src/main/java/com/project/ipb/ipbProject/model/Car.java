package com.project.ipb.ipbProject.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Class containing car characteristics
 */
@Entity(name = "car")
public class Car {

    public enum FuelType { Diesel, Petrol, Gas }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    private String registrationNumber;
    private String brand;

    @Enumerated
    private FuelType fuelType;

    private double displacement; //pojemność skokowa
    private double standardPower; //moc seryjna
    private double standardTorque;
    private boolean ifTurbo;

    @OneToMany(mappedBy = "car", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Application> applications;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Modification> modifications;

    @OneToMany(mappedBy = "car",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Repair> repairs;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Measurement> measurements;

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String marka) {
        this.brand = marka;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType rodzajPaliwa) {
        this.fuelType = rodzajPaliwa;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double pojemnoscSkokowa) {
        this.displacement = pojemnoscSkokowa;
    }

    public double getStandardPower() {
        return standardPower;
    }

    public void setStandardPower(double mocSeryjna) {
        this.standardPower = mocSeryjna;
    }

    public double getStandardTorque() {
        return standardTorque;
    }

    public void setStandardTorque(double momentObrotowySeryjny) {
        this.standardTorque = momentObrotowySeryjny;
    }

    public boolean isIfTurbo() {
        return ifTurbo;
    }

    public void setIfTurbo(boolean ifTurbo) {
        this.ifTurbo = ifTurbo;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", fuelType=" + fuelType +
                ", displacement=" + displacement +
                ", standardPower=" + standardPower +
                ", standardTorque=" + standardTorque +
                ", ifTurbo=" + ifTurbo +
                ", applications=" + applications +
                '}';
    }
}
