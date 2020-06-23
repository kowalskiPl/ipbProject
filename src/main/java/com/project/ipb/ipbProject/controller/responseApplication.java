package com.project.ipb.ipbProject.controller;

import com.project.ipb.ipbProject.model.Car;
import com.project.ipb.ipbProject.model.Client;

/**
 * A wrapper to return car application and user
 */
public class responseApplication {
    Car car;

    public responseApplication(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
