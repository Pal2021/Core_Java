package org.example.Collection_Framework.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(24,12,67,89,12,45);
        Iterator<Integer>it= list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        //using forEach loop

        list.forEach((Integer val)-> System.out.println(val));
    }
}
