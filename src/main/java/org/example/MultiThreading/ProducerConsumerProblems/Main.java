package org.example.MultiThreading.ProducerConsumerProblems;

public class Main {
    public static void main(String[] args) {
        QueueBuffer queueBuffer=new QueueBuffer(5);
        Thread consumer=new Thread(()->{
            for(int i=1;i<10;i++){
                try {
                    queueBuffer.producer(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread produce=new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                try {
                    queueBuffer.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        produce.start();
        consumer.start();
    }
}
