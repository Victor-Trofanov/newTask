package proj;

import java.time.LocalDate;
import java.util.Date;

public abstract class GasolineCar implements ChargeCarWithGasoline {
    private String model;
    private String color;
    private LocalDate age;
    private int tankSpace;

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

    public int getTankSpace() {
        return tankSpace;
    }

    public void setTankSpace(int tankSpace) {
        this.tankSpace = tankSpace;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String fillTank() {
        setTankSpace(100);
        return"In rezervor este "+getTankSpace()+" litri de combustibil";

    }
}
