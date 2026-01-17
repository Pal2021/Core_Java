package org.example.Type_of_Classes.Singleton_Classes;

public class EgarDbConnection {

    private static final EgarDbConnection conObject=new EgarDbConnection();
    private  EgarDbConnection(){
       //some db connection values
        System.out.println("Connection has been stablish successfully");
    }

    public static EgarDbConnection getInstence(){
        return conObject;
    }

}
