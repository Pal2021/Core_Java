package org.example.MultiThreading.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class TicketBooking  {
    private int availableTickets=10;

    private final ReentrantLock reentrantLock=new ReentrantLock();
    public void bookTicket(int numberOfTickets,String customerName){
        System.out.println(Thread.currentThread().getName() +
                " is trying to book " + numberOfTickets +
                " ticket(s) for " + customerName);
        System.out.println("noOfTicket is "+numberOfTickets+" and name is "+customerName);
        reentrantLock.lock();
        try{
            if(availableTickets>=numberOfTickets){
                availableTickets -= numberOfTickets;
            System.out.println(Thread.currentThread().getName() +
                    " SUCCESS → Booked " + numberOfTickets +
                    " ticket(s) for " + customerName +
                    " | Remaining = " + availableTickets);
            }else{
                System.out.println(Thread.currentThread().getName() +
                        " FAILED → Only " + availableTickets +
                        " tickets left. Cannot book " + numberOfTickets +
                        " for " + customerName);
            }

        }finally {
           // MOST IMPORTANT: always unlock in finally
            reentrantLock.unlock();
        }
    }
}
