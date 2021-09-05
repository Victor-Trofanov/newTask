package proj;

import java.time.LocalDate;
import java.util.Date;

public abstract class ElectroCar implements ChargeCarWithEnergy {
    private String model;
    private String color;
    private LocalDate age;
    private int battery;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String chargeBattery() {
        setBattery(100);
        return"Bateria este incarcate la "+getBattery()+" de procente";

    }
}
