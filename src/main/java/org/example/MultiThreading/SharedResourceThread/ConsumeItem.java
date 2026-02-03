package org.example.MultiThreading.SharedResourceThread;

public class ConsumeItem implements Runnable{
    SharedResource sharedResource;
    ConsumeItem(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Producer thread"+Thread.currentThread().getName());
        sharedResource.addItem();
    }
}
