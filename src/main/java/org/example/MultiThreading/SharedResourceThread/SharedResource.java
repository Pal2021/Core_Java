package org.example.MultiThreading.SharedResourceThread;

public class SharedResource {
    boolean itemAvailable=false;

    public synchronized void addItem(){
        itemAvailable=true;
        System.out.println("item invoiced by "+Thread.currentThread().getName()+" and invoking all thread which are waiting ");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Consumed item method invoked by:  "+Thread.currentThread().getName());
        while(!itemAvailable){
            try {
                System.out.println("Thread "+Thread.currentThread().getName()+"is waiting now");
                wait();
            }catch (Exception e){

            }
        }
        System.out.println("Item consumed by "+Thread.currentThread().getName());
    }
}
