package com.programs.practice.multithreading;

public class RestaurantRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableExample("Soup"));
        Thread t2 = new Thread(new RunnableExample("Pizza"));
        Thread t3 = new Thread(new RunnableExample("Burger"));

        t1.start();
        t2.start();
        t3.start();
    }
}
