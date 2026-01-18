package org.example.JavaReflection;

public class Person {
    private String name = "Rahul";      // private - secret!
    private int secretAge = 25;

    private void secretMethod() {
        System.out.println("Nobody should call me directly!");
    }
}
