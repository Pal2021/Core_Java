package org.example.MultiThreading.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class SeatHoldService {  // Jaise BookMyShow seat temporary hold

    private final ReentrantLock lock = new ReentrantLock();
    private boolean seatHeld = false;
    private String heldByUser = null;

    // User seat hold karna chahta hai – max 30 sec wait
    public boolean tryHoldSeat(String userId, int timeoutSeconds) {
        boolean acquired = false;
        try {
            // tryLock with timeout – agar 30 sec mein na mila to false
            if (lock.tryLock(timeoutSeconds, TimeUnit.SECONDS)) {
                acquired = true;
                if (!seatHeld) {
                    seatHeld = true;
                    heldByUser = userId;
                    System.out.println(userId + " held the seat for 30 sec!");
                    return true;
                } else {
                    System.out.println("Seat already held by " + heldByUser);
                    return false;
                }
            } else {
                System.out.println(userId + " timeout – could not hold seat");
                return false;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        } finally {
            if (acquired) {
                lock.unlock();  // Hamesha finally mein
            }
        }
    }

    public void releaseSeat() {
        lock.lock();
        try {
            if (seatHeld) {
                seatHeld = false;
                heldByUser = null;
                System.out.println("Seat released!");
            }
        } finally {
            lock.unlock();
        }
    }
}