package com.project.ipb.ipbProject.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Entity(name = "Repair")
public class Repair {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;
    private int repairID;

    @ElementCollection
    private List<String> damagedParts;

    private LocalDate startRepair;
    private LocalDate endRepair;

    @Transient
    private long durationRepair;

    @ManyToOne(cascade = CascadeType.ALL)
    private Car car;

    public Repair() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRepairID() {
        return repairID;
    }

    public void setRepairID(int repairID) {
        this.repairID = repairID;
    }

    public List<String> getDamagedParts() {
        return damagedParts;
    }

    public void setDamagedParts(List<String> damagedParts) {
        this.damagedParts = damagedParts;
    }

    public LocalDate getStartRepair() {
        return startRepair;
    }

    public void setStartRepair(LocalDate startRepair) {
        this.startRepair = startRepair;
    }

    public LocalDate getEndRepair() {
        return endRepair;
    }

    public void setEndRepair(LocalDate endRepair) {
        this.endRepair = endRepair;
    }

    //only get
    public long getDurationRepair() {
        durationRepair = ChronoUnit.DAYS.between(startRepair, startRepair);
        return durationRepair;
    }

    public void setDurationRepair(long durationRepair) {
        this.durationRepair = durationRepair;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Repair{" +
                "id=" + id +
                ", repairID=" + repairID +
                ", damagedParts=" + damagedParts +
                ", startRepair=" + startRepair +
                ", endRepair=" + endRepair +
                '}';
    }
}
