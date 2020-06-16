package com.project.ipb.ipbProject.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Measurement")
public class Measurement {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;
    private int measurementId;
    private double power;
    private double torque;
    private double oilTemperature;
    private double turboCompression;

    public Measurement() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMeasurementId() {
        return measurementId;
    }

    public void setMeasurementId(int measurementId) {
        this.measurementId = measurementId;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public double getOilTemperature() {
        return oilTemperature;
    }

    public void setOilTemperature(double oilTemperature) {
        this.oilTemperature = oilTemperature;
    }

    public double getTurboCompression() {
        return turboCompression;
    }

    public void setTurboCompression(double turboCompression) {
        this.turboCompression = turboCompression;
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "id=" + id +
                ", measurementId=" + measurementId +
                ", power=" + power +
                ", torque=" + torque +
                ", oilTemperature=" + oilTemperature +
                ", turboCompression=" + turboCompression +
                '}';
    }
}
