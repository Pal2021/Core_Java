package org.example.Type_of_Classes.Singleton_Classes;

public class SynchronizedDBConnection {

    private SynchronizedDBConnection(){
        System.out.println("Connection has stablish successfully");
    }

    private static SynchronizedDBConnection conObject;

    synchronized public static SynchronizedDBConnection getInstance(){
        if(conObject==null){
            conObject=new  SynchronizedDBConnection();
        }
        return conObject;
    }
}
