package org.example.MultiThreading.SharedResourceThread;

public class ProduceTask implements Runnable{

    SharedResource sharedResource;
    ProduceTask(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }
    @Override
    public void run() {
        System.out.println("Producer thread"+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sharedResource.addItem();
    }
}
