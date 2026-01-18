package org.example.Practice;

public class MainClass{

    public static void main(String[] args) {

       FunInterface fun1=(String name)->{
           System.out.println("this is fun interface "+name);
       };
       fun1.print("hello");
    }
}
