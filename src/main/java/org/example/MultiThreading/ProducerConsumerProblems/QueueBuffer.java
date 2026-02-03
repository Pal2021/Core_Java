package org.example.MultiThreading.ProducerConsumerProblems;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueBuffer {

    public final Queue<Integer> queueBuffer;
    public int size;

    public QueueBuffer(int size){
        this.size=size;
        queueBuffer=new ArrayBlockingQueue<>(size);
    }

    public synchronized void producer(int num) throws InterruptedException {
        if(queueBuffer.size()==size){
            wait();
        }
        queueBuffer.add(num);
        System.out.println("Produced: " + num);
        notifyAll();
    }

    public synchronized  void consume() throws InterruptedException {

        while(queueBuffer.isEmpty()){
            wait();
        }
        int element = queueBuffer.poll();
        System.out.println("Consumed: " + element);
        notifyAll();
    }
}
