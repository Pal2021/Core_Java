package org.example.MultiThreading.MonitorLockExample;

public class Main {
    public static void main(String[] args) {
        MonitorLockExample monitorLockExample=new MonitorLockExample();
        Thread thread1=new Thread(()->monitorLockExample.task1());
        Thread thread2=new Thread(()->monitorLockExample.task2());
        Thread thread3=new Thread(()->monitorLockExample.task3());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
