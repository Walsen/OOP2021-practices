package com.jalasoft.practice4.motion;

public class Bicycle extends Land {

    private final Boolean exerciseBike;

    public Bicycle(String name, Integer price, Boolean hasMotor, Boolean exerciseBike) {
        super(name, price, hasMotor);
        this.exerciseBike = exerciseBike;
    }

    public Boolean getExerciseBike() {
        return exerciseBike;
    }

    public String displayData(){
        return super.displayData() + ", exercise = " + this.getExerciseBike();
    }
}
