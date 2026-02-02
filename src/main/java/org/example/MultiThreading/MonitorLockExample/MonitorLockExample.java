package org.example.MultiThreading.MonitorLockExample;

public class MonitorLockExample {
    public synchronized void task1(){
        try {
            System.out.println("this is in task1");
            Thread.sleep(10000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void task2(){
        System.out.println("task2 but before synchronized");
        synchronized (this){
            System.out.println("task2 inside synchronized");
        }
    }

    public void task3(){
        System.out.println("this is task3");
    }
}
