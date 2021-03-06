package com.jalasoft.practice4;

import com.jalasoft.practice4.motion.Bicycle;
import com.jalasoft.practice4.motion.Car;
import com.jalasoft.practice4.motion.ListLandTransport;

public class Main {

    public static void main(String[] args) {
        ListLandTransport trans = new ListLandTransport();
        trans.addLand(new Bicycle("Cross", 1500, false, false));
        trans.addLand(new Car("Audi", 20000, true, false));
        trans.display();
    }
}
