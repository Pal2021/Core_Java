package org.example.MultiThreading.reentrantlock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SeatHoldService service = new SeatHoldService();

        // Thread 1: Seat hold try karega
        Thread t1 = new Thread(() -> {
            boolean held = service.tryHoldSeat("Rahul", 10);
            if (held) {
                try { Thread.sleep(3000); } catch (Exception ignored) {}
                service.releaseSeat();
            }
        }, "Rahul-Thread");

        // Thread 2: Same seat hold try karega (timeout dekhne ke liye)
        Thread t2 = new Thread(() -> {
            service.tryHoldSeat("Priya", 11000);
        }, "Priya-Thread");

        t1.start();
        Thread.sleep(1000);  // Thoda delay taaki Rahul pehle hold kar le
        t2.start();

        t1.join();
        t2.join();
    }
}
