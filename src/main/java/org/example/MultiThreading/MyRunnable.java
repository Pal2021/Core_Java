package org.example.MultiThreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
        for (int i = 1; i <= 500; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
