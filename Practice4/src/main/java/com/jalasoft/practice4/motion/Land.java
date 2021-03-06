package com.jalasoft.practice4.motion;

class Land extends Transport {

    private final Boolean hasMotor;

    Land(String name, Integer price, Boolean hasMotor) {
        super(name, price);
        this.hasMotor = hasMotor;
    }

    public Boolean getHasMotor() {
        return hasMotor;
    }

    public String displayData() {
        return "name = " + this.getName() +
                ", price = " + this.getPrice() +
                ", hasMotor = " + this.getHasMotor();
    }


}
