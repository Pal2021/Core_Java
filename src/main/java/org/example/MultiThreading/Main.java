package org.example.MultiThreading;

public class Main {
    public static void main(String[] args) {

//        MyThread thread1 = new MyThread();
//        MyThread thread2 = new MyThread();
//
//        thread1.setName("Worker-1");
//        thread2.setName("Worker-2");
//
//        thread1.start();  // Starts the thread
//        thread2.start();
        MyRunnable myRunnable=new MyRunnable();
        Thread thread1=new Thread(myRunnable,"worker-1");
        Thread thread2=new Thread(myRunnable,"worker-2");
        thread1.start();
        thread2.start();

        
    }
}
