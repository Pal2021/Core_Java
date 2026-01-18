package org.example.Type_of_Classes.ImmuttableClass;

import java.util.ArrayList;
import java.util.List;

public final class MyImmuttableClass {
   private final String name;
   private final List<Integer> arr;
   private final int val;


    public MyImmuttableClass(String name, List<Integer> arr, int val) {
        this.name = name;
        this.arr = new ArrayList<>(arr);
        this.val = val;
    }

    public String getName(){
        return name;
    }
    public ArrayList<Integer> getArr(){
        return new ArrayList<>(arr);
    }
    public int getVal(){
        return val;
    }
}
