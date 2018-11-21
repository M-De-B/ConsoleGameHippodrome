package com.javarush.task.task21.task2113;

/**
 * Created by Denis on 04.04.2018.
 */
public class Horse {
    private String name;
    private double speed;
    private double distance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    void move(){
        double distane = getDistance()+getSpeed()*Math.random();
        setDistance(distane);
    }
    void print(){
        double distance = Math.floor(getDistance());
        String rezult = "";
        for(int i = 0;i<distance;i++){
            rezult+=".";
        }
        System.out.println(rezult+getName());
    }


    public Horse(String names,double speeds,double distances){
    setName(names);
    setSpeed(speeds);
    setDistance(distances);

    }
}
