package org.example.Type_of_Classes.Singleton_Classes;

public class DoubleLockingDBConnection {

    private DoubleLockingDBConnection(){
        System.out.println("Connection has been establish successfully");
    }

    private static DoubleLockingDBConnection conObject;

    private static DoubleLockingDBConnection getInstance(){
        if(conObject==null){
            conObject=new DoubleLockingDBConnection();
        }
    }
}
