package org.example.Practice;

@FunctionalInterface
public interface FunInterface {
    public abstract void print(String name);
  //  public abstract void print3();
    public default void print5(){
        System.out.println("this is print5");
    }

}
