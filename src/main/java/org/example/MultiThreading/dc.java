package org.example.MultiThreading;

class Counter {
    private int count = 0;

    public void increment() {
        count++; // Not atomic! (read, increment, write)
    }

    public int getCount() {
        return count;
    }
}

// Two threads incrementing = unpredictable results