package org.example.Type_of_Classes.ImmuttableClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>l1=new ArrayList<>();
        l1.add(5);
        l1.add(8);
        l1.add(19);
        MyImmuttableClass myImmuttableClass=new MyImmuttableClass("prashant",l1,12);
        myImmuttableClass.getArr();
    }
}
