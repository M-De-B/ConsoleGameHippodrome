package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Denis on 04.04.2018.
 */
public class Hippodrome {
    public List<Horse> getHorses() {
        return horses;
    }

    private List<Horse> horses;

    public Hippodrome(List a){
     horses = a;
    }

    public static Hippodrome game;

    void run() throws InterruptedException {
        for (int s = 0; s<100; s++){
            move();
            print();
            Thread.sleep(200);
        }

    }

    void move(){
        for(Horse pair: horses){
            pair.move();    
        }
    }

    void print(){
        for(Horse pair:horses){
            pair.print();
        }
        for(int i=0;i<10;i++){
            System.out.println();
        }
    }

    public Horse getWinner(){
        double distanceMax=0;
        Horse rezult = null;
        for(Horse pair:getHorses()){
            if(pair.getDistance()>distanceMax){
                distanceMax = pair.getDistance();
                rezult = pair;
            }
        }
        return rezult;
    }

    public void printWinner(){
        System.out.println("Winner is "+getWinner().getName()+"!");
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();
        for(int i=0; i<3; i++){
            horses.add(new Horse("Лошадь"+i,3,0));
        }
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }
}
