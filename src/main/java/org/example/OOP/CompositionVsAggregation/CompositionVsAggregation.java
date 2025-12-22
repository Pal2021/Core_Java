package org.example.OOP.CompositionVsAggregation;

import java.util.ArrayList;
import java.util.List;

class Engine{
    String Engine1;
    public Engine(String thisIsEngine) {
        this.Engine1=thisIsEngine;
    }

    void component(){
        System.out.println("this is car Engine component");
    }
}
class Car{
    Engine engine;
    Car(){
        engine=new Engine("this is engine");
    }
    Engine getEngine(){
        return  new Engine("this is car Engine component");
    }
}
public class CompositionVsAggregation {
    public static void main(String[] args) {
        Car car =new Car();
        Engine engine=car.getEngine();

        List<Integer> ans=new ArrayList<>();

    }
}
