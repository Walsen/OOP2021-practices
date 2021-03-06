package com.jalasoft.practice4.motion;

public class Car extends Land {

    private final Boolean useGas;

    public Car(String name, Integer price, Boolean hasMotor, Boolean useGas) {
        super(name, price, hasMotor);
        this.useGas = useGas;
    }

    public Boolean getUseGas() {
        return useGas;
    }

    public String displayData() {
        return super.displayData() + ", useGas = " + this.getUseGas();
    }
}
