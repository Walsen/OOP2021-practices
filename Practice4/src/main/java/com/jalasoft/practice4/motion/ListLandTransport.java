package com.jalasoft.practice4.motion;

import java.util.ArrayList;
import java.util.List;

public class ListLandTransport {

    List<Land> land = new ArrayList<>();

    public void addLand(Land land) {
        this.land.add(land);
    }

    public void display() {
        this.land.forEach(item -> System.out.println(item.displayData()));
    }
}
