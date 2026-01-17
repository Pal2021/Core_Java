package org.example.Type_of_Classes.Singleton_Classes;

public class LazyDBConnection {

    private LazyDBConnection(){
        System.out.println("Connection has stablish successfully");
    }
    private static LazyDBConnection conObject;

    public static LazyDBConnection getInstances(){
        if(conObject==null){
            conObject=new LazyDBConnection();
        }
        return conObject;
    }


}
