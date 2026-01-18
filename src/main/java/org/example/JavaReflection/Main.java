package org.example.JavaReflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
       // Person p = new Person();
//        System.out.println(p.name);     // → ERROR! name is private
//        p.secretMethod();               // → ERROR!

        Person p=new Person();

        // 1. Get the "blueprint" (class)
        Class<?>classObject=p.getClass();

        // 2. Get private field even though it's private
        Field nameField = classObject.getDeclaredField("name");
        nameField.setAccessible(true);
        // 3. Read or change private value
        String realName = (String) nameField.get(p);
        System.out.println(realName);           // → Rahul

        nameField.set(p, "Secret Agent");       // changing private field!



    }
}
