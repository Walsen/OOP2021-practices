package com.jalasoft.practice4.motion;

abstract class Transport {
    String name;
    Integer price;

    Transport(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}
