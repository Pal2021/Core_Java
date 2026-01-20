package org.example.Exceptions.UnCheckedException;

public class ClassCastException {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Object val=0;
        System.out.println((String)val);
    }
}
