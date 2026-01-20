package org.example.Exceptions.CheckedException;

public class Main {
    public static void main(String[] args) {
        try {
            method2("hello");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void method2(String name) throws ClassNotFoundException {
        if (name.equals("hello")) {
            throw new ClassNotFoundException("Name is hello");
        }
    }
}
